package hi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class j implements q, m {

    /* renamed from: w  reason: collision with root package name */
    public final String f35817w;

    /* renamed from: x  reason: collision with root package name */
    public final Map<String, q> f35818x = new HashMap();

    public j(String str) {
        this.f35817w = str;
    }

    public abstract q a(u4 u4Var, List<q> list);

    public final String b() {
        return this.f35817w;
    }

    @Override // hi.q
    public q d() {
        return this;
    }

    @Override // hi.q
    public final Double e() {
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            String str = this.f35817w;
            if (str != null) {
                return str.equals(jVar.f35817w);
            }
            return false;
        }
        return false;
    }

    @Override // hi.q
    public final Boolean f() {
        return Boolean.TRUE;
    }

    @Override // hi.m
    public final boolean g(String str) {
        return this.f35818x.containsKey(str);
    }

    @Override // hi.q
    public final String h() {
        return this.f35817w;
    }

    public final int hashCode() {
        String str = this.f35817w;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // hi.q
    public final Iterator<q> j() {
        return k.b(this.f35818x);
    }

    @Override // hi.m
    public final void k(String str, q qVar) {
        if (qVar == null) {
            this.f35818x.remove(str);
        } else {
            this.f35818x.put(str, qVar);
        }
    }

    @Override // hi.q
    public final q l(String str, u4 u4Var, List<q> list) {
        if ("toString".equals(str)) {
            return new u(this.f35817w);
        }
        return k.a(this, new u(str), u4Var, list);
    }

    @Override // hi.m
    public final q s(String str) {
        return this.f35818x.containsKey(str) ? this.f35818x.get(str) : q.f35921f;
    }
}
