package ai;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class a43<V> extends z33<V> {
    public final s43<V> D;

    public a43(s43<V> s43Var) {
        Objects.requireNonNull(s43Var);
        this.D = s43Var;
    }

    @Override // ai.a33, ai.s43
    public final void c(Runnable runnable, Executor executor) {
        this.D.c(runnable, executor);
    }

    @Override // ai.a33, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.D.cancel(z10);
    }

    @Override // ai.a33, java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return this.D.get();
    }

    @Override // ai.a33, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.D.isCancelled();
    }

    @Override // ai.a33, java.util.concurrent.Future
    public final boolean isDone() {
        return this.D.isDone();
    }

    @Override // ai.a33
    public final String toString() {
        return this.D.toString();
    }

    @Override // ai.a33, java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.D.get(j10, timeUnit);
    }
}
