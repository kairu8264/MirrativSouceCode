package xo;

import uo.d2;

/* loaded from: classes4.dex */
public final class t<T> implements w<T>, c, yo.n<T> {

    /* renamed from: w  reason: collision with root package name */
    public final d2 f60617w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ w<T> f60618x;

    /* JADX WARN: Multi-variable type inference failed */
    public t(w<? extends T> wVar, d2 d2Var) {
        this.f60617w = d2Var;
        this.f60618x = wVar;
    }

    @Override // xo.w, xo.c
    public Object a(d<? super T> dVar, ao.d<?> dVar2) {
        return this.f60618x.a(dVar, dVar2);
    }

    @Override // yo.n
    public c<T> d(ao.g gVar, int i10, wo.h hVar) {
        return y.e(this, gVar, i10, hVar);
    }
}
