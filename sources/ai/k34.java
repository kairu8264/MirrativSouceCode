package ai;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class k34 extends Thread {
    public static final boolean C = f44.f3946b;
    public final g44 A;
    public final o34 B;

    /* renamed from: w  reason: collision with root package name */
    public final BlockingQueue<w34<?>> f6072w;

    /* renamed from: x  reason: collision with root package name */
    public final BlockingQueue<w34<?>> f6073x;

    /* renamed from: y  reason: collision with root package name */
    public final i34 f6074y;

    /* renamed from: z  reason: collision with root package name */
    public volatile boolean f6075z = false;

    /* JADX WARN: Multi-variable type inference failed */
    public k34(BlockingQueue blockingQueue, BlockingQueue<w34<?>> blockingQueue2, BlockingQueue<w34<?>> blockingQueue3, i34 i34Var, o34 o34Var) {
        this.f6072w = blockingQueue;
        this.f6073x = blockingQueue2;
        this.f6074y = blockingQueue3;
        this.B = i34Var;
        this.A = new g44(this, blockingQueue2, i34Var, null);
    }

    public final void b() {
        this.f6075z = true;
        interrupt();
    }

    public final void c() throws InterruptedException {
        w34<?> take = this.f6072w.take();
        take.h("cache-queue-take");
        take.l(1);
        try {
            take.s();
            h34 v10 = this.f6074y.v(take.p());
            if (v10 == null) {
                take.h("cache-miss");
                if (!this.A.c(take)) {
                    this.f6073x.put(take);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (v10.a(currentTimeMillis)) {
                take.h("cache-hit-expired");
                take.q(v10);
                if (!this.A.c(take)) {
                    this.f6073x.put(take);
                }
                return;
            }
            take.h("cache-hit");
            c44<?> y10 = take.y(new s34(v10.f4730a, v10.f4736g));
            take.h("cache-hit-parsed");
            if (!y10.c()) {
                take.h("cache-parsing-failed");
                this.f6074y.c(take.p(), true);
                take.q(null);
                if (!this.A.c(take)) {
                    this.f6073x.put(take);
                }
                return;
            }
            if (v10.f4735f < currentTimeMillis) {
                take.h("cache-hit-refresh-needed");
                take.q(v10);
                y10.f2712d = true;
                if (!this.A.c(take)) {
                    this.B.a(take, y10, new j34(this, take));
                } else {
                    this.B.a(take, y10, null);
                }
            } else {
                this.B.a(take, y10, null);
            }
        } finally {
            take.l(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (C) {
            f44.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f6074y.b();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f6075z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                f44.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
