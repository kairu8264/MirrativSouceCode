package op;

import ep.a0;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import jo.p;
import op.j;
import org.conscrypt.Conscrypt;

/* loaded from: classes4.dex */
public final class i implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final b f45513b = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public static final j.a f45512a = new a();

    /* loaded from: classes4.dex */
    public static final class a implements j.a {
        @Override // op.j.a
        public boolean a(SSLSocket sSLSocket) {
            p.h(sSLSocket, "sslSocket");
            return np.d.f43742f.c() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // op.j.a
        public k b(SSLSocket sSLSocket) {
            p.h(sSLSocket, "sslSocket");
            return new i();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final j.a a() {
            return i.f45512a;
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    @Override // op.k
    public boolean a(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // op.k
    public boolean b() {
        return np.d.f43742f.c();
    }

    @Override // op.k
    public String c(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // op.k
    public void d(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Object[] array = np.h.f43761c.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
