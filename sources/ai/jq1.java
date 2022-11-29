package ai;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class jq1 implements rn3<Set<gc1<xb>>> {

    /* renamed from: a  reason: collision with root package name */
    public final cq1 f5885a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<nq1> f5886b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f5887c;

    public jq1(cq1 cq1Var, eo3<nq1> eo3Var, eo3<Executor> eo3Var2) {
        this.f5885a = cq1Var;
        this.f5886b = eo3Var;
        this.f5887c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        Set<gc1<xb>> f10 = cq1.f(this.f5886b.zzb(), t43Var);
        zn3.b(f10);
        return f10;
    }
}
