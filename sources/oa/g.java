package oa;

import com.dena.mirrativ.mirrativapi.common.Description;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameDailyRankingResponse;
import com.dena.mirrativ.mirrativapi.livegame.giftranking.GiftRankingRanking;
import com.dena.mirrativ.mirrativapi.livegame.giftranking.GiftRankingYesterdayRanking;
import java.util.ArrayList;
import java.util.List;
import xn.a0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: o  reason: collision with root package name */
    public static final a f44343o = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public static final int f44344p = 8;

    /* renamed from: a  reason: collision with root package name */
    public final String f44345a;

    /* renamed from: b  reason: collision with root package name */
    public final String f44346b;

    /* renamed from: c  reason: collision with root package name */
    public final String f44347c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f44348d;

    /* renamed from: e  reason: collision with root package name */
    public final List<GiftRankingYesterdayRanking> f44349e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f44350f;

    /* renamed from: g  reason: collision with root package name */
    public final o f44351g;

    /* renamed from: h  reason: collision with root package name */
    public final h f44352h;

    /* renamed from: i  reason: collision with root package name */
    public final List<o> f44353i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f44354j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f44355k;

    /* renamed from: l  reason: collision with root package name */
    public final List<Description> f44356l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f44357m;

    /* renamed from: n  reason: collision with root package name */
    public final String f44358n;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(LiveGameDailyRankingResponse liveGameDailyRankingResponse, boolean z10) {
            jo.p.h(liveGameDailyRankingResponse, "response");
            String ruleBannerImageUrl = liveGameDailyRankingResponse.getRuleBannerImageUrl();
            String rulePopupImageUrl = liveGameDailyRankingResponse.getRulePopupImageUrl();
            String ruleDescription = liveGameDailyRankingResponse.getRuleDescription();
            boolean z11 = liveGameDailyRankingResponse.getYesterdayRanking().size() == 3;
            List<GiftRankingYesterdayRanking> yesterdayRanking = liveGameDailyRankingResponse.getYesterdayRanking();
            boolean z12 = !liveGameDailyRankingResponse.getRanking().isEmpty();
            GiftRankingRanking streamerRank = liveGameDailyRankingResponse.getStreamerRank();
            o a10 = streamerRank != null ? o.f44421q.a(streamerRank, false) : null;
            GiftRankingRanking userRank = liveGameDailyRankingResponse.getUserRank();
            h a11 = userRank != null ? h.f44359o.a(userRank) : null;
            List<GiftRankingRanking> ranking = liveGameDailyRankingResponse.getRanking();
            ArrayList arrayList = new ArrayList(xn.t.u(ranking, 10));
            for (GiftRankingRanking giftRankingRanking : ranking) {
                arrayList.add(o.f44421q.a(giftRankingRanking, !jo.p.c(giftRankingRanking.getUserId(), ((GiftRankingRanking) a0.i0(liveGameDailyRankingResponse.getRanking())).getUserId())));
            }
            return new g(ruleBannerImageUrl, rulePopupImageUrl, ruleDescription, z11, yesterdayRanking, z12, a10, a11, arrayList, z10, !liveGameDailyRankingResponse.getDescriptions().isEmpty(), liveGameDailyRankingResponse.getDescriptions(), liveGameDailyRankingResponse.getCopyrightText().length() > 0, liveGameDailyRankingResponse.getCopyrightText());
        }
    }

    public g(String str, String str2, String str3, boolean z10, List<GiftRankingYesterdayRanking> list, boolean z11, o oVar, h hVar, List<o> list2, boolean z12, boolean z13, List<Description> list3, boolean z14, String str4) {
        jo.p.h(str, "ruleBannerImageUrl");
        jo.p.h(str2, "rulePopupImageUrl");
        jo.p.h(str3, "ruleDescription");
        jo.p.h(list, "yesterdayRankings");
        jo.p.h(list2, "rankings");
        jo.p.h(list3, "descriptions");
        jo.p.h(str4, "copyright");
        this.f44345a = str;
        this.f44346b = str2;
        this.f44347c = str3;
        this.f44348d = z10;
        this.f44349e = list;
        this.f44350f = z11;
        this.f44351g = oVar;
        this.f44352h = hVar;
        this.f44353i = list2;
        this.f44354j = z12;
        this.f44355k = z13;
        this.f44356l = list3;
        this.f44357m = z14;
        this.f44358n = str4;
    }

    public final g a(String str, String str2, String str3, boolean z10, List<GiftRankingYesterdayRanking> list, boolean z11, o oVar, h hVar, List<o> list2, boolean z12, boolean z13, List<Description> list3, boolean z14, String str4) {
        jo.p.h(str, "ruleBannerImageUrl");
        jo.p.h(str2, "rulePopupImageUrl");
        jo.p.h(str3, "ruleDescription");
        jo.p.h(list, "yesterdayRankings");
        jo.p.h(list2, "rankings");
        jo.p.h(list3, "descriptions");
        jo.p.h(str4, "copyright");
        return new g(str, str2, str3, z10, list, z11, oVar, hVar, list2, z12, z13, list3, z14, str4);
    }

    public final String c() {
        return this.f44358n;
    }

    public final h d() {
        return this.f44352h;
    }

    public final List<Description> e() {
        return this.f44356l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return jo.p.c(this.f44345a, gVar.f44345a) && jo.p.c(this.f44346b, gVar.f44346b) && jo.p.c(this.f44347c, gVar.f44347c) && this.f44348d == gVar.f44348d && jo.p.c(this.f44349e, gVar.f44349e) && this.f44350f == gVar.f44350f && jo.p.c(this.f44351g, gVar.f44351g) && jo.p.c(this.f44352h, gVar.f44352h) && jo.p.c(this.f44353i, gVar.f44353i) && this.f44354j == gVar.f44354j && this.f44355k == gVar.f44355k && jo.p.c(this.f44356l, gVar.f44356l) && this.f44357m == gVar.f44357m && jo.p.c(this.f44358n, gVar.f44358n);
        }
        return false;
    }

    public final boolean f() {
        return this.f44354j;
    }

    public final List<o> g() {
        return this.f44353i;
    }

    public final String h() {
        return this.f44345a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f44345a.hashCode() * 31) + this.f44346b.hashCode()) * 31) + this.f44347c.hashCode()) * 31;
        boolean z10 = this.f44348d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((hashCode + i10) * 31) + this.f44349e.hashCode()) * 31;
        boolean z11 = this.f44350f;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        o oVar = this.f44351g;
        int hashCode3 = (i12 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        h hVar = this.f44352h;
        int hashCode4 = (((hashCode3 + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f44353i.hashCode()) * 31;
        boolean z12 = this.f44354j;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode4 + i13) * 31;
        boolean z13 = this.f44355k;
        int i15 = z13;
        if (z13 != 0) {
            i15 = 1;
        }
        int hashCode5 = (((i14 + i15) * 31) + this.f44356l.hashCode()) * 31;
        boolean z14 = this.f44357m;
        return ((hashCode5 + (z14 ? 1 : z14 ? 1 : 0)) * 31) + this.f44358n.hashCode();
    }

    public final String i() {
        return this.f44347c;
    }

    public final String j() {
        return this.f44346b;
    }

    public final o k() {
        return this.f44351g;
    }

    public final List<GiftRankingYesterdayRanking> l() {
        return this.f44349e;
    }

    public final boolean m() {
        return this.f44357m;
    }

    public final boolean n() {
        return this.f44355k;
    }

    public final boolean o() {
        return this.f44350f;
    }

    public final boolean p() {
        return this.f44348d;
    }

    public String toString() {
        return "LiveGameDailyRankingBindModel(ruleBannerImageUrl=" + this.f44345a + ", rulePopupImageUrl=" + this.f44346b + ", ruleDescription=" + this.f44347c + ", isVisibleYesterdayRanking=" + this.f44348d + ", yesterdayRankings=" + this.f44349e + ", isVisibleTodayRanking=" + this.f44350f + ", streamerUserRank=" + this.f44351g + ", currentUserRank=" + this.f44352h + ", rankings=" + this.f44353i + ", hasMore=" + this.f44354j + ", isVisibleDescription=" + this.f44355k + ", descriptions=" + this.f44356l + ", isVisibleCopyright=" + this.f44357m + ", copyright=" + this.f44358n + ')';
    }
}
