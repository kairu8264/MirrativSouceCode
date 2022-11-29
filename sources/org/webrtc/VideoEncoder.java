package org.webrtc;

import org.webrtc.EncodedImage;

/* loaded from: classes4.dex */
public interface VideoEncoder {

    /* loaded from: classes4.dex */
    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        @CalledByNative("BitrateAllocation")
        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int[][] iArr;
            int i10 = 0;
            for (int[] iArr2 : this.bitratesBbs) {
                for (int i11 : iArr2) {
                    i10 += i11;
                }
            }
            return i10;
        }
    }

    /* loaded from: classes4.dex */
    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    /* loaded from: classes4.dex */
    public static class CodecSpecificInfo {
    }

    /* loaded from: classes4.dex */
    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    /* loaded from: classes4.dex */
    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    /* loaded from: classes4.dex */
    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    /* loaded from: classes4.dex */
    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        @CalledByNative("EncodeInfo")
        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    /* loaded from: classes4.dex */
    public static class Settings {
        public final boolean automaticResizeOn;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        @CalledByNative("Settings")
        public Settings(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
            this.numberOfCores = i10;
            this.width = i11;
            this.height = i12;
            this.startBitrate = i13;
            this.maxFramerate = i14;
            this.numberOfSimulcastStreams = i15;
            this.automaticResizeOn = z10;
        }
    }

    @CalledByNative
    default long createNativeVideoEncoder() {
        return 0L;
    }

    @CalledByNative
    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    ScalingSettings getScalingSettings();

    @CalledByNative
    VideoCodecStatus initEncode(Settings settings, Callback callback);

    @CalledByNative
    default boolean isHardwareEncoder() {
        return true;
    }

    @CalledByNative
    VideoCodecStatus release();

    @CalledByNative
    VideoCodecStatus setChannelParameters(short s10, long j10);

    @CalledByNative
    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i10);

    /* loaded from: classes4.dex */
    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;

        /* renamed from: on  reason: collision with root package name */
        public final boolean f45559on;

        public ScalingSettings(int i10, int i11) {
            this.f45559on = true;
            this.low = Integer.valueOf(i10);
            this.high = Integer.valueOf(i11);
        }

        public String toString() {
            if (this.f45559on) {
                return "[ " + this.low + ", " + this.high + " ]";
            }
            return "OFF";
        }

        private ScalingSettings() {
            this.f45559on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z10) {
            this.f45559on = z10;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z10, int i10, int i11) {
            this.f45559on = z10;
            this.low = Integer.valueOf(i10);
            this.high = Integer.valueOf(i11);
        }
    }
}
