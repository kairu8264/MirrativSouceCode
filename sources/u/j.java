package u;

import u.l0;

/* loaded from: classes.dex */
public final class j {
    public static final <T, V extends p> V b(c1<T, V> c1Var, T t10) {
        if (t10 == null) {
            return null;
        }
        return c1Var.a().invoke(t10);
    }

    public static final <T> i0<T> c(z<T> zVar, q0 q0Var, long j10) {
        jo.p.h(zVar, "animation");
        jo.p.h(q0Var, "repeatMode");
        return new i0<>(zVar, q0Var, j10, null);
    }

    public static /* synthetic */ i0 d(z zVar, q0 q0Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            q0Var = q0.Restart;
        }
        if ((i10 & 4) != 0) {
            j10 = v0.c(0, 0, 2, null);
        }
        return c(zVar, q0Var, j10);
    }

    public static final <T> l0<T> e(io.l<? super l0.b<T>, wn.v> lVar) {
        jo.p.h(lVar, "init");
        l0.b bVar = new l0.b();
        lVar.invoke(bVar);
        return new l0<>(bVar);
    }

    public static final <T> u0<T> f(float f10, float f11, T t10) {
        return new u0<>(f10, f11, t10);
    }

    public static /* synthetic */ u0 g(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return f(f10, f11, obj);
    }

    public static final <T> b1<T> h(int i10, int i11, a0 a0Var) {
        jo.p.h(a0Var, "easing");
        return new b1<>(i10, i11, a0Var);
    }

    public static /* synthetic */ b1 i(int i10, int i11, a0 a0Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            a0Var = b0.b();
        }
        return h(i10, i11, a0Var);
    }
}
