package ce;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f19313a;

    public a(String str) {
        jo.p.h(str, "appId");
        this.f19313a = str;
    }

    public final String a() {
        return this.f19313a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && jo.p.c(this.f19313a, ((a) obj).f19313a);
    }

    public int hashCode() {
        return this.f19313a.hashCode();
    }

    public String toString() {
        return "DeleteAppDetailId(appId=" + this.f19313a + ')';
    }
}
