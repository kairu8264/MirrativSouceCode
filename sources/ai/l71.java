package ai;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class l71 extends ja1<m71> {
    public long A;
    public boolean B;
    public ScheduledFuture<?> C;

    /* renamed from: x  reason: collision with root package name */
    public final ScheduledExecutorService f6490x;

    /* renamed from: y  reason: collision with root package name */
    public final vh.f f6491y;

    /* renamed from: z  reason: collision with root package name */
    public long f6492z;

    public l71(ScheduledExecutorService scheduledExecutorService, vh.f fVar) {
        super(Collections.emptySet());
        this.f6492z = -1L;
        this.A = -1L;
        this.B = false;
        this.f6490x = scheduledExecutorService;
        this.f6491y = fVar;
    }

    public final synchronized void S0(int i10) {
        if (i10 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i10);
        if (this.B) {
            long j10 = this.A;
            if (j10 <= 0 || millis >= j10) {
                millis = j10;
            }
            this.A = millis;
            return;
        }
        long elapsedRealtime = this.f6491y.elapsedRealtime();
        long j11 = this.f6492z;
        if (elapsedRealtime > j11 || j11 - this.f6491y.elapsedRealtime() > millis) {
            T0(millis);
        }
    }

    public final synchronized void T0(long j10) {
        ScheduledFuture<?> scheduledFuture = this.C;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.C.cancel(true);
        }
        this.f6492z = this.f6491y.elapsedRealtime() + j10;
        this.C = this.f6490x.schedule(new k71(this, null), j10, TimeUnit.MILLISECONDS);
    }

    public final synchronized void b() {
        this.B = false;
        T0(0L);
    }

    public final synchronized void zza() {
        if (this.B) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.C;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.A = -1L;
        } else {
            this.C.cancel(true);
            this.A = this.f6492z - this.f6491y.elapsedRealtime();
        }
        this.B = true;
    }

    public final synchronized void zzb() {
        if (this.B) {
            if (this.A > 0 && this.C.isCancelled()) {
                T0(this.A);
            }
            this.B = false;
        }
    }
}
