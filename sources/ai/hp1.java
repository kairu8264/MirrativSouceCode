package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class hp1 implements rn3<gc1<k61>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<cp1> f4919a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f4920b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<nw1> f4921c;

    public hp1(eo3<cp1> eo3Var, eo3<Executor> eo3Var2, eo3<nw1> eo3Var3) {
        this.f4919a = eo3Var;
        this.f4920b = eo3Var2;
        this.f4921c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        cp1 zzb = this.f4919a.zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        nw1 zzb2 = this.f4921c.zzb();
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            return new gc1(zzb2, t43Var);
        }
        return new gc1(zzb, t43Var);
    }
}
