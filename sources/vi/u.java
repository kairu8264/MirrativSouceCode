package vi;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class u<TResult> implements d0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f57394a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f57395b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public b f57396c;

    public u(Executor executor, b bVar) {
        this.f57394a = executor;
        this.f57396c = bVar;
    }

    @Override // vi.d0
    public final void b() {
        synchronized (this.f57395b) {
            this.f57396c = null;
        }
    }

    @Override // vi.d0
    public final void d(g<TResult> gVar) {
        if (gVar.q()) {
            synchronized (this.f57395b) {
                if (this.f57396c == null) {
                    return;
                }
                this.f57394a.execute(new t(this));
            }
        }
    }
}
