package ai;

import ai.wc2;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class gb2<S extends wc2> implements xc2<S> {

    /* renamed from: a  reason: collision with root package name */
    public final xc2<S> f4382a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4383b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f4384c;

    public gb2(xc2<S> xc2Var, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.f4382a = xc2Var;
        this.f4383b = j10;
        this.f4384c = scheduledExecutorService;
    }

    @Override // ai.xc2
    public final s43<S> zza() {
        s43<S> zza = this.f4382a.zza();
        long j10 = this.f4383b;
        if (j10 > 0) {
            zza = j43.h(zza, j10, TimeUnit.MILLISECONDS, this.f4384c);
        }
        return j43.g(zza, Throwable.class, fb2.f3989a, hk0.f4883f);
    }
}
