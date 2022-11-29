package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ip1 implements rn3<gc1<dq2>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<sp1> f5312a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f5313b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<uw1> f5314c;

    public ip1(eo3<sp1> eo3Var, eo3<Executor> eo3Var2, eo3<uw1> eo3Var3) {
        this.f5312a = eo3Var;
        this.f5313b = eo3Var2;
        this.f5314c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        sp1 zzb = this.f5312a.zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        uw1 zzb2 = this.f5314c.zzb();
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            return new gc1(zzb2, t43Var);
        }
        return new gc1(zzb, t43Var);
    }
}
