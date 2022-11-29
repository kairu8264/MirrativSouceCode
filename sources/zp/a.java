package zp;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class a<L, R> implements Map.Entry<L, R>, Comparable<a<L, R>>, Serializable {
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(a<L, R> aVar) {
        return new wp.a().g(c(), aVar.c()).g(e(), aVar.e()).t();
    }

    public abstract L c();

    public abstract R e();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return vp.a.a(getKey(), entry.getKey()) && vp.a.a(getValue(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return c();
    }

    @Override // java.util.Map.Entry
    public R getValue() {
        return e();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(c());
        sb2.append(',');
        sb2.append(e());
        sb2.append(')');
        return sb2.toString();
    }
}
