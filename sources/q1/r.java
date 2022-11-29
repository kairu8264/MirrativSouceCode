package q1;

/* loaded from: classes.dex */
public final class r {
    public static final b1.h a(q qVar) {
        b1.h o10;
        jo.p.h(qVar, "<this>");
        q P = qVar.P();
        return (P == null || (o10 = q.o(P, qVar, false, 2, null)) == null) ? new b1.h(0.0f, 0.0f, m2.o.g(qVar.a()), m2.o.f(qVar.a())) : o10;
    }

    public static final b1.h b(q qVar) {
        jo.p.h(qVar, "<this>");
        return q.o(d(qVar), qVar, false, 2, null);
    }

    public static final b1.h c(q qVar) {
        jo.p.h(qVar, "<this>");
        q d10 = d(qVar);
        b1.h b10 = b(qVar);
        long w10 = d10.w(b1.g.a(b10.i(), b10.l()));
        long w11 = d10.w(b1.g.a(b10.j(), b10.l()));
        long w12 = d10.w(b1.g.a(b10.j(), b10.e()));
        long w13 = d10.w(b1.g.a(b10.i(), b10.e()));
        return new b1.h(zn.b.g(b1.f.m(w10), b1.f.m(w11), b1.f.m(w13), b1.f.m(w12)), zn.b.g(b1.f.n(w10), b1.f.n(w11), b1.f.n(w13), b1.f.n(w12)), zn.b.f(b1.f.m(w10), b1.f.m(w11), b1.f.m(w13), b1.f.m(w12)), zn.b.f(b1.f.n(w10), b1.f.n(w11), b1.f.n(w13), b1.f.n(w12)));
    }

    public static final q d(q qVar) {
        q qVar2;
        jo.p.h(qVar, "<this>");
        q P = qVar.P();
        while (true) {
            q qVar3 = P;
            qVar2 = qVar;
            qVar = qVar3;
            if (qVar == null) {
                break;
            }
            P = qVar.P();
        }
        s1.p pVar = qVar2 instanceof s1.p ? (s1.p) qVar2 : null;
        if (pVar == null) {
            return qVar2;
        }
        s1.p I1 = pVar.I1();
        while (true) {
            s1.p pVar2 = I1;
            s1.p pVar3 = pVar;
            pVar = pVar2;
            if (pVar == null) {
                return pVar3;
            }
            I1 = pVar.I1();
        }
    }

    public static final long e(q qVar) {
        jo.p.h(qVar, "<this>");
        return qVar.R(b1.f.f16721b.c());
    }

    public static final long f(q qVar) {
        jo.p.h(qVar, "<this>");
        return qVar.w(b1.f.f16721b.c());
    }
}
