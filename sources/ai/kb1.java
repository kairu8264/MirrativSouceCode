package ai;

/* loaded from: classes3.dex */
public final class kb1 implements rn3<f22> {

    /* renamed from: a  reason: collision with root package name */
    public final ma1 f6155a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<vh.f> f6156b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<g22> f6157c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<vy1> f6158d;

    public kb1(ma1 ma1Var, eo3<vh.f> eo3Var, eo3<g22> eo3Var2, eo3<vy1> eo3Var3) {
        this.f6155a = ma1Var;
        this.f6156b = eo3Var;
        this.f6157c = eo3Var2;
        this.f6158d = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        f22 q10 = this.f6155a.q(this.f6156b.zzb(), ((h22) this.f6157c).zzb(), this.f6158d.zzb());
        zn3.b(q10);
        return q10;
    }
}
