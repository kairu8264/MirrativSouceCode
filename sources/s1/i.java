package s1;

import l0.s0;
import l0.z1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f51853d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final k f51854a;

    /* renamed from: b  reason: collision with root package name */
    public s0<q1.c0> f51855b;

    /* renamed from: c  reason: collision with root package name */
    public q1.c0 f51856c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public i(k kVar) {
        jo.p.h(kVar, "layoutNode");
        this.f51854a = kVar;
    }

    public final int a(int i10) {
        return c().a(this.f51854a.k0(), this.f51854a.W(), i10);
    }

    public final int b(int i10) {
        return c().d(this.f51854a.k0(), this.f51854a.W(), i10);
    }

    public final q1.c0 c() {
        s0<q1.c0> s0Var = this.f51855b;
        if (s0Var == null) {
            q1.c0 c0Var = this.f51856c;
            if (c0Var == null) {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
            }
            s0Var = z1.e(c0Var, null, 2, null);
        }
        this.f51855b = s0Var;
        return s0Var.getValue();
    }

    public final int d(int i10) {
        return c().e(this.f51854a.k0(), this.f51854a.W(), i10);
    }

    public final int e(int i10) {
        return c().g(this.f51854a.k0(), this.f51854a.W(), i10);
    }

    public final void f(q1.c0 c0Var) {
        jo.p.h(c0Var, "measurePolicy");
        s0<q1.c0> s0Var = this.f51855b;
        if (s0Var != null) {
            jo.p.e(s0Var);
            s0Var.setValue(c0Var);
            return;
        }
        this.f51856c = c0Var;
    }
}
