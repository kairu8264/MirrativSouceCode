package t;

import q1.x;
import x0.f;

/* loaded from: classes.dex */
public abstract class v implements q1.x {
    @Override // x0.f
    public x0.f L(x0.f fVar) {
        return x.a.h(this, fVar);
    }

    @Override // q1.x
    public final int d(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.G(i10);
    }

    @Override // x0.f.b, x0.f
    public boolean e(io.l<? super f.b, Boolean> lVar) {
        return x.a.a(this, lVar);
    }

    @Override // q1.x
    public final int h(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.u(i10);
    }

    @Override // x0.f.b, x0.f
    public <R> R k(R r10, io.p<? super R, ? super f.b, ? extends R> pVar) {
        return (R) x.a.b(this, r10, pVar);
    }

    @Override // x0.f.b, x0.f
    public <R> R o(R r10, io.p<? super f.b, ? super R, ? extends R> pVar) {
        return (R) x.a.c(this, r10, pVar);
    }

    @Override // q1.x
    public final int u(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.e(i10);
    }

    @Override // q1.x
    public final int w(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.E(i10);
    }
}
