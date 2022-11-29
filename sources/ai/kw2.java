package ai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class kw2 implements jw2 {
    public /* synthetic */ kw2(lw2 lw2Var) {
    }

    @Override // ai.jw2
    public final ExecutorService a(int i10) {
        return c(1, Executors.defaultThreadFactory(), 2);
    }

    @Override // ai.jw2
    public final ExecutorService b(ThreadFactory threadFactory, int i10) {
        return c(1, threadFactory, 1);
    }

    @Override // ai.jw2
    public final ExecutorService c(int i10, ThreadFactory threadFactory, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
