package ak;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes3.dex */
public final class b0 extends r<e> {
    public final i3 A;

    /* renamed from: y  reason: collision with root package name */
    public final List<String> f13311y;

    /* renamed from: z  reason: collision with root package name */
    public final t1 f13312z;

    public b0(c0 c0Var, jk.o<e> oVar, t1 t1Var, i3 i3Var, List<String> list) {
        super(c0Var, oVar);
        this.f13312z = t1Var;
        this.A = i3Var;
        this.f13311y = list;
    }

    @Override // ak.r, dk.n0
    public final void y5(int i10, Bundle bundle) {
        super.y5(i10, bundle);
        this.f13609w.e(e.e(bundle, this.f13312z, this.A, this.f13311y));
    }
}
