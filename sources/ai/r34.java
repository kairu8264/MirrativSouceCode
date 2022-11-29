package ai;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzwl;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class r34 extends Thread {
    public final o34 A;

    /* renamed from: w  reason: collision with root package name */
    public final BlockingQueue<w34<?>> f9329w;

    /* renamed from: x  reason: collision with root package name */
    public final q34 f9330x;

    /* renamed from: y  reason: collision with root package name */
    public final i34 f9331y;

    /* renamed from: z  reason: collision with root package name */
    public volatile boolean f9332z = false;

    /* JADX WARN: Multi-variable type inference failed */
    public r34(BlockingQueue blockingQueue, BlockingQueue<w34<?>> blockingQueue2, q34 q34Var, i34 i34Var, o34 o34Var) {
        this.f9329w = blockingQueue;
        this.f9330x = blockingQueue2;
        this.f9331y = q34Var;
        this.A = i34Var;
    }

    public final void a() {
        this.f9332z = true;
        interrupt();
    }

    public final void b() throws InterruptedException {
        w34<?> take = this.f9329w.take();
        SystemClock.elapsedRealtime();
        take.l(3);
        try {
            take.h("network-queue-take");
            take.s();
            TrafficStats.setThreadStatsTag(take.e());
            s34 a10 = this.f9330x.a(take);
            take.h("network-http-complete");
            if (a10.f9708e && take.x()) {
                take.i("not-modified");
                take.D();
                return;
            }
            c44<?> y10 = take.y(a10);
            take.h("network-parse-complete");
            if (y10.f2710b != null) {
                this.f9331y.a(take.p(), y10.f2710b);
                take.h("network-cache-written");
            }
            take.w();
            this.A.a(take, y10, null);
            take.C(y10);
        } catch (zzwl e10) {
            SystemClock.elapsedRealtime();
            this.A.b(take, e10);
            take.D();
        } catch (Exception e11) {
            f44.d(e11, "Unhandled exception %s", e11.toString());
            zzwl zzwlVar = new zzwl(e11);
            SystemClock.elapsedRealtime();
            this.A.b(take, zzwlVar);
            take.D();
        } finally {
            take.l(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f9332z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                f44.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
