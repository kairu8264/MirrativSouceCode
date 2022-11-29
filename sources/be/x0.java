package be;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f18298a;

    public x0(String str) {
        jo.p.h(str, "tag");
        this.f18298a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && jo.p.c(this.f18298a, ((x0) obj).f18298a);
    }

    public int hashCode() {
        return this.f18298a.hashCode();
    }

    public String toString() {
        return "OnClickOk(tag=" + this.f18298a + ')';
    }
}
