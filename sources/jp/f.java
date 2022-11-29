package jp;

import com.dena.mirrorman.net.api.Referer;
import ep.a0;
import ep.b0;
import ep.d0;
import ep.f0;
import ep.r;
import ep.t;
import ep.v;
import ep.z;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import jo.p;
import jo.q;
import mp.e;
import mp.l;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import so.n;

/* loaded from: classes4.dex */
public final class f extends e.d implements ep.j {

    /* renamed from: t  reason: collision with root package name */
    public static final a f38189t = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public Socket f38190c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f38191d;

    /* renamed from: e  reason: collision with root package name */
    public t f38192e;

    /* renamed from: f  reason: collision with root package name */
    public a0 f38193f;

    /* renamed from: g  reason: collision with root package name */
    public mp.e f38194g;

    /* renamed from: h  reason: collision with root package name */
    public rp.e f38195h;

    /* renamed from: i  reason: collision with root package name */
    public rp.d f38196i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f38197j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f38198k;

    /* renamed from: l  reason: collision with root package name */
    public int f38199l;

    /* renamed from: m  reason: collision with root package name */
    public int f38200m;

    /* renamed from: n  reason: collision with root package name */
    public int f38201n;

    /* renamed from: o  reason: collision with root package name */
    public int f38202o;

    /* renamed from: p  reason: collision with root package name */
    public final List<Reference<e>> f38203p;

    /* renamed from: q  reason: collision with root package name */
    public long f38204q;

    /* renamed from: r  reason: collision with root package name */
    public final h f38205r;

    /* renamed from: s  reason: collision with root package name */
    public final f0 f38206s;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends q implements io.a<List<? extends Certificate>> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ep.g f38207w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t f38208x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ ep.a f38209y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ep.g gVar, t tVar, ep.a aVar) {
            super(0);
            this.f38207w = gVar;
            this.f38208x = tVar;
            this.f38209y = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final List<Certificate> invoke() {
            qp.c d10 = this.f38207w.d();
            p.e(d10);
            return d10.a(this.f38208x.d(), this.f38209y.l().i());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q implements io.a<List<? extends X509Certificate>> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final List<X509Certificate> invoke() {
            t tVar = f.this.f38192e;
            p.e(tVar);
            List<Certificate> d10 = tVar.d();
            ArrayList arrayList = new ArrayList(xn.t.u(d10, 10));
            for (Certificate certificate : d10) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public f(h hVar, f0 f0Var) {
        p.h(hVar, "connectionPool");
        p.h(f0Var, "route");
        this.f38205r = hVar;
        this.f38206s = f0Var;
        this.f38202o = 1;
        this.f38203p = new ArrayList();
        this.f38204q = Long.MAX_VALUE;
    }

    public final boolean A(List<f0> list) {
        boolean z10;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (f0 f0Var : list) {
                if (f0Var.b().type() == Proxy.Type.DIRECT && this.f38206s.b().type() == Proxy.Type.DIRECT && p.c(this.f38206s.d(), f0Var.d())) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void B(long j10) {
        this.f38204q = j10;
    }

    public final void C(boolean z10) {
        this.f38197j = z10;
    }

    public Socket D() {
        Socket socket = this.f38191d;
        p.e(socket);
        return socket;
    }

    public final void E(int i10) throws IOException {
        Socket socket = this.f38191d;
        p.e(socket);
        rp.e eVar = this.f38195h;
        p.e(eVar);
        rp.d dVar = this.f38196i;
        p.e(dVar);
        socket.setSoTimeout(0);
        mp.e a10 = new e.b(true, ip.e.f36975h).m(socket, this.f38206s.a().l().i(), eVar, dVar).k(this).l(i10).a();
        this.f38194g = a10;
        this.f38202o = mp.e.Z.a().d();
        mp.e.N0(a10, false, null, 3, null);
    }

    public final boolean F(v vVar) {
        t tVar;
        if (fp.b.f32120h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        v l10 = this.f38206s.a().l();
        if (vVar.o() != l10.o()) {
            return false;
        }
        if (p.c(vVar.i(), l10.i())) {
            return true;
        }
        if (this.f38198k || (tVar = this.f38192e) == null) {
            return false;
        }
        p.e(tVar);
        return e(vVar, tVar);
    }

    public final synchronized void G(e eVar, IOException iOException) {
        p.h(eVar, "call");
        if (iOException instanceof StreamResetException) {
            if (((StreamResetException) iOException).f45434w == mp.a.REFUSED_STREAM) {
                int i10 = this.f38201n + 1;
                this.f38201n = i10;
                if (i10 > 1) {
                    this.f38197j = true;
                    this.f38199l++;
                }
            } else if (((StreamResetException) iOException).f45434w != mp.a.CANCEL || !eVar.p()) {
                this.f38197j = true;
                this.f38199l++;
            }
        } else if (!v() || (iOException instanceof ConnectionShutdownException)) {
            this.f38197j = true;
            if (this.f38200m == 0) {
                if (iOException != null) {
                    g(eVar.m(), this.f38206s, iOException);
                }
                this.f38199l++;
            }
        }
    }

    @Override // mp.e.d
    public synchronized void a(mp.e eVar, l lVar) {
        p.h(eVar, "connection");
        p.h(lVar, Referer.SETTINGS);
        this.f38202o = lVar.d();
    }

    @Override // mp.e.d
    public void b(mp.h hVar) throws IOException {
        p.h(hVar, "stream");
        hVar.d(mp.a.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f38190c;
        if (socket != null) {
            fp.b.k(socket);
        }
    }

    public final boolean e(v vVar, t tVar) {
        List<Certificate> d10 = tVar.d();
        if (!d10.isEmpty()) {
            qp.d dVar = qp.d.f49662a;
            String i10 = vVar.i();
            Certificate certificate = d10.get(0);
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(i10, (X509Certificate) certificate)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[Catch: IOException -> 0x00fd, TRY_LEAVE, TryCatch #1 {IOException -> 0x00fd, blocks: (B:21:0x009a, B:23:0x00a2), top: B:68:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c A[EDGE_INSN: B:72:0x014c->B:61:0x014c ?: BREAK  ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r17, int r18, int r19, int r20, boolean r21, ep.e r22, ep.r r23) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jp.f.f(int, int, int, int, boolean, ep.e, ep.r):void");
    }

    public final void g(z zVar, f0 f0Var, IOException iOException) {
        p.h(zVar, "client");
        p.h(f0Var, "failedRoute");
        p.h(iOException, "failure");
        if (f0Var.b().type() != Proxy.Type.DIRECT) {
            ep.a a10 = f0Var.a();
            a10.i().connectFailed(a10.l().w(), f0Var.b().address(), iOException);
        }
        zVar.u().b(f0Var);
    }

    public final void h(int i10, int i11, ep.e eVar, r rVar) throws IOException {
        Socket socket;
        int i12;
        Proxy b10 = this.f38206s.b();
        ep.a a10 = this.f38206s.a();
        Proxy.Type type = b10.type();
        if (type == null || ((i12 = g.f38211a[type.ordinal()]) != 1 && i12 != 2)) {
            socket = new Socket(b10);
        } else {
            socket = a10.j().createSocket();
            p.e(socket);
        }
        this.f38190c = socket;
        rVar.i(eVar, this.f38206s.d(), b10);
        socket.setSoTimeout(i11);
        try {
            np.h.f43761c.g().f(socket, this.f38206s.d(), i10);
            try {
                this.f38195h = rp.t.c(rp.t.k(socket));
                this.f38196i = rp.t.b(rp.t.g(socket));
            } catch (NullPointerException e10) {
                if (p.c(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f38206s.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void i(jp.b bVar) throws IOException {
        ep.a a10 = this.f38206s.a();
        SSLSocketFactory k10 = a10.k();
        SSLSocket sSLSocket = null;
        try {
            p.e(k10);
            Socket createSocket = k10.createSocket(this.f38190c, a10.l().i(), a10.l().o(), true);
            if (createSocket != null) {
                SSLSocket sSLSocket2 = (SSLSocket) createSocket;
                try {
                    ep.l a11 = bVar.a(sSLSocket2);
                    if (a11.h()) {
                        np.h.f43761c.g().e(sSLSocket2, a10.l().i(), a10.f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    t.a aVar = t.f31003e;
                    p.g(session, "sslSocketSession");
                    t a12 = aVar.a(session);
                    HostnameVerifier e10 = a10.e();
                    p.e(e10);
                    if (!e10.verify(a10.l().i(), session)) {
                        List<Certificate> d10 = a12.d();
                        if (!d10.isEmpty()) {
                            Certificate certificate = d10.get(0);
                            if (certificate == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                            X509Certificate x509Certificate = (X509Certificate) certificate;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("\n              |Hostname ");
                            sb2.append(a10.l().i());
                            sb2.append(" not verified:\n              |    certificate: ");
                            sb2.append(ep.g.f30860d.a(x509Certificate));
                            sb2.append("\n              |    DN: ");
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            p.g(subjectDN, "cert.subjectDN");
                            sb2.append(subjectDN.getName());
                            sb2.append("\n              |    subjectAltNames: ");
                            sb2.append(qp.d.f49662a.a(x509Certificate));
                            sb2.append("\n              ");
                            throw new SSLPeerUnverifiedException(so.g.h(sb2.toString(), null, 1, null));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + a10.l().i() + " not verified (no certificates)");
                    }
                    ep.g a13 = a10.a();
                    p.e(a13);
                    this.f38192e = new t(a12.e(), a12.a(), a12.c(), new b(a13, a12, a10));
                    a13.b(a10.l().i(), new c());
                    String g10 = a11.h() ? np.h.f43761c.g().g(sSLSocket2) : null;
                    this.f38191d = sSLSocket2;
                    this.f38195h = rp.t.c(rp.t.k(sSLSocket2));
                    this.f38196i = rp.t.b(rp.t.g(sSLSocket2));
                    this.f38193f = g10 != null ? a0.Companion.a(g10) : a0.HTTP_1_1;
                    np.h.f43761c.g().b(sSLSocket2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        np.h.f43761c.g().b(sSLSocket);
                    }
                    if (sSLSocket != null) {
                        fp.b.k(sSLSocket);
                    }
                    throw th;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void j(int i10, int i11, int i12, ep.e eVar, r rVar) throws IOException {
        b0 l10 = l();
        v j10 = l10.j();
        for (int i13 = 0; i13 < 21; i13++) {
            h(i10, i11, eVar, rVar);
            l10 = k(i11, i12, l10, j10);
            if (l10 == null) {
                return;
            }
            Socket socket = this.f38190c;
            if (socket != null) {
                fp.b.k(socket);
            }
            this.f38190c = null;
            this.f38196i = null;
            this.f38195h = null;
            rVar.g(eVar, this.f38206s.d(), this.f38206s.b(), null);
        }
    }

    public final b0 k(int i10, int i11, b0 b0Var, v vVar) throws IOException {
        String str = "CONNECT " + fp.b.M(vVar, true) + " HTTP/1.1";
        while (true) {
            rp.e eVar = this.f38195h;
            p.e(eVar);
            rp.d dVar = this.f38196i;
            p.e(dVar);
            lp.b bVar = new lp.b(null, this, eVar, dVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            eVar.m().g(i10, timeUnit);
            dVar.m().g(i11, timeUnit);
            bVar.A(b0Var.e(), str);
            bVar.a();
            d0.a e10 = bVar.e(false);
            p.e(e10);
            d0 c10 = e10.r(b0Var).c();
            bVar.z(c10);
            int h10 = c10.h();
            if (h10 == 200) {
                if (eVar.l().a1() && dVar.l().a1()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else if (h10 == 407) {
                b0 a10 = this.f38206s.a().h().a(this.f38206s, c10);
                if (a10 != null) {
                    if (n.q("close", d0.o(c10, "Connection", null, 2, null), true)) {
                        return a10;
                    }
                    b0Var = a10;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + c10.h());
            }
        }
    }

    public final b0 l() throws IOException {
        b0 b10 = new b0.a().i(this.f38206s.a().l()).f("CONNECT", null).d("Host", fp.b.M(this.f38206s.a().l(), true)).d("Proxy-Connection", "Keep-Alive").d("User-Agent", "okhttp/4.9.3").b();
        b0 a10 = this.f38206s.a().h().a(this.f38206s, new d0.a().r(b10).p(a0.HTTP_1_1).g(407).m("Preemptive Authenticate").b(fp.b.f32115c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a10 != null ? a10 : b10;
    }

    public final void m(jp.b bVar, int i10, ep.e eVar, r rVar) throws IOException {
        if (this.f38206s.a().k() == null) {
            List<a0> f10 = this.f38206s.a().f();
            a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
            if (f10.contains(a0Var)) {
                this.f38191d = this.f38190c;
                this.f38193f = a0Var;
                E(i10);
                return;
            }
            this.f38191d = this.f38190c;
            this.f38193f = a0.HTTP_1_1;
            return;
        }
        rVar.B(eVar);
        i(bVar);
        rVar.A(eVar, this.f38192e);
        if (this.f38193f == a0.HTTP_2) {
            E(i10);
        }
    }

    public final List<Reference<e>> n() {
        return this.f38203p;
    }

    public final long o() {
        return this.f38204q;
    }

    public final boolean p() {
        return this.f38197j;
    }

    public final int q() {
        return this.f38199l;
    }

    public t r() {
        return this.f38192e;
    }

    public final synchronized void s() {
        this.f38200m++;
    }

    public final boolean t(ep.a aVar, List<f0> list) {
        p.h(aVar, "address");
        if (fp.b.f32120h && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            p.g(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        } else if (this.f38203p.size() >= this.f38202o || this.f38197j || !this.f38206s.a().d(aVar)) {
            return false;
        } else {
            if (p.c(aVar.l().i(), z().a().l().i())) {
                return true;
            }
            if (this.f38194g != null && list != null && A(list) && aVar.e() == qp.d.f49662a && F(aVar.l())) {
                try {
                    ep.g a10 = aVar.a();
                    p.e(a10);
                    String i10 = aVar.l().i();
                    t r10 = r();
                    p.e(r10);
                    a10.a(i10, r10.d());
                    return true;
                } catch (SSLPeerUnverifiedException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f38206s.a().l().i());
        sb2.append(':');
        sb2.append(this.f38206s.a().l().o());
        sb2.append(',');
        sb2.append(" proxy=");
        sb2.append(this.f38206s.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f38206s.d());
        sb2.append(" cipherSuite=");
        t tVar = this.f38192e;
        sb2.append((tVar == null || (r1 = tVar.a()) == null) ? "none" : "none");
        sb2.append(" protocol=");
        sb2.append(this.f38193f);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(boolean z10) {
        long j10;
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
        long nanoTime = System.nanoTime();
        Socket socket = this.f38190c;
        p.e(socket);
        Socket socket2 = this.f38191d;
        p.e(socket2);
        rp.e eVar = this.f38195h;
        p.e(eVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        mp.e eVar2 = this.f38194g;
        if (eVar2 != null) {
            return eVar2.k0(nanoTime);
        }
        synchronized (this) {
            j10 = nanoTime - this.f38204q;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        return fp.b.C(socket2, eVar);
    }

    public final boolean v() {
        return this.f38194g != null;
    }

    public final kp.d w(z zVar, kp.g gVar) throws SocketException {
        p.h(zVar, "client");
        p.h(gVar, "chain");
        Socket socket = this.f38191d;
        p.e(socket);
        rp.e eVar = this.f38195h;
        p.e(eVar);
        rp.d dVar = this.f38196i;
        p.e(dVar);
        mp.e eVar2 = this.f38194g;
        if (eVar2 != null) {
            return new mp.f(zVar, this, gVar, eVar2);
        }
        socket.setSoTimeout(gVar.k());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        eVar.m().g(gVar.g(), timeUnit);
        dVar.m().g(gVar.i(), timeUnit);
        return new lp.b(zVar, this, eVar, dVar);
    }

    public final synchronized void x() {
        this.f38198k = true;
    }

    public final synchronized void y() {
        this.f38197j = true;
    }

    public f0 z() {
        return this.f38206s;
    }
}
