package y;

/* loaded from: classes.dex */
public final class i0 implements n1 {

    /* renamed from: b  reason: collision with root package name */
    public final n1 f60809b;

    /* renamed from: c  reason: collision with root package name */
    public final int f60810c;

    public i0(n1 n1Var, int i10) {
        this.f60809b = n1Var;
        this.f60810c = i10;
    }

    public /* synthetic */ i0(n1 n1Var, int i10, jo.h hVar) {
        this(n1Var, i10);
    }

    @Override // y.n1
    public int a(m2.d dVar) {
        jo.p.h(dVar, "density");
        if (u1.m(this.f60810c, u1.f60981a.e())) {
            return this.f60809b.a(dVar);
        }
        return 0;
    }

    @Override // y.n1
    public int b(m2.d dVar) {
        jo.p.h(dVar, "density");
        if (u1.m(this.f60810c, u1.f60981a.j())) {
            return this.f60809b.b(dVar);
        }
        return 0;
    }

    @Override // y.n1
    public int c(m2.d dVar, m2.q qVar) {
        int b10;
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        if (qVar == m2.q.Ltr) {
            b10 = u1.f60981a.a();
        } else {
            b10 = u1.f60981a.b();
        }
        if (u1.m(this.f60810c, b10)) {
            return this.f60809b.c(dVar, qVar);
        }
        return 0;
    }

    @Override // y.n1
    public int d(m2.d dVar, m2.q qVar) {
        int d10;
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        if (qVar == m2.q.Ltr) {
            d10 = u1.f60981a.c();
        } else {
            d10 = u1.f60981a.d();
        }
        if (u1.m(this.f60810c, d10)) {
            return this.f60809b.d(dVar, qVar);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return jo.p.c(this.f60809b, i0Var.f60809b) && u1.l(this.f60810c, i0Var.f60810c);
        }
        return false;
    }

    public int hashCode() {
        return (this.f60809b.hashCode() * 31) + u1.n(this.f60810c);
    }

    public String toString() {
        return '(' + this.f60809b + " only " + ((Object) u1.p(this.f60810c)) + ')';
    }
}
