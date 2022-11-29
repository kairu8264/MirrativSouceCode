package ak;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class a0 extends r<e> {
    public final l0 A;

    /* renamed from: y  reason: collision with root package name */
    public final t1 f13299y;

    /* renamed from: z  reason: collision with root package name */
    public final i3 f13300z;

    public a0(c0 c0Var, jk.o<e> oVar, t1 t1Var, i3 i3Var, l0 l0Var) {
        super(c0Var, oVar);
        this.f13299y = t1Var;
        this.f13300z = i3Var;
        this.A = l0Var;
    }

    @Override // ak.r, dk.n0
    public final void O1(Bundle bundle, Bundle bundle2) {
        super.O1(bundle, bundle2);
        this.f13609w.e(e.d(bundle, this.f13299y, this.f13300z, this.A));
    }
}
