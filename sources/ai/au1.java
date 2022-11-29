package ai;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class au1 implements rn3<zt1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<yl2> f2128a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<zs1> f2129b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<t43> f2130c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f2131d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<hx1> f2132e;

    public au1(eo3<yl2> eo3Var, eo3<zs1> eo3Var2, eo3<t43> eo3Var3, eo3<ScheduledExecutorService> eo3Var4, eo3<hx1> eo3Var5) {
        this.f2128a = eo3Var;
        this.f2129b = eo3Var2;
        this.f2130c = eo3Var3;
        this.f2131d = eo3Var4;
        this.f2132e = eo3Var5;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        yl2 a10 = ((l41) this.f2128a).a();
        zs1 zzb = ((at1) this.f2129b).zzb();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new zt1(a10, zzb, t43Var, this.f2131d.zzb(), this.f2132e.zzb());
    }
}
