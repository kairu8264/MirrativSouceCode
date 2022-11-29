package cc;

import android.content.Context;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingBcsvrResponse;
import com.dena.mirrorman.net.bcsvr.response.GiftRankingNearbyRankedUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ud.d1;
import ud.e1;
import ud.g1;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: h  reason: collision with root package name */
    public static final a f19083h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f19084i = 8;

    /* renamed from: j  reason: collision with root package name */
    public static final List<Integer> f19085j = xn.s.m(Integer.valueOf(xb.n.K), Integer.valueOf(xb.n.L), Integer.valueOf(xb.n.M), Integer.valueOf(xb.n.N), Integer.valueOf(xb.n.O), Integer.valueOf(xb.n.P), Integer.valueOf(xb.n.Q));

    /* renamed from: a  reason: collision with root package name */
    public final int f19086a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19087b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19088c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19089d;

    /* renamed from: e  reason: collision with root package name */
    public final g1 f19090e;

    /* renamed from: f  reason: collision with root package name */
    public final List<ud.a> f19091f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f19092g;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n a(Context context, GiftRankingBcsvrResponse giftRankingBcsvrResponse, String str, String str2, String str3, String str4) {
            Object obj;
            jo.p.h(context, "context");
            jo.p.h(giftRankingBcsvrResponse, "giftRanking");
            jo.p.h(str, "userId");
            jo.p.h(str2, "userName");
            jo.p.h(str3, "profileImageUrl");
            jo.p.h(str4, "badgeImageUrl");
            Iterator<T> it = giftRankingBcsvrResponse.getNearRankSenders().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jo.p.c(((GiftRankingNearbyRankedUser) obj).getUserId(), str)) {
                    break;
                }
            }
            GiftRankingNearbyRankedUser giftRankingNearbyRankedUser = (GiftRankingNearbyRankedUser) obj;
            int senderAfterRank = giftRankingBcsvrResponse.getSenderAfterRank();
            String string = context.getString(xb.r.text_gift_ranking_gift_sender_title, str2);
            jo.p.g(string, "context.getString(R.stri…t_sender_title, userName)");
            g1 a10 = g1.I.a(!giftRankingBcsvrResponse.isAppEvent(), giftRankingBcsvrResponse.getSenderBeforeRank(), giftRankingBcsvrResponse.getSenderAfterRank(), giftRankingNearbyRankedUser != null ? giftRankingNearbyRankedUser.getGiftPoint() : 0, str, str2, giftRankingNearbyRankedUser != null ? giftRankingNearbyRankedUser.getIconUrl() : null, giftRankingNearbyRankedUser != null ? giftRankingNearbyRankedUser.getBadgeImageUrl() : null, giftRankingNearbyRankedUser != null ? giftRankingNearbyRankedUser.getLabelImageUrl() : null);
            List<GiftRankingNearbyRankedUser> nearRankSenders = giftRankingBcsvrResponse.getNearRankSenders();
            ArrayList arrayList = new ArrayList(xn.t.u(nearRankSenders, 10));
            for (GiftRankingNearbyRankedUser giftRankingNearbyRankedUser2 : nearRankSenders) {
                arrayList.add(e1.M.a(giftRankingNearbyRankedUser2, jo.p.c(giftRankingNearbyRankedUser2.getUserId(), str), giftRankingBcsvrResponse.isAppEvent()));
            }
            ArrayList arrayList2 = new ArrayList(20);
            for (int i10 = 0; i10 < 20; i10++) {
                arrayList2.add(new d1(((Number) n.f19085j.get(no.c.f43727w.c(n.f19085j.size()))).intValue(), null, 2, null));
            }
            return new n(senderAfterRank, str3, str4, string, a10, xn.a0.o0(arrayList, arrayList2), str4.length() > 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(int i10, String str, String str2, String str3, g1 g1Var, List<? extends ud.a> list, boolean z10) {
        jo.p.h(str, "senderProfileImageUrl");
        jo.p.h(str2, "senderBadgeImageUrl");
        jo.p.h(str3, "senderProfileNameText");
        jo.p.h(g1Var, "rankUpUserBindModel");
        jo.p.h(list, "nearbyRankedUserBindModels");
        this.f19086a = i10;
        this.f19087b = str;
        this.f19088c = str2;
        this.f19089d = str3;
        this.f19090e = g1Var;
        this.f19091f = list;
        this.f19092g = z10;
    }

    public final List<ud.a> b() {
        return this.f19091f;
    }

    public final int c() {
        return this.f19086a;
    }

    public final g1 d() {
        return this.f19090e;
    }

    public final String e() {
        return this.f19088c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f19086a == nVar.f19086a && jo.p.c(this.f19087b, nVar.f19087b) && jo.p.c(this.f19088c, nVar.f19088c) && jo.p.c(this.f19089d, nVar.f19089d) && jo.p.c(this.f19090e, nVar.f19090e) && jo.p.c(this.f19091f, nVar.f19091f) && this.f19092g == nVar.f19092g;
        }
        return false;
    }

    public final String f() {
        return this.f19087b;
    }

    public final String g() {
        return this.f19089d;
    }

    public final boolean h() {
        return this.f19092g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f19086a) * 31) + this.f19087b.hashCode()) * 31) + this.f19088c.hashCode()) * 31) + this.f19089d.hashCode()) * 31) + this.f19090e.hashCode()) * 31) + this.f19091f.hashCode()) * 31;
        boolean z10 = this.f19092g;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "GiftRankingRankUpSenderDialogBindModel(rank=" + this.f19086a + ", senderProfileImageUrl=" + this.f19087b + ", senderBadgeImageUrl=" + this.f19088c + ", senderProfileNameText=" + this.f19089d + ", rankUpUserBindModel=" + this.f19090e + ", nearbyRankedUserBindModels=" + this.f19091f + ", isVisibleSenderBadgeImage=" + this.f19092g + ')';
    }
}
