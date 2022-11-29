package ai;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class mk0<T> implements s43<T> {

    /* renamed from: w  reason: collision with root package name */
    public final a53<T> f6962w = a53.E();

    public static final boolean b(boolean z10) {
        if (!z10) {
            wg.t.h().l(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z10;
    }

    @Override // ai.s43
    public final void c(Runnable runnable, Executor executor) {
        this.f6962w.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f6962w.cancel(z10);
    }

    public final boolean d(T t10) {
        boolean u10 = this.f6962w.u(t10);
        b(u10);
        return u10;
    }

    public final boolean e(Throwable th2) {
        boolean v10 = this.f6962w.v(th2);
        b(v10);
        return v10;
    }

    @Override // java.util.concurrent.Future
    public final T get() throws ExecutionException, InterruptedException {
        return this.f6962w.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6962w.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6962w.isDone();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f6962w.get(j10, timeUnit);
    }
}
