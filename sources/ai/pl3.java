package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class pl3 {
    public static final String d(ByteBuffer byteBuffer, int i10, int i11) throws zzggm {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = byteBuffer.get(i10);
                if (!ol3.a(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = byteBuffer.get(i10);
                if (ol3.a(b11)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    i10 = i15;
                    while (true) {
                        i14 = i16;
                        if (i10 < i12) {
                            byte b12 = byteBuffer.get(i10);
                            if (!ol3.a(b12)) {
                                break;
                            }
                            i10++;
                            i16 = i14 + 1;
                            cArr[i14] = (char) b12;
                        }
                    }
                } else if (ol3.b(b11)) {
                    if (i15 < i12) {
                        ol3.d(b11, byteBuffer.get(i15), cArr, i14);
                        i10 = i15 + 1;
                        i14++;
                    } else {
                        throw zzggm.l();
                    }
                } else if (ol3.c(b11)) {
                    if (i15 < i12 - 1) {
                        int i17 = i15 + 1;
                        ol3.e(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                        i10 = i17 + 1;
                        i14++;
                    } else {
                        throw zzggm.l();
                    }
                } else if (i15 < i12 - 2) {
                    int i18 = i15 + 1;
                    int i19 = i18 + 1;
                    ol3.f(b11, byteBuffer.get(i15), byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                    i14 += 2;
                    i10 = i19 + 1;
                } else {
                    throw zzggm.l();
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public final boolean a(byte[] bArr, int i10, int i11) {
        return b(0, bArr, i10, i11) == 0;
    }

    public abstract int b(int i10, byte[] bArr, int i11, int i12);

    public abstract String c(byte[] bArr, int i10, int i11) throws zzggm;
}
