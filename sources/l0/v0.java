package l0;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f39286a;

    public v0(String str) {
        jo.p.h(str, "key");
        this.f39286a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && jo.p.c(this.f39286a, ((v0) obj).f39286a);
    }

    public int hashCode() {
        return this.f39286a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f39286a + ')';
    }
}
