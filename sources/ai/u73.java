package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class u73 extends a63<yd3> {
    public u73() {
        super(yd3.class, new s73(m53.class));
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ yd3 c(oh3 oh3Var) throws zzggm {
        return yd3.D(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(yd3 yd3Var) throws GeneralSecurityException {
        kg3.b(yd3Var.B(), 0);
    }

    @Override // ai.a63
    public final y53<?, yd3> h() {
        return new t73(this, be3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 6;
    }
}
