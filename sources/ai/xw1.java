package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class xw1 implements rn3<gc1<k61>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<fx1> f12330a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f12331b;

    public xw1(eo3<fx1> eo3Var, eo3<Executor> eo3Var2) {
        this.f12330a = eo3Var;
        this.f12331b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new gc1(this.f12330a.zzb(), t43Var);
    }
}
