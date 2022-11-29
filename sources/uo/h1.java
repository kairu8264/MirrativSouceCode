package uo;

import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class h1 implements i1 {

    /* renamed from: w  reason: collision with root package name */
    public final Future<?> f56028w;

    public h1(Future<?> future) {
        this.f56028w = future;
    }

    @Override // uo.i1
    public void dispose() {
        this.f56028w.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f56028w + ']';
    }
}
