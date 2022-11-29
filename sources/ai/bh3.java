package ai;

import com.google.android.gms.internal.ads.zzggm;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class bh3 {
    public static int a(byte[] bArr, int i10, ah3 ah3Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            ah3Var.f1853a = b10;
            return i11;
        }
        return b(b10, bArr, i11, ah3Var);
    }

    public static int b(int i10, byte[] bArr, int i11, ah3 ah3Var) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            ah3Var.f1853a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            ah3Var.f1853a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            ah3Var.f1853a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            ah3Var.f1853a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                ah3Var.f1853a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int c(byte[] bArr, int i10, ah3 ah3Var) {
        byte b10;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            ah3Var.f1854b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        long j11 = (j10 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        ah3Var.f1854b = j11;
        return i12;
    }

    public static int d(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED) << 24) | (bArr[i10] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 8) | ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 16);
    }

    public static long e(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int f(byte[] bArr, int i10, ah3 ah3Var) throws zzggm {
        int a10 = a(bArr, i10, ah3Var);
        int i11 = ah3Var.f1853a;
        if (i11 >= 0) {
            if (i11 == 0) {
                ah3Var.f1855c = "";
                return a10;
            }
            ah3Var.f1855c = new String(bArr, a10, i11, bj3.f2374a);
            return a10 + i11;
        }
        throw zzggm.e();
    }

    public static int g(byte[] bArr, int i10, ah3 ah3Var) throws zzggm {
        int a10 = a(bArr, i10, ah3Var);
        int i11 = ah3Var.f1853a;
        if (i11 >= 0) {
            if (i11 == 0) {
                ah3Var.f1855c = "";
                return a10;
            }
            ah3Var.f1855c = sl3.j(bArr, a10, i11);
            return a10 + i11;
        }
        throw zzggm.e();
    }

    public static int h(byte[] bArr, int i10, ah3 ah3Var) throws zzggm {
        int a10 = a(bArr, i10, ah3Var);
        int i11 = ah3Var.f1853a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - a10) {
                if (i11 == 0) {
                    ah3Var.f1855c = oh3.f7807x;
                    return a10;
                }
                ah3Var.f1855c = oh3.M(bArr, a10, i11);
                return a10 + i11;
            }
            throw zzggm.d();
        }
        throw zzggm.e();
    }

    public static int i(ok3 ok3Var, byte[] bArr, int i10, int i11, ah3 ah3Var) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = b(i13, bArr, i12, ah3Var);
            i13 = ah3Var.f1853a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            Object zza = ok3Var.zza();
            int i15 = i13 + i14;
            ok3Var.i(zza, bArr, i14, i15, ah3Var);
            ok3Var.e(zza);
            ah3Var.f1855c = zza;
            return i15;
        }
        throw zzggm.d();
    }

    public static int j(ok3 ok3Var, byte[] bArr, int i10, int i11, int i12, ah3 ah3Var) throws IOException {
        ak3 ak3Var = (ak3) ok3Var;
        Object zza = ak3Var.zza();
        int I = ak3Var.I(zza, bArr, i10, i11, i12, ah3Var);
        ak3Var.e(zza);
        ah3Var.f1855c = zza;
        return I;
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, aj3<?> aj3Var, ah3 ah3Var) {
        si3 si3Var = (si3) aj3Var;
        int a10 = a(bArr, i11, ah3Var);
        si3Var.c0(ah3Var.f1853a);
        while (a10 < i12) {
            int a11 = a(bArr, a10, ah3Var);
            if (i10 != ah3Var.f1853a) {
                break;
            }
            a10 = a(bArr, a11, ah3Var);
            si3Var.c0(ah3Var.f1853a);
        }
        return a10;
    }

    public static int l(byte[] bArr, int i10, aj3<?> aj3Var, ah3 ah3Var) throws IOException {
        si3 si3Var = (si3) aj3Var;
        int a10 = a(bArr, i10, ah3Var);
        int i11 = ah3Var.f1853a + a10;
        while (a10 < i11) {
            a10 = a(bArr, a10, ah3Var);
            si3Var.c0(ah3Var.f1853a);
        }
        if (a10 == i11) {
            return a10;
        }
        throw zzggm.d();
    }

    public static int m(ok3<?> ok3Var, int i10, byte[] bArr, int i11, int i12, aj3<?> aj3Var, ah3 ah3Var) throws IOException {
        int i13 = i(ok3Var, bArr, i11, i12, ah3Var);
        aj3Var.add(ah3Var.f1855c);
        while (i13 < i12) {
            int a10 = a(bArr, i13, ah3Var);
            if (i10 != ah3Var.f1853a) {
                break;
            }
            i13 = i(ok3Var, bArr, a10, i12, ah3Var);
            aj3Var.add(ah3Var.f1855c);
        }
        return i13;
    }

    public static int n(int i10, byte[] bArr, int i11, int i12, el3 el3Var, ah3 ah3Var) throws zzggm {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int c10 = c(bArr, i11, ah3Var);
                el3Var.h(i10, Long.valueOf(ah3Var.f1854b));
                return c10;
            } else if (i13 == 1) {
                el3Var.h(i10, Long.valueOf(e(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int a10 = a(bArr, i11, ah3Var);
                int i14 = ah3Var.f1853a;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - a10) {
                        if (i14 == 0) {
                            el3Var.h(i10, oh3.f7807x);
                        } else {
                            el3Var.h(i10, oh3.M(bArr, a10, i14));
                        }
                        return a10 + i14;
                    }
                    throw zzggm.d();
                }
                throw zzggm.e();
            } else if (i13 != 3) {
                if (i13 == 5) {
                    el3Var.h(i10, Integer.valueOf(d(bArr, i11)));
                    return i11 + 4;
                }
                throw zzggm.g();
            } else {
                int i15 = (i10 & (-8)) | 4;
                el3 b10 = el3.b();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int a11 = a(bArr, i11, ah3Var);
                    int i17 = ah3Var.f1853a;
                    if (i17 == i15) {
                        i16 = i17;
                        i11 = a11;
                        break;
                    }
                    i16 = i17;
                    i11 = n(i17, bArr, a11, i12, b10, ah3Var);
                }
                if (i11 <= i12 && i16 == i15) {
                    el3Var.h(i10, b10);
                    return i11;
                }
                throw zzggm.k();
            }
        }
        throw zzggm.g();
    }
}
