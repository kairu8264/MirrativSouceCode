package jf;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f37947a;

    public n() {
        this(null, 1, null);
    }

    public n(String str) {
        jo.p.h(str, "helpImageUrl");
        this.f37947a = str;
    }

    public final String a() {
        return this.f37947a;
    }

    public final boolean b() {
        return this.f37947a.length() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && jo.p.c(this.f37947a, ((n) obj).f37947a);
    }

    public int hashCode() {
        return this.f37947a.hashCode();
    }

    public String toString() {
        return "EditPartHelpBindModel(helpImageUrl=" + this.f37947a + ')';
    }

    public /* synthetic */ n(String str, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
