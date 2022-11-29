package ep;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import jo.j0;
import rp.f;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<c> f30861a;

    /* renamed from: b  reason: collision with root package name */
    public final qp.c f30862b;

    /* renamed from: d  reason: collision with root package name */
    public static final b f30860d = new b(null);

    /* renamed from: c  reason: collision with root package name */
    public static final g f30859c = new a().b();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f30863a = new ArrayList();

        public final a a(String str, String... strArr) {
            jo.p.h(str, "pattern");
            jo.p.h(strArr, "pins");
            for (String str2 : strArr) {
                this.f30863a.add(new c(str, str2));
            }
            return this;
        }

        public final g b() {
            return new g(xn.a0.F0(this.f30863a), null, 2, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        public b() {
        }

        public final String a(Certificate certificate) {
            jo.p.h(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + c((X509Certificate) certificate).a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final rp.f b(X509Certificate x509Certificate) {
            jo.p.h(x509Certificate, "$this$sha1Hash");
            f.a aVar = rp.f.f51677z;
            PublicKey publicKey = x509Certificate.getPublicKey();
            jo.p.g(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            jo.p.g(encoded, "publicKey.encoded");
            return f.a.f(aVar, encoded, 0, 0, 3, null).E();
        }

        public final rp.f c(X509Certificate x509Certificate) {
            jo.p.h(x509Certificate, "$this$sha256Hash");
            f.a aVar = rp.f.f51677z;
            PublicKey publicKey = x509Certificate.getPublicKey();
            jo.p.g(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            jo.p.g(encoded, "publicKey.encoded");
            return f.a.f(aVar, encoded, 0, 0, 3, null).F();
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f30864a;

        /* renamed from: b  reason: collision with root package name */
        public final String f30865b;

        /* renamed from: c  reason: collision with root package name */
        public final rp.f f30866c;

        public c(String str, String str2) {
            jo.p.h(str, "pattern");
            jo.p.h(str2, "pin");
            if ((so.n.C(str, "*.", false, 2, null) && so.o.U(str, TopicConstant.MATCH_SINGLE, 1, false, 4, null) == -1) || (so.n.C(str, "**.", false, 2, null) && so.o.U(str, TopicConstant.MATCH_SINGLE, 2, false, 4, null) == -1) || so.o.U(str, TopicConstant.MATCH_SINGLE, 0, false, 6, null) == -1) {
                String e10 = fp.a.e(str);
                if (e10 != null) {
                    this.f30864a = e10;
                    if (so.n.C(str2, "sha1/", false, 2, null)) {
                        this.f30865b = "sha1";
                        f.a aVar = rp.f.f51677z;
                        String substring = str2.substring(5);
                        jo.p.g(substring, "(this as java.lang.String).substring(startIndex)");
                        rp.f a10 = aVar.a(substring);
                        if (a10 != null) {
                            this.f30866c = a10;
                            return;
                        }
                        throw new IllegalArgumentException("Invalid pin hash: " + str2);
                    } else if (so.n.C(str2, "sha256/", false, 2, null)) {
                        this.f30865b = "sha256";
                        f.a aVar2 = rp.f.f51677z;
                        String substring2 = str2.substring(7);
                        jo.p.g(substring2, "(this as java.lang.String).substring(startIndex)");
                        rp.f a11 = aVar2.a(substring2);
                        if (a11 != null) {
                            this.f30866c = a11;
                            return;
                        }
                        throw new IllegalArgumentException("Invalid pin hash: " + str2);
                    } else {
                        throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
                    }
                }
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
        }

        public final rp.f a() {
            return this.f30866c;
        }

        public final String b() {
            return this.f30865b;
        }

        public final boolean c(String str) {
            jo.p.h(str, "hostname");
            if (so.n.C(this.f30864a, "**.", false, 2, null)) {
                int length = this.f30864a.length() - 3;
                int length2 = str.length() - length;
                if (!so.n.t(str, str.length() - length, this.f30864a, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else if (so.n.C(this.f30864a, "*.", false, 2, null)) {
                int length3 = this.f30864a.length() - 1;
                int length4 = str.length() - length3;
                if (!so.n.t(str, str.length() - length3, this.f30864a, 1, length3, false, 16, null) || so.o.Y(str, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            } else {
                return jo.p.c(str, this.f30864a);
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return ((jo.p.c(this.f30864a, cVar.f30864a) ^ true) || (jo.p.c(this.f30865b, cVar.f30865b) ^ true) || (jo.p.c(this.f30866c, cVar.f30866c) ^ true)) ? false : true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f30864a.hashCode() * 31) + this.f30865b.hashCode()) * 31) + this.f30866c.hashCode();
        }

        public String toString() {
            return this.f30865b + '/' + this.f30866c.a();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends jo.q implements io.a<List<? extends X509Certificate>> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ List f30868x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f30869y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, String str) {
            super(0);
            this.f30868x = list;
            this.f30869y = str;
        }

        @Override // io.a
        /* renamed from: a */
        public final List<X509Certificate> invoke() {
            List<Certificate> list;
            qp.c d10 = g.this.d();
            if (d10 == null || (list = d10.a(this.f30868x, this.f30869y)) == null) {
                list = this.f30868x;
            }
            ArrayList arrayList = new ArrayList(xn.t.u(list, 10));
            for (Certificate certificate : list) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public g(Set<c> set, qp.c cVar) {
        jo.p.h(set, "pins");
        this.f30861a = set;
        this.f30862b = cVar;
    }

    public final void a(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        jo.p.h(str, "hostname");
        jo.p.h(list, "peerCertificates");
        b(str, new d(list, str));
    }

    public final void b(String str, io.a<? extends List<? extends X509Certificate>> aVar) {
        jo.p.h(str, "hostname");
        jo.p.h(aVar, "cleanedPeerCertificatesFn");
        List<c> c10 = c(str);
        if (c10.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = aVar.invoke();
        for (X509Certificate x509Certificate : invoke) {
            rp.f fVar = null;
            rp.f fVar2 = null;
            for (c cVar : c10) {
                String b10 = cVar.b();
                int hashCode = b10.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && b10.equals("sha1")) {
                        if (fVar2 == null) {
                            fVar2 = f30860d.b(x509Certificate);
                        }
                        if (jo.p.c(cVar.a(), fVar2)) {
                            return;
                        }
                    }
                    throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                } else if (b10.equals("sha256")) {
                    if (fVar == null) {
                        fVar = f30860d.c(x509Certificate);
                    }
                    if (jo.p.c(cVar.a(), fVar)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb2.append("\n    ");
            sb2.append(f30860d.a(x509Certificate2));
            sb2.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            jo.p.g(subjectDN, "element.subjectDN");
            sb2.append(subjectDN.getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        for (c cVar2 : c10) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String sb3 = sb2.toString();
        jo.p.g(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    public final List<c> c(String str) {
        jo.p.h(str, "hostname");
        Set<c> set = this.f30861a;
        List<c> k10 = xn.s.k();
        for (Object obj : set) {
            if (((c) obj).c(str)) {
                if (k10.isEmpty()) {
                    k10 = new ArrayList<>();
                }
                j0.c(k10).add(obj);
            }
        }
        return k10;
    }

    public final qp.c d() {
        return this.f30862b;
    }

    public final g e(qp.c cVar) {
        jo.p.h(cVar, "certificateChainCleaner");
        return jo.p.c(this.f30862b, cVar) ? this : new g(this.f30861a, cVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (jo.p.c(gVar.f30861a, this.f30861a) && jo.p.c(gVar.f30862b, this.f30862b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f30861a.hashCode()) * 41;
        qp.c cVar = this.f30862b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ g(Set set, qp.c cVar, int i10, jo.h hVar) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
