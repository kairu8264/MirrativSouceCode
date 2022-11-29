package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

@Deprecated
/* loaded from: classes4.dex */
public class MediaCodecVideoDecoder {
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    private static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    private static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    private static final String FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String FORMAT_KEY_STRIDE = "stride";
    private static final String H264_MIME_TYPE = "video/avc";
    private static final long MAX_DECODE_TIME_MS = 200;
    private static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String TAG = "MediaCodecVideoDecoder";
    private static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    private static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    private static int codecErrors = 0;
    private static EglBase eglBase = null;
    private static MediaCodecVideoDecoderErrorCallback errorCallback = null;
    private static MediaCodecVideoDecoder runningInstance = null;
    private static final String supportedExynosH264HighProfileHwCodecPrefix = "OMX.Exynos.";
    private static final String supportedMediaTekH264HighProfileHwCodecPrefix = "OMX.MTK.";
    private static final String supportedQcomH264HighProfileHwCodecPrefix = "OMX.qcom.";
    private int colorFormat;
    private final Queue<TimeStamps> decodeStartTimeMs = new ArrayDeque();
    private final Queue<DecodedOutputBuffer> dequeuedSurfaceOutputBuffers = new ArrayDeque();
    private int droppedFrames;
    private boolean hasDecodedFirstFrame;
    private int height;
    private ByteBuffer[] inputBuffers;
    private MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private TextureListener textureListener;
    private int width;
    private static Set<String> hwDecoderDisabledTypes = new HashSet();
    private static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos."};
    private static final List<Integer> supportedColorList = Arrays.asList(19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876);

    /* loaded from: classes4.dex */
    public static class DecodedOutputBuffer {
        private final long decodeTimeMs;
        private final long endDecodeTimeMs;
        private final int index;
        private final long ntpTimeStampMs;
        private final int offset;
        private final long presentationTimeStampMs;
        private final int size;
        private final long timeStampMs;

        public DecodedOutputBuffer(int i10, int i11, int i12, long j10, long j11, long j12, long j13, long j14) {
            this.index = i10;
            this.offset = i11;
            this.size = i12;
            this.presentationTimeStampMs = j10;
            this.timeStampMs = j11;
            this.ntpTimeStampMs = j12;
            this.decodeTimeMs = j13;
            this.endDecodeTimeMs = j14;
        }

        @CalledByNative("DecodedOutputBuffer")
        public long getDecodeTimeMs() {
            return this.decodeTimeMs;
        }

        @CalledByNative("DecodedOutputBuffer")
        public int getIndex() {
            return this.index;
        }

        @CalledByNative("DecodedOutputBuffer")
        public long getNtpTimestampMs() {
            return this.ntpTimeStampMs;
        }

        @CalledByNative("DecodedOutputBuffer")
        public int getOffset() {
            return this.offset;
        }

        @CalledByNative("DecodedOutputBuffer")
        public long getPresentationTimestampMs() {
            return this.presentationTimeStampMs;
        }

        @CalledByNative("DecodedOutputBuffer")
        public int getSize() {
            return this.size;
        }

        @CalledByNative("DecodedOutputBuffer")
        public long getTimestampMs() {
            return this.timeStampMs;
        }
    }

    /* loaded from: classes4.dex */
    public static class DecodedTextureBuffer {
        private final long decodeTimeMs;
        private final long frameDelayMs;
        private final long ntpTimeStampMs;
        private final long presentationTimeStampMs;
        private final long timeStampMs;
        private final VideoFrame.Buffer videoFrameBuffer;

        public DecodedTextureBuffer(VideoFrame.Buffer buffer, long j10, long j11, long j12, long j13, long j14) {
            this.videoFrameBuffer = buffer;
            this.presentationTimeStampMs = j10;
            this.timeStampMs = j11;
            this.ntpTimeStampMs = j12;
            this.decodeTimeMs = j13;
            this.frameDelayMs = j14;
        }

        @CalledByNative("DecodedTextureBuffer")
        public long getDecodeTimeMs() {
            return this.decodeTimeMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        public long getFrameDelayMs() {
            return this.frameDelayMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        public long getNtpTimestampMs() {
            return this.ntpTimeStampMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        public long getPresentationTimestampMs() {
            return this.presentationTimeStampMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        public long getTimeStampMs() {
            return this.timeStampMs;
        }

        @CalledByNative("DecodedTextureBuffer")
        public VideoFrame.Buffer getVideoFrameBuffer() {
            return this.videoFrameBuffer;
        }
    }

    /* loaded from: classes4.dex */
    public static class DecoderProperties {
        public final String codecName;
        public final int colorFormat;

        public DecoderProperties(String str, int i10) {
            this.codecName = str;
            this.colorFormat = i10;
        }
    }

    /* loaded from: classes4.dex */
    public static class HwDecoderFactory implements VideoDecoderFactory {
        private final VideoCodecInfo[] supportedHardwareCodecs = getSupportedHardwareCodecs();

        private static VideoCodecInfo[] getSupportedHardwareCodecs() {
            ArrayList arrayList = new ArrayList();
            if (MediaCodecVideoDecoder.isVp8HwSupported()) {
                Logging.d(MediaCodecVideoDecoder.TAG, "VP8 HW Decoder supported.");
                arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isVp9HwSupported()) {
                Logging.d(MediaCodecVideoDecoder.TAG, "VP9 HW Decoder supported.");
                arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isH264HighProfileHwSupported()) {
                Logging.d(MediaCodecVideoDecoder.TAG, "H.264 High Profile HW Decoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_HIGH_PROFILE_CODEC);
            }
            if (MediaCodecVideoDecoder.isH264HwSupported()) {
                Logging.d(MediaCodecVideoDecoder.TAG, "H.264 HW Decoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_BASELINE_PROFILE_CODEC);
            }
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
        }

        private static boolean isCodecSupported(VideoCodecInfo[] videoCodecInfoArr, VideoCodecInfo videoCodecInfo) {
            for (VideoCodecInfo videoCodecInfo2 : videoCodecInfoArr) {
                if (isSameCodec(videoCodecInfo2, videoCodecInfo)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isSameCodec(VideoCodecInfo videoCodecInfo, VideoCodecInfo videoCodecInfo2) {
            if (videoCodecInfo.name.equalsIgnoreCase(videoCodecInfo2.name)) {
                if (videoCodecInfo.name.equalsIgnoreCase("H264")) {
                    return H264Utils.isSameH264Profile(videoCodecInfo.params, videoCodecInfo2.params);
                }
                return true;
            }
            return false;
        }

        @Override // org.webrtc.VideoDecoderFactory
        public VideoDecoder createDecoder(final VideoCodecInfo videoCodecInfo) {
            if (!isCodecSupported(this.supportedHardwareCodecs, videoCodecInfo)) {
                Logging.d(MediaCodecVideoDecoder.TAG, "No HW video decoder for codec " + videoCodecInfo.name);
                return null;
            }
            Logging.d(MediaCodecVideoDecoder.TAG, "Create HW video decoder for " + videoCodecInfo.name);
            return new WrappedNativeVideoDecoder() { // from class: org.webrtc.MediaCodecVideoDecoder.HwDecoderFactory.1
                @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
                public long createNativeVideoDecoder() {
                    return MediaCodecVideoDecoder.nativeCreateDecoder(videoCodecInfo.name, MediaCodecVideoDecoder.useSurface());
                }
            };
        }

        @Override // org.webrtc.VideoDecoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            return this.supportedHardwareCodecs;
        }
    }

    /* loaded from: classes4.dex */
    public interface MediaCodecVideoDecoderErrorCallback {
        void onMediaCodecVideoDecoderCriticalError(int i10);
    }

    /* loaded from: classes4.dex */
    public class TextureListener implements VideoSink {
        private DecodedOutputBuffer bufferToRender;
        private final Object newFrameLock = new Object();
        private DecodedTextureBuffer renderedBuffer;
        private final SurfaceTextureHelper surfaceTextureHelper;

        public TextureListener(SurfaceTextureHelper surfaceTextureHelper) {
            this.surfaceTextureHelper = surfaceTextureHelper;
            surfaceTextureHelper.startListening(this);
        }

        public void addBufferToRender(DecodedOutputBuffer decodedOutputBuffer) {
            if (this.bufferToRender == null) {
                this.bufferToRender = decodedOutputBuffer;
            } else {
                Logging.e(MediaCodecVideoDecoder.TAG, "Unexpected addBufferToRender() called while waiting for a texture.");
                throw new IllegalStateException("Waiting for a texture.");
            }
        }

        public DecodedTextureBuffer dequeueTextureBuffer(int i10) {
            DecodedTextureBuffer decodedTextureBuffer;
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer == null && i10 > 0 && isWaitingForTexture()) {
                    try {
                        this.newFrameLock.wait(i10);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                decodedTextureBuffer = this.renderedBuffer;
                this.renderedBuffer = null;
            }
            return decodedTextureBuffer;
        }

        public boolean isWaitingForTexture() {
            boolean z10;
            synchronized (this.newFrameLock) {
                z10 = this.bufferToRender != null;
            }
            return z10;
        }

        @Override // org.webrtc.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer == null) {
                    VideoFrame.Buffer buffer = videoFrame.getBuffer();
                    buffer.retain();
                    this.renderedBuffer = new DecodedTextureBuffer(buffer, this.bufferToRender.presentationTimeStampMs, this.bufferToRender.timeStampMs, this.bufferToRender.ntpTimeStampMs, this.bufferToRender.decodeTimeMs, SystemClock.elapsedRealtime() - this.bufferToRender.endDecodeTimeMs);
                    this.bufferToRender = null;
                    this.newFrameLock.notifyAll();
                } else {
                    Logging.e(MediaCodecVideoDecoder.TAG, "Unexpected onFrame() called while already holding a texture.");
                    throw new IllegalStateException("Already holding a texture.");
                }
            }
        }

        public void release() {
            this.surfaceTextureHelper.stopListening();
            synchronized (this.newFrameLock) {
                DecodedTextureBuffer decodedTextureBuffer = this.renderedBuffer;
                if (decodedTextureBuffer != null) {
                    decodedTextureBuffer.getVideoFrameBuffer().release();
                    this.renderedBuffer = null;
                }
            }
            this.surfaceTextureHelper.dispose();
        }

        public void setSize(int i10, int i11) {
            this.surfaceTextureHelper.setTextureSize(i10, i11);
        }
    }

    /* loaded from: classes4.dex */
    public static class TimeStamps {
        private final long decodeStartTimeMs;
        private final long ntpTimeStampMs;
        private final long timeStampMs;

        public TimeStamps(long j10, long j11, long j12) {
            this.decodeStartTimeMs = j10;
            this.timeStampMs = j11;
            this.ntpTimeStampMs = j12;
        }
    }

    /* loaded from: classes4.dex */
    public enum VideoCodecType {
        VIDEO_CODEC_UNKNOWN,
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264;

        @CalledByNative("VideoCodecType")
        public static VideoCodecType fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    private void MaybeRenderDecodedTextureBuffer() {
        if (this.dequeuedSurfaceOutputBuffers.isEmpty() || this.textureListener.isWaitingForTexture()) {
            return;
        }
        DecodedOutputBuffer remove = this.dequeuedSurfaceOutputBuffers.remove();
        this.textureListener.addBufferToRender(remove);
        this.mediaCodec.releaseOutputBuffer(remove.index, true);
    }

    private void checkOnMediaCodecThread() throws IllegalStateException {
        if (this.mediaCodecThread.getId() == Thread.currentThread().getId()) {
            return;
        }
        throw new IllegalStateException("MediaCodecVideoDecoder previously operated on " + this.mediaCodecThread + " but is now called on " + Thread.currentThread());
    }

    public static VideoDecoderFactory createFactory() {
        return new DefaultVideoDecoderFactory(new HwDecoderFactory());
    }

    @CalledByNativeUnchecked
    private int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(500000L);
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "dequeueIntputBuffer failed", e10);
            return -2;
        }
    }

    @CalledByNativeUnchecked
    private DecodedOutputBuffer dequeueOutputBuffer(int i10) {
        long j10;
        int integer;
        int integer2;
        checkOnMediaCodecThread();
        if (this.decodeStartTimeMs.isEmpty()) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(i10));
            if (dequeueOutputBuffer == -3) {
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                Logging.d(TAG, "Decoder output buffers changed: " + this.outputBuffers.length);
                if (this.hasDecodedFirstFrame) {
                    throw new RuntimeException("Unexpected output buffer change event.");
                }
            } else if (dequeueOutputBuffer != -2) {
                if (dequeueOutputBuffer != -1) {
                    this.hasDecodedFirstFrame = true;
                    TimeStamps remove = this.decodeStartTimeMs.remove();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - remove.decodeStartTimeMs;
                    if (elapsedRealtime > MAX_DECODE_TIME_MS) {
                        Logging.e(TAG, "Very high decode time: " + elapsedRealtime + "ms. Q size: " + this.decodeStartTimeMs.size() + ". Might be caused by resuming H264 decoding after a pause.");
                        j10 = 200L;
                    } else {
                        j10 = elapsedRealtime;
                    }
                    return new DecodedOutputBuffer(dequeueOutputBuffer, bufferInfo.offset, bufferInfo.size, TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs), remove.timeStampMs, remove.ntpTimeStampMs, j10, SystemClock.elapsedRealtime());
                }
                return null;
            } else {
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                Logging.d(TAG, "Decoder format changed: " + outputFormat.toString());
                if (outputFormat.containsKey(FORMAT_KEY_CROP_LEFT) && outputFormat.containsKey(FORMAT_KEY_CROP_RIGHT) && outputFormat.containsKey(FORMAT_KEY_CROP_BOTTOM) && outputFormat.containsKey(FORMAT_KEY_CROP_TOP)) {
                    integer = (outputFormat.getInteger(FORMAT_KEY_CROP_RIGHT) + 1) - outputFormat.getInteger(FORMAT_KEY_CROP_LEFT);
                    integer2 = (outputFormat.getInteger(FORMAT_KEY_CROP_BOTTOM) + 1) - outputFormat.getInteger(FORMAT_KEY_CROP_TOP);
                } else {
                    integer = outputFormat.getInteger("width");
                    integer2 = outputFormat.getInteger("height");
                }
                if (!this.hasDecodedFirstFrame || (integer == this.width && integer2 == this.height)) {
                    this.width = integer;
                    this.height = integer2;
                    TextureListener textureListener = this.textureListener;
                    if (textureListener != null) {
                        textureListener.setSize(integer, integer2);
                    }
                    if (!useSurface() && outputFormat.containsKey("color-format")) {
                        this.colorFormat = outputFormat.getInteger("color-format");
                        Logging.d(TAG, "Color: 0x" + Integer.toHexString(this.colorFormat));
                        if (!supportedColorList.contains(Integer.valueOf(this.colorFormat))) {
                            throw new IllegalStateException("Non supported color format: " + this.colorFormat);
                        }
                    }
                    if (outputFormat.containsKey(FORMAT_KEY_STRIDE)) {
                        this.stride = outputFormat.getInteger(FORMAT_KEY_STRIDE);
                    }
                    if (outputFormat.containsKey(FORMAT_KEY_SLICE_HEIGHT)) {
                        this.sliceHeight = outputFormat.getInteger(FORMAT_KEY_SLICE_HEIGHT);
                    }
                    Logging.d(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                    this.stride = Math.max(this.width, this.stride);
                    this.sliceHeight = Math.max(this.height, this.sliceHeight);
                }
            }
        }
        throw new RuntimeException("Unexpected size change. Configured " + this.width + TopicConstant.MATCH_SINGLE + this.height + ". New " + integer + TopicConstant.MATCH_SINGLE + integer2);
    }

    @CalledByNativeUnchecked
    private DecodedTextureBuffer dequeueTextureBuffer(int i10) {
        checkOnMediaCodecThread();
        if (useSurface()) {
            DecodedOutputBuffer dequeueOutputBuffer = dequeueOutputBuffer(i10);
            if (dequeueOutputBuffer != null) {
                this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
            }
            MaybeRenderDecodedTextureBuffer();
            DecodedTextureBuffer dequeueTextureBuffer = this.textureListener.dequeueTextureBuffer(i10);
            if (dequeueTextureBuffer != null) {
                MaybeRenderDecodedTextureBuffer();
                return dequeueTextureBuffer;
            } else if (this.dequeuedSurfaceOutputBuffers.size() >= Math.min(3, this.outputBuffers.length) || (i10 > 0 && !this.dequeuedSurfaceOutputBuffers.isEmpty())) {
                this.droppedFrames++;
                DecodedOutputBuffer remove = this.dequeuedSurfaceOutputBuffers.remove();
                if (i10 > 0) {
                    Logging.w(TAG, "Draining decoder. Dropping frame with TS: " + remove.presentationTimeStampMs + ". Total number of dropped frames: " + this.droppedFrames);
                } else {
                    Logging.w(TAG, "Too many output buffers " + this.dequeuedSurfaceOutputBuffers.size() + ". Dropping frame with TS: " + remove.presentationTimeStampMs + ". Total number of dropped frames: " + this.droppedFrames);
                }
                this.mediaCodec.releaseOutputBuffer(remove.index, false);
                return new DecodedTextureBuffer(null, remove.presentationTimeStampMs, remove.timeStampMs, remove.ntpTimeStampMs, remove.decodeTimeMs, SystemClock.elapsedRealtime() - remove.endDecodeTimeMs);
            } else {
                return null;
            }
        }
        throw new IllegalStateException("dequeueTexture() called for byte buffer decoding.");
    }

    public static void disableH264HwCodec() {
        Logging.w(TAG, "H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/avc");
    }

    public static void disableVp8HwCodec() {
        Logging.w(TAG, "VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Logging.w(TAG, "VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public static void disposeEglContext() {
        EglBase eglBase2 = eglBase;
        if (eglBase2 != null) {
            eglBase2.release();
            eglBase = null;
        }
    }

    private static DecoderProperties findDecoder(String str, String[] strArr) {
        MediaCodecInfo mediaCodecInfo;
        String str2;
        boolean z10;
        int[] iArr;
        int[] iArr2;
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        Logging.d(TAG, "Trying to find HW decoder for mime " + str);
        for (int i10 = 0; i10 < MediaCodecList.getCodecCount(); i10++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i10);
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "Cannot retrieve decoder codec info", e10);
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        str2 = null;
                        break;
                    } else if (supportedTypes[i11].equals(str)) {
                        str2 = mediaCodecInfo.getName();
                        break;
                    } else {
                        i11++;
                    }
                }
                if (str2 == null) {
                    continue;
                } else {
                    Logging.d(TAG, "Found candidate decoder " + str2);
                    int length2 = strArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length2) {
                            z10 = false;
                            break;
                        } else if (str2.startsWith(strArr[i12])) {
                            z10 = true;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (z10) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            for (int i13 : capabilitiesForType.colorFormats) {
                                Logging.v(TAG, "   Color: 0x" + Integer.toHexString(i13));
                            }
                            for (Integer num : supportedColorList) {
                                int intValue = num.intValue();
                                for (int i14 : capabilitiesForType.colorFormats) {
                                    if (i14 == intValue) {
                                        Logging.d(TAG, "Found target decoder " + str2 + ". Color: 0x" + Integer.toHexString(i14));
                                        return new DecoderProperties(str2, i14);
                                    }
                                }
                            }
                            continue;
                        } catch (IllegalArgumentException e11) {
                            Logging.e(TAG, "Cannot retrieve decoder capabilities", e11);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        Logging.d(TAG, "No HW decoder found for mime " + str);
        return null;
    }

    @CalledByNativeUnchecked
    private boolean initDecode(VideoCodecType videoCodecType, int i10, int i11) {
        String[] supportedH264HwCodecPrefixes;
        String str;
        SurfaceTextureHelper create;
        if (this.mediaCodecThread == null) {
            if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP8) {
                supportedH264HwCodecPrefixes = supportedVp8HwCodecPrefixes();
                str = "video/x-vnd.on2.vp8";
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP9) {
                supportedH264HwCodecPrefixes = supportedVp9HwCodecPrefixes;
                str = "video/x-vnd.on2.vp9";
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_H264) {
                supportedH264HwCodecPrefixes = supportedH264HwCodecPrefixes();
                str = "video/avc";
            } else {
                throw new RuntimeException("initDecode: Non-supported codec " + videoCodecType);
            }
            DecoderProperties findDecoder = findDecoder(str, supportedH264HwCodecPrefixes);
            if (findDecoder != null) {
                Logging.d(TAG, "Java initDecode: " + videoCodecType + " : " + i10 + " x " + i11 + ". Color: 0x" + Integer.toHexString(findDecoder.colorFormat) + ". Use Surface: " + useSurface());
                runningInstance = this;
                this.mediaCodecThread = Thread.currentThread();
                try {
                    this.width = i10;
                    this.height = i11;
                    this.stride = i10;
                    this.sliceHeight = i11;
                    if (useSurface() && (create = SurfaceTextureHelper.create("Decoder SurfaceTextureHelper", eglBase.getEglBaseContext())) != null) {
                        TextureListener textureListener = new TextureListener(create);
                        this.textureListener = textureListener;
                        textureListener.setSize(i10, i11);
                        this.surface = new Surface(create.getSurfaceTexture());
                    }
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i10, i11);
                    if (!useSurface()) {
                        createVideoFormat.setInteger("color-format", findDecoder.colorFormat);
                    }
                    Logging.d(TAG, "  Format: " + createVideoFormat);
                    MediaCodec createByCodecName = MediaCodecVideoEncoder.createByCodecName(findDecoder.codecName);
                    this.mediaCodec = createByCodecName;
                    if (createByCodecName == null) {
                        Logging.e(TAG, "Can not create media decoder");
                        return false;
                    }
                    createByCodecName.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                    this.mediaCodec.start();
                    this.colorFormat = findDecoder.colorFormat;
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    this.inputBuffers = this.mediaCodec.getInputBuffers();
                    this.decodeStartTimeMs.clear();
                    this.hasDecodedFirstFrame = false;
                    this.dequeuedSurfaceOutputBuffers.clear();
                    this.droppedFrames = 0;
                    Logging.d(TAG, "Input buffers: " + this.inputBuffers.length + ". Output buffers: " + this.outputBuffers.length);
                    return true;
                } catch (IllegalStateException e10) {
                    Logging.e(TAG, "initDecode failed", e10);
                    return false;
                }
            }
            throw new RuntimeException("Cannot find HW decoder for " + videoCodecType);
        }
        throw new RuntimeException("initDecode: Forgot to release()?");
    }

    public static boolean isH264HighProfileHwSupported() {
        if (hwDecoderDisabledTypes.contains("video/avc")) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21 || findDecoder("video/avc", new String[]{"OMX.qcom."}) == null) {
            if (i10 < 23 || findDecoder("video/avc", new String[]{"OMX.Exynos."}) == null) {
                return PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekH264").equals(PeerConnectionFactory.TRIAL_ENABLED) && i10 >= 27 && findDecoder("video/avc", new String[]{supportedMediaTekH264HighProfileHwCodecPrefix}) != null;
            }
            return true;
        }
        return true;
    }

    public static boolean isH264HwSupported() {
        return (hwDecoderDisabledTypes.contains("video/avc") || findDecoder("video/avc", supportedH264HwCodecPrefixes()) == null) ? false : true;
    }

    public static boolean isVp8HwSupported() {
        return (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findDecoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes()) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        return (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findDecoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateDecoder(String str, boolean z10);

    public static void printStackTrace() {
        Thread thread;
        MediaCodecVideoDecoder mediaCodecVideoDecoder = runningInstance;
        if (mediaCodecVideoDecoder == null || (thread = mediaCodecVideoDecoder.mediaCodecThread) == null) {
            return;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace.length > 0) {
            Logging.d(TAG, "MediaCodecVideoDecoder stacks trace:");
            for (StackTraceElement stackTraceElement : stackTrace) {
                Logging.d(TAG, stackTraceElement.toString());
            }
        }
    }

    @CalledByNativeUnchecked
    private boolean queueInputBuffer(int i10, int i11, long j10, long j11, long j12) {
        checkOnMediaCodecThread();
        try {
            this.inputBuffers[i10].position(0);
            this.inputBuffers[i10].limit(i11);
            this.decodeStartTimeMs.add(new TimeStamps(SystemClock.elapsedRealtime(), j11, j12));
            this.mediaCodec.queueInputBuffer(i10, 0, i11, j10, 0);
            return true;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "decode failed", e10);
            return false;
        }
    }

    @CalledByNativeUnchecked
    private void release() {
        Logging.d(TAG, "Java releaseDecoder. Total number of dropped frames: " + this.droppedFrames);
        checkOnMediaCodecThread();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: org.webrtc.MediaCodecVideoDecoder.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Logging.d(MediaCodecVideoDecoder.TAG, "Java releaseDecoder on release thread");
                    MediaCodecVideoDecoder.this.mediaCodec.stop();
                    MediaCodecVideoDecoder.this.mediaCodec.release();
                    Logging.d(MediaCodecVideoDecoder.TAG, "Java releaseDecoder on release thread done");
                } catch (Exception e10) {
                    Logging.e(MediaCodecVideoDecoder.TAG, "Media decoder release failed", e10);
                }
                countDownLatch.countDown();
            }
        }).start();
        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS)) {
            Logging.e(TAG, "Media decoder release timeout");
            codecErrors++;
            if (errorCallback != null) {
                Logging.e(TAG, "Invoke codec error callback. Errors: " + codecErrors);
                errorCallback.onMediaCodecVideoDecoderCriticalError(codecErrors);
            }
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        if (useSurface()) {
            this.surface.release();
            this.surface = null;
            this.textureListener.release();
        }
        Logging.d(TAG, "Java releaseDecoder done");
    }

    @CalledByNativeUnchecked
    private void reset(int i10, int i11) {
        if (this.mediaCodecThread != null && this.mediaCodec != null) {
            Logging.d(TAG, "Java reset: " + i10 + " x " + i11);
            this.mediaCodec.flush();
            this.width = i10;
            this.height = i11;
            TextureListener textureListener = this.textureListener;
            if (textureListener != null) {
                textureListener.setSize(i10, i11);
            }
            this.decodeStartTimeMs.clear();
            this.dequeuedSurfaceOutputBuffers.clear();
            this.hasDecodedFirstFrame = false;
            this.droppedFrames = 0;
            return;
        }
        throw new RuntimeException("Incorrect reset call for non-initialized decoder.");
    }

    @CalledByNativeUnchecked
    private void returnDecodedOutputBuffer(int i10) throws IllegalStateException, MediaCodec.CodecException {
        checkOnMediaCodecThread();
        if (!useSurface()) {
            this.mediaCodec.releaseOutputBuffer(i10, false);
            return;
        }
        throw new IllegalStateException("returnDecodedOutputBuffer() called for surface decoding.");
    }

    public static void setEglContext(EglBase.Context context) {
        if (eglBase != null) {
            Logging.w(TAG, "Egl context already set.");
            eglBase.release();
        }
        eglBase = EglBase.create(context);
    }

    public static void setErrorCallback(MediaCodecVideoDecoderErrorCallback mediaCodecVideoDecoderErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoDecoderErrorCallback;
    }

    private static final String[] supportedH264HwCodecPrefixes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("OMX.qcom.");
        arrayList.add(MediaCodecUtils.INTEL_PREFIX);
        arrayList.add("OMX.Exynos.");
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekH264").equals(PeerConnectionFactory.TRIAL_ENABLED) && Build.VERSION.SDK_INT >= 27) {
            arrayList.add(supportedMediaTekH264HighProfileHwCodecPrefix);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static final String[] supportedVp8HwCodecPrefixes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("OMX.qcom.");
        arrayList.add(MediaCodecUtils.NVIDIA_PREFIX);
        arrayList.add("OMX.Exynos.");
        arrayList.add(MediaCodecUtils.INTEL_PREFIX);
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekVP8").equals(PeerConnectionFactory.TRIAL_ENABLED) && Build.VERSION.SDK_INT >= 24) {
            arrayList.add(supportedMediaTekH264HighProfileHwCodecPrefix);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean useSurface() {
        return eglBase != null;
    }

    @CalledByNative
    public int getColorFormat() {
        return this.colorFormat;
    }

    @CalledByNative
    public int getHeight() {
        return this.height;
    }

    @CalledByNative
    public ByteBuffer[] getInputBuffers() {
        return this.inputBuffers;
    }

    @CalledByNative
    public ByteBuffer[] getOutputBuffers() {
        return this.outputBuffers;
    }

    @CalledByNative
    public int getSliceHeight() {
        return this.sliceHeight;
    }

    @CalledByNative
    public int getStride() {
        return this.stride;
    }

    @CalledByNative
    public int getWidth() {
        return this.width;
    }
}
