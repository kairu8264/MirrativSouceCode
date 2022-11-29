package hn;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public final n0 f36287a;

    /* renamed from: b  reason: collision with root package name */
    public String f36288b;

    /* renamed from: c  reason: collision with root package name */
    public Timer f36289c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36290d;

    /* renamed from: e  reason: collision with root package name */
    public long f36291e;

    /* renamed from: f  reason: collision with root package name */
    public w f36292f;

    /* loaded from: classes4.dex */
    public final class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            z.this.d();
        }
    }

    public z(n0 n0Var, String str, w wVar) {
        this.f36287a = n0Var;
        this.f36288b = str;
        this.f36292f = wVar;
    }

    public static boolean g(Timer timer, b bVar, long j10) {
        try {
            timer.schedule(bVar, j10);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public final r0 b() {
        return c(e());
    }

    public abstract r0 c(byte[] bArr);

    public final void d() {
        synchronized (this) {
            if (this.f36291e != 0 && this.f36287a.B()) {
                this.f36287a.N(b());
                this.f36290d = g(this.f36289c, new b(), this.f36291e);
                return;
            }
            this.f36290d = false;
        }
    }

    public final byte[] e() {
        w wVar = this.f36292f;
        if (wVar == null) {
            return null;
        }
        try {
            return wVar.a();
        } catch (Throwable unused) {
            return null;
        }
    }

    public long f() {
        long j10;
        synchronized (this) {
            j10 = this.f36291e;
        }
        return j10;
    }

    public void h(long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        synchronized (this) {
            this.f36291e = j10;
        }
        if (j10 != 0 && this.f36287a.B()) {
            synchronized (this) {
                if (this.f36289c == null) {
                    if (this.f36288b == null) {
                        this.f36289c = new Timer();
                    } else {
                        this.f36289c = new Timer(this.f36288b);
                    }
                }
                if (!this.f36290d) {
                    this.f36290d = g(this.f36289c, new b(), j10);
                }
            }
        }
    }

    public void i() {
        h(f());
    }

    public void j() {
        synchronized (this) {
            Timer timer = this.f36289c;
            if (timer == null) {
                return;
            }
            this.f36290d = false;
            timer.cancel();
        }
    }
}
