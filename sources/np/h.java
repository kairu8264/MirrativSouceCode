package np;

import ep.a0;
import ep.z;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jo.p;
import xn.t;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static volatile h f43759a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f43760b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f43761c;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final List<String> b(List<? extends a0> list) {
            p.h(list, "protocols");
            ArrayList<a0> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((a0) obj) != a0.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(t.u(arrayList, 10));
            for (a0 a0Var : arrayList) {
                arrayList2.add(a0Var.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends a0> list) {
            p.h(list, "protocols");
            rp.c cVar = new rp.c();
            for (String str : b(list)) {
                cVar.b1(str.length());
                cVar.a0(str);
            }
            return cVar.Z0();
        }

        public final h d() {
            op.c.f45496c.b();
            h a10 = np.a.f43730f.a();
            if (a10 != null) {
                return a10;
            }
            h a11 = b.f43733g.a();
            p.e(a11);
            return a11;
        }

        public final h e() {
            g a10;
            c a11;
            d b10;
            if (!j() || (b10 = d.f43742f.b()) == null) {
                if (!i() || (a11 = c.f43739f.a()) == null) {
                    if (!k() || (a10 = g.f43757f.a()) == null) {
                        f a12 = f.f43755e.a();
                        if (a12 != null) {
                            return a12;
                        }
                        h a13 = e.f43745i.a();
                        return a13 != null ? a13 : new h();
                    }
                    return a10;
                }
                return a11;
            }
            return b10;
        }

        public final h f() {
            if (h()) {
                return d();
            }
            return e();
        }

        public final h g() {
            return h.f43759a;
        }

        public final boolean h() {
            return p.c("Dalvik", System.getProperty("java.vm.name"));
        }

        public final boolean i() {
            Provider provider = Security.getProviders()[0];
            p.g(provider, "Security.getProviders()[0]");
            return p.c("BC", provider.getName());
        }

        public final boolean j() {
            Provider provider = Security.getProviders()[0];
            p.g(provider, "Security.getProviders()[0]");
            return p.c("Conscrypt", provider.getName());
        }

        public final boolean k() {
            Provider provider = Security.getProviders()[0];
            p.g(provider, "Security.getProviders()[0]");
            return p.c("OpenJSSE", provider.getName());
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f43761c = aVar;
        f43759a = aVar.f();
        f43760b = Logger.getLogger(z.class.getName());
    }

    public static /* synthetic */ void k(h hVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 4;
            }
            if ((i11 & 4) != 0) {
                th2 = null;
            }
            hVar.j(str, i10, th2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
    }

    public qp.c c(X509TrustManager x509TrustManager) {
        p.h(x509TrustManager, "trustManager");
        return new qp.a(d(x509TrustManager));
    }

    public qp.e d(X509TrustManager x509TrustManager) {
        p.h(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        p.g(acceptedIssuers, "trustManager.acceptedIssuers");
        return new qp.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        p.h(socket, "socket");
        p.h(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i10);
    }

    public String g(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        return null;
    }

    public Object h(String str) {
        p.h(str, "closer");
        if (f43760b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean i(String str) {
        p.h(str, "hostname");
        return true;
    }

    public void j(String str, int i10, Throwable th2) {
        p.h(str, "message");
        f43760b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public void l(String str, Object obj) {
        p.h(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        j(str, 5, (Throwable) obj);
    }

    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        p.g(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory n(X509TrustManager x509TrustManager) {
        p.h(x509TrustManager, "trustManager");
        try {
            SSLContext m10 = m();
            m10.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = m10.getSocketFactory();
            p.g(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        p.g(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        p.e(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        p.g(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        p.g(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
