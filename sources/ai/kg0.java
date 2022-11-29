package ai;

/* loaded from: classes3.dex */
public final class kg0 extends uf0 {

    /* renamed from: w  reason: collision with root package name */
    public rg.l f6207w;

    /* renamed from: x  reason: collision with root package name */
    public rg.q f6208x;

    @Override // ai.vf0
    public final void G2(pf0 pf0Var) {
        rg.q qVar = this.f6208x;
        if (qVar != null) {
            qVar.a(new dg0(pf0Var));
        }
    }

    @Override // ai.vf0
    public final void Q4(sr srVar) {
        rg.l lVar = this.f6207w;
        if (lVar != null) {
            lVar.c(srVar.p());
        }
    }

    public final void R5(rg.l lVar) {
        this.f6207w = lVar;
    }

    public final void S5(rg.q qVar) {
        this.f6208x = qVar;
    }

    @Override // ai.vf0
    public final void a() {
        rg.l lVar = this.f6207w;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // ai.vf0
    public final void c() {
        rg.l lVar = this.f6207w;
        if (lVar != null) {
            lVar.e();
        }
    }

    @Override // ai.vf0
    public final void c0(int i10) {
    }

    @Override // ai.vf0
    public final void g() {
        rg.l lVar = this.f6207w;
        if (lVar != null) {
            lVar.d();
        }
    }

    @Override // ai.vf0
    public final void i() {
        rg.l lVar = this.f6207w;
        if (lVar != null) {
            lVar.a();
        }
    }
}
