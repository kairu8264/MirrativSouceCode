package gp;

import ep.b0;
import ep.d0;
import ep.f0;
import ep.h;
import ep.o;
import ep.q;
import ep.v;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import jo.p;
import so.n;
import xn.a0;

/* loaded from: classes4.dex */
public final class b implements ep.b {

    /* renamed from: d  reason: collision with root package name */
    public final q f33691d;

    public b(q qVar) {
        p.h(qVar, "defaultDns");
        this.f33691d = qVar;
    }

    @Override // ep.b
    public b0 a(f0 f0Var, d0 d0Var) throws IOException {
        Proxy proxy;
        q qVar;
        PasswordAuthentication requestPasswordAuthentication;
        ep.a a10;
        p.h(d0Var, "response");
        List<h> e10 = d0Var.e();
        b0 G = d0Var.G();
        v j10 = G.j();
        boolean z10 = d0Var.h() == 407;
        if (f0Var == null || (proxy = f0Var.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : e10) {
            if (n.q("Basic", hVar.c(), true)) {
                if (f0Var == null || (a10 = f0Var.a()) == null || (qVar = a10.c()) == null) {
                    qVar = this.f33691d;
                }
                if (z10) {
                    SocketAddress address = proxy.address();
                    Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    p.g(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, j10, qVar), inetSocketAddress.getPort(), j10.v(), hVar.b(), hVar.c(), j10.x(), Authenticator.RequestorType.PROXY);
                } else {
                    String i10 = j10.i();
                    p.g(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(i10, b(proxy, j10, qVar), j10.o(), j10.v(), hVar.b(), hVar.c(), j10.x(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    p.g(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    p.g(password, "auth.password");
                    return G.h().d(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }

    public final InetAddress b(Proxy proxy, v vVar, q qVar) throws IOException {
        Proxy.Type type = proxy.type();
        if (type == null || a.f33690a[type.ordinal()] != 1) {
            SocketAddress address = proxy.address();
            Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            p.g(address2, "(address() as InetSocketAddress).address");
            return address2;
        }
        return (InetAddress) a0.X(qVar.a(vVar.i()));
    }

    public /* synthetic */ b(q qVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? q.f30992a : qVar);
    }
}
