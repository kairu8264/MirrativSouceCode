package ai;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public abstract class r43<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public static final Runnable f9339w = new p43(null);

    /* renamed from: x  reason: collision with root package name */
    public static final Runnable f9340x = new p43(null);

    public abstract T a() throws Exception;

    public final void b(Thread thread) {
        Runnable runnable = get();
        o43 o43Var = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof o43)) {
                if (runnable != f9340x) {
                    break;
                }
            } else {
                o43Var = (o43) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f9340x;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(o43Var);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    public abstract String c();

    public abstract boolean d();

    public abstract void e(T t10);

    public abstract void f(Throwable th2);

    public final void g() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            o43 o43Var = new o43(this, null);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, o43Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (getAndSet(f9339w) == f9340x) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (getAndSet(f9339w) == f9340x) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t10 = null;
        if (compareAndSet(null, currentThread)) {
            boolean z10 = !d();
            if (z10) {
                try {
                    t10 = a();
                } catch (Throwable th2) {
                    if (!compareAndSet(currentThread, f9339w)) {
                        b(currentThread);
                    }
                    f(th2);
                    return;
                }
            }
            if (!compareAndSet(currentThread, f9339w)) {
                b(currentThread);
            }
            if (z10) {
                e(t10);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f9339w) {
            str = "running=[DONE]";
        } else if (runnable instanceof o43) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 21);
            sb2.append("running=[RUNNING ON ");
            sb2.append(name);
            sb2.append("]");
            str = sb2.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String c10 = c();
        StringBuilder sb3 = new StringBuilder(str.length() + 2 + String.valueOf(c10).length());
        sb3.append(str);
        sb3.append(", ");
        sb3.append(c10);
        return sb3.toString();
    }
}
