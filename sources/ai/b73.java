package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class b73 extends a63<y93> {
    public b73() {
        super(y93.class, new z63(m53.class));
    }

    public static /* synthetic */ x53<ba3> k(int i10, int i11, int i12, int i13, int i14, int i15) {
        ga3 E = ha3.E();
        ja3 C = ka3.C();
        C.r(16);
        E.r(C.n());
        E.s(i10);
        xc3 E2 = yc3.E();
        ad3 C2 = bd3.C();
        C2.s(5);
        C2.r(i13);
        E2.r(C2.n());
        E2.s(32);
        aa3 E3 = ba3.E();
        E3.r(E.n());
        E3.s(E2.n());
        return new x53<>(E3.n(), i15);
    }

    @Override // ai.a63
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ y93 c(oh3 oh3Var) throws zzggm {
        return y93.E(oh3Var, di3.a());
    }

    @Override // ai.a63
    public final /* bridge */ /* synthetic */ void d(y93 y93Var) throws GeneralSecurityException {
        y93 y93Var2 = y93Var;
        kg3.b(y93Var2.B(), 0);
        new e73();
        e73.l(y93Var2.C());
        new g93();
        g93.l(y93Var2.D());
    }

    @Override // ai.a63
    public final y53<?, y93> h() {
        return new a73(this, ba3.class);
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
