package ud;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.dena.mirrorman.net.api.response.live.SeasonYellStatusResponse;
import com.dena.mirrorman.net.api.response.live.YellStatusCondition;
import ud.z4;

/* loaded from: classes2.dex */
public final class y4 {

    /* renamed from: x  reason: collision with root package name */
    public static final a f55768x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f55769y = 8;

    /* renamed from: a  reason: collision with root package name */
    public final we.g f55770a;

    /* renamed from: b  reason: collision with root package name */
    public final String f55771b;

    /* renamed from: c  reason: collision with root package name */
    public final Spannable f55772c;

    /* renamed from: d  reason: collision with root package name */
    public final String f55773d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f55774e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f55775f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f55776g;

    /* renamed from: h  reason: collision with root package name */
    public final float f55777h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f55778i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f55779j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f55780k;

    /* renamed from: l  reason: collision with root package name */
    public final z4 f55781l;

    /* renamed from: m  reason: collision with root package name */
    public final z4 f55782m;

    /* renamed from: n  reason: collision with root package name */
    public final z4 f55783n;

    /* renamed from: o  reason: collision with root package name */
    public final z4 f55784o;

    /* renamed from: p  reason: collision with root package name */
    public final z4 f55785p;

    /* renamed from: q  reason: collision with root package name */
    public final z4 f55786q;

    /* renamed from: r  reason: collision with root package name */
    public final z4 f55787r;

    /* renamed from: s  reason: collision with root package name */
    public final z4 f55788s;

    /* renamed from: t  reason: collision with root package name */
    public final z4 f55789t;

    /* renamed from: u  reason: collision with root package name */
    public final z4 f55790u;

    /* renamed from: v  reason: collision with root package name */
    public final z4 f55791v;

    /* renamed from: w  reason: collision with root package name */
    public final z4 f55792w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        @SuppressLint({"SimpleDateFormat"})
        public final y4 a(SeasonYellStatusResponse seasonYellStatusResponse, Resources resources, String str, boolean z10) {
            jo.p.h(seasonYellStatusResponse, "response");
            jo.p.h(resources, "resources");
            jo.p.h(str, "liveOwnerName");
            we.g a10 = we.g.Companion.a(seasonYellStatusResponse.getYellStatus().getRank());
            YellStatusCondition currentState = seasonYellStatusResponse.getYellStatus().getCurrentState();
            int giftScore = currentState != null ? currentState.getGiftScore() : 0;
            int commentCount = currentState != null ? currentState.getCommentCount() : 0;
            int totalViewingTime = currentState != null ? currentState.getTotalViewingTime() : 0;
            int totalViewDays = currentState != null ? currentState.getTotalViewDays() : 0;
            YellStatusCondition nextCondition1 = seasonYellStatusResponse.getYellStatus().getNextCondition1();
            YellStatusCondition nextCondition2 = seasonYellStatusResponse.getYellStatus().getNextCondition2();
            YellStatusCondition nextCondition3 = seasonYellStatusResponse.getYellStatus().getNextCondition3();
            int giftScore2 = nextCondition1 != null ? nextCondition1.getGiftScore() : 0;
            int commentCount2 = nextCondition1 != null ? nextCondition1.getCommentCount() : 0;
            int totalViewingTime2 = nextCondition1 != null ? nextCondition1.getTotalViewingTime() : 0;
            int totalViewDays2 = nextCondition1 != null ? nextCondition1.getTotalViewDays() : 0;
            int giftScore3 = nextCondition2 != null ? nextCondition2.getGiftScore() : 0;
            int commentCount3 = nextCondition2 != null ? nextCondition2.getCommentCount() : 0;
            int totalViewingTime3 = nextCondition2 != null ? nextCondition2.getTotalViewingTime() : 0;
            int totalViewDays3 = nextCondition2 != null ? nextCondition2.getTotalViewDays() : 0;
            int giftScore4 = nextCondition3 != null ? nextCondition3.getGiftScore() : 0;
            int commentCount4 = nextCondition3 != null ? nextCondition3.getCommentCount() : 0;
            int totalViewingTime4 = nextCondition3 != null ? nextCondition3.getTotalViewingTime() : 0;
            int totalViewDays4 = nextCondition3 != null ? nextCondition3.getTotalViewDays() : 0;
            boolean z11 = z10 || a10 != we.g.NONE;
            String valueOf = String.valueOf(seasonYellStatusResponse.getYellStatus().getLevel());
            SpannableString spannableString = new SpannableString(seasonYellStatusResponse.getYellStatus().getDescription());
            String string = resources.getString(nd.f1.text_emomo_photo_gift_name, str);
            jo.p.g(string, "resources.getString(R.st…gift_name, liveOwnerName)");
            if (so.o.U(spannableString, string, 0, false, 6, null) != -1) {
                spannableString.setSpan(new StyleSpan(1), so.o.U(spannableString, string, 0, false, 6, null), so.o.U(spannableString, string, 0, false, 6, null) + string.length(), 33);
            }
            wn.v vVar = wn.v.f59242a;
            String yellLpUrl = seasonYellStatusResponse.getYellLpUrl();
            boolean z12 = (nextCondition1 == null && nextCondition2 == null && nextCondition3 == null) ? false : true;
            float f10 = a10 == we.g.NONE ? 8.0f : 12.0f;
            boolean z13 = nextCondition1 != null;
            boolean z14 = nextCondition3 != null;
            boolean z15 = a10 == we.g.CHEER_LEGEND;
            z4.a aVar = z4.f55826k;
            int i10 = nd.f1.text_cheer_parameters_gift;
            int i11 = nd.y0.icon_yell_status_gift_count;
            z4 a11 = aVar.a(i10, i11, giftScore, giftScore2, giftScore2 != 0);
            int i12 = nd.f1.text_cheer_parameters_comment;
            int i13 = nd.y0.icon_yell_status_comment_count;
            z4 a12 = aVar.a(i12, i13, commentCount, commentCount2, commentCount2 != 0);
            int i14 = nd.f1.text_cheer_parameters_time;
            int i15 = nd.y0.icon_yell_status_viewing_time;
            z4 c10 = aVar.c(i14, i15, totalViewingTime, totalViewingTime2, resources, totalViewingTime2 != 0);
            int i16 = nd.f1.text_cheer_parameters_days;
            return new y4(a10, valueOf, spannableString, yellLpUrl, z11, z12, z10, f10, z13, z14, z15, a11, a12, c10, aVar.b(i16, totalViewDays2 != 0 ? nd.y0.icon_yell_status_total_days : nd.y0.disable_icon_yell_status_total_days, totalViewDays, totalViewDays2, resources, totalViewDays2 != 0), aVar.a(i10, i11, giftScore, giftScore3, giftScore3 != 0), aVar.a(i12, commentCount3 != 0 ? i13 : nd.y0.disable_icon_yell_status_comment_count, commentCount, commentCount3, commentCount3 != 0), aVar.c(i14, totalViewingTime3 != 0 ? i15 : nd.y0.disable_icon_yell_status_viewing_time, totalViewingTime, totalViewingTime3, resources, totalViewingTime3 != 0), aVar.b(i16, totalViewDays3 != 0 ? nd.y0.icon_yell_status_total_days : nd.y0.disable_icon_yell_status_total_days, totalViewDays, totalViewDays3, resources, totalViewDays3 != 0), aVar.a(i10, i11, giftScore, giftScore4, giftScore4 != 0), aVar.a(i12, commentCount4 != 0 ? i13 : nd.y0.disable_icon_yell_status_comment_count, commentCount, commentCount4, commentCount4 != 0), aVar.c(i14, totalViewingTime4 != 0 ? i15 : nd.y0.disable_icon_yell_status_viewing_time, totalViewingTime, totalViewingTime4, resources, totalViewingTime4 != 0), aVar.b(i16, totalViewDays4 != 0 ? nd.y0.icon_yell_status_total_days : nd.y0.disable_icon_yell_status_total_days, totalViewDays, totalViewDays4, resources, totalViewDays4 != 0));
        }
    }

    public y4(we.g gVar, String str, Spannable spannable, String str2, boolean z10, boolean z11, boolean z12, float f10, boolean z13, boolean z14, boolean z15, z4 z4Var, z4 z4Var2, z4 z4Var3, z4 z4Var4, z4 z4Var5, z4 z4Var6, z4 z4Var7, z4 z4Var8, z4 z4Var9, z4 z4Var10, z4 z4Var11, z4 z4Var12) {
        jo.p.h(gVar, "rank");
        jo.p.h(str, "level");
        jo.p.h(spannable, "message");
        jo.p.h(str2, "lpUrl");
        jo.p.h(z4Var, "conditionAGiftCountBindModel");
        jo.p.h(z4Var2, "conditionACommentCountBindModel");
        jo.p.h(z4Var3, "conditionATotalViewingTimeBindModel");
        jo.p.h(z4Var4, "conditionATotalViewDaysBindModel");
        jo.p.h(z4Var5, "conditionBGiftCountBindModel");
        jo.p.h(z4Var6, "conditionBCommentCountBindModel");
        jo.p.h(z4Var7, "conditionBTotalViewingTimeBindModel");
        jo.p.h(z4Var8, "conditionBTotalViewDaysBindModel");
        jo.p.h(z4Var9, "conditionCGiftCountBindModel");
        jo.p.h(z4Var10, "conditionCCommentCountBindModel");
        jo.p.h(z4Var11, "conditionCTotalViewingTimeBindModel");
        jo.p.h(z4Var12, "conditionCTotalViewDaysBindModel");
        this.f55770a = gVar;
        this.f55771b = str;
        this.f55772c = spannable;
        this.f55773d = str2;
        this.f55774e = z10;
        this.f55775f = z11;
        this.f55776g = z12;
        this.f55777h = f10;
        this.f55778i = z13;
        this.f55779j = z14;
        this.f55780k = z15;
        this.f55781l = z4Var;
        this.f55782m = z4Var2;
        this.f55783n = z4Var3;
        this.f55784o = z4Var4;
        this.f55785p = z4Var5;
        this.f55786q = z4Var6;
        this.f55787r = z4Var7;
        this.f55788s = z4Var8;
        this.f55789t = z4Var9;
        this.f55790u = z4Var10;
        this.f55791v = z4Var11;
        this.f55792w = z4Var12;
    }

    public final z4 a() {
        return this.f55782m;
    }

    public final z4 b() {
        return this.f55781l;
    }

    public final z4 c() {
        return this.f55784o;
    }

    public final z4 d() {
        return this.f55783n;
    }

    public final z4 e() {
        return this.f55786q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y4) {
            y4 y4Var = (y4) obj;
            return this.f55770a == y4Var.f55770a && jo.p.c(this.f55771b, y4Var.f55771b) && jo.p.c(this.f55772c, y4Var.f55772c) && jo.p.c(this.f55773d, y4Var.f55773d) && this.f55774e == y4Var.f55774e && this.f55775f == y4Var.f55775f && this.f55776g == y4Var.f55776g && jo.p.c(Float.valueOf(this.f55777h), Float.valueOf(y4Var.f55777h)) && this.f55778i == y4Var.f55778i && this.f55779j == y4Var.f55779j && this.f55780k == y4Var.f55780k && jo.p.c(this.f55781l, y4Var.f55781l) && jo.p.c(this.f55782m, y4Var.f55782m) && jo.p.c(this.f55783n, y4Var.f55783n) && jo.p.c(this.f55784o, y4Var.f55784o) && jo.p.c(this.f55785p, y4Var.f55785p) && jo.p.c(this.f55786q, y4Var.f55786q) && jo.p.c(this.f55787r, y4Var.f55787r) && jo.p.c(this.f55788s, y4Var.f55788s) && jo.p.c(this.f55789t, y4Var.f55789t) && jo.p.c(this.f55790u, y4Var.f55790u) && jo.p.c(this.f55791v, y4Var.f55791v) && jo.p.c(this.f55792w, y4Var.f55792w);
        }
        return false;
    }

    public final z4 f() {
        return this.f55785p;
    }

    public final z4 g() {
        return this.f55788s;
    }

    public final z4 h() {
        return this.f55787r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f55770a.hashCode() * 31) + this.f55771b.hashCode()) * 31) + this.f55772c.hashCode()) * 31) + this.f55773d.hashCode()) * 31;
        boolean z10 = this.f55774e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.f55775f;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.f55776g;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int hashCode2 = (((i13 + i14) * 31) + Float.hashCode(this.f55777h)) * 31;
        boolean z13 = this.f55778i;
        int i15 = z13;
        if (z13 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode2 + i15) * 31;
        boolean z14 = this.f55779j;
        int i17 = z14;
        if (z14 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z15 = this.f55780k;
        return ((((((((((((((((((((((((i18 + (z15 ? 1 : z15 ? 1 : 0)) * 31) + this.f55781l.hashCode()) * 31) + this.f55782m.hashCode()) * 31) + this.f55783n.hashCode()) * 31) + this.f55784o.hashCode()) * 31) + this.f55785p.hashCode()) * 31) + this.f55786q.hashCode()) * 31) + this.f55787r.hashCode()) * 31) + this.f55788s.hashCode()) * 31) + this.f55789t.hashCode()) * 31) + this.f55790u.hashCode()) * 31) + this.f55791v.hashCode()) * 31) + this.f55792w.hashCode();
    }

    public final z4 i() {
        return this.f55790u;
    }

    public final z4 j() {
        return this.f55789t;
    }

    public final z4 k() {
        return this.f55792w;
    }

    public final z4 l() {
        return this.f55791v;
    }

    public final String m() {
        return this.f55771b;
    }

    public final String n() {
        return this.f55773d;
    }

    public final Spannable o() {
        return this.f55772c;
    }

    public final we.g p() {
        return this.f55770a;
    }

    public final float q() {
        return this.f55777h;
    }

    public final boolean r() {
        return this.f55780k;
    }

    public final boolean s() {
        return this.f55778i;
    }

    public final boolean t() {
        return this.f55779j;
    }

    public String toString() {
        return "UserProfileSeasonYellStatusBindModel(rank=" + this.f55770a + ", level=" + this.f55771b + ", message=" + ((Object) this.f55772c) + ", lpUrl=" + this.f55773d + ", isVisibleCurrentRank=" + this.f55774e + ", isVisibleNextCondition=" + this.f55775f + ", isVisibleMessage=" + this.f55776g + ", yellRankTextSize=" + this.f55777h + ", isVisibleConditionA=" + this.f55778i + ", isVisibleConditionC=" + this.f55779j + ", isVisibleCheerLegendLevelMax=" + this.f55780k + ", conditionAGiftCountBindModel=" + this.f55781l + ", conditionACommentCountBindModel=" + this.f55782m + ", conditionATotalViewingTimeBindModel=" + this.f55783n + ", conditionATotalViewDaysBindModel=" + this.f55784o + ", conditionBGiftCountBindModel=" + this.f55785p + ", conditionBCommentCountBindModel=" + this.f55786q + ", conditionBTotalViewingTimeBindModel=" + this.f55787r + ", conditionBTotalViewDaysBindModel=" + this.f55788s + ", conditionCGiftCountBindModel=" + this.f55789t + ", conditionCCommentCountBindModel=" + this.f55790u + ", conditionCTotalViewingTimeBindModel=" + this.f55791v + ", conditionCTotalViewDaysBindModel=" + this.f55792w + ')';
    }

    public final boolean u() {
        return this.f55774e;
    }

    public final boolean v() {
        return this.f55776g;
    }

    public final boolean w() {
        return this.f55775f;
    }
}
