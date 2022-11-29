package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class d43<V> extends b43<V> implements s43<V> {
    @Override // ai.s43
    public final void c(Runnable runnable, Executor executor) {
        h().c(runnable, executor);
    }

    public abstract s43<? extends V> h();
}
