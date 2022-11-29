package ai;

import ai.wc2;

/* loaded from: classes3.dex */
public final class c92<S extends wc2<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final s43<S> f2760a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2761b;

    /* renamed from: c  reason: collision with root package name */
    public final vh.f f2762c;

    public c92(s43<S> s43Var, long j10, vh.f fVar) {
        this.f2760a = s43Var;
        this.f2762c = fVar;
        this.f2761b = fVar.elapsedRealtime() + j10;
    }

    public final boolean a() {
        return this.f2761b < this.f2762c.elapsedRealtime();
    }
}
