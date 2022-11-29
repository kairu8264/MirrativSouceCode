package ud;

import android.content.Context;
import com.dena.mirrorman.net.bcsvr.response.CommentAppUserDetail;
import ud.d4;

/* loaded from: classes2.dex */
public final class e4 implements d4 {

    /* renamed from: l  reason: collision with root package name */
    public static final a f54891l = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f54892a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54893b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54894c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54895d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54896e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54897f;

    /* renamed from: g  reason: collision with root package name */
    public final String f54898g;

    /* renamed from: h  reason: collision with root package name */
    public final String f54899h;

    /* renamed from: i  reason: collision with root package name */
    public final String f54900i;

    /* renamed from: j  reason: collision with root package name */
    public final String f54901j;

    /* renamed from: k  reason: collision with root package name */
    public final jf.a f54902k;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: ud.e4$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0864a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f54903a;

            static {
                int[] iArr = new int[jf.a.values().length];
                iArr[jf.a.GAME_ID.ordinal()] = 1;
                iArr[jf.a.URL.ordinal()] = 2;
                f54903a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e4 a(Context context, String str, CommentAppUserDetail commentAppUserDetail) {
            String string;
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(commentAppUserDetail, "appUserDetail");
            jf.a a10 = jf.a.Companion.a(commentAppUserDetail.getType());
            String userId = commentAppUserDetail.getUserId();
            String string2 = context.getString(nd.f1.text_view_game_id_comment_user, commentAppUserDetail.getUserName());
            String profileImageUrl = commentAppUserDetail.getProfileImageUrl();
            String badgeImageUrl = commentAppUserDetail.getBadgeImageUrl();
            int i10 = C0864a.f54903a[a10.ordinal()];
            if (i10 != 1) {
                string = i10 != 2 ? "" : context.getString(nd.f1.text_view_game_url);
            } else {
                string = context.getString(nd.f1.text_view_game_id);
            }
            String str2 = string;
            String appUserId = commentAppUserDetail.getAppUserId();
            jo.p.g(string2, "getString(R.string.text_…, appUserDetail.userName)");
            jo.p.g(str2, "when (appUserDetailType)…e -> \"\"\n                }");
            return new e4(null, str, 49, userId, string2, appUserId, null, profileImageUrl, badgeImageUrl, str2, a10, 65, null);
        }
    }

    public e4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, jf.a aVar2) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        jo.p.h(str8, "messageLabelText");
        jo.p.h(aVar2, "appUserDetailType");
        this.f54892a = aVar;
        this.f54893b = str;
        this.f54894c = i10;
        this.f54895d = str2;
        this.f54896e = str3;
        this.f54897f = str4;
        this.f54898g = str5;
        this.f54899h = str6;
        this.f54900i = str7;
        this.f54901j = str8;
        this.f54902k = aVar2;
    }

    @Override // ud.d4
    public String a() {
        return this.f54897f;
    }

    @Override // ud.d4
    public String b() {
        return this.f54893b;
    }

    @Override // ud.d4
    public String c() {
        return this.f54896e;
    }

    @Override // ud.d4
    public int d() {
        return this.f54894c;
    }

    @Override // ud.d4
    public String e() {
        return this.f54895d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e4) {
            e4 e4Var = (e4) obj;
            return getType() == e4Var.getType() && jo.p.c(b(), e4Var.b()) && d() == e4Var.d() && jo.p.c(e(), e4Var.e()) && jo.p.c(c(), e4Var.c()) && jo.p.c(a(), e4Var.a()) && jo.p.c(h(), e4Var.h()) && jo.p.c(f(), e4Var.f()) && jo.p.c(g(), e4Var.g()) && jo.p.c(this.f54901j, e4Var.f54901j) && this.f54902k == e4Var.f54902k;
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f54899h;
    }

    @Override // ud.d4
    public String g() {
        return this.f54900i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f54892a;
    }

    @Override // ud.d4
    public String h() {
        return this.f54898g;
    }

    public int hashCode() {
        return (((((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31) + this.f54901j.hashCode()) * 31) + this.f54902k.hashCode();
    }

    public final jf.a i() {
        return this.f54902k;
    }

    public final String j() {
        return this.f54901j;
    }

    public String toString() {
        return "StreamingLiveCommentAppUsedIdBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", messageLabelText=" + this.f54901j + ", appUserDetailType=" + this.f54902k + ')';
    }

    public /* synthetic */ e4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, jf.a aVar2, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? d4.a.VIEW_TYPE_APP_USED_ID : aVar, str, i10, str2, str3, str4, (i11 & 64) != 0 ? "" : str5, str6, str7, str8, aVar2);
    }
}
