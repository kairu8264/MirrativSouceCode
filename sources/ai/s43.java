package ai;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public interface s43<V> extends Future<V> {
    void c(Runnable runnable, Executor executor);
}
