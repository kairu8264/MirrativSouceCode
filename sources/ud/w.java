package ud;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final String f55627a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55628b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55629c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55630d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55631e;

    public w(String str, String str2, String str3, String str4, boolean z10) {
        jo.p.h(str, "iconUrl");
        jo.p.h(str2, "titleText");
        jo.p.h(str3, "descriptionText");
        jo.p.h(str4, "buttonText");
        this.f55627a = str;
        this.f55628b = str2;
        this.f55629c = str3;
        this.f55630d = str4;
        this.f55631e = z10;
    }

    public final String a() {
        return this.f55630d;
    }

    public final String b() {
        return this.f55629c;
    }

    public final boolean c() {
        return this.f55631e;
    }

    public final String d() {
        return this.f55627a;
    }

    public final String e() {
        return this.f55628b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return jo.p.c(this.f55627a, wVar.f55627a) && jo.p.c(this.f55628b, wVar.f55628b) && jo.p.c(this.f55629c, wVar.f55629c) && jo.p.c(this.f55630d, wVar.f55630d) && this.f55631e == wVar.f55631e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f55627a.hashCode() * 31) + this.f55628b.hashCode()) * 31) + this.f55629c.hashCode()) * 31) + this.f55630d.hashCode()) * 31;
        boolean z10 = this.f55631e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "CommentEventBannerBindModel(iconUrl=" + this.f55627a + ", titleText=" + this.f55628b + ", descriptionText=" + this.f55629c + ", buttonText=" + this.f55630d + ", eventCheckTextViewVisible=" + this.f55631e + ')';
    }
}
