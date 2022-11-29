package em;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class m {
    public static ScheduledExecutorService a() {
        return new ScheduledThreadPoolExecutor(1, new wh.a("Firebase-Messaging-Init"));
    }

    public static ExecutorService b() {
        gi.i.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new wh.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static ExecutorService c() {
        return Executors.newSingleThreadExecutor(new wh.a("Firebase-Messaging-Network-Io"));
    }

    public static ExecutorService d() {
        return Executors.newSingleThreadExecutor(new wh.a("Firebase-Messaging-Task"));
    }

    public static ScheduledExecutorService e() {
        return new ScheduledThreadPoolExecutor(1, new wh.a("Firebase-Messaging-Topics-Io"));
    }
}
