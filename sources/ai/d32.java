package ai;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class d32 implements ry1<cm1> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3117a;

    /* renamed from: b  reason: collision with root package name */
    public final ym1 f3118b;

    /* renamed from: c  reason: collision with root package name */
    public final hm1 f3119c;

    /* renamed from: d  reason: collision with root package name */
    public final yl2 f3120d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f3121e;

    /* renamed from: f  reason: collision with root package name */
    public final zj0 f3122f;

    /* renamed from: g  reason: collision with root package name */
    public final u30 f3123g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3124h = ((Boolean) ft.c().c(ox.f8059o6)).booleanValue();

    public d32(Context context, zj0 zj0Var, yl2 yl2Var, Executor executor, hm1 hm1Var, ym1 ym1Var, u30 u30Var) {
        this.f3117a = context;
        this.f3120d = yl2Var;
        this.f3119c = hm1Var;
        this.f3121e = executor;
        this.f3122f = zj0Var;
        this.f3118b = ym1Var;
        this.f3123g = u30Var;
    }

    @Override // ai.ry1
    public final s43<cm1> a(final sl2 sl2Var, final fl2 fl2Var) {
        final cn1 cn1Var = new cn1();
        s43<cm1> i10 = j43.i(j43.a(null), new p33(this, fl2Var, sl2Var, cn1Var) { // from class: ai.w22

            /* renamed from: a  reason: collision with root package name */
            public final d32 f11468a;

            /* renamed from: b  reason: collision with root package name */
            public final fl2 f11469b;

            /* renamed from: c  reason: collision with root package name */
            public final sl2 f11470c;

            /* renamed from: d  reason: collision with root package name */
            public final cn1 f11471d;

            {
                this.f11468a = this;
                this.f11469b = fl2Var;
                this.f11470c = sl2Var;
                this.f11471d = cn1Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f11468a.c(this.f11469b, this.f11470c, this.f11471d, obj);
            }
        }, this.f3121e);
        i10.c(x22.a(cn1Var), this.f3121e);
        return i10;
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        ll2 ll2Var = fl2Var.f4108s;
        return (ll2Var == null || ll2Var.f6613a == null) ? false : true;
    }

    public final /* synthetic */ s43 c(final fl2 fl2Var, sl2 sl2Var, cn1 cn1Var, Object obj) throws Exception {
        final rp0 b10 = this.f3118b.b(this.f3120d.f12651e, fl2Var, sl2Var.f9876b.f9497b);
        b10.Y(fl2Var.S);
        cn1Var.a(this.f3117a, (View) b10);
        mk0 mk0Var = new mk0();
        final dm1 b11 = this.f3119c.b(new j11(sl2Var, fl2Var, null), new em1(new c32(this.f3117a, this.f3118b, this.f3120d, this.f3122f, fl2Var, mk0Var, b10, this.f3123g, this.f3124h), b10));
        mk0Var.d(b11);
        i40.b(b10, b11.k());
        b11.d().y0(new p51(b10) { // from class: ai.y22

            /* renamed from: w  reason: collision with root package name */
            public final rp0 f12426w;

            {
                this.f12426w = b10;
            }

            @Override // ai.p51
            public final void f() {
                rp0 rp0Var = this.f12426w;
                if (rp0Var.i0() != null) {
                    rp0Var.i0().g();
                }
            }
        }, hk0.f4883f);
        b11.l().i(b10, true, this.f3124h ? this.f3123g : null);
        b11.l();
        ll2 ll2Var = fl2Var.f4108s;
        return j43.j(xm1.j(b10, ll2Var.f6614b, ll2Var.f6613a), new bx2(this, b10, fl2Var, b11) { // from class: ai.z22

            /* renamed from: a  reason: collision with root package name */
            public final d32 f12838a;

            /* renamed from: b  reason: collision with root package name */
            public final rp0 f12839b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f12840c;

            /* renamed from: d  reason: collision with root package name */
            public final dm1 f12841d;

            {
                this.f12838a = this;
                this.f12839b = b10;
                this.f12840c = fl2Var;
                this.f12841d = b11;
            }

            @Override // ai.bx2
            public final Object apply(Object obj2) {
                rp0 rp0Var = this.f12839b;
                fl2 fl2Var2 = this.f12840c;
                dm1 dm1Var = this.f12841d;
                if (fl2Var2.I) {
                    rp0Var.F();
                }
                rp0Var.B0();
                rp0Var.onPause();
                return dm1Var.h();
            }
        }, this.f3121e);
    }
}
