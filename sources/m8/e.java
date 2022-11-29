package m8;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public Runnable f40624a;

    /* renamed from: b  reason: collision with root package name */
    public a f40625b;

    /* renamed from: c  reason: collision with root package name */
    public ScheduledExecutorService f40626c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture<?> f40627d = null;

    public e(Runnable runnable, int i10, int i11, ScheduledExecutorService scheduledExecutorService) {
        this.f40625b = new a(i10, i11);
        this.f40626c = scheduledExecutorService;
        this.f40624a = runnable;
    }

    public synchronized void a() {
        this.f40627d = null;
        this.f40625b.c();
    }

    public synchronized void b() {
        if (this.f40625b.b()) {
            this.f40625b.a();
            c();
        } else {
            a();
        }
    }

    public final void c() {
        ScheduledFuture<?> scheduledFuture = this.f40627d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f40627d = this.f40626c.schedule(this.f40624a, this.f40625b.d(), TimeUnit.MILLISECONDS);
    }

    public synchronized void d() {
        if (this.f40627d != null) {
            return;
        }
        this.f40625b.c();
        c();
    }
}
