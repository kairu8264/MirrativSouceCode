package dq;

import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class b implements Runnable, k {

    /* renamed from: w  reason: collision with root package name */
    public final j f29779w = new j();

    /* renamed from: x  reason: collision with root package name */
    public final c f29780x;

    /* renamed from: y  reason: collision with root package name */
    public volatile boolean f29781y;

    public b(c cVar) {
        this.f29780x = cVar;
    }

    @Override // dq.k
    public void a(p pVar, Object obj) {
        i a10 = i.a(pVar, obj);
        synchronized (this) {
            this.f29779w.a(a10);
            if (!this.f29781y) {
                this.f29781y = true;
                this.f29780x.d().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                i c10 = this.f29779w.c(1000);
                if (c10 == null) {
                    synchronized (this) {
                        c10 = this.f29779w.b();
                        if (c10 == null) {
                            return;
                        }
                    }
                }
                this.f29780x.g(c10);
            } catch (InterruptedException e10) {
                f e11 = this.f29780x.e();
                Level level = Level.WARNING;
                e11.a(level, Thread.currentThread().getName() + " was interruppted", e10);
                return;
            } finally {
                this.f29781y = false;
            }
        }
    }
}
