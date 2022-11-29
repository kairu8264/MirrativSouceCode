package x0;

import ao.g;
import io.p;

/* loaded from: classes.dex */
public interface g extends g.b {

    /* renamed from: v  reason: collision with root package name */
    public static final b f59361v = b.f59362w;

    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R a(g gVar, R r10, p<? super R, ? super g.b, ? extends R> pVar) {
            jo.p.h(pVar, "operation");
            return (R) g.b.a.a(gVar, r10, pVar);
        }

        public static <E extends g.b> E b(g gVar, g.c<E> cVar) {
            jo.p.h(cVar, "key");
            return (E) g.b.a.b(gVar, cVar);
        }

        public static ao.g c(g gVar, g.c<?> cVar) {
            jo.p.h(cVar, "key");
            return g.b.a.c(gVar, cVar);
        }

        public static ao.g d(g gVar, ao.g gVar2) {
            jo.p.h(gVar2, "context");
            return g.b.a.d(gVar, gVar2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<g> {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ b f59362w = new b();
    }

    @Override // ao.g.b
    default g.c<?> getKey() {
        return f59361v;
    }
}
