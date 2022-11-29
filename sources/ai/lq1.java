package ai;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class lq1 implements rn3<Set<gc1<p51>>> {

    /* renamed from: a  reason: collision with root package name */
    public final cq1 f6644a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<nq1> f6645b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f6646c;

    public lq1(cq1 cq1Var, eo3<nq1> eo3Var, eo3<Executor> eo3Var2) {
        this.f6644a = cq1Var;
        this.f6645b = eo3Var;
        this.f6646c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        Set<gc1<p51>> h10 = cq1.h(this.f6645b.zzb(), t43Var);
        zn3.b(h10);
        return h10;
    }
}
