package ai;

/* loaded from: classes3.dex */
public final class x9 {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f11887a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11888b;

    public x9(v9 v9Var) {
        this.f11887a = v9Var;
    }

    public final synchronized boolean a() {
        if (this.f11888b) {
            return false;
        }
        this.f11888b = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z10;
        z10 = this.f11888b;
        this.f11888b = false;
        return z10;
    }

    public final synchronized void c() throws InterruptedException {
        while (!this.f11888b) {
            wait();
        }
    }

    public final synchronized void d() {
        boolean z10 = false;
        while (!this.f11888b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean e() {
        return this.f11888b;
    }
}
