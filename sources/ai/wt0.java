package ai;

/* loaded from: classes3.dex */
public final class wt0 implements gm1 {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f11743a;

    /* renamed from: b  reason: collision with root package name */
    public ma1 f11744b;

    /* renamed from: c  reason: collision with root package name */
    public g41 f11745c;

    /* renamed from: d  reason: collision with root package name */
    public zi2 f11746d;

    /* renamed from: e  reason: collision with root package name */
    public zh2 f11747e;

    public /* synthetic */ wt0(bu0 bu0Var, st0 st0Var) {
        this.f11743a = bu0Var;
    }

    @Override // ai.c41
    public final /* bridge */ /* synthetic */ c41<hm1> m(zi2 zi2Var) {
        this.f11746d = zi2Var;
        return this;
    }

    @Override // ai.gm1
    public final /* bridge */ /* synthetic */ gm1 n(g41 g41Var) {
        this.f11745c = g41Var;
        return this;
    }

    @Override // ai.c41
    public final /* bridge */ /* synthetic */ c41<hm1> o(zh2 zh2Var) {
        this.f11747e = zh2Var;
        return this;
    }

    @Override // ai.gm1
    public final /* bridge */ /* synthetic */ gm1 q(ma1 ma1Var) {
        this.f11744b = ma1Var;
        return this;
    }

    @Override // ai.c41
    /* renamed from: zza */
    public final hm1 a() {
        zn3.c(this.f11744b, ma1.class);
        zn3.c(this.f11745c, g41.class);
        return new xt0(this.f11743a, new a21(), new wm2(), new m31(), new cq1(), this.f11744b, this.f11745c, new an2(), null, this.f11746d, this.f11747e, null);
    }
}
