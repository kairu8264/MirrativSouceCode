package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class g31 implements rn3<gc1<p51>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ap1> f4316a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f4317b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<kw1> f4318c;

    public g31(eo3<ap1> eo3Var, eo3<Executor> eo3Var2, eo3<kw1> eo3Var3) {
        this.f4316a = eo3Var;
        this.f4317b = eo3Var2;
        this.f4318c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        ap1 zzb = this.f4316a.zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        kw1 zzb2 = this.f4318c.zzb();
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            return new gc1(zzb2, t43Var);
        }
        return new gc1(zzb, t43Var);
    }
}
