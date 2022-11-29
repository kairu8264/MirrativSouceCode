package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class e73 extends a63<ea3> {
    public e73() {
        super(ea3.class, new c73(bg3.class));
    }

    public static final void l(ea3 ea3Var) throws GeneralSecurityException {
        kg3.b(ea3Var.B(), 0);
        kg3.a(ea3Var.D().p());
        m(ea3Var.C());
    }

    public static final void m(ka3 ka3Var) throws GeneralSecurityException {
        if (ka3Var.B() < 12 || ka3Var.B() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ ea3 c(oh3 oh3Var) throws zzggm {
        return ea3.E(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(ea3 ea3Var) throws GeneralSecurityException {
        l(ea3Var);
    }

    @Override // ai.a63
    public final y53<?, ea3> h() {
        return new d73(this, ha3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 3;
    }
}
