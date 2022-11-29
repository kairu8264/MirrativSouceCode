package ce;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f19314a;

    public b(String str) {
        jo.p.h(str, "appId");
        this.f19314a = str;
    }

    public final String a() {
        return this.f19314a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && jo.p.c(this.f19314a, ((b) obj).f19314a);
    }

    public int hashCode() {
        return this.f19314a.hashCode();
    }

    public String toString() {
        return "EditAppDetailId(appId=" + this.f19314a + ')';
    }
}
