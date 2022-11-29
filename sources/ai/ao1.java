package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ao1 implements rn3<gc1<k61>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<lo1> f1960a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f1961b;

    public ao1(eo3<lo1> eo3Var, eo3<Executor> eo3Var2) {
        this.f1960a = eo3Var;
        this.f1961b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new gc1(this.f1960a.zzb(), t43Var);
    }
}
