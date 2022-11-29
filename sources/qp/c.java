package qp;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import jo.p;
import np.h;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f49661a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final c a(X509TrustManager x509TrustManager) {
            p.h(x509TrustManager, "trustManager");
            return h.f43761c.g().c(x509TrustManager);
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;
}
