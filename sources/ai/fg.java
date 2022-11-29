package ai;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Objects;

@TargetApi(16)
/* loaded from: classes3.dex */
public final class fg {

    /* renamed from: a  reason: collision with root package name */
    public final String f4011a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4012b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4013c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4014d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4015e;

    /* renamed from: f  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f4016f;

    public fg(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        Objects.requireNonNull(str);
        this.f4011a = str;
        this.f4015e = str2;
        this.f4016f = codecCapabilities;
        boolean z12 = true;
        this.f4012b = !z10 && codecCapabilities != null && vj.f11100a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f4013c = codecCapabilities != null && vj.f11100a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z11 && (codecCapabilities == null || vj.f11100a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z12 = false;
        }
        this.f4014d = z12;
    }

    public static fg a(String str) {
        return new fg("OMX.google.raw.decoder", null, null, false, false);
    }

    public static fg b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        return new fg(str, str2, codecCapabilities, z10, z11);
    }

    @TargetApi(21)
    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (d10 != -1.0d && d10 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
        }
        return videoCapabilities.isSizeSupported(i10, i11);
    }

    public final MediaCodecInfo.CodecProfileLevel[] c() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4016f;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean d(String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] c10;
        if (str == null || this.f4015e == null) {
            return true;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            str2 = MimeTypes.VIDEO_H264;
        } else if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            str2 = MimeTypes.VIDEO_H265;
        } else if (trim.startsWith("vp9")) {
            str2 = MimeTypes.VIDEO_VP9;
        } else if (trim.startsWith("vp8")) {
            str2 = MimeTypes.VIDEO_VP8;
        } else if (trim.startsWith("mp4a")) {
            str2 = MimeTypes.AUDIO_AAC;
        } else if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (trim.startsWith("opus")) {
            str2 = MimeTypes.AUDIO_OPUS;
        } else {
            str2 = trim.startsWith("vorbis") ? MimeTypes.AUDIO_VORBIS : null;
        }
        if (str2 == null) {
            return true;
        }
        if (!this.f4015e.equals(str2)) {
            StringBuilder sb2 = new StringBuilder(str.length() + 13 + str2.length());
            sb2.append("codec.mime ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(str2);
            h(sb2.toString());
            return false;
        }
        Pair<Integer, Integer> d10 = og.d(str);
        if (d10 == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : c()) {
            if (codecProfileLevel.profile == ((Integer) d10.first).intValue() && codecProfileLevel.level >= ((Integer) d10.second).intValue()) {
                return true;
            }
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 22 + str2.length());
        sb3.append("codec.profileLevel, ");
        sb3.append(str);
        sb3.append(", ");
        sb3.append(str2);
        h(sb3.toString());
        return false;
    }

    @TargetApi(21)
    public final boolean e(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4016f;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        } else if (i(videoCapabilities, i10, i11, d10)) {
            return true;
        } else {
            if (i10 < i11 && i(videoCapabilities, i11, i10, d10)) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("sizeAndRate.rotated, ");
                sb2.append(i10);
                sb2.append("x");
                sb2.append(i11);
                sb2.append("x");
                sb2.append(d10);
                String sb3 = sb2.toString();
                String str = this.f4011a;
                String str2 = this.f4015e;
                String str3 = vj.f11104e;
                int length = String.valueOf(str).length();
                int length2 = String.valueOf(str2).length();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 25 + length + length2 + String.valueOf(str3).length());
                sb4.append("AssumedSupport [");
                sb4.append(sb3);
                sb4.append("] [");
                sb4.append(str);
                sb4.append(", ");
                sb4.append(str2);
                sb4.append("] [");
                sb4.append(str3);
                sb4.append("]");
                Log.d(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb4.toString());
                return true;
            }
            StringBuilder sb5 = new StringBuilder(69);
            sb5.append("sizeAndRate.support, ");
            sb5.append(i10);
            sb5.append("x");
            sb5.append(i11);
            sb5.append("x");
            sb5.append(d10);
            h(sb5.toString());
            return false;
        }
    }

    @TargetApi(21)
    public final boolean f(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4016f;
        if (codecCapabilities == null) {
            h("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            h("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        } else {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("sampleRate.support, ");
            sb2.append(i10);
            h(sb2.toString());
            return false;
        }
    }

    @TargetApi(21)
    public final boolean g(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f4016f;
        if (codecCapabilities == null) {
            h("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            h("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() < i10) {
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("channelCount.support, ");
            sb2.append(i10);
            h(sb2.toString());
            return false;
        } else {
            return true;
        }
    }

    public final void h(String str) {
        String str2 = this.f4011a;
        String str3 = this.f4015e;
        String str4 = vj.f11104e;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 20 + length + length2 + String.valueOf(str4).length());
        sb2.append("NoSupport [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append("] [");
        sb2.append(str4);
        sb2.append("]");
        Log.d(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb2.toString());
    }
}
