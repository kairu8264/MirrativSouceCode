package v;

/* loaded from: classes.dex */
public final class u implements r1.b, r1.d<io.l<? super q1.q, ? extends wn.v>>, io.l<q1.q, wn.v> {

    /* renamed from: w  reason: collision with root package name */
    public final io.l<q1.q, wn.v> f56398w;

    /* renamed from: x  reason: collision with root package name */
    public io.l<? super q1.q, wn.v> f56399x;

    /* renamed from: y  reason: collision with root package name */
    public q1.q f56400y;

    /* JADX WARN: Multi-variable type inference failed */
    public u(io.l<? super q1.q, wn.v> lVar) {
        jo.p.h(lVar, "handler");
        this.f56398w = lVar;
    }

    @Override // r1.d
    /* renamed from: a */
    public io.l<q1.q, wn.v> getValue() {
        return this;
    }

    public void b(q1.q qVar) {
        this.f56400y = qVar;
        this.f56398w.invoke(qVar);
        io.l<? super q1.q, wn.v> lVar = this.f56399x;
        if (lVar != null) {
            lVar.invoke(qVar);
        }
    }

    @Override // r1.d
    public r1.f<io.l<? super q1.q, ? extends wn.v>> getKey() {
        return s.a();
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(q1.q qVar) {
        b(qVar);
        return wn.v.f59242a;
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        jo.p.h(eVar, "scope");
        io.l<? super q1.q, wn.v> lVar = (io.l) eVar.a(s.a());
        if (jo.p.c(lVar, this.f56399x)) {
            return;
        }
        this.f56399x = lVar;
    }
}
