package op;

import ep.a0;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import jo.p;
import op.j;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes4.dex */
public final class g implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final b f45507b = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public static final j.a f45506a = new a();

    /* loaded from: classes4.dex */
    public static final class a implements j.a {
        @Override // op.j.a
        public boolean a(SSLSocket sSLSocket) {
            p.h(sSLSocket, "sslSocket");
            return np.c.f43739f.b() && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // op.j.a
        public k b(SSLSocket sSLSocket) {
            p.h(sSLSocket, "sslSocket");
            return new g();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final j.a a() {
            return g.f45506a;
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    @Override // op.k
    public boolean a(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // op.k
    public boolean b() {
        return np.c.f43739f.b();
    }

    @Override // op.k
    public String c(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // op.k
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            p.g(parameters, "sslParameters");
            Object[] array = np.h.f43761c.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
