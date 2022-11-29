package ai;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class ur1 implements rn3<tr1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Executor> f10806a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f10807b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<WeakReference<Context>> f10808c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Executor> f10809d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<mn1> f10810e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f10811f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<yp1> f10812g;

    /* renamed from: h  reason: collision with root package name */
    public final eo3<zj0> f10813h;

    /* renamed from: i  reason: collision with root package name */
    public final eo3<rb1> f10814i;

    public ur1(eo3<Executor> eo3Var, eo3<Context> eo3Var2, eo3<WeakReference<Context>> eo3Var3, eo3<Executor> eo3Var4, eo3<mn1> eo3Var5, eo3<ScheduledExecutorService> eo3Var6, eo3<yp1> eo3Var7, eo3<zj0> eo3Var8, eo3<rb1> eo3Var9) {
        this.f10806a = eo3Var;
        this.f10807b = eo3Var2;
        this.f10808c = eo3Var3;
        this.f10809d = eo3Var4;
        this.f10810e = eo3Var5;
        this.f10811f = eo3Var6;
        this.f10812g = eo3Var7;
        this.f10813h = eo3Var8;
        this.f10814i = eo3Var9;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor zzb = this.f10806a.zzb();
        Context a10 = ((tr0) this.f10807b).a();
        WeakReference<Context> a11 = ((ur0) this.f10808c).a();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new tr1(zzb, a10, a11, t43Var, this.f10810e.zzb(), this.f10811f.zzb(), this.f10812g.zzb(), ((cs0) this.f10813h).a(), ((sb1) this.f10814i).zzb());
    }
}
