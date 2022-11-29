package hn;

import com.neovisionaries.ws.client.WebSocketException;
import hn.j0;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public class x0 extends w0 {
    public boolean A;
    public r0 B;
    public boolean C;
    public boolean D;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedList<r0> f36278y;

    /* renamed from: z  reason: collision with root package name */
    public final x f36279z;

    public x0(n0 n0Var) {
        super("WritingThread", n0Var, l0.WRITING_THREAD);
        this.f36278y = new LinkedList<>();
        this.f36279z = n0Var.s();
    }

    public static boolean j(r0 r0Var) {
        return r0Var.E() || r0Var.F();
    }

    @Override // hn.w0
    public void b() {
        try {
            k();
        } catch (Throwable th2) {
            o0 o0Var = o0.UNEXPECTED_ERROR_IN_WRITING_THREAD;
            WebSocketException webSocketException = new WebSocketException(o0Var, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            s q10 = this.f36276w.q();
            q10.j(webSocketException);
            q10.D(webSocketException);
        }
        synchronized (this) {
            this.D = true;
            notifyAll();
        }
        l();
    }

    public final void c(r0 r0Var) {
        Iterator<r0> it = this.f36278y.iterator();
        int i10 = 0;
        while (it.hasNext() && j(it.next())) {
            i10++;
        }
        this.f36278y.add(i10, r0Var);
    }

    public final void d() {
        v0 v0Var;
        boolean z10;
        j0 v10 = this.f36276w.v();
        synchronized (v10) {
            v0 c10 = v10.c();
            v0Var = v0.CLOSING;
            if (c10 == v0Var || c10 == v0.CLOSED) {
                z10 = false;
            } else {
                v10.a(j0.a.CLIENT);
                z10 = true;
            }
        }
        if (z10) {
            this.f36276w.q().v(v0Var);
        }
    }

    public final void e() throws WebSocketException {
        try {
            f();
            synchronized (this) {
                this.C = false;
            }
        } catch (IOException e10) {
            o0 o0Var = o0.FLUSH_ERROR;
            WebSocketException webSocketException = new WebSocketException(o0Var, "Flushing frames to the server failed: " + e10.getMessage(), e10);
            s q10 = this.f36276w.q();
            q10.j(webSocketException);
            q10.s(webSocketException, null);
            throw webSocketException;
        }
    }

    public final void f() throws IOException {
        this.f36276w.r().flush();
    }

    public final long g(long j10) throws WebSocketException {
        long currentTimeMillis = System.currentTimeMillis();
        if (1000 < currentTimeMillis - j10) {
            e();
            return currentTimeMillis;
        }
        return j10;
    }

    public final void h() {
        try {
            f();
        } catch (IOException unused) {
        }
    }

    public final boolean i(boolean z10) {
        return z10 || this.f36276w.w() || this.C || this.B != null;
    }

    public final void k() {
        this.f36276w.H();
        while (true) {
            int q10 = q();
            if (q10 != 1) {
                if (q10 == 3) {
                    h();
                } else if (q10 == 2) {
                    continue;
                } else {
                    try {
                        p(false);
                    } catch (WebSocketException unused) {
                    }
                }
            }
            try {
                p(true);
                return;
            } catch (WebSocketException unused2) {
                return;
            }
        }
    }

    public final void l() {
        this.f36276w.G(this.B);
    }

    public boolean m(r0 r0Var) {
        int n10;
        synchronized (this) {
            while (!this.D) {
                if (!this.A && this.B == null && !r0Var.D() && (n10 = this.f36276w.n()) != 0 && this.f36278y.size() >= n10) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (j(r0Var)) {
                    c(r0Var);
                } else {
                    this.f36278y.addLast(r0Var);
                }
                notifyAll();
                return true;
            }
            return false;
        }
    }

    public void n() {
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    public final void o(r0 r0Var) throws WebSocketException {
        boolean z10;
        r0 f10 = r0.f(r0Var, this.f36279z);
        this.f36276w.q().t(f10);
        if (this.B != null) {
            z10 = true;
        } else {
            if (f10.B()) {
                this.B = f10;
            }
            z10 = false;
        }
        if (z10) {
            this.f36276w.q().n(f10);
            return;
        }
        if (f10.B()) {
            d();
        }
        try {
            this.f36276w.r().a(f10);
            this.f36276w.q().m(f10);
        } catch (IOException e10) {
            o0 o0Var = o0.IO_ERROR_IN_WRITING;
            WebSocketException webSocketException = new WebSocketException(o0Var, "An I/O error occurred when a frame was tried to be sent: " + e10.getMessage(), e10);
            s q10 = this.f36276w.q();
            q10.j(webSocketException);
            q10.s(webSocketException, f10);
            throw webSocketException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        o(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r2.E() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r2.F() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (i(r5) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        e();
        r0 = java.lang.System.currentTimeMillis();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(boolean r5) throws com.neovisionaries.ws.client.WebSocketException {
        /*
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
        L4:
            monitor-enter(r4)
            java.util.LinkedList<hn.r0> r2 = r4.f36278y     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L42
            hn.r0 r2 = (hn.r0) r2     // Catch: java.lang.Throwable -> L42
            r4.notifyAll()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L1d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            boolean r5 = r4.i(r5)
            if (r5 == 0) goto L1c
            r4.e()
        L1c:
            return
        L1d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            r4.o(r2)
            boolean r3 = r2.E()
            if (r3 != 0) goto L3a
            boolean r2 = r2.F()
            if (r2 == 0) goto L2e
            goto L3a
        L2e:
            boolean r2 = r4.i(r5)
            if (r2 != 0) goto L35
            goto L4
        L35:
            long r0 = r4.g(r0)
            goto L4
        L3a:
            r4.e()
            long r0 = java.lang.System.currentTimeMillis()
            goto L4
        L42:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.x0.p(boolean):void");
    }

    public final int q() {
        synchronized (this) {
            if (this.A) {
                return 1;
            }
            if (this.B != null) {
                return 1;
            }
            if (this.f36278y.size() == 0) {
                if (this.C) {
                    this.C = false;
                    return 3;
                }
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.A) {
                return 1;
            }
            if (this.f36278y.size() == 0) {
                if (this.C) {
                    this.C = false;
                    return 3;
                }
                return 2;
            }
            return 0;
        }
    }
}
