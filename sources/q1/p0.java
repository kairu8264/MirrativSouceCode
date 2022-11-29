package q1;

import x0.f;

/* loaded from: classes.dex */
public interface p0 extends f.b {

    /* loaded from: classes.dex */
    public static final class a {
        @Deprecated
        public static boolean a(p0 p0Var, io.l<? super f.b, Boolean> lVar) {
            jo.p.h(lVar, "predicate");
            return p0.super.e(lVar);
        }

        @Deprecated
        public static <R> R b(p0 p0Var, R r10, io.p<? super R, ? super f.b, ? extends R> pVar) {
            jo.p.h(pVar, "operation");
            return (R) p0.super.k(r10, pVar);
        }

        @Deprecated
        public static <R> R c(p0 p0Var, R r10, io.p<? super f.b, ? super R, ? extends R> pVar) {
            jo.p.h(pVar, "operation");
            return (R) p0.super.o(r10, pVar);
        }

        @Deprecated
        public static x0.f d(p0 p0Var, x0.f fVar) {
            jo.p.h(fVar, "other");
            return p0.super.L(fVar);
        }
    }

    Object g0(m2.d dVar, Object obj);
}
