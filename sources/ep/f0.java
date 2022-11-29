package ep;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f30856a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f30857b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f30858c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        jo.p.h(aVar, "address");
        jo.p.h(proxy, "proxy");
        jo.p.h(inetSocketAddress, "socketAddress");
        this.f30856a = aVar;
        this.f30857b = proxy;
        this.f30858c = inetSocketAddress;
    }

    public final a a() {
        return this.f30856a;
    }

    public final Proxy b() {
        return this.f30857b;
    }

    public final boolean c() {
        return this.f30856a.k() != null && this.f30857b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f30858c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (jo.p.c(f0Var.f30856a, this.f30856a) && jo.p.c(f0Var.f30857b, this.f30857b) && jo.p.c(f0Var.f30858c, this.f30858c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f30856a.hashCode()) * 31) + this.f30857b.hashCode()) * 31) + this.f30858c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f30858c + '}';
    }
}
