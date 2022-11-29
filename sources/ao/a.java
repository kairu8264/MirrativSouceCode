package ao;

import ao.g;
import jo.p;

/* loaded from: classes4.dex */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> cVar) {
        p.h(cVar, "key");
        this.key = cVar;
    }

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
        return this.key;
    }

    @Override // ao.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // ao.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
