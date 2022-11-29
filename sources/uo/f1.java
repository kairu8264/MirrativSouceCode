package uo;

import wn.l;

/* loaded from: classes4.dex */
public final class f1 {
    public static final <T> void a(e1<? super T> e1Var, int i10) {
        if (u0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        ao.d<? super T> b10 = e1Var.b();
        boolean z10 = i10 == 4;
        if (!z10 && (b10 instanceof zo.k) && b(i10) == b(e1Var.f56011y)) {
            k0 k0Var = ((zo.k) b10).f63297z;
            ao.g context = b10.getContext();
            if (k0Var.c0(context)) {
                k0Var.X(context, e1Var);
                return;
            } else {
                e(e1Var);
                return;
            }
        }
        d(e1Var, b10, z10);
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(e1<? super T> e1Var, ao.d<? super T> dVar, boolean z10) {
        Object e10;
        boolean a12;
        Object g10 = e1Var.g();
        Throwable c10 = e1Var.c(g10);
        if (c10 != null) {
            l.a aVar = wn.l.f59224w;
            e10 = wn.m.a(c10);
        } else {
            l.a aVar2 = wn.l.f59224w;
            e10 = e1Var.e(g10);
        }
        Object a10 = wn.l.a(e10);
        if (z10) {
            zo.k kVar = (zo.k) dVar;
            ao.d<T> dVar2 = kVar.A;
            Object obj = kVar.C;
            ao.g context = dVar2.getContext();
            Object c11 = zo.o0.c(context, obj);
            i3<?> g11 = c11 != zo.o0.f63311a ? j0.g(dVar2, context, c11) : null;
            try {
                kVar.A.resumeWith(a10);
                wn.v vVar = wn.v.f59242a;
                if (g11 != null) {
                    if (!a12) {
                        return;
                    }
                }
                return;
            } finally {
                if (g11 == null || g11.a1()) {
                    zo.o0.a(context, c11);
                }
            }
        }
        dVar.resumeWith(a10);
    }

    public static final void e(e1<?> e1Var) {
        m1 b10 = d3.f56003a.b();
        if (b10.w0()) {
            b10.l0(e1Var);
            return;
        }
        b10.q0(true);
        try {
            d(e1Var, e1Var.b(), true);
            do {
            } while (b10.B0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
