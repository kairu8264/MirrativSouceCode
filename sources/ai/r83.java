package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class r83 extends a63<jc3> {
    public r83() {
        super(jc3.class, new q83(r53.class));
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ jc3 c(oh3 oh3Var) throws zzggm {
        return jc3.F(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(jc3 jc3Var) throws GeneralSecurityException {
        jc3 jc3Var2 = jc3Var;
        kg3.b(jc3Var2.B(), 0);
        y83.a(jc3Var2.C());
    }

    @Override // ai.a63
    public final int i() {
        return 5;
    }
}
