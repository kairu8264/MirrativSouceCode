package op;

import ep.a0;
import java.util.List;
import javax.net.ssl.SSLSocket;
import jo.p;

/* loaded from: classes4.dex */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public k f45514a;

    /* renamed from: b  reason: collision with root package name */
    public final a f45515b;

    /* loaded from: classes4.dex */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a aVar) {
        p.h(aVar, "socketAdapterFactory");
        this.f45515b = aVar;
    }

    @Override // op.k
    public boolean a(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        return this.f45515b.a(sSLSocket);
    }

    @Override // op.k
    public boolean b() {
        return true;
    }

    @Override // op.k
    public String c(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        k e10 = e(sSLSocket);
        if (e10 != null) {
            return e10.c(sSLSocket);
        }
        return null;
    }

    @Override // op.k
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        k e10 = e(sSLSocket);
        if (e10 != null) {
            e10.d(sSLSocket, str, list);
        }
    }

    public final synchronized k e(SSLSocket sSLSocket) {
        if (this.f45514a == null && this.f45515b.a(sSLSocket)) {
            this.f45514a = this.f45515b.b(sSLSocket);
        }
        return this.f45514a;
    }
}
