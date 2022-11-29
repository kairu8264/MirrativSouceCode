package g1;

/* loaded from: classes.dex */
public final class k extends l0.a<j> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar) {
        super(jVar);
        jo.p.h(jVar, "root");
    }

    @Override // l0.e
    public void b(int i10, int i11, int i12) {
        m(a()).i(i10, i11, i12);
    }

    @Override // l0.e
    public void c(int i10, int i11) {
        m(a()).j(i10, i11);
    }

    @Override // l0.a
    public void k() {
        b m10 = m(j());
        m10.j(0, m10.f());
    }

    public final b m(j jVar) {
        if (jVar instanceof b) {
            return (b) jVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // l0.e
    /* renamed from: n */
    public void f(int i10, j jVar) {
        jo.p.h(jVar, "instance");
    }

    @Override // l0.e
    /* renamed from: o */
    public void d(int i10, j jVar) {
        jo.p.h(jVar, "instance");
        m(a()).h(i10, jVar);
    }
}
