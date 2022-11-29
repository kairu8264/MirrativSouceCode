package ai;

/* loaded from: classes3.dex */
public final class xp0 implements xg.q {

    /* renamed from: w  reason: collision with root package name */
    public final rp0 f12054w;

    /* renamed from: x  reason: collision with root package name */
    public final xg.q f12055x;

    public xp0(rp0 rp0Var, xg.q qVar) {
        this.f12054w = rp0Var;
        this.f12055x = qVar;
    }

    @Override // xg.q
    public final void B4() {
    }

    @Override // xg.q
    public final void D5(int i10) {
        xg.q qVar = this.f12055x;
        if (qVar != null) {
            qVar.D5(i10);
        }
        this.f12054w.Q();
    }

    @Override // xg.q
    public final void c() {
        xg.q qVar = this.f12055x;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // xg.q
    public final void d() {
        xg.q qVar = this.f12055x;
        if (qVar != null) {
            qVar.d();
        }
    }

    @Override // xg.q
    public final void f4() {
    }

    @Override // xg.q
    public final void s0() {
        xg.q qVar = this.f12055x;
        if (qVar != null) {
            qVar.s0();
        }
        this.f12054w.W();
    }
}
