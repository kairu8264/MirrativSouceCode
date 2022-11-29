package ai;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class pd2 implements rn3<nd2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<wi0> f8387a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f8388b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f8389c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Executor> f8390d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<Integer> f8391e;

    public pd2(eo3<wi0> eo3Var, eo3<Context> eo3Var2, eo3<ScheduledExecutorService> eo3Var3, eo3<Executor> eo3Var4, eo3<Integer> eo3Var5) {
        this.f8387a = eo3Var;
        this.f8388b = eo3Var2;
        this.f8389c = eo3Var3;
        this.f8390d = eo3Var4;
        this.f8391e = eo3Var5;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new nd2(new wi0(), ((tr0) this.f8388b).a(), this.f8389c.zzb(), t43Var, ((af2) this.f8391e).zzb().intValue(), null);
    }
}
