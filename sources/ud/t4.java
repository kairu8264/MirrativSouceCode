package ud;

import ud.d4;

/* loaded from: classes2.dex */
public final class t4 implements d4 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f55536j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55537a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55538b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55539c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55540d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55541e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55542f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55543g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55544h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55545i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t4 a(String str, int i10, String str2) {
            jo.p.h(str, "liveId");
            jo.p.h(str2, "message");
            return new t4(null, str, i10, null, null, str2, null, null, null, 473, null);
        }
    }

    public t4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        this.f55537a = aVar;
        this.f55538b = str;
        this.f55539c = i10;
        this.f55540d = str2;
        this.f55541e = str3;
        this.f55542f = str4;
        this.f55543g = str5;
        this.f55544h = str6;
        this.f55545i = str7;
    }

    @Override // ud.d4
    public String a() {
        return this.f55542f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55538b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55541e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55539c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55540d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t4) {
            t4 t4Var = (t4) obj;
            return getType() == t4Var.getType() && jo.p.c(b(), t4Var.b()) && d() == t4Var.d() && jo.p.c(e(), t4Var.e()) && jo.p.c(c(), t4Var.c()) && jo.p.c(a(), t4Var.a()) && jo.p.c(h(), t4Var.h()) && jo.p.c(f(), t4Var.f()) && jo.p.c(g(), t4Var.g());
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55544h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55545i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55537a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55543g;
    }

    public int hashCode() {
        return (((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        return "StreamingLiveCommentTextBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ')';
    }

    public /* synthetic */ t4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_TEXT : aVar, str, i10, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? "" : str3, str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? "" : str7);
    }
}
