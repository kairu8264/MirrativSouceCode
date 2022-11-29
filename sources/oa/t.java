package oa;

import com.dena.mirrativ.mirrativapi.livegame.LiveGameDailyRankingYesterdayResponse;
import com.dena.mirrativ.mirrativapi.livegame.giftranking.GiftRankingRanking;
import java.util.ArrayList;
import java.util.List;
import xn.a0;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: c  reason: collision with root package name */
    public static final a f44508c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f44509d = 8;

    /* renamed from: a  reason: collision with root package name */
    public final List<o> f44510a;

    /* renamed from: b  reason: collision with root package name */
    public final h f44511b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final t a(LiveGameDailyRankingYesterdayResponse liveGameDailyRankingYesterdayResponse) {
            jo.p.h(liveGameDailyRankingYesterdayResponse, "response");
            GiftRankingRanking userRank = liveGameDailyRankingYesterdayResponse.getUserRank();
            h a10 = userRank != null ? h.f44359o.a(userRank) : null;
            List<GiftRankingRanking> ranking = liveGameDailyRankingYesterdayResponse.getRanking();
            ArrayList arrayList = new ArrayList(xn.t.u(ranking, 10));
            for (GiftRankingRanking giftRankingRanking : ranking) {
                arrayList.add(o.f44421q.a(giftRankingRanking, !jo.p.c(giftRankingRanking.getUserId(), ((GiftRankingRanking) a0.i0(liveGameDailyRankingYesterdayResponse.getRanking())).getUserId())));
            }
            return new t(arrayList, a10);
        }
    }

    public t(List<o> list, h hVar) {
        jo.p.h(list, "rankings");
        this.f44510a = list;
        this.f44511b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t b(t tVar, List list, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = tVar.f44510a;
        }
        if ((i10 & 2) != 0) {
            hVar = tVar.f44511b;
        }
        return tVar.a(list, hVar);
    }

    public final t a(List<o> list, h hVar) {
        jo.p.h(list, "rankings");
        return new t(list, hVar);
    }

    public final List<o> c() {
        return this.f44510a;
    }

    public final h d() {
        return this.f44511b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            return jo.p.c(this.f44510a, tVar.f44510a) && jo.p.c(this.f44511b, tVar.f44511b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f44510a.hashCode() * 31;
        h hVar = this.f44511b;
        return hashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public String toString() {
        return "LiveGameDailyRankingYesterdayBindModel(rankings=" + this.f44510a + ", userRank=" + this.f44511b + ')';
    }
}
