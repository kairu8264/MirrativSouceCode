package ep;

import android.support.v4.media.session.PlaybackStateCompat;
import ep.e;
import ep.r;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import np.h;
import qp.c;

/* loaded from: classes4.dex */
public class z implements Cloneable, e.a {
    public final r.c A;
    public final boolean B;
    public final ep.b C;
    public final boolean D;
    public final boolean E;
    public final n F;
    public final c G;
    public final q H;
    public final Proxy I;
    public final ProxySelector J;
    public final ep.b K;
    public final SocketFactory L;
    public final SSLSocketFactory M;
    public final X509TrustManager N;
    public final List<l> O;
    public final List<a0> P;
    public final HostnameVerifier Q;
    public final g R;
    public final qp.c S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    public final long Y;
    public final jp.i Z;

    /* renamed from: w  reason: collision with root package name */
    public final p f31064w;

    /* renamed from: x  reason: collision with root package name */
    public final k f31065x;

    /* renamed from: y  reason: collision with root package name */
    public final List<w> f31066y;

    /* renamed from: z  reason: collision with root package name */
    public final List<w> f31067z;

    /* renamed from: c0  reason: collision with root package name */
    public static final b f31063c0 = new b(null);

    /* renamed from: a0  reason: collision with root package name */
    public static final List<a0> f31061a0 = fp.b.t(a0.HTTP_2, a0.HTTP_1_1);

    /* renamed from: b0  reason: collision with root package name */
    public static final List<l> f31062b0 = fp.b.t(l.f30947h, l.f30949j);

    /* loaded from: classes4.dex */
    public static final class a {
        public int A;
        public int B;
        public long C;
        public jp.i D;

        /* renamed from: a  reason: collision with root package name */
        public p f31068a = new p();

        /* renamed from: b  reason: collision with root package name */
        public k f31069b = new k();

        /* renamed from: c  reason: collision with root package name */
        public final List<w> f31070c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List<w> f31071d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public r.c f31072e = fp.b.e(r.f30994a);

        /* renamed from: f  reason: collision with root package name */
        public boolean f31073f = true;

        /* renamed from: g  reason: collision with root package name */
        public ep.b f31074g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f31075h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f31076i;

        /* renamed from: j  reason: collision with root package name */
        public n f31077j;

        /* renamed from: k  reason: collision with root package name */
        public c f31078k;

        /* renamed from: l  reason: collision with root package name */
        public q f31079l;

        /* renamed from: m  reason: collision with root package name */
        public Proxy f31080m;

        /* renamed from: n  reason: collision with root package name */
        public ProxySelector f31081n;

        /* renamed from: o  reason: collision with root package name */
        public ep.b f31082o;

        /* renamed from: p  reason: collision with root package name */
        public SocketFactory f31083p;

        /* renamed from: q  reason: collision with root package name */
        public SSLSocketFactory f31084q;

        /* renamed from: r  reason: collision with root package name */
        public X509TrustManager f31085r;

        /* renamed from: s  reason: collision with root package name */
        public List<l> f31086s;

        /* renamed from: t  reason: collision with root package name */
        public List<? extends a0> f31087t;

        /* renamed from: u  reason: collision with root package name */
        public HostnameVerifier f31088u;

        /* renamed from: v  reason: collision with root package name */
        public g f31089v;

        /* renamed from: w  reason: collision with root package name */
        public qp.c f31090w;

        /* renamed from: x  reason: collision with root package name */
        public int f31091x;

        /* renamed from: y  reason: collision with root package name */
        public int f31092y;

        /* renamed from: z  reason: collision with root package name */
        public int f31093z;

        public a() {
            ep.b bVar = ep.b.f30784a;
            this.f31074g = bVar;
            this.f31075h = true;
            this.f31076i = true;
            this.f31077j = n.f30982a;
            this.f31079l = q.f30992a;
            this.f31082o = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            jo.p.g(socketFactory, "SocketFactory.getDefault()");
            this.f31083p = socketFactory;
            b bVar2 = z.f31063c0;
            this.f31086s = bVar2.a();
            this.f31087t = bVar2.b();
            this.f31088u = qp.d.f49662a;
            this.f31089v = g.f30859c;
            this.f31092y = 10000;
            this.f31093z = 10000;
            this.A = 10000;
            this.C = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        public final Proxy A() {
            return this.f31080m;
        }

        public final ep.b B() {
            return this.f31082o;
        }

        public final ProxySelector C() {
            return this.f31081n;
        }

        public final int D() {
            return this.f31093z;
        }

        public final boolean E() {
            return this.f31073f;
        }

        public final jp.i F() {
            return this.D;
        }

        public final SocketFactory G() {
            return this.f31083p;
        }

        public final SSLSocketFactory H() {
            return this.f31084q;
        }

        public final int I() {
            return this.A;
        }

        public final X509TrustManager J() {
            return this.f31085r;
        }

        public final a K(long j10, TimeUnit timeUnit) {
            jo.p.h(timeUnit, "unit");
            this.f31093z = fp.b.h("timeout", j10, timeUnit);
            return this;
        }

        public final a a(w wVar) {
            jo.p.h(wVar, "interceptor");
            this.f31070c.add(wVar);
            return this;
        }

        public final a b(w wVar) {
            jo.p.h(wVar, "interceptor");
            this.f31071d.add(wVar);
            return this;
        }

        public final z c() {
            return new z(this);
        }

        public final a d(g gVar) {
            jo.p.h(gVar, "certificatePinner");
            if (!jo.p.c(gVar, this.f31089v)) {
                this.D = null;
            }
            this.f31089v = gVar;
            return this;
        }

        public final a e(long j10, TimeUnit timeUnit) {
            jo.p.h(timeUnit, "unit");
            this.f31092y = fp.b.h("timeout", j10, timeUnit);
            return this;
        }

        public final a f(n nVar) {
            jo.p.h(nVar, "cookieJar");
            this.f31077j = nVar;
            return this;
        }

        public final ep.b g() {
            return this.f31074g;
        }

        public final c h() {
            return this.f31078k;
        }

        public final int i() {
            return this.f31091x;
        }

        public final qp.c j() {
            return this.f31090w;
        }

        public final g k() {
            return this.f31089v;
        }

        public final int l() {
            return this.f31092y;
        }

        public final k m() {
            return this.f31069b;
        }

        public final List<l> n() {
            return this.f31086s;
        }

        public final n o() {
            return this.f31077j;
        }

        public final p p() {
            return this.f31068a;
        }

        public final q q() {
            return this.f31079l;
        }

        public final r.c r() {
            return this.f31072e;
        }

        public final boolean s() {
            return this.f31075h;
        }

        public final boolean t() {
            return this.f31076i;
        }

        public final HostnameVerifier u() {
            return this.f31088u;
        }

        public final List<w> v() {
            return this.f31070c;
        }

        public final long w() {
            return this.C;
        }

        public final List<w> x() {
            return this.f31071d;
        }

        public final int y() {
            return this.B;
        }

        public final List<a0> z() {
            return this.f31087t;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final List<l> a() {
            return z.f31062b0;
        }

        public final List<a0> b() {
            return z.f31061a0;
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public z(a aVar) {
        ProxySelector C;
        jo.p.h(aVar, "builder");
        this.f31064w = aVar.p();
        this.f31065x = aVar.m();
        this.f31066y = fp.b.O(aVar.v());
        this.f31067z = fp.b.O(aVar.x());
        this.A = aVar.r();
        this.B = aVar.E();
        this.C = aVar.g();
        this.D = aVar.s();
        this.E = aVar.t();
        this.F = aVar.o();
        aVar.h();
        this.H = aVar.q();
        this.I = aVar.A();
        if (aVar.A() != null) {
            C = pp.a.f48483a;
        } else {
            C = aVar.C();
            C = C == null ? ProxySelector.getDefault() : C;
            if (C == null) {
                C = pp.a.f48483a;
            }
        }
        this.J = C;
        this.K = aVar.B();
        this.L = aVar.G();
        List<l> n10 = aVar.n();
        this.O = n10;
        this.P = aVar.z();
        this.Q = aVar.u();
        this.T = aVar.i();
        this.U = aVar.l();
        this.V = aVar.D();
        this.W = aVar.I();
        this.X = aVar.y();
        this.Y = aVar.w();
        jp.i F = aVar.F();
        this.Z = F == null ? new jp.i() : F;
        boolean z10 = true;
        if (!(n10 instanceof Collection) || !n10.isEmpty()) {
            Iterator<T> it = n10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((l) it.next()).f()) {
                    z10 = false;
                    break;
                }
            }
        }
        if (z10) {
            this.M = null;
            this.S = null;
            this.N = null;
            this.R = g.f30859c;
        } else if (aVar.H() != null) {
            this.M = aVar.H();
            qp.c j10 = aVar.j();
            jo.p.e(j10);
            this.S = j10;
            X509TrustManager J = aVar.J();
            jo.p.e(J);
            this.N = J;
            g k10 = aVar.k();
            jo.p.e(j10);
            this.R = k10.e(j10);
        } else {
            h.a aVar2 = np.h.f43761c;
            X509TrustManager o10 = aVar2.g().o();
            this.N = o10;
            np.h g10 = aVar2.g();
            jo.p.e(o10);
            this.M = g10.n(o10);
            c.a aVar3 = qp.c.f49661a;
            jo.p.e(o10);
            qp.c a10 = aVar3.a(o10);
            this.S = a10;
            g k11 = aVar.k();
            jo.p.e(a10);
            this.R = k11.e(a10);
        }
        H();
    }

    public final Proxy A() {
        return this.I;
    }

    public final ep.b B() {
        return this.K;
    }

    public final ProxySelector C() {
        return this.J;
    }

    public final int D() {
        return this.V;
    }

    public final boolean E() {
        return this.B;
    }

    public final SocketFactory F() {
        return this.L;
    }

    public final SSLSocketFactory G() {
        SSLSocketFactory sSLSocketFactory = this.M;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final void H() {
        List<w> list;
        List<w> list2;
        boolean z10;
        Objects.requireNonNull(this.f31066y, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
            Objects.requireNonNull(this.f31067z, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list2.contains(null)) {
                List<l> list3 = this.O;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    for (l lVar : list3) {
                        if (lVar.f()) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    if (this.M == null) {
                        if (this.S == null) {
                            if (this.N == null) {
                                if (!jo.p.c(this.R, g.f30859c)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                } else if (this.M != null) {
                    if (this.S != null) {
                        if (this.N == null) {
                            throw new IllegalStateException("x509TrustManager == null".toString());
                        }
                        return;
                    }
                    throw new IllegalStateException("certificateChainCleaner == null".toString());
                } else {
                    throw new IllegalStateException("sslSocketFactory == null".toString());
                }
            }
            throw new IllegalStateException(("Null network interceptor: " + this.f31067z).toString());
        }
        throw new IllegalStateException(("Null interceptor: " + this.f31066y).toString());
    }

    public final int I() {
        return this.W;
    }

    @Override // ep.e.a
    public e b(b0 b0Var) {
        jo.p.h(b0Var, "request");
        return new jp.e(this, b0Var, false);
    }

    public Object clone() {
        return super.clone();
    }

    public final ep.b f() {
        return this.C;
    }

    public final c g() {
        return this.G;
    }

    public final int h() {
        return this.T;
    }

    public final g i() {
        return this.R;
    }

    public final int k() {
        return this.U;
    }

    public final k l() {
        return this.f31065x;
    }

    public final List<l> m() {
        return this.O;
    }

    public final n n() {
        return this.F;
    }

    public final p o() {
        return this.f31064w;
    }

    public final q q() {
        return this.H;
    }

    public final r.c r() {
        return this.A;
    }

    public final boolean s() {
        return this.D;
    }

    public final boolean t() {
        return this.E;
    }

    public final jp.i u() {
        return this.Z;
    }

    public final HostnameVerifier v() {
        return this.Q;
    }

    public final List<w> w() {
        return this.f31066y;
    }

    public final List<w> x() {
        return this.f31067z;
    }

    public final int y() {
        return this.X;
    }

    public final List<a0> z() {
        return this.P;
    }

    public z() {
        this(new a());
    }
}
