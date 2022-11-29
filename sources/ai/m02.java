package ai;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class m02 implements rn3<l02> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<rz0> f6744a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<sz1> f6745b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<x41> f6746c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f6747d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<t43> f6748e;

    public m02(eo3<rz0> eo3Var, eo3<sz1> eo3Var2, eo3<x41> eo3Var3, eo3<ScheduledExecutorService> eo3Var4, eo3<t43> eo3Var5) {
        this.f6744a = eo3Var;
        this.f6745b = eo3Var2;
        this.f6746c = eo3Var3;
        this.f6747d = eo3Var4;
        this.f6748e = eo3Var5;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final l02 zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new l02(this.f6744a.zzb(), ((tz1) this.f6745b).zzb(), this.f6746c.zzb(), this.f6747d.zzb(), t43Var);
    }
}
