package yg;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public long f61876a;

    /* renamed from: b  reason: collision with root package name */
    public long f61877b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Object f61878c = new Object();

    public e1(long j10) {
        this.f61876a = j10;
    }

    public final boolean a() {
        synchronized (this.f61878c) {
            long elapsedRealtime = wg.t.k().elapsedRealtime();
            if (this.f61877b + this.f61876a > elapsedRealtime) {
                return false;
            }
            this.f61877b = elapsedRealtime;
            return true;
        }
    }

    public final void b(long j10) {
        synchronized (this.f61878c) {
            this.f61876a = j10;
        }
    }
}
