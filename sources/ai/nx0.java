package ai;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class nx0 implements ol {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledExecutorService f7552a;

    /* renamed from: b  reason: collision with root package name */
    public final vh.f f7553b;

    /* renamed from: c  reason: collision with root package name */
    public ScheduledFuture<?> f7554c;

    /* renamed from: d  reason: collision with root package name */
    public long f7555d = -1;

    /* renamed from: e  reason: collision with root package name */
    public long f7556e = -1;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f7557f = null;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7558g = false;

    public nx0(ScheduledExecutorService scheduledExecutorService, vh.f fVar) {
        this.f7552a = scheduledExecutorService;
        this.f7553b = fVar;
        wg.t.g().b(this);
    }

    public final synchronized void a(int i10, Runnable runnable) {
        this.f7557f = runnable;
        long j10 = i10;
        this.f7555d = this.f7553b.elapsedRealtime() + j10;
        this.f7554c = this.f7552a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // ai.ol
    public final void b(boolean z10) {
        if (z10) {
            d();
        } else {
            c();
        }
    }

    public final synchronized void c() {
        if (this.f7558g) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f7554c;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f7556e = -1L;
        } else {
            this.f7554c.cancel(true);
            this.f7556e = this.f7555d - this.f7553b.elapsedRealtime();
        }
        this.f7558g = true;
    }

    public final synchronized void d() {
        ScheduledFuture<?> scheduledFuture;
        if (this.f7558g) {
            if (this.f7556e > 0 && (scheduledFuture = this.f7554c) != null && scheduledFuture.isCancelled()) {
                this.f7554c = this.f7552a.schedule(this.f7557f, this.f7556e, TimeUnit.MILLISECONDS);
            }
            this.f7558g = false;
        }
    }
}
