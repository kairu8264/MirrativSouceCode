package ai;

/* loaded from: classes3.dex */
public final class dj0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3312a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public volatile int f3314c = 1;

    /* renamed from: b  reason: collision with root package name */
    public volatile long f3313b = 0;

    public /* synthetic */ dj0(ej0 ej0Var) {
    }

    public final void a() {
        long currentTimeMillis = wg.t.k().currentTimeMillis();
        synchronized (this.f3312a) {
            if (this.f3314c == 3) {
                if (this.f3313b + ((Long) ft.c().c(ox.f8033l4)).longValue() <= currentTimeMillis) {
                    this.f3314c = 1;
                }
            }
        }
        long currentTimeMillis2 = wg.t.k().currentTimeMillis();
        synchronized (this.f3312a) {
            if (this.f3314c != 2) {
                return;
            }
            this.f3314c = 3;
            if (this.f3314c == 3) {
                this.f3313b = currentTimeMillis2;
            }
        }
    }
}
