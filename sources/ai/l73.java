package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class l73 extends a63<wa3> {
    public l73() {
        super(wa3.class, new j73(m53.class));
    }

    public static /* synthetic */ x53<za3> k(int i10, int i11) {
        ya3 D = za3.D();
        D.r(i10);
        return new x53<>(D.n(), i11);
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ wa3 c(oh3 oh3Var) throws zzggm {
        return wa3.D(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(wa3 wa3Var) throws GeneralSecurityException {
        wa3 wa3Var2 = wa3Var;
        kg3.b(wa3Var2.B(), 0);
        kg3.a(wa3Var2.C().p());
    }

    @Override // ai.a63
    public final y53<?, wa3> h() {
        return new k73(this, za3.class);
    }

    @Override // ai.a63
    public final int i() {
        return 3;
    }

    @Override // ai.a63
    public final int j() {
        return 2;
    }
}
