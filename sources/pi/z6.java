package pi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class z6 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f48407w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i7 f48408x;

    public z6(i7 i7Var, AtomicReference atomicReference) {
        this.f48408x = i7Var;
        this.f48407w = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48407w) {
            this.f48407w.set(Double.valueOf(this.f48408x.f48285a.y().i(this.f48408x.f48285a.A().q(), c3.P)));
            this.f48407w.notify();
        }
    }
}
