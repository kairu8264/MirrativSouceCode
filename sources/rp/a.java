package rp;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class a extends i0 {

    /* renamed from: i  reason: collision with root package name */
    public static final C0783a f51638i = new C0783a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final long f51639j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f51640k;

    /* renamed from: l  reason: collision with root package name */
    public static a f51641l;

    /* renamed from: f  reason: collision with root package name */
    public boolean f51642f;

    /* renamed from: g  reason: collision with root package name */
    public a f51643g;

    /* renamed from: h  reason: collision with root package name */
    public long f51644h;

    /* renamed from: rp.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0783a {
        public C0783a() {
        }

        public /* synthetic */ C0783a(jo.h hVar) {
            this();
        }

        public final a c() throws InterruptedException {
            a aVar = a.f51641l;
            jo.p.e(aVar);
            a aVar2 = aVar.f51643g;
            if (aVar2 != null) {
                long w10 = aVar2.w(System.nanoTime());
                if (w10 <= 0) {
                    a aVar3 = a.f51641l;
                    jo.p.e(aVar3);
                    aVar3.f51643g = aVar2.f51643g;
                    aVar2.f51643g = null;
                    return aVar2;
                }
                long j10 = w10 / 1000000;
                a.class.wait(j10, (int) (w10 - (1000000 * j10)));
                return null;
            }
            long nanoTime = System.nanoTime();
            a.class.wait(a.f51639j);
            a aVar4 = a.f51641l;
            jo.p.e(aVar4);
            if (aVar4.f51643g != null || System.nanoTime() - nanoTime < a.f51640k) {
                return null;
            }
            return a.f51641l;
        }

        public final boolean d(a aVar) {
            synchronized (a.class) {
                if (aVar.f51642f) {
                    aVar.f51642f = false;
                    for (a aVar2 = a.f51641l; aVar2 != null; aVar2 = aVar2.f51643g) {
                        if (aVar2.f51643g == aVar) {
                            aVar2.f51643g = aVar.f51643g;
                            aVar.f51643g = null;
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
        }

        public final void e(a aVar, long j10, boolean z10) {
            synchronized (a.class) {
                if (!aVar.f51642f) {
                    aVar.f51642f = true;
                    if (a.f51641l == null) {
                        C0783a c0783a = a.f51638i;
                        a.f51641l = new a();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    if (i10 != 0 && z10) {
                        aVar.f51644h = Math.min(j10, aVar.c() - nanoTime) + nanoTime;
                    } else if (i10 != 0) {
                        aVar.f51644h = j10 + nanoTime;
                    } else if (z10) {
                        aVar.f51644h = aVar.c();
                    } else {
                        throw new AssertionError();
                    }
                    long w10 = aVar.w(nanoTime);
                    a aVar2 = a.f51641l;
                    jo.p.e(aVar2);
                    while (aVar2.f51643g != null) {
                        a aVar3 = aVar2.f51643g;
                        jo.p.e(aVar3);
                        if (w10 < aVar3.w(nanoTime)) {
                            break;
                        }
                        aVar2 = aVar2.f51643g;
                        jo.p.e(aVar2);
                    }
                    aVar.f51643g = aVar2.f51643g;
                    aVar2.f51643g = aVar;
                    if (aVar2 == a.f51641l) {
                        a.class.notify();
                    }
                    wn.v vVar = wn.v.f59242a;
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a c10;
            while (true) {
                try {
                    synchronized (a.class) {
                        c10 = a.f51638i.c();
                        if (c10 == a.f51641l) {
                            a.f51641l = null;
                            return;
                        }
                        wn.v vVar = wn.v.f59242a;
                    }
                    if (c10 != null) {
                        c10.z();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements f0 {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ f0 f51646x;

        public c(f0 f0Var) {
            this.f51646x = f0Var;
        }

        @Override // rp.f0
        public void O0(rp.c cVar, long j10) {
            jo.p.h(cVar, "source");
            n0.b(cVar.X(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                c0 c0Var = cVar.f51656w;
                jo.p.e(c0Var);
                while (true) {
                    if (j11 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j11 += c0Var.f51667c - c0Var.f51666b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        c0Var = c0Var.f51670f;
                        jo.p.e(c0Var);
                    }
                }
                a aVar = a.this;
                f0 f0Var = this.f51646x;
                aVar.t();
                try {
                    f0Var.O0(cVar, j11);
                    wn.v vVar = wn.v.f59242a;
                    if (aVar.u()) {
                        throw aVar.n(null);
                    }
                    j10 -= j11;
                } catch (IOException e10) {
                    if (!aVar.u()) {
                        throw e10;
                    }
                    throw aVar.n(e10);
                } finally {
                    aVar.u();
                }
            }
        }

        @Override // rp.f0
        /* renamed from: a */
        public a m() {
            return a.this;
        }

        @Override // rp.f0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a aVar = a.this;
            f0 f0Var = this.f51646x;
            aVar.t();
            try {
                f0Var.close();
                wn.v vVar = wn.v.f59242a;
                if (aVar.u()) {
                    throw aVar.n(null);
                }
            } catch (IOException e10) {
                if (!aVar.u()) {
                    throw e10;
                }
                throw aVar.n(e10);
            } finally {
                aVar.u();
            }
        }

        @Override // rp.f0, java.io.Flushable
        public void flush() {
            a aVar = a.this;
            f0 f0Var = this.f51646x;
            aVar.t();
            try {
                f0Var.flush();
                wn.v vVar = wn.v.f59242a;
                if (aVar.u()) {
                    throw aVar.n(null);
                }
            } catch (IOException e10) {
                if (!aVar.u()) {
                    throw e10;
                }
                throw aVar.n(e10);
            } finally {
                aVar.u();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f51646x + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements h0 {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ h0 f51648x;

        public d(h0 h0Var) {
            this.f51648x = h0Var;
        }

        @Override // rp.h0
        /* renamed from: a */
        public a m() {
            return a.this;
        }

        @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a aVar = a.this;
            h0 h0Var = this.f51648x;
            aVar.t();
            try {
                h0Var.close();
                wn.v vVar = wn.v.f59242a;
                if (aVar.u()) {
                    throw aVar.n(null);
                }
            } catch (IOException e10) {
                if (!aVar.u()) {
                    throw e10;
                }
                throw aVar.n(e10);
            } finally {
                aVar.u();
            }
        }

        @Override // rp.h0
        public long f1(rp.c cVar, long j10) {
            jo.p.h(cVar, "sink");
            a aVar = a.this;
            h0 h0Var = this.f51648x;
            aVar.t();
            try {
                long f12 = h0Var.f1(cVar, j10);
                if (aVar.u()) {
                    throw aVar.n(null);
                }
                return f12;
            } catch (IOException e10) {
                if (aVar.u()) {
                    throw aVar.n(e10);
                }
                throw e10;
            } finally {
                aVar.u();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f51648x + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f51639j = millis;
        f51640k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final IOException n(IOException iOException) {
        return v(iOException);
    }

    public final void t() {
        long h10 = h();
        boolean e10 = e();
        if (h10 != 0 || e10) {
            f51638i.e(this, h10, e10);
        }
    }

    public final boolean u() {
        return f51638i.d(this);
    }

    public IOException v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long w(long j10) {
        return this.f51644h - j10;
    }

    public final f0 x(f0 f0Var) {
        jo.p.h(f0Var, "sink");
        return new c(f0Var);
    }

    public final h0 y(h0 h0Var) {
        jo.p.h(h0Var, "source");
        return new d(h0Var);
    }

    public void z() {
    }
}
