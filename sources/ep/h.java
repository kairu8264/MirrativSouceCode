package ep;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f30870a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30871b;

    public h(String str, Map<String, String> map) {
        String str2;
        jo.p.h(str, "scheme");
        jo.p.h(map, "authParams");
        this.f30871b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                jo.p.g(locale, "US");
                str2 = key.toLowerCase(locale);
                jo.p.g(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        jo.p.g(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f30870a = unmodifiableMap;
    }

    public final Charset a() {
        String str = this.f30870a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                jo.p.g(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        jo.p.g(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return this.f30870a.get("realm");
    }

    public final String c() {
        return this.f30871b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (jo.p.c(hVar.f30871b, this.f30871b) && jo.p.c(hVar.f30870a, this.f30870a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f30871b.hashCode()) * 31) + this.f30870a.hashCode();
    }

    public String toString() {
        return this.f30871b + " authParams=" + this.f30870a;
    }
}
