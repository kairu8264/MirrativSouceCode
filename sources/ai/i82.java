package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class i82 implements rn3<h82> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Executor> f5135a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<fj0> f5136b;

    public i82(eo3<Executor> eo3Var, eo3<fj0> eo3Var2) {
        this.f5135a = eo3Var;
        this.f5136b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new h82(t43Var, this.f5136b.zzb());
    }
}
