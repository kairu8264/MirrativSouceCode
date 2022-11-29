package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class f31 implements rn3<gc1<or>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ap1> f3911a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f3912b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<kw1> f3913c;

    public f31(eo3<ap1> eo3Var, eo3<Executor> eo3Var2, eo3<kw1> eo3Var3) {
        this.f3911a = eo3Var;
        this.f3912b = eo3Var2;
        this.f3913c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        ap1 zzb = this.f3911a.zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        kw1 zzb2 = this.f3913c.zzb();
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            return new gc1(zzb2, t43Var);
        }
        return new gc1(zzb, t43Var);
    }
}
