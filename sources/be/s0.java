package be;

/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f18105a;

    public s0(String str) {
        jo.p.h(str, "tag");
        this.f18105a = str;
    }

    public final String a() {
        return this.f18105a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && jo.p.c(this.f18105a, ((s0) obj).f18105a);
    }

    public int hashCode() {
        return this.f18105a.hashCode();
    }

    public String toString() {
        return "OnClickOk(tag=" + this.f18105a + ')';
    }
}
