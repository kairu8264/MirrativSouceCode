package ce;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f19326a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19327b;

    public j(String str, String str2) {
        jo.p.h(str, "appId");
        jo.p.h(str2, "appUserId");
        this.f19326a = str;
        this.f19327b = str2;
    }

    public final String a() {
        return this.f19326a;
    }

    public final String b() {
        return this.f19327b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return jo.p.c(this.f19326a, jVar.f19326a) && jo.p.c(this.f19327b, jVar.f19327b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f19326a.hashCode() * 31) + this.f19327b.hashCode();
    }

    public String toString() {
        return "ClickedRetypeButton(appId=" + this.f19326a + ", appUserId=" + this.f19327b + ')';
    }
}
