package ud;

import com.dena.mirrorman.net.api.response.App;

/* loaded from: classes2.dex */
public final class u1 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f55559e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f55560f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f55561a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55562b;

    /* renamed from: c  reason: collision with root package name */
    public final String f55563c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55564d;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u1 a(App.AppParams appParams) {
            jo.p.h(appParams, "app");
            return new u1(appParams.getAppId(), appParams.getIconUrl(), appParams.getTitle(), appParams.getShortTitle());
        }
    }

    public u1(String str, String str2, String str3, String str4) {
        jo.p.h(str, "appId");
        jo.p.h(str2, "appImageUrl");
        jo.p.h(str3, "titleText");
        jo.p.h(str4, "shortTitle");
        this.f55561a = str;
        this.f55562b = str2;
        this.f55563c = str3;
        this.f55564d = str4;
    }

    public final String a() {
        return this.f55561a;
    }

    public final String b() {
        return this.f55562b;
    }

    public final String c() {
        return this.f55564d;
    }

    public final String d() {
        return this.f55563c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u1) {
            u1 u1Var = (u1) obj;
            return jo.p.c(this.f55561a, u1Var.f55561a) && jo.p.c(this.f55562b, u1Var.f55562b) && jo.p.c(this.f55563c, u1Var.f55563c) && jo.p.c(this.f55564d, u1Var.f55564d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f55561a.hashCode() * 31) + this.f55562b.hashCode()) * 31) + this.f55563c.hashCode()) * 31) + this.f55564d.hashCode();
    }

    public String toString() {
        return "LiveAnnounceAppBindModel(appId=" + this.f55561a + ", appImageUrl=" + this.f55562b + ", titleText=" + this.f55563c + ", shortTitle=" + this.f55564d + ')';
    }
}
