package y;

import l0.z1;

/* loaded from: classes.dex */
public final class e implements n1 {

    /* renamed from: b  reason: collision with root package name */
    public final int f60769b;

    /* renamed from: c  reason: collision with root package name */
    public final String f60770c;

    /* renamed from: d  reason: collision with root package name */
    public final l0.s0 f60771d;

    /* renamed from: e  reason: collision with root package name */
    public final l0.s0 f60772e;

    public e(int i10, String str) {
        l0.s0 e10;
        l0.s0 e11;
        jo.p.h(str, "name");
        this.f60769b = i10;
        this.f60770c = str;
        e10 = z1.e(f3.b.f31712e, null, 2, null);
        this.f60771d = e10;
        e11 = z1.e(Boolean.TRUE, null, 2, null);
        this.f60772e = e11;
    }

    @Override // y.n1
    public int a(m2.d dVar) {
        jo.p.h(dVar, "density");
        return e().f31716d;
    }

    @Override // y.n1
    public int b(m2.d dVar) {
        jo.p.h(dVar, "density");
        return e().f31714b;
    }

    @Override // y.n1
    public int c(m2.d dVar, m2.q qVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        return e().f31713a;
    }

    @Override // y.n1
    public int d(m2.d dVar, m2.q qVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        return e().f31715c;
    }

    public final f3.b e() {
        return (f3.b) this.f60771d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f60769b == ((e) obj).f60769b;
    }

    public final int f() {
        return this.f60769b;
    }

    public final boolean g() {
        return ((Boolean) this.f60772e.getValue()).booleanValue();
    }

    public final void h(f3.b bVar) {
        jo.p.h(bVar, "<set-?>");
        this.f60771d.setValue(bVar);
    }

    public int hashCode() {
        return this.f60769b;
    }

    public final void i(boolean z10) {
        this.f60772e.setValue(Boolean.valueOf(z10));
    }

    public final void j(o3.p0 p0Var, int i10) {
        jo.p.h(p0Var, "windowInsetsCompat");
        if (i10 == 0 || (i10 & this.f60769b) != 0) {
            h(p0Var.f(this.f60769b));
            i(p0Var.q(this.f60769b));
        }
    }

    public String toString() {
        return this.f60770c + '(' + e().f31713a + ", " + e().f31714b + ", " + e().f31715c + ", " + e().f31716d + ')';
    }
}
