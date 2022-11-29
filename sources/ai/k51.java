package ai;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class k51 implements rn3<i51> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<h51> f6090a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Set<gc1<z41>>> f6091b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f6092c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f6093d;

    public k51(eo3<h51> eo3Var, eo3<Set<gc1<z41>>> eo3Var2, eo3<Executor> eo3Var3, eo3<ScheduledExecutorService> eo3Var4) {
        this.f6090a = eo3Var;
        this.f6091b = eo3Var2;
        this.f6092c = eo3Var3;
        this.f6093d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        h51 zzb = ((j51) this.f6090a).zzb();
        Set zzb2 = ((co3) this.f6091b).zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new i51(zzb, zzb2, t43Var, this.f6093d.zzb());
    }
}
