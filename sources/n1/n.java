package n1;

/* loaded from: classes.dex */
public final class n {
    public static final boolean a(w wVar) {
        jo.p.h(wVar, "<this>");
        return (wVar.m() || wVar.i() || !wVar.g()) ? false : true;
    }

    public static final boolean b(w wVar) {
        jo.p.h(wVar, "<this>");
        return !wVar.i() && wVar.g();
    }

    public static final boolean c(w wVar) {
        jo.p.h(wVar, "<this>");
        return (wVar.m() || !wVar.i() || wVar.g()) ? false : true;
    }

    public static final boolean d(w wVar) {
        jo.p.h(wVar, "<this>");
        return wVar.i() && !wVar.g();
    }

    public static final boolean e(w wVar, long j10) {
        jo.p.h(wVar, "$this$isOutOfBounds");
        long f10 = wVar.f();
        float m10 = b1.f.m(f10);
        float n10 = b1.f.n(f10);
        return m10 < 0.0f || m10 > ((float) m2.o.g(j10)) || n10 < 0.0f || n10 > ((float) m2.o.f(j10));
    }

    public static final boolean f(w wVar, long j10, long j11) {
        jo.p.h(wVar, "$this$isOutOfBounds");
        if (!j0.g(wVar.k(), j0.f41449a.d())) {
            return e(wVar, j10);
        }
        long f10 = wVar.f();
        float m10 = b1.f.m(f10);
        float n10 = b1.f.n(f10);
        return m10 < (-b1.l.i(j11)) || m10 > ((float) m2.o.g(j10)) + b1.l.i(j11) || n10 < (-b1.l.g(j11)) || n10 > ((float) m2.o.f(j10)) + b1.l.g(j11);
    }

    public static final long g(w wVar) {
        jo.p.h(wVar, "<this>");
        return i(wVar, false);
    }

    public static final long h(w wVar) {
        jo.p.h(wVar, "<this>");
        return i(wVar, true);
    }

    public static final long i(w wVar, boolean z10) {
        long q10 = b1.f.q(wVar.f(), wVar.h());
        return (z10 || !wVar.m()) ? q10 : b1.f.f16721b.c();
    }

    public static final boolean j(w wVar) {
        jo.p.h(wVar, "<this>");
        return !b1.f.j(i(wVar, true), b1.f.f16721b.c());
    }
}
