package e2;

import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public a0 f30092a = new a0(y1.b.d(), y1.b0.f61064b.a(), (y1.b0) null, (jo.h) null);

    /* renamed from: b  reason: collision with root package name */
    public g f30093b = new g(this.f30092a.e(), this.f30092a.g(), null);

    public final a0 a(List<? extends d> list) {
        jo.p.h(list, "editCommands");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).a(this.f30093b);
        }
        a0 a0Var = new a0(this.f30093b.q(), this.f30093b.i(), this.f30093b.d(), (jo.h) null);
        this.f30092a = a0Var;
        return a0Var;
    }

    public final void b(a0 a0Var, f0 f0Var) {
        jo.p.h(a0Var, "value");
        boolean z10 = true;
        boolean z11 = !jo.p.c(a0Var.f(), this.f30093b.d());
        boolean z12 = false;
        if (!jo.p.c(this.f30092a.e(), a0Var.e())) {
            this.f30093b = new g(a0Var.e(), a0Var.g(), null);
        } else if (y1.b0.g(this.f30092a.g(), a0Var.g())) {
            z10 = false;
        } else {
            this.f30093b.p(y1.b0.l(a0Var.g()), y1.b0.k(a0Var.g()));
            z12 = true;
            z10 = false;
        }
        if (a0Var.f() == null) {
            this.f30093b.a();
        } else if (!y1.b0.h(a0Var.f().r())) {
            this.f30093b.n(y1.b0.l(a0Var.f().r()), y1.b0.k(a0Var.f().r()));
        }
        if (z10 || (!z12 && z11)) {
            this.f30093b.a();
            a0Var = a0.d(a0Var, null, 0L, null, 3, null);
        }
        a0 a0Var2 = this.f30092a;
        this.f30092a = a0Var;
        if (f0Var != null) {
            f0Var.d(a0Var2, a0Var);
        }
    }

    public final a0 c() {
        return this.f30092a;
    }
}
