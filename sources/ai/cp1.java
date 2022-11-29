package ai;

import com.dena.mirrorman.clientlog.logs.ActionLogBase;

/* loaded from: classes3.dex */
public final class cp1 implements r71, k61, y41, w71 {

    /* renamed from: w  reason: collision with root package name */
    public final lp1 f2895w;

    /* renamed from: x  reason: collision with root package name */
    public final up1 f2896x;

    public cp1(lp1 lp1Var, up1 up1Var) {
        this.f2895w = lp1Var;
        this.f2896x = up1Var;
    }

    @Override // ai.k61
    public final void a() {
        this.f2895w.c().put(ActionLogBase.ACTION, "loaded");
        this.f2896x.a(this.f2895w.c());
    }

    @Override // ai.w71
    public final void h(boolean z10) {
        if (((Boolean) ft.c().c(ox.f8034l5)).booleanValue()) {
            this.f2895w.c().put("scar", "true");
        }
    }

    @Override // ai.r71
    public final void s(ie0 ie0Var) {
        this.f2895w.b(ie0Var.f5201w);
    }

    @Override // ai.r71
    public final void u(sl2 sl2Var) {
        this.f2895w.a(sl2Var);
    }

    @Override // ai.y41
    public final void z(sr srVar) {
        this.f2895w.c().put(ActionLogBase.ACTION, "ftl");
        this.f2895w.c().put("ftl", String.valueOf(srVar.f9916w));
        this.f2895w.c().put("ed", srVar.f9918y);
        this.f2896x.a(this.f2895w.c());
    }
}
