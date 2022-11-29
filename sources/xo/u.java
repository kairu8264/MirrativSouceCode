package xo;

import uo.d2;

/* loaded from: classes4.dex */
public final class u<T> implements g0<T>, c, yo.n<T> {

    /* renamed from: w  reason: collision with root package name */
    public final d2 f60619w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ g0<T> f60620x;

    /* JADX WARN: Multi-variable type inference failed */
    public u(g0<? extends T> g0Var, d2 d2Var) {
        this.f60619w = d2Var;
        this.f60620x = g0Var;
    }

    @Override // xo.w, xo.c
    public Object a(d<? super T> dVar, ao.d<?> dVar2) {
        return this.f60620x.a(dVar, dVar2);
    }

    @Override // yo.n
    public c<T> d(ao.g gVar, int i10, wo.h hVar) {
        return i0.d(this, gVar, i10, hVar);
    }

    @Override // xo.g0
    public T getValue() {
        return this.f60620x.getValue();
    }
}
