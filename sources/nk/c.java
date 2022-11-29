package nk;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public interface c<V> extends Future<V> {
    void i(Runnable runnable, Executor executor);
}
