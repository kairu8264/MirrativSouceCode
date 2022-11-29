package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class wj1 implements rn3<vj1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Executor> f11644a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<qj1> f11645b;

    public wj1(eo3<Executor> eo3Var, eo3<qj1> eo3Var2) {
        this.f11644a = eo3Var;
        this.f11645b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final vj1 zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new vj1(t43Var, ((rj1) this.f11645b).zzb());
    }
}
