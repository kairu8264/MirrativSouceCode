package uo;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import uo.n1;

/* loaded from: classes4.dex */
public final class w0 extends n1 implements Runnable {
    public static final w0 C;
    public static final long D;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l10;
        w0 w0Var = new w0();
        C = w0Var;
        m1.r0(w0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        D = timeUnit.toNanos(l10.longValue());
    }

    public final synchronized void D1() {
        if (H1()) {
            debugStatus = 3;
            k1();
            notifyAll();
        }
    }

    @Override // uo.o1
    public Thread E0() {
        Thread thread = _thread;
        return thread == null ? E1() : thread;
    }

    public final synchronized Thread E1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    @Override // uo.o1
    public void F0(long j10, n1.c cVar) {
        K1();
    }

    public final boolean G1() {
        return debugStatus == 4;
    }

    public final boolean H1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    public final synchronized boolean I1() {
        if (H1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public final void K1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // uo.n1
    public void V0(Runnable runnable) {
        if (G1()) {
            K1();
        }
        super.V0(runnable);
    }

    @Override // uo.n1, uo.a1
    public i1 d(long j10, Runnable runnable, ao.g gVar) {
        return u1(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean i12;
        d3.f56003a.d(this);
        c.a();
        try {
            if (!I1()) {
                if (i12) {
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long A0 = A0();
                if (A0 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = D + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        D1();
                        c.a();
                        if (i1()) {
                            return;
                        }
                        E0();
                        return;
                    }
                    A0 = po.n.j(A0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (A0 > 0) {
                    if (H1()) {
                        _thread = null;
                        D1();
                        c.a();
                        if (i1()) {
                            return;
                        }
                        E0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, A0);
                }
            }
        } finally {
            _thread = null;
            D1();
            c.a();
            if (!i1()) {
                E0();
            }
        }
    }

    @Override // uo.n1, uo.m1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
