package jp;

import ep.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import jo.p;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f38154a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38155b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38156c;

    /* renamed from: d  reason: collision with root package name */
    public final List<l> f38157d;

    public b(List<l> list) {
        p.h(list, "connectionSpecs");
        this.f38157d = list;
    }

    public final l a(SSLSocket sSLSocket) throws IOException {
        l lVar;
        p.h(sSLSocket, "sslSocket");
        int i10 = this.f38154a;
        int size = this.f38157d.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = this.f38157d.get(i10);
            if (lVar.e(sSLSocket)) {
                this.f38154a = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f38155b = c(sSLSocket);
            lVar.c(sSLSocket, this.f38156c);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f38156c);
        sb2.append(',');
        sb2.append(" modes=");
        sb2.append(this.f38157d);
        sb2.append(',');
        sb2.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        p.e(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        p.g(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException iOException) {
        p.h(iOException, i7.e.f36387u);
        this.f38156c = true;
        return (!this.f38155b || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }

    public final boolean c(SSLSocket sSLSocket) {
        int size = this.f38157d.size();
        for (int i10 = this.f38154a; i10 < size; i10++) {
            if (this.f38157d.get(i10).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
