package ud;

import ud.d4;

/* loaded from: classes2.dex */
public final class n4 implements d4 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f55266j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55267a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55268b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55269c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55270d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55271e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55272f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55273g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55274h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55275i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n4 a(String str) {
            jo.p.h(str, "liveId");
            return new n4(null, str, 0, null, null, null, null, null, null, 509, null);
        }
    }

    public n4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        this.f55267a = aVar;
        this.f55268b = str;
        this.f55269c = i10;
        this.f55270d = str2;
        this.f55271e = str3;
        this.f55272f = str4;
        this.f55273g = str5;
        this.f55274h = str6;
        this.f55275i = str7;
    }

    @Override // ud.d4
    public String a() {
        return this.f55272f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55268b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55271e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55269c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55270d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n4) {
            n4 n4Var = (n4) obj;
            return getType() == n4Var.getType() && jo.p.c(b(), n4Var.b()) && d() == n4Var.d() && jo.p.c(e(), n4Var.e()) && jo.p.c(c(), n4Var.c()) && jo.p.c(a(), n4Var.a()) && jo.p.c(h(), n4Var.h()) && jo.p.c(f(), n4Var.f()) && jo.p.c(g(), n4Var.g());
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55274h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55275i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55267a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55273g;
    }

    public int hashCode() {
        return (((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        return "StreamingLiveCommentEndBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ')';
    }

    public /* synthetic */ n4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_END : aVar, str, (i11 & 4) != 0 ? 1 : i10, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? "" : str3, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? "" : str7);
    }
}
