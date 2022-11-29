package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class a93 {

    /* renamed from: a  reason: collision with root package name */
    public final m53 f1791a;

    /* renamed from: b  reason: collision with root package name */
    public final p53 f1792b;

    public a93(m53 m53Var) {
        this.f1791a = m53Var;
        this.f1792b = null;
    }

    public a93(p53 p53Var) {
        this.f1791a = null;
        this.f1792b = p53Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        m53 m53Var = this.f1791a;
        return m53Var != null ? m53Var.a(bArr, bArr2) : this.f1792b.a(bArr, bArr2);
    }
}
