package ud;

import com.dena.mirrorman.net.bcsvr.response.CheerLevelUpCommentBcsvrResponse;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import ud.d4;
import we.g;

/* loaded from: classes2.dex */
public final class c4 implements d4 {

    /* renamed from: r  reason: collision with root package name */
    public static final a f54835r = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final d4.a f54836a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54837b;

    /* renamed from: c  reason: collision with root package name */
    public final int f54838c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54839d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54840e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54841f;

    /* renamed from: g  reason: collision with root package name */
    public final String f54842g;

    /* renamed from: h  reason: collision with root package name */
    public final String f54843h;

    /* renamed from: i  reason: collision with root package name */
    public final String f54844i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f54845j;

    /* renamed from: k  reason: collision with root package name */
    public final we.g f54846k;

    /* renamed from: l  reason: collision with root package name */
    public final String f54847l;

    /* renamed from: m  reason: collision with root package name */
    public final String f54848m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f54849n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f54850o;

    /* renamed from: p  reason: collision with root package name */
    public final int f54851p;

    /* renamed from: q  reason: collision with root package name */
    public final yd.b f54852q;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c4 a(String str, CheerLevelUpCommentBcsvrResponse cheerLevelUpCommentBcsvrResponse) {
            jo.p.h(str, "liveId");
            jo.p.h(cheerLevelUpCommentBcsvrResponse, "commentData");
            int type = cheerLevelUpCommentBcsvrResponse.getType();
            String userId = cheerLevelUpCommentBcsvrResponse.getUserId();
            String userName = cheerLevelUpCommentBcsvrResponse.getUserName();
            String cm2 = cheerLevelUpCommentBcsvrResponse.getCm();
            String speech = cheerLevelUpCommentBcsvrResponse.getSpeech();
            boolean isYellRankUp = cheerLevelUpCommentBcsvrResponse.isYellRankUp();
            g.a aVar = we.g.Companion;
            we.g a10 = aVar.a(cheerLevelUpCommentBcsvrResponse.getYellRank().getRawValue());
            String valueOf = String.valueOf(cheerLevelUpCommentBcsvrResponse.getYellLevel());
            String profileImageUrl = cheerLevelUpCommentBcsvrResponse.getProfileImageUrl();
            String yellLpUrl = cheerLevelUpCommentBcsvrResponse.getYellLpUrl();
            boolean z10 = !aVar.a(cheerLevelUpCommentBcsvrResponse.getYellRank().getRawValue()).n();
            we.g a11 = aVar.a(cheerLevelUpCommentBcsvrResponse.getYellRank().getRawValue());
            we.g gVar = we.g.NONE;
            return new c4(null, str, type, userId, userName, cm2, speech, profileImageUrl, null, isYellRankUp, a10, valueOf, yellLpUrl, z10, a11 != gVar, aVar.a(cheerLevelUpCommentBcsvrResponse.getYellRank().getRawValue()) == gVar ? nd.w0.f42242u0 : nd.w0.U0, new yd.b(aVar.a(cheerLevelUpCommentBcsvrResponse.getYellRank().getRawValue()), cheerLevelUpCommentBcsvrResponse.getYellBonusDescription(), cheerLevelUpCommentBcsvrResponse.getYellBonusDescription().length() > 0), TsExtractor.TS_STREAM_TYPE_AIT, null);
        }
    }

    public c4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, we.g gVar, String str8, String str9, boolean z11, boolean z12, int i11, yd.b bVar) {
        jo.p.h(aVar, "type");
        jo.p.h(str, "liveId");
        jo.p.h(str2, "userId");
        jo.p.h(str3, "userName");
        jo.p.h(str4, "message");
        jo.p.h(str5, "speechMessage");
        jo.p.h(str6, "profileImageUrl");
        jo.p.h(str7, "badgeImageUrl");
        jo.p.h(gVar, "yellRank");
        jo.p.h(str8, "yellLevel");
        jo.p.h(str9, "lpUrl");
        jo.p.h(bVar, "bonusDescriptionBindModel");
        this.f54836a = aVar;
        this.f54837b = str;
        this.f54838c = i10;
        this.f54839d = str2;
        this.f54840e = str3;
        this.f54841f = str4;
        this.f54842g = str5;
        this.f54843h = str6;
        this.f54844i = str7;
        this.f54845j = z10;
        this.f54846k = gVar;
        this.f54847l = str8;
        this.f54848m = str9;
        this.f54849n = z11;
        this.f54850o = z12;
        this.f54851p = i11;
        this.f54852q = bVar;
    }

    @Override // ud.d4
    public String a() {
        return this.f54841f;
    }

    @Override // ud.d4
    public String b() {
        return this.f54837b;
    }

    @Override // ud.d4
    public String c() {
        return this.f54840e;
    }

    @Override // ud.d4
    public int d() {
        return this.f54838c;
    }

    @Override // ud.d4
    public String e() {
        return this.f54839d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c4) {
            c4 c4Var = (c4) obj;
            return getType() == c4Var.getType() && jo.p.c(b(), c4Var.b()) && d() == c4Var.d() && jo.p.c(e(), c4Var.e()) && jo.p.c(c(), c4Var.c()) && jo.p.c(a(), c4Var.a()) && jo.p.c(h(), c4Var.h()) && jo.p.c(f(), c4Var.f()) && jo.p.c(g(), c4Var.g()) && this.f54845j == c4Var.f54845j && this.f54846k == c4Var.f54846k && jo.p.c(this.f54847l, c4Var.f54847l) && jo.p.c(this.f54848m, c4Var.f54848m) && this.f54849n == c4Var.f54849n && this.f54850o == c4Var.f54850o && this.f54851p == c4Var.f54851p && jo.p.c(this.f54852q, c4Var.f54852q);
        }
        return false;
    }

    @Override // ud.d4
    public String f() {
        return this.f54843h;
    }

    @Override // ud.d4
    public String g() {
        return this.f54844i;
    }

    @Override // ud.d4
    public d4.a getType() {
        return this.f54836a;
    }

    @Override // ud.d4
    public String h() {
        return this.f54842g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((getType().hashCode() * 31) + b().hashCode()) * 31) + Integer.hashCode(d())) * 31) + e().hashCode()) * 31) + c().hashCode()) * 31) + a().hashCode()) * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode()) * 31;
        boolean z10 = this.f54845j;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + this.f54846k.hashCode()) * 31) + this.f54847l.hashCode()) * 31) + this.f54848m.hashCode()) * 31;
        boolean z11 = this.f54849n;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        boolean z12 = this.f54850o;
        return ((((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + Integer.hashCode(this.f54851p)) * 31) + this.f54852q.hashCode();
    }

    public final yd.b i() {
        return this.f54852q;
    }

    public final String j() {
        return this.f54848m;
    }

    public final int k() {
        return this.f54851p;
    }

    public final String l() {
        return this.f54847l;
    }

    public final we.g m() {
        return this.f54846k;
    }

    public final boolean n() {
        return this.f54849n;
    }

    public final boolean o() {
        return this.f54850o;
    }

    public final boolean p() {
        return this.f54845j;
    }

    public String toString() {
        return "StreamingCheerLevelUpCommentBindModel(type=" + getType() + ", liveId=" + b() + ", commentType=" + d() + ", userId=" + e() + ", userName=" + c() + ", message=" + a() + ", speechMessage=" + h() + ", profileImageUrl=" + f() + ", badgeImageUrl=" + g() + ", isYellRankUp=" + this.f54845j + ", yellRank=" + this.f54846k + ", yellLevel=" + this.f54847l + ", lpUrl=" + this.f54848m + ", isVisibleAnimation=" + this.f54849n + ", isVisibleShadow=" + this.f54850o + ", messageTextColor=" + this.f54851p + ", bonusDescriptionBindModel=" + this.f54852q + ')';
    }

    public /* synthetic */ c4(d4.a aVar, String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, we.g gVar, String str8, String str9, boolean z11, boolean z12, int i11, yd.b bVar, int i12, jo.h hVar) {
        this((i12 & 1) != 0 ? d4.a.VIEW_TYPE_CHEER_LEVEL_UP : aVar, str, i10, str2, str3, str4, str5, str6, (i12 & 256) != 0 ? "" : str7, z10, gVar, str8, str9, z11, z12, i11, bVar);
    }
}
