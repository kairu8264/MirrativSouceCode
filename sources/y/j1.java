package y;

/* loaded from: classes.dex */
public final class j1 implements n1 {

    /* renamed from: b  reason: collision with root package name */
    public final n1 f60830b;

    /* renamed from: c  reason: collision with root package name */
    public final n1 f60831c;

    public j1(n1 n1Var, n1 n1Var2) {
        jo.p.h(n1Var, "first");
        jo.p.h(n1Var2, "second");
        this.f60830b = n1Var;
        this.f60831c = n1Var2;
    }

    @Override // y.n1
    public int a(m2.d dVar) {
        jo.p.h(dVar, "density");
        return Math.max(this.f60830b.a(dVar), this.f60831c.a(dVar));
    }

    @Override // y.n1
    public int b(m2.d dVar) {
        jo.p.h(dVar, "density");
        return Math.max(this.f60830b.b(dVar), this.f60831c.b(dVar));
    }

    @Override // y.n1
    public int c(m2.d dVar, m2.q qVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        return Math.max(this.f60830b.c(dVar, qVar), this.f60831c.c(dVar, qVar));
    }

    @Override // y.n1
    public int d(m2.d dVar, m2.q qVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        return Math.max(this.f60830b.d(dVar, qVar), this.f60831c.d(dVar, qVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            return jo.p.c(j1Var.f60830b, this.f60830b) && jo.p.c(j1Var.f60831c, this.f60831c);
        }
        return false;
    }

    public int hashCode() {
        return this.f60830b.hashCode() + (this.f60831c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f60830b + " ∪ " + this.f60831c + ')';
    }
}
