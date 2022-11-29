package xo;

import uo.u0;

/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final zo.k0 f60512a = new zo.k0("NONE");

    /* renamed from: b  reason: collision with root package name */
    public static final zo.k0 f60513b = new zo.k0("PENDING");

    public static final <T> s<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) yo.q.f62129a;
        }
        return new h0(t10);
    }

    public static final <T> c<T> d(g0<? extends T> g0Var, ao.g gVar, int i10, wo.h hVar) {
        boolean z10 = true;
        if (u0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        if (i10 < 0 || i10 >= 2) {
            z10 = false;
        }
        return ((z10 || i10 == -2) && hVar == wo.h.DROP_OLDEST) ? g0Var : y.e(g0Var, gVar, i10, hVar);
    }
}
