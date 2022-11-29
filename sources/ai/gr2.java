package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class gr2 implements rn3<fr2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Executor> f4550a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<yj0> f4551b;

    public gr2(eo3<Executor> eo3Var, eo3<yj0> eo3Var2) {
        this.f4550a = eo3Var;
        this.f4551b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new fr2(t43Var, this.f4551b.zzb());
    }
}
