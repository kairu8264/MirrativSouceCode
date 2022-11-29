package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class k93 implements e63 {

    /* renamed from: a  reason: collision with root package name */
    public final k63<e63> f6128a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f6129b = {0};

    @Override // ai.e63
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        if (this.f6128a.a().d() == 4) {
            return df3.a(this.f6128a.a().b(), this.f6128a.a().a().a(df3.a(bArr, this.f6129b)));
        }
        return df3.a(this.f6128a.a().b(), this.f6128a.a().a().a(bArr));
    }
}
