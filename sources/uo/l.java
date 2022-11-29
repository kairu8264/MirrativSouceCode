package uo;

import ao.e;

/* loaded from: classes4.dex */
public final /* synthetic */ class l {
    public static final <T> y0<T> a(q0 q0Var, ao.g gVar, s0 s0Var, io.p<? super q0, ? super ao.d<? super T>, ? extends Object> pVar) {
        z0 z0Var;
        ao.g e10 = j0.e(q0Var, gVar);
        if (s0Var.e()) {
            z0Var = new m2(e10, pVar);
        } else {
            z0Var = new z0(e10, true);
        }
        ((a) z0Var).Y0(s0Var, z0Var, pVar);
        return z0Var;
    }

    public static /* synthetic */ y0 b(q0 q0Var, ao.g gVar, s0 s0Var, io.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = ao.h.f16651w;
        }
        if ((i10 & 2) != 0) {
            s0Var = s0.DEFAULT;
        }
        return j.a(q0Var, gVar, s0Var, pVar);
    }

    public static final d2 c(q0 q0Var, ao.g gVar, s0 s0Var, io.p<? super q0, ? super ao.d<? super wn.v>, ? extends Object> pVar) {
        a z2Var;
        ao.g e10 = j0.e(q0Var, gVar);
        if (s0Var.e()) {
            z2Var = new n2(e10, pVar);
        } else {
            z2Var = new z2(e10, true);
        }
        z2Var.Y0(s0Var, z2Var, pVar);
        return z2Var;
    }

    public static /* synthetic */ d2 d(q0 q0Var, ao.g gVar, s0 s0Var, io.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = ao.h.f16651w;
        }
        if ((i10 & 2) != 0) {
            s0Var = s0.DEFAULT;
        }
        return j.c(q0Var, gVar, s0Var, pVar);
    }

    public static final <T> Object e(ao.g gVar, io.p<? super q0, ? super ao.d<? super T>, ? extends Object> pVar, ao.d<? super T> dVar) {
        Object a12;
        ao.g context = dVar.getContext();
        ao.g d10 = j0.d(context, gVar);
        g2.j(d10);
        if (d10 == context) {
            zo.g0 g0Var = new zo.g0(d10, dVar);
            a12 = ap.b.c(g0Var, g0Var, pVar);
        } else {
            e.b bVar = ao.e.f16648d;
            if (jo.p.c(d10.get(bVar), context.get(bVar))) {
                i3 i3Var = new i3(d10, dVar);
                Object c10 = zo.o0.c(d10, null);
                try {
                    Object c11 = ap.b.c(i3Var, i3Var, pVar);
                    zo.o0.a(d10, c10);
                    a12 = c11;
                } catch (Throwable th2) {
                    zo.o0.a(d10, c10);
                    throw th2;
                }
            } else {
                d1 d1Var = new d1(d10, dVar);
                ap.a.d(pVar, d1Var, d1Var, null, 4, null);
                a12 = d1Var.a1();
            }
        }
        if (a12 == bo.c.c()) {
            co.h.c(dVar);
        }
        return a12;
    }
}
