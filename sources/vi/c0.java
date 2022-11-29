package vi;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class c0<TResult, TContinuationResult> implements e<TContinuationResult>, d, b, d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f57354a;

    /* renamed from: b  reason: collision with root package name */
    public final f<TResult, TContinuationResult> f57355b;

    /* renamed from: c  reason: collision with root package name */
    public final i0<TContinuationResult> f57356c;

    public c0(Executor executor, f<TResult, TContinuationResult> fVar, i0<TContinuationResult> i0Var) {
        this.f57354a = executor;
        this.f57355b = fVar;
        this.f57356c = i0Var;
    }

    @Override // vi.d
    public final void a(Exception exc) {
        this.f57356c.v(exc);
    }

    @Override // vi.d0
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // vi.b
    public final void c() {
        this.f57356c.x();
    }

    @Override // vi.d0
    public final void d(g<TResult> gVar) {
        this.f57354a.execute(new b0(this, gVar));
    }

    @Override // vi.e
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f57356c.w(tcontinuationresult);
    }
}
