package ai;

/* loaded from: classes3.dex */
public final class oz0 implements rn3<gc1<o91>> {

    /* renamed from: a  reason: collision with root package name */
    public final az0 f8176a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<l71> f8177b;

    public oz0(az0 az0Var, eo3<l71> eo3Var) {
        this.f8176a = az0Var;
        this.f8177b = eo3Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        final l71 a10 = ((p01) this.f8177b).a();
        return new gc1(new o91(a10) { // from class: ai.zy0

            /* renamed from: w  reason: collision with root package name */
            public final l71 f13276w;

            {
                this.f13276w = a10;
            }

            @Override // ai.o91
            public final void zza() {
                this.f13276w.b();
            }
        }, hk0.f4883f);
    }
}
