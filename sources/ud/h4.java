package ud;

import com.dena.mirrorman.net.bcsvr.response.Comment;
import ud.d4;

/* loaded from: classes2.dex */
public final class h4 implements d4 {

    /* renamed from: m  reason: collision with root package name */
    public static final a f55003m = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f55004a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55005b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55006c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55007d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55008e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55009f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55010g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55011h;

    /* renamed from: i  reason: collision with root package name */
    public final String f55012i;

    /* renamed from: j  reason: collision with root package name */
    public final int f55013j;

    /* renamed from: k  reason: collision with root package name */
    public final we.g f55014k;

    /* renamed from: l  reason: collision with root package name */
    public final String f55015l;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final h4 a(String str, Comment comment, String str2) {
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
            return new h4(null, str, type, userId, userName, str3, null, profileImageUrl, badgeImageUrl, 0, a10, avatarBodyImageUrl == null ? "" : avatarBodyImageUrl, 65, null);
        }
    }

    public h4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, int i11, we.g gVar, String str8) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        jo.p.h(gVar, "yellRank");
        jo.p.h(str8, "avatarBodyImageUrl");
        this.f55004a = aVar;
        this.f55005b = str;
        this.f55006c = i10;
        this.f55007d = str2;
        this.f55008e = str3;
        this.f55009f = str4;
        this.f55010g = str5;
        this.f55011h = str6;
        this.f55012i = str7;
        this.f55013j = i11;
        this.f55014k = gVar;
        this.f55015l = str8;
    }

    @Override // ud.d4
    public String a() {
        return this.f55009f;
    }

    @Override // ud.d4
    public String b() {
        return this.f55005b;
    }

    @Override // ud.d4
    public String c() {
        return this.f55008e;
    }

    @Override // ud.d4
    public int d() {
        return this.f55006c;
    }

    @Override // ud.d4
    public String e() {
        return this.f55007d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h4) {
            h4 h4Var = (h4) obj;
            return getType() == h4Var.getType() && jo.p.c(b(), h4Var.b()) && d() == h4Var.d() && jo.p.c(e(), h4Var.e()) && jo.p.c(c(), h4Var.c()) && jo.p.c(a(), h4Var.a()) && jo.p.c(h(), h4Var.h()) && jo.p.c(f(), h4Var.f()) && jo.p.c(g(), h4Var.g()) && this.f55013j == h4Var.f55013j && this.f55014k == h4Var.f55014k && jo.p.c(this.f55015l, h4Var.f55015l);
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f55011h;
    }

    @Override // ud.d4
    public String g() {
        return this.f55012i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f55004a;
    }

    @Override // ud.d4
    public String h() {
        return this.f55010g;
    }

    public int hashCode() {
        return (((((((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31) + Integer.hashCode(this.f55013j)) * 31) + this.f55014k.hashCode()) * 31) + this.f55015l.hashCode();
    }

    public final String i() {
        return this.f55015l;
    }

    public final we.g j() {
        return this.f55014k;
    }

    public String toString() {
        return "StreamingLiveCommentCheerleaderEnterBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", createdAt=" + this.f55013j + ", yellRank=" + this.f55014k + ", avatarBodyImageUrl=" + this.f55015l + ')';
    }

    public /* synthetic */ h4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, int i11, we.g gVar, String str8, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? d4.a.VIEW_TYPE_CHEERLEADER_ENTER : aVar, str, i10, str2, str3, str4, (i12 & 64) != 0 ? "" : str5, str6, str7, (i12 & 512) != 0 ? 0 : i11, (i12 & 1024) != 0 ? we.g.NONE : gVar, str8);
    }
}
