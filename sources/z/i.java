package z;

import l0.s0;
import l0.z1;
import m2.g;
import y.d1;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final s0 f62250a;

    /* renamed from: b  reason: collision with root package name */
    public final s0 f62251b;

    public i() {
        s0 e10;
        s0 e11;
        g.a aVar = m2.g.f40516x;
        e10 = z1.e(m2.g.e(aVar.b()), null, 2, null);
        this.f62250a = e10;
        e11 = z1.e(m2.g.e(aVar.b()), null, 2, null);
        this.f62251b = e11;
    }

    @Override // z.h
    public x0.f c(x0.f fVar, float f10) {
        jo.p.h(fVar, "<this>");
        return d1.y(fVar, m2.g.l(f() * f10));
    }

    @Override // z.h
    public x0.f d(x0.f fVar, float f10) {
        jo.p.h(fVar, "<this>");
        return d1.o(fVar, m2.g.l(e() * f10));
    }

    public final float e() {
        return ((m2.g) this.f62251b.getValue()).q();
    }

    public final float f() {
        return ((m2.g) this.f62250a.getValue()).q();
    }

    public final void g(float f10) {
        this.f62251b.setValue(m2.g.e(f10));
    }

    public final void h(float f10) {
        this.f62250a.setValue(m2.g.e(f10));
    }
}
