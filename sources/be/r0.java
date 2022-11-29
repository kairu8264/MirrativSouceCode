package be;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f18095a;

    public r0(String str) {
        jo.p.h(str, "tag");
        this.f18095a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && jo.p.c(this.f18095a, ((r0) obj).f18095a);
    }

    public int hashCode() {
        return this.f18095a.hashCode();
    }

    public String toString() {
        return "OnClickCancel(tag=" + this.f18095a + ')';
    }
}
