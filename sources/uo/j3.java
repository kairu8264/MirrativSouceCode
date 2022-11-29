package uo;

import ao.g;

/* loaded from: classes4.dex */
public final class j3 implements g.b, g.c<j3> {

    /* renamed from: w  reason: collision with root package name */
    public static final j3 f56037w = new j3();

    @Override // ao.g
    public <R> R fold(R r10, io.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // ao.g.b, ao.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // ao.g.b
    public g.c<?> getKey() {
        return this;
    }

    @Override // ao.g
    public ao.g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // ao.g
    public ao.g plus(ao.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
