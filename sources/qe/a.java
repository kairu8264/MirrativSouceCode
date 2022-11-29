package qe;

import jo.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f49005a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49006b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49007c;

    public a(String str, String str2, String str3) {
        p.h(str, "refer");
        p.h(str2, "userId");
        this.f49005a = str;
        this.f49006b = str2;
        this.f49007c = str3;
    }

    public final String a() {
        return this.f49007c;
    }

    public final String b() {
        return this.f49005a;
    }

    public final String c() {
        return this.f49006b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f49005a, aVar.f49005a) && p.c(this.f49006b, aVar.f49006b) && p.c(this.f49007c, aVar.f49007c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f49005a.hashCode() * 31) + this.f49006b.hashCode()) * 31;
        String str = this.f49007c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReportArguments(refer=" + this.f49005a + ", userId=" + this.f49006b + ", liveId=" + this.f49007c + ')';
    }
}
