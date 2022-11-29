package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class x21 implements rn3<gc1<z41>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ap1> f11842a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f11843b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<kw1> f11844c;

    public x21(eo3<ap1> eo3Var, eo3<Executor> eo3Var2, eo3<kw1> eo3Var3) {
        this.f11842a = eo3Var;
        this.f11843b = eo3Var2;
        this.f11844c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        ap1 zzb = this.f11842a.zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        kw1 zzb2 = this.f11844c.zzb();
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            return new gc1(zzb2, t43Var);
        }
        return new gc1(zzb, t43Var);
    }
}
