package qf;

import java.util.List;

/* loaded from: classes3.dex */
public final class b3 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f49065i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f49066j = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f49067a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49068b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49069c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f49070d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49071e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49072f;

    /* renamed from: g  reason: collision with root package name */
    public final int f49073g;

    /* renamed from: h  reason: collision with root package name */
    public final List<c1.c0> f49074h;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b3 a(String str, String str2, String str3, String str4, String str5, we.g gVar) {
            jo.p.h(str, "name");
            jo.p.h(str2, "iconUrl");
            jo.p.h(str3, "badgeImageUrl");
            jo.p.h(str4, "avatarImageUrl");
            jo.p.h(str5, "message");
            jo.p.h(gVar, "yellRank");
            return new b3(str, str2, str3, str3.length() > 0, str4, str5, gVar.i(), gVar.e());
        }
    }

    public b3(String str, String str2, String str3, boolean z10, String str4, String str5, int i10, List<c1.c0> list) {
        jo.p.h(str, "name");
        jo.p.h(str2, "iconUrl");
        jo.p.h(str3, "badgeImageUrl");
        jo.p.h(str4, "avatarImageUrl");
        jo.p.h(str5, "message");
        jo.p.h(list, "commentBackgroundGradientColors");
        this.f49067a = str;
        this.f49068b = str2;
        this.f49069c = str3;
        this.f49070d = z10;
        this.f49071e = str4;
        this.f49072f = str5;
        this.f49073g = i10;
        this.f49074h = list;
    }

    public final String a() {
        return this.f49071e;
    }

    public final String b() {
        return this.f49069c;
    }

    public final List<c1.c0> c() {
        return this.f49074h;
    }

    public final String d() {
        return this.f49068b;
    }

    public final String e() {
        return this.f49072f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b3) {
            b3 b3Var = (b3) obj;
            return jo.p.c(this.f49067a, b3Var.f49067a) && jo.p.c(this.f49068b, b3Var.f49068b) && jo.p.c(this.f49069c, b3Var.f49069c) && this.f49070d == b3Var.f49070d && jo.p.c(this.f49071e, b3Var.f49071e) && jo.p.c(this.f49072f, b3Var.f49072f) && this.f49073g == b3Var.f49073g && jo.p.c(this.f49074h, b3Var.f49074h);
        }
        return false;
    }

    public final String f() {
        return this.f49067a;
    }

    public final boolean g() {
        return this.f49070d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f49067a.hashCode() * 31) + this.f49068b.hashCode()) * 31) + this.f49069c.hashCode()) * 31;
        boolean z10 = this.f49070d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((((hashCode + i10) * 31) + this.f49071e.hashCode()) * 31) + this.f49072f.hashCode()) * 31) + Integer.hashCode(this.f49073g)) * 31) + this.f49074h.hashCode();
    }

    public String toString() {
        return "StreamCommentCheerleaderEnterBindModel(name=" + this.f49067a + ", iconUrl=" + this.f49068b + ", badgeImageUrl=" + this.f49069c + ", isVisibleBadgeImage=" + this.f49070d + ", avatarImageUrl=" + this.f49071e + ", message=" + this.f49072f + ", rankTextResInt=" + this.f49073g + ", commentBackgroundGradientColors=" + this.f49074h + ')';
    }
}
