package v;

/* loaded from: classes.dex */
public final class k0 implements r1.b {

    /* renamed from: w  reason: collision with root package name */
    public final io.l<b0.p, wn.v> f56236w;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(io.l<? super b0.p, wn.v> lVar) {
        jo.p.h(lVar, "onPinnableParentAvailable");
        this.f56236w = lVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && jo.p.c(((k0) obj).f56236w, this.f56236w);
    }

    public int hashCode() {
        return this.f56236w.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r1.b
    public void j0(r1.e eVar) {
        jo.p.h(eVar, "scope");
        this.f56236w.invoke(eVar.a(b0.q.a()));
    }
}
