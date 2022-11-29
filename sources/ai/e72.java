package ai;

/* loaded from: classes3.dex */
public final class e72 implements xc2<f72> {

    /* renamed from: a  reason: collision with root package name */
    public final vh.f f3578a;

    /* renamed from: b  reason: collision with root package name */
    public final yl2 f3579b;

    public e72(vh.f fVar, yl2 yl2Var) {
        this.f3578a = fVar;
        this.f3579b = yl2Var;
    }

    @Override // ai.xc2
    public final s43<f72> zza() {
        return j43.a(new f72(this.f3579b, this.f3578a.currentTimeMillis()));
    }
}
