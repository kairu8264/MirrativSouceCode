package com.dena.mirrativ.mirrativapi.livegame;

import com.dena.mirrativ.mirrativapi.livegame.giftranking.GiftRankingRanking;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameDailyRankingYesterdayResponse {
    private final String nextCursor;
    private final List<GiftRankingRanking> ranking;
    private final GiftRankingRanking userRank;

    public LiveGameDailyRankingYesterdayResponse(List<GiftRankingRanking> list, GiftRankingRanking giftRankingRanking, String str) {
        p.h(list, "ranking");
        p.h(str, "nextCursor");
        this.ranking = list;
        this.userRank = giftRankingRanking;
        this.nextCursor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveGameDailyRankingYesterdayResponse copy$default(LiveGameDailyRankingYesterdayResponse liveGameDailyRankingYesterdayResponse, List list, GiftRankingRanking giftRankingRanking, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = liveGameDailyRankingYesterdayResponse.ranking;
        }
        if ((i10 & 2) != 0) {
            giftRankingRanking = liveGameDailyRankingYesterdayResponse.userRank;
        }
        if ((i10 & 4) != 0) {
            str = liveGameDailyRankingYesterdayResponse.nextCursor;
        }
        return liveGameDailyRankingYesterdayResponse.copy(list, giftRankingRanking, str);
    }

    public final List<GiftRankingRanking> component1() {
        return this.ranking;
    }

    public final GiftRankingRanking component2() {
        return this.userRank;
    }

    public final String component3() {
        return this.nextCursor;
    }

    public final LiveGameDailyRankingYesterdayResponse copy(List<GiftRankingRanking> list, GiftRankingRanking giftRankingRanking, String str) {
        p.h(list, "ranking");
        p.h(str, "nextCursor");
        return new LiveGameDailyRankingYesterdayResponse(list, giftRankingRanking, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameDailyRankingYesterdayResponse) {
            LiveGameDailyRankingYesterdayResponse liveGameDailyRankingYesterdayResponse = (LiveGameDailyRankingYesterdayResponse) obj;
            return p.c(this.ranking, liveGameDailyRankingYesterdayResponse.ranking) && p.c(this.userRank, liveGameDailyRankingYesterdayResponse.userRank) && p.c(this.nextCursor, liveGameDailyRankingYesterdayResponse.nextCursor);
        }
        return false;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<GiftRankingRanking> getRanking() {
        return this.ranking;
    }

    public final GiftRankingRanking getUserRank() {
        return this.userRank;
    }

    public int hashCode() {
        int hashCode = this.ranking.hashCode() * 31;
        GiftRankingRanking giftRankingRanking = this.userRank;
        return ((hashCode + (giftRankingRanking == null ? 0 : giftRankingRanking.hashCode())) * 31) + this.nextCursor.hashCode();
    }

    public String toString() {
        return "LiveGameDailyRankingYesterdayResponse(ranking=" + this.ranking + ", userRank=" + this.userRank + ", nextCursor=" + this.nextCursor + ')';
    }
}
