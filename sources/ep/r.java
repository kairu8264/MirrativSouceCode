package ep;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class r {

    /* renamed from: b  reason: collision with root package name */
    public static final b f30995b = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public static final r f30994a = new a();

    /* loaded from: classes4.dex */
    public static final class a extends r {
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        r a(e eVar);
    }

    public void A(e eVar, t tVar) {
        jo.p.h(eVar, "call");
    }

    public void B(e eVar) {
        jo.p.h(eVar, "call");
    }

    public void a(e eVar, d0 d0Var) {
        jo.p.h(eVar, "call");
        jo.p.h(d0Var, "cachedResponse");
    }

    public void b(e eVar, d0 d0Var) {
        jo.p.h(eVar, "call");
        jo.p.h(d0Var, "response");
    }

    public void c(e eVar) {
        jo.p.h(eVar, "call");
    }

    public void d(e eVar, IOException iOException) {
        jo.p.h(eVar, "call");
        jo.p.h(iOException, "ioe");
    }

    public void e(e eVar) {
        jo.p.h(eVar, "call");
    }

    public void f(e eVar) {
        jo.p.h(eVar, "call");
    }

    public void g(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, a0 a0Var) {
        jo.p.h(eVar, "call");
        jo.p.h(inetSocketAddress, "inetSocketAddress");
        jo.p.h(proxy, "proxy");
    }

    public void h(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, a0 a0Var, IOException iOException) {
        jo.p.h(eVar, "call");
        jo.p.h(inetSocketAddress, "inetSocketAddress");
        jo.p.h(proxy, "proxy");
        jo.p.h(iOException, "ioe");
    }

    public void i(e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        jo.p.h(eVar, "call");
        jo.p.h(inetSocketAddress, "inetSocketAddress");
        jo.p.h(proxy, "proxy");
    }

    public void j(e eVar, j jVar) {
        jo.p.h(eVar, "call");
        jo.p.h(jVar, "connection");
    }

    public void k(e eVar, j jVar) {
        jo.p.h(eVar, "call");
        jo.p.h(jVar, "connection");
    }

    public void l(e eVar, String str, List<InetAddress> list) {
        jo.p.h(eVar, "call");
        jo.p.h(str, "domainName");
        jo.p.h(list, "inetAddressList");
    }

    public void m(e eVar, String str) {
        jo.p.h(eVar, "call");
        jo.p.h(str, "domainName");
    }

    public void n(e eVar, v vVar, List<Proxy> list) {
        jo.p.h(eVar, "call");
        jo.p.h(vVar, "url");
        jo.p.h(list, "proxies");
    }

    public void o(e eVar, v vVar) {
        jo.p.h(eVar, "call");
        jo.p.h(vVar, "url");
    }

    public void p(e eVar, long j10) {
        jo.p.h(eVar, "call");
    }

    public void q(e eVar) {
        jo.p.h(eVar, "call");
    }

    public void r(e eVar, IOException iOException) {
        jo.p.h(eVar, "call");
        jo.p.h(iOException, "ioe");
    }

    public void s(e eVar, b0 b0Var) {
        jo.p.h(eVar, "call");
        jo.p.h(b0Var, "request");
    }

    public void t(e eVar) {
        jo.p.h(eVar, "call");
    }

    public void u(e eVar, long j10) {
        jo.p.h(eVar, "call");
    }

    public void v(e eVar) {
        jo.p.h(eVar, "call");
    }

    public void w(e eVar, IOException iOException) {
        jo.p.h(eVar, "call");
        jo.p.h(iOException, "ioe");
    }

    public void x(e eVar, d0 d0Var) {
        jo.p.h(eVar, "call");
        jo.p.h(d0Var, "response");
    }

    public void y(e eVar) {
        jo.p.h(eVar, "call");
    }

    public void z(e eVar, d0 d0Var) {
        jo.p.h(eVar, "call");
        jo.p.h(d0Var, "response");
    }
}
