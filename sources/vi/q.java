package vi;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class q<TResult, TContinuationResult> implements d0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f57385a;

    /* renamed from: b  reason: collision with root package name */
    public final a<TResult, TContinuationResult> f57386b;

    /* renamed from: c  reason: collision with root package name */
    public final i0<TContinuationResult> f57387c;

    public q(Executor executor, a<TResult, TContinuationResult> aVar, i0<TContinuationResult> i0Var) {
        this.f57385a = executor;
        this.f57386b = aVar;
        this.f57387c = i0Var;
    }

    @Override // vi.d0
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // vi.d0
    public final void d(g<TResult> gVar) {
        this.f57385a.execute(new p(this, gVar));
    }
}
