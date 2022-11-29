package ao;

import io.p;
import wn.l;
import wn.v;

/* loaded from: classes4.dex */
public final class f {
    public static final <R, T> d<v> a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        jo.p.h(pVar, "<this>");
        jo.p.h(dVar, "completion");
        return new i(bo.b.b(bo.b.a(pVar, r10, dVar)), bo.c.c());
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        jo.p.h(pVar, "<this>");
        jo.p.h(dVar, "completion");
        d b10 = bo.b.b(bo.b.a(pVar, r10, dVar));
        l.a aVar = l.f59224w;
        b10.resumeWith(l.a(v.f59242a));
    }
}
