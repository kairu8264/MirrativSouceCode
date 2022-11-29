package ud;

import android.content.Context;
import ud.d4;

/* loaded from: classes2.dex */
public final class s4 implements d4 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f55489j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55490a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55491b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55492c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55493d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55494e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55495f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55496g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55497h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55498i;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s4 a(Context context, String str, String str2, String str3, String str4) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            jo.p.h(str4, "profileImageUrl");
            return new s4(null, str, 0, str2, str3, str3 + context.getString(nd.f1.text_shooter_matching_bot_comment), null, str4, null, 325, null);
        }
    }

    public s4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        this.f55490a = aVar;
        this.f55491b = str;
        this.f55492c = i10;
        this.f55493d = str2;
        this.f55494e = str3;
        this.f55495f = str4;
        this.f55496g = str5;
        this.f55497h = str6;
        this.f55498i = str7;
    }

    @Override // ud.d4
    public String a() {
        return this.f55495f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55491b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55494e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55492c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55493d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s4) {
            s4 s4Var = (s4) obj;
            return getType() == s4Var.getType() && jo.p.c(b(), s4Var.b()) && d() == s4Var.d() && jo.p.c(e(), s4Var.e()) && jo.p.c(c(), s4Var.c()) && jo.p.c(a(), s4Var.a()) && jo.p.c(h(), s4Var.h()) && jo.p.c(f(), s4Var.f()) && jo.p.c(g(), s4Var.g());
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55497h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55498i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55490a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55496g;
    }

    public int hashCode() {
        return (((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    public String toString() {
        return "StreamingLiveCommentShooterMatchingViewerEnterBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ')';
    }

    public /* synthetic */ s4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_SHOOTER_MATCHING_VIEWER_ENTER : aVar, str, (i11 & 4) != 0 ? 106 : i10, str2, str3, str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? "" : str7);
    }
}
