package ai;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class a42 implements ry1<ty0> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1740a;

    /* renamed from: b  reason: collision with root package name */
    public final rz0 f1741b;

    /* renamed from: c  reason: collision with root package name */
    public final ky f1742c;

    /* renamed from: d  reason: collision with root package name */
    public final t43 f1743d;

    /* renamed from: e  reason: collision with root package name */
    public final cq2 f1744e;

    public a42(Context context, rz0 rz0Var, cq2 cq2Var, t43 t43Var, ky kyVar) {
        this.f1740a = context;
        this.f1741b = rz0Var;
        this.f1744e = cq2Var;
        this.f1743d = t43Var;
        this.f1742c = kyVar;
    }

    @Override // ai.ry1
    public final s43<ty0> a(sl2 sl2Var, fl2 fl2Var) {
        uy0 d10 = this.f1741b.d(new j11(sl2Var, fl2Var, null), new y32(this, new View(this.f1740a), null, w32.f11479a, fl2Var.f4110u.get(0)));
        z32 k10 = d10.k();
        ll2 ll2Var = fl2Var.f4108s;
        final fy fyVar = new fy(k10, ll2Var.f6614b, ll2Var.f6613a);
        cq2 cq2Var = this.f1744e;
        return np2.d(new gp2(this, fyVar) { // from class: ai.x32

            /* renamed from: a  reason: collision with root package name */
            public final a42 f11860a;

            /* renamed from: b  reason: collision with root package name */
            public final fy f11861b;

            {
                this.f11860a = this;
                this.f11861b = fyVar;
            }

            @Override // ai.gp2
            public final void zza() {
                this.f11860a.c(this.f11861b);
            }
        }, this.f1743d, wp2.CUSTOM_RENDER_SYN, cq2Var).j(wp2.CUSTOM_RENDER_ACK).e(j43.a(d10.h())).i();
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        ll2 ll2Var;
        return (this.f1742c == null || (ll2Var = fl2Var.f4108s) == null || ll2Var.f6613a == null) ? false : true;
    }

    public final /* synthetic */ void c(fy fyVar) throws Exception {
        this.f1742c.M4(fyVar);
    }
}
