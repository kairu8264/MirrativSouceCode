package ud;

import android.content.Context;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingNearbyRankedUser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class f1 {

    /* renamed from: i  reason: collision with root package name */
    public static final a f54917i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f54918j = 8;

    /* renamed from: k  reason: collision with root package name */
    public static final List<Integer> f54919k = xn.s.m(Integer.valueOf(nd.y0.f42256x0), Integer.valueOf(nd.y0.f42257y0), Integer.valueOf(nd.y0.f42258z0), Integer.valueOf(nd.y0.A0), Integer.valueOf(nd.y0.B0), Integer.valueOf(nd.y0.C0), Integer.valueOf(nd.y0.D0));

    /* renamed from: a  reason: collision with root package name */
    public final int f54920a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54921b;

    /* renamed from: c  reason: collision with root package name */
    public final String f54922c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54923d;

    /* renamed from: e  reason: collision with root package name */
    public final String f54924e;

    /* renamed from: f  reason: collision with root package name */
    public final String f54925f;

    /* renamed from: g  reason: collision with root package name */
    public final g1 f54926g;

    /* renamed from: h  reason: collision with root package name */
    public final List<ud.a> f54927h;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f1 a(Context context, GiftRankingBcsvrResponse giftRankingBcsvrResponse, String str, String str2, String str3, String str4, String str5, String str6) {
            jo.p.h(context, "context");
            jo.p.h(giftRankingBcsvrResponse, "giftRanking");
            jo.p.h(str, "streamerUserId");
            jo.p.h(str2, "streamerUserName");
            jo.p.h(str3, "streamerProfileImageUrl");
            jo.p.h(str4, "streamerBadgeImageUrl");
            jo.p.h(str5, "streamerCatalogLabelImageUrl");
            jo.p.h(str6, "senderUserName");
            int rank = giftRankingBcsvrResponse.getRank();
            String eventIconUrl = giftRankingBcsvrResponse.getEventIconUrl();
            String eventTitle = giftRankingBcsvrResponse.getEventTitle();
            String string = context.getString(sb.c.text_gift_ranking_gift_sender, str6);
            jo.p.g(string, "context.getString(R.stri…t_sender, senderUserName)");
            String casterGrade = giftRankingBcsvrResponse.getCasterGrade();
            String string2 = context.getString(sb.c.text_gift_ranking_rank_change, String.valueOf(giftRankingBcsvrResponse.getCasterBeforeRank()), String.valueOf(giftRankingBcsvrResponse.getCasterAfterRank()));
            jo.p.g(string2, "context.getString(R.stri…sterAfterRank.toString())");
            g1 a10 = g1.I.a(!giftRankingBcsvrResponse.isAppEvent(), giftRankingBcsvrResponse.getCasterBeforeRank(), giftRankingBcsvrResponse.getCasterAfterRank(), giftRankingBcsvrResponse.getRankingPoint(), str, str2, str3, str4, str5);
            List<GiftRankingNearbyRankedUser> nearRankCasters = giftRankingBcsvrResponse.getNearRankCasters();
            ArrayList arrayList = new ArrayList(xn.t.u(nearRankCasters, 10));
            for (GiftRankingNearbyRankedUser giftRankingNearbyRankedUser : nearRankCasters) {
                arrayList.add(e1.M.a(giftRankingNearbyRankedUser, jo.p.c(giftRankingNearbyRankedUser.getUserId(), str), giftRankingBcsvrResponse.isAppEvent()));
            }
            ArrayList arrayList2 = new ArrayList(20);
            for (int i10 = 0; i10 < 20; i10++) {
                arrayList2.add(new d1(((Number) f1.f54919k.get(no.c.f43727w.c(f1.f54919k.size()))).intValue(), null, 2, null));
            }
            return new f1(rank, eventIconUrl, eventTitle, string, casterGrade, string2, a10, xn.a0.o0(arrayList, arrayList2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f1(int i10, String str, String str2, String str3, String str4, String str5, g1 g1Var, List<? extends ud.a> list) {
        jo.p.h(str, "iconImageUrl");
        jo.p.h(str2, "eventTitleText");
        jo.p.h(str3, "descriptionPrefixText");
        jo.p.h(str4, "descriptionGradeText");
        jo.p.h(str5, "descriptionRankText");
        jo.p.h(g1Var, "rankUpUserBindModel");
        jo.p.h(list, "nearbyRankedUserBindModels");
        this.f54920a = i10;
        this.f54921b = str;
        this.f54922c = str2;
        this.f54923d = str3;
        this.f54924e = str4;
        this.f54925f = str5;
        this.f54926g = g1Var;
        this.f54927h = list;
    }

    public final String b() {
        return this.f54924e;
    }

    public final String c() {
        return this.f54923d;
    }

    public final String d() {
        return this.f54925f;
    }

    public final String e() {
        return this.f54922c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            f1 f1Var = (f1) obj;
            return this.f54920a == f1Var.f54920a && jo.p.c(this.f54921b, f1Var.f54921b) && jo.p.c(this.f54922c, f1Var.f54922c) && jo.p.c(this.f54923d, f1Var.f54923d) && jo.p.c(this.f54924e, f1Var.f54924e) && jo.p.c(this.f54925f, f1Var.f54925f) && jo.p.c(this.f54926g, f1Var.f54926g) && jo.p.c(this.f54927h, f1Var.f54927h);
        }
        return false;
    }

    public final String f() {
        return this.f54921b;
    }

    public final List<ud.a> g() {
        return this.f54927h;
    }

    public final int h() {
        return this.f54920a;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f54920a) * 31) + this.f54921b.hashCode()) * 31) + this.f54922c.hashCode()) * 31) + this.f54923d.hashCode()) * 31) + this.f54924e.hashCode()) * 31) + this.f54925f.hashCode()) * 31) + this.f54926g.hashCode()) * 31) + this.f54927h.hashCode();
    }

    public final g1 i() {
        return this.f54926g;
    }

    public String toString() {
        return "GiftRankingRankUpStreamerDialogBindModel(rank=" + this.f54920a + ", iconImageUrl=" + this.f54921b + ", eventTitleText=" + this.f54922c + ", descriptionPrefixText=" + this.f54923d + ", descriptionGradeText=" + this.f54924e + ", descriptionRankText=" + this.f54925f + ", rankUpUserBindModel=" + this.f54926g + ", nearbyRankedUserBindModels=" + this.f54927h + ')';
    }
}
