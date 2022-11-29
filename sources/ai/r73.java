package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class r73 extends a63<pb3> {
    public r73() {
        super(pb3.class, new p73(m53.class));
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ pb3 c(oh3 oh3Var) throws zzggm {
        return pb3.D(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(pb3 pb3Var) throws GeneralSecurityException {
        pb3 pb3Var2 = pb3Var;
        kg3.b(pb3Var2.B(), 0);
        if (pb3Var2.C().p() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // ai.a63
    public final y53<?, pb3> h() {
        return new q73(this, sb3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 3;
    }
}
