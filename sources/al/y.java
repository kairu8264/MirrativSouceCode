package al;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f13898a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f13899b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13900c;

    public y(int i10, int i11) {
        this.f13899b = i10;
        this.f13900c = i11;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f13898a));
    }

    public String b(String str) {
        if (str != null) {
            String trim = str.trim();
            int length = trim.length();
            int i10 = this.f13900c;
            return length > i10 ? trim.substring(0, i10) : trim;
        }
        return str;
    }

    public final String c(String str) {
        if (str != null) {
            return b(str);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized void d(String str, String str2) {
        String c10 = c(str);
        if (this.f13898a.size() >= this.f13899b && !this.f13898a.containsKey(c10)) {
            xk.f f10 = xk.f.f();
            f10.k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f13899b);
        }
        this.f13898a.put(c10, str2 == null ? "" : b(str2));
    }

    public synchronized void e(Map<String, String> map) {
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String c10 = c(entry.getKey());
            if (this.f13898a.size() >= this.f13899b && !this.f13898a.containsKey(c10)) {
                i10++;
            }
            String value = entry.getValue();
            this.f13898a.put(c10, value == null ? "" : b(value));
        }
        if (i10 > 0) {
            xk.f f10 = xk.f.f();
            f10.k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f13899b);
        }
    }
}
