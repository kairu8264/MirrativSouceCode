package ai;

import com.google.android.gms.internal.ads.zzggm;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class d73 extends y53<ha3, ea3> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e73 f3168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d73(e73 e73Var, Class cls) {
        super(cls);
        this.f3168b = e73Var;
    }

    public static final ea3 g(ha3 ha3Var) throws GeneralSecurityException {
        da3 F = ea3.F();
        F.s(ha3Var.B());
        F.t(oh3.N(ig3.a(ha3Var.C())));
        F.r(0);
        return F.n();
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ ha3 c(oh3 oh3Var) throws zzggm {
        return ha3.D(oh3Var, di3.a());
    }

    @Override // ai.y53
    public final /* bridge */ /* synthetic */ ea3 d(ha3 ha3Var) throws GeneralSecurityException {
        return g(ha3Var);
    }

    @Override // ai.y53
    /* renamed from: f */
    public final void b(ha3 ha3Var) throws GeneralSecurityException {
        kg3.a(ha3Var.C());
        e73 e73Var = this.f3168b;
        e73.m(ha3Var.B());
    }
}
