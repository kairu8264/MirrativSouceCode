package ai;

/* loaded from: classes3.dex */
public final class el2 {

    /* renamed from: a  reason: collision with root package name */
    public final vh.f f3713a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3714b = new Object();

    /* renamed from: d  reason: collision with root package name */
    public volatile int f3716d = 1;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f3715c = 0;

    public el2(vh.f fVar) {
        this.f3713a = fVar;
    }

    public final void a(boolean z10) {
        if (z10) {
            f(1, 2);
        } else {
            f(2, 1);
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f3714b) {
            e();
            z10 = this.f3716d == 2;
        }
        return z10;
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f3714b) {
            e();
            z10 = this.f3716d == 3;
        }
        return z10;
    }

    public final void d() {
        f(2, 3);
    }

    public final void e() {
        long currentTimeMillis = this.f3713a.currentTimeMillis();
        synchronized (this.f3714b) {
            if (this.f3716d == 3) {
                if (this.f3715c + ((Long) ft.c().c(ox.f8033l4)).longValue() <= currentTimeMillis) {
                    this.f3716d = 1;
                }
            }
        }
    }

    public final void f(int i10, int i11) {
        e();
        long currentTimeMillis = this.f3713a.currentTimeMillis();
        synchronized (this.f3714b) {
            if (this.f3716d != i10) {
                return;
            }
            this.f3716d = i11;
            if (this.f3716d == 3) {
                this.f3715c = currentTimeMillis;
            }
        }
    }
}
