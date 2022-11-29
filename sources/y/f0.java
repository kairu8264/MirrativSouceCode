package y;

import q1.q0;

/* loaded from: classes.dex */
public interface f0 extends q1.x {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.l<q0.a, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ q1.q0 f60793w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1.q0 q0Var) {
            super(1);
            this.f60793w = q0Var;
        }

        public final void a(q0.a aVar) {
            jo.p.h(aVar, "$this$layout");
            q0.a.p(aVar, this.f60793w, m2.k.f40528b.a(), 0.0f, 2, null);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(q0.a aVar) {
            a(aVar);
            return wn.v.f59242a;
        }
    }

    long E0(q1.e0 e0Var, q1.b0 b0Var, long j10);

    default boolean Q0() {
        return true;
    }

    @Override // q1.x
    default int d(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.G(i10);
    }

    @Override // q1.x
    default int h(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.u(i10);
    }

    @Override // q1.x
    default q1.d0 q(q1.e0 e0Var, q1.b0 b0Var, long j10) {
        jo.p.h(e0Var, "$this$measure");
        jo.p.h(b0Var, "measurable");
        long E0 = E0(e0Var, b0Var, j10);
        if (Q0()) {
            E0 = m2.c.e(j10, E0);
        }
        q1.q0 M = b0Var.M(E0);
        return q1.e0.O0(e0Var, M.r0(), M.f0(), null, new a(M), 4, null);
    }

    @Override // q1.x
    default int u(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.e(i10);
    }

    @Override // q1.x
    default int w(q1.m mVar, q1.l lVar, int i10) {
        jo.p.h(mVar, "<this>");
        jo.p.h(lVar, "measurable");
        return lVar.E(i10);
    }
}
