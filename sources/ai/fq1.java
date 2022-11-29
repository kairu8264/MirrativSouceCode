package ai;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class fq1 implements rn3<Set<gc1<q51>>> {

    /* renamed from: a  reason: collision with root package name */
    public final cq1 f4158a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<nq1> f4159b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f4160c;

    public fq1(cq1 cq1Var, eo3<nq1> eo3Var, eo3<Executor> eo3Var2) {
        this.f4158a = cq1Var;
        this.f4159b = eo3Var;
        this.f4160c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        Set<gc1<q51>> c10 = cq1.c(this.f4159b.zzb(), t43Var);
        zn3.b(c10);
        return c10;
    }
}
