package np;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import ep.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import jo.p;
import op.i;
import op.j;
import op.k;
import xn.s;

/* loaded from: classes4.dex */
public final class a extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f43729e;

    /* renamed from: f  reason: collision with root package name */
    public static final C0641a f43730f = new C0641a(null);

    /* renamed from: d  reason: collision with root package name */
    public final List<k> f43731d;

    /* renamed from: np.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0641a {
        public C0641a() {
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f43729e;
        }

        public /* synthetic */ C0641a(jo.h hVar) {
            this();
        }
    }

    static {
        f43729e = h.f43761c.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List o10 = s.o(op.a.f45490a.a(), new j(op.f.f45499g.d()), new j(i.f45513b.a()), new j(op.g.f45507b.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : o10) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f43731d = arrayList;
    }

    @Override // np.h
    public qp.c c(X509TrustManager x509TrustManager) {
        p.h(x509TrustManager, "trustManager");
        op.b a10 = op.b.f45491d.a(x509TrustManager);
        return a10 != null ? a10 : super.c(x509TrustManager);
    }

    @Override // np.h
    public void e(SSLSocket sSLSocket, String str, List<? extends a0> list) {
        Object obj;
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        Iterator<T> it = this.f43731d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.d(sSLSocket, str, list);
        }
    }

    @Override // np.h
    public String g(SSLSocket sSLSocket) {
        Object obj;
        p.h(sSLSocket, "sslSocket");
        Iterator<T> it = this.f43731d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sSLSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            return kVar.c(sSLSocket);
        }
        return null;
    }

    @Override // np.h
    @SuppressLint({"NewApi"})
    public boolean i(String str) {
        p.h(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
