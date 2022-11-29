package dd;

import jo.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f29566a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29567b;

    /* renamed from: c  reason: collision with root package name */
    public final String f29568c;

    public g(String str, String str2, String str3) {
        p.h(str, "rank");
        p.h(str2, "receivedTotalPoint");
        p.h(str3, "month");
        this.f29566a = str;
        this.f29567b = str2;
        this.f29568c = str3;
    }

    public final String a() {
        String s10 = new xm.f().e(xm.c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…e()\n        .toJson(this)");
        return s10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return p.c(this.f29566a, gVar.f29566a) && p.c(this.f29567b, gVar.f29567b) && p.c(this.f29568c, gVar.f29568c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f29566a.hashCode() * 31) + this.f29567b.hashCode()) * 31) + this.f29568c.hashCode();
    }

    public String toString() {
        return "MonthlyRankingTargetDetail(rank=" + this.f29566a + ", receivedTotalPoint=" + this.f29567b + ", month=" + this.f29568c + ')';
    }
}
