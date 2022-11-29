package ai;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class dq1 implements rn3<Set<gc1<v41>>> {

    /* renamed from: a  reason: collision with root package name */
    public final cq1 f3373a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<nq1> f3374b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f3375c;

    public dq1(cq1 cq1Var, eo3<nq1> eo3Var, eo3<Executor> eo3Var2) {
        this.f3373a = cq1Var;
        this.f3374b = eo3Var;
        this.f3375c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        Set<gc1<v41>> a10 = cq1.a(this.f3374b.zzb(), t43Var);
        zn3.b(a10);
        return a10;
    }
}
