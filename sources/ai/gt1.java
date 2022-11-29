package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class gt1 implements rn3<gc1<r71>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<uu1> f4571a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f4572b;

    public gt1(eo3<uu1> eo3Var, eo3<Executor> eo3Var2) {
        this.f4571a = eo3Var;
        this.f4572b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        uu1 zzb = ((vu1) this.f4571a).zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new gc1(zzb, t43Var);
    }
}
