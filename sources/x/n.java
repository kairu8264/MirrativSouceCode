package x;

import wn.v;
import xo.y;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public final xo.r<j> f59318a = y.b(0, 16, wo.h.DROP_OLDEST, 1, null);

    @Override // x.m
    public boolean a(j jVar) {
        jo.p.h(jVar, "interaction");
        return c().b(jVar);
    }

    @Override // x.m
    public Object b(j jVar, ao.d<? super v> dVar) {
        Object emit = c().emit(jVar, dVar);
        return emit == bo.c.c() ? emit : v.f59242a;
    }

    @Override // x.k
    /* renamed from: d */
    public xo.r<j> c() {
        return this.f59318a;
    }
}
