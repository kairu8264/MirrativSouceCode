package ai;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class iq1 implements rn3<Set<gc1<r71>>> {

    /* renamed from: a  reason: collision with root package name */
    public final cq1 f5320a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<nq1> f5321b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f5322c;

    public iq1(cq1 cq1Var, eo3<nq1> eo3Var, eo3<Executor> eo3Var2) {
        this.f5320a = cq1Var;
        this.f5321b = eo3Var;
        this.f5322c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        Set<gc1<r71>> e10 = cq1.e(this.f5321b.zzb(), t43Var);
        zn3.b(e10);
        return e10;
    }
}
