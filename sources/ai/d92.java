package ai;

import ai.wc2;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d92<S extends wc2> implements xc2<S> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<c92<S>> f3183a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public final vh.f f3184b;

    /* renamed from: c  reason: collision with root package name */
    public final xc2<S> f3185c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3186d;

    public d92(xc2<S> xc2Var, long j10, vh.f fVar) {
        this.f3184b = fVar;
        this.f3185c = xc2Var;
        this.f3186d = j10;
    }

    @Override // ai.xc2
    public final s43<S> zza() {
        c92<S> c92Var = this.f3183a.get();
        if (c92Var == null || c92Var.a()) {
            c92Var = new c92<>(this.f3185c.zza(), this.f3186d, this.f3184b);
            this.f3183a.set(c92Var);
        }
        return c92Var.f2760a;
    }
}
