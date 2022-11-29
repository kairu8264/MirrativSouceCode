package ai;

/* loaded from: classes3.dex */
public final class i21 implements k61, or, r71, p51, v41, ga1 {

    /* renamed from: w  reason: collision with root package name */
    public final vh.f f5096w;

    /* renamed from: x  reason: collision with root package name */
    public final yi0 f5097x;

    public i21(vh.f fVar, yi0 yi0Var) {
        this.f5096w = fVar;
        this.f5097x = yi0Var;
    }

    @Override // ai.ga1
    public final void A(jo joVar) {
        this.f5097x.c();
    }

    @Override // ai.v41
    public final void B(ye0 ye0Var, String str, String str2) {
    }

    @Override // ai.ga1
    public final void G0(boolean z10) {
    }

    @Override // ai.ga1
    public final void M(jo joVar) {
    }

    @Override // ai.ga1
    public final void R(jo joVar) {
        this.f5097x.d();
    }

    @Override // ai.k61
    public final void a() {
        this.f5097x.i(true);
    }

    public final void c(as asVar) {
        this.f5097x.b(asVar);
    }

    @Override // ai.v41
    public final void e() {
    }

    @Override // ai.p51
    public final void f() {
        this.f5097x.f();
    }

    @Override // ai.v41
    public final void g() {
    }

    @Override // ai.v41
    public final void h() {
        this.f5097x.h();
    }

    @Override // ai.v41
    public final void j() {
    }

    @Override // ai.v41
    public final void k() {
    }

    @Override // ai.ga1
    public final void n(boolean z10) {
    }

    @Override // ai.or
    public final void onAdClicked() {
        this.f5097x.g();
    }

    @Override // ai.ga1
    public final void p() {
    }

    @Override // ai.r71
    public final void s(ie0 ie0Var) {
    }

    public final String t() {
        return this.f5097x.k();
    }

    @Override // ai.r71
    public final void u(sl2 sl2Var) {
        this.f5097x.e(this.f5096w.elapsedRealtime());
    }
}
