package ud;

import android.content.Context;
import com.dena.mirrorman.net.bcsvr.response.CommentAppUserDetail;
import ud.r2;

/* loaded from: classes2.dex */
public final class s2 implements r2 {

    /* renamed from: k  reason: collision with root package name */
    public static final a f55476k = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f55477a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55478b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55479c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55480d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55481e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55482f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55483g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55484h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55485i;

    /* renamed from: j  reason: collision with root package name */
    public final jf.a f55486j;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: ud.s2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0867a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f55487a;

            static {
                int[] iArr = new int[jf.a.values().length];
                iArr[jf.a.GAME_ID.ordinal()] = 1;
                iArr[jf.a.URL.ordinal()] = 2;
                f55487a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s2 a(Context context, String str, CommentAppUserDetail commentAppUserDetail) {
            String string;
            jo.p.h(context, "context");
            jo.p.h(str, "liveId");
            jo.p.h(commentAppUserDetail, "appUserDetail");
            jf.a a10 = jf.a.Companion.a(commentAppUserDetail.getType());
            String userId = commentAppUserDetail.getUserId();
            String string2 = context.getString(nd.f1.text_view_game_id_comment_user, commentAppUserDetail.getUserName());
            String profileImageUrl = commentAppUserDetail.getProfileImageUrl();
            String badgeImageUrl = commentAppUserDetail.getBadgeImageUrl();
            int i10 = C0867a.f55487a[a10.ordinal()];
            if (i10 != 1) {
                string = i10 != 2 ? "" : context.getString(nd.f1.text_view_game_url);
            } else {
                string = context.getString(nd.f1.text_view_game_id);
            }
            String str2 = string;
            String appUserId = commentAppUserDetail.getAppUserId();
            jo.p.g(string2, "getString(R.string.text_…, appUserDetail.userName)");
            jo.p.g(str2, "when (appUserDetailType)…e -> \"\"\n                }");
            return new s2(null, str, 49, userId, string2, appUserId, profileImageUrl, badgeImageUrl, str2, a10, 1, null);
        }
    }

    public s2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, jf.a aVar2) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "profileImageUrl");
        jo.p.h(str7, "messageLabelText");
        jo.p.h(aVar2, "appUserDetailType");
        this.f55477a = aVar;
        this.f55478b = str;
        this.f55479c = i10;
        this.f55480d = str2;
        this.f55481e = str3;
        this.f55482f = str4;
        this.f55483g = str5;
        this.f55484h = str6;
        this.f55485i = str7;
        this.f55486j = aVar2;
    }

    @Override // ud.r2
    public String a() {
        return this.f55482f;
    }

    public final jf.a b() {
        return this.f55486j;
    }

    @Override // ud.r2
    public String c() {
        return this.f55481e;
    }

    @Override // ud.r2
    public int d() {
        return this.f55479c;
    }

    @Override // ud.r2
    public String e() {
        return this.f55480d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s2) {
            s2 s2Var = (s2) obj;
            return getType() == s2Var.getType() && jo.p.c(g(), s2Var.g()) && d() == s2Var.d() && jo.p.c(e(), s2Var.e()) && jo.p.c(c(), s2Var.c()) && jo.p.c(a(), s2Var.a()) && jo.p.c(this.f55483g, s2Var.f55483g) && jo.p.c(this.f55484h, s2Var.f55484h) && jo.p.c(this.f55485i, s2Var.f55485i) && this.f55486j == s2Var.f55486j;
        }
        return false;
    }

    public final String f() {
        return this.f55484h;
    }

    public String g() {
        return this.f55478b;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f55477a;
    }

    public final String h() {
        return this.f55485i;
    }

    public int hashCode() {
        int hashCode = ((((((((((((getType().hashCode() * 31) + g().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f55483g.hashCode()) * 31;
        String str = this.f55484h;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f55485i.hashCode()) * 31) + this.f55486j.hashCode();
    }

    public final String i() {
        return this.f55483g;
    }

    public String toString() {
        return "PlayerLiveCommentAppUsedIdBindModel(type=" + getType() + ", liveId=" + g() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", profileImageUrl=" + this.f55483g + ", badgeImageUrl=" + this.f55484h + ", messageLabelText=" + this.f55485i + ", appUserDetailType=" + this.f55486j + ')';
    }

    public /* synthetic */ s2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, jf.a aVar2, int i11, jo.h hVar) {
        this((i11 & 1) != 0 ? r2.a.VIEW_TYPE_APP_USED_ID : aVar, str, i10, str2, str3, str4, str5, str6, str7, aVar2);
    }
}
