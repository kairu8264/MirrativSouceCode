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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;

/* loaded from: classes4.dex */
public final class g extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f43756e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f43757f;

    /* renamed from: d  reason: collision with root package name */
    public final Provider f43758d;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final g a() {
            if (b()) {
                return new g(null);
            }
            return null;
        }

        public final boolean b() {
            return g.f43756e;
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    static {
        a aVar = new a(null);
        f43757f = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f43756e = z10;
    }

    public g() {
        this.f43758d = new OpenJSSE();
    }

    @Override // np.h
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            org.openjsse.javax.net.ssl.SSLSocket sSLSocket2 = (org.openjsse.javax.net.ssl.SSLSocket) sSLSocket;
            SSLParameters sSLParameters = sSLSocket2.getSSLParameters();
            if (sSLParameters instanceof SSLParameters) {
                Object[] array = h.f43761c.b(list).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket2.setSSLParameters(sSLParameters);
                return;
            }
            return;
        }
        super.e(sSLSocket, str, list);
    }

    @Override // np.h
    public String g(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        if (sSLSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sSLSocket).getApplicationProtocol();
            if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
                return null;
            }
            return applicationProtocol;
        }
        return super.g(sSLSocket);
    }

    @Override // np.h
    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f43758d);
        p.g(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // np.h
    public X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f43758d);
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

    public /* synthetic */ g(jo.h hVar) {
        this();
    }
}
