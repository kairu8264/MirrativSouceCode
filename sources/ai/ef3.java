package ai;

import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class ef3 extends ff3 {
    public ef3(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    @Override // ai.ff3
    public final int[] b(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            ff3.f(iArr2, this.f4009a);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }

    @Override // ai.ff3
    public final int c() {
        return 12;
    }
}
