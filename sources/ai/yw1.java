package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class yw1 implements rn3<gc1<dq2>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<kx1> f12759a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f12760b;

    public yw1(eo3<kx1> eo3Var, eo3<Executor> eo3Var2) {
        this.f12759a = eo3Var;
        this.f12760b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        kx1 zzb = ((lx1) this.f12759a).zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new gc1(zzb, t43Var);
    }
}
