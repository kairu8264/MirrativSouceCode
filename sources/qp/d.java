package qp;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import jo.p;
import rp.j0;
import so.n;
import so.o;
import xn.a0;
import xn.s;

/* loaded from: classes4.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final d f49662a = new d();

    public final List<String> a(X509Certificate x509Certificate) {
        p.h(x509Certificate, "certificate");
        return a0.o0(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final String b(String str) {
        if (d(str)) {
            Locale locale = Locale.US;
            p.g(locale, "Locale.US");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase(locale);
            p.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return str;
    }

    public final List<String> c(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!p.c(list.get(0), Integer.valueOf(i10))) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            return s.k();
        } catch (CertificateParsingException unused) {
            return s.k();
        }
    }

    public final boolean d(String str) {
        return str.length() == ((int) j0.b(str, 0, 0, 3, null));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        p.h(str, "host");
        p.h(x509Certificate, "certificate");
        return fp.b.f(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    public final boolean f(String str, String str2) {
        if (!(str == null || str.length() == 0) && !n.C(str, TopicConstant.SEPARATOR, false, 2, null) && !n.p(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !n.C(str2, TopicConstant.SEPARATOR, false, 2, null) && !n.p(str2, "..", false, 2, null)) {
                if (!n.p(str, TopicConstant.SEPARATOR, false, 2, null)) {
                    str = str + TopicConstant.SEPARATOR;
                }
                String str3 = str;
                if (!n.p(str2, TopicConstant.SEPARATOR, false, 2, null)) {
                    str2 = str2 + TopicConstant.SEPARATOR;
                }
                String b10 = b(str2);
                if (!o.H(b10, TopicConstant.MATCH_SINGLE, false, 2, null)) {
                    return p.c(str3, b10);
                }
                if (!n.C(b10, "*.", false, 2, null) || o.T(b10, '*', 1, false, 4, null) != -1 || str3.length() < b10.length() || p.c("*.", b10)) {
                    return false;
                }
                String substring = b10.substring(1);
                p.g(substring, "(this as java.lang.String).substring(startIndex)");
                if (n.p(str3, substring, false, 2, null)) {
                    int length = str3.length() - substring.length();
                    return length <= 0 || o.Y(str3, '.', length + (-1), false, 4, null) == -1;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean g(String str, X509Certificate x509Certificate) {
        String b10 = b(str);
        List<String> c10 = c(x509Certificate, 2);
        if ((c10 instanceof Collection) && c10.isEmpty()) {
            return false;
        }
        for (String str2 : c10) {
            if (f49662a.f(b10, str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(String str, X509Certificate x509Certificate) {
        String e10 = fp.a.e(str);
        List<String> c10 = c(x509Certificate, 7);
        if ((c10 instanceof Collection) && c10.isEmpty()) {
            return false;
        }
        for (String str2 : c10) {
            if (p.c(e10, fp.a.e(str2))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        p.h(str, "host");
        p.h(sSLSession, "session");
        if (d(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return e(str, (X509Certificate) certificate);
    }
}
