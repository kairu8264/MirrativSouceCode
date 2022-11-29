package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class d52 extends vt {
    public nt A;

    /* renamed from: w  reason: collision with root package name */
    public final Context f3152w;

    /* renamed from: x  reason: collision with root package name */
    public final or0 f3153x;

    /* renamed from: y  reason: collision with root package name */
    public final wl2 f3154y;

    /* renamed from: z  reason: collision with root package name */
    public final xg1 f3155z;

    public d52(or0 or0Var, Context context, String str) {
        wl2 wl2Var = new wl2();
        this.f3154y = wl2Var;
        this.f3155z = new xg1();
        this.f3153x = or0Var;
        wl2Var.L(str);
        this.f3152w = context;
    }

    @Override // ai.wt
    public final void D3(tg.a aVar) {
        this.f3154y.i(aVar);
    }

    @Override // ai.wt
    public final void E5(a00 a00Var) {
        this.f3154y.e(a00Var);
    }

    @Override // ai.wt
    public final void F1(n50 n50Var) {
        this.f3154y.g(n50Var);
    }

    @Override // ai.wt
    public final void N0(String str, q10 q10Var, n10 n10Var) {
        this.f3155z.f(str, q10Var, n10Var);
    }

    @Override // ai.wt
    public final void P4(x10 x10Var) {
        this.f3155z.c(x10Var);
    }

    @Override // ai.wt
    public final void Q3(nt ntVar) {
        this.A = ntVar;
    }

    @Override // ai.wt
    public final void R1(tg.g gVar) {
        this.f3154y.h(gVar);
    }

    @Override // ai.wt
    public final void S3(lu luVar) {
        this.f3154y.o(luVar);
    }

    @Override // ai.wt
    public final void W2(h10 h10Var) {
        this.f3155z.b(h10Var);
    }

    @Override // ai.wt
    public final void a1(x50 x50Var) {
        this.f3155z.e(x50Var);
    }

    @Override // ai.wt
    public final void a3(u10 u10Var, fs fsVar) {
        this.f3155z.d(u10Var);
        this.f3154y.I(fsVar);
    }

    @Override // ai.wt
    public final tt c() {
        zg1 g10 = this.f3155z.g();
        this.f3154y.c(g10.h());
        this.f3154y.d(g10.i());
        wl2 wl2Var = this.f3154y;
        if (wl2Var.K() == null) {
            wl2Var.I(fs.P());
        }
        return new e52(this.f3152w, this.f3153x, this.f3154y, g10, this.A);
    }

    @Override // ai.wt
    public final void y4(k10 k10Var) {
        this.f3155z.a(k10Var);
    }
}
