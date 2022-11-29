package ai;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class df3 {
    public static byte[] a(byte[]... bArr) throws GeneralSecurityException {
        int i10 = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (i10 > Integer.MAX_VALUE - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i10 += length;
        }
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, i11, length2);
            i11 += length2;
        }
        return bArr3;
    }

    public static final byte[] b(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (bArr.length - i12 >= i10 && bArr2.length - i12 >= i11) {
            byte[] bArr3 = new byte[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return b(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
}
