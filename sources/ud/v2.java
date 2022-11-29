package ud;

import android.content.Context;
import ud.r2;

/* loaded from: classes2.dex */
public final class v2 implements r2 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f55599i = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f55600a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55601b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55602c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55603d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55604e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55605f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55606g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55607h;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v2 a(Context context, String str, String str2, String str3, String str4, String str5) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            jo.p.h(str4, "profileImageUrl");
            String string = context.getString(nd.f1.text_check_profile, str3);
            jo.p.g(string, "context.getString(R.stri…_check_profile, userName)");
            return new v2(null, str, 0, str2, str3, string, str4, str5, 5, null);
        }
    }

    public v2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "profileImageUrl");
        this.f55600a = aVar;
        this.f55601b = str;
        this.f55602c = i10;
        this.f55603d = str2;
        this.f55604e = str3;
        this.f55605f = str4;
        this.f55606g = str5;
        this.f55607h = str6;
    }

    @Override // ud.r2
    public String a() {
        return this.f55605f;
    }

    public final String b() {
        return this.f55607h;
    }

    @Override // ud.r2
    public String c() {
        return this.f55604e;
    }

    @Override // ud.r2
    public int d() {
        return this.f55602c;
    }

    @Override // ud.r2
    public String e() {
        return this.f55603d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v2) {
            v2 v2Var = (v2) obj;
            return getType() == v2Var.getType() && jo.p.c(f(), v2Var.f()) && d() == v2Var.d() && jo.p.c(e(), v2Var.e()) && jo.p.c(c(), v2Var.c()) && jo.p.c(a(), v2Var.a()) && jo.p.c(this.f55606g, v2Var.f55606g) && jo.p.c(this.f55607h, v2Var.f55607h);
        }
        return false;
    }

    public String f() {
        return this.f55601b;
    }

    public final String g() {
        return this.f55606g;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f55600a;
    }

    public int hashCode() {
        int hashCode = ((((((((((((getType().hashCode() * 31) + f().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f55606g.hashCode()) * 31;
        String str = this.f55607h;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PlayerLiveCommentCheckProfileBindModel(type=" + getType() + ", liveId=" + f() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", profileImageUrl=" + this.f55606g + ", badgeImageUrl=" + this.f55607h + ')';
    }

    public /* synthetic */ v2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? r2.a.VIEW_TYPE_CHECK_PROFILE : aVar, str, (i11 & 4) != 0 ? -104 : i10, str2, str3, str4, str5, str6);
    }
}
