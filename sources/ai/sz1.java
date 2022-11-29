package ai;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class sz1 implements ry1<ty0> {

    /* renamed from: a  reason: collision with root package name */
    public final rz0 f10034a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f10035b;

    /* renamed from: c  reason: collision with root package name */
    public final ym1 f10036c;

    /* renamed from: d  reason: collision with root package name */
    public final yl2 f10037d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f10038e;

    /* renamed from: f  reason: collision with root package name */
    public final bx2<fl2, yg.w> f10039f;

    public sz1(rz0 rz0Var, Context context, Executor executor, ym1 ym1Var, yl2 yl2Var, bx2<fl2, yg.w> bx2Var) {
        this.f10035b = context;
        this.f10034a = rz0Var;
        this.f10038e = executor;
        this.f10036c = ym1Var;
        this.f10037d = yl2Var;
        this.f10039f = bx2Var;
    }

    @Override // ai.ry1
    public final s43<ty0> a(final sl2 sl2Var, final fl2 fl2Var) {
        return j43.i(j43.a(null), new p33(this, sl2Var, fl2Var) { // from class: ai.lz1

            /* renamed from: a  reason: collision with root package name */
            public final sz1 f6734a;

            /* renamed from: b  reason: collision with root package name */
            public final sl2 f6735b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f6736c;

            {
                this.f6734a = this;
                this.f6735b = sl2Var;
                this.f6736c = fl2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f6734a.d(this.f6735b, this.f6736c, obj);
            }
        }, this.f10038e);
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        ll2 ll2Var = fl2Var.f4108s;
        return (ll2Var == null || ll2Var.f6613a == null) ? false : true;
    }

    public final /* synthetic */ void c(rp0 rp0Var) {
        rp0Var.B0();
        nq0 e10 = rp0Var.e();
        uw uwVar = this.f10037d.f12647a;
        if (uwVar == null || e10 == null) {
            return;
        }
        e10.S5(uwVar);
    }

    public final /* synthetic */ s43 d(sl2 sl2Var, fl2 fl2Var, Object obj) throws Exception {
        View bn1Var;
        fs b10 = cm2.b(this.f10035b, fl2Var.f4110u);
        final rp0 b11 = this.f10036c.b(b10, fl2Var, sl2Var.f9876b.f9497b);
        b11.Y(fl2Var.S);
        if (((Boolean) ft.c().c(ox.B5)).booleanValue() && fl2Var.f4087d0) {
            bn1Var = i01.a(this.f10035b, (View) b11, fl2Var);
        } else {
            bn1Var = new bn1(this.f10035b, (View) b11, this.f10039f.apply(fl2Var));
        }
        final uy0 d10 = this.f10034a.d(new j11(sl2Var, fl2Var, null), new az0(bn1Var, b11, mz1.a(b11), cm2.c(b10)));
        d10.i().i(b11, false, null);
        n51 d11 = d10.d();
        p51 p51Var = new p51(b11) { // from class: ai.nz1

            /* renamed from: w  reason: collision with root package name */
            public final rp0 f7586w;

            {
                this.f7586w = b11;
            }

            @Override // ai.p51
            public final void f() {
                rp0 rp0Var = this.f7586w;
                if (rp0Var.i0() != null) {
                    rp0Var.i0().g();
                }
            }
        };
        t43 t43Var = hk0.f4883f;
        d11.y0(p51Var, t43Var);
        d10.i();
        ll2 ll2Var = fl2Var.f4108s;
        s43<?> j10 = xm1.j(b11, ll2Var.f6614b, ll2Var.f6613a);
        if (fl2Var.I) {
            j10.c(pz1.a(b11), this.f10038e);
        }
        j10.c(new Runnable(this, b11) { // from class: ai.qz1

            /* renamed from: w  reason: collision with root package name */
            public final sz1 f9241w;

            /* renamed from: x  reason: collision with root package name */
            public final rp0 f9242x;

            {
                this.f9241w = this;
                this.f9242x = b11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f9241w.c(this.f9242x);
            }
        }, this.f10038e);
        return j43.j(j10, new bx2(d10) { // from class: ai.rz1

            /* renamed from: a  reason: collision with root package name */
            public final uy0 f9636a;

            {
                this.f9636a = d10;
            }

            @Override // ai.bx2
            public final Object apply(Object obj2) {
                return this.f9636a.h();
            }
        }, t43Var);
    }
}
