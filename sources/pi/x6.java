package pi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class x6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f48342w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f48343x;

    public x6(i7 i7Var, AtomicReference atomicReference) {
        this.f48343x = i7Var;
        this.f48342w = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48342w) {
            this.f48342w.set(Long.valueOf(this.f48343x.f48285a.y().p(this.f48343x.f48285a.A().q(), c3.N)));
            this.f48342w.notify();
        }
    }
}
