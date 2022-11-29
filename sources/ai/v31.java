package ai;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class v31 implements rn3<u31> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<n51> f10941a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<fl2> f10942b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<ScheduledExecutorService> f10943c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Executor> f10944d;

    public v31(eo3<n51> eo3Var, eo3<fl2> eo3Var2, eo3<ScheduledExecutorService> eo3Var3, eo3<Executor> eo3Var4) {
        this.f10941a = eo3Var;
        this.f10942b = eo3Var2;
        this.f10943c = eo3Var3;
        this.f10944d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new u31(this.f10941a.zzb(), ((k11) this.f10942b).a(), this.f10943c.zzb(), t43Var);
    }
}
