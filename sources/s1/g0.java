package s1;

/* loaded from: classes.dex */
public final class g0 extends l0.a<k> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k kVar) {
        super(kVar);
        jo.p.h(kVar, "root");
    }

    @Override // l0.e
    public void b(int i10, int i11, int i12) {
        a().S0(i10, i11, i12);
    }

    @Override // l0.e
    public void c(int i10, int i11) {
        a().f1(i10, i11);
    }

    @Override // l0.e
    public void e() {
        super.e();
        y t02 = j().t0();
        if (t02 != null) {
            t02.v();
        }
    }

    @Override // l0.a
    public void k() {
        j().e1();
    }

    @Override // l0.e
    /* renamed from: m */
    public void f(int i10, k kVar) {
        jo.p.h(kVar, "instance");
        a().H0(i10, kVar);
    }

    @Override // l0.e
    /* renamed from: n */
    public void d(int i10, k kVar) {
        jo.p.h(kVar, "instance");
    }
}
