package op;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import jo.p;

/* loaded from: classes4.dex */
public final class b extends qp.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f45491d = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public final X509TrustManager f45492b;

    /* renamed from: c  reason: collision with root package name */
    public final X509TrustManagerExtensions f45493c;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final b a(X509TrustManager x509TrustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            p.h(x509TrustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new b(x509TrustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        p.h(x509TrustManager, "trustManager");
        p.h(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f45492b = x509TrustManager;
        this.f45493c = x509TrustManagerExtensions;
    }

    @Override // qp.c
    public List<Certificate> a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException {
        p.h(list, "chain");
        p.h(str, "hostname");
        Object[] array = list.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> checkServerTrusted = this.f45493c.checkServerTrusted((X509Certificate[]) array, "RSA", str);
            p.g(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f45492b == this.f45492b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f45492b);
    }
}
