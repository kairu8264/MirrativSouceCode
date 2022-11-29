package ai;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class hp2<E, V> implements s43<V> {

    /* renamed from: w  reason: collision with root package name */
    public final E f4922w;

    /* renamed from: x  reason: collision with root package name */
    public final String f4923x;

    /* renamed from: y  reason: collision with root package name */
    public final s43<V> f4924y;

    public hp2(E e10, String str, s43<V> s43Var) {
        this.f4922w = e10;
        this.f4923x = str;
        this.f4924y = s43Var;
    }

    public final E a() {
        return this.f4922w;
    }

    public final String b() {
        return this.f4923x;
    }

    @Override // ai.s43
    public final void c(Runnable runnable, Executor executor) {
        this.f4924y.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f4924y.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return this.f4924y.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4924y.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4924y.isDone();
    }

    public final String toString() {
        String str = this.f4923x;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
        sb2.append(str);
        sb2.append("@");
        sb2.append(identityHashCode);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f4924y.get(j10, timeUnit);
    }
}
