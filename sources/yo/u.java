package yo;

import wo.b0;

/* loaded from: classes4.dex */
public final class u<T> implements xo.d<T> {

    /* renamed from: w  reason: collision with root package name */
    public final b0<T> f62139w;

    /* JADX WARN: Multi-variable type inference failed */
    public u(b0<? super T> b0Var) {
        this.f62139w = b0Var;
    }

    @Override // xo.d
    public Object emit(T t10, ao.d<? super wn.v> dVar) {
        Object r10 = this.f62139w.r(t10, dVar);
        return r10 == bo.c.c() ? r10 : wn.v.f59242a;
    }
}
