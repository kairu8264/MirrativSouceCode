package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class b83 extends a63<qe3> {
    public b83() {
        super(qe3.class, new z73(m53.class));
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ qe3 c(oh3 oh3Var) throws zzggm {
        return qe3.D(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(qe3 qe3Var) throws GeneralSecurityException {
        qe3 qe3Var2 = qe3Var;
        kg3.b(qe3Var2.B(), 0);
        if (qe3Var2.C().p() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // ai.a63
    public final y53<?, qe3> h() {
        return new a83(this, te3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 3;
    }
}
