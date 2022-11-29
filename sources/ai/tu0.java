package ai;

/* loaded from: classes3.dex */
public final class tu0 implements rn3<yj0> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<l80> f10468a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<String> f10469b;

    public tu0(eo3<l80> eo3Var, eo3<String> eo3Var2) {
        this.f10468a = eo3Var;
        this.f10469b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        n80 n80Var = new n80();
        String zzb = this.f10469b.zzb();
        if (dz.f3458a.e().booleanValue()) {
            return new m80(n80Var, zzb);
        }
        return new yj0(zzb);
    }
}
