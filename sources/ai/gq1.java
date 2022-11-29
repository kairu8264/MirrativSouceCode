package ai;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class gq1 implements rn3<Set<gc1<k61>>> {

    /* renamed from: a  reason: collision with root package name */
    public final cq1 f4546a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<nq1> f4547b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f4548c;

    public gq1(cq1 cq1Var, eo3<nq1> eo3Var, eo3<Executor> eo3Var2) {
        this.f4546a = cq1Var;
        this.f4547b = eo3Var;
        this.f4548c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        Set<gc1<k61>> d10 = cq1.d(this.f4547b.zzb(), t43Var);
        zn3.b(d10);
        return d10;
    }
}
