package y;

import l0.z1;

/* loaded from: classes.dex */
public final class l1 implements n1 {

    /* renamed from: b  reason: collision with root package name */
    public final String f60839b;

    /* renamed from: c  reason: collision with root package name */
    public final l0.s0 f60840c;

    public l1(b0 b0Var, String str) {
        l0.s0 e10;
        jo.p.h(b0Var, "insets");
        jo.p.h(str, "name");
        this.f60839b = str;
        e10 = z1.e(b0Var, null, 2, null);
        this.f60840c = e10;
    }

    @Override // y.n1
    public int a(m2.d dVar) {
        jo.p.h(dVar, "density");
        return e().a();
    }

    @Override // y.n1
    public int b(m2.d dVar) {
        jo.p.h(dVar, "density");
        return e().d();
    }

    @Override // y.n1
    public int c(m2.d dVar, m2.q qVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        return e().b();
    }

    @Override // y.n1
    public int d(m2.d dVar, m2.q qVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        return e().c();
    }

    public final b0 e() {
        return (b0) this.f60840c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            return jo.p.c(e(), ((l1) obj).e());
        }
        return false;
    }

    public final void f(b0 b0Var) {
        jo.p.h(b0Var, "<set-?>");
        this.f60840c.setValue(b0Var);
    }

    public int hashCode() {
        return this.f60839b.hashCode();
    }

    public String toString() {
        return this.f60839b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
