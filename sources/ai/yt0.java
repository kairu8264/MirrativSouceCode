package ai;

/* loaded from: classes3.dex */
public final class yt0 implements eh.p {

    /* renamed from: a  reason: collision with root package name */
    public final bu0 f12725a;

    /* renamed from: b  reason: collision with root package name */
    public g41 f12726b;

    /* renamed from: c  reason: collision with root package name */
    public eh.j0 f12727c;

    public /* synthetic */ yt0(bu0 bu0Var, st0 st0Var) {
        this.f12725a = bu0Var;
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ eh.p a(eh.j0 j0Var) {
        this.f12727c = j0Var;
        return this;
    }

    @Override // eh.p
    public final /* bridge */ /* synthetic */ eh.p d(g41 g41Var) {
        this.f12726b = g41Var;
        return this;
    }

    @Override // eh.p
    public final eh.q zza() {
        zn3.c(this.f12726b, g41.class);
        zn3.c(this.f12727c, eh.j0.class);
        return new zt0(this.f12725a, this.f12727c, new a21(), new cq1(), this.f12726b, new an2(), null, null, null);
    }
}
