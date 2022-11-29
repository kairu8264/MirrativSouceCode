package pi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class w6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f48307w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f48308x;

    public w6(i7 i7Var, AtomicReference atomicReference) {
        this.f48308x = i7Var;
        this.f48307w = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48307w) {
            this.f48307w.set(this.f48308x.f48285a.y().w(this.f48308x.f48285a.A().q(), c3.M));
            this.f48307w.notify();
        }
    }
}
