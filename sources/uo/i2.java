package uo;

import java.util.concurrent.CancellationException;
import uo.d2;

/* loaded from: classes4.dex */
public final /* synthetic */ class i2 {
    public static final b0 a(d2 d2Var) {
        return new f2(d2Var);
    }

    public static /* synthetic */ b0 b(d2 d2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = null;
        }
        return g2.a(d2Var);
    }

    public static final void c(ao.g gVar, CancellationException cancellationException) {
        d2 d2Var = (d2) gVar.get(d2.f56001s);
        if (d2Var == null) {
            return;
        }
        d2Var.c(cancellationException);
    }

    public static final void d(d2 d2Var, String str, Throwable th2) {
        d2Var.c(r1.a(str, th2));
    }

    public static /* synthetic */ void e(ao.g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        g2.c(gVar, cancellationException);
    }

    public static /* synthetic */ void f(d2 d2Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        g2.d(d2Var, str, th2);
    }

    public static final Object g(d2 d2Var, ao.d<? super wn.v> dVar) {
        d2.a.a(d2Var, null, 1, null);
        Object E = d2Var.E(dVar);
        return E == bo.c.c() ? E : wn.v.f59242a;
    }

    public static final i1 h(d2 d2Var, i1 i1Var) {
        return d2Var.p(new k1(i1Var));
    }

    public static final void i(ao.g gVar) {
        d2 d2Var = (d2) gVar.get(d2.f56001s);
        if (d2Var == null) {
            return;
        }
        g2.k(d2Var);
    }

    public static final void j(d2 d2Var) {
        if (!d2Var.isActive()) {
            throw d2Var.n();
        }
    }

    public static final d2 k(ao.g gVar) {
        d2 d2Var = (d2) gVar.get(d2.f56001s);
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException(jo.p.o("Current context doesn't contain Job in it: ", gVar).toString());
    }

    public static final boolean l(ao.g gVar) {
        d2 d2Var = (d2) gVar.get(d2.f56001s);
        return d2Var != null && d2Var.isActive();
    }
}
