package y;

/* loaded from: classes.dex */
public final class o implements n, k {

    /* renamed from: a  reason: collision with root package name */
    public final m2.d f60858a;

    /* renamed from: b  reason: collision with root package name */
    public final long f60859b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f60860c;

    public o(m2.d dVar, long j10) {
        this.f60858a = dVar;
        this.f60859b = j10;
        this.f60860c = l.f60836a;
    }

    public /* synthetic */ o(m2.d dVar, long j10, jo.h hVar) {
        this(dVar, j10);
    }

    @Override // y.k
    public x0.f a(x0.f fVar, x0.a aVar) {
        jo.p.h(fVar, "<this>");
        jo.p.h(aVar, "alignment");
        return this.f60860c.a(fVar, aVar);
    }

    @Override // y.n
    public long b() {
        return this.f60859b;
    }

    @Override // y.k
    public x0.f c(x0.f fVar) {
        jo.p.h(fVar, "<this>");
        return this.f60860c.c(fVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return jo.p.c(this.f60858a, oVar.f60858a) && m2.b.g(b(), oVar.b());
        }
        return false;
    }

    public int hashCode() {
        return (this.f60858a.hashCode() * 31) + m2.b.q(b());
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f60858a + ", constraints=" + ((Object) m2.b.s(b())) + ')';
    }
}
