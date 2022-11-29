package ai;

import com.dena.mirrorman.clientlog.logs.ActionLogBase;

/* loaded from: classes3.dex */
public final class nw1 implements r71, k61, y41, w71 {

    /* renamed from: w  reason: collision with root package name */
    public final mq2 f7543w;

    /* renamed from: x  reason: collision with root package name */
    public final nq2 f7544x;

    /* renamed from: y  reason: collision with root package name */
    public final jj0 f7545y;

    public nw1(mq2 mq2Var, nq2 nq2Var, jj0 jj0Var) {
        this.f7543w = mq2Var;
        this.f7544x = nq2Var;
        this.f7545y = jj0Var;
    }

    @Override // ai.k61
    public final void a() {
        nq2 nq2Var = this.f7544x;
        mq2 mq2Var = this.f7543w;
        mq2Var.c(ActionLogBase.ACTION, "loaded");
        nq2Var.a(mq2Var);
    }

    @Override // ai.w71
    public final void h(boolean z10) {
        if (((Boolean) ft.c().c(ox.f8034l5)).booleanValue()) {
            this.f7543w.c("scar", "true");
        }
    }

    @Override // ai.r71
    public final void s(ie0 ie0Var) {
        this.f7543w.f(ie0Var.f5201w);
    }

    @Override // ai.r71
    public final void u(sl2 sl2Var) {
        this.f7543w.g(sl2Var, this.f7545y);
    }

    @Override // ai.y41
    public final void z(sr srVar) {
        mq2 mq2Var = this.f7543w;
        mq2Var.c(ActionLogBase.ACTION, "ftl");
        mq2Var.c("ftl", String.valueOf(srVar.f9916w));
        mq2Var.c("ed", srVar.f9918y);
        this.f7544x.a(this.f7543w);
    }
}
