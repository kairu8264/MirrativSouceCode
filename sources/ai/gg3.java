package ai;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class gg3 implements e63 {

    /* renamed from: a  reason: collision with root package name */
    public final m93 f4433a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4434b;

    public gg3(m93 m93Var, int i10) throws GeneralSecurityException {
        this.f4433a = m93Var;
        this.f4434b = i10;
        if (i10 >= 10) {
            m93Var.a(new byte[0], i10);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // ai.e63
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        return this.f4433a.a(bArr, this.f4434b);
    }
}
