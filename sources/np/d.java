package np;

import ep.a0;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jo.p;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;

/* loaded from: classes4.dex */
public final class d extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f43741e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f43742f;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f43743d;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        public final d b() {
            if (c()) {
                return new d(null);
            }
            return null;
        }

        public final boolean c() {
            return d.f43741e;
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final b f43744a = new b();
    }

    static {
        a aVar = new a(null);
        f43742f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f43741e = z10;
    }

    public d() {
        Provider newProvider = Conscrypt.newProvider();
        p.g(newProvider, "Conscrypt.newProvider()");
        this.f43743d = newProvider;
    }

    @Override // np.h
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = h.f43761c.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
            return;
        }
        super.e(sSLSocket, str, list);
    }

    @Override // np.h
    public String g(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.g(sSLSocket);
    }

    @Override // np.h
    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f43743d);
        p.g(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // np.h
    public SSLSocketFactory n(X509TrustManager x509TrustManager) {
        p.h(x509TrustManager, "trustManager");
        SSLContext m10 = m();
        m10.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = m10.getSocketFactory();
        p.g(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // np.h
    public X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        p.g(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        p.e(trustManagers);
        boolean z10 = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z10 = false;
        }
        if (z10) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, b.f43744a);
            return x509TrustManager;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        p.g(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public /* synthetic */ d(jo.h hVar) {
        this();
    }
}
