package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class n21 implements rn3<gc1<l51>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<pw0> f7159a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f7160b;

    public n21(eo3<pw0> eo3Var, eo3<Executor> eo3Var2) {
        this.f7159a = eo3Var;
        this.f7160b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new gc1(this.f7159a.zzb(), t43Var);
    }
}
