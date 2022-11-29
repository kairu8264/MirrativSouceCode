package ai;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class vt1 implements rn3<ut1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f11352a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<t43> f11353b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<ou1> f11354c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<cw1> f11355d;

    public vt1(eo3<ScheduledExecutorService> eo3Var, eo3<t43> eo3Var2, eo3<ou1> eo3Var3, eo3<cw1> eo3Var4) {
        this.f11352a = eo3Var;
        this.f11353b = eo3Var2;
        this.f11354c = eo3Var3;
        this.f11355d = eo3Var4;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final ut1 zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new ut1(this.f11352a.zzb(), t43Var, ((pu1) this.f11354c).zzb(), pn3.b(this.f11355d));
    }
}
