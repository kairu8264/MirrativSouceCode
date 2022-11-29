package ai;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class dz1 implements ry1<my0> {

    /* renamed from: a  reason: collision with root package name */
    public final gy0 f3460a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3461b;

    /* renamed from: c  reason: collision with root package name */
    public final ym1 f3462c;

    /* renamed from: d  reason: collision with root package name */
    public final yl2 f3463d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f3464e;

    /* renamed from: f  reason: collision with root package name */
    public final zj0 f3465f;

    /* renamed from: g  reason: collision with root package name */
    public final u30 f3466g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3467h = ((Boolean) ft.c().c(ox.f8059o6)).booleanValue();

    public dz1(gy0 gy0Var, Context context, Executor executor, ym1 ym1Var, yl2 yl2Var, zj0 zj0Var, u30 u30Var) {
        this.f3461b = context;
        this.f3460a = gy0Var;
        this.f3464e = executor;
        this.f3462c = ym1Var;
        this.f3463d = yl2Var;
        this.f3465f = zj0Var;
        this.f3466g = u30Var;
    }

    @Override // ai.ry1
    public final s43<my0> a(final sl2 sl2Var, final fl2 fl2Var) {
        final cn1 cn1Var = new cn1();
        s43<my0> i10 = j43.i(j43.a(null), new p33(this, fl2Var, sl2Var, cn1Var) { // from class: ai.zy1

            /* renamed from: a  reason: collision with root package name */
            public final dz1 f13277a;

            /* renamed from: b  reason: collision with root package name */
            public final fl2 f13278b;

            /* renamed from: c  reason: collision with root package name */
            public final sl2 f13279c;

            /* renamed from: d  reason: collision with root package name */
            public final cn1 f13280d;

            {
                this.f13277a = this;
                this.f13278b = fl2Var;
                this.f13279c = sl2Var;
                this.f13280d = cn1Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f13277a.c(this.f13278b, this.f13279c, this.f13280d, obj);
            }
        }, this.f3464e);
        i10.c(az1.a(cn1Var), this.f3464e);
        return i10;
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        ll2 ll2Var = fl2Var.f4108s;
        return (ll2Var == null || ll2Var.f6613a == null) ? false : true;
    }

    public final /* synthetic */ s43 c(final fl2 fl2Var, sl2 sl2Var, cn1 cn1Var, Object obj) throws Exception {
        final rp0 b10 = this.f3462c.b(this.f3463d.f12651e, fl2Var, sl2Var.f9876b.f9497b);
        b10.Y(fl2Var.S);
        cn1Var.a(this.f3461b, (View) b10);
        mk0 mk0Var = new mk0();
        final dy0 a10 = this.f3460a.a(new j11(sl2Var, fl2Var, null), new md1(new fz1(this.f3465f, mk0Var, fl2Var, b10, this.f3463d, this.f3467h, this.f3466g), b10), new ey0(fl2Var.W));
        a10.i().i(b10, false, this.f3467h ? this.f3466g : null);
        mk0Var.d(a10);
        a10.d().y0(new p51(b10) { // from class: ai.bz1

            /* renamed from: w  reason: collision with root package name */
            public final rp0 f2639w;

            {
                this.f2639w = b10;
            }

            @Override // ai.p51
            public final void f() {
                rp0 rp0Var = this.f2639w;
                if (rp0Var.i0() != null) {
                    rp0Var.i0().g();
                }
            }
        }, hk0.f4883f);
        a10.i();
        ll2 ll2Var = fl2Var.f4108s;
        return j43.j(xm1.j(b10, ll2Var.f6614b, ll2Var.f6613a), new bx2(this, b10, fl2Var, a10) { // from class: ai.cz1

            /* renamed from: a  reason: collision with root package name */
            public final dz1 f3079a;

            /* renamed from: b  reason: collision with root package name */
            public final rp0 f3080b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f3081c;

            /* renamed from: d  reason: collision with root package name */
            public final dy0 f3082d;

            {
                this.f3079a = this;
                this.f3080b = b10;
                this.f3081c = fl2Var;
                this.f3082d = a10;
            }

            @Override // ai.bx2
            public final Object apply(Object obj2) {
                rp0 rp0Var = this.f3080b;
                fl2 fl2Var2 = this.f3081c;
                dy0 dy0Var = this.f3082d;
                if (fl2Var2.I) {
                    rp0Var.F();
                }
                rp0Var.B0();
                rp0Var.onPause();
                return dy0Var.h();
            }
        }, this.f3464e);
    }
}
