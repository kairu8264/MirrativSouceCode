package jp;

import ep.b0;
import ep.d0;
import ep.r;
import ep.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import jo.p;
import wn.v;

/* loaded from: classes4.dex */
public final class e implements ep.e {
    public Object A;
    public d B;
    public f C;
    public boolean D;
    public jp.c E;
    public boolean F;
    public boolean G;
    public boolean H;
    public volatile boolean I;
    public volatile jp.c J;
    public volatile f K;
    public final z L;
    public final b0 M;
    public final boolean N;

    /* renamed from: w  reason: collision with root package name */
    public final h f38180w;

    /* renamed from: x  reason: collision with root package name */
    public final r f38181x;

    /* renamed from: y  reason: collision with root package name */
    public final c f38182y;

    /* renamed from: z  reason: collision with root package name */
    public final AtomicBoolean f38183z;

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public volatile AtomicInteger f38184w;

        /* renamed from: x  reason: collision with root package name */
        public final ep.f f38185x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e f38186y;

        public a(e eVar, ep.f fVar) {
            p.h(fVar, "responseCallback");
            this.f38186y = eVar;
            this.f38185x = fVar;
            this.f38184w = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            p.h(executorService, "executorService");
            ep.p o10 = this.f38186y.m().o();
            if (fp.b.f32120h && Thread.holdsLock(o10)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                p.g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(o10);
                throw new AssertionError(sb2.toString());
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f38186y.w(interruptedIOException);
                    this.f38185x.c(this.f38186y, interruptedIOException);
                    this.f38186y.m().o().f(this);
                }
            } catch (Throwable th2) {
                this.f38186y.m().o().f(this);
                throw th2;
            }
        }

        public final e b() {
            return this.f38186y;
        }

        public final AtomicInteger c() {
            return this.f38184w;
        }

        public final String d() {
            return this.f38186y.s().j().i();
        }

        public final void e(a aVar) {
            p.h(aVar, "other");
            this.f38184w = aVar.f38184w;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Throwable th2;
            IOException e10;
            ep.p o10;
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName("OkHttp " + this.f38186y.x());
            try {
                this.f38186y.f38182y.t();
                try {
                    z10 = true;
                    try {
                        this.f38185x.e(this.f38186y, this.f38186y.t());
                        o10 = this.f38186y.m().o();
                    } catch (IOException e11) {
                        e10 = e11;
                        if (z10) {
                            np.h.f43761c.g().j("Callback failure for " + this.f38186y.D(), 4, e10);
                        } else {
                            this.f38185x.c(this.f38186y, e10);
                        }
                        o10 = this.f38186y.m().o();
                        o10.f(this);
                    } catch (Throwable th3) {
                        th2 = th3;
                        this.f38186y.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th2);
                            wn.a.a(iOException, th2);
                            this.f38185x.c(this.f38186y, iOException);
                        }
                        throw th2;
                    }
                } catch (IOException e12) {
                    z10 = false;
                    e10 = e12;
                } catch (Throwable th4) {
                    z10 = false;
                    th2 = th4;
                }
                o10.f(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends WeakReference<e> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f38187a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            p.h(eVar, "referent");
            this.f38187a = obj;
        }

        public final Object a() {
            return this.f38187a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends rp.a {
        public c() {
        }

        @Override // rp.a
        public void z() {
            e.this.cancel();
        }
    }

    public e(z zVar, b0 b0Var, boolean z10) {
        p.h(zVar, "client");
        p.h(b0Var, "originalRequest");
        this.L = zVar;
        this.M = b0Var;
        this.N = z10;
        this.f38180w = zVar.l().a();
        this.f38181x = zVar.r().a(this);
        c cVar = new c();
        cVar.g(zVar.h(), TimeUnit.MILLISECONDS);
        v vVar = v.f59242a;
        this.f38182y = cVar;
        this.f38183z = new AtomicBoolean();
        this.H = true;
    }

    public final void A(f fVar) {
        this.K = fVar;
    }

    public final void B() {
        if (!this.D) {
            this.D = true;
            this.f38182y.u();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final <E extends IOException> E C(E e10) {
        if (!this.D && this.f38182y.u()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            if (e10 != null) {
                interruptedIOException.initCause(e10);
            }
            return interruptedIOException;
        }
        return e10;
    }

    public final String D() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p() ? "canceled " : "");
        sb2.append(this.N ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(x());
        return sb2.toString();
    }

    @Override // ep.e
    public void U(ep.f fVar) {
        p.h(fVar, "responseCallback");
        if (this.f38183z.compareAndSet(false, true)) {
            g();
            this.L.o().a(new a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @Override // ep.e
    public void cancel() {
        if (this.I) {
            return;
        }
        this.I = true;
        jp.c cVar = this.J;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.K;
        if (fVar != null) {
            fVar.d();
        }
        this.f38181x.f(this);
    }

    @Override // ep.e
    public d0 d() {
        if (this.f38183z.compareAndSet(false, true)) {
            this.f38182y.t();
            g();
            try {
                this.L.o().b(this);
                return t();
            } finally {
                this.L.o().g(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void e(f fVar) {
        p.h(fVar, "connection");
        if (fp.b.f32120h && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        }
        if (this.C == null) {
            this.C = fVar;
            fVar.n().add(new b(this, this.A));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final <E extends IOException> E f(E e10) {
        Socket y10;
        boolean z10 = fp.b.f32120h;
        if (z10 && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        f fVar = this.C;
        if (fVar != null) {
            if (z10 && Thread.holdsLock(fVar)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Thread ");
                Thread currentThread2 = Thread.currentThread();
                p.g(currentThread2, "Thread.currentThread()");
                sb3.append(currentThread2.getName());
                sb3.append(" MUST NOT hold lock on ");
                sb3.append(fVar);
                throw new AssertionError(sb3.toString());
            }
            synchronized (fVar) {
                y10 = y();
            }
            if (this.C == null) {
                if (y10 != null) {
                    fp.b.k(y10);
                }
                this.f38181x.k(this, fVar);
            } else {
                if (!(y10 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        E e11 = (E) C(e10);
        if (e10 != null) {
            r rVar = this.f38181x;
            p.e(e11);
            rVar.d(this, e11);
        } else {
            this.f38181x.c(this);
        }
        return e11;
    }

    public final void g() {
        this.A = np.h.f43761c.g().h("response.body().close()");
        this.f38181x.e(this);
    }

    /* renamed from: h */
    public e clone() {
        return new e(this.L, this.M, this.N);
    }

    public final ep.a i(ep.v vVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        ep.g gVar;
        if (vVar.j()) {
            SSLSocketFactory G = this.L.G();
            hostnameVerifier = this.L.v();
            sSLSocketFactory = G;
            gVar = this.L.i();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new ep.a(vVar.i(), vVar.o(), this.L.q(), this.L.F(), sSLSocketFactory, hostnameVerifier, gVar, this.L.B(), this.L.A(), this.L.z(), this.L.m(), this.L.C());
    }

    @Override // ep.e
    public b0 j() {
        return this.M;
    }

    public final void k(b0 b0Var, boolean z10) {
        p.h(b0Var, "request");
        if (this.E == null) {
            synchronized (this) {
                if (!this.G) {
                    if (!this.F) {
                        v vVar = v.f59242a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
            }
            if (z10) {
                this.B = new d(this.f38180w, i(b0Var.j()), this, this.f38181x);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void l(boolean z10) {
        jp.c cVar;
        synchronized (this) {
            if (this.H) {
                v vVar = v.f59242a;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z10 && (cVar = this.J) != null) {
            cVar.d();
        }
        this.E = null;
    }

    public final z m() {
        return this.L;
    }

    public final f n() {
        return this.C;
    }

    public final r o() {
        return this.f38181x;
    }

    @Override // ep.e
    public boolean p() {
        return this.I;
    }

    public final boolean q() {
        return this.N;
    }

    public final jp.c r() {
        return this.E;
    }

    public final b0 s() {
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ep.d0 t() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ep.z r0 = r11.L
            java.util.List r0 = r0.w()
            xn.x.y(r2, r0)
            kp.j r0 = new kp.j
            ep.z r1 = r11.L
            r0.<init>(r1)
            r2.add(r0)
            kp.a r0 = new kp.a
            ep.z r1 = r11.L
            ep.n r1 = r1.n()
            r0.<init>(r1)
            r2.add(r0)
            hp.a r0 = new hp.a
            ep.z r1 = r11.L
            ep.c r1 = r1.g()
            r0.<init>(r1)
            r2.add(r0)
            jp.a r0 = jp.a.f38153a
            r2.add(r0)
            boolean r0 = r11.N
            if (r0 != 0) goto L46
            ep.z r0 = r11.L
            java.util.List r0 = r0.x()
            xn.x.y(r2, r0)
        L46:
            kp.b r0 = new kp.b
            boolean r1 = r11.N
            r0.<init>(r1)
            r2.add(r0)
            kp.g r9 = new kp.g
            r3 = 0
            r4 = 0
            ep.b0 r5 = r11.M
            ep.z r0 = r11.L
            int r6 = r0.k()
            ep.z r0 = r11.L
            int r7 = r0.D()
            ep.z r0 = r11.L
            int r8 = r0.I()
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            ep.b0 r2 = r11.M     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            ep.d0 r2 = r9.a(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            boolean r3 = r11.p()     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            if (r3 != 0) goto L7f
            r11.w(r1)
            return r2
        L7f:
            fp.b.j(r2)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
            throw r2     // Catch: java.lang.Throwable -> L8a java.io.IOException -> L8c
        L8a:
            r2 = move-exception
            goto La1
        L8c:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.w(r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto L9c
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        La1:
            if (r0 != 0) goto La6
            r11.w(r1)
        La6:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.e.t():ep.d0");
    }

    public final jp.c u(kp.g gVar) {
        p.h(gVar, "chain");
        synchronized (this) {
            if (this.H) {
                if (!this.G) {
                    if (!this.F) {
                        v vVar = v.f59242a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        d dVar = this.B;
        p.e(dVar);
        jp.c cVar = new jp.c(this, this.f38181x, dVar, dVar.a(this.L, gVar));
        this.E = cVar;
        this.J = cVar;
        synchronized (this) {
            this.F = true;
            this.G = true;
        }
        if (this.I) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043, B:14:0x001d), top: B:47:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:35:0x0043, B:14:0x001d), top: B:47:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E v(jp.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            jo.p.h(r3, r0)
            jp.c r0 = r2.J
            boolean r3 = jo.p.c(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L10
            return r6
        L10:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L1b
            boolean r1 = r2.F     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L21
            goto L1b
        L19:
            r3 = move-exception
            goto L5a
        L1b:
            if (r5 == 0) goto L42
            boolean r1 = r2.G     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L42
        L21:
            if (r4 == 0) goto L25
            r2.F = r3     // Catch: java.lang.Throwable -> L19
        L25:
            if (r5 == 0) goto L29
            r2.G = r3     // Catch: java.lang.Throwable -> L19
        L29:
            boolean r4 = r2.F     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L33
            boolean r5 = r2.G     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L33
            r5 = r0
            goto L34
        L33:
            r5 = r3
        L34:
            if (r4 != 0) goto L3f
            boolean r4 = r2.G     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            boolean r4 = r2.H     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            r0 = r3
        L40:
            r3 = r5
            goto L43
        L42:
            r0 = r3
        L43:
            wn.v r4 = wn.v.f59242a     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r3 == 0) goto L52
            r3 = 0
            r2.J = r3
            jp.f r3 = r2.C
            if (r3 == 0) goto L52
            r3.s()
        L52:
            if (r0 == 0) goto L59
            java.io.IOException r3 = r2.f(r6)
            return r3
        L59:
            return r6
        L5a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.e.v(jp.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException w(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.H) {
                this.H = false;
                if (!this.F && !this.G) {
                    z10 = true;
                }
            }
            v vVar = v.f59242a;
        }
        return z10 ? f(iOException) : iOException;
    }

    public final String x() {
        return this.M.j().t();
    }

    public final Socket y() {
        f fVar = this.C;
        p.e(fVar);
        if (fp.b.f32120h && !Thread.holdsLock(fVar)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(fVar);
            throw new AssertionError(sb2.toString());
        }
        List<Reference<e>> n10 = fVar.n();
        Iterator<Reference<e>> it = n10.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (p.c(it.next().get(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            n10.remove(i10);
            this.C = null;
            if (n10.isEmpty()) {
                fVar.B(System.nanoTime());
                if (this.f38180w.c(fVar)) {
                    return fVar.D();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean z() {
        d dVar = this.B;
        p.e(dVar);
        return dVar.e();
    }
}
