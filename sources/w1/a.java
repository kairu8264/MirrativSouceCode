package w1;

import wn.b;

/* loaded from: classes.dex */
public final class a<T extends wn.b<? extends Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public final String f57870a;

    /* renamed from: b  reason: collision with root package name */
    public final T f57871b;

    public a(String str, T t10) {
        this.f57870a = str;
        this.f57871b = t10;
    }

    public final T a() {
        return this.f57871b;
    }

    public final String b() {
        return this.f57870a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return jo.p.c(this.f57870a, aVar.f57870a) && jo.p.c(this.f57871b, aVar.f57871b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f57870a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.f57871b;
        return hashCode + (t10 != null ? t10.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f57870a + ", action=" + this.f57871b + ')';
    }
}
