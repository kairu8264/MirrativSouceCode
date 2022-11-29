package ud;

import ud.r2;

/* loaded from: classes2.dex */
public final class c3 implements r2 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f54826i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f54827a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54828b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54829c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54830d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54831e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54832f;

    /* renamed from: g  reason: collision with root package name */
    public final String f54833g;

    /* renamed from: h  reason: collision with root package name */
    public final String f54834h;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c3 a(String str, String str2, String str3, String str4, String str5, String str6) {
            jo.p.h(str, "liveId");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            jo.p.h(str4, "message");
            jo.p.h(str5, "profileImageUrl");
            jo.p.h(str6, "badgeImageUrl");
            return new c3(null, str, 0, str2, str3, str4, str5, str6, 5, null);
        }
    }

    public c3(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "profileImageUrl");
        jo.p.h(str6, "badgeImageUrl");
        this.f54827a = aVar;
        this.f54828b = str;
        this.f54829c = i10;
        this.f54830d = str2;
        this.f54831e = str3;
        this.f54832f = str4;
        this.f54833g = str5;
        this.f54834h = str6;
    }

    @Override // ud.r2
    public String a() {
        return this.f54832f;
    }

    public final String b() {
        return this.f54834h;
    }

    @Override // ud.r2
    public String c() {
        return this.f54831e;
    }

    @Override // ud.r2
    public int d() {
        return this.f54829c;
    }

    @Override // ud.r2
    public String e() {
        return this.f54830d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c3) {
            c3 c3Var = (c3) obj;
            return getType() == c3Var.getType() && jo.p.c(f(), c3Var.f()) && d() == c3Var.d() && jo.p.c(e(), c3Var.e()) && jo.p.c(c(), c3Var.c()) && jo.p.c(a(), c3Var.a()) && jo.p.c(this.f54833g, c3Var.f54833g) && jo.p.c(this.f54834h, c3Var.f54834h);
        }
        return false;
    }

    public String f() {
        return this.f54828b;
    }

    public final String g() {
        return this.f54833g;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f54827a;
    }

    public int hashCode() {
        return (((((((((((((getType().hashCode() * 31) + f().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f54833g.hashCode()) * 31) + this.f54834h.hashCode();
    }

    public String toString() {
        return "PlayerLiveCommentMemoBroadcastBindModel(type=" + getType() + ", liveId=" + f() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", profileImageUrl=" + this.f54833g + ", badgeImageUrl=" + this.f54834h + ')';
    }

    public /* synthetic */ c3(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? r2.a.VIEW_TYPE_MEMO_BROADCAST : aVar, str, (i11 & 4) != 0 ? 19 : i10, str2, str3, str4, str5, str6);
    }
}
