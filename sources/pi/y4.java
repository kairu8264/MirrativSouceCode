package pi;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class y4 extends w5 {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicLong f48372l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public x4 f48373c;

    /* renamed from: d  reason: collision with root package name */
    public x4 f48374d;

    /* renamed from: e  reason: collision with root package name */
    public final PriorityBlockingQueue<w4<?>> f48375e;

    /* renamed from: f  reason: collision with root package name */
    public final BlockingQueue<w4<?>> f48376f;

    /* renamed from: g  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f48377g;

    /* renamed from: h  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f48378h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f48379i;

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f48380j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f48381k;

    public y4(b5 b5Var) {
        super(b5Var);
        this.f48379i = new Object();
        this.f48380j = new Semaphore(2);
        this.f48375e = new PriorityBlockingQueue<>();
        this.f48376f = new LinkedBlockingQueue();
        this.f48377g = new v4(this, "Thread death: Uncaught exception on worker thread");
        this.f48378h = new v4(this, "Thread death: Uncaught exception on network thread");
    }

    public final boolean B() {
        return Thread.currentThread() == this.f48373c;
    }

    public final void C(w4<?> w4Var) {
        synchronized (this.f48379i) {
            this.f48375e.add(w4Var);
            x4 x4Var = this.f48373c;
            if (x4Var == null) {
                x4 x4Var2 = new x4(this, "Measurement Worker", this.f48375e);
                this.f48373c = x4Var2;
                x4Var2.setUncaughtExceptionHandler(this.f48377g);
                this.f48373c.start();
            } else {
                x4Var.a();
            }
        }
    }

    @Override // pi.v5
    public final void e() {
        if (Thread.currentThread() != this.f48374d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // pi.v5
    public final void f() {
        if (Thread.currentThread() != this.f48373c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // pi.w5
    public final boolean h() {
        return false;
    }

    public final <T> T p(AtomicReference<T> atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f48285a.a().y(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                this.f48285a.r().v().a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t10 = atomicReference.get();
        if (t10 == null) {
            this.f48285a.r().v().a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t10;
    }

    public final <V> Future<V> q(Callable<V> callable) throws IllegalStateException {
        i();
        rh.p.i(callable);
        w4<?> w4Var = new w4<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f48373c) {
            if (!this.f48375e.isEmpty()) {
                this.f48285a.r().v().a("Callable skipped the worker queue.");
            }
            w4Var.run();
        } else {
            C(w4Var);
        }
        return w4Var;
    }

    public final <V> Future<V> s(Callable<V> callable) throws IllegalStateException {
        i();
        rh.p.i(callable);
        w4<?> w4Var = new w4<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f48373c) {
            w4Var.run();
        } else {
            C(w4Var);
        }
        return w4Var;
    }

    public final void x(Runnable runnable) throws IllegalStateException {
        i();
        rh.p.i(runnable);
        w4<?> w4Var = new w4<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f48379i) {
            this.f48376f.add(w4Var);
            x4 x4Var = this.f48374d;
            if (x4Var == null) {
                x4 x4Var2 = new x4(this, "Measurement Network", this.f48376f);
                this.f48374d = x4Var2;
                x4Var2.setUncaughtExceptionHandler(this.f48378h);
                this.f48374d.start();
            } else {
                x4Var.a();
            }
        }
    }

    public final void y(Runnable runnable) throws IllegalStateException {
        i();
        rh.p.i(runnable);
        C(new w4<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void z(Runnable runnable) throws IllegalStateException {
        i();
        rh.p.i(runnable);
        C(new w4<>(this, runnable, true, "Task exception on worker thread"));
    }
}
