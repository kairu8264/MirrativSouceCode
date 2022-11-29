package ai;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class v43 extends b33 {

    /* renamed from: w  reason: collision with root package name */
    public final ExecutorService f10976w;

    public v43(ExecutorService executorService) {
        Objects.requireNonNull(executorService);
        this.f10976w = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f10976w.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10976w.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f10976w.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f10976w.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f10976w.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f10976w.shutdownNow();
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f10976w);
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2 + valueOf.length());
        sb2.append(obj);
        sb2.append("[");
        sb2.append(valueOf);
        sb2.append("]");
        return sb2.toString();
    }
}
