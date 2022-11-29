package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class l83 implements p53 {

    /* renamed from: a  reason: collision with root package name */
    public final k63<p53> f6498a;

    public l83(k63<p53> k63Var) {
        this.f6498a = k63Var;
    }

    @Override // ai.p53
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return df3.a(this.f6498a.a().b(), this.f6498a.a().a().a(bArr, bArr2));
    }
}
