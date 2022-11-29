package ai;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class w43<V> extends c43<V> implements ScheduledFuture<V> {

    /* renamed from: x  reason: collision with root package name */
    public final ScheduledFuture<?> f11492x;

    public w43(s43<V> s43Var, ScheduledFuture<?> scheduledFuture) {
        super(s43Var);
        this.f11492x = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean cancel = e().cancel(z10);
        if (cancel) {
            this.f11492x.cancel(z10);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f11492x.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f11492x.getDelay(timeUnit);
    }
}
