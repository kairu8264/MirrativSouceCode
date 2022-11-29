package ai;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class hk0 {

    /* renamed from: a  reason: collision with root package name */
    public static final t43 f4878a;

    /* renamed from: b  reason: collision with root package name */
    public static final t43 f4879b;

    /* renamed from: c  reason: collision with root package name */
    public static final t43 f4880c;

    /* renamed from: d  reason: collision with root package name */
    public static final ScheduledExecutorService f4881d;

    /* renamed from: e  reason: collision with root package name */
    public static final t43 f4882e;

    /* renamed from: f  reason: collision with root package name */
    public static final t43 f4883f;

    static {
        Executor threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3;
        if (vh.e.a()) {
            mw2.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new dk0("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new dk0("Default"));
        }
        f4878a = new fk0(threadPoolExecutor, null);
        if (vh.e.a()) {
            threadPoolExecutor2 = mw2.a().c(5, new dk0("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dk0("Loader"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            threadPoolExecutor2 = threadPoolExecutor4;
        }
        f4879b = new fk0(threadPoolExecutor2, null);
        if (vh.e.a()) {
            threadPoolExecutor3 = mw2.a().b(new dk0("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor5 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dk0("Activeview"));
            threadPoolExecutor5.allowCoreThreadTimeOut(true);
            threadPoolExecutor3 = threadPoolExecutor5;
        }
        f4880c = new fk0(threadPoolExecutor3, null);
        f4881d = new ck0(3, new dk0("Schedule"));
        f4882e = new fk0(new ek0(), null);
        f4883f = new fk0(z43.a(), null);
    }
}
