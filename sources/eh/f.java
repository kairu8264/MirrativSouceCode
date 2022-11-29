package eh;

import ai.a41;
import ai.b41;
import ai.cq2;
import ai.eo3;
import ai.ft;
import ai.ox;
import ai.rn3;
import ai.s43;
import ai.wp2;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class f implements rn3<s43<j>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<cq2> f30573a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<h> f30574b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<a41> f30575c;

    public f(eo3<cq2> eo3Var, eo3<h> eo3Var2, eo3<a41> eo3Var3) {
        this.f30573a = eo3Var;
        this.f30574b = eo3Var2;
        this.f30575c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.f30573a.zzb().e(wp2.GENERATE_SIGNALS, ((b41) this.f30575c).zzb().b()).c(((i) this.f30574b).zzb()).h(((Integer) ft.c().c(ox.P3)).intValue(), TimeUnit.SECONDS).i();
    }
}
