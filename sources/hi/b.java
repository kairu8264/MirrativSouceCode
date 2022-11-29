package hi;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f35651a;

    /* renamed from: b  reason: collision with root package name */
    public final long f35652b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f35653c;

    public b(String str, long j10, Map<String, Object> map) {
        this.f35651a = str;
        this.f35652b = j10;
        HashMap hashMap = new HashMap();
        this.f35653c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final long a() {
        return this.f35652b;
    }

    /* renamed from: b */
    public final b clone() {
        return new b(this.f35651a, this.f35652b, new HashMap(this.f35653c));
    }

    public final Object c(String str) {
        if (this.f35653c.containsKey(str)) {
            return this.f35653c.get(str);
        }
        return null;
    }

    public final String d() {
        return this.f35651a;
    }

    public final Map<String, Object> e() {
        return this.f35653c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f35652b == bVar.f35652b && this.f35651a.equals(bVar.f35651a)) {
                return this.f35653c.equals(bVar.f35653c);
            }
            return false;
        }
        return false;
    }

    public final void f(String str) {
        this.f35651a = str;
    }

    public final void g(String str, Object obj) {
        if (obj == null) {
            this.f35653c.remove(str);
        } else {
            this.f35653c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f35651a.hashCode();
        long j10 = this.f35652b;
        return (((hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f35653c.hashCode();
    }

    public final String toString() {
        String str = this.f35651a;
        long j10 = this.f35652b;
        String obj = this.f35653c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 55 + obj.length());
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(obj);
        sb2.append('}');
        return sb2.toString();
    }
}
