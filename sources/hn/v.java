package hn;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes4.dex */
public final class v implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final v f36274a = new v();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f36275b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List<String> a(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public static boolean c(String str) {
        return f36275b.matcher(str).matches();
    }

    public boolean b(String str, X509Certificate x509Certificate) {
        if (c(str)) {
            return f(str, x509Certificate);
        }
        return e(str, x509Certificate);
    }

    public final boolean d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(TopicConstant.SEPARATOR) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(TopicConstant.SEPARATOR) && !str2.endsWith("..")) {
            if (!str.endsWith(TopicConstant.SEPARATOR)) {
                str = str + '.';
            }
            if (!str2.endsWith(TopicConstant.SEPARATOR)) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains(TopicConstant.MATCH_SINGLE)) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (str.endsWith(substring)) {
                int length = str.length() - substring.length();
                return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
            }
            return false;
        }
        return false;
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        String b10;
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> a10 = a(x509Certificate, 2);
        int size = a10.size();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < size) {
            if (d(lowerCase, a10.get(i10))) {
                return true;
            }
            i10++;
            z10 = true;
        }
        if (z10 || (b10 = new i(x509Certificate.getSubjectX500Principal()).b("cn")) == null) {
            return false;
        }
        return d(lowerCase, b10);
    }

    public final boolean f(String str, X509Certificate x509Certificate) {
        List<String> a10 = a(x509Certificate, 7);
        int size = a10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(a10.get(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
