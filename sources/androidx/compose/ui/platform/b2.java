package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14388a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14389b;

    public b2(String str, Object obj) {
        jo.p.h(str, "name");
        this.f14388a = str;
        this.f14389b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b2) {
            b2 b2Var = (b2) obj;
            return jo.p.c(this.f14388a, b2Var.f14388a) && jo.p.c(this.f14389b, b2Var.f14389b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f14388a.hashCode() * 31;
        Object obj = this.f14389b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f14388a + ", value=" + this.f14389b + ')';
    }
}
