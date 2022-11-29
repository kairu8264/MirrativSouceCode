package ai;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class mf2 implements rn3<kf2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<fj0> f6925a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Boolean> f6926b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<ui0> f6927c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<t43> f6928d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<String> f6929e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f6930f;

    public mf2(eo3<fj0> eo3Var, eo3<Boolean> eo3Var2, eo3<ui0> eo3Var3, eo3<t43> eo3Var4, eo3<String> eo3Var5, eo3<ScheduledExecutorService> eo3Var6) {
        this.f6925a = eo3Var;
        this.f6926b = eo3Var2;
        this.f6927c = eo3Var3;
        this.f6928d = eo3Var4;
        this.f6929e = eo3Var5;
        this.f6930f = eo3Var6;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        fj0 zzb = this.f6925a.zzb();
        boolean booleanValue = ((cf2) this.f6926b).zzb().booleanValue();
        ui0 ui0Var = new ui0();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new kf2(zzb, booleanValue, ui0Var, t43Var, ((ze2) this.f6929e).a(), this.f6930f.zzb(), null);
    }
}
