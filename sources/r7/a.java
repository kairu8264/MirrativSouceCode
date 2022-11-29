package r7;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: x  reason: collision with root package name */
    public static final long f49807x = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: y  reason: collision with root package name */
    public static volatile int f49808y;

    /* renamed from: w  reason: collision with root package name */
    public final ExecutorService f49809w;

    /* renamed from: r7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0757a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f49810a;

        /* renamed from: b  reason: collision with root package name */
        public int f49811b;

        /* renamed from: c  reason: collision with root package name */
        public int f49812c;

        /* renamed from: d  reason: collision with root package name */
        public c f49813d = c.f49824d;

        /* renamed from: e  reason: collision with root package name */
        public String f49814e;

        /* renamed from: f  reason: collision with root package name */
        public long f49815f;

        public C0757a(boolean z10) {
            this.f49810a = z10;
        }

        public a a() {
            if (!TextUtils.isEmpty(this.f49814e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f49811b, this.f49812c, this.f49815f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f49814e, this.f49813d, this.f49810a));
                if (this.f49815f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f49814e);
        }

        public C0757a b(String str) {
            this.f49814e = str;
            return this;
        }

        public C0757a c(int i10) {
            this.f49811b = i10;
            this.f49812c = i10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final String f49816a;

        /* renamed from: b  reason: collision with root package name */
        public final c f49817b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f49818c;

        /* renamed from: d  reason: collision with root package name */
        public int f49819d;

        /* renamed from: r7.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0758a extends Thread {
            public C0758a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (b.this.f49818c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th2) {
                    b.this.f49817b.a(th2);
                }
            }
        }

        public b(String str, c cVar, boolean z10) {
            this.f49816a = str;
            this.f49817b = cVar;
            this.f49818c = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C0758a c0758a;
            c0758a = new C0758a(runnable, "glide-" + this.f49816a + "-thread-" + this.f49819d);
            this.f49819d = this.f49819d + 1;
            return c0758a;
        }
    }

    /* loaded from: classes.dex */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f49821a = new C0759a();

        /* renamed from: b  reason: collision with root package name */
        public static final c f49822b;

        /* renamed from: c  reason: collision with root package name */
        public static final c f49823c;

        /* renamed from: d  reason: collision with root package name */
        public static final c f49824d;

        /* renamed from: r7.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0759a implements c {
            @Override // r7.a.c
            public void a(Throwable th2) {
            }
        }

        /* loaded from: classes.dex */
        public class b implements c {
            @Override // r7.a.c
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        /* renamed from: r7.a$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0760c implements c {
            @Override // r7.a.c
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f49822b = bVar;
            f49823c = new C0760c();
            f49824d = bVar;
        }

        void a(Throwable th2);
    }

    public a(ExecutorService executorService) {
        this.f49809w = executorService;
    }

    public static int a() {
        if (f49808y == 0) {
            f49808y = Math.min(4, r7.b.a());
        }
        return f49808y;
    }

    public static C0757a b() {
        return new C0757a(true).c(a() >= 4 ? 2 : 1).b("animation");
    }

    public static a c() {
        return b().a();
    }

    public static C0757a d() {
        return new C0757a(true).c(1).b("disk-cache");
    }

    public static a e() {
        return d().a();
    }

    public static C0757a f() {
        return new C0757a(false).c(a()).b("source");
    }

    public static a g() {
        return f().a();
    }

    public static a i() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f49807x, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.f49824d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f49809w.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f49809w.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f49809w.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f49809w.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f49809w.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f49809w.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f49809w.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f49809w.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f49809w.submit(runnable);
    }

    public String toString() {
        return this.f49809w.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f49809w.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f49809w.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f49809w.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f49809w.submit(callable);
    }
}
