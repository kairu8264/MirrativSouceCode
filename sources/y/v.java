package y;

/* loaded from: classes.dex */
public final class v implements n1 {

    /* renamed from: b  reason: collision with root package name */
    public final n1 f60994b;

    /* renamed from: c  reason: collision with root package name */
    public final n1 f60995c;

    public v(n1 n1Var, n1 n1Var2) {
        jo.p.h(n1Var, "included");
        jo.p.h(n1Var2, "excluded");
        this.f60994b = n1Var;
        this.f60995c = n1Var2;
    }

    @Override // y.n1
    public int a(m2.d dVar) {
        jo.p.h(dVar, "density");
        return po.n.d(this.f60994b.a(dVar) - this.f60995c.a(dVar), 0);
    }

    @Override // y.n1
    public int b(m2.d dVar) {
        jo.p.h(dVar, "density");
        return po.n.d(this.f60994b.b(dVar) - this.f60995c.b(dVar), 0);
    }

    @Override // y.n1
    public int c(m2.d dVar, m2.q qVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        return po.n.d(this.f60994b.c(dVar, qVar) - this.f60995c.c(dVar, qVar), 0);
    }

    @Override // y.n1
    public int d(m2.d dVar, m2.q qVar) {
        jo.p.h(dVar, "density");
        jo.p.h(qVar, "layoutDirection");
        return po.n.d(this.f60994b.d(dVar, qVar) - this.f60995c.d(dVar, qVar), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return jo.p.c(vVar.f60994b, this.f60994b) && jo.p.c(vVar.f60995c, this.f60995c);
        }
        return false;
    }

    public int hashCode() {
        return (this.f60994b.hashCode() * 31) + this.f60995c.hashCode();
    }

    public String toString() {
        return '(' + this.f60994b + " - " + this.f60995c + ')';
    }
}
