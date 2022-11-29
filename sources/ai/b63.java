package ai;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class b63 {

    /* renamed from: a  reason: collision with root package name */
    public final qd3 f2257a;

    public b63(qd3 qd3Var) {
        this.f2257a = qd3Var;
    }

    public static final b63 a(qd3 qd3Var) throws GeneralSecurityException {
        if (qd3Var != null && qd3Var.D() > 0) {
            return new b63(qd3Var);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <P> P b(Class<P> cls) throws GeneralSecurityException {
        Class<?> n10 = t63.n(cls);
        if (n10 == null) {
            String name = cls.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        }
        u63.b(this.f2257a);
        k63 b10 = k63.b(n10);
        for (pd3 pd3Var : this.f2257a.C()) {
            if (pd3Var.F() == 3) {
                h63 d10 = b10.d(t63.k(pd3Var.C(), n10), pd3Var);
                if (pd3Var.D() == this.f2257a.B()) {
                    b10.c(d10);
                }
            }
        }
        return (P) t63.l(b10, cls);
    }

    public final String toString() {
        return u63.a(this.f2257a).toString();
    }
}
