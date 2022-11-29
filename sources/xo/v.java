package xo;

/* loaded from: classes4.dex */
public final class v<T> extends a<T> {

    /* renamed from: w  reason: collision with root package name */
    public final io.p<d<? super T>, ao.d<? super wn.v>, Object> f60621w;

    /* JADX WARN: Multi-variable type inference failed */
    public v(io.p<? super d<? super T>, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        this.f60621w = pVar;
    }

    @Override // xo.a
    public Object g(d<? super T> dVar, ao.d<? super wn.v> dVar2) {
        Object invoke = this.f60621w.invoke(dVar, dVar2);
        return invoke == bo.c.c() ? invoke : wn.v.f59242a;
    }
}
