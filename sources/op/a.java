package op;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import ep.a0;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import jo.p;

@SuppressLint({"NewApi"})
/* loaded from: classes4.dex */
public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final C0686a f45490a = new C0686a(null);

    /* renamed from: op.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0686a {
        public C0686a() {
        }

        public final k a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return np.h.f43761c.h() && Build.VERSION.SDK_INT >= 29;
        }

        public /* synthetic */ C0686a(jo.h hVar) {
            this();
        }
    }

    @Override // op.k
    public boolean a(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // op.k
    public boolean b() {
        return f45490a.b();
    }

    @Override // op.k
    @SuppressLint({"NewApi"})
    public String c(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // op.k
    @SuppressLint({"NewApi"})
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            p.g(sSLParameters, "sslParameters");
            Object[] array = np.h.f43761c.b(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
