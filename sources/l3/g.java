package l3;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class g {

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public String f39541a;

        /* renamed from: b  reason: collision with root package name */
        public int f39542b;

        /* renamed from: l3.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0563a extends Thread {

            /* renamed from: w  reason: collision with root package name */
            public final int f39543w;

            public C0563a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f39543w = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f39543w);
                super.run();
            }
        }

        public a(String str, int i10) {
            this.f39541a = str;
            this.f39542b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0563a(runnable, this.f39541a, this.f39542b);
        }
    }

    /* loaded from: classes.dex */
    public static class b<T> implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public Callable<T> f39544w;

        /* renamed from: x  reason: collision with root package name */
        public n3.a<T> f39545x;

        /* renamed from: y  reason: collision with root package name */
        public Handler f39546y;

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ n3.a f39547w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ Object f39548x;

            public a(n3.a aVar, Object obj) {
                this.f39547w = aVar;
                this.f39548x = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f39547w.accept(this.f39548x);
            }
        }

        public b(Handler handler, Callable<T> callable, n3.a<T> aVar) {
            this.f39544w = callable;
            this.f39545x = aVar;
            this.f39546y = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t10;
            try {
                t10 = this.f39544w.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f39546y.post(new a(this.f39545x, t10));
        }
    }

    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static <T> void b(Executor executor, Callable<T> callable, n3.a<T> aVar) {
        executor.execute(new b(l3.b.a(), callable, aVar));
    }

    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
