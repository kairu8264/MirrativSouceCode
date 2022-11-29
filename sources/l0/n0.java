package l0;

import ao.g;

/* loaded from: classes.dex */
public interface n0 extends g.b {

    /* renamed from: n  reason: collision with root package name */
    public static final b f39207n = b.f39208w;

    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R a(n0 n0Var, R r10, io.p<? super R, ? super g.b, ? extends R> pVar) {
            jo.p.h(pVar, "operation");
            return (R) g.b.a.a(n0Var, r10, pVar);
        }

        public static <E extends g.b> E b(n0 n0Var, g.c<E> cVar) {
            jo.p.h(cVar, "key");
            return (E) g.b.a.b(n0Var, cVar);
        }

        public static ao.g c(n0 n0Var, g.c<?> cVar) {
            jo.p.h(cVar, "key");
            return g.b.a.c(n0Var, cVar);
        }

        public static ao.g d(n0 n0Var, ao.g gVar) {
            jo.p.h(gVar, "context");
            return g.b.a.d(n0Var, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<n0> {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ b f39208w = new b();
    }

    <R> Object L(io.l<? super Long, ? extends R> lVar, ao.d<? super R> dVar);

    @Override // ao.g.b
    default g.c<?> getKey() {
        return f39207n;
    }
}
