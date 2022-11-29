package np;

import ep.a0;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import jo.p;

/* loaded from: classes4.dex */
public class f extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f43754d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f43755e = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public final f a() {
            if (b()) {
                return new f();
            }
            return null;
        }

        public final boolean b() {
            return f.f43754d;
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1.intValue() >= 9) goto L9;
     */
    static {
        /*
            np.f$a r0 = new np.f$a
            r1 = 0
            r0.<init>(r1)
            np.f.f43755e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            java.lang.Integer r1 = so.m.i(r0)
        L14:
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L21
            goto L2c
        L21:
            r0 = r2
            goto L2c
        L23:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L21
        L2c:
            np.f.f43754d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np.f.<clinit>():void");
    }

    @Override // np.h
    public void e(SSLSocket sSLSocket, String str, List<a0> list) {
        p.h(sSLSocket, "sslSocket");
        p.h(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        List<String> b10 = h.f43761c.b(list);
        p.g(sSLParameters, "sslParameters");
        Object[] array = b10.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // np.h
    public String g(SSLSocket sSLSocket) {
        p.h(sSLSocket, "sslSocket");
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
