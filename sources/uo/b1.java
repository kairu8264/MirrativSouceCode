package uo;

import ao.g;

/* loaded from: classes4.dex */
public final class b1 {
    public static final Object a(long j10, ao.d<? super wn.v> dVar) {
        if (j10 <= 0) {
            return wn.v.f59242a;
        }
        q qVar = new q(bo.b.b(dVar), 1);
        qVar.y();
        if (j10 < Long.MAX_VALUE) {
            b(qVar.getContext()).S(j10, qVar);
        }
        Object t10 = qVar.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10 == bo.c.c() ? t10 : wn.v.f59242a;
    }

    public static final a1 b(ao.g gVar) {
        g.b bVar = gVar.get(ao.e.f16648d);
        a1 a1Var = bVar instanceof a1 ? (a1) bVar : null;
        return a1Var == null ? x0.a() : a1Var;
    }
}
