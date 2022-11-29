package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class nz0 implements rn3<gc1<vk>> {

    /* renamed from: a  reason: collision with root package name */
    public final az0 f7583a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<q01> f7584b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f7585c;

    public nz0(az0 az0Var, eo3<q01> eo3Var, eo3<Executor> eo3Var2) {
        this.f7583a = az0Var;
        this.f7584b = eo3Var;
        this.f7585c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new gc1(this.f7584b.zzb(), t43Var);
    }
}
