package hn;

import androidx.appcompat.widget.ListPopupWindow;
import com.neovisionaries.ws.client.HostnameUnverifiedException;
import com.neovisionaries.ws.client.WebSocketException;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Comparator;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final SocketFactory f36155a;

    /* renamed from: b  reason: collision with root package name */
    public final hn.a f36156b;

    /* renamed from: c  reason: collision with root package name */
    public final int f36157c;

    /* renamed from: d  reason: collision with root package name */
    public final int f36158d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f36159e;

    /* renamed from: f  reason: collision with root package name */
    public final c0 f36160f;

    /* renamed from: g  reason: collision with root package name */
    public final SSLSocketFactory f36161g;

    /* renamed from: h  reason: collision with root package name */
    public final String f36162h;

    /* renamed from: i  reason: collision with root package name */
    public final int f36163i;

    /* renamed from: j  reason: collision with root package name */
    public j f36164j;

    /* renamed from: k  reason: collision with root package name */
    public int f36165k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f36166l;

    /* renamed from: m  reason: collision with root package name */
    public Socket f36167m;

    /* loaded from: classes4.dex */
    public class a implements Comparator<InetAddress> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(InetAddress inetAddress, InetAddress inetAddress2) {
            if (inetAddress.getClass() == inetAddress2.getClass()) {
                return 0;
            }
            return inetAddress instanceof Inet6Address ? -1 : 1;
        }
    }

    public g0(SocketFactory socketFactory, hn.a aVar, int i10, String[] strArr, int i11) {
        this(socketFactory, aVar, i10, i11, strArr, null, null, null, 0);
    }

    public void a() {
        Socket socket = this.f36167m;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    public Socket b() throws WebSocketException {
        try {
            d();
            return this.f36167m;
        } catch (WebSocketException e10) {
            Socket socket = this.f36167m;
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
            throw e10;
        }
    }

    public final void c() throws WebSocketException {
        try {
            this.f36167m = new i0(this.f36155a, this.f36156b, this.f36157c, this.f36159e, this.f36164j, this.f36165k).a(g());
        } catch (Exception e10) {
            Object[] objArr = new Object[3];
            objArr[0] = this.f36160f != null ? "the proxy " : "";
            objArr[1] = this.f36156b;
            objArr[2] = e10.getMessage();
            throw new WebSocketException(o0.SOCKET_CONNECT_ERROR, String.format("Failed to connect to %s'%s': %s", objArr), e10);
        }
    }

    public final void d() throws WebSocketException {
        boolean z10 = this.f36160f != null;
        c();
        int i10 = this.f36158d;
        if (i10 > 0) {
            i(i10);
        }
        Socket socket = this.f36167m;
        if (socket instanceof SSLSocket) {
            k((SSLSocket) socket, this.f36156b.a());
        }
        if (z10) {
            f();
        }
    }

    public Socket e() {
        return this.f36167m;
    }

    public final void f() throws WebSocketException {
        try {
            this.f36160f.e(this.f36167m);
            SSLSocketFactory sSLSocketFactory = this.f36161g;
            if (sSLSocketFactory == null) {
                return;
            }
            try {
                Socket createSocket = sSLSocketFactory.createSocket(this.f36167m, this.f36162h, this.f36163i, true);
                this.f36167m = createSocket;
                try {
                    ((SSLSocket) createSocket).startHandshake();
                    k((SSLSocket) this.f36167m, this.f36160f.d());
                } catch (IOException e10) {
                    throw new WebSocketException(o0.SSL_HANDSHAKE_ERROR, String.format("SSL handshake with the WebSocket endpoint (%s) failed: %s", this.f36156b, e10.getMessage()), e10);
                }
            } catch (IOException e11) {
                throw new WebSocketException(o0.SOCKET_OVERLAY_ERROR, "Failed to overlay an existing socket: " + e11.getMessage(), e11);
            }
        } catch (IOException e12) {
            throw new WebSocketException(o0.PROXY_HANDSHAKE_ERROR, String.format("Handshake with the proxy server (%s) failed: %s", this.f36156b, e12.getMessage()), e12);
        }
    }

    public final InetAddress[] g() throws WebSocketException {
        InetAddress[] inetAddressArr;
        UnknownHostException e10 = null;
        try {
            inetAddressArr = InetAddress.getAllByName(this.f36156b.a());
            try {
                Arrays.sort(inetAddressArr, new a());
            } catch (UnknownHostException e11) {
                e10 = e11;
            }
        } catch (UnknownHostException e12) {
            inetAddressArr = null;
            e10 = e12;
        }
        if (inetAddressArr == null || inetAddressArr.length <= 0) {
            if (e10 == null) {
                e10 = new UnknownHostException("No IP addresses found");
            }
            throw new WebSocketException(o0.SOCKET_CONNECT_ERROR, String.format("Failed to resolve hostname %s: %s", this.f36156b, e10.getMessage()), e10);
        }
        return inetAddressArr;
    }

    public g0 h(j jVar, int i10) {
        this.f36164j = jVar;
        this.f36165k = i10;
        return this;
    }

    public final void i(int i10) throws WebSocketException {
        try {
            this.f36167m.setSoTimeout(i10);
        } catch (SocketException e10) {
            throw new WebSocketException(o0.SOCKET_CONNECT_ERROR, String.format("Failed to set SO_TIMEOUT: %s", e10.getMessage()), e10);
        }
    }

    public g0 j(boolean z10) {
        this.f36166l = z10;
        return this;
    }

    public final void k(SSLSocket sSLSocket, String str) throws HostnameUnverifiedException {
        if (this.f36166l && !v.f36274a.verify(str, sSLSocket.getSession())) {
            throw new HostnameUnverifiedException(sSLSocket, str);
        }
    }

    public g0(SocketFactory socketFactory, hn.a aVar, int i10, int i11, String[] strArr, c0 c0Var, SSLSocketFactory sSLSocketFactory, String str, int i12) {
        this.f36164j = j.BOTH;
        this.f36165k = ListPopupWindow.EXPAND_LIST_TIMEOUT;
        this.f36155a = socketFactory;
        this.f36156b = aVar;
        this.f36157c = i10;
        this.f36158d = i11;
        this.f36159e = strArr;
        this.f36160f = c0Var;
        this.f36161g = sSLSocketFactory;
        this.f36162h = str;
        this.f36163i = i12;
    }
}
