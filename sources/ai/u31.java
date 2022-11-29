package ai;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class u31 implements v41, xb1, t91, l51 {
    public final a53<Boolean> A = a53.E();
    public ScheduledFuture<?> B;

    /* renamed from: w  reason: collision with root package name */
    public final n51 f10592w;

    /* renamed from: x  reason: collision with root package name */
    public final fl2 f10593x;

    /* renamed from: y  reason: collision with root package name */
    public final ScheduledExecutorService f10594y;

    /* renamed from: z  reason: collision with root package name */
    public final Executor f10595z;

    public u31(n51 n51Var, fl2 fl2Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f10592w = n51Var;
        this.f10593x = fl2Var;
        this.f10594y = scheduledExecutorService;
        this.f10595z = executor;
    }

    @Override // ai.v41
    public final void B(ye0 ye0Var, String str, String str2) {
    }

    @Override // ai.t91
    public final synchronized void b() {
        if (this.A.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.A.u(Boolean.TRUE);
    }

    @Override // ai.t91
    public final void c() {
    }

    @Override // ai.xb1
    public final void d() {
    }

    @Override // ai.v41
    public final void e() {
        int i10 = this.f10593x.U;
        if (i10 == 0 || i10 == 1) {
            this.f10592w.zza();
        }
    }

    public final /* synthetic */ void f() {
        synchronized (this) {
            if (this.A.isDone()) {
                return;
            }
            this.A.u(Boolean.TRUE);
        }
    }

    @Override // ai.v41
    public final void g() {
    }

    @Override // ai.v41
    public final void h() {
    }

    @Override // ai.v41
    public final void j() {
    }

    @Override // ai.v41
    public final void k() {
    }

    @Override // ai.l51
    public final synchronized void n(sr srVar) {
        if (this.A.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.B;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.A.v(new Exception());
    }

    @Override // ai.xb1
    public final void zzb() {
        if (((Boolean) ft.c().c(ox.f7939a1)).booleanValue()) {
            fl2 fl2Var = this.f10593x;
            if (fl2Var.U == 2) {
                if (fl2Var.f4106q == 0) {
                    this.f10592w.zza();
                    return;
                }
                j43.p(this.A, new t31(this), this.f10595z);
                this.B = this.f10594y.schedule(new Runnable(this) { // from class: ai.s31

                    /* renamed from: w  reason: collision with root package name */
                    public final u31 f9699w;

                    {
                        this.f9699w = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9699w.f();
                    }
                }, this.f10593x.f4106q, TimeUnit.MILLISECONDS);
            }
        }
    }
}
