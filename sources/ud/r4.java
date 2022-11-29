package ud;

import ud.d4;

/* loaded from: classes2.dex */
public final class r4 implements d4 {

    /* renamed from: l  reason: collision with root package name */
    public static final a f55442l = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55443a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55444b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55445c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55446d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55447e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55448f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55449g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55450h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55451i;

    /* renamed from: j  reason: collision with root package name */
    public final String f55452j;

    /* renamed from: k  reason: collision with root package name */
    public final String f55453k;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final r4 a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            jo.p.h(str, "liveId");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            jo.p.h(str4, "message");
            jo.p.h(str5, "profileImageUrl");
            jo.p.h(str6, "rewardTitle");
            return new r4(null, str, 0, str2, str3, str4, null, str5, null, str6, str7, 325, null);
        }
    }

    public r4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        jo.p.h(str8, "rewardTitle");
        this.f55443a = aVar;
        this.f55444b = str;
        this.f55445c = i10;
        this.f55446d = str2;
        this.f55447e = str3;
        this.f55448f = str4;
        this.f55449g = str5;
        this.f55450h = str6;
        this.f55451i = str7;
        this.f55452j = str8;
        this.f55453k = str9;
    }

    @Override // ud.d4
    public String a() {
        return this.f55448f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55444b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55447e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55445c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55446d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r4) {
            r4 r4Var = (r4) obj;
            return getType() == r4Var.getType() && jo.p.c(b(), r4Var.b()) && d() == r4Var.d() && jo.p.c(e(), r4Var.e()) && jo.p.c(c(), r4Var.c()) && jo.p.c(a(), r4Var.a()) && jo.p.c(h(), r4Var.h()) && jo.p.c(f(), r4Var.f()) && jo.p.c(g(), r4Var.g()) && jo.p.c(this.f55452j, r4Var.f55452j) && jo.p.c(this.f55453k, r4Var.f55453k);
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55450h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55451i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55443a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55449g;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31) + this.f55452j.hashCode()) * 31;
        String str = this.f55453k;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.f55453k;
    }

    public final String j() {
        return this.f55452j;
    }

    public String toString() {
        return "StreamingLiveCommentLuckyPrizeBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", rewardTitle=" + this.f55452j + ", rewardImageUrl=" + this.f55453k + ')';
    }

    public /* synthetic */ r4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_LUCKY_PRIZE : aVar, str, (i11 & 4) != 0 ? 113 : i10, str2, str3, str4, (i11 & 64) != 0 ? "" : str5, str6, (i11 & 256) != 0 ? "" : str7, str8, str9);
    }
}
