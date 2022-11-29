package np;

import ep.a0;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jo.p;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes4.dex */
public final class c extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f43738e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f43739f;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f43740d;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final c a() {
            if (b()) {
                return new c(null);
            }
            return null;
        }

        public final boolean b() {
            return c.f43738e;
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f43739f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f43738e = z10;
    }

    public c() {
        this.f43740d = new BouncyCastleJsseProvider();
    }

    @Override // np.h
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            List<String> b10 = h.f43761c.b(list);
            p.g(parameters, "sslParameters");
            Object[] array = b10.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.e(sSLSocket, str, list);
    }

    @Override // np.h
    public String g(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.g(sSLSocket);
    }

    @Override // np.h
    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f43740d);
        p.g(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // np.h
    public X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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

    public /* synthetic */ c(jo.h hVar) {
        this();
    }
}
