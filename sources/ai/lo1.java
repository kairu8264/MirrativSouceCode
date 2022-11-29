package ai;

/* loaded from: classes3.dex */
public final class lo1 implements r71, k61, y41, p51, or, ga1 {

    /* renamed from: w  reason: collision with root package name */
    public final qn f6632w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6633x = false;

    public lo1(qn qnVar, zi2 zi2Var) {
        this.f6632w = qnVar;
        qnVar.c(2);
        if (zi2Var != null) {
            qnVar.c(1101);
        }
    }

    @Override // ai.ga1
    public final void A(final jo joVar) {
        this.f6632w.b(new pn(joVar) { // from class: ai.io1

            /* renamed from: a  reason: collision with root package name */
            public final jo f5308a;

            {
                this.f5308a = joVar;
            }

            @Override // ai.pn
            public final void a(fp fpVar) {
                fpVar.B(this.f5308a);
            }
        });
        this.f6632w.c(1103);
    }

    @Override // ai.ga1
    public final void G0(boolean z10) {
        this.f6632w.c(true != z10 ? 1108 : 1107);
    }

    @Override // ai.ga1
    public final void M(final jo joVar) {
        this.f6632w.b(new pn(joVar) { // from class: ai.jo1

            /* renamed from: a  reason: collision with root package name */
            public final jo f5868a;

            {
                this.f5868a = joVar;
            }

            @Override // ai.pn
            public final void a(fp fpVar) {
                fpVar.B(this.f5868a);
            }
        });
        this.f6632w.c(1102);
    }

    @Override // ai.ga1
    public final void R(final jo joVar) {
        this.f6632w.b(new pn(joVar) { // from class: ai.ko1

            /* renamed from: a  reason: collision with root package name */
            public final jo f6294a;

            {
                this.f6294a = joVar;
            }

            @Override // ai.pn
            public final void a(fp fpVar) {
                fpVar.B(this.f6294a);
            }
        });
        this.f6632w.c(1104);
    }

    @Override // ai.k61
    public final void a() {
        this.f6632w.c(3);
    }

    @Override // ai.p51
    public final synchronized void f() {
        this.f6632w.c(6);
    }

    @Override // ai.ga1
    public final void n(boolean z10) {
        this.f6632w.c(true != z10 ? 1106 : 1105);
    }

    @Override // ai.or
    public final synchronized void onAdClicked() {
        if (this.f6633x) {
            this.f6632w.c(8);
            return;
        }
        this.f6632w.c(7);
        this.f6633x = true;
    }

    @Override // ai.ga1
    public final void p() {
        this.f6632w.c(1109);
    }

    @Override // ai.r71
    public final void s(ie0 ie0Var) {
    }

    @Override // ai.r71
    public final void u(final sl2 sl2Var) {
        this.f6632w.b(new pn(sl2Var) { // from class: ai.ho1

            /* renamed from: a  reason: collision with root package name */
            public final sl2 f4910a;

            {
                this.f4910a = sl2Var;
            }

            @Override // ai.pn
            public final void a(fp fpVar) {
                sl2 sl2Var2 = this.f4910a;
                zn w10 = fpVar.x().w();
                to w11 = fpVar.x().B().w();
                w11.r(sl2Var2.f9876b.f9497b.f6277b);
                w10.s(w11);
                fpVar.y(w10);
            }
        });
    }

    @Override // ai.y41
    public final void z(sr srVar) {
        switch (srVar.f9916w) {
            case 1:
                this.f6632w.c(101);
                return;
            case 2:
                this.f6632w.c(102);
                return;
            case 3:
                this.f6632w.c(5);
                return;
            case 4:
                this.f6632w.c(103);
                return;
            case 5:
                this.f6632w.c(104);
                return;
            case 6:
                this.f6632w.c(105);
                return;
            case 7:
                this.f6632w.c(106);
                return;
            default:
                this.f6632w.c(4);
                return;
        }
    }
}
