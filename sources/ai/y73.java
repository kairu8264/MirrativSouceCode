package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class y73 extends a63<ee3> {
    public y73() {
        super(ee3.class, new w73(m53.class));
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ ee3 c(oh3 oh3Var) throws zzggm {
        return ee3.D(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(ee3 ee3Var) throws GeneralSecurityException {
        kg3.b(ee3Var.B(), 0);
    }

    @Override // ai.a63
    public final y53<?, ee3> h() {
        return new x73(this, he3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 6;
    }
}
