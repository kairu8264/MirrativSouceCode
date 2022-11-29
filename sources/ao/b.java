package ao;

import ao.g;
import ao.g.b;
import io.l;
import jo.p;

/* loaded from: classes4.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: w  reason: collision with root package name */
    public final l<g.b, E> f16643w;

    /* renamed from: x  reason: collision with root package name */
    public final g.c<?> f16644x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [io.l<ao.g$b, E extends B>, java.lang.Object, io.l<? super ao.g$b, ? extends E extends B>] */
    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        p.h(cVar, "baseKey");
        p.h(lVar, "safeCast");
        this.f16643w = lVar;
        this.f16644x = cVar instanceof b ? (g.c<B>) ((b) cVar).f16644x : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        p.h(cVar, "key");
        return cVar == this || this.f16644x == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lao/g$b;)TE; */
    public final g.b b(g.b bVar) {
        p.h(bVar, "element");
        return (g.b) this.f16643w.invoke(bVar);
    }
}
