package be;

/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f18255a;

    public w0(String str) {
        jo.p.h(str, "tag");
        this.f18255a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && jo.p.c(this.f18255a, ((w0) obj).f18255a);
    }

    public int hashCode() {
        return this.f18255a.hashCode();
    }

    public String toString() {
        return "OnClickCancel(tag=" + this.f18255a + ')';
    }
}
