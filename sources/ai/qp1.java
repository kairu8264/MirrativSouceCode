package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class qp1 implements rn3<pp1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<up1> f9045a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f9046b;

    public qp1(eo3<up1> eo3Var, eo3<Executor> eo3Var2) {
        this.f9045a = eo3Var;
        this.f9046b = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new pp1(this.f9045a.zzb(), t43Var);
    }
}
