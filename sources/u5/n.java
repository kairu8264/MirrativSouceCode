package u5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class n {

    /* renamed from: f  reason: collision with root package name */
    public static final String f54440f = k5.j.f("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    public final ThreadFactory f54441a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f54442b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, c> f54443c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, b> f54444d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f54445e;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public int f54446a = 0;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f54446a);
            this.f54446a = this.f54446a + 1;
            return newThread;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str);
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final n f54448w;

        /* renamed from: x  reason: collision with root package name */
        public final String f54449x;

        public c(n nVar, String str) {
            this.f54448w = nVar;
            this.f54449x = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f54448w.f54445e) {
                if (this.f54448w.f54443c.remove(this.f54449x) != null) {
                    b remove = this.f54448w.f54444d.remove(this.f54449x);
                    if (remove != null) {
                        remove.a(this.f54449x);
                    }
                } else {
                    k5.j.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f54449x), new Throwable[0]);
                }
            }
        }
    }

    public n() {
        a aVar = new a();
        this.f54441a = aVar;
        this.f54443c = new HashMap();
        this.f54444d = new HashMap();
        this.f54445e = new Object();
        this.f54442b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f54442b.isShutdown()) {
            return;
        }
        this.f54442b.shutdownNow();
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f54445e) {
            k5.j.c().a(f54440f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f54443c.put(str, cVar);
            this.f54444d.put(str, bVar);
            this.f54442b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f54445e) {
            if (this.f54443c.remove(str) != null) {
                k5.j.c().a(f54440f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f54444d.remove(str);
            }
        }
    }
}
