package pi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f48217w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f48218x;

    public s6(i7 i7Var, AtomicReference atomicReference) {
        this.f48218x = i7Var;
        this.f48217w = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48217w) {
            this.f48217w.set(Boolean.valueOf(this.f48218x.f48285a.y().A(this.f48218x.f48285a.A().q(), c3.L)));
            this.f48217w.notify();
        }
    }
}
