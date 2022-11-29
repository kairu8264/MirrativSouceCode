package qm;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class l {

    /* renamed from: f  reason: collision with root package name */
    public static final lm.a f49604f = lm.a.e();

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f49605a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue<tm.b> f49606b;

    /* renamed from: c  reason: collision with root package name */
    public final Runtime f49607c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f49608d;

    /* renamed from: e  reason: collision with root package name */
    public long f49609e;

    public l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(sm.h hVar) {
        tm.b l10 = l(hVar);
        if (l10 != null) {
            this.f49606b.add(l10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(sm.h hVar) {
        tm.b l10 = l(hVar);
        if (l10 != null) {
            this.f49606b.add(l10);
        }
    }

    public void c(sm.h hVar) {
        h(hVar);
    }

    public final int d() {
        return sm.k.c(sm.g.BYTES.a(this.f49607c.totalMemory() - this.f49607c.freeMemory()));
    }

    public final synchronized void h(final sm.h hVar) {
        try {
            this.f49605a.schedule(new Runnable() { // from class: qm.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.f(hVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            lm.a aVar = f49604f;
            aVar.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    public final synchronized void i(long j10, final sm.h hVar) {
        this.f49609e = j10;
        try {
            this.f49608d = this.f49605a.scheduleAtFixedRate(new Runnable() { // from class: qm.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.g(hVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            lm.a aVar = f49604f;
            aVar.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    public void j(long j10, sm.h hVar) {
        if (e(j10)) {
            return;
        }
        if (this.f49608d != null) {
            if (this.f49609e != j10) {
                k();
                i(j10, hVar);
                return;
            }
            return;
        }
        i(j10, hVar);
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.f49608d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f49608d = null;
        this.f49609e = -1L;
    }

    public final tm.b l(sm.h hVar) {
        if (hVar == null) {
            return null;
        }
        return tm.b.S().G(hVar.a()).H(d()).a();
    }

    public l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f49608d = null;
        this.f49609e = -1L;
        this.f49605a = scheduledExecutorService;
        this.f49606b = new ConcurrentLinkedQueue<>();
        this.f49607c = runtime;
    }
}
