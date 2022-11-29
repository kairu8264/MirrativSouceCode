package ai;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.internal.ads.zzaha;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public final class zx3 {
    public byte[] N;
    public ay3 T;
    public boolean U;
    public pw3 X;
    public int Y;

    /* renamed from: a */
    public String f13248a;

    /* renamed from: b */
    public String f13249b;

    /* renamed from: c */
    public int f13250c;

    /* renamed from: d */
    public int f13251d;

    /* renamed from: e */
    public int f13252e;

    /* renamed from: f */
    public int f13253f;

    /* renamed from: g */
    public int f13254g;

    /* renamed from: h */
    public boolean f13255h;

    /* renamed from: i */
    public byte[] f13256i;

    /* renamed from: j */
    public ow3 f13257j;

    /* renamed from: k */
    public byte[] f13258k;

    /* renamed from: l */
    public ru3 f13259l;

    /* renamed from: m */
    public int f13260m = -1;

    /* renamed from: n */
    public int f13261n = -1;

    /* renamed from: o */
    public int f13262o = -1;

    /* renamed from: p */
    public int f13263p = -1;

    /* renamed from: q */
    public int f13264q = 0;

    /* renamed from: r */
    public int f13265r = -1;

    /* renamed from: s */
    public float f13266s = 0.0f;

    /* renamed from: t */
    public float f13267t = 0.0f;

    /* renamed from: u */
    public float f13268u = 0.0f;

    /* renamed from: v */
    public byte[] f13269v = null;

    /* renamed from: w */
    public int f13270w = -1;

    /* renamed from: x */
    public boolean f13271x = false;

    /* renamed from: y */
    public int f13272y = -1;

    /* renamed from: z */
    public int f13273z = -1;
    public int A = -1;
    public int B = 1000;
    public int C = 200;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public int O = 1;
    public int P = -1;
    public int Q = 8000;
    public long R = 0;
    public long S = 0;
    public boolean V = true;
    public String W = "eng";

    public zx3() {
    }

    public /* synthetic */ zx3(yx3 yx3Var) {
    }

    public static Pair<String, List<byte[]>> f(hb hbVar) throws zzaha {
        try {
            hbVar.s(16);
            long C = hbVar.C();
            if (C == 1482049860) {
                return new Pair<>(MimeTypes.VIDEO_DIVX, null);
            }
            if (C == 859189832) {
                return new Pair<>(MimeTypes.VIDEO_H263, null);
            }
            if (C != 826496599) {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
            }
            int o10 = hbVar.o() + 20;
            byte[] q10 = hbVar.q();
            while (true) {
                int length = q10.length;
                if (o10 < length - 4) {
                    if (q10[o10] == 0 && q10[o10 + 1] == 0 && q10[o10 + 2] == 1 && q10[o10 + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(q10, o10, length)));
                    }
                    o10++;
                } else {
                    throw zzaha.b("Failed to find FourCC VC1 initialization data", null);
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaha.b("Error parsing FourCC private data", null);
        }
    }

    public static List<byte[]> g(byte[] bArr) throws zzaha {
        int i10;
        int i11;
        try {
            if (bArr[0] == 2) {
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13] & 255;
                    if (i10 != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + i10;
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14] & 255;
                    if (i11 != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + i11;
                if (bArr[i17] == 1) {
                    byte[] bArr2 = new byte[i15];
                    System.arraycopy(bArr, i17, bArr2, 0, i15);
                    int i19 = i17 + i15;
                    if (bArr[i19] == 3) {
                        int i20 = i19 + i18;
                        if (bArr[i20] == 5) {
                            int length = bArr.length - i20;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i20, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzaha.b("Error parsing vorbis codec private", null);
                    }
                    throw zzaha.b("Error parsing vorbis codec private", null);
                }
                throw zzaha.b("Error parsing vorbis codec private", null);
            }
            throw zzaha.b("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaha.b("Error parsing vorbis codec private", null);
        }
    }

    public static boolean h(hb hbVar) throws zzaha {
        UUID uuid;
        UUID uuid2;
        try {
            int x10 = hbVar.x();
            if (x10 == 1) {
                return true;
            }
            if (x10 == 65534) {
                hbVar.p(24);
                long F = hbVar.F();
                uuid = by3.f2597f0;
                if (F == uuid.getMostSignificantBits()) {
                    long F2 = hbVar.F();
                    uuid2 = by3.f2597f0;
                    if (F2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaha.b("Error parsing MS/ACM codec private", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0582  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(ai.pv3 r21, int r22) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 1674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.zx3.d(ai.pv3, int):void");
    }

    @EnsuresNonNull({"codecPrivate"})
    public final byte[] i(String str) throws zzaha {
        byte[] bArr = this.f13258k;
        if (bArr == null) {
            String valueOf = String.valueOf(str);
            throw zzaha.b(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), null);
        }
        return bArr;
    }
}
