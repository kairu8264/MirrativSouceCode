package r6;

import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p6.k;

/* loaded from: classes.dex */
public class g implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f49790a;

    /* loaded from: classes.dex */
    public class a implements Thread.UncaughtExceptionHandler {
        public a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            k.h().c("Thread [%s] with error [%s]", thread.getName(), th2.getMessage());
        }
    }

    public g(String str) {
        this.f49790a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setPriority(9);
        newThread.setName("Adjust-" + newThread.getName() + "-" + this.f49790a);
        newThread.setDaemon(true);
        newThread.setUncaughtExceptionHandler(new a());
        return newThread;
    }
}
