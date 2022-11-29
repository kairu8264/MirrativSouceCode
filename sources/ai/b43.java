package ai;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class b43<V> extends qz2 implements Future<V> {
    public abstract Future<? extends V> e();

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return e().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return e().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return e().isDone();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return e().get(j10, timeUnit);
    }
}
