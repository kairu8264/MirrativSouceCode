package ai;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class eq2 implements rn3<cq2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f3747a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f3748b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<bq2> f3749c;

    public eq2(eo3<t43> eo3Var, eo3<ScheduledExecutorService> eo3Var2, eo3<bq2> eo3Var3) {
        this.f3747a = eo3Var;
        this.f3748b = eo3Var2;
        this.f3749c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new cq2(t43Var, this.f3748b.zzb(), ((fq2) this.f3749c).zzb());
    }
}
