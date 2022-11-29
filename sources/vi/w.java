package vi;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class w<TResult> implements d0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f57399a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f57400b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public c<TResult> f57401c;

    public w(Executor executor, c<TResult> cVar) {
        this.f57399a = executor;
        this.f57401c = cVar;
    }

    @Override // vi.d0
    public final void b() {
        synchronized (this.f57400b) {
            this.f57401c = null;
        }
    }

    @Override // vi.d0
    public final void d(g<TResult> gVar) {
        synchronized (this.f57400b) {
            if (this.f57401c == null) {
                return;
            }
            this.f57399a.execute(new v(this, gVar));
        }
    }
}
