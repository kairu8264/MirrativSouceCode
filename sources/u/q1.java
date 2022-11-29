package u;

import b1.f;
import b1.h;
import b1.l;
import java.util.Map;
import m2.g;
import m2.k;
import m2.o;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final b1.h f54106a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<c1<?, ?>, Float> f54107b;

    static {
        Float valueOf = Float.valueOf(0.5f);
        f54106a = new b1.h(0.5f, 0.5f, 0.5f, 0.5f);
        c1<Integer, m> f10 = e1.f(jo.o.f38150a);
        Float valueOf2 = Float.valueOf(1.0f);
        c1<m2.g, m> g10 = e1.g(m2.g.f40516x);
        Float valueOf3 = Float.valueOf(0.1f);
        f54107b = xn.n0.h(wn.q.a(f10, valueOf2), wn.q.a(e1.j(m2.o.f40537b), valueOf2), wn.q.a(e1.i(m2.k.f40528b), valueOf2), wn.q.a(e1.e(jo.i.f38148a), Float.valueOf(0.01f)), wn.q.a(e1.c(b1.h.f16726e), valueOf), wn.q.a(e1.d(b1.l.f16742b), valueOf), wn.q.a(e1.b(b1.f.f16721b), valueOf), wn.q.a(g10, valueOf3), wn.q.a(e1.h(m2.i.f40520b), valueOf3));
    }

    public static final float a(g.a aVar) {
        jo.p.h(aVar, "<this>");
        return m2.g.l(0.1f);
    }

    public static final int b(jo.o oVar) {
        jo.p.h(oVar, "<this>");
        return 1;
    }

    public static final long c(f.a aVar) {
        jo.p.h(aVar, "<this>");
        return b1.g.a(0.5f, 0.5f);
    }

    public static final long d(l.a aVar) {
        jo.p.h(aVar, "<this>");
        return b1.m.a(0.5f, 0.5f);
    }

    public static final long e(k.a aVar) {
        jo.p.h(aVar, "<this>");
        return m2.l.a(1, 1);
    }

    public static final long f(o.a aVar) {
        jo.p.h(aVar, "<this>");
        return m2.p.a(1, 1);
    }

    public static final b1.h g(h.a aVar) {
        jo.p.h(aVar, "<this>");
        return f54106a;
    }

    public static final Map<c1<?, ?>, Float> h() {
        return f54107b;
    }
}
