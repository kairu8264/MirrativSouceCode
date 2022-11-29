package ud;

import android.content.Context;
import ud.d4;

/* loaded from: classes2.dex */
public final class u4 implements d4 {

    /* renamed from: k  reason: collision with root package name */
    public static final a f55574k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55575a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55576b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55577c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55578d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55579e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55580f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55581g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55582h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55583i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f55584j;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u4 a(Context context, String str, String str2, String str3, String str4, String str5, boolean z10) {
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(str2, "userId");
            jo.p.h(str3, "userName");
            jo.p.h(str4, "profileImageUrl");
            jo.p.h(str5, "badgeImageUrl");
            String string = context.getResources().getString(nd.f1.text_share_live, str3);
            jo.p.g(string, "context.resources.getStr…ext_share_live, userName)");
            return new u4(null, str, 0, str2, str3, string, null, str4, str5, z10, 69, null);
        }
    }

    public u4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        this.f55575a = aVar;
        this.f55576b = str;
        this.f55577c = i10;
        this.f55578d = str2;
        this.f55579e = str3;
        this.f55580f = str4;
        this.f55581g = str5;
        this.f55582h = str6;
        this.f55583i = str7;
        this.f55584j = z10;
    }

    @Override // ud.d4
    public String a() {
        return this.f55580f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55576b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55579e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55577c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55578d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u4) {
            u4 u4Var = (u4) obj;
            return getType() == u4Var.getType() && jo.p.c(b(), u4Var.b()) && d() == u4Var.d() && jo.p.c(e(), u4Var.e()) && jo.p.c(c(), u4Var.c()) && jo.p.c(a(), u4Var.a()) && jo.p.c(h(), u4Var.h()) && jo.p.c(f(), u4Var.f()) && jo.p.c(g(), u4Var.g()) && this.f55584j == u4Var.f55584j;
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55582h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55583i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55575a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55581g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31;
        boolean z10 = this.f55584j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean i() {
        return this.f55584j;
    }

    public String toString() {
        return "StreamingLiveCommentUrlSharedBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", isModerator=" + this.f55584j + ')';
    }

    public /* synthetic */ u4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_URL_SHARED : aVar, str, (i11 & 4) != 0 ? 16 : i10, str2, str3, str4, (i11 & 64) != 0 ? "" : str5, (i11 & 128) != 0 ? "" : str6, (i11 & 256) != 0 ? "" : str7, (i11 & 512) != 0 ? false : z10);
    }
}
