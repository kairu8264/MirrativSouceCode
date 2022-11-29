package org.webrtc;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.VideoFrame;

@TargetApi(19)
@Deprecated
/* loaded from: classes4.dex */
public class MediaCodecVideoEncoder {
    private static final int BITRATE_ADJUSTMENT_FPS = 30;
    private static final double BITRATE_CORRECTION_MAX_SCALE = 4.0d;
    private static final double BITRATE_CORRECTION_SEC = 3.0d;
    private static final int BITRATE_CORRECTION_STEPS = 20;
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int DEQUEUE_TIMEOUT = 0;
    private static final String[] H264_HW_EXCEPTION_MODELS;
    private static final String H264_MIME_TYPE = "video/avc";
    private static final int MAXIMUM_INITIAL_FPS = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "MediaCodecVideoEncoder";
    private static final int VIDEO_AVCLevel3 = 256;
    private static final int VIDEO_AVCProfileHigh = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    private static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    private static int codecErrors;
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static final MediaCodecProperties exynosH264HighProfileHwProperties;
    private static final MediaCodecProperties exynosH264HwProperties;
    private static final MediaCodecProperties exynosVp8HwProperties;
    private static final MediaCodecProperties exynosVp9HwProperties;
    private static final MediaCodecProperties[] h264HighProfileHwList;
    private static Set<String> hwEncoderDisabledTypes = new HashSet();
    private static final MediaCodecProperties intelVp8HwProperties;
    private static final MediaCodecProperties mediatekH264HwProperties;
    private static final MediaCodecProperties qcomH264HwProperties;
    private static final MediaCodecProperties qcomVp8HwProperties;
    private static final MediaCodecProperties qcomVp9HwProperties;
    private static MediaCodecVideoEncoder runningInstance;
    private static EglBase staticEglBase;
    private static final int[] supportedColorList;
    private static final int[] supportedSurfaceColorList;
    private static final MediaCodecProperties[] vp9HwList;
    private double bitrateAccumulator;
    private double bitrateAccumulatorMax;
    private int bitrateAdjustmentScaleExp;
    private BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
    private double bitrateObservationTimeMs;
    private int colorFormat;
    private ByteBuffer configData;
    private GlRectDrawer drawer;
    private EglBase14 eglBase;
    private long forcedKeyFrameMs;
    private int height;
    private Surface inputSurface;
    private long lastKeyFrameMs;
    private MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int profile;
    private int targetBitrateBps;
    private int targetFps;
    private VideoCodecType type;
    private int width;

    /* renamed from: org.webrtc.MediaCodecVideoEncoder$1CaughtException  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class C1CaughtException {

        /* renamed from: e  reason: collision with root package name */
        public Exception f45553e;

        public C1CaughtException() {
        }
    }

    /* loaded from: classes4.dex */
    public enum BitrateAdjustmentType {
        NO_ADJUSTMENT,
        FRAMERATE_ADJUSTMENT,
        DYNAMIC_ADJUSTMENT
    }

    /* loaded from: classes4.dex */
    public static class EncoderProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecName;
        public final int colorFormat;

        public EncoderProperties(String str, int i10, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecName = str;
            this.colorFormat = i10;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    /* loaded from: classes4.dex */
    public enum H264Profile {
        CONSTRAINED_BASELINE(0),
        BASELINE(1),
        MAIN(2),
        CONSTRAINED_HIGH(3),
        HIGH(4);
        
        private final int value;

        H264Profile(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes4.dex */
    public static class HwEncoderFactory implements VideoEncoderFactory {
        private final VideoCodecInfo[] supportedHardwareCodecs = getSupportedHardwareCodecs();

        private static VideoCodecInfo[] getSupportedHardwareCodecs() {
            ArrayList arrayList = new ArrayList();
            if (MediaCodecVideoEncoder.isVp8HwSupported()) {
                Logging.d(MediaCodecVideoEncoder.TAG, "VP8 HW Encoder supported.");
                arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
            }
            if (MediaCodecVideoEncoder.isVp9HwSupported()) {
                Logging.d(MediaCodecVideoEncoder.TAG, "VP9 HW Encoder supported.");
                arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isH264HighProfileHwSupported()) {
                Logging.d(MediaCodecVideoEncoder.TAG, "H.264 High Profile HW Encoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_HIGH_PROFILE_CODEC);
            }
            if (MediaCodecVideoEncoder.isH264HwSupported()) {
                Logging.d(MediaCodecVideoEncoder.TAG, "H.264 HW Encoder supported.");
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

        @Override // org.webrtc.VideoEncoderFactory
        public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
            if (!isCodecSupported(this.supportedHardwareCodecs, videoCodecInfo)) {
                Logging.d(MediaCodecVideoEncoder.TAG, "No HW video encoder for codec " + videoCodecInfo.name);
                return null;
            }
            Logging.d(MediaCodecVideoEncoder.TAG, "Create HW video encoder for " + videoCodecInfo.name);
            return new WrappedNativeVideoEncoder() { // from class: org.webrtc.MediaCodecVideoEncoder.HwEncoderFactory.1
                @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
                public long createNativeVideoEncoder() {
                    return MediaCodecVideoEncoder.nativeCreateEncoder(videoCodecInfo, MediaCodecVideoEncoder.staticEglBase instanceof EglBase14);
                }

                @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
                public boolean isHardwareEncoder() {
                    return true;
                }
            };
        }

        @Override // org.webrtc.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs() {
            return this.supportedHardwareCodecs;
        }
    }

    /* loaded from: classes4.dex */
    public static class MediaCodecProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecPrefix;
        public final int minSdk;

        public MediaCodecProperties(String str, int i10, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecPrefix = str;
            this.minSdk = i10;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    /* loaded from: classes4.dex */
    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i10);
    }

    /* loaded from: classes4.dex */
    public static class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;

        public OutputBufferInfo(int i10, ByteBuffer byteBuffer, boolean z10, long j10) {
            this.index = i10;
            this.buffer = byteBuffer;
            this.isKeyFrame = z10;
            this.presentationTimestampUs = j10;
        }

        @CalledByNative("OutputBufferInfo")
        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        @CalledByNative("OutputBufferInfo")
        public int getIndex() {
            return this.index;
        }

        @CalledByNative("OutputBufferInfo")
        public long getPresentationTimestampUs() {
            return this.presentationTimestampUs;
        }

        @CalledByNative("OutputBufferInfo")
        public boolean isKeyFrame() {
            return this.isKeyFrame;
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

    static {
        BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
        qcomVp8HwProperties = new MediaCodecProperties(MediaCodecUtils.QCOM_PREFIX, 19, bitrateAdjustmentType);
        exynosVp8HwProperties = new MediaCodecProperties(MediaCodecUtils.EXYNOS_PREFIX, 23, BitrateAdjustmentType.DYNAMIC_ADJUSTMENT);
        intelVp8HwProperties = new MediaCodecProperties(MediaCodecUtils.INTEL_PREFIX, 21, bitrateAdjustmentType);
        MediaCodecProperties mediaCodecProperties = new MediaCodecProperties(MediaCodecUtils.QCOM_PREFIX, 24, bitrateAdjustmentType);
        qcomVp9HwProperties = mediaCodecProperties;
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.FRAMERATE_ADJUSTMENT;
        MediaCodecProperties mediaCodecProperties2 = new MediaCodecProperties(MediaCodecUtils.EXYNOS_PREFIX, 24, bitrateAdjustmentType2);
        exynosVp9HwProperties = mediaCodecProperties2;
        vp9HwList = new MediaCodecProperties[]{mediaCodecProperties, mediaCodecProperties2};
        qcomH264HwProperties = new MediaCodecProperties(MediaCodecUtils.QCOM_PREFIX, 19, bitrateAdjustmentType);
        exynosH264HwProperties = new MediaCodecProperties(MediaCodecUtils.EXYNOS_PREFIX, 21, bitrateAdjustmentType2);
        mediatekH264HwProperties = new MediaCodecProperties("OMX.MTK.", 27, bitrateAdjustmentType2);
        MediaCodecProperties mediaCodecProperties3 = new MediaCodecProperties(MediaCodecUtils.EXYNOS_PREFIX, 23, bitrateAdjustmentType2);
        exynosH264HighProfileHwProperties = mediaCodecProperties3;
        h264HighProfileHwList = new MediaCodecProperties[]{mediaCodecProperties3};
        H264_HW_EXCEPTION_MODELS = new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"};
        supportedColorList = new int[]{19, 21, 2141391872, 2141391876};
        supportedSurfaceColorList = new int[]{2130708361};
    }

    private void checkOnMediaCodecThread() {
        if (this.mediaCodecThread.getId() == Thread.currentThread().getId()) {
            return;
        }
        throw new RuntimeException("MediaCodecVideoEncoder previously operated on " + this.mediaCodecThread + " but is now called on " + Thread.currentThread());
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static VideoEncoderFactory createFactory() {
        return new DefaultVideoEncoderFactory(new HwEncoderFactory());
    }

    public static void disableH264HwCodec() {
        Logging.w(TAG, "H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableVp8HwCodec() {
        Logging.w(TAG, "VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Logging.w(TAG, "VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public static void disposeEglContext() {
        EglBase eglBase = staticEglBase;
        if (eglBase != null) {
            eglBase.release();
            staticEglBase = null;
        }
    }

    private static EncoderProperties findHwEncoder(String str, MediaCodecProperties[] mediaCodecPropertiesArr, int[] iArr) {
        MediaCodecInfo mediaCodecInfo;
        String str2;
        boolean z10;
        int[] iArr2;
        int[] iArr3;
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        if (str.equals("video/avc")) {
            List asList = Arrays.asList(H264_HW_EXCEPTION_MODELS);
            String str3 = Build.MODEL;
            if (asList.contains(str3)) {
                Logging.w(TAG, "Model: " + str3 + " has black listed H.264 encoder.");
                return null;
            }
        }
        for (int i10 = 0; i10 < MediaCodecList.getCodecCount(); i10++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i10);
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "Cannot retrieve encoder codec info", e10);
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
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
                    Logging.v(TAG, "Found candidate encoder " + str2);
                    BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
                    int length2 = mediaCodecPropertiesArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length2) {
                            z10 = false;
                            break;
                        }
                        MediaCodecProperties mediaCodecProperties = mediaCodecPropertiesArr[i12];
                        if (str2.startsWith(mediaCodecProperties.codecPrefix)) {
                            int i13 = Build.VERSION.SDK_INT;
                            if (i13 < mediaCodecProperties.minSdk) {
                                Logging.w(TAG, "Codec " + str2 + " is disabled due to SDK version " + i13);
                            } else {
                                BitrateAdjustmentType bitrateAdjustmentType2 = mediaCodecProperties.bitrateAdjustmentType;
                                if (bitrateAdjustmentType2 != BitrateAdjustmentType.NO_ADJUSTMENT) {
                                    Logging.w(TAG, "Codec " + str2 + " requires bitrate adjustment: " + bitrateAdjustmentType2);
                                    bitrateAdjustmentType = bitrateAdjustmentType2;
                                }
                                z10 = true;
                            }
                        }
                        i12++;
                    }
                    if (z10) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            for (int i14 : capabilitiesForType.colorFormats) {
                                Logging.v(TAG, "   Color: 0x" + Integer.toHexString(i14));
                            }
                            for (int i15 : iArr) {
                                for (int i16 : capabilitiesForType.colorFormats) {
                                    if (i16 == i15) {
                                        Logging.d(TAG, "Found target encoder for mime " + str + " : " + str2 + ". Color: 0x" + Integer.toHexString(i16) + ". Bitrate adjustment: " + bitrateAdjustmentType);
                                        return new EncoderProperties(str2, i16, bitrateAdjustmentType);
                                    }
                                }
                            }
                            continue;
                        } catch (IllegalArgumentException e11) {
                            Logging.e(TAG, "Cannot retrieve encoder capabilities", e11);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private double getBitrateScale(int i10) {
        return Math.pow(BITRATE_CORRECTION_MAX_SCALE, i10 / 20.0d);
    }

    public static EglBase.Context getEglContext() {
        EglBase eglBase = staticEglBase;
        if (eglBase == null) {
            return null;
        }
        return eglBase.getEglBaseContext();
    }

    private static final MediaCodecProperties[] h264HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomH264HwProperties);
        arrayList.add(exynosH264HwProperties);
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekH264").equals(PeerConnectionFactory.TRIAL_ENABLED)) {
            arrayList.add(mediatekH264HwProperties);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    public static boolean isH264HighProfileHwSupported() {
        return (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HighProfileHwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupported() {
        return (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HwList(), supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HwList(), supportedSurfaceColorList) == null) ? false : true;
    }

    @CalledByNative
    public static boolean isTextureBuffer(VideoFrame.Buffer buffer) {
        return buffer instanceof VideoFrame.TextureBuffer;
    }

    public static boolean isVp8HwSupported() {
        return (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findHwEncoder("video/x-vnd.on2.vp8", vp8HwList(), supportedColorList) == null) ? false : true;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findHwEncoder("video/x-vnd.on2.vp8", vp8HwList(), supportedSurfaceColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        return (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findHwEncoder("video/x-vnd.on2.vp9", vp9HwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findHwEncoder("video/x-vnd.on2.vp9", vp9HwList, supportedSurfaceColorList) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateEncoder(VideoCodecInfo videoCodecInfo, boolean z10);

    private static native void nativeFillInputBuffer(long j10, int i10, ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13);

    public static void printStackTrace() {
        Thread thread;
        MediaCodecVideoEncoder mediaCodecVideoEncoder = runningInstance;
        if (mediaCodecVideoEncoder == null || (thread = mediaCodecVideoEncoder.mediaCodecThread) == null) {
            return;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace.length > 0) {
            Logging.d(TAG, "MediaCodecVideoEncoder stacks trace:");
            for (StackTraceElement stackTraceElement : stackTrace) {
                Logging.d(TAG, stackTraceElement.toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void reportEncodedFrame(int r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoEncoder.reportEncodedFrame(int):void");
    }

    public static void setEglContext(EglBase.Context context) {
        if (staticEglBase != null) {
            Logging.w(TAG, "Egl context already set.");
            staticEglBase.release();
        }
        staticEglBase = EglBase.create(context);
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoEncoderErrorCallback;
    }

    @CalledByNativeUnchecked
    private boolean setRates(int i10, int i11) {
        checkOnMediaCodecThread();
        int i12 = i10 * 1000;
        BitrateAdjustmentType bitrateAdjustmentType = this.bitrateAdjustmentType;
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.DYNAMIC_ADJUSTMENT;
        if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            double d10 = i12;
            this.bitrateAccumulatorMax = d10 / 8.0d;
            int i13 = this.targetBitrateBps;
            if (i13 > 0 && i12 < i13) {
                this.bitrateAccumulator = (this.bitrateAccumulator * d10) / i13;
            }
        }
        this.targetBitrateBps = i12;
        this.targetFps = i11;
        if (bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT && i11 > 0) {
            i12 = (i12 * 30) / i11;
            Logging.v(TAG, "setRates: " + i10 + " -> " + (i12 / 1000) + " kbps. Fps: " + this.targetFps);
        } else if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            Logging.v(TAG, "setRates: " + i10 + " kbps. Fps: " + this.targetFps + ". ExpScale: " + this.bitrateAdjustmentScaleExp);
            int i14 = this.bitrateAdjustmentScaleExp;
            if (i14 != 0) {
                i12 = (int) (i12 * getBitrateScale(i14));
            }
        } else {
            Logging.v(TAG, "setRates: " + i10 + " kbps. Fps: " + this.targetFps);
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i12);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "setRates failed", e10);
            return false;
        }
    }

    public static EncoderProperties vp8HwEncoderProperties() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8")) {
            return null;
        }
        return findHwEncoder("video/x-vnd.on2.vp8", vp8HwList(), supportedColorList);
    }

    private static MediaCodecProperties[] vp8HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomVp8HwProperties);
        arrayList.add(exynosVp8HwProperties);
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-IntelVP8").equals(PeerConnectionFactory.TRIAL_ENABLED)) {
            arrayList.add(intelVp8HwProperties);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void checkKeyFrameRequired(boolean r7, long r8) {
        /*
            r6 = this;
            r0 = 500(0x1f4, double:2.47E-321)
            long r8 = r8 + r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r0
            long r0 = r6.lastKeyFrameMs
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L10
            r6.lastKeyFrameMs = r8
        L10:
            r0 = 0
            if (r7 != 0) goto L22
            long r4 = r6.forcedKeyFrameMs
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L22
            long r1 = r6.lastKeyFrameMs
            long r1 = r1 + r4
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = r0
        L23:
            if (r7 != 0) goto L27
            if (r1 == 0) goto L47
        L27:
            java.lang.String r1 = "MediaCodecVideoEncoder"
            if (r7 == 0) goto L31
            java.lang.String r7 = "Sync frame request"
            org.webrtc.Logging.d(r1, r7)
            goto L36
        L31:
            java.lang.String r7 = "Sync frame forced"
            org.webrtc.Logging.d(r1, r7)
        L36:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r1 = "request-sync"
            r7.putInt(r1, r0)
            android.media.MediaCodec r0 = r6.mediaCodec
            r0.setParameters(r7)
            r6.lastKeyFrameMs = r8
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoEncoder.checkKeyFrameRequired(boolean, long):void");
    }

    @CalledByNativeUnchecked
    public int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(0L);
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "dequeueIntputBuffer failed", e10);
            return -2;
        }
    }

    @CalledByNativeUnchecked
    public OutputBufferInfo dequeueOutputBuffer() {
        checkOnMediaCodecThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            boolean z10 = true;
            if (dequeueOutputBuffer >= 0) {
                if ((bufferInfo.flags & 2) != 0) {
                    Logging.d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                    this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.outputBuffers[dequeueOutputBuffer].position(bufferInfo.offset);
                    this.outputBuffers[dequeueOutputBuffer].limit(bufferInfo.offset + bufferInfo.size);
                    this.configData.put(this.outputBuffers[dequeueOutputBuffer]);
                    String str = "";
                    int i10 = 0;
                    while (true) {
                        int i11 = bufferInfo.size;
                        if (i11 >= 8) {
                            i11 = 8;
                        }
                        if (i10 >= i11) {
                            break;
                        }
                        str = str + Integer.toHexString(this.configData.get(i10) & TagConstant.TAG_CAT_RESERVED) + " ";
                        i10++;
                    }
                    Logging.d(TAG, str);
                    this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                }
            }
            int i12 = dequeueOutputBuffer;
            if (i12 < 0) {
                if (i12 == -3) {
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    return dequeueOutputBuffer();
                } else if (i12 == -2) {
                    return dequeueOutputBuffer();
                } else {
                    if (i12 == -1) {
                        return null;
                    }
                    throw new RuntimeException("dequeueOutputBuffer: " + i12);
                }
            }
            ByteBuffer duplicate = this.outputBuffers[i12].duplicate();
            duplicate.position(bufferInfo.offset);
            duplicate.limit(bufferInfo.offset + bufferInfo.size);
            reportEncodedFrame(bufferInfo.size);
            if ((bufferInfo.flags & 1) == 0) {
                z10 = false;
            }
            if (z10) {
                Logging.d(TAG, "Sync frame generated");
            }
            if (z10 && this.type == VideoCodecType.VIDEO_CODEC_H264) {
                Logging.d(TAG, "Appending config frame of size " + this.configData.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.configData.capacity() + bufferInfo.size);
                this.configData.rewind();
                allocateDirect.put(this.configData);
                allocateDirect.put(duplicate);
                allocateDirect.position(0);
                return new OutputBufferInfo(i12, allocateDirect, z10, bufferInfo.presentationTimeUs);
            }
            return new OutputBufferInfo(i12, duplicate.slice(), z10, bufferInfo.presentationTimeUs);
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "dequeueOutputBuffer failed", e10);
            return new OutputBufferInfo(-1, null, false, -1L);
        }
    }

    @CalledByNativeUnchecked
    public boolean encodeBuffer(boolean z10, int i10, int i11, long j10) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z10, j10);
            this.mediaCodec.queueInputBuffer(i10, 0, i11, j10, 0);
            return true;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "encodeBuffer failed", e10);
            return false;
        }
    }

    @CalledByNativeUnchecked
    public boolean encodeFrame(long j10, boolean z10, VideoFrame videoFrame, int i10, long j11) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z10, j11);
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (buffer instanceof VideoFrame.TextureBuffer) {
                VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
                this.eglBase.makeCurrent();
                GLES20.glClear(16384);
                GlRectDrawer glRectDrawer = this.drawer;
                Matrix matrix = new Matrix();
                int i11 = this.width;
                int i12 = this.height;
                VideoFrameDrawer.drawTexture(glRectDrawer, textureBuffer, matrix, i11, i12, 0, 0, i11, i12);
                this.eglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j11));
            } else {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                int i13 = (this.height + 1) / 2;
                ByteBuffer dataY = i420.getDataY();
                ByteBuffer dataU = i420.getDataU();
                ByteBuffer dataV = i420.getDataV();
                int strideY = i420.getStrideY();
                int strideU = i420.getStrideU();
                int strideV = i420.getStrideV();
                if (dataY.capacity() >= this.height * strideY) {
                    if (dataU.capacity() >= strideU * i13) {
                        if (dataV.capacity() >= i13 * strideV) {
                            nativeFillInputBuffer(j10, i10, dataY, strideY, dataU, strideU, dataV, strideV);
                            i420.release();
                            this.mediaCodec.queueInputBuffer(i10, 0, ((this.width * this.height) * 3) / 2, j11, 0);
                        } else {
                            throw new RuntimeException("V-plane buffer size too small.");
                        }
                    } else {
                        throw new RuntimeException("U-plane buffer size too small.");
                    }
                } else {
                    throw new RuntimeException("Y-plane buffer size too small.");
                }
            }
            return true;
        } catch (RuntimeException e10) {
            Logging.e(TAG, "encodeFrame failed", e10);
            return false;
        }
    }

    @CalledByNative
    public int getColorFormat() {
        return this.colorFormat;
    }

    @CalledByNativeUnchecked
    public ByteBuffer[] getInputBuffers() {
        ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
        Logging.d(TAG, "Input buffers: " + inputBuffers.length);
        return inputBuffers;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0220  */
    @org.webrtc.CalledByNativeUnchecked
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean initEncode(org.webrtc.MediaCodecVideoEncoder.VideoCodecType r18, int r19, int r20, int r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoEncoder.initEncode(org.webrtc.MediaCodecVideoEncoder$VideoCodecType, int, int, int, int, int, boolean):boolean");
    }

    @CalledByNativeUnchecked
    public void release() {
        Logging.d(TAG, "Java releaseEncoder");
        checkOnMediaCodecThread();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        boolean z10 = false;
        if (this.mediaCodec != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() { // from class: org.webrtc.MediaCodecVideoEncoder.1
                @Override // java.lang.Runnable
                public void run() {
                    Logging.d(MediaCodecVideoEncoder.TAG, "Java releaseEncoder on release thread");
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.stop();
                    } catch (Exception e10) {
                        Logging.e(MediaCodecVideoEncoder.TAG, "Media encoder stop failed", e10);
                    }
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.release();
                    } catch (Exception e11) {
                        Logging.e(MediaCodecVideoEncoder.TAG, "Media encoder release failed", e11);
                        c1CaughtException.f45553e = e11;
                    }
                    Logging.d(MediaCodecVideoEncoder.TAG, "Java releaseEncoder on release thread done");
                    countDownLatch.countDown();
                }
            }).start();
            if (!ThreadUtils.awaitUninterruptibly(countDownLatch, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS)) {
                Logging.e(TAG, "Media encoder release timeout");
                z10 = true;
            }
            this.mediaCodec = null;
        }
        this.mediaCodecThread = null;
        GlRectDrawer glRectDrawer = this.drawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.drawer = null;
        }
        EglBase14 eglBase14 = this.eglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.eglBase = null;
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        if (z10) {
            codecErrors++;
            if (errorCallback != null) {
                Logging.e(TAG, "Invoke codec error callback. Errors: " + codecErrors);
                errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
            }
            throw new RuntimeException("Media encoder release timeout.");
        } else if (c1CaughtException.f45553e == null) {
            Logging.d(TAG, "Java releaseEncoder done");
        } else {
            RuntimeException runtimeException = new RuntimeException(c1CaughtException.f45553e);
            runtimeException.setStackTrace(ThreadUtils.concatStackTraces(c1CaughtException.f45553e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }

    @CalledByNativeUnchecked
    public boolean releaseOutputBuffer(int i10) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "releaseOutputBuffer failed", e10);
            return false;
        }
    }
}
