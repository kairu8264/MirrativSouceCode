package ud;

import ud.d4;

/* loaded from: classes2.dex */
public final class l4 implements d4 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f55173j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55174a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55175b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55176c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55177d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55178e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55179f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55180g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55181h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55182i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l4 a(String str, String str2, String str3, String str4, String str5, String str6) {
            jo.p.h(str, "liveId");
            jo.p.h(str2, "userName");
            jo.p.h(str3, "userId");
            jo.p.h(str4, "message");
            jo.p.h(str5, "profileImageUrl");
            jo.p.h(str6, "badgeImageUrl");
            return new l4(null, str, 0, str3, str2, str4, null, str5, str6, 69, null);
        }
    }

    public l4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        this.f55174a = aVar;
        this.f55175b = str;
        this.f55176c = i10;
        this.f55177d = str2;
        this.f55178e = str3;
        this.f55179f = str4;
        this.f55180g = str5;
        this.f55181h = str6;
        this.f55182i = str7;
    }

    @Override // ud.d4
    public String a() {
        return this.f55179f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55175b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55178e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55176c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55177d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l4) {
            l4 l4Var = (l4) obj;
            return getType() == l4Var.getType() && jo.p.c(b(), l4Var.b()) && d() == l4Var.d() && jo.p.c(e(), l4Var.e()) && jo.p.c(c(), l4Var.c()) && jo.p.c(a(), l4Var.a()) && jo.p.c(h(), l4Var.h()) && jo.p.c(f(), l4Var.f()) && jo.p.c(g(), l4Var.g());
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55181h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55182i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55174a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55180g;
    }

    public int hashCode() {
        return (((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        return "StreamingLiveCommentCollabRecommendLiveBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ')';
    }

    public /* synthetic */ l4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_COLLAB_RECOMMEND_LIVE : aVar, str, (i11 & 4) != 0 ? 77 : i10, str2, str3, str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? "" : str7);
    }
}
