package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final String TAG = "AndroidVideoDecoder";
    private VideoDecoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecType codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;
    private final EglBase.Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private final Object dimensionLock = new Object();
    private final Object renderedTextureMetadataLock = new Object();

    /* loaded from: classes4.dex */
    public static class DecodedTextureMetadata {
        public final Integer decodeTimeMs;
        public final long presentationTimestampUs;

        public DecodedTextureMetadata(long j10, Integer num) {
            this.presentationTimestampUs = j10;
            this.decodeTimeMs = num;
        }
    }

    /* loaded from: classes4.dex */
    public static class FrameInfo {
        public final long decodeStartTimeMs;
        public final int rotation;

        public FrameInfo(long j10, int i10) {
            this.decodeStartTimeMs = j10;
            this.rotation = i10;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecType videoCodecType, int i10, EglBase.Context context) {
        if (isSupportedColorFormat(i10)) {
            Logging.d(TAG, "ctor name: " + str + " type: " + videoCodecType + " color format: " + i10 + " context: " + context);
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
            this.codecName = str;
            this.codecType = videoCodecType;
            this.colorFormat = i10;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            return;
        }
        throw new IllegalArgumentException("Unsupported color format: " + i10);
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        if (i10 % 2 == 0) {
            int i14 = (i12 + 1) / 2;
            int i15 = i11 % 2;
            int i16 = i15 == 0 ? (i13 + 1) / 2 : i13 / 2;
            int i17 = i10 / 2;
            int i18 = (i10 * i11) + 0;
            int i19 = i17 * i16;
            int i20 = i18 + ((i17 * i11) / 2);
            int i21 = i20 + i19;
            VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i12, i13);
            byteBuffer.limit((i10 * i13) + 0);
            byteBuffer.position(0);
            copyPlane(byteBuffer.slice(), i10, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i12, i13);
            byteBuffer.limit(i18 + i19);
            byteBuffer.position(i18);
            copyPlane(byteBuffer.slice(), i17, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i14, i16);
            if (i15 == 1) {
                byteBuffer.position(i18 + ((i16 - 1) * i17));
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                dataU.position(allocateI420Buffer.getStrideU() * i16);
                dataU.put(byteBuffer);
            }
            byteBuffer.limit(i21);
            byteBuffer.position(i20);
            copyPlane(byteBuffer.slice(), i17, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i14, i16);
            if (i15 == 1) {
                byteBuffer.position(i20 + (i17 * (i16 - 1)));
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                dataV.position(allocateI420Buffer.getStrideV() * i16);
                dataV.put(byteBuffer);
            }
            return allocateI420Buffer;
        }
        throw new AssertionError("Stride is not divisible by two: " + i10);
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        return new NV12Buffer(i12, i13, i10, i11, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: org.webrtc.AndroidVideoDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private void deliverByteFrame(int i10, MediaCodec.BufferInfo bufferInfo, int i11, Integer num) {
        int i12;
        int i13;
        int i14;
        int i15;
        VideoFrame.Buffer copyNV12ToI420Buffer;
        synchronized (this.dimensionLock) {
            i12 = this.width;
            i13 = this.height;
            i14 = this.stride;
            i15 = this.sliceHeight;
        }
        int i16 = bufferInfo.size;
        if (i16 < ((i12 * i13) * 3) / 2) {
            Logging.e(TAG, "Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        int i17 = (i16 >= ((i14 * i13) * 3) / 2 || i15 != i13 || i14 <= i12) ? i14 : (i16 * 2) / (i13 * 3);
        ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i10];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = byteBuffer.slice();
        if (this.colorFormat == 19) {
            copyNV12ToI420Buffer = copyI420Buffer(slice, i17, i15, i12, i13);
        } else {
            copyNV12ToI420Buffer = copyNV12ToI420Buffer(slice, i17, i15, i12, i13);
        }
        this.codec.releaseOutputBuffer(i10, false);
        VideoFrame videoFrame = new VideoFrame(copyNV12ToI420Buffer, i11, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    private void deliverTextureFrame(int i10, MediaCodec.BufferInfo bufferInfo, int i11, Integer num) {
        int i12;
        int i13;
        synchronized (this.dimensionLock) {
            i12 = this.width;
            i13 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                this.codec.releaseOutputBuffer(i10, false);
                return;
            }
            this.surfaceTextureHelper.setTextureSize(i12, i13);
            this.surfaceTextureHelper.setFrameRotation(i11);
            this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
            this.codec.releaseOutputBuffer(i10, true);
        }
    }

    private VideoCodecStatus initDecodeInternal(int i10, int i11) {
        this.decoderThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "initDecodeInternal name: " + this.codecName + " type: " + this.codecType + " width: " + i10 + " height: " + i11);
        if (this.outputThread != null) {
            Logging.e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i10;
        this.height = i11;
        this.stride = i10;
        this.sliceHeight = i11;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i10, i11);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                Logging.d(TAG, "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalStateException e10) {
                Logging.e(TAG, "initDecode failed", e10);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException unused) {
            Logging.e(TAG, "Cannot create media decoder " + this.codecName);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i10) {
        for (int i11 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Decoder format changed: " + mediaFormat.toString());
        if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_TOP)) {
            integer = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_RIGHT) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_LEFT);
            integer2 = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_BOTTOM) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_TOP);
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            if (this.hasDecodedFirstFrame && (this.width != integer || this.height != integer2)) {
                stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + this.width + TopicConstant.MATCH_SINGLE + this.height + ". New " + integer + TopicConstant.MATCH_SINGLE + integer2));
                return;
            }
            this.width = integer;
            this.height = integer2;
            if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
                this.colorFormat = mediaFormat.getInteger("color-format");
                Logging.d(TAG, "Color: 0x" + Integer.toHexString(this.colorFormat));
                if (!isSupportedColorFormat(this.colorFormat)) {
                    stopOnOutputThread(new IllegalStateException("Unsupported color format: " + this.colorFormat));
                    return;
                }
            }
            synchronized (this.dimensionLock) {
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_STRIDE)) {
                    this.stride = mediaFormat.getInteger(MEDIA_FORMAT_KEY_STRIDE);
                }
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT)) {
                    this.sliceHeight = mediaFormat.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
                }
                Logging.d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                this.stride = Math.max(this.width, this.stride);
                this.sliceHeight = Math.max(this.height, this.sliceHeight);
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i10, int i11) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        return releaseInternal != VideoCodecStatus.OK ? releaseInternal : initDecodeInternal(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.d(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e10) {
            Logging.e(TAG, "Media decoder stop failed", e10);
        }
        try {
            this.codec.release();
        } catch (Exception e11) {
            Logging.e(TAG, "Media decoder release failed", e11);
            this.shutdownException = e11;
        }
        Logging.d(TAG, "Release on output thread done");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [org.webrtc.MediaCodecWrapper, java.lang.Thread] */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS)) {
                Logging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            } else {
                this.codec = null;
                this.outputThread = null;
                return VideoCodecStatus.OK;
            }
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i10, int i11) {
        return JavaI420Buffer.allocate(i10, i11);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13) {
        YuvHelper.copyPlane(byteBuffer, i10, byteBuffer2, i11, i12, i13);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        int i10;
        int i11;
        VideoCodecStatus reinitDecode;
        this.decoderThreadChecker.checkIsOnValidThread();
        if (this.codec != null && this.callback != null) {
            ByteBuffer byteBuffer = encodedImage.buffer;
            if (byteBuffer == null) {
                Logging.e(TAG, "decode() - no input data");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            int remaining = byteBuffer.remaining();
            if (remaining == 0) {
                Logging.e(TAG, "decode() - input buffer empty");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            synchronized (this.dimensionLock) {
                i10 = this.width;
                i11 = this.height;
            }
            int i12 = encodedImage.encodedWidth;
            int i13 = encodedImage.encodedHeight;
            if (i12 * i13 <= 0 || ((i12 == i10 && i13 == i11) || (reinitDecode = reinitDecode(i12, i13)) == VideoCodecStatus.OK)) {
                if (this.keyFrameRequired) {
                    if (encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
                        Logging.e(TAG, "decode() - key frame required first");
                        return VideoCodecStatus.NO_OUTPUT;
                    } else if (!encodedImage.completeFrame) {
                        Logging.e(TAG, "decode() - complete frame required first");
                        return VideoCodecStatus.NO_OUTPUT;
                    }
                }
                try {
                    int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
                    if (dequeueInputBuffer < 0) {
                        Logging.e(TAG, "decode() - no HW buffers available; decoder falling behind");
                        return VideoCodecStatus.ERROR;
                    }
                    try {
                        ByteBuffer byteBuffer2 = this.codec.getInputBuffers()[dequeueInputBuffer];
                        if (byteBuffer2.capacity() < remaining) {
                            Logging.e(TAG, "decode() - HW buffer too small");
                            return VideoCodecStatus.ERROR;
                        }
                        byteBuffer2.put(encodedImage.buffer);
                        this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                        try {
                            this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                            if (this.keyFrameRequired) {
                                this.keyFrameRequired = false;
                            }
                            return VideoCodecStatus.OK;
                        } catch (IllegalStateException e10) {
                            Logging.e(TAG, "queueInputBuffer failed", e10);
                            this.frameInfos.pollLast();
                            return VideoCodecStatus.ERROR;
                        }
                    } catch (IllegalStateException e11) {
                        Logging.e(TAG, "getInputBuffers failed", e11);
                        return VideoCodecStatus.ERROR;
                    }
                } catch (IllegalStateException e12) {
                    Logging.e(TAG, "dequeueInputBuffer failed", e12);
                    return VideoCodecStatus.ERROR;
                }
            }
            return reinitDecode;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("decode uninitalized, codec: ");
        sb2.append(this.codec != null);
        sb2.append(", callback: ");
        sb2.append(this.callback);
        Logging.d(TAG, sb2.toString());
        return VideoCodecStatus.UNINITIALIZED;
    }

    public void deliverDecodedFrame() {
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, IndexSeeker.MIN_TIME_BETWEEN_POINTS_US);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                Logging.v(TAG, "dequeueOutputBuffer returned " + dequeueOutputBuffer);
            } else {
                FrameInfo poll = this.frameInfos.poll();
                Integer num = null;
                int i10 = 0;
                if (poll != null) {
                    num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - poll.decodeStartTimeMs));
                    i10 = poll.rotation;
                }
                this.hasDecodedFirstFrame = true;
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i10, num);
                } else {
                    deliverByteFrame(dequeueOutputBuffer, bufferInfo, i10, num);
                }
            }
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "deliverDecodedFrame failed", e10);
        }
    }

    @Override // org.webrtc.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // org.webrtc.VideoDecoder
    public boolean getPrefersLateDecoding() {
        return true;
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.decoderThreadChecker = new ThreadUtils.ThreadChecker();
        this.callback = callback;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j10;
        int intValue;
        synchronized (this.renderedTextureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata != null) {
                j10 = decodedTextureMetadata.presentationTimestampUs * 1000;
                intValue = decodedTextureMetadata.decodeTimeMs.intValue();
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j10), Integer.valueOf(intValue), null);
    }

    @Override // org.webrtc.VideoDecoder
    public VideoCodecStatus release() {
        Logging.d(TAG, "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }
}
