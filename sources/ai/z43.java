package ai;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class z43 {
    public static Executor a() {
        return w33.INSTANCE;
    }

    public static t43 b(ExecutorService executorService) {
        t43 v43Var;
        if (executorService instanceof t43) {
            return (t43) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            v43Var = new y43((ScheduledExecutorService) executorService);
        } else {
            v43Var = new v43(executorService);
        }
        return v43Var;
    }

    public static Executor c(Executor executor, a33<?> a33Var) {
        Objects.requireNonNull(executor);
        return executor == w33.INSTANCE ? executor : new u43(executor, a33Var);
    }
}
