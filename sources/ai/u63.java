package ai;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class u63 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f10617a = Charset.forName(C.UTF8_NAME);

    public static vd3 a(qd3 qd3Var) {
        sd3 B = vd3.B();
        B.r(qd3Var.B());
        for (pd3 pd3Var : qd3Var.C()) {
            td3 B2 = ud3.B();
            B2.r(pd3Var.C().B());
            B2.t(pd3Var.F());
            B2.u(pd3Var.G());
            B2.s(pd3Var.D());
            B.s(B2.n());
        }
        return B.n();
    }

    public static void b(qd3 qd3Var) throws GeneralSecurityException {
        int B = qd3Var.B();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (pd3 pd3Var : qd3Var.C()) {
            if (pd3Var.F() == 3) {
                if (pd3Var.B()) {
                    if (pd3Var.G() != 2) {
                        if (pd3Var.F() != 2) {
                            if (pd3Var.D() == B) {
                                if (z10) {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                                z10 = true;
                            }
                            z11 &= pd3Var.C().I() == 5;
                            i10++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(pd3Var.D())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(pd3Var.D())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(pd3Var.D())));
                }
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
