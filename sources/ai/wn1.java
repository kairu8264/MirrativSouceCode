package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class wn1 implements rn3<gc1<or>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<lo1> f11696a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f11697b;

    public wn1(eo3<lo1> eo3Var, eo3<Executor> eo3Var2) {
        this.f11696a = eo3Var;
        this.f11697b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new gc1(this.f11696a.zzb(), t43Var);
    }
}
