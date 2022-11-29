package al;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class t {

    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13878a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicLong f13879b;

        /* renamed from: al.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0039a extends c {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Runnable f13880w;

            public C0039a(Runnable runnable) {
                this.f13880w = runnable;
            }

            @Override // al.c
            public void a() {
                this.f13880w.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.f13878a = str;
            this.f13879b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0039a(runnable));
            newThread.setName(this.f13878a + this.f13879b.getAndIncrement());
            return newThread;
        }
    }

    /* loaded from: classes2.dex */
    public class b extends c {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f13882w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ExecutorService f13883x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f13884y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ TimeUnit f13885z;

        public b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f13882w = str;
            this.f13883x = executorService;
            this.f13884y = j10;
            this.f13885z = timeUnit;
        }

        @Override // al.c
        public void a() {
            try {
                xk.f f10 = xk.f.f();
                f10.b("Executing shutdown hook for " + this.f13882w);
                this.f13883x.shutdown();
                if (this.f13883x.awaitTermination(this.f13884y, this.f13885z)) {
                    return;
                }
                xk.f f11 = xk.f.f();
                f11.b(this.f13882w + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f13883x.shutdownNow();
            } catch (InterruptedException unused) {
                xk.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f13882w));
                this.f13883x.shutdownNow();
            }
        }
    }

    public static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j10, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e10 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e10);
        return e10;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    public static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
