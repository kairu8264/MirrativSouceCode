package jp;

import ep.f0;
import ep.r;
import ep.v;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import jo.p;
import jo.q;
import xn.s;
import xn.x;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f38220i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Proxy> f38221a;

    /* renamed from: b  reason: collision with root package name */
    public int f38222b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends InetSocketAddress> f38223c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f0> f38224d;

    /* renamed from: e  reason: collision with root package name */
    public final ep.a f38225e;

    /* renamed from: f  reason: collision with root package name */
    public final i f38226f;

    /* renamed from: g  reason: collision with root package name */
    public final ep.e f38227g;

    /* renamed from: h  reason: collision with root package name */
    public final r f38228h;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            p.h(inetSocketAddress, "$this$socketHost");
            InetAddress address = inetSocketAddress.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                p.g(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = inetSocketAddress.getHostName();
            p.g(hostName, "hostName");
            return hostName;
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f38229a;

        /* renamed from: b  reason: collision with root package name */
        public final List<f0> f38230b;

        public b(List<f0> list) {
            p.h(list, "routes");
            this.f38230b = list;
        }

        public final List<f0> a() {
            return this.f38230b;
        }

        public final boolean b() {
            return this.f38229a < this.f38230b.size();
        }

        public final f0 c() {
            if (b()) {
                List<f0> list = this.f38230b;
                int i10 = this.f38229a;
                this.f38229a = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q implements io.a<List<? extends Proxy>> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Proxy f38232x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ v f38233y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Proxy proxy, v vVar) {
            super(0);
            this.f38232x = proxy;
            this.f38233y = vVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final List<Proxy> invoke() {
            Proxy proxy = this.f38232x;
            if (proxy != null) {
                return xn.r.d(proxy);
            }
            URI w10 = this.f38233y.w();
            if (w10.getHost() == null) {
                return fp.b.t(Proxy.NO_PROXY);
            }
            List<Proxy> select = j.this.f38225e.i().select(w10);
            return select == null || select.isEmpty() ? fp.b.t(Proxy.NO_PROXY) : fp.b.O(select);
        }
    }

    public j(ep.a aVar, i iVar, ep.e eVar, r rVar) {
        p.h(aVar, "address");
        p.h(iVar, "routeDatabase");
        p.h(eVar, "call");
        p.h(rVar, "eventListener");
        this.f38225e = aVar;
        this.f38226f = iVar;
        this.f38227g = eVar;
        this.f38228h = rVar;
        this.f38221a = s.k();
        this.f38223c = s.k();
        this.f38224d = new ArrayList();
        g(aVar.l(), aVar.g());
    }

    public final boolean b() {
        return c() || (this.f38224d.isEmpty() ^ true);
    }

    public final boolean c() {
        return this.f38222b < this.f38221a.size();
    }

    public final b d() throws IOException {
        if (b()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy e10 = e();
                for (InetSocketAddress inetSocketAddress : this.f38223c) {
                    f0 f0Var = new f0(this.f38225e, e10, inetSocketAddress);
                    if (this.f38226f.c(f0Var)) {
                        this.f38224d.add(f0Var);
                    } else {
                        arrayList.add(f0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                x.y(arrayList, this.f38224d);
                this.f38224d.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }

    public final Proxy e() throws IOException {
        if (c()) {
            List<? extends Proxy> list = this.f38221a;
            int i10 = this.f38222b;
            this.f38222b = i10 + 1;
            Proxy proxy = list.get(i10);
            f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f38225e.l().i() + "; exhausted proxy configurations: " + this.f38221a);
    }

    public final void f(Proxy proxy) throws IOException {
        String i10;
        int o10;
        ArrayList arrayList = new ArrayList();
        this.f38223c = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                i10 = f38220i.a(inetSocketAddress);
                o10 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        } else {
            i10 = this.f38225e.l().i();
            o10 = this.f38225e.l().o();
        }
        if (1 <= o10 && 65535 >= o10) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(i10, o10));
                return;
            }
            this.f38228h.m(this.f38227g, i10);
            List<InetAddress> a10 = this.f38225e.c().a(i10);
            if (!a10.isEmpty()) {
                this.f38228h.l(this.f38227g, i10, a10);
                for (InetAddress inetAddress : a10) {
                    arrayList.add(new InetSocketAddress(inetAddress, o10));
                }
                return;
            }
            throw new UnknownHostException(this.f38225e.c() + " returned no addresses for " + i10);
        }
        throw new SocketException("No route to " + i10 + ':' + o10 + "; port is out of range");
    }

    public final void g(v vVar, Proxy proxy) {
        c cVar = new c(proxy, vVar);
        this.f38228h.o(this.f38227g, vVar);
        List<Proxy> invoke = cVar.invoke();
        this.f38221a = invoke;
        this.f38222b = 0;
        this.f38228h.n(this.f38227g, vVar, invoke);
    }
}
