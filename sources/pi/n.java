package pi;

import android.os.Handler;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: d  reason: collision with root package name */
    public static volatile Handler f48054d;

    /* renamed from: a  reason: collision with root package name */
    public final x5 f48055a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f48056b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f48057c;

    public n(x5 x5Var) {
        rh.p.i(x5Var);
        this.f48055a = x5Var;
        this.f48056b = new m(this, x5Var);
    }

    public final void b() {
        this.f48057c = 0L;
        f().removeCallbacks(this.f48056b);
    }

    public abstract void c();

    public final void d(long j10) {
        b();
        if (j10 >= 0) {
            this.f48057c = this.f48055a.c().currentTimeMillis();
            if (f().postDelayed(this.f48056b, j10)) {
                return;
            }
            this.f48055a.r().p().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean e() {
        return this.f48057c != 0;
    }

    public final Handler f() {
        Handler handler;
        if (f48054d != null) {
            return f48054d;
        }
        synchronized (n.class) {
            if (f48054d == null) {
                f48054d = new hi.a1(this.f48055a.F().getMainLooper());
            }
            handler = f48054d;
        }
        return handler;
    }
}
