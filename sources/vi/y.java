package vi;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class y<TResult> implements d0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f57404a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f57405b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public d f57406c;

    public y(Executor executor, d dVar) {
        this.f57404a = executor;
        this.f57406c = dVar;
    }

    @Override // vi.d0
    public final void b() {
        synchronized (this.f57405b) {
            this.f57406c = null;
        }
    }

    @Override // vi.d0
    public final void d(g<TResult> gVar) {
        if (gVar.s() || gVar.q()) {
            return;
        }
        synchronized (this.f57405b) {
            if (this.f57406c == null) {
                return;
            }
            this.f57404a.execute(new x(this, gVar));
        }
    }
}
