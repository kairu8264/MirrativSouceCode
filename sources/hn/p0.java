package hn;

import com.neovisionaries.ws.client.WebSocketException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f36246a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f36247b;

    public p0(String str) {
        if (m0.b(str)) {
            this.f36246a = str;
            this.f36247b = new LinkedHashMap();
            return;
        }
        throw new IllegalArgumentException("'name' is not a valid token.");
    }

    public static p0 a(String str) {
        if ("permessage-deflate".equals(str)) {
            return new y(str);
        }
        return new p0(str);
    }

    public static String b(String[] strArr) {
        if (strArr.length != 2) {
            return null;
        }
        return m0.d(strArr[1]);
    }

    public static p0 e(String str) {
        String b10;
        if (str == null) {
            return null;
        }
        String[] split = str.trim().split("\\s*;\\s*");
        if (split.length == 0) {
            return null;
        }
        String str2 = split[0];
        if (m0.b(str2)) {
            p0 a10 = a(str2);
            for (int i10 = 1; i10 < split.length; i10++) {
                String[] split2 = split[i10].split("\\s*=\\s*", 2);
                if (split2.length != 0 && split2[0].length() != 0) {
                    String str3 = split2[0];
                    if (m0.b(str3) && ((b10 = b(split2)) == null || m0.b(b10))) {
                        a10.f(str3, b10);
                    }
                }
            }
            return a10;
        }
        return null;
    }

    public String c() {
        return this.f36246a;
    }

    public Map<String, String> d() {
        return this.f36247b;
    }

    public p0 f(String str, String str2) {
        if (m0.b(str)) {
            if (str2 != null && !m0.b(str2)) {
                throw new IllegalArgumentException("'value' is not a valid token.");
            }
            this.f36247b.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("'key' is not a valid token.");
    }

    public void g() throws WebSocketException {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f36246a);
        for (Map.Entry<String, String> entry : this.f36247b.entrySet()) {
            sb2.append("; ");
            sb2.append(entry.getKey());
            String value = entry.getValue();
            if (value != null && value.length() != 0) {
                sb2.append("=");
                sb2.append(value);
            }
        }
        return sb2.toString();
    }
}
