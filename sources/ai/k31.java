package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class k31 implements r71 {
    public final tr1 A;

    /* renamed from: w  reason: collision with root package name */
    public final Context f6065w;

    /* renamed from: x  reason: collision with root package name */
    public final yl2 f6066x;

    /* renamed from: y  reason: collision with root package name */
    public final zj0 f6067y;

    /* renamed from: z  reason: collision with root package name */
    public final yg.r1 f6068z;

    public k31(Context context, yl2 yl2Var, zj0 zj0Var, yg.r1 r1Var, tr1 tr1Var) {
        this.f6065w = context;
        this.f6066x = yl2Var;
        this.f6067y = zj0Var;
        this.f6068z = r1Var;
        this.A = tr1Var;
    }

    @Override // ai.r71
    public final void s(ie0 ie0Var) {
        if (((Boolean) ft.c().c(ox.f8095t2)).booleanValue()) {
            wg.t.l().b(this.f6065w, this.f6067y, this.f6066x.f12652f, this.f6068z.n());
        }
        this.A.i();
    }

    @Override // ai.r71
    public final void u(sl2 sl2Var) {
    }
}
