package com.dena.mirrativ.mirrativapi.livegame;

import com.dena.mirrativ.mirrativapi.common.Description;
import com.dena.mirrativ.mirrativapi.livegame.giftranking.GiftRankingRanking;
import com.dena.mirrativ.mirrativapi.livegame.giftranking.GiftRankingYesterdayRanking;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameDailyRankingResponse {
    private final String copyrightText;
    private final List<Description> descriptions;
    private final String nextCursor;
    private final List<GiftRankingRanking> ranking;
    private final String ruleBannerImageUrl;
    private final String ruleDescription;
    private final String rulePopupImageUrl;
    private final GiftRankingRanking streamerRank;
    private final GiftRankingRanking userRank;
    private final List<GiftRankingYesterdayRanking> yesterdayRanking;

    public LiveGameDailyRankingResponse(String str, String str2, String str3, List<Description> list, List<GiftRankingRanking> list2, List<GiftRankingYesterdayRanking> list3, GiftRankingRanking giftRankingRanking, GiftRankingRanking giftRankingRanking2, String str4, String str5) {
        p.h(str, "ruleBannerImageUrl");
        p.h(str2, "rulePopupImageUrl");
        p.h(str3, "ruleDescription");
        p.h(list, "descriptions");
        p.h(list2, "ranking");
        p.h(list3, "yesterdayRanking");
        p.h(str4, "copyrightText");
        p.h(str5, "nextCursor");
        this.ruleBannerImageUrl = str;
        this.rulePopupImageUrl = str2;
        this.ruleDescription = str3;
        this.descriptions = list;
        this.ranking = list2;
        this.yesterdayRanking = list3;
        this.streamerRank = giftRankingRanking;
        this.userRank = giftRankingRanking2;
        this.copyrightText = str4;
        this.nextCursor = str5;
    }

    public final String component1() {
        return this.ruleBannerImageUrl;
    }

    public final String component10() {
        return this.nextCursor;
    }

    public final String component2() {
        return this.rulePopupImageUrl;
    }

    public final String component3() {
        return this.ruleDescription;
    }

    public final List<Description> component4() {
        return this.descriptions;
    }

    public final List<GiftRankingRanking> component5() {
        return this.ranking;
    }

    public final List<GiftRankingYesterdayRanking> component6() {
        return this.yesterdayRanking;
    }

    public final GiftRankingRanking component7() {
        return this.streamerRank;
    }

    public final GiftRankingRanking component8() {
        return this.userRank;
    }

    public final String component9() {
        return this.copyrightText;
    }

    public final LiveGameDailyRankingResponse copy(String str, String str2, String str3, List<Description> list, List<GiftRankingRanking> list2, List<GiftRankingYesterdayRanking> list3, GiftRankingRanking giftRankingRanking, GiftRankingRanking giftRankingRanking2, String str4, String str5) {
        p.h(str, "ruleBannerImageUrl");
        p.h(str2, "rulePopupImageUrl");
        p.h(str3, "ruleDescription");
        p.h(list, "descriptions");
        p.h(list2, "ranking");
        p.h(list3, "yesterdayRanking");
        p.h(str4, "copyrightText");
        p.h(str5, "nextCursor");
        return new LiveGameDailyRankingResponse(str, str2, str3, list, list2, list3, giftRankingRanking, giftRankingRanking2, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameDailyRankingResponse) {
            LiveGameDailyRankingResponse liveGameDailyRankingResponse = (LiveGameDailyRankingResponse) obj;
            return p.c(this.ruleBannerImageUrl, liveGameDailyRankingResponse.ruleBannerImageUrl) && p.c(this.rulePopupImageUrl, liveGameDailyRankingResponse.rulePopupImageUrl) && p.c(this.ruleDescription, liveGameDailyRankingResponse.ruleDescription) && p.c(this.descriptions, liveGameDailyRankingResponse.descriptions) && p.c(this.ranking, liveGameDailyRankingResponse.ranking) && p.c(this.yesterdayRanking, liveGameDailyRankingResponse.yesterdayRanking) && p.c(this.streamerRank, liveGameDailyRankingResponse.streamerRank) && p.c(this.userRank, liveGameDailyRankingResponse.userRank) && p.c(this.copyrightText, liveGameDailyRankingResponse.copyrightText) && p.c(this.nextCursor, liveGameDailyRankingResponse.nextCursor);
        }
        return false;
    }

    public final String getCopyrightText() {
        return this.copyrightText;
    }

    public final List<Description> getDescriptions() {
        return this.descriptions;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<GiftRankingRanking> getRanking() {
        return this.ranking;
    }

    public final String getRuleBannerImageUrl() {
        return this.ruleBannerImageUrl;
    }

    public final String getRuleDescription() {
        return this.ruleDescription;
    }

    public final String getRulePopupImageUrl() {
        return this.rulePopupImageUrl;
    }

    public final GiftRankingRanking getStreamerRank() {
        return this.streamerRank;
    }

    public final GiftRankingRanking getUserRank() {
        return this.userRank;
    }

    public final List<GiftRankingYesterdayRanking> getYesterdayRanking() {
        return this.yesterdayRanking;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.ruleBannerImageUrl.hashCode() * 31) + this.rulePopupImageUrl.hashCode()) * 31) + this.ruleDescription.hashCode()) * 31) + this.descriptions.hashCode()) * 31) + this.ranking.hashCode()) * 31) + this.yesterdayRanking.hashCode()) * 31;
        GiftRankingRanking giftRankingRanking = this.streamerRank;
        int hashCode2 = (hashCode + (giftRankingRanking == null ? 0 : giftRankingRanking.hashCode())) * 31;
        GiftRankingRanking giftRankingRanking2 = this.userRank;
        return ((((hashCode2 + (giftRankingRanking2 != null ? giftRankingRanking2.hashCode() : 0)) * 31) + this.copyrightText.hashCode()) * 31) + this.nextCursor.hashCode();
    }

    public String toString() {
        return "LiveGameDailyRankingResponse(ruleBannerImageUrl=" + this.ruleBannerImageUrl + ", rulePopupImageUrl=" + this.rulePopupImageUrl + ", ruleDescription=" + this.ruleDescription + ", descriptions=" + this.descriptions + ", ranking=" + this.ranking + ", yesterdayRanking=" + this.yesterdayRanking + ", streamerRank=" + this.streamerRank + ", userRank=" + this.userRank + ", copyrightText=" + this.copyrightText + ", nextCursor=" + this.nextCursor + ')';
    }
}
