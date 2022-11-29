package ud;

import com.dena.mirrorman.net.bcsvr.response.Comment;
import ud.r2;

/* loaded from: classes2.dex */
public final class w2 implements r2 {

    /* renamed from: l  reason: collision with root package name */
    public static final a f55640l = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f55641a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55642b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55643c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55644d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55645e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55646f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55647g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55648h;

    /* renamed from: i  reason: collision with root package name */
    public final int f55649i;

    /* renamed from: j  reason: collision with root package name */
    public final we.g f55650j;

    /* renamed from: k  reason: collision with root package name */
    public final String f55651k;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w2 a(String str, Comment comment, String str2) {
            jo.p.h(str, "liveId");
            jo.p.h(comment, "commentData");
            String userName = comment.getUserName();
            String userId = comment.getUserId();
            String str3 = str2 == null ? "" : str2;
            int type = comment.getType();
            String profileImageUrl = comment.getProfileImageUrl();
            String badgeImageUrl = comment.getBadgeImageUrl();
            we.g a10 = we.g.Companion.a(comment.getYellRank());
            String avatarBodyImageUrl = comment.getAvatarBodyImageUrl();
            return new w2(null, str, type, userId, userName, str3, profileImageUrl, badgeImageUrl, 0, a10, avatarBodyImageUrl == null ? "" : avatarBodyImageUrl, 1, null);
        }
    }

    public w2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, int i11, we.g gVar, String str7) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "profileImageUrl");
        jo.p.h(str6, "badgeImageUrl");
        jo.p.h(gVar, "yellRank");
        jo.p.h(str7, "avatarBodyImageUrl");
        this.f55641a = aVar;
        this.f55642b = str;
        this.f55643c = i10;
        this.f55644d = str2;
        this.f55645e = str3;
        this.f55646f = str4;
        this.f55647g = str5;
        this.f55648h = str6;
        this.f55649i = i11;
        this.f55650j = gVar;
        this.f55651k = str7;
    }

    @Override // ud.r2
    public String a() {
        return this.f55646f;
    }

    public final String b() {
        return this.f55651k;
    }

    @Override // ud.r2
    public String c() {
        return this.f55645e;
    }

    @Override // ud.r2
    public int d() {
        return this.f55643c;
    }

    @Override // ud.r2
    public String e() {
        return this.f55644d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w2) {
            w2 w2Var = (w2) obj;
            return getType() == w2Var.getType() && jo.p.c(g(), w2Var.g()) && d() == w2Var.d() && jo.p.c(e(), w2Var.e()) && jo.p.c(c(), w2Var.c()) && jo.p.c(a(), w2Var.a()) && jo.p.c(this.f55647g, w2Var.f55647g) && jo.p.c(this.f55648h, w2Var.f55648h) && this.f55649i == w2Var.f55649i && this.f55650j == w2Var.f55650j && jo.p.c(this.f55651k, w2Var.f55651k);
        }
        return false;
    }

    public final String f() {
        return this.f55648h;
    }

    public String g() {
        return this.f55642b;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f55641a;
    }

    public final String h() {
        return this.f55647g;
    }

    public int hashCode() {
        return (((((((((((((((((((getType().hashCode() * 31) + g().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f55647g.hashCode()) * 31) + this.f55648h.hashCode()) * 31) + Integer.hashCode(this.f55649i)) * 31) + this.f55650j.hashCode()) * 31) + this.f55651k.hashCode();
    }

    public final we.g i() {
        return this.f55650j;
    }

    public String toString() {
        return "PlayerLiveCommentCheerleaderEnterBindModel(type=" + getType() + ", liveId=" + g() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", profileImageUrl=" + this.f55647g + ", badgeImageUrl=" + this.f55648h + ", createdAt=" + this.f55649i + ", yellRank=" + this.f55650j + ", avatarBodyImageUrl=" + this.f55651k + ')';
    }

    public /* synthetic */ w2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, int i11, we.g gVar, String str7, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? r2.a.VIEW_TYPE_CHEERLEADER_ENTER : aVar, str, i10, str2, str3, str4, str5, str6, (i12 & 256) != 0 ? 0 : i11, (i12 & 512) != 0 ? we.g.NONE : gVar, str7);
    }
}
