package ai;

/* loaded from: classes3.dex */
public final class ot0 implements fe1 {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f7901a;

    /* renamed from: b  reason: collision with root package name */
    public ma1 f7902b;

    /* renamed from: c  reason: collision with root package name */
    public g41 f7903c;

    /* renamed from: d  reason: collision with root package name */
    public h42 f7904d;

    /* renamed from: e  reason: collision with root package name */
    public zi2 f7905e;

    /* renamed from: f  reason: collision with root package name */
    public zh2 f7906f;

    public /* synthetic */ ot0(bu0 bu0Var, st0 st0Var) {
        this.f7901a = bu0Var;
    }

    @Override // ai.fe1
    public final /* bridge */ /* synthetic */ fe1 d(g41 g41Var) {
        this.f7903c = g41Var;
        return this;
    }

    @Override // ai.fe1
    public final /* bridge */ /* synthetic */ fe1 l(h42 h42Var) {
        this.f7904d = h42Var;
        return this;
    }

    @Override // ai.c41
    public final /* bridge */ /* synthetic */ c41<ge1> m(zi2 zi2Var) {
        this.f7905e = zi2Var;
        return this;
    }

    @Override // ai.c41
    public final /* bridge */ /* synthetic */ c41<ge1> o(zh2 zh2Var) {
        this.f7906f = zh2Var;
        return this;
    }

    @Override // ai.fe1
    public final /* bridge */ /* synthetic */ fe1 s(ma1 ma1Var) {
        this.f7902b = ma1Var;
        return this;
    }

    @Override // ai.c41
    /* renamed from: zza */
    public final ge1 a() {
        zn3.c(this.f7902b, ma1.class);
        zn3.c(this.f7903c, g41.class);
        zn3.c(this.f7904d, h42.class);
        return new pt0(this.f7901a, new a21(), new wm2(), new m31(), new cq1(), this.f7902b, this.f7903c, new an2(), this.f7904d, null, this.f7905e, this.f7906f, null);
    }
}
