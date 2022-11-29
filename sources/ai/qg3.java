package ai;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzfy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* loaded from: classes3.dex */
public final class qg3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f8942a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<j93, List<pz2>> f8943b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static int f8944c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f8945d = 0;

    public static pz2 a() throws zzfy {
        return b(MimeTypes.AUDIO_RAW, false, false);
    }

    public static pz2 b(String str, boolean z10, boolean z11) throws zzfy {
        List<pz2> c10 = c(str, false, false);
        if (c10.isEmpty()) {
            return null;
        }
        return c10.get(0);
    }

    public static synchronized List<pz2> c(String str, boolean z10, boolean z11) throws zzfy {
        kb3 mc3Var;
        synchronized (qg3.class) {
            j93 j93Var = new j93(str, z10, z11);
            HashMap<j93, List<pz2>> hashMap = f8943b;
            List<pz2> list = hashMap.get(j93Var);
            if (list != null) {
                return list;
            }
            int i10 = sb.f9778a;
            if (i10 >= 21) {
                mc3Var = new nd3(z10, z11);
            } else {
                mc3Var = new mc3(null);
            }
            ArrayList<pz2> g10 = g(j93Var, mc3Var);
            if (z10 && g10.isEmpty() && i10 >= 21 && i10 <= 23) {
                g10 = g(j93Var, new mc3(null));
                if (!g10.isEmpty()) {
                    String str2 = g10.get(0).f8747a;
                    StringBuilder sb2 = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    Log.w("MediaCodecUtil", sb2.toString());
                }
            }
            if (MimeTypes.AUDIO_RAW.equals(str)) {
                if (i10 < 26 && sb.f9779b.equals("R9") && g10.size() == 1 && g10.get(0).f8747a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    g10.add(pz2.a("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
                }
                i(g10, g63.f4354a);
            }
            if (i10 < 21 && g10.size() > 1) {
                String str3 = g10.get(0).f8747a;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    i(g10, h73.f4770a);
                }
            }
            if (i10 < 32 && g10.size() > 1 && "OMX.qti.audio.decoder.flac".equals(g10.get(0).f8747a)) {
                g10.add(g10.remove(0));
            }
            List<pz2> unmodifiableList = Collections.unmodifiableList(g10);
            hashMap.put(j93Var, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static List<pz2> d(List<pz2> list, final v4 v4Var) {
        ArrayList arrayList = new ArrayList(list);
        i(arrayList, new pf3(v4Var) { // from class: ai.g53

            /* renamed from: a  reason: collision with root package name */
            public final v4 f4349a;

            {
                this.f4349a = v4Var;
            }

            @Override // ai.pf3
            public final int a(Object obj) {
                v4 v4Var2 = this.f4349a;
                pz2 pz2Var = (pz2) obj;
                int i10 = qg3.f8945d;
                try {
                    return !pz2Var.c(v4Var2) ? 0 : 1;
                } catch (zzfy unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    public static int e() throws zzfy {
        int i10;
        if (f8944c == -1) {
            int i11 = 0;
            pz2 b10 = b(MimeTypes.VIDEO_H264, false, false);
            if (b10 != null) {
                MediaCodecInfo.CodecProfileLevel[] b11 = b10.b();
                int length = b11.length;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = b11[i11].level;
                    if (i13 == 1 || i13 == 2) {
                        i10 = 25344;
                    } else {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                continue;
                            case 64:
                                i10 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i10 = 414720;
                                continue;
                            case 512:
                                i10 = 921600;
                                continue;
                            case 1024:
                                i10 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                continue;
                            case 8192:
                                i10 = 2228224;
                                continue;
                            case 16384:
                                i10 = 5652480;
                                continue;
                            case 32768:
                            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                                i10 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                continue;
                            default:
                                i10 = -1;
                                continue;
                        }
                    }
                    i12 = Math.max(i10, i12);
                    i11++;
                }
                i11 = Math.max(i12, sb.f9778a >= 21 ? 345600 : 172800);
            }
            f8944c = i11;
        }
        return f8944c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02fd A[Catch: NumberFormatException -> 0x030d, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x030d, blocks: (B:168:0x02a6, B:170:0x02b8, B:181:0x02d4, B:197:0x02fd), top: B:557:0x02a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> f(ai.v4 r17) {
        /*
            Method dump skipped, instructions count: 2694
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.qg3.f(ai.v4):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x019c, code lost:
        if ("SCV31".equals(r5) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01da, code lost:
        if (r8.startsWith("t0") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
        if (r11.startsWith("HM") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0110, code lost:
        if ("SO-02E".equals(r11) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013c, code lost:
        if ("C1605".equals(r10) == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0295 A[Catch: Exception -> 0x0323, TryCatch #2 {Exception -> 0x0323, blocks: (B:157:0x0263, B:163:0x027a, B:169:0x028f, B:171:0x0295, B:176:0x02a5, B:178:0x02ad, B:188:0x02d9, B:191:0x02df, B:179:0x02b2, B:181:0x02c2, B:183:0x02ca, B:172:0x029a), top: B:221:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x029a A[Catch: Exception -> 0x0323, TryCatch #2 {Exception -> 0x0323, blocks: (B:157:0x0263, B:163:0x027a, B:169:0x028f, B:171:0x0295, B:176:0x02a5, B:178:0x02ad, B:188:0x02d9, B:191:0x02df, B:179:0x02b2, B:181:0x02c2, B:183:0x02ca, B:172:0x029a), top: B:221:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ad A[Catch: Exception -> 0x0323, TryCatch #2 {Exception -> 0x0323, blocks: (B:157:0x0263, B:163:0x027a, B:169:0x028f, B:171:0x0295, B:176:0x02a5, B:178:0x02ad, B:188:0x02d9, B:191:0x02df, B:179:0x02b2, B:181:0x02c2, B:183:0x02ca, B:172:0x029a), top: B:221:0x0263 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02b2 A[Catch: Exception -> 0x0323, TryCatch #2 {Exception -> 0x0323, blocks: (B:157:0x0263, B:163:0x027a, B:169:0x028f, B:171:0x0295, B:176:0x02a5, B:178:0x02ad, B:188:0x02d9, B:191:0x02df, B:179:0x02b2, B:181:0x02c2, B:183:0x02ca, B:172:0x029a), top: B:221:0x0263 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<ai.pz2> g(ai.j93 r23, ai.kb3 r24) throws com.google.android.gms.internal.ads.zzfy {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.qg3.g(ai.j93, ai.kb3):java.util.ArrayList");
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo) {
        if (sb.f9778a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        String a10 = tw2.a(mediaCodecInfo.getName());
        if (a10.startsWith("arc.")) {
            return false;
        }
        return a10.startsWith("omx.google.") || a10.startsWith("omx.ffmpeg.") || (a10.startsWith("omx.sec.") && a10.contains(".sw.")) || a10.equals("omx.qcom.video.decoder.hevcswvdec") || a10.startsWith("c2.android.") || a10.startsWith("c2.google.") || !(a10.startsWith("omx.") || a10.startsWith("c2."));
    }

    public static <T> void i(List<T> list, final pf3<T> pf3Var) {
        Collections.sort(list, new Comparator(pf3Var) { // from class: ai.i83

            /* renamed from: w  reason: collision with root package name */
            public final pf3 f5137w;

            {
                this.f5137w = pf3Var;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                pf3 pf3Var2 = this.f5137w;
                int i10 = qg3.f8945d;
                return pf3Var2.a(obj2) - pf3Var2.a(obj);
            }
        });
    }
}
