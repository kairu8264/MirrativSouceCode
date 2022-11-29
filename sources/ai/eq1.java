package ai;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class eq1 implements rn3<Set<gc1<y41>>> {

    /* renamed from: a  reason: collision with root package name */
    public final cq1 f3744a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<nq1> f3745b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f3746c;

    public eq1(cq1 cq1Var, eo3<nq1> eo3Var, eo3<Executor> eo3Var2) {
        this.f3744a = cq1Var;
        this.f3745b = eo3Var;
        this.f3746c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        Set<gc1<y41>> b10 = cq1.b(this.f3745b.zzb(), t43Var);
        zn3.b(b10);
        return b10;
    }
}
