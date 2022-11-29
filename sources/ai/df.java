package ai;

import com.google.android.gms.internal.ads.zzanp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class df {
    public boolean L;
    public ve O;
    public int P;

    /* renamed from: a */
    public String f3235a;

    /* renamed from: b */
    public int f3236b;

    /* renamed from: c */
    public int f3237c;

    /* renamed from: d */
    public int f3238d;

    /* renamed from: e */
    public boolean f3239e;

    /* renamed from: f */
    public byte[] f3240f;

    /* renamed from: g */
    public ue f3241g;

    /* renamed from: h */
    public byte[] f3242h;

    /* renamed from: i */
    public ie f3243i;

    /* renamed from: j */
    public int f3244j = -1;

    /* renamed from: k */
    public int f3245k = -1;

    /* renamed from: l */
    public int f3246l = -1;

    /* renamed from: m */
    public int f3247m = -1;

    /* renamed from: n */
    public int f3248n = 0;

    /* renamed from: o */
    public byte[] f3249o = null;

    /* renamed from: p */
    public int f3250p = -1;

    /* renamed from: q */
    public boolean f3251q = false;

    /* renamed from: r */
    public int f3252r = -1;

    /* renamed from: s */
    public int f3253s = -1;

    /* renamed from: t */
    public int f3254t = -1;

    /* renamed from: u */
    public int f3255u = 1000;

    /* renamed from: v */
    public int f3256v = 200;

    /* renamed from: w */
    public float f3257w = -1.0f;

    /* renamed from: x */
    public float f3258x = -1.0f;

    /* renamed from: y */
    public float f3259y = -1.0f;

    /* renamed from: z */
    public float f3260z = -1.0f;
    public float A = -1.0f;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public int G = 1;
    public int H = -1;
    public int I = 8000;
    public long J = 0;
    public long K = 0;
    public boolean M = true;
    public String N = "eng";

    public df() {
    }

    public /* synthetic */ df(cf cfVar) {
    }

    public static List<byte[]> c(nj njVar) throws zzanp {
        try {
            njVar.j(16);
            if (njVar.q() != 826496599) {
                return null;
            }
            int g10 = njVar.g() + 20;
            byte[] bArr = njVar.f7359a;
            while (true) {
                int length = bArr.length;
                if (g10 < length - 4) {
                    if (bArr[g10] == 0 && bArr[g10 + 1] == 0 && bArr[g10 + 2] == 1 && bArr[g10 + 3] == 15) {
                        return Collections.singletonList(Arrays.copyOfRange(bArr, g10, length));
                    }
                    g10++;
                } else {
                    throw new zzanp("Failed to find FourCC VC1 initialization data");
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzanp("Error parsing FourCC VC1 codec private");
        }
    }

    public static List<byte[]> d(byte[] bArr) throws zzanp {
        int i10;
        int i11;
        try {
            if (bArr[0] == 2) {
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if (i10 != -1) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + i10;
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if (i11 != -1) {
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
                        throw new zzanp("Error parsing vorbis codec private");
                    }
                    throw new zzanp("Error parsing vorbis codec private");
                }
                throw new zzanp("Error parsing vorbis codec private");
            }
            throw new zzanp("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzanp("Error parsing vorbis codec private");
        }
    }

    public static boolean e(nj njVar) throws zzanp {
        UUID uuid;
        UUID uuid2;
        try {
            int n10 = njVar.n();
            if (n10 == 1) {
                return true;
            }
            if (n10 == 65534) {
                njVar.i(24);
                long s10 = njVar.s();
                uuid = ef.f3623c0;
                if (s10 == uuid.getMostSignificantBits()) {
                    long s11 = njVar.s();
                    uuid2 = ef.f3623c0;
                    if (s11 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzanp("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(ai.ne r44, int r45) throws com.google.android.gms.internal.ads.zzanp {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.df.b(ai.ne, int):void");
    }
}
