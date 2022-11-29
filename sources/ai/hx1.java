package ai;

/* loaded from: classes3.dex */
public final class hx1 {

    /* renamed from: a  reason: collision with root package name */
    public int f5024a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f5025b = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f5026c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f5027d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final Object f5028e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final Object f5029f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final Object f5030g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final Object f5031h = new Object();

    public final void a(int i10) {
        synchronized (this.f5028e) {
            this.f5024a = i10;
        }
    }

    public final int b() {
        int i10;
        synchronized (this.f5028e) {
            i10 = this.f5024a;
        }
        return i10;
    }

    public final void c(long j10) {
        synchronized (this.f5029f) {
            this.f5025b = j10;
        }
    }

    public final long d() {
        long j10;
        synchronized (this.f5029f) {
            j10 = this.f5025b;
        }
        return j10;
    }

    public final synchronized void e(long j10) {
        synchronized (this.f5030g) {
            this.f5026c = j10;
        }
    }

    public final synchronized long f() {
        long j10;
        synchronized (this.f5030g) {
            j10 = this.f5026c;
        }
        return j10;
    }

    public final synchronized void g(long j10) {
        synchronized (this.f5031h) {
            this.f5027d = j10;
        }
    }

    public final synchronized long h() {
        long j10;
        synchronized (this.f5031h) {
            j10 = this.f5027d;
        }
        return j10;
    }
}
