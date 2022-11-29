package z0;

import wn.v;

/* loaded from: classes.dex */
public final class c implements m2.d {

    /* renamed from: w  reason: collision with root package name */
    public b f62397w = l.f62408a;

    /* renamed from: x  reason: collision with root package name */
    public j f62398x;

    @Override // m2.d
    public float G0() {
        return this.f62397w.getDensity().G0();
    }

    public final long c() {
        return this.f62397w.c();
    }

    public final j d() {
        return this.f62398x;
    }

    public final j e(io.l<? super e1.c, v> lVar) {
        jo.p.h(lVar, "block");
        j jVar = new j(lVar);
        this.f62398x = jVar;
        return jVar;
    }

    @Override // m2.d
    public float getDensity() {
        return this.f62397w.getDensity().getDensity();
    }

    public final m2.q getLayoutDirection() {
        return this.f62397w.getLayoutDirection();
    }

    public final void h(b bVar) {
        jo.p.h(bVar, "<set-?>");
        this.f62397w = bVar;
    }

    public final void k(j jVar) {
        this.f62398x = jVar;
    }
}
