package ai;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public interface t43 extends ExecutorService {
    <T> s43<T> h(Callable<T> callable);

    s43<?> q(Runnable runnable);
}
