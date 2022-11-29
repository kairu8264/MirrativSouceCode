package r6;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p6.c1;
import p6.k;
import p6.z;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public b f49801a;

    /* renamed from: b  reason: collision with root package name */
    public ScheduledFuture f49802b;

    /* renamed from: c  reason: collision with root package name */
    public String f49803c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f49804d;

    /* renamed from: e  reason: collision with root package name */
    public z f49805e = k.h();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f49805e.g("%s fired", j.this.f49803c);
            j.this.f49804d.run();
            j.this.f49802b = null;
        }
    }

    public j(Runnable runnable, String str) {
        this.f49803c = str;
        this.f49801a = new e(str, true);
        this.f49804d = runnable;
    }

    public void e() {
        f(false);
    }

    public final void f(boolean z10) {
        ScheduledFuture scheduledFuture = this.f49802b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(z10);
        }
        this.f49802b = null;
        this.f49805e.g("%s canceled", this.f49803c);
    }

    public long g() {
        ScheduledFuture scheduledFuture = this.f49802b;
        if (scheduledFuture == null) {
            return 0L;
        }
        return scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
    }

    public void h(long j10) {
        f(false);
        this.f49805e.g("%s starting. Launching in %s seconds", this.f49803c, c1.f45890a.format(j10 / 1000.0d));
        this.f49802b = this.f49801a.b(new a(), j10);
    }
}
