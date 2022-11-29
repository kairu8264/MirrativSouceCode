package ai;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class wm0 extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    public final SSLSocketFactory f11689a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ xm0 f11690b;

    public wm0(xm0 xm0Var) {
        this.f11690b = xm0Var;
    }

    public final Socket a(Socket socket) throws SocketException {
        int i10;
        int i11;
        i10 = this.f11690b.f12010o;
        if (i10 > 0) {
            i11 = this.f11690b.f12010o;
            socket.setReceiveBufferSize(i11);
        }
        this.f11690b.f12011p.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws IOException {
        Socket createSocket = this.f11689a.createSocket(str, i10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f11689a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f11689a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket createSocket = this.f11689a.createSocket(str, i10, inetAddress, i11);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket createSocket = this.f11689a.createSocket(inetAddress, i10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket createSocket = this.f11689a.createSocket(inetAddress, i10, inetAddress2, i11);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket createSocket = this.f11689a.createSocket(socket, str, i10, z10);
        a(createSocket);
        return createSocket;
    }
}
