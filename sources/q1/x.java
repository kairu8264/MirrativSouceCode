package q1;

import x0.f;

/* loaded from: classes.dex */
public interface x extends f.b {

    /* loaded from: classes.dex */
    public static final class a {
        @Deprecated
        public static boolean a(x xVar, io.l<? super f.b, Boolean> lVar) {
            jo.p.h(lVar, "predicate");
            return x.super.e(lVar);
        }

        @Deprecated
        public static <R> R b(x xVar, R r10, io.p<? super R, ? super f.b, ? extends R> pVar) {
            jo.p.h(pVar, "operation");
            return (R) x.super.k(r10, pVar);
        }

        @Deprecated
        public static <R> R c(x xVar, R r10, io.p<? super f.b, ? super R, ? extends R> pVar) {
            jo.p.h(pVar, "operation");
            return (R) x.super.o(r10, pVar);
        }

        @Deprecated
        public static int d(x xVar, m mVar, l lVar, int i10) {
            jo.p.h(mVar, "receiver");
            jo.p.h(lVar, "measurable");
            return x.super.u(mVar, lVar, i10);
        }

        @Deprecated
        public static int e(x xVar, m mVar, l lVar, int i10) {
            jo.p.h(mVar, "receiver");
            jo.p.h(lVar, "measurable");
            return x.super.d(mVar, lVar, i10);
        }

        @Deprecated
        public static int f(x xVar, m mVar, l lVar, int i10) {
            jo.p.h(mVar, "receiver");
            jo.p.h(lVar, "measurable");
            return x.super.h(mVar, lVar, i10);
        }

        @Deprecated
        public static int g(x xVar, m mVar, l lVar, int i10) {
            jo.p.h(mVar, "receiver");
            jo.p.h(lVar, "measurable");
            return x.super.w(mVar, lVar, i10);
        }

        @Deprecated
        public static x0.f h(x xVar, x0.f fVar) {
            jo.p.h(fVar, "other");
            return x.super.L(fVar);
        }
    }

    default int d(m mVar, l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return g0.f48578a.b(this, mVar, lVar, i10);
    }

    default int h(m mVar, l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return g0.f48578a.c(this, mVar, lVar, i10);
    }

    d0 q(e0 e0Var, b0 b0Var, long j10);

    default int u(m mVar, l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return g0.f48578a.a(this, mVar, lVar, i10);
    }

    default int w(m mVar, l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return g0.f48578a.d(this, mVar, lVar, i10);
    }
}
