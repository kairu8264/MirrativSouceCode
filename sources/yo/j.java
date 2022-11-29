package yo;

import ao.g;

/* loaded from: classes4.dex */
public final class j implements ao.g {

    /* renamed from: w  reason: collision with root package name */
    public final Throwable f62124w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ao.g f62125x;

    public j(Throwable th2, ao.g gVar) {
        this.f62124w = th2;
        this.f62125x = gVar;
    }

    @Override // ao.g
    public <R> R fold(R r10, io.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) this.f62125x.fold(r10, pVar);
    }

    @Override // ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) this.f62125x.get(cVar);
    }

    @Override // ao.g
    public ao.g minusKey(g.c<?> cVar) {
        return this.f62125x.minusKey(cVar);
    }

    @Override // ao.g
    public ao.g plus(ao.g gVar) {
        return this.f62125x.plus(gVar);
    }
}
