package uo;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class r0 {
    public static final q0 a(ao.g gVar) {
        b0 b10;
        if (gVar.get(d2.f56001s) == null) {
            b10 = i2.b(null, 1, null);
            gVar = gVar.plus(b10);
        }
        return new zo.i(gVar);
    }

    public static final q0 b() {
        return new zo.i(b3.b(null, 1, null).plus(g1.c()));
    }

    public static final void c(q0 q0Var, CancellationException cancellationException) {
        d2 d2Var = (d2) q0Var.getCoroutineContext().get(d2.f56001s);
        if (d2Var != null) {
            d2Var.c(cancellationException);
            return;
        }
        throw new IllegalStateException(jo.p.o("Scope cannot be cancelled because it does not have a job: ", q0Var).toString());
    }

    public static /* synthetic */ void d(q0 q0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(q0Var, cancellationException);
    }

    public static final <R> Object e(io.p<? super q0, ? super ao.d<? super R>, ? extends Object> pVar, ao.d<? super R> dVar) {
        zo.g0 g0Var = new zo.g0(dVar.getContext(), dVar);
        Object c10 = ap.b.c(g0Var, g0Var, pVar);
        if (c10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return c10;
    }

    public static final void f(q0 q0Var) {
        g2.j(q0Var.getCoroutineContext());
    }

    public static final boolean g(q0 q0Var) {
        d2 d2Var = (d2) q0Var.getCoroutineContext().get(d2.f56001s);
        if (d2Var == null) {
            return true;
        }
        return d2Var.isActive();
    }

    public static final q0 h(q0 q0Var, ao.g gVar) {
        return new zo.i(q0Var.getCoroutineContext().plus(gVar));
    }
}
