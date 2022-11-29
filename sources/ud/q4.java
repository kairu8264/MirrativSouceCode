package ud;

import ud.d4;

/* loaded from: classes2.dex */
public final class q4 implements d4 {

    /* renamed from: m  reason: collision with root package name */
    public static final a f55422m = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55423a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55424b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55425c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55426d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55427e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55428f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55429g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55430h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55431i;

    /* renamed from: j  reason: collision with root package name */
    public final String f55432j;

    /* renamed from: k  reason: collision with root package name */
    public final int f55433k;

    /* renamed from: l  reason: collision with root package name */
    public final int f55434l;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q4 a(String str, String str2, String str3) {
            jo.p.h(str, "liveId");
            jo.p.h(str2, "message");
            jo.p.h(str3, "linkOwnerLiveId");
            return new q4(null, str, 0, null, null, str2, null, null, null, str3, nd.d1.f41953o, nd.w0.f42242u0, 477, null);
        }
    }

    public q4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, int i12) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        jo.p.h(str8, "linkOwnerLiveId");
        this.f55423a = aVar;
        this.f55424b = str;
        this.f55425c = i10;
        this.f55426d = str2;
        this.f55427e = str3;
        this.f55428f = str4;
        this.f55429g = str5;
        this.f55430h = str6;
        this.f55431i = str7;
        this.f55432j = str8;
        this.f55433k = i11;
        this.f55434l = i12;
    }

    @Override // ud.d4
    public String a() {
        return this.f55428f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55424b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55427e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55425c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55426d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q4) {
            q4 q4Var = (q4) obj;
            return getType() == q4Var.getType() && jo.p.c(b(), q4Var.b()) && d() == q4Var.d() && jo.p.c(e(), q4Var.e()) && jo.p.c(c(), q4Var.c()) && jo.p.c(a(), q4Var.a()) && jo.p.c(h(), q4Var.h()) && jo.p.c(f(), q4Var.f()) && jo.p.c(g(), q4Var.g()) && jo.p.c(this.f55432j, q4Var.f55432j) && this.f55433k == q4Var.f55433k && this.f55434l == q4Var.f55434l;
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55430h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55431i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55423a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55429g;
    }

    public int hashCode() {
        return (((((((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31) + this.f55432j.hashCode()) * 31) + Integer.hashCode(this.f55433k)) * 31) + Integer.hashCode(this.f55434l);
    }

    public final String i() {
        return this.f55432j;
    }

    public final int j() {
        return this.f55434l;
    }

    public final int k() {
        return this.f55433k;
    }

    public String toString() {
        return "StreamingLiveCommentLiveLinkedBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", linkOwnerLiveId=" + this.f55432j + ", profileImageRes=" + this.f55433k + ", messageColorRes=" + this.f55434l + ')';
    }

    public /* synthetic */ q4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, int i12, int i13, jo.h hVar) {
        this((i13 & 1) != 0 ? d4.a.VIEW_TYPE_LIVE_LINKED : aVar, str, (i13 & 4) != 0 ? 26 : i10, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? "" : str3, str4, (i13 & 64) != 0 ? "" : str5, (i13 & 128) != 0 ? "" : str6, (i13 & 256) != 0 ? "" : str7, str8, i11, i12);
    }
}
