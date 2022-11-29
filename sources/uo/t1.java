package uo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class t1 extends s1 implements a1 {

    /* renamed from: y  reason: collision with root package name */
    public final Executor f56087y;

    public t1(Executor executor) {
        this.f56087y = executor;
        zo.f.a(i0());
    }

    @Override // uo.a1
    public void S(long j10, p<? super wn.v> pVar) {
        Executor i02 = i0();
        ScheduledExecutorService scheduledExecutorService = i02 instanceof ScheduledExecutorService ? (ScheduledExecutorService) i02 : null;
        ScheduledFuture<?> k02 = scheduledExecutorService != null ? k0(scheduledExecutorService, new x2(this, pVar), pVar.getContext(), j10) : null;
        if (k02 != null) {
            g2.h(pVar, k02);
        } else {
            w0.C.S(j10, pVar);
        }
    }

    @Override // uo.k0
    public void X(ao.g gVar, Runnable runnable) {
        try {
            Executor i02 = i0();
            c.a();
            i02.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            h0(gVar, e10);
            g1.b().X(gVar, runnable);
        }
    }

    @Override // uo.s1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor i02 = i0();
        ExecutorService executorService = i02 instanceof ExecutorService ? (ExecutorService) i02 : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    @Override // uo.a1
    public i1 d(long j10, Runnable runnable, ao.g gVar) {
        Executor i02 = i0();
        ScheduledExecutorService scheduledExecutorService = i02 instanceof ScheduledExecutorService ? (ScheduledExecutorService) i02 : null;
        ScheduledFuture<?> k02 = scheduledExecutorService != null ? k0(scheduledExecutorService, runnable, gVar, j10) : null;
        if (k02 != null) {
            return new h1(k02);
        }
        return w0.C.d(j10, runnable, gVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof t1) && ((t1) obj).i0() == i0();
    }

    public final void h0(ao.g gVar, RejectedExecutionException rejectedExecutionException) {
        g2.c(gVar, r1.a("The task was rejected", rejectedExecutionException));
    }

    public int hashCode() {
        return System.identityHashCode(i0());
    }

    public Executor i0() {
        return this.f56087y;
    }

    public final ScheduledFuture<?> k0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, ao.g gVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            h0(gVar, e10);
            return null;
        }
    }

    @Override // uo.k0
    public String toString() {
        return i0().toString();
    }
}
