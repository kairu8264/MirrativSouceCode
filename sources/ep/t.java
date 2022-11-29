package ep;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: e  reason: collision with root package name */
    public static final a f31003e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final wn.f f31004a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f31005b;

    /* renamed from: c  reason: collision with root package name */
    public final i f31006c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f31007d;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: ep.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0313a extends jo.q implements io.a<List<? extends Certificate>> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List f31008w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0313a(List list) {
                super(0);
                this.f31008w = list;
            }

            @Override // io.a
            /* renamed from: a */
            public final List<Certificate> invoke() {
                return this.f31008w;
            }
        }

        public a() {
        }

        public final t a(SSLSession sSLSession) throws IOException {
            List<Certificate> k10;
            jo.p.h(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? !cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : !(hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL"))) {
                    i b10 = i.f30927s1.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!jo.p.c("NONE", protocol)) {
                            g0 a10 = g0.Companion.a(protocol);
                            try {
                                k10 = b(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                k10 = xn.s.k();
                            }
                            return new t(a10, b10, b(sSLSession.getLocalCertificates()), new C0313a(k10));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }

        public final List<Certificate> b(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return fp.b.t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return xn.s.k();
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements io.a<List<? extends Certificate>> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f31009w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.a aVar) {
            super(0);
            this.f31009w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final List<Certificate> invoke() {
            try {
                return (List) this.f31009w.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return xn.s.k();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(g0 g0Var, i iVar, List<? extends Certificate> list, io.a<? extends List<? extends Certificate>> aVar) {
        jo.p.h(g0Var, "tlsVersion");
        jo.p.h(iVar, "cipherSuite");
        jo.p.h(list, "localCertificates");
        jo.p.h(aVar, "peerCertificatesFn");
        this.f31005b = g0Var;
        this.f31006c = iVar;
        this.f31007d = list;
        this.f31004a = wn.g.a(new b(aVar));
    }

    public final i a() {
        return this.f31006c;
    }

    public final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        jo.p.g(type, "type");
        return type;
    }

    public final List<Certificate> c() {
        return this.f31007d;
    }

    public final List<Certificate> d() {
        return (List) this.f31004a.getValue();
    }

    public final g0 e() {
        return this.f31005b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (tVar.f31005b == this.f31005b && jo.p.c(tVar.f31006c, this.f31006c) && jo.p.c(tVar.d(), d()) && jo.p.c(tVar.f31007d, this.f31007d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f31005b.hashCode()) * 31) + this.f31006c.hashCode()) * 31) + d().hashCode()) * 31) + this.f31007d.hashCode();
    }

    public String toString() {
        List<Certificate> d10 = d();
        ArrayList arrayList = new ArrayList(xn.t.u(d10, 10));
        for (Certificate certificate : d10) {
            arrayList.add(b(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{");
        sb2.append("tlsVersion=");
        sb2.append(this.f31005b);
        sb2.append(' ');
        sb2.append("cipherSuite=");
        sb2.append(this.f31006c);
        sb2.append(' ');
        sb2.append("peerCertificates=");
        sb2.append(obj);
        sb2.append(' ');
        sb2.append("localCertificates=");
        List<Certificate> list = this.f31007d;
        ArrayList arrayList2 = new ArrayList(xn.t.u(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(b(certificate2));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
