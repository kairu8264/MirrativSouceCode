package np;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import ep.a0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import jo.p;
import op.i;
import op.j;
import op.k;
import op.l;
import xn.s;

/* loaded from: classes4.dex */
public final class b extends h {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f43732f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f43733g = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public final List<k> f43734d;

    /* renamed from: e  reason: collision with root package name */
    public final op.h f43735e;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f43732f;
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* renamed from: np.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0642b implements qp.e {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f43736a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f43737b;

        public C0642b(X509TrustManager x509TrustManager, Method method) {
            p.h(x509TrustManager, "trustManager");
            p.h(method, "findByIssuerAndSignatureMethod");
            this.f43736a = x509TrustManager;
            this.f43737b = method;
        }

        @Override // qp.e
        public X509Certificate a(X509Certificate x509Certificate) {
            p.h(x509Certificate, "cert");
            try {
                Object invoke = this.f43737b.invoke(this.f43736a, x509Certificate);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C0642b) {
                    C0642b c0642b = (C0642b) obj;
                    return p.c(this.f43736a, c0642b.f43736a) && p.c(this.f43737b, c0642b.f43737b);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f43736a;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f43737b;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f43736a + ", findByIssuerAndSignatureMethod=" + this.f43737b + ")";
        }
    }

    static {
        int i10;
        boolean z10 = true;
        if (h.f43761c.h() && (i10 = Build.VERSION.SDK_INT) < 30) {
            if (!(i10 >= 21)) {
                throw new IllegalStateException(("Expected Android API level 21+ but was " + i10).toString());
            }
        } else {
            z10 = false;
        }
        f43732f = z10;
    }

    public b() {
        List o10 = s.o(l.a.b(l.f45516j, null, 1, null), new j(op.f.f45499g.d()), new j(i.f45513b.a()), new j(op.g.f45507b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : o10) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f43734d = arrayList;
        this.f43735e = op.h.f45508d.a();
    }

    @Override // np.h
    public qp.c c(X509TrustManager x509TrustManager) {
        p.h(x509TrustManager, "trustManager");
        op.b a10 = op.b.f45491d.a(x509TrustManager);
        return a10 != null ? a10 : super.c(x509TrustManager);
    }

    @Override // np.h
    public qp.e d(X509TrustManager x509TrustManager) {
        p.h(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            p.g(declaredMethod, "method");
            declaredMethod.setAccessible(true);
            return new C0642b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // np.h
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        Object obj;
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        Iterator<T> it = this.f43734d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    @Override // np.h
    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        p.h(socket, "socket");
        p.h(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e10);
            }
            throw e10;
        }
    }

    @Override // np.h
    public String g(SSLSocket sSLSocket) {
        Object obj;
        p.h(sSLSocket, "sslSocket");
        Iterator<T> it = this.f43734d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            return kVar.c(sSLSocket);
        }
        return null;
    }

    @Override // np.h
    public Object h(String str) {
        p.h(str, "closer");
        return this.f43735e.a(str);
    }

    @Override // np.h
    public boolean i(String str) {
        p.h(str, "hostname");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i10 >= 23) {
            NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            p.g(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
            return networkSecurityPolicy.isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // np.h
    public void l(String str, Object obj) {
        p.h(str, "message");
        if (this.f43735e.b(obj)) {
            return;
        }
        h.k(this, str, 5, null, 4, null);
    }
}
