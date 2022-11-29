package hi;

import com.google.android.gms.internal.measurement.zzkh;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class i7 {
    public static int a(byte[] bArr, int i10, h7 h7Var) throws zzkh {
        int j10 = j(bArr, i10, h7Var);
        int i11 = h7Var.f35799a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - j10) {
                if (i11 == 0) {
                    h7Var.f35801c = u7.f36014x;
                    return j10;
                }
                h7Var.f35801c = u7.t(bArr, j10, i11);
                return j10 + i11;
            }
            throw zzkh.f();
        }
        throw zzkh.d();
    }

    public static int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED) << 24) | (bArr[i10] & TagConstant.TAG_CAT_RESERVED) | ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 8) | ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 16);
    }

    public static int c(ha haVar, byte[] bArr, int i10, int i11, int i12, h7 h7Var) throws IOException {
        z9 z9Var = (z9) haVar;
        Object c10 = z9Var.c();
        int D = z9Var.D(c10, bArr, i10, i11, i12, h7Var);
        z9Var.d(c10);
        h7Var.f35801c = c10;
        return D;
    }

    public static int d(ha haVar, byte[] bArr, int i10, int i11, h7 h7Var) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = k(i13, bArr, i12, h7Var);
            i13 = h7Var.f35799a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            Object c10 = haVar.c();
            int i15 = i13 + i14;
            haVar.h(c10, bArr, i14, i15, h7Var);
            haVar.d(c10);
            h7Var.f35801c = c10;
            return i15;
        }
        throw zzkh.f();
    }

    public static int e(ha<?> haVar, int i10, byte[] bArr, int i11, int i12, a9<?> a9Var, h7 h7Var) throws IOException {
        int d10 = d(haVar, bArr, i11, i12, h7Var);
        a9Var.add(h7Var.f35801c);
        while (d10 < i12) {
            int j10 = j(bArr, d10, h7Var);
            if (i10 != h7Var.f35799a) {
                break;
            }
            d10 = d(haVar, bArr, j10, i12, h7Var);
            a9Var.add(h7Var.f35801c);
        }
        return d10;
    }

    public static int f(byte[] bArr, int i10, a9<?> a9Var, h7 h7Var) throws IOException {
        u8 u8Var = (u8) a9Var;
        int j10 = j(bArr, i10, h7Var);
        int i11 = h7Var.f35799a + j10;
        while (j10 < i11) {
            j10 = j(bArr, j10, h7Var);
            u8Var.c0(h7Var.f35799a);
        }
        if (j10 == i11) {
            return j10;
        }
        throw zzkh.f();
    }

    public static int g(byte[] bArr, int i10, h7 h7Var) throws zzkh {
        int j10 = j(bArr, i10, h7Var);
        int i11 = h7Var.f35799a;
        if (i11 >= 0) {
            if (i11 == 0) {
                h7Var.f35801c = "";
                return j10;
            }
            h7Var.f35801c = new String(bArr, j10, i11, b9.f35664b);
            return j10 + i11;
        }
        throw zzkh.d();
    }

    public static int h(byte[] bArr, int i10, h7 h7Var) throws zzkh {
        int j10 = j(bArr, i10, h7Var);
        int i11 = h7Var.f35799a;
        if (i11 >= 0) {
            if (i11 == 0) {
                h7Var.f35801c = "";
                return j10;
            }
            h7Var.f35801c = kb.d(bArr, j10, i11);
            return j10 + i11;
        }
        throw zzkh.d();
    }

    public static int i(int i10, byte[] bArr, int i11, int i12, wa waVar, h7 h7Var) throws zzkh {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int m10 = m(bArr, i11, h7Var);
                waVar.h(i10, Long.valueOf(h7Var.f35800b));
                return m10;
            } else if (i13 == 1) {
                waVar.h(i10, Long.valueOf(n(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int j10 = j(bArr, i11, h7Var);
                int i14 = h7Var.f35799a;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - j10) {
                        if (i14 == 0) {
                            waVar.h(i10, u7.f36014x);
                        } else {
                            waVar.h(i10, u7.t(bArr, j10, i14));
                        }
                        return j10 + i14;
                    }
                    throw zzkh.f();
                }
                throw zzkh.d();
            } else if (i13 != 3) {
                if (i13 == 5) {
                    waVar.h(i10, Integer.valueOf(b(bArr, i11)));
                    return i11 + 4;
                }
                throw zzkh.b();
            } else {
                int i15 = (i10 & (-8)) | 4;
                wa e10 = wa.e();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int j11 = j(bArr, i11, h7Var);
                    int i17 = h7Var.f35799a;
                    if (i17 == i15) {
                        i16 = i17;
                        i11 = j11;
                        break;
                    }
                    i16 = i17;
                    i11 = i(i17, bArr, j11, i12, e10, h7Var);
                }
                if (i11 <= i12 && i16 == i15) {
                    waVar.h(i10, e10);
                    return i11;
                }
                throw zzkh.e();
            }
        }
        throw zzkh.b();
    }

    public static int j(byte[] bArr, int i10, h7 h7Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            h7Var.f35799a = b10;
            return i11;
        }
        return k(b10, bArr, i11, h7Var);
    }

    public static int k(int i10, byte[] bArr, int i11, h7 h7Var) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            h7Var.f35799a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            h7Var.f35799a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            h7Var.f35799a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            h7Var.f35799a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                h7Var.f35799a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, a9<?> a9Var, h7 h7Var) {
        u8 u8Var = (u8) a9Var;
        int j10 = j(bArr, i11, h7Var);
        u8Var.c0(h7Var.f35799a);
        while (j10 < i12) {
            int j11 = j(bArr, j10, h7Var);
            if (i10 != h7Var.f35799a) {
                break;
            }
            j10 = j(bArr, j11, h7Var);
            u8Var.c0(h7Var.f35799a);
        }
        return j10;
    }

    public static int m(byte[] bArr, int i10, h7 h7Var) {
        byte b10;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            h7Var.f35800b = j10;
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
        h7Var.f35800b = j11;
        return i12;
    }

    public static long n(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
