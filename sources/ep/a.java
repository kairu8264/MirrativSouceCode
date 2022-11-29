package ep;

import ep.v;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final v f30773a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a0> f30774b;

    /* renamed from: c  reason: collision with root package name */
    public final List<l> f30775c;

    /* renamed from: d  reason: collision with root package name */
    public final q f30776d;

    /* renamed from: e  reason: collision with root package name */
    public final SocketFactory f30777e;

    /* renamed from: f  reason: collision with root package name */
    public final SSLSocketFactory f30778f;

    /* renamed from: g  reason: collision with root package name */
    public final HostnameVerifier f30779g;

    /* renamed from: h  reason: collision with root package name */
    public final g f30780h;

    /* renamed from: i  reason: collision with root package name */
    public final b f30781i;

    /* renamed from: j  reason: collision with root package name */
    public final Proxy f30782j;

    /* renamed from: k  reason: collision with root package name */
    public final ProxySelector f30783k;

    public a(String str, int i10, q qVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b bVar, Proxy proxy, List<? extends a0> list, List<l> list2, ProxySelector proxySelector) {
        jo.p.h(str, "uriHost");
        jo.p.h(qVar, "dns");
        jo.p.h(socketFactory, "socketFactory");
        jo.p.h(bVar, "proxyAuthenticator");
        jo.p.h(list, "protocols");
        jo.p.h(list2, "connectionSpecs");
        jo.p.h(proxySelector, "proxySelector");
        this.f30776d = qVar;
        this.f30777e = socketFactory;
        this.f30778f = sSLSocketFactory;
        this.f30779g = hostnameVerifier;
        this.f30780h = gVar;
        this.f30781i = bVar;
        this.f30782j = proxy;
        this.f30783k = proxySelector;
        this.f30773a = new v.a().s(sSLSocketFactory != null ? "https" : "http").h(str).n(i10).c();
        this.f30774b = fp.b.O(list);
        this.f30775c = fp.b.O(list2);
    }

    public final g a() {
        return this.f30780h;
    }

    public final List<l> b() {
        return this.f30775c;
    }

    public final q c() {
        return this.f30776d;
    }

    public final boolean d(a aVar) {
        jo.p.h(aVar, "that");
        return jo.p.c(this.f30776d, aVar.f30776d) && jo.p.c(this.f30781i, aVar.f30781i) && jo.p.c(this.f30774b, aVar.f30774b) && jo.p.c(this.f30775c, aVar.f30775c) && jo.p.c(this.f30783k, aVar.f30783k) && jo.p.c(this.f30782j, aVar.f30782j) && jo.p.c(this.f30778f, aVar.f30778f) && jo.p.c(this.f30779g, aVar.f30779g) && jo.p.c(this.f30780h, aVar.f30780h) && this.f30773a.o() == aVar.f30773a.o();
    }

    public final HostnameVerifier e() {
        return this.f30779g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (jo.p.c(this.f30773a, aVar.f30773a) && d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<a0> f() {
        return this.f30774b;
    }

    public final Proxy g() {
        return this.f30782j;
    }

    public final b h() {
        return this.f30781i;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f30773a.hashCode()) * 31) + this.f30776d.hashCode()) * 31) + this.f30781i.hashCode()) * 31) + this.f30774b.hashCode()) * 31) + this.f30775c.hashCode()) * 31) + this.f30783k.hashCode()) * 31) + Objects.hashCode(this.f30782j)) * 31) + Objects.hashCode(this.f30778f)) * 31) + Objects.hashCode(this.f30779g)) * 31) + Objects.hashCode(this.f30780h);
    }

    public final ProxySelector i() {
        return this.f30783k;
    }

    public final SocketFactory j() {
        return this.f30777e;
    }

    public final SSLSocketFactory k() {
        return this.f30778f;
    }

    public final v l() {
        return this.f30773a;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f30773a.i());
        sb3.append(':');
        sb3.append(this.f30773a.o());
        sb3.append(", ");
        if (this.f30782j != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f30782j;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f30783k;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append("}");
        return sb3.toString();
    }
}
