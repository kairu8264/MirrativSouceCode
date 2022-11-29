package ai;

import ai.d41;
import ai.u01;

/* loaded from: classes3.dex */
public final class wh2<R extends d41<AdT>, AdT extends u01> implements eo2<R, AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final ti2<R, tn2<R, AdT>> f11626a;

    public wh2(ti2<R, tn2<R, AdT>> ti2Var) {
        this.f11626a = ti2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ai.eo2
    public final s43<tn2<R, AdT>> a(fo2<R, AdT> fo2Var) {
        xh2 xh2Var = (xh2) fo2Var;
        return ((th2) this.f11626a).c(xh2Var.f11937b, xh2Var.f11936a, null);
    }

    @Override // ai.eo2
    public final void b(tn2<R, AdT> tn2Var) {
        tn2Var.f10355a = (R) ((th2) this.f11626a).b();
    }
}
