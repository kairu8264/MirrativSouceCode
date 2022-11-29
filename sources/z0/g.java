package z0;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: w  reason: collision with root package name */
    public final c f62400w;

    /* renamed from: x  reason: collision with root package name */
    public final io.l<c, j> f62401x;

    /* JADX WARN: Multi-variable type inference failed */
    public g(c cVar, io.l<? super c, j> lVar) {
        jo.p.h(cVar, "cacheDrawScope");
        jo.p.h(lVar, "onBuildDrawCache");
        this.f62400w = cVar;
        this.f62401x = lVar;
    }

    @Override // z0.f
    public void R(b bVar) {
        jo.p.h(bVar, "params");
        c cVar = this.f62400w;
        cVar.h(bVar);
        cVar.k(null);
        this.f62401x.invoke(cVar);
        if (cVar.d() == null) {
            throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return jo.p.c(this.f62400w, gVar.f62400w) && jo.p.c(this.f62401x, gVar.f62401x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f62400w.hashCode() * 31) + this.f62401x.hashCode();
    }

    public String toString() {
        return "DrawContentCacheModifier(cacheDrawScope=" + this.f62400w + ", onBuildDrawCache=" + this.f62401x + ')';
    }

    @Override // z0.h
    public void x0(e1.c cVar) {
        jo.p.h(cVar, "<this>");
        j d10 = this.f62400w.d();
        jo.p.e(d10);
        d10.a().invoke(cVar);
    }
}
