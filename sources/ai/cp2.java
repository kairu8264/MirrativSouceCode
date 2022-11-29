package ai;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class cp2 implements rn3<ScheduledExecutorService> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<ThreadFactory> f2897a;

    public cp2(eo3<ThreadFactory> eo3Var) {
        this.f2897a = eo3Var;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        mw2.a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, this.f2897a.zzb()));
        zn3.b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
