package ud;

import com.dena.mirrorman.net.bcsvr.response.Comment;
import ud.d4;

/* loaded from: classes2.dex */
public final class f4 implements d4 {

    /* renamed from: p  reason: collision with root package name */
    public static final a f54931p = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f54932a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54933b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54934c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54935d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54936e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54937f;

    /* renamed from: g  reason: collision with root package name */
    public final String f54938g;

    /* renamed from: h  reason: collision with root package name */
    public final String f54939h;

    /* renamed from: i  reason: collision with root package name */
    public final String f54940i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f54941j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f54942k;

    /* renamed from: l  reason: collision with root package name */
    public final int f54943l;

    /* renamed from: m  reason: collision with root package name */
    public final String f54944m;

    /* renamed from: n  reason: collision with root package name */
    public final we.g f54945n;

    /* renamed from: o  reason: collision with root package name */
    public final int f54946o;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f4 a(String str, Comment comment, String str2) {
            jo.p.h(str, "liveId");
            jo.p.h(comment, "commentData");
            return new f4(null, str, comment.getType(), comment.getUserId(), comment.getUserName(), str2 == null ? "" : str2, null, comment.getProfileImageUrl(), comment.getBadgeImageUrl(), comment.isCheerleader(), comment.isModerator(), 0, comment.getCollabStreamerUserName(), we.g.Companion.a(comment.getYellRank()), comment.getYellLevel(), 65, null);
        }

        public final f4 b(String str, String str2, String str3, String str4, int i10, String str5, String str6) {
            jo.p.h(str, "liveId");
            jo.p.h(str2, "userName");
            jo.p.h(str3, "userId");
            jo.p.h(str4, "message");
            jo.p.h(str5, "profileImageUrl");
            jo.p.h(str6, "badgeImageUrl");
            return new f4(null, str, i10, str3, str2, str4, null, str5, str6, false, false, 0, "", null, 0, 24641, null);
        }
    }

    public f4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, int i11, String str8, we.g gVar, int i12) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        jo.p.h(gVar, "yellRank");
        this.f54932a = aVar;
        this.f54933b = str;
        this.f54934c = i10;
        this.f54935d = str2;
        this.f54936e = str3;
        this.f54937f = str4;
        this.f54938g = str5;
        this.f54939h = str6;
        this.f54940i = str7;
        this.f54941j = z10;
        this.f54942k = z11;
        this.f54943l = i11;
        this.f54944m = str8;
        this.f54945n = gVar;
        this.f54946o = i12;
    }

    @Override // ud.d4
    public String a() {
        return this.f54937f;
    }

    @Override // ud.d4
    public String b() {
        return this.f54933b;
    }

    @Override // ud.d4
    public String c() {
        return this.f54936e;
    }

    @Override // ud.d4
    public int d() {
        return this.f54934c;
    }

    @Override // ud.d4
    public String e() {
        return this.f54935d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f4) {
            f4 f4Var = (f4) obj;
            return getType() == f4Var.getType() && jo.p.c(b(), f4Var.b()) && d() == f4Var.d() && jo.p.c(e(), f4Var.e()) && jo.p.c(c(), f4Var.c()) && jo.p.c(a(), f4Var.a()) && jo.p.c(h(), f4Var.h()) && jo.p.c(f(), f4Var.f()) && jo.p.c(g(), f4Var.g()) && this.f54941j == f4Var.f54941j && this.f54942k == f4Var.f54942k && this.f54943l == f4Var.f54943l && jo.p.c(this.f54944m, f4Var.f54944m) && this.f54945n == f4Var.f54945n && this.f54946o == f4Var.f54946o;
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f54939h;
    }

    @Override // ud.d4
    public String g() {
        return this.f54940i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f54932a;
    }

    @Override // ud.d4
    public String h() {
        return this.f54938g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31;
        boolean z10 = this.f54941j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f54942k;
        int hashCode2 = (((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + Integer.hashCode(this.f54943l)) * 31;
        String str = this.f54944m;
        return ((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f54945n.hashCode()) * 31) + Integer.hashCode(this.f54946o);
    }

    public final int i() {
        return this.f54946o;
    }

    public final we.g j() {
        return this.f54945n;
    }

    public final boolean k() {
        return this.f54941j;
    }

    public final boolean l() {
        return this.f54942k;
    }

    public final boolean m() {
        String str = this.f54944m;
        if (str != null) {
            if (str.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "StreamingLiveCommentBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", isCheerleader=" + this.f54941j + ", isModerator=" + this.f54942k + ", createdAt=" + this.f54943l + ", collabStreamerUserName=" + this.f54944m + ", yellRank=" + this.f54945n + ", yellLevel=" + this.f54946o + ')';
    }

    public /* synthetic */ f4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, int i11, String str8, we.g gVar, int i12, int i13, jo.h hVar) {
        this((i13 & 1) != 0 ? d4.a.VIEW_TYPE_COMMENT : aVar, str, i10, str2, str3, str4, (i13 & 64) != 0 ? "" : str5, str6, str7, (i13 & 512) != 0 ? false : z10, (i13 & 1024) != 0 ? false : z11, (i13 & 2048) != 0 ? 0 : i11, (i13 & 4096) != 0 ? null : str8, (i13 & 8192) != 0 ? we.g.NONE : gVar, (i13 & 16384) != 0 ? 0 : i12);
    }
}
