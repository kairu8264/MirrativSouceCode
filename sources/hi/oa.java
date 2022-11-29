package hi;

import java.util.Map;

/* loaded from: classes3.dex */
public final class oa implements Map.Entry, Comparable<oa> {

    /* renamed from: w  reason: collision with root package name */
    public final Comparable f35896w;

    /* renamed from: x  reason: collision with root package name */
    public Object f35897x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ra f35898y;

    public oa(ra raVar, Comparable comparable, Object obj) {
        this.f35898y = raVar;
        this.f35896w = comparable;
        this.f35897x = obj;
    }

    public static final boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f35896w;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(oa oaVar) {
        return this.f35896w.compareTo(oaVar.f35896w);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return c(this.f35896w, entry.getKey()) && c(this.f35897x, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f35896w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f35897x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f35896w;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f35897x;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f35898y.s();
        Object obj2 = this.f35897x;
        this.f35897x = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f35896w);
        String valueOf2 = String.valueOf(this.f35897x);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
