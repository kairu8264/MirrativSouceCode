package ap;

import ao.d;
import ao.g;
import bo.c;
import co.e;
import co.h;
import io.p;
import jo.j0;
import kotlinx.coroutines.TimeoutCancellationException;
import uo.d0;
import uo.l2;
import uo.u0;
import wn.l;
import wn.m;
import zo.g0;
import zo.o0;

/* loaded from: classes4.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        d a10 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c10 = o0.c(context, null);
            Object invoke = ((p) j0.e(pVar, 2)).invoke(r10, a10);
            o0.a(context, c10);
            if (invoke != c.c()) {
                l.a aVar = l.f59224w;
                a10.resumeWith(l.a(invoke));
            }
        } catch (Throwable th2) {
            l.a aVar2 = l.f59224w;
            a10.resumeWith(l.a(m.a(th2)));
        }
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        d a10 = h.a(dVar);
        try {
            Object invoke = ((p) j0.e(pVar, 2)).invoke(r10, a10);
            if (invoke != c.c()) {
                l.a aVar = l.f59224w;
                a10.resumeWith(l.a(invoke));
            }
        } catch (Throwable th2) {
            l.a aVar2 = l.f59224w;
            a10.resumeWith(l.a(m.a(th2)));
        }
    }

    public static final <T, R> Object c(g0<? super T> g0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object d0Var;
        Object w02;
        try {
            d0Var = ((p) j0.e(pVar, 2)).invoke(r10, g0Var);
        } catch (Throwable th2) {
            d0Var = new d0(th2, false, 2, null);
        }
        if (d0Var != c.c() && (w02 = g0Var.w0(d0Var)) != l2.f56054b) {
            if (w02 instanceof d0) {
                Throwable th3 = ((d0) w02).f55999a;
                d<? super T> dVar = g0Var.f63289y;
                if (u0.d() && (dVar instanceof e)) {
                    throw zo.j0.a(th3, (e) dVar);
                }
                throw th3;
            }
            return l2.h(w02);
        }
        return c.c();
    }

    public static final <T, R> Object d(g0<? super T> g0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object d0Var;
        Object w02;
        boolean z10 = false;
        try {
            d0Var = ((p) j0.e(pVar, 2)).invoke(r10, g0Var);
        } catch (Throwable th2) {
            d0Var = new d0(th2, false, 2, null);
        }
        if (d0Var != c.c() && (w02 = g0Var.w0(d0Var)) != l2.f56054b) {
            if (w02 instanceof d0) {
                Throwable th3 = ((d0) w02).f55999a;
                if (((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).f38909w == g0Var) ? true : true) {
                    d<? super T> dVar = g0Var.f63289y;
                    if (u0.d() && (dVar instanceof e)) {
                        throw zo.j0.a(th3, (e) dVar);
                    }
                    throw th3;
                } else if (d0Var instanceof d0) {
                    Throwable th4 = ((d0) d0Var).f55999a;
                    d<? super T> dVar2 = g0Var.f63289y;
                    if (u0.d() && (dVar2 instanceof e)) {
                        throw zo.j0.a(th4, (e) dVar2);
                    }
                    throw th4;
                }
            } else {
                d0Var = l2.h(w02);
            }
            return d0Var;
        }
        return c.c();
    }
}
