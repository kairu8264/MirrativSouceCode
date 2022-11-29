package ai;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzarm;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes3.dex */
public final class og {

    /* renamed from: d  reason: collision with root package name */
    public static final SparseIntArray f7759d;

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f7760e;

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, Integer> f7761f;

    /* renamed from: a  reason: collision with root package name */
    public static final fg f7756a = fg.a("OMX.google.raw.decoder");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f7757b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap<jg, List<fg>> f7758c = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public static int f7762g = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7759d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f7760e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        HashMap hashMap = new HashMap();
        f7761f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", Integer.valueOf((int) C.DEFAULT_BUFFER_SEGMENT_SIZE));
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    public static fg a(String str, boolean z10) throws zzarm {
        List<fg> b10 = b(str, z10);
        if (b10.isEmpty()) {
            return null;
        }
        return b10.get(0);
    }

    public static synchronized List<fg> b(String str, boolean z10) throws zzarm {
        kg lgVar;
        synchronized (og.class) {
            jg jgVar = new jg(str, z10);
            HashMap<jg, List<fg>> hashMap = f7758c;
            List<fg> list = hashMap.get(jgVar);
            if (list != null) {
                return list;
            }
            int i10 = vj.f11100a;
            if (i10 >= 21) {
                lgVar = new mg(z10);
            } else {
                lgVar = new lg(null);
            }
            List<fg> e10 = e(jgVar, lgVar);
            if (z10 && e10.isEmpty() && i10 >= 21 && i10 <= 23) {
                e10 = e(jgVar, new lg(null));
                if (!e10.isEmpty()) {
                    String str2 = e10.get(0).f4011a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    Log.w("MediaCodecUtil", sb2.toString());
                }
            }
            List<fg> unmodifiableList = Collections.unmodifiableList(e10);
            hashMap.put(jgVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static int c() throws zzarm {
        if (f7762g == -1) {
            int i10 = 0;
            fg a10 = a(MimeTypes.VIDEO_H264, false);
            if (a10 != null) {
                MediaCodecInfo.CodecProfileLevel[] c10 = a10.c();
                int length = c10.length;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = c10[i10].level;
                    int i13 = 9437184;
                    if (i12 == 1 || i12 == 2) {
                        i13 = 25344;
                    } else {
                        switch (i12) {
                            case 8:
                            case 16:
                            case 32:
                                i13 = 101376;
                                continue;
                            case 64:
                                i13 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i13 = 414720;
                                continue;
                            case 512:
                                i13 = 921600;
                                continue;
                            case 1024:
                                i13 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i13 = 2097152;
                                continue;
                            case 8192:
                                i13 = 2228224;
                                continue;
                            case 16384:
                                i13 = 5652480;
                                continue;
                            case 32768:
                            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                                break;
                            default:
                                i13 = -1;
                                continue;
                        }
                    }
                    i11 = Math.max(i13, i11);
                    i10++;
                }
                i10 = Math.max(i11, vj.f11100a >= 21 ? 345600 : 172800);
            }
            f7762g = i10;
        }
        return f7762g;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair<Integer, Integer> d(String str) {
        char c10;
        Integer valueOf;
        Integer valueOf2;
        String[] split = str.split("\\.");
        String str2 = split[0];
        int i10 = 2;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0 && c10 != 1) {
            if (c10 == 2 || c10 == 3) {
                int length = split.length;
                if (length < 2) {
                    Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                try {
                    if (split[1].length() == 6) {
                        valueOf = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                        valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(4), 16));
                    } else if (length >= 3) {
                        valueOf = Integer.valueOf(Integer.parseInt(split[1]));
                        valueOf2 = Integer.valueOf(Integer.parseInt(split[2]));
                    } else {
                        Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                        return null;
                    }
                    return new Pair<>(Integer.valueOf(f7759d.get(valueOf.intValue())), Integer.valueOf(f7760e.get(valueOf2.intValue())));
                } catch (NumberFormatException unused) {
                    Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(str) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
            }
            return null;
        } else if (split.length < 4) {
            Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(str) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        } else {
            Matcher matcher = f7757b.matcher(split[1]);
            if (!matcher.matches()) {
                Log.w("MediaCodecUtil", str.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(str) : new String("Ignoring malformed HEVC codec string: "));
                return null;
            }
            String group = matcher.group(1);
            if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(group)) {
                i10 = 1;
            } else if (!"2".equals(group)) {
                String valueOf3 = String.valueOf(group);
                Log.w("MediaCodecUtil", valueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(valueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            Integer num = f7761f.get(split[3]);
            if (num == null) {
                String valueOf4 = String.valueOf(matcher.group(1));
                Log.w("MediaCodecUtil", valueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(valueOf4) : new String("Unknown HEVC level string: "));
                return null;
            }
            return new Pair<>(Integer.valueOf(i10), num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[Catch: Exception -> 0x01b9, TryCatch #2 {Exception -> 0x01b9, blocks: (B:102:0x0195, B:104:0x019f, B:106:0x01a7, B:108:0x01af, B:115:0x01be, B:120:0x01c7), top: B:153:0x0195 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<ai.fg> e(ai.jg r18, ai.kg r19) throws com.google.android.gms.internal.ads.zzarm {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.og.e(ai.jg, ai.kg):java.util.List");
    }
}
