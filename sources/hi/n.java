package hi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class n implements q, m {

    /* renamed from: w  reason: collision with root package name */
    public final Map<String, q> f35860w = new HashMap();

    public final List<String> a() {
        return new ArrayList(this.f35860w.keySet());
    }

    @Override // hi.q
    public final q d() {
        n nVar = new n();
        for (Map.Entry<String, q> entry : this.f35860w.entrySet()) {
            if (entry.getValue() instanceof m) {
                nVar.f35860w.put(entry.getKey(), entry.getValue());
            } else {
                nVar.f35860w.put(entry.getKey(), entry.getValue().d());
            }
        }
        return nVar;
    }

    @Override // hi.q
    public final Double e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f35860w.equals(((n) obj).f35860w);
        }
        return false;
    }

    @Override // hi.q
    public final Boolean f() {
        return Boolean.TRUE;
    }

    @Override // hi.m
    public final boolean g(String str) {
        return this.f35860w.containsKey(str);
    }

    @Override // hi.q
    public final String h() {
        return "[object Object]";
    }

    public final int hashCode() {
        return this.f35860w.hashCode();
    }

    @Override // hi.q
    public final Iterator<q> j() {
        return k.b(this.f35860w);
    }

    @Override // hi.m
    public final void k(String str, q qVar) {
        if (qVar == null) {
            this.f35860w.remove(str);
        } else {
            this.f35860w.put(str, qVar);
        }
    }

    @Override // hi.q
    public q l(String str, u4 u4Var, List<q> list) {
        if ("toString".equals(str)) {
            return new u(toString());
        }
        return k.a(this, new u(str), u4Var, list);
    }

    @Override // hi.m
    public final q s(String str) {
        return this.f35860w.containsKey(str) ? this.f35860w.get(str) : q.f35921f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f35860w.isEmpty()) {
            for (String str : this.f35860w.keySet()) {
                sb2.append(String.format("%s: %s,", str, this.f35860w.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
