package ud;

import com.dena.mirrorman.net.bcsvr.response.Comment;
import ud.r2;

/* loaded from: classes2.dex */
public final class t2 implements r2 {

    /* renamed from: o  reason: collision with root package name */
    public static final a f55515o = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f55516a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55517b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55518c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55519d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55520e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55521f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55522g;

    /* renamed from: h  reason: collision with root package name */
    public final String f55523h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f55524i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f55525j;

    /* renamed from: k  reason: collision with root package name */
    public final int f55526k;

    /* renamed from: l  reason: collision with root package name */
    public final String f55527l;

    /* renamed from: m  reason: collision with root package name */
    public final we.g f55528m;

    /* renamed from: n  reason: collision with root package name */
    public final int f55529n;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t2 a(String str, Comment comment, String str2) {
            jo.p.h(str, "liveId");
            jo.p.h(comment, "commentData");
            String userName = comment.getUserName();
            return new t2(null, str, comment.getType(), comment.getUserId(), userName, str2 == null ? "" : str2, comment.getProfileImageUrl(), comment.getBadgeImageUrl(), comment.isCheerleader(), comment.isModerator(), 0, comment.getCollabStreamerUserName(), we.g.Companion.a(comment.getYellRank()), comment.getYellLevel(), 1, null);
        }
    }

    public t2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, int i11, String str7, we.g gVar, int i12) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "profileImageUrl");
        jo.p.h(gVar, "yellRank");
        this.f55516a = aVar;
        this.f55517b = str;
        this.f55518c = i10;
        this.f55519d = str2;
        this.f55520e = str3;
        this.f55521f = str4;
        this.f55522g = str5;
        this.f55523h = str6;
        this.f55524i = z10;
        this.f55525j = z11;
        this.f55526k = i11;
        this.f55527l = str7;
        this.f55528m = gVar;
        this.f55529n = i12;
    }

    @Override // ud.r2
    public String a() {
        return this.f55521f;
    }

    public final String b() {
        return this.f55523h;
    }

    @Override // ud.r2
    public String c() {
        return this.f55520e;
    }

    @Override // ud.r2
    public int d() {
        return this.f55518c;
    }

    @Override // ud.r2
    public String e() {
        return this.f55519d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t2) {
            t2 t2Var = (t2) obj;
            return getType() == t2Var.getType() && jo.p.c(g(), t2Var.g()) && d() == t2Var.d() && jo.p.c(e(), t2Var.e()) && jo.p.c(c(), t2Var.c()) && jo.p.c(a(), t2Var.a()) && jo.p.c(this.f55522g, t2Var.f55522g) && jo.p.c(this.f55523h, t2Var.f55523h) && this.f55524i == t2Var.f55524i && this.f55525j == t2Var.f55525j && this.f55526k == t2Var.f55526k && jo.p.c(this.f55527l, t2Var.f55527l) && this.f55528m == t2Var.f55528m && this.f55529n == t2Var.f55529n;
        }
        return false;
    }

    public final int f() {
        return this.f55526k;
    }

    public String g() {
        return this.f55517b;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f55516a;
    }

    public final String h() {
        return this.f55522g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((getType().hashCode() * 31) + g().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f55522g.hashCode()) * 31;
        String str = this.f55523h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.f55524i;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.f55525j;
        int hashCode3 = (((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.f55526k)) * 31;
        String str2 = this.f55527l;
        return ((((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f55528m.hashCode()) * 31) + Integer.hashCode(this.f55529n);
    }

    public final int i() {
        return this.f55529n;
    }

    public final we.g j() {
        return this.f55528m;
    }

    public final boolean k() {
        return this.f55524i;
    }

    public final boolean l() {
        return this.f55525j;
    }

    public String toString() {
        return "PlayerLiveCommentBindModel(type=" + getType() + ", liveId=" + g() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", profileImageUrl=" + this.f55522g + ", badgeImageUrl=" + this.f55523h + ", isCheerleader=" + this.f55524i + ", isModerator=" + this.f55525j + ", createdAt=" + this.f55526k + ", collabStreamerUserName=" + this.f55527l + ", yellRank=" + this.f55528m + ", yellLevel=" + this.f55529n + ')';
    }

    public /* synthetic */ t2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, int i11, String str7, we.g gVar, int i12, int i13, jo.h hVar) {
        this((i13 & 1) != 0 ? r2.a.VIEW_TYPE_COMMENT : aVar, str, i10, str2, str3, str4, str5, str6, (i13 & 256) != 0 ? false : z10, (i13 & 512) != 0 ? false : z11, (i13 & 1024) != 0 ? 0 : i11, (i13 & 2048) != 0 ? null : str7, (i13 & 4096) != 0 ? we.g.NONE : gVar, (i13 & 8192) != 0 ? 0 : i12);
    }
}
