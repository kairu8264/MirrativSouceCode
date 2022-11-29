package r6;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p6.k;

/* loaded from: classes.dex */
public class e implements r6.b {

    /* renamed from: a  reason: collision with root package name */
    public ScheduledThreadPoolExecutor f49785a;

    /* loaded from: classes.dex */
    public class a implements RejectedExecutionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f49786a;

        public a(String str) {
            this.f49786a = str;
        }

        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            k.h().b("Runnable [%s] rejected from [%s] ", runnable.toString(), this.f49786a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Callable<V> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Callable f49788a;

        public b(Callable callable) {
            this.f49788a = callable;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [V, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public V call() {
            try {
                return this.f49788a.call();
            } catch (Throwable th2) {
                k.h().c("Callable error [%s] of type [%s]", th2.getMessage(), th2.getClass().getCanonicalName());
                return null;
            }
        }
    }

    public e(String str, boolean z10) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new g(str), new a(str));
        this.f49785a = scheduledThreadPoolExecutor;
        if (z10) {
            return;
        }
        scheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
        this.f49785a.allowCoreThreadTimeOut(true);
    }

    @Override // r6.b
    public ScheduledFuture<?> a(Runnable runnable, long j10, long j11) {
        return this.f49785a.scheduleWithFixedDelay(new c(runnable), j10, j11, TimeUnit.MILLISECONDS);
    }

    @Override // r6.b
    public ScheduledFuture<?> b(Runnable runnable, long j10) {
        return this.f49785a.schedule(new c(runnable), j10, TimeUnit.MILLISECONDS);
    }

    public <V> ScheduledFuture<V> c(Callable<V> callable, long j10) {
        return this.f49785a.schedule(new b(callable), j10, TimeUnit.MILLISECONDS);
    }
}
