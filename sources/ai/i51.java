package ai;

import com.google.android.gms.internal.ads.zzdkm;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class i51 extends ja1<z41> implements z41 {
    public final boolean A;

    /* renamed from: x  reason: collision with root package name */
    public final ScheduledExecutorService f5120x;

    /* renamed from: y  reason: collision with root package name */
    public ScheduledFuture<?> f5121y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5122z;

    public i51(h51 h51Var, Set<gc1<z41>> set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f5122z = false;
        this.f5120x = scheduledExecutorService;
        this.A = ((Boolean) ft.c().c(ox.X6)).booleanValue();
        y0(h51Var, executor);
    }

    public final /* synthetic */ void a() {
        synchronized (this) {
            uj0.c("Timeout waiting for show call succeed to be called.");
            j0(new zzdkm("Timeout for show call succeed."));
            this.f5122z = true;
        }
    }

    public final synchronized void b() {
        if (this.A) {
            ScheduledFuture<?> scheduledFuture = this.f5121y;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    public final void c() {
        if (this.A) {
            this.f5121y = this.f5120x.schedule(new Runnable(this) { // from class: ai.d51

                /* renamed from: w  reason: collision with root package name */
                public final i51 f3151w;

                {
                    this.f3151w = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f3151w.a();
                }
            }, ((Integer) ft.c().c(ox.Y6)).intValue(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // ai.z41
    public final void d() {
        C0(c51.f2716a);
    }

    @Override // ai.z41
    public final void j0(final zzdkm zzdkmVar) {
        if (this.A) {
            if (this.f5122z) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.f5121y;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
        C0(new ia1(zzdkmVar) { // from class: ai.b51

            /* renamed from: a  reason: collision with root package name */
            public final zzdkm f2243a;

            {
                this.f2243a = zzdkmVar;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((z41) obj).j0(this.f2243a);
            }
        });
    }

    @Override // ai.z41
    public final void y(final sr srVar) {
        C0(new ia1(srVar) { // from class: ai.a51

            /* renamed from: a  reason: collision with root package name */
            public final sr f1747a;

            {
                this.f1747a = srVar;
            }

            @Override // ai.ia1
            public final void a(Object obj) {
                ((z41) obj).y(this.f1747a);
            }
        });
    }
}
