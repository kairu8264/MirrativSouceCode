package v;

/* loaded from: classes.dex */
public final class t implements r1.b, q1.i0 {

    /* renamed from: w  reason: collision with root package name */
    public io.l<? super q1.q, wn.v> f56396w;

    /* renamed from: x  reason: collision with root package name */
    public q1.q f56397x;

    public final void a() {
        io.l<? super q1.q, wn.v> lVar;
        q1.q qVar = this.f56397x;
        if (qVar != null) {
            jo.p.e(qVar);
            if (!qVar.h() || (lVar = this.f56396w) == null) {
                return;
            }
            lVar.invoke(this.f56397x);
        }
    }

    @Override // q1.i0
    public void a0(q1.q qVar) {
        jo.p.h(qVar, "coordinates");
        this.f56397x = qVar;
        if (qVar.h()) {
            a();
            return;
        }
        io.l<? super q1.q, wn.v> lVar = this.f56396w;
        if (lVar != null) {
            lVar.invoke(null);
        }
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        io.l<? super q1.q, wn.v> lVar;
        jo.p.h(eVar, "scope");
        io.l<? super q1.q, wn.v> lVar2 = (io.l) eVar.a(s.a());
        if (lVar2 == null && (lVar = this.f56396w) != null) {
            lVar.invoke(null);
        }
        this.f56396w = lVar2;
    }
}
