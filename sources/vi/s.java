package vi;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class s<TResult, TContinuationResult> implements e<TContinuationResult>, d, b, d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f57390a;

    /* renamed from: b  reason: collision with root package name */
    public final a<TResult, g<TContinuationResult>> f57391b;

    /* renamed from: c  reason: collision with root package name */
    public final i0<TContinuationResult> f57392c;

    public s(Executor executor, a<TResult, g<TContinuationResult>> aVar, i0<TContinuationResult> i0Var) {
        this.f57390a = executor;
        this.f57391b = aVar;
        this.f57392c = i0Var;
    }

    @Override // vi.d
    public final void a(Exception exc) {
        this.f57392c.v(exc);
    }

    @Override // vi.d0
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // vi.b
    public final void c() {
        this.f57392c.x();
    }

    @Override // vi.d0
    public final void d(g<TResult> gVar) {
        this.f57390a.execute(new r(this, gVar));
    }

    @Override // vi.e
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f57392c.w(tcontinuationresult);
    }
}
