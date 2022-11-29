package ai;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class yg2 implements y41, v61, qi2, xg.q, h71, l51, nc1 {

    /* renamed from: w  reason: collision with root package name */
    public final fn2 f12590w;

    /* renamed from: x  reason: collision with root package name */
    public final AtomicReference<om> f12591x = new AtomicReference<>();

    /* renamed from: y  reason: collision with root package name */
    public final AtomicReference<qm> f12592y = new AtomicReference<>();

    /* renamed from: z  reason: collision with root package name */
    public final AtomicReference<sm> f12593z = new AtomicReference<>();
    public final AtomicReference<v61> A = new AtomicReference<>();
    public final AtomicReference<xg.q> B = new AtomicReference<>();
    public final AtomicReference<iv> C = new AtomicReference<>();
    public yg2 D = null;

    public yg2(fn2 fn2Var) {
        this.f12590w = fn2Var;
    }

    public static yg2 a(yg2 yg2Var) {
        yg2 yg2Var2 = new yg2(yg2Var.f12590w);
        yg2Var2.D = yg2Var;
        return yg2Var2;
    }

    public final void A() {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.A();
            return;
        }
        this.f12590w.b();
        hi2.a(this.f12592y, sg2.f9830a);
        hi2.a(this.f12593z, tg2.f10289a);
    }

    public final void B(qm qmVar) {
        this.f12592y.set(qmVar);
    }

    @Override // xg.q
    public final void B4() {
    }

    @Override // xg.q
    public final void D5(final int i10) {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.D5(i10);
        } else {
            hi2.a(this.B, new gi2(i10) { // from class: ai.kg2

                /* renamed from: a  reason: collision with root package name */
                public final int f6228a;

                {
                    this.f6228a = i10;
                }

                @Override // ai.gi2
                public final void a(Object obj) {
                    ((xg.q) obj).D5(this.f6228a);
                }
            });
        }
    }

    @Override // xg.q
    public final void c() {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.c();
        } else {
            hi2.a(this.B, mg2.f6937a);
        }
    }

    @Override // xg.q
    public final void d() {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.d();
        } else {
            hi2.a(this.B, lg2.f6561a);
        }
    }

    public final void f(om omVar) {
        this.f12591x.set(omVar);
    }

    @Override // xg.q
    public final void f4() {
    }

    public final void h(sm smVar) {
        this.f12593z.set(smVar);
    }

    @Override // ai.v61
    public final void i0() {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.i0();
        } else {
            hi2.a(this.A, ug2.f10698a);
        }
    }

    @Override // ai.l51
    public final void n(final sr srVar) {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.n(srVar);
        } else {
            hi2.a(this.f12593z, new gi2(srVar) { // from class: ai.og2

                /* renamed from: a  reason: collision with root package name */
                public final sr f7787a;

                {
                    this.f7787a = srVar;
                }

                @Override // ai.gi2
                public final void a(Object obj) {
                    ((sm) obj).x0(this.f7787a);
                }
            });
        }
    }

    @Override // ai.h71
    public final void p(final hs hsVar) {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.p(hsVar);
        } else {
            hi2.a(this.C, new gi2(hsVar) { // from class: ai.jg2

                /* renamed from: a  reason: collision with root package name */
                public final hs f5794a;

                {
                    this.f5794a = hsVar;
                }

                @Override // ai.gi2
                public final void a(Object obj) {
                    ((iv) obj).d4(this.f5794a);
                }
            });
        }
    }

    @Override // ai.qi2
    public final void s(qi2 qi2Var) {
        this.D = (yg2) qi2Var;
    }

    @Override // xg.q
    public final void s0() {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.s0();
            return;
        }
        hi2.a(this.B, vg2.f11081a);
        hi2.a(this.f12593z, wg2.f11611a);
        hi2.a(this.f12593z, xg2.f11934a);
    }

    public final void t(v61 v61Var) {
        this.A.set(v61Var);
    }

    public final void u(xg.q qVar) {
        this.B.set(qVar);
    }

    public final void v(iv ivVar) {
        this.C.set(ivVar);
    }

    public final void y(final lm lmVar) {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.y(lmVar);
        } else {
            hi2.a(this.f12591x, new gi2(lmVar) { // from class: ai.pg2

                /* renamed from: a  reason: collision with root package name */
                public final lm f8408a;

                {
                    this.f8408a = lmVar;
                }

                @Override // ai.gi2
                public final void a(Object obj) {
                    ((om) obj).K5(this.f8408a);
                }
            });
        }
    }

    @Override // ai.y41
    public final void z(final sr srVar) {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.z(srVar);
            return;
        }
        hi2.a(this.f12591x, new gi2(srVar) { // from class: ai.qg2

            /* renamed from: a  reason: collision with root package name */
            public final sr f8941a;

            {
                this.f8941a = srVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((om) obj).Z(this.f8941a);
            }
        });
        hi2.a(this.f12591x, new gi2(srVar) { // from class: ai.rg2

            /* renamed from: a  reason: collision with root package name */
            public final sr f9433a;

            {
                this.f9433a = srVar;
            }

            @Override // ai.gi2
            public final void a(Object obj) {
                ((om) obj).F(this.f9433a.f9916w);
            }
        });
    }

    @Override // ai.nc1
    public final void zzb() {
        yg2 yg2Var = this.D;
        if (yg2Var != null) {
            yg2Var.zzb();
        } else {
            hi2.a(this.f12593z, ng2.f7327a);
        }
    }
}
