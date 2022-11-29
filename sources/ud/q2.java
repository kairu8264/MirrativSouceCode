package ud;

import com.dena.mirrorman.net.bcsvr.response.CheerLevelUpCommentBcsvrResponse;
import ud.r2;
import we.g;

/* loaded from: classes2.dex */
public final class q2 implements r2 {

    /* renamed from: p  reason: collision with root package name */
    public static final a f55380p = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final r2.a f55381a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55382b;

    /* renamed from: c  reason: collision with root package name */
    public final int f55383c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55384d;

    /* renamed from: e  reason: collision with root package name */
    public final String f55385e;

    /* renamed from: f  reason: collision with root package name */
    public final String f55386f;

    /* renamed from: g  reason: collision with root package name */
    public final String f55387g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f55388h;

    /* renamed from: i  reason: collision with root package name */
    public final we.g f55389i;

    /* renamed from: j  reason: collision with root package name */
    public final String f55390j;

    /* renamed from: k  reason: collision with root package name */
    public final String f55391k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f55392l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f55393m;

    /* renamed from: n  reason: collision with root package name */
    public final int f55394n;

    /* renamed from: o  reason: collision with root package name */
    public final yd.b f55395o;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q2 a(String str, CheerLevelUpCommentBcsvrResponse cheerLevelUpCommentBcsvrResponse) {
            jo.p.h(str, "liveId");
            jo.p.h(cheerLevelUpCommentBcsvrResponse, "commentData");
            int type = cheerLevelUpCommentBcsvrResponse.getType();
            String userId = cheerLevelUpCommentBcsvrResponse.getUserId();
            String userName = cheerLevelUpCommentBcsvrResponse.getUserName();
            String speech = cheerLevelUpCommentBcsvrResponse.getSpeech();
            String profileImageUrl = cheerLevelUpCommentBcsvrResponse.getProfileImageUrl();
            boolean isYellRankUp = cheerLevelUpCommentBcsvrResponse.isYellRankUp();
            g.a aVar = we.g.Companion;
            we.g a10 = aVar.a(cheerLevelUpCommentBcsvrResponse.getYellRank().getRawValue());
            String valueOf = String.valueOf(cheerLevelUpCommentBcsvrResponse.getYellLevel());
            String yellLpUrl = cheerLevelUpCommentBcsvrResponse.getYellLpUrl();
            boolean z10 = !aVar.a(cheerLevelUpCommentBcsvrResponse.getYellRank().getRawValue()).n();
            we.g a11 = aVar.a(cheerLevelUpCommentBcsvrResponse.getYellRank().getRawValue());
            we.g gVar = we.g.NONE;
            return new q2(null, str, type, userId, userName, speech, profileImageUrl, isYellRankUp, a10, valueOf, yellLpUrl, z10, a11 != gVar, aVar.a(cheerLevelUpCommentBcsvrResponse.getYellRank().getRawValue()) == gVar ? nd.w0.f42242u0 : nd.w0.U0, new yd.b(aVar.a(cheerLevelUpCommentBcsvrResponse.getYellRank().getRawValue()), cheerLevelUpCommentBcsvrResponse.getYellBonusDescription(), cheerLevelUpCommentBcsvrResponse.getYellBonusDescription().length() > 0), 1, null);
        }
    }

    public q2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, boolean z10, we.g gVar, String str6, String str7, boolean z11, boolean z12, int i11, yd.b bVar) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "profileImageUrl");
        jo.p.h(gVar, "yellRank");
        jo.p.h(str6, "yellLevel");
        jo.p.h(str7, "lpUrl");
        jo.p.h(bVar, "bonusDescriptionBindModel");
        this.f55381a = aVar;
        this.f55382b = str;
        this.f55383c = i10;
        this.f55384d = str2;
        this.f55385e = str3;
        this.f55386f = str4;
        this.f55387g = str5;
        this.f55388h = z10;
        this.f55389i = gVar;
        this.f55390j = str6;
        this.f55391k = str7;
        this.f55392l = z11;
        this.f55393m = z12;
        this.f55394n = i11;
        this.f55395o = bVar;
    }

    @Override // ud.r2
    public String a() {
        return this.f55386f;
    }

    public final yd.b b() {
        return this.f55395o;
    }

    @Override // ud.r2
    public String c() {
        return this.f55385e;
    }

    @Override // ud.r2
    public int d() {
        return this.f55383c;
    }

    @Override // ud.r2
    public String e() {
        return this.f55384d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q2) {
            q2 q2Var = (q2) obj;
            return getType() == q2Var.getType() && jo.p.c(f(), q2Var.f()) && d() == q2Var.d() && jo.p.c(e(), q2Var.e()) && jo.p.c(c(), q2Var.c()) && jo.p.c(a(), q2Var.a()) && jo.p.c(this.f55387g, q2Var.f55387g) && this.f55388h == q2Var.f55388h && this.f55389i == q2Var.f55389i && jo.p.c(this.f55390j, q2Var.f55390j) && jo.p.c(this.f55391k, q2Var.f55391k) && this.f55392l == q2Var.f55392l && this.f55393m == q2Var.f55393m && this.f55394n == q2Var.f55394n && jo.p.c(this.f55395o, q2Var.f55395o);
        }
        return false;
    }

    public String f() {
        return this.f55382b;
    }

    public final String g() {
        return this.f55391k;
    }

    @Override // ud.r2
    public r2.a getType() {
        return this.f55381a;
    }

    public final int h() {
        return this.f55394n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((getType().hashCode() * 31) + f().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + this.f55387g.hashCode()) * 31;
        boolean z10 = this.f55388h;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + this.f55389i.hashCode()) * 31) + this.f55390j.hashCode()) * 31) + this.f55391k.hashCode()) * 31;
        boolean z11 = this.f55392l;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        boolean z12 = this.f55393m;
        return ((((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + Integer.hashCode(this.f55394n)) * 31) + this.f55395o.hashCode();
    }

    public final String i() {
        return this.f55387g;
    }

    public final String j() {
        return this.f55390j;
    }

    public final we.g k() {
        return this.f55389i;
    }

    public final boolean l() {
        return this.f55392l;
    }

    public final boolean m() {
        return this.f55393m;
    }

    public final boolean n() {
        return this.f55388h;
    }

    public String toString() {
        return "PlayerCheerLevelUpCommentBindModel(type=" + getType() + ", liveId=" + f() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", profileImageUrl=" + this.f55387g + ", isYellRankUp=" + this.f55388h + ", yellRank=" + this.f55389i + ", yellLevel=" + this.f55390j + ", lpUrl=" + this.f55391k + ", isVisibleAnimation=" + this.f55392l + ", isVisibleShadow=" + this.f55393m + ", messageTextColor=" + this.f55394n + ", bonusDescriptionBindModel=" + this.f55395o + ')';
    }

    public /* synthetic */ q2(r2.a aVar, String str, int i10, String str2, String str3, String str4, String str5, boolean z10, we.g gVar, String str6, String str7, boolean z11, boolean z12, int i11, yd.b bVar, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? r2.a.VIEW_TYPE_CHEER_LEVEL_UP : aVar, str, i10, str2, str3, str4, str5, z10, gVar, str6, str7, z11, z12, i11, bVar);
    }
}
