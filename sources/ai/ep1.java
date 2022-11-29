package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ep1 implements rn3<gc1<r71>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<cp1> f3736a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f3737b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<nw1> f3738c;

    public ep1(eo3<cp1> eo3Var, eo3<Executor> eo3Var2, eo3<nw1> eo3Var3) {
        this.f3736a = eo3Var;
        this.f3737b = eo3Var2;
        this.f3738c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        cp1 zzb = this.f3736a.zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        nw1 zzb2 = this.f3738c.zzb();
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            return new gc1(zzb2, t43Var);
        }
        return new gc1(zzb, t43Var);
    }
}
