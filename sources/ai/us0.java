package ai;

/* loaded from: classes3.dex */
public final class us0 implements fy0 {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f10818a;

    /* renamed from: b  reason: collision with root package name */
    public ma1 f10819b;

    /* renamed from: c  reason: collision with root package name */
    public g41 f10820c;

    /* renamed from: d  reason: collision with root package name */
    public zi2 f10821d;

    /* renamed from: e  reason: collision with root package name */
    public zh2 f10822e;

    public /* synthetic */ us0(bu0 bu0Var, st0 st0Var) {
        this.f10818a = bu0Var;
    }

    @Override // ai.c41
    public final /* bridge */ /* synthetic */ gy0 a() {
        zn3.c(this.f10819b, ma1.class);
        zn3.c(this.f10820c, g41.class);
        return new vs0(this.f10818a, new a21(), new wm2(), new m31(), new cq1(), this.f10819b, this.f10820c, new an2(), null, this.f10821d, this.f10822e, null);
    }

    @Override // ai.fy0
    public final /* bridge */ /* synthetic */ fy0 b(g41 g41Var) {
        this.f10820c = g41Var;
        return this;
    }

    @Override // ai.fy0
    public final /* bridge */ /* synthetic */ fy0 c(ma1 ma1Var) {
        this.f10819b = ma1Var;
        return this;
    }

    @Override // ai.c41
    public final /* bridge */ /* synthetic */ c41<gy0> m(zi2 zi2Var) {
        this.f10821d = zi2Var;
        return this;
    }

    @Override // ai.c41
    public final /* bridge */ /* synthetic */ c41<gy0> o(zh2 zh2Var) {
        this.f10822e = zh2Var;
        return this;
    }
}
