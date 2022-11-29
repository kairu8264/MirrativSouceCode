package qp;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import jo.p;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<X500Principal, Set<X509Certificate>> f49660a;

    public b(X509Certificate... x509CertificateArr) {
        p.h(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            p.g(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f49660a = linkedHashMap;
    }

    @Override // qp.e
    public X509Certificate a(X509Certificate x509Certificate) {
        boolean z10;
        p.h(x509Certificate, "cert");
        Set<X509Certificate> set = this.f49660a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    x509Certificate.verify(((X509Certificate) next).getPublicKey());
                    z10 = true;
                    continue;
                } catch (Exception unused) {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    obj = next;
                    break;
                }
            }
            return (X509Certificate) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof b) && p.c(((b) obj).f49660a, this.f49660a));
    }

    public int hashCode() {
        return this.f49660a.hashCode();
    }
}
