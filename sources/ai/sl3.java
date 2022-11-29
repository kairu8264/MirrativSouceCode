package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class sl3 {

    /* renamed from: a  reason: collision with root package name */
    public static final pl3 f9877a;

    static {
        if (nl3.i() && nl3.j()) {
            int i10 = zg3.f12988a;
        }
        f9877a = new ql3();
    }

    public static boolean a(byte[] bArr) {
        return f9877a.a(bArr, 0, bArr.length);
    }

    public static boolean b(byte[] bArr, int i10, int i11) {
        return f9877a.a(bArr, i10, i11);
    }

    public static int c(int i10, byte[] bArr, int i11, int i12) {
        return f9877a.b(i10, bArr, i11, i12);
    }

    public static /* synthetic */ int f(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        } else if (i12 != 1) {
            if (i12 == 2) {
                return l(b10, bArr[i10], bArr[i10 + 1]);
            }
            throw new AssertionError();
        } else {
            return k(b10, bArr[i10]);
        }
    }

    public static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new rl3(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.sl3.h(java.lang.CharSequence, byte[], int, int):int");
    }

    public static String i(ByteBuffer byteBuffer, int i10, int i11) throws zzggm {
        pl3 pl3Var = f9877a;
        if (byteBuffer.hasArray()) {
            return pl3Var.c(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        } else if (byteBuffer.isDirect()) {
            return pl3.d(byteBuffer, i10, i11);
        } else {
            return pl3.d(byteBuffer, i10, i11);
        }
    }

    public static String j(byte[] bArr, int i10, int i11) throws zzggm {
        return f9877a.c(bArr, i10, i11);
    }

    public static int k(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int l(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
