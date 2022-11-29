package xm;

import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class m extends k {

    /* renamed from: a  reason: collision with root package name */
    public final zm.h<String, k> f60419a = new zm.h<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f60419a.equals(this.f60419a));
    }

    public int hashCode() {
        return this.f60419a.hashCode();
    }

    public void r(String str, k kVar) {
        zm.h<String, k> hVar = this.f60419a;
        if (kVar == null) {
            kVar = l.f60418a;
        }
        hVar.put(str, kVar);
    }

    public void s(String str, String str2) {
        r(str, str2 == null ? l.f60418a : new n(str2));
    }

    public Set<Map.Entry<String, k>> t() {
        return this.f60419a.entrySet();
    }

    public k u(String str) {
        return this.f60419a.get(str);
    }

    public n w(String str) {
        return (n) this.f60419a.get(str);
    }
}
