package pi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class y6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f48382w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f48383x;

    public y6(i7 i7Var, AtomicReference atomicReference) {
        this.f48383x = i7Var;
        this.f48382w = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48382w) {
            this.f48382w.set(Integer.valueOf(this.f48383x.f48285a.y().m(this.f48383x.f48285a.A().q(), c3.O)));
            this.f48382w.notify();
        }
    }
}
