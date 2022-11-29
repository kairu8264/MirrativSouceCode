package qf;

import java.util.List;

/* loaded from: classes3.dex */
public final class g2 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f49162i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f49163j = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f49164a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49165b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49166c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f49167d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49168e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49169f;

    /* renamed from: g  reason: collision with root package name */
    public final int f49170g;

    /* renamed from: h  reason: collision with root package name */
    public final List<c1.c0> f49171h;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g2 a(String str, String str2, String str3, String str4, String str5, we.g gVar) {
            jo.p.h(str, "name");
            jo.p.h(str2, "iconUrl");
            jo.p.h(str3, "badgeImageUrl");
            jo.p.h(str4, "avatarImageUrl");
            jo.p.h(str5, "message");
            jo.p.h(gVar, "yellRank");
            return new g2(str, str2, str3, str3.length() > 0, str4, str5, gVar.i(), gVar.e());
        }
    }

    public g2(String str, String str2, String str3, boolean z10, String str4, String str5, int i10, List<c1.c0> list) {
        jo.p.h(str, "name");
        jo.p.h(str2, "iconUrl");
        jo.p.h(str3, "badgeImageUrl");
        jo.p.h(str4, "avatarImageUrl");
        jo.p.h(str5, "message");
        jo.p.h(list, "commentBackgroundGradientColors");
        this.f49164a = str;
        this.f49165b = str2;
        this.f49166c = str3;
        this.f49167d = z10;
        this.f49168e = str4;
        this.f49169f = str5;
        this.f49170g = i10;
        this.f49171h = list;
    }

    public final String a() {
        return this.f49168e;
    }

    public final String b() {
        return this.f49166c;
    }

    public final List<c1.c0> c() {
        return this.f49171h;
    }

    public final String d() {
        return this.f49165b;
    }

    public final String e() {
        return this.f49169f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g2) {
            g2 g2Var = (g2) obj;
            return jo.p.c(this.f49164a, g2Var.f49164a) && jo.p.c(this.f49165b, g2Var.f49165b) && jo.p.c(this.f49166c, g2Var.f49166c) && this.f49167d == g2Var.f49167d && jo.p.c(this.f49168e, g2Var.f49168e) && jo.p.c(this.f49169f, g2Var.f49169f) && this.f49170g == g2Var.f49170g && jo.p.c(this.f49171h, g2Var.f49171h);
        }
        return false;
    }

    public final String f() {
        return this.f49164a;
    }

    public final boolean g() {
        return this.f49167d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f49164a.hashCode() * 31) + this.f49165b.hashCode()) * 31) + this.f49166c.hashCode()) * 31;
        boolean z10 = this.f49167d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((((hashCode + i10) * 31) + this.f49168e.hashCode()) * 31) + this.f49169f.hashCode()) * 31) + Integer.hashCode(this.f49170g)) * 31) + this.f49171h.hashCode();
    }

    public String toString() {
        return "PlayerCommentCheerleaderEnterBindModel(name=" + this.f49164a + ", iconUrl=" + this.f49165b + ", badgeImageUrl=" + this.f49166c + ", isVisibleBadgeImage=" + this.f49167d + ", avatarImageUrl=" + this.f49168e + ", message=" + this.f49169f + ", rankTextResInt=" + this.f49170g + ", commentBackgroundGradientColors=" + this.f49171h + ')';
    }
}
