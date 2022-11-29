package vi;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class a0<TResult> implements d0<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f57349a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f57350b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public e<? super TResult> f57351c;

    public a0(Executor executor, e<? super TResult> eVar) {
        this.f57349a = executor;
        this.f57351c = eVar;
    }

    @Override // vi.d0
    public final void b() {
        synchronized (this.f57350b) {
            this.f57351c = null;
        }
    }

    @Override // vi.d0
    public final void d(g<TResult> gVar) {
        if (gVar.s()) {
            synchronized (this.f57350b) {
                if (this.f57351c == null) {
                    return;
                }
                this.f57349a.execute(new z(this, gVar));
            }
        }
    }
}
