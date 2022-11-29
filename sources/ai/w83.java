package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class w83 implements r53 {

    /* renamed from: a  reason: collision with root package name */
    public final k63<r53> f11513a;

    public w83(k63<r53> k63Var) {
        this.f11513a = k63Var;
    }

    @Override // ai.r53
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return df3.a(this.f11513a.a().b(), this.f11513a.a().a().a(bArr, bArr2));
    }
}
