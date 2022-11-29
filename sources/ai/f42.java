package ai;

/* loaded from: classes3.dex */
public final class f42<AdT> implements ry1<AdT> {

    /* renamed from: a  reason: collision with root package name */
    public final ky f3940a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f3941b;

    /* renamed from: c  reason: collision with root package name */
    public final cq2 f3942c;

    /* renamed from: d  reason: collision with root package name */
    public final o42 f3943d;

    /* JADX WARN: Multi-variable type inference failed */
    public f42(cq2 cq2Var, cq2 cq2Var2, t43 t43Var, ky kyVar, o42 o42Var) {
        this.f3942c = cq2Var;
        this.f3941b = cq2Var2;
        this.f3940a = t43Var;
        this.f3943d = kyVar;
    }

    @Override // ai.ry1
    public final s43<AdT> a(sl2 sl2Var, fl2 fl2Var) {
        mk0 mk0Var = new mk0();
        k42 k42Var = new k42();
        k42Var.c(new e42(this, mk0Var, sl2Var, fl2Var, k42Var));
        ll2 ll2Var = fl2Var.f4108s;
        final fy fyVar = new fy(k42Var, ll2Var.f6614b, ll2Var.f6613a);
        cq2 cq2Var = this.f3942c;
        return np2.d(new gp2(this, fyVar) { // from class: ai.d42

            /* renamed from: a  reason: collision with root package name */
            public final f42 f3136a;

            /* renamed from: b  reason: collision with root package name */
            public final fy f3137b;

            {
                this.f3136a = this;
                this.f3137b = fyVar;
            }

            @Override // ai.gp2
            public final void zza() {
                this.f3136a.c(this.f3137b);
            }
        }, this.f3941b, wp2.CUSTOM_RENDER_SYN, cq2Var).j(wp2.CUSTOM_RENDER_ACK).e(mk0Var).i();
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        ll2 ll2Var;
        return (this.f3940a == null || (ll2Var = fl2Var.f4108s) == null || ll2Var.f6613a == null) ? false : true;
    }

    public final /* synthetic */ void c(fy fyVar) throws Exception {
        this.f3940a.M4(fyVar);
    }
}
