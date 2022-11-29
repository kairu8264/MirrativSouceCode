package ai;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class v02 implements ry1<id1> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10901a;

    /* renamed from: b  reason: collision with root package name */
    public final ym1 f10902b;

    /* renamed from: c  reason: collision with root package name */
    public final ge1 f10903c;

    /* renamed from: d  reason: collision with root package name */
    public final yl2 f10904d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f10905e;

    /* renamed from: f  reason: collision with root package name */
    public final zj0 f10906f;

    /* renamed from: g  reason: collision with root package name */
    public final u30 f10907g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10908h = ((Boolean) ft.c().c(ox.f8059o6)).booleanValue();

    public v02(Context context, zj0 zj0Var, yl2 yl2Var, Executor executor, ge1 ge1Var, ym1 ym1Var, u30 u30Var) {
        this.f10901a = context;
        this.f10904d = yl2Var;
        this.f10903c = ge1Var;
        this.f10905e = executor;
        this.f10906f = zj0Var;
        this.f10902b = ym1Var;
        this.f10907g = u30Var;
    }

    @Override // ai.ry1
    public final s43<id1> a(final sl2 sl2Var, final fl2 fl2Var) {
        final cn1 cn1Var = new cn1();
        s43<id1> i10 = j43.i(j43.a(null), new p33(this, fl2Var, sl2Var, cn1Var) { // from class: ai.q02

            /* renamed from: a  reason: collision with root package name */
            public final v02 f8761a;

            /* renamed from: b  reason: collision with root package name */
            public final fl2 f8762b;

            /* renamed from: c  reason: collision with root package name */
            public final sl2 f8763c;

            /* renamed from: d  reason: collision with root package name */
            public final cn1 f8764d;

            {
                this.f8761a = this;
                this.f8762b = fl2Var;
                this.f8763c = sl2Var;
                this.f8764d = cn1Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f8761a.c(this.f8762b, this.f8763c, this.f8764d, obj);
            }
        }, this.f10905e);
        i10.c(r02.a(cn1Var), this.f10905e);
        return i10;
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        ll2 ll2Var = fl2Var.f4108s;
        return (ll2Var == null || ll2Var.f6613a == null) ? false : true;
    }

    public final /* synthetic */ s43 c(final fl2 fl2Var, sl2 sl2Var, cn1 cn1Var, Object obj) throws Exception {
        final rp0 b10 = this.f10902b.b(this.f10904d.f12651e, fl2Var, sl2Var.f9876b.f9497b);
        b10.Y(fl2Var.S);
        cn1Var.a(this.f10901a, (View) b10);
        mk0 mk0Var = new mk0();
        final jd1 c10 = this.f10903c.c(new j11(sl2Var, fl2Var, null), new md1(new u02(this.f10901a, this.f10906f, mk0Var, fl2Var, b10, this.f10904d, this.f10908h, this.f10907g), b10));
        mk0Var.d(c10);
        c10.d().y0(new p51(b10) { // from class: ai.s02

            /* renamed from: w  reason: collision with root package name */
            public final rp0 f9646w;

            {
                this.f9646w = b10;
            }

            @Override // ai.p51
            public final void f() {
                rp0 rp0Var = this.f9646w;
                if (rp0Var.i0() != null) {
                    rp0Var.i0().g();
                }
            }
        }, hk0.f4883f);
        c10.k().i(b10, true, this.f10908h ? this.f10907g : null);
        c10.k();
        ll2 ll2Var = fl2Var.f4108s;
        return j43.j(xm1.j(b10, ll2Var.f6614b, ll2Var.f6613a), new bx2(this, b10, fl2Var, c10) { // from class: ai.t02

            /* renamed from: a  reason: collision with root package name */
            public final v02 f10062a;

            /* renamed from: b  reason: collision with root package name */
            public final rp0 f10063b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f10064c;

            /* renamed from: d  reason: collision with root package name */
            public final jd1 f10065d;

            {
                this.f10062a = this;
                this.f10063b = b10;
                this.f10064c = fl2Var;
                this.f10065d = c10;
            }

            @Override // ai.bx2
            public final Object apply(Object obj2) {
                rp0 rp0Var = this.f10063b;
                fl2 fl2Var2 = this.f10064c;
                jd1 jd1Var = this.f10065d;
                if (fl2Var2.I) {
                    rp0Var.F();
                }
                rp0Var.B0();
                rp0Var.onPause();
                return jd1Var.h();
            }
        }, this.f10905e);
    }
}
