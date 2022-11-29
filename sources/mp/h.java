package mp;

import android.support.v4.media.session.PlaybackStateCompat;
import ep.u;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import jo.p;
import okhttp3.internal.http2.StreamResetException;
import rp.f0;
import rp.h0;
import rp.i0;
import wn.v;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: o  reason: collision with root package name */
    public static final a f41361o = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public long f41362a;

    /* renamed from: b  reason: collision with root package name */
    public long f41363b;

    /* renamed from: c  reason: collision with root package name */
    public long f41364c;

    /* renamed from: d  reason: collision with root package name */
    public long f41365d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<u> f41366e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f41367f;

    /* renamed from: g  reason: collision with root package name */
    public final c f41368g;

    /* renamed from: h  reason: collision with root package name */
    public final b f41369h;

    /* renamed from: i  reason: collision with root package name */
    public final d f41370i;

    /* renamed from: j  reason: collision with root package name */
    public final d f41371j;

    /* renamed from: k  reason: collision with root package name */
    public mp.a f41372k;

    /* renamed from: l  reason: collision with root package name */
    public IOException f41373l;

    /* renamed from: m  reason: collision with root package name */
    public final int f41374m;

    /* renamed from: n  reason: collision with root package name */
    public final e f41375n;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public final class b implements f0 {

        /* renamed from: w  reason: collision with root package name */
        public final rp.c f41376w = new rp.c();

        /* renamed from: x  reason: collision with root package name */
        public u f41377x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f41378y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f41379z;

        public b(boolean z10) {
            this.f41379z = z10;
        }

        @Override // rp.f0
        public void O0(rp.c cVar, long j10) throws IOException {
            p.h(cVar, "source");
            h hVar = h.this;
            if (fp.b.f32120h && Thread.holdsLock(hVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                p.g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(hVar);
                throw new AssertionError(sb2.toString());
            }
            this.f41376w.O0(cVar, j10);
            while (this.f41376w.X() >= PlaybackStateCompat.ACTION_PREPARE) {
                a(false);
            }
        }

        public final void a(boolean z10) throws IOException {
            long min;
            boolean z11;
            synchronized (h.this) {
                h.this.s().t();
                while (h.this.r() >= h.this.q() && !this.f41379z && !this.f41378y && h.this.h() == null) {
                    h.this.D();
                }
                h.this.s().A();
                h.this.c();
                min = Math.min(h.this.q() - h.this.r(), this.f41376w.X());
                h hVar = h.this;
                hVar.B(hVar.r() + min);
                z11 = z10 && min == this.f41376w.X();
                v vVar = v.f59242a;
            }
            h.this.s().t();
            try {
                h.this.g().V0(h.this.j(), z11, this.f41376w, min);
            } finally {
                h.this.s().A();
            }
        }

        public final boolean c() {
            return this.f41378y;
        }

        @Override // rp.f0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            h hVar = h.this;
            if (fp.b.f32120h && Thread.holdsLock(hVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                p.g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(hVar);
                throw new AssertionError(sb2.toString());
            }
            synchronized (h.this) {
                if (this.f41378y) {
                    return;
                }
                boolean z10 = h.this.h() == null;
                v vVar = v.f59242a;
                if (!h.this.o().f41379z) {
                    boolean z11 = this.f41376w.X() > 0;
                    if (this.f41377x != null) {
                        while (this.f41376w.X() > 0) {
                            a(false);
                        }
                        e g10 = h.this.g();
                        int j10 = h.this.j();
                        u uVar = this.f41377x;
                        p.e(uVar);
                        g10.W0(j10, z10, fp.b.K(uVar));
                    } else if (z11) {
                        while (this.f41376w.X() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        h.this.g().V0(h.this.j(), true, null, 0L);
                    }
                }
                synchronized (h.this) {
                    this.f41378y = true;
                    v vVar2 = v.f59242a;
                }
                h.this.g().flush();
                h.this.b();
            }
        }

        public final boolean d() {
            return this.f41379z;
        }

        @Override // rp.f0, java.io.Flushable
        public void flush() throws IOException {
            h hVar = h.this;
            if (fp.b.f32120h && Thread.holdsLock(hVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                p.g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(hVar);
                throw new AssertionError(sb2.toString());
            }
            synchronized (h.this) {
                h.this.c();
                v vVar = v.f59242a;
            }
            while (this.f41376w.X() > 0) {
                a(false);
                h.this.g().flush();
            }
        }

        @Override // rp.f0
        public i0 m() {
            return h.this.s();
        }
    }

    /* loaded from: classes4.dex */
    public final class c implements h0 {
        public final long A;
        public boolean B;

        /* renamed from: w  reason: collision with root package name */
        public final rp.c f41380w = new rp.c();

        /* renamed from: x  reason: collision with root package name */
        public final rp.c f41381x = new rp.c();

        /* renamed from: y  reason: collision with root package name */
        public u f41382y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f41383z;

        public c(long j10, boolean z10) {
            this.A = j10;
            this.B = z10;
        }

        public final boolean a() {
            return this.f41383z;
        }

        public final boolean c() {
            return this.B;
        }

        @Override // rp.h0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long X;
            synchronized (h.this) {
                this.f41383z = true;
                X = this.f41381x.X();
                this.f41381x.clear();
                h hVar = h.this;
                if (hVar != null) {
                    hVar.notifyAll();
                    v vVar = v.f59242a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (X > 0) {
                i(X);
            }
            h.this.b();
        }

        public final void d(rp.e eVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            p.h(eVar, "source");
            h hVar = h.this;
            if (fp.b.f32120h && Thread.holdsLock(hVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                p.g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(hVar);
                throw new AssertionError(sb2.toString());
            }
            while (j10 > 0) {
                synchronized (h.this) {
                    z10 = this.B;
                    z11 = true;
                    z12 = this.f41381x.X() + j10 > this.A;
                    v vVar = v.f59242a;
                }
                if (z12) {
                    eVar.k(j10);
                    h.this.f(mp.a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z10) {
                    eVar.k(j10);
                    return;
                } else {
                    long f12 = eVar.f1(this.f41380w, j10);
                    if (f12 != -1) {
                        j10 -= f12;
                        synchronized (h.this) {
                            if (this.f41383z) {
                                j11 = this.f41380w.X();
                                this.f41380w.clear();
                            } else {
                                if (this.f41381x.X() != 0) {
                                    z11 = false;
                                }
                                this.f41381x.H0(this.f41380w);
                                if (z11) {
                                    h hVar2 = h.this;
                                    if (hVar2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                    }
                                    hVar2.notifyAll();
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 > 0) {
                            i(j11);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public final void e(boolean z10) {
            this.B = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // rp.h0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long f1(rp.c r18, long r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mp.h.c.f1(rp.c, long):long");
        }

        public final void h(u uVar) {
            this.f41382y = uVar;
        }

        public final void i(long j10) {
            h hVar = h.this;
            if (fp.b.f32120h && Thread.holdsLock(hVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                p.g(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(hVar);
                throw new AssertionError(sb2.toString());
            }
            h.this.g().T0(j10);
        }

        @Override // rp.h0
        public i0 m() {
            return h.this.m();
        }
    }

    /* loaded from: classes4.dex */
    public final class d extends rp.a {
        public d() {
        }

        public final void A() throws IOException {
            if (u()) {
                throw v(null);
            }
        }

        @Override // rp.a
        public IOException v(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // rp.a
        public void z() {
            h.this.f(mp.a.CANCEL);
            h.this.g().D0();
        }
    }

    public h(int i10, e eVar, boolean z10, boolean z11, u uVar) {
        p.h(eVar, "connection");
        this.f41374m = i10;
        this.f41375n = eVar;
        this.f41365d = eVar.Y().c();
        ArrayDeque<u> arrayDeque = new ArrayDeque<>();
        this.f41366e = arrayDeque;
        this.f41368g = new c(eVar.X().c(), z11);
        this.f41369h = new b(z10);
        this.f41370i = new d();
        this.f41371j = new d();
        if (uVar != null) {
            if (!t()) {
                arrayDeque.add(uVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void A(long j10) {
        this.f41362a = j10;
    }

    public final void B(long j10) {
        this.f41364c = j10;
    }

    public final synchronized u C() throws IOException {
        u removeFirst;
        this.f41370i.t();
        while (this.f41366e.isEmpty() && this.f41372k == null) {
            D();
        }
        this.f41370i.A();
        if (!this.f41366e.isEmpty()) {
            removeFirst = this.f41366e.removeFirst();
            p.g(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.f41373l;
            if (iOException != null) {
                throw iOException;
            }
            mp.a aVar = this.f41372k;
            p.e(aVar);
            throw new StreamResetException(aVar);
        }
        return removeFirst;
    }

    public final void D() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final i0 E() {
        return this.f41371j;
    }

    public final void a(long j10) {
        this.f41365d += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void b() throws IOException {
        boolean z10;
        boolean u10;
        if (fp.b.f32120h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this) {
            z10 = !this.f41368g.c() && this.f41368g.a() && (this.f41369h.d() || this.f41369h.c());
            u10 = u();
            v vVar = v.f59242a;
        }
        if (z10) {
            d(mp.a.CANCEL, null);
        } else if (u10) {
        } else {
            this.f41375n.B0(this.f41374m);
        }
    }

    public final void c() throws IOException {
        if (!this.f41369h.c()) {
            if (!this.f41369h.d()) {
                if (this.f41372k != null) {
                    IOException iOException = this.f41373l;
                    if (iOException != null) {
                        throw iOException;
                    }
                    mp.a aVar = this.f41372k;
                    p.e(aVar);
                    throw new StreamResetException(aVar);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void d(mp.a aVar, IOException iOException) throws IOException {
        p.h(aVar, "rstStatusCode");
        if (e(aVar, iOException)) {
            this.f41375n.i1(this.f41374m, aVar);
        }
    }

    public final boolean e(mp.a aVar, IOException iOException) {
        if (fp.b.f32120h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this) {
            if (this.f41372k != null) {
                return false;
            }
            if (this.f41368g.c() && this.f41369h.d()) {
                return false;
            }
            this.f41372k = aVar;
            this.f41373l = iOException;
            notifyAll();
            v vVar = v.f59242a;
            this.f41375n.B0(this.f41374m);
            return true;
        }
    }

    public final void f(mp.a aVar) {
        p.h(aVar, "errorCode");
        if (e(aVar, null)) {
            this.f41375n.j1(this.f41374m, aVar);
        }
    }

    public final e g() {
        return this.f41375n;
    }

    public final synchronized mp.a h() {
        return this.f41372k;
    }

    public final IOException i() {
        return this.f41373l;
    }

    public final int j() {
        return this.f41374m;
    }

    public final long k() {
        return this.f41363b;
    }

    public final long l() {
        return this.f41362a;
    }

    public final d m() {
        return this.f41370i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rp.f0 n() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f41367f     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.t()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            wn.v r0 = wn.v.f59242a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            mp.h$b r0 = r2.f41369h
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.h.n():rp.f0");
    }

    public final b o() {
        return this.f41369h;
    }

    public final c p() {
        return this.f41368g;
    }

    public final long q() {
        return this.f41365d;
    }

    public final long r() {
        return this.f41364c;
    }

    public final d s() {
        return this.f41371j;
    }

    public final boolean t() {
        return this.f41375n.N() == ((this.f41374m & 1) == 1);
    }

    public final synchronized boolean u() {
        if (this.f41372k != null) {
            return false;
        }
        if ((this.f41368g.c() || this.f41368g.a()) && (this.f41369h.d() || this.f41369h.c())) {
            if (this.f41367f) {
                return false;
            }
        }
        return true;
    }

    public final i0 v() {
        return this.f41370i;
    }

    public final void w(rp.e eVar, int i10) throws IOException {
        p.h(eVar, "source");
        if (fp.b.f32120h && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        this.f41368g.d(eVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:10:0x003d, B:14:0x0045, B:17:0x0054, B:18:0x0059, B:15:0x004b), top: B:26:0x003d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(ep.u r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            jo.p.h(r3, r0)
            boolean r0 = fp.b.f32120h
            if (r0 == 0) goto L3c
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L3c
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            jo.p.g(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3c:
            monitor-enter(r2)
            boolean r0 = r2.f41367f     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            if (r0 == 0) goto L4b
            if (r4 != 0) goto L45
            goto L4b
        L45:
            mp.h$c r0 = r2.f41368g     // Catch: java.lang.Throwable -> L6d
            r0.h(r3)     // Catch: java.lang.Throwable -> L6d
            goto L52
        L4b:
            r2.f41367f = r1     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque<ep.u> r0 = r2.f41366e     // Catch: java.lang.Throwable -> L6d
            r0.add(r3)     // Catch: java.lang.Throwable -> L6d
        L52:
            if (r4 == 0) goto L59
            mp.h$c r3 = r2.f41368g     // Catch: java.lang.Throwable -> L6d
            r3.e(r1)     // Catch: java.lang.Throwable -> L6d
        L59:
            boolean r3 = r2.u()     // Catch: java.lang.Throwable -> L6d
            r2.notifyAll()     // Catch: java.lang.Throwable -> L6d
            wn.v r4 = wn.v.f59242a     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r2)
            if (r3 != 0) goto L6c
            mp.e r3 = r2.f41375n
            int r4 = r2.f41374m
            r3.B0(r4)
        L6c:
            return
        L6d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: mp.h.x(ep.u, boolean):void");
    }

    public final synchronized void y(mp.a aVar) {
        p.h(aVar, "errorCode");
        if (this.f41372k == null) {
            this.f41372k = aVar;
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.f41363b = j10;
    }
}
