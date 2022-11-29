package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class d93 extends a63<p93> {
    public d93() {
        super(p93.class, new b93(e63.class));
    }

    public static void m(v93 v93Var) throws GeneralSecurityException {
        if (v93Var.B() >= 10) {
            if (v93Var.B() > 16) {
                throw new GeneralSecurityException("tag size too long");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too short");
    }

    public static void n(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ p93 c(oh3 oh3Var) throws zzggm {
        return p93.E(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(p93 p93Var) throws GeneralSecurityException {
        p93 p93Var2 = p93Var;
        kg3.b(p93Var2.B(), 0);
        n(p93Var2.C().p());
        m(p93Var2.D());
    }

    @Override // ai.a63
    public final y53<?, p93> h() {
        return new c93(this, s93.class);
    }

    @Override // ai.a63
    public final int i() {
        return 3;
    }
}
