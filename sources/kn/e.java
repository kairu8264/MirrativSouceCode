package kn;

import in.o;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f38893a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f38894b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f38895c;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f38893a = availableProcessors;
        f38894b = availableProcessors + 1;
        f38895c = (availableProcessors * 2) + 1;
    }

    public static void c(String str, ExecutorService executorService) {
        d(str, executorService, 1L, TimeUnit.SECONDS);
    }

    public static void d(final String str, final ExecutorService executorService, final long j10, final TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        Runnable runnable = new Runnable() { // from class: kn.c
            @Override // java.lang.Runnable
            public final void run() {
                e.g(executorService, j10, timeUnit, str);
            }
        };
        runtime.addShutdownHook(new Thread(runnable, "Twitter Shutdown Hook for " + str));
    }

    public static ExecutorService e(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f38894b, f38895c, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f(str));
        c(str, threadPoolExecutor);
        return threadPoolExecutor;
    }

    public static ThreadFactory f(final String str) {
        final AtomicLong atomicLong = new AtomicLong(1L);
        return new ThreadFactory() { // from class: kn.d
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread h10;
                h10 = e.h(str, atomicLong, runnable);
                return h10;
            }
        };
    }

    public static /* synthetic */ void g(ExecutorService executorService, long j10, TimeUnit timeUnit, String str) {
        try {
            executorService.shutdown();
            if (executorService.awaitTermination(j10, timeUnit)) {
                return;
            }
            in.h g10 = o.g();
            g10.b("Twitter", str + " did not shutdown in the allocated time. Requesting immediate shutdown.");
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            o.g().b("Twitter", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
            executorService.shutdownNow();
        }
    }

    public static /* synthetic */ Thread h(String str, AtomicLong atomicLong, Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName(str + atomicLong.getAndIncrement());
        return newThread;
    }
}
