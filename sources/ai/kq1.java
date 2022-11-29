package ai;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class kq1 implements rn3<Set<gc1<or>>> {

    /* renamed from: a  reason: collision with root package name */
    public final cq1 f6336a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<nq1> f6337b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f6338c;

    public kq1(cq1 cq1Var, eo3<nq1> eo3Var, eo3<Executor> eo3Var2) {
        this.f6336a = cq1Var;
        this.f6337b = eo3Var;
        this.f6338c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        Set<gc1<or>> g10 = cq1.g(this.f6337b.zzb(), t43Var);
        zn3.b(g10);
        return g10;
    }
}
