package ai;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzfy;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class pz2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8747a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8748b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8749c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f8750d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8751e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8752f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8753g;

    public pz2(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        Objects.requireNonNull(str);
        this.f8747a = str;
        this.f8748b = str2;
        this.f8749c = str3;
        this.f8750d = codecCapabilities;
        this.f8751e = z13;
        this.f8752f = z15;
        this.f8753g = ua.b(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if ("Nexus 10".equals(r3) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ai.pz2 a(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            ai.pz2 r11 = new ai.pz2
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3f
            int r3 = ai.sb.f9778a
            r5 = 19
            if (r3 < r5) goto L3f
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L3f
            r5 = 22
            if (r3 > r5) goto L3d
            java.lang.String r3 = ai.sb.f9781d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2c
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3d
        L2c:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3f
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L3d
            goto L3f
        L3d:
            r8 = r0
            goto L40
        L3f:
            r8 = r2
        L40:
            r3 = 21
            if (r4 == 0) goto L52
            int r5 = ai.sb.f9778a
            if (r5 < r3) goto L52
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L52
            r9 = r0
            goto L53
        L52:
            r9 = r2
        L53:
            if (r20 != 0) goto L66
            if (r4 == 0) goto L64
            int r5 = ai.sb.f9778a
            if (r5 < r3) goto L64
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L64
            goto L66
        L64:
            r10 = r2
            goto L67
        L66:
            r10 = r0
        L67:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.pz2.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):ai.pz2");
    }

    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point j10 = j(videoCapabilities, i10, i11);
        int i12 = j10.x;
        int i13 = j10.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    public static Point j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(sb.b0(i10, widthAlignment) * widthAlignment, sb.b0(i11, heightAlignment) * heightAlignment);
    }

    public final MediaCodecInfo.CodecProfileLevel[] b() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8750d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final boolean c(v4 v4Var) throws zzfy {
        int i10;
        String d10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String str = v4Var.f10957i;
        int i11 = 16;
        if (str != null && (d10 = ua.d(str)) != null) {
            if (!this.f8748b.equals(d10)) {
                String str2 = v4Var.f10957i;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 13 + d10.length());
                sb2.append("codec.mime ");
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(d10);
                h(sb2.toString());
            } else {
                Pair<Integer, Integer> f10 = qg3.f(v4Var);
                if (f10 != null) {
                    int intValue = ((Integer) f10.first).intValue();
                    int intValue2 = ((Integer) f10.second).intValue();
                    if (!this.f8753g) {
                        if (intValue == 42) {
                            intValue = 42;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel[] b10 = b();
                    if (sb.f9778a <= 23 && MimeTypes.VIDEO_VP9.equals(this.f8748b) && b10.length == 0) {
                        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8750d;
                        int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                        int i12 = intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                        codecProfileLevel.profile = 1;
                        codecProfileLevel.level = i12;
                        b10 = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : b10) {
                        if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                        }
                    }
                    String str3 = v4Var.f10957i;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 22 + d10.length());
                    sb3.append("codec.profileLevel, ");
                    sb3.append(str3);
                    sb3.append(", ");
                    sb3.append(d10);
                    h(sb3.toString());
                }
            }
            return false;
        }
        if (this.f8753g) {
            int i13 = v4Var.f10965q;
            if (i13 <= 0 || (i10 = v4Var.f10966r) <= 0) {
                return true;
            }
            if (sb.f9778a >= 21) {
                return f(i13, i10, v4Var.f10967s);
            }
            boolean z10 = i13 * i10 <= qg3.e();
            if (!z10) {
                int i14 = v4Var.f10965q;
                int i15 = v4Var.f10966r;
                StringBuilder sb4 = new StringBuilder(40);
                sb4.append("legacyFrameSize, ");
                sb4.append(i14);
                sb4.append("x");
                sb4.append(i15);
                h(sb4.toString());
            }
            return z10;
        }
        int i16 = sb.f9778a;
        if (i16 >= 21) {
            int i17 = v4Var.f10974z;
            if (i17 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f8750d;
                if (codecCapabilities2 == null) {
                    h("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities == null) {
                    h("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i17)) {
                    StringBuilder sb5 = new StringBuilder(31);
                    sb5.append("sampleRate.support, ");
                    sb5.append(i17);
                    h(sb5.toString());
                    return false;
                }
            }
            int i18 = v4Var.f10973y;
            if (i18 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f8750d;
                if (codecCapabilities3 == null) {
                    h("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        h("channelCount.aCaps");
                    } else {
                        String str4 = this.f8747a;
                        String str5 = this.f8748b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i16 < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str5) && !MimeTypes.AUDIO_AMR_NB.equals(str5) && !MimeTypes.AUDIO_AMR_WB.equals(str5) && !MimeTypes.AUDIO_AAC.equals(str5) && !MimeTypes.AUDIO_VORBIS.equals(str5) && !MimeTypes.AUDIO_OPUS.equals(str5) && !MimeTypes.AUDIO_RAW.equals(str5) && !MimeTypes.AUDIO_FLAC.equals(str5) && !MimeTypes.AUDIO_ALAW.equals(str5) && !MimeTypes.AUDIO_MLAW.equals(str5) && !MimeTypes.AUDIO_MSGSM.equals(str5))) {
                            if (MimeTypes.AUDIO_AC3.equals(str5)) {
                                i11 = 6;
                            } else if (!MimeTypes.AUDIO_E_AC3.equals(str5)) {
                                i11 = 30;
                            }
                            StringBuilder sb6 = new StringBuilder(String.valueOf(str4).length() + 59);
                            sb6.append("AssumedMaxChannelAdjustment: ");
                            sb6.append(str4);
                            sb6.append(", [");
                            sb6.append(maxInputChannelCount);
                            sb6.append(" to ");
                            sb6.append(i11);
                            sb6.append("]");
                            Log.w(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.TAG, sb6.toString());
                            maxInputChannelCount = i11;
                        }
                        if (maxInputChannelCount < i18) {
                            StringBuilder sb7 = new StringBuilder(33);
                            sb7.append("channelCount.support, ");
                            sb7.append(i18);
                            h(sb7.toString());
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean d(v4 v4Var) {
        if (this.f8753g) {
            return this.f8751e;
        }
        Pair<Integer, Integer> f10 = qg3.f(v4Var);
        return f10 != null && ((Integer) f10.first).intValue() == 42;
    }

    public final qo e(v4 v4Var, v4 v4Var2) {
        int i10 = true != sb.H(v4Var.f10960l, v4Var2.f10960l) ? 8 : 0;
        if (this.f8753g) {
            if (v4Var.f10968t != v4Var2.f10968t) {
                i10 |= 1024;
            }
            if (!this.f8751e && (v4Var.f10965q != v4Var2.f10965q || v4Var.f10966r != v4Var2.f10966r)) {
                i10 |= 512;
            }
            if (!sb.H(v4Var.f10972x, v4Var2.f10972x)) {
                i10 |= 2048;
            }
            String str = this.f8747a;
            if (sb.f9781d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !v4Var.d(v4Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new qo(this.f8747a, v4Var, v4Var2, true != v4Var.d(v4Var2) ? 2 : 3, 0);
            }
        } else {
            if (v4Var.f10973y != v4Var2.f10973y) {
                i10 |= 4096;
            }
            if (v4Var.f10974z != v4Var2.f10974z) {
                i10 |= 8192;
            }
            if (v4Var.A != v4Var2.A) {
                i10 |= 16384;
            }
            if (i10 == 0 && MimeTypes.AUDIO_AAC.equals(this.f8748b)) {
                Pair<Integer, Integer> f10 = qg3.f(v4Var);
                Pair<Integer, Integer> f11 = qg3.f(v4Var2);
                if (f10 != null && f11 != null) {
                    int intValue = ((Integer) f10.first).intValue();
                    int intValue2 = ((Integer) f11.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new qo(this.f8747a, v4Var, v4Var2, 3, 0);
                    }
                }
            }
            if (!v4Var.d(v4Var2)) {
                i10 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(this.f8748b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new qo(this.f8747a, v4Var, v4Var2, 1, 0);
            }
        }
        return new qo(this.f8747a, v4Var, v4Var2, 0, i10);
    }

    public final boolean f(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8750d;
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
            if (i10 < i11 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f8747a) || !"mcv5a".equals(sb.f9779b)) && i(videoCapabilities, i11, i10, d10))) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("sizeAndRate.rotated, ");
                sb2.append(i10);
                sb2.append("x");
                sb2.append(i11);
                sb2.append("x");
                sb2.append(d10);
                String sb3 = sb2.toString();
                String str = this.f8747a;
                String str2 = this.f8748b;
                String str3 = sb.f9782e;
                int length = String.valueOf(str).length();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 25 + length + str2.length() + String.valueOf(str3).length());
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

    public final Point g(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8750d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return j(videoCapabilities, i10, i11);
    }

    public final void h(String str) {
        String str2 = this.f8747a;
        String str3 = this.f8748b;
        String str4 = sb.f9782e;
        int length = String.valueOf(str2).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 20 + length + str3.length() + String.valueOf(str4).length());
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

    public final String toString() {
        return this.f8747a;
    }
}
