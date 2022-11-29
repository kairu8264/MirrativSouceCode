package ai;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class gf3 extends hf3 {
    public gf3(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // ai.hf3
    public final ff3 b(byte[] bArr, int i10) throws InvalidKeyException {
        return new ef3(bArr, i10);
    }
}
