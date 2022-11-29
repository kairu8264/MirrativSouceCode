package ai;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
public final class po0 extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    public final SSLSocketFactory f8486a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ qo0 f8487b;

    public po0(qo0 qo0Var) {
        this.f8487b = qo0Var;
    }

    public final Socket a(Socket socket) throws SocketException {
        int i10;
        int i11;
        i10 = this.f8487b.f9040s;
        if (i10 > 0) {
            i11 = this.f8487b.f9040s;
            socket.setReceiveBufferSize(i11);
        }
        this.f8487b.f9041t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws IOException {
        Socket createSocket = this.f8486a.createSocket(str, i10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f8486a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f8486a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket createSocket = this.f8486a.createSocket(str, i10, inetAddress, i11);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket createSocket = this.f8486a.createSocket(inetAddress, i10);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket createSocket = this.f8486a.createSocket(inetAddress, i10, inetAddress2, i11);
        a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket createSocket = this.f8486a.createSocket(socket, str, i10, z10);
        a(createSocket);
        return createSocket;
    }
}
