package ai;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class fe2 implements rn3<de2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<wi0> f3998a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Integer> f3999b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Context> f4000c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<fj0> f4001d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f4002e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<Executor> f4003f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<String> f4004g;

    public fe2(eo3<wi0> eo3Var, eo3<Integer> eo3Var2, eo3<Context> eo3Var3, eo3<fj0> eo3Var4, eo3<ScheduledExecutorService> eo3Var5, eo3<Executor> eo3Var6, eo3<String> eo3Var7) {
        this.f3998a = eo3Var;
        this.f3999b = eo3Var2;
        this.f4000c = eo3Var3;
        this.f4001d = eo3Var4;
        this.f4002e = eo3Var5;
        this.f4003f = eo3Var6;
        this.f4004g = eo3Var7;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new de2(new wi0(), ((af2) this.f3999b).zzb().intValue(), ((tr0) this.f4000c).a(), this.f4001d.zzb(), this.f4002e.zzb(), t43Var, ((ze2) this.f4004g).a(), null);
    }
}
