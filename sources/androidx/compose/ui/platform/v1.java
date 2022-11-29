package androidx.compose.ui.platform;

import c1.q0;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class v1 {
    public static final boolean a(b1.j jVar) {
        return b1.a.d(jVar.h()) + b1.a.d(jVar.i()) <= jVar.j() && b1.a.d(jVar.b()) + b1.a.d(jVar.c()) <= jVar.j() && b1.a.e(jVar.h()) + b1.a.e(jVar.b()) <= jVar.d() && b1.a.e(jVar.i()) + b1.a.e(jVar.c()) <= jVar.d();
    }

    public static final boolean b(c1.q0 q0Var, float f10, float f11, c1.u0 u0Var, c1.u0 u0Var2) {
        jo.p.h(q0Var, "outline");
        if (q0Var instanceof q0.b) {
            return d(((q0.b) q0Var).a(), f10, f11);
        }
        if (q0Var instanceof q0.c) {
            return e((q0.c) q0Var, f10, f11, u0Var, u0Var2);
        }
        if (q0Var instanceof q0.a) {
            return c(((q0.a) q0Var).a(), f10, f11, u0Var, u0Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(c1.u0 u0Var, float f10, float f11, c1.u0 u0Var2, c1.u0 u0Var3) {
        b1.h hVar = new b1.h(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (u0Var2 == null) {
            u0Var2 = c1.n.a();
        }
        u0Var2.h(hVar);
        if (u0Var3 == null) {
            u0Var3 = c1.n.a();
        }
        u0Var3.l(u0Var, u0Var2, c1.y0.f18783a.b());
        boolean isEmpty = u0Var3.isEmpty();
        u0Var3.reset();
        u0Var2.reset();
        return !isEmpty;
    }

    public static final boolean d(b1.h hVar, float f10, float f11) {
        return hVar.i() <= f10 && f10 < hVar.j() && hVar.l() <= f11 && f11 < hVar.e();
    }

    public static final boolean e(q0.c cVar, float f10, float f11, c1.u0 u0Var, c1.u0 u0Var2) {
        b1.j a10 = cVar.a();
        if (f10 < a10.e() || f10 >= a10.f() || f11 < a10.g() || f11 >= a10.a()) {
            return false;
        }
        if (!a(a10)) {
            c1.u0 a11 = u0Var2 == null ? c1.n.a() : u0Var2;
            a11.m(a10);
            return c(a11, f10, f11, u0Var, u0Var2);
        }
        float d10 = b1.a.d(a10.h()) + a10.e();
        float e10 = b1.a.e(a10.h()) + a10.g();
        float f12 = a10.f() - b1.a.d(a10.i());
        float e11 = b1.a.e(a10.i()) + a10.g();
        float f13 = a10.f() - b1.a.d(a10.c());
        float a12 = a10.a() - b1.a.e(a10.c());
        float a13 = a10.a() - b1.a.e(a10.b());
        float d11 = b1.a.d(a10.b()) + a10.e();
        if (f10 >= d10 || f11 >= e10) {
            if (f10 >= d11 || f11 <= a13) {
                if (f10 <= f12 || f11 >= e11) {
                    if (f10 <= f13 || f11 <= a12) {
                        return true;
                    }
                    return f(f10, f11, a10.c(), f13, a12);
                }
                return f(f10, f11, a10.i(), f12, e11);
            }
            return f(f10, f11, a10.b(), d11, a13);
        }
        return f(f10, f11, a10.h(), d10, e10);
    }

    public static final boolean f(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float d10 = b1.a.d(j10);
        float e10 = b1.a.e(j10);
        return ((f14 * f14) / (d10 * d10)) + ((f15 * f15) / (e10 * e10)) <= 1.0f;
    }
}
