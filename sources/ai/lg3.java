package ai;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lg3 extends ff3 {
    public lg3(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    @Override // ai.ff3
    public final int[] b(int[] iArr, int i10) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            ff3.f(r0, this.f4009a);
            int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            ff3.g(iArr3);
            ff3.f(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i10;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }

    @Override // ai.ff3
    public final int c() {
        return 24;
    }
}
