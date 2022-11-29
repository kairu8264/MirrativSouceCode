package ai;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public abstract class ff3 implements bg3 {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4008c = i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a  reason: collision with root package name */
    public int[] f4009a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4010b;

    public ff3(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f4009a = i(bArr);
            this.f4010b = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public static void f(int[] iArr, int[] iArr2) {
        int[] iArr3 = f4008c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void g(int[] iArr) {
        for (int i10 = 0; i10 < 10; i10++) {
            h(iArr, 0, 4, 8, 12);
            h(iArr, 1, 5, 9, 13);
            h(iArr, 2, 6, 10, 14);
            h(iArr, 3, 7, 11, 15);
            h(iArr, 0, 5, 10, 15);
            h(iArr, 1, 6, 11, 12);
            h(iArr, 2, 7, 8, 13);
            h(iArr, 3, 4, 9, 14);
        }
    }

    public static void h(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int i15 = i14 ^ iArr[i13];
        int i16 = (i15 >>> (-16)) | (i15 << 16);
        iArr[i13] = i16;
        int i17 = iArr[i12] + i16;
        iArr[i12] = i17;
        int i18 = iArr[i11] ^ i17;
        int i19 = (i18 >>> (-12)) | (i18 << 12);
        iArr[i11] = i19;
        int i20 = iArr[i10] + i19;
        iArr[i10] = i20;
        int i21 = iArr[i13] ^ i20;
        int i22 = (i21 >>> (-8)) | (i21 << 8);
        iArr[i13] = i22;
        int i23 = iArr[i12] + i22;
        iArr[i12] = i23;
        int i24 = iArr[i11] ^ i23;
        iArr[i11] = (i24 >>> (-7)) | (i24 << 7);
    }

    public static int[] i(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // ai.bg3
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= Integer.MAX_VALUE - c()) {
            ByteBuffer allocate = ByteBuffer.allocate(c() + length);
            d(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public abstract int[] b(int[] iArr, int i10);

    public abstract int c();

    public final void d(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - c() >= bArr.length) {
            byte[] a10 = ig3.a(c());
            byteBuffer.put(a10);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i10 = (remaining / 64) + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                ByteBuffer e10 = e(a10, this.f4010b + i11);
                if (i11 == i10 - 1) {
                    df3.c(byteBuffer, wrap, e10, remaining % 64);
                } else {
                    df3.c(byteBuffer, wrap, e10, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final ByteBuffer e(byte[] bArr, int i10) {
        int[] b10 = b(i(bArr), i10);
        int[] iArr = (int[]) b10.clone();
        g(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            b10[i11] = b10[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b10, 0, 16);
        return order;
    }
}
