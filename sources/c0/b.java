package c0;

import jo.p;
import q1.l0;
import q1.q;

/* loaded from: classes.dex */
public abstract class b implements r1.b, l0 {

    /* renamed from: w  reason: collision with root package name */
    public final d f18595w;

    /* renamed from: x  reason: collision with root package name */
    public d f18596x;

    /* renamed from: y  reason: collision with root package name */
    public q f18597y;

    public b(d dVar) {
        p.h(dVar, "defaultParent");
        this.f18595w = dVar;
    }

    @Override // q1.l0
    public void T(q qVar) {
        p.h(qVar, "coordinates");
        this.f18597y = qVar;
    }

    public final q b() {
        q qVar = this.f18597y;
        if (qVar == null || !qVar.h()) {
            return null;
        }
        return qVar;
    }

    public final d c() {
        d dVar = this.f18596x;
        return dVar == null ? this.f18595w : dVar;
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        p.h(eVar, "scope");
        this.f18596x = (d) eVar.a(c.a());
    }
}
