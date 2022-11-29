package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class wk3 implements Map.Entry, Comparable<wk3> {

    /* renamed from: w  reason: collision with root package name */
    public final Comparable f11660w;

    /* renamed from: x  reason: collision with root package name */
    public Object f11661x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ al3 f11662y;

    public wk3(al3 al3Var, Comparable comparable, Object obj) {
        this.f11662y = al3Var;
        this.f11660w = comparable;
        this.f11661x = obj;
    }

    public static final boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final Comparable a() {
        return this.f11660w;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(wk3 wk3Var) {
        return this.f11660w.compareTo(wk3Var.f11660w);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return c(this.f11660w, entry.getKey()) && c(this.f11661x, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f11660w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11661x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f11660w;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f11661x;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f11662y.r();
        Object obj2 = this.f11661x;
        this.f11661x = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11660w);
        String valueOf2 = String.valueOf(this.f11661x);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return sb2.toString();
    }
}
