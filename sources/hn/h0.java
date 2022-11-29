package hn;

import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public SocketFactory f36170a;

    /* renamed from: b  reason: collision with root package name */
    public SSLSocketFactory f36171b;

    /* renamed from: c  reason: collision with root package name */
    public SSLContext f36172c;

    public SocketFactory a(boolean z10) {
        if (z10) {
            SSLContext sSLContext = this.f36172c;
            if (sSLContext != null) {
                return sSLContext.getSocketFactory();
            }
            SSLSocketFactory sSLSocketFactory = this.f36171b;
            return sSLSocketFactory != null ? sSLSocketFactory : SSLSocketFactory.getDefault();
        }
        SocketFactory socketFactory = this.f36170a;
        return socketFactory != null ? socketFactory : SocketFactory.getDefault();
    }
}
