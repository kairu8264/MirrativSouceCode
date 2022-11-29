package ai;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class jz1 implements ry1<by0> {

    /* renamed from: a  reason: collision with root package name */
    public final vx0 f5983a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f5984b;

    /* renamed from: c  reason: collision with root package name */
    public final ym1 f5985c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f5986d;

    public jz1(vx0 vx0Var, Context context, Executor executor, ym1 ym1Var) {
        this.f5984b = context;
        this.f5983a = vx0Var;
        this.f5986d = executor;
        this.f5985c = ym1Var;
    }

    @Override // ai.ry1
    public final s43<by0> a(final sl2 sl2Var, final fl2 fl2Var) {
        return j43.i(j43.a(null), new p33(this, sl2Var, fl2Var) { // from class: ai.gz1

            /* renamed from: a  reason: collision with root package name */
            public final jz1 f4661a;

            /* renamed from: b  reason: collision with root package name */
            public final sl2 f4662b;

            /* renamed from: c  reason: collision with root package name */
            public final fl2 f4663c;

            {
                this.f4661a = this;
                this.f4662b = sl2Var;
                this.f4663c = fl2Var;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f4661a.c(this.f4662b, this.f4663c, obj);
            }
        }, this.f5986d);
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        ll2 ll2Var = fl2Var.f4108s;
        return (ll2Var == null || ll2Var.f6613a == null) ? false : true;
    }

    public final /* synthetic */ s43 c(sl2 sl2Var, fl2 fl2Var, Object obj) throws Exception {
        fs b10 = cm2.b(this.f5984b, fl2Var.f4110u);
        final rp0 b11 = this.f5985c.b(b10, fl2Var, sl2Var.f9876b.f9497b);
        final ox0 a10 = this.f5983a.a(new j11(sl2Var, fl2Var, null), new px0((View) b11, b11, cm2.c(b10), fl2Var.W, fl2Var.f4081a0, fl2Var.K));
        a10.i().i(b11, false, null);
        n51 d10 = a10.d();
        p51 p51Var = new p51(b11) { // from class: ai.hz1

            /* renamed from: w  reason: collision with root package name */
            public final rp0 f5051w;

            {
                this.f5051w = b11;
            }

            @Override // ai.p51
            public final void f() {
                rp0 rp0Var = this.f5051w;
                if (rp0Var.i0() != null) {
                    rp0Var.i0().g();
                }
            }
        };
        t43 t43Var = hk0.f4883f;
        d10.y0(p51Var, t43Var);
        a10.i();
        ll2 ll2Var = fl2Var.f4108s;
        return j43.j(xm1.j(b11, ll2Var.f6614b, ll2Var.f6613a), new bx2(a10) { // from class: ai.iz1

            /* renamed from: a  reason: collision with root package name */
            public final ox0 f5456a;

            {
                this.f5456a = a10;
            }

            @Override // ai.bx2
            public final Object apply(Object obj2) {
                return this.f5456a.h();
            }
        }, t43Var);
    }
}
