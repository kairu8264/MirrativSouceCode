package ai;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class y43 extends v43 implements ScheduledExecutorService {

    /* renamed from: x  reason: collision with root package name */
    public final ScheduledExecutorService f12446x;

    public y43(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.f12446x = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        i53 F = i53.F(runnable, null);
        return new w43(F, this.f12446x.schedule(F, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        x43 x43Var = new x43(runnable);
        return new w43(x43Var, this.f12446x.scheduleAtFixedRate(x43Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        x43 x43Var = new x43(runnable);
        return new w43(x43Var, this.f12446x.scheduleWithFixedDelay(x43Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        i53 i53Var = new i53(callable);
        return new w43(i53Var, this.f12446x.schedule(i53Var, j10, timeUnit));
    }
}
