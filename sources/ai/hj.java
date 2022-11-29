package ai;

/* loaded from: classes3.dex */
public final class hj {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4860a;

    public final synchronized boolean a() {
        if (this.f4860a) {
            return false;
        }
        this.f4860a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z10;
        z10 = this.f4860a;
        this.f4860a = false;
        return z10;
    }

    public final synchronized void c() throws InterruptedException {
        while (!this.f4860a) {
            wait();
        }
    }
}
