package com.dena.mirrorman.net.api.response.event;

import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftRanking implements Serializable {
    public static final int $stable = 0;
    private final String bannerIconImageUrl;
    private final String bannerIconLinkUrl;
    private final String eventIconUrl;
    private final int eventId;
    private final String eventTitle;
    private final boolean isAppEvent;
    private final boolean isFocus;
    private final long nanoTime;
    private final int rank;
    private final String rankText;
    private final int rankingPoint;
    private final int rewardAchievedPoint;
    private final String rewardIconUrl;
    private final int rewardNeedPoint;
    private final int totalPoint;

    public GiftRanking(String str, String str2, String str3, int i10, String str4, boolean z10, long j10, int i11, String str5, int i12, int i13, String str6, int i14, int i15, boolean z11) {
        p.h(str, "bannerIconImageUrl");
        p.h(str2, "bannerIconLinkUrl");
        p.h(str3, "eventIconUrl");
        p.h(str4, "eventTitle");
        p.h(str5, "rankText");
        p.h(str6, "rewardIconUrl");
        this.bannerIconImageUrl = str;
        this.bannerIconLinkUrl = str2;
        this.eventIconUrl = str3;
        this.eventId = i10;
        this.eventTitle = str4;
        this.isAppEvent = z10;
        this.nanoTime = j10;
        this.rank = i11;
        this.rankText = str5;
        this.rankingPoint = i12;
        this.rewardAchievedPoint = i13;
        this.rewardIconUrl = str6;
        this.rewardNeedPoint = i14;
        this.totalPoint = i15;
        this.isFocus = z11;
    }

    public final String component1() {
        return this.bannerIconImageUrl;
    }

    public final int component10() {
        return this.rankingPoint;
    }

    public final int component11() {
        return this.rewardAchievedPoint;
    }

    public final String component12() {
        return this.rewardIconUrl;
    }

    public final int component13() {
        return this.rewardNeedPoint;
    }

    public final int component14() {
        return this.totalPoint;
    }

    public final boolean component15() {
        return this.isFocus;
    }

    public final String component2() {
        return this.bannerIconLinkUrl;
    }

    public final String component3() {
        return this.eventIconUrl;
    }

    public final int component4() {
        return this.eventId;
    }

    public final String component5() {
        return this.eventTitle;
    }

    public final boolean component6() {
        return this.isAppEvent;
    }

    public final long component7() {
        return this.nanoTime;
    }

    public final int component8() {
        return this.rank;
    }

    public final String component9() {
        return this.rankText;
    }

    public final GiftRanking copy(String str, String str2, String str3, int i10, String str4, boolean z10, long j10, int i11, String str5, int i12, int i13, String str6, int i14, int i15, boolean z11) {
        p.h(str, "bannerIconImageUrl");
        p.h(str2, "bannerIconLinkUrl");
        p.h(str3, "eventIconUrl");
        p.h(str4, "eventTitle");
        p.h(str5, "rankText");
        p.h(str6, "rewardIconUrl");
        return new GiftRanking(str, str2, str3, i10, str4, z10, j10, i11, str5, i12, i13, str6, i14, i15, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRanking) {
            GiftRanking giftRanking = (GiftRanking) obj;
            return p.c(this.bannerIconImageUrl, giftRanking.bannerIconImageUrl) && p.c(this.bannerIconLinkUrl, giftRanking.bannerIconLinkUrl) && p.c(this.eventIconUrl, giftRanking.eventIconUrl) && this.eventId == giftRanking.eventId && p.c(this.eventTitle, giftRanking.eventTitle) && this.isAppEvent == giftRanking.isAppEvent && this.nanoTime == giftRanking.nanoTime && this.rank == giftRanking.rank && p.c(this.rankText, giftRanking.rankText) && this.rankingPoint == giftRanking.rankingPoint && this.rewardAchievedPoint == giftRanking.rewardAchievedPoint && p.c(this.rewardIconUrl, giftRanking.rewardIconUrl) && this.rewardNeedPoint == giftRanking.rewardNeedPoint && this.totalPoint == giftRanking.totalPoint && this.isFocus == giftRanking.isFocus;
        }
        return false;
    }

    public final String getBannerIconImageUrl() {
        return this.bannerIconImageUrl;
    }

    public final String getBannerIconLinkUrl() {
        return this.bannerIconLinkUrl;
    }

    public final String getEventIconUrl() {
        return this.eventIconUrl;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final String getEventTitle() {
        return this.eventTitle;
    }

    public final long getNanoTime() {
        return this.nanoTime;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getRankText() {
        return this.rankText;
    }

    public final int getRankingPoint() {
        return this.rankingPoint;
    }

    public final int getRewardAchievedPoint() {
        return this.rewardAchievedPoint;
    }

    public final String getRewardIconUrl() {
        return this.rewardIconUrl;
    }

    public final int getRewardNeedPoint() {
        return this.rewardNeedPoint;
    }

    public final int getTotalPoint() {
        return this.totalPoint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.bannerIconImageUrl.hashCode() * 31) + this.bannerIconLinkUrl.hashCode()) * 31) + this.eventIconUrl.hashCode()) * 31) + Integer.hashCode(this.eventId)) * 31) + this.eventTitle.hashCode()) * 31;
        boolean z10 = this.isAppEvent;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((((((((((((hashCode + i10) * 31) + Long.hashCode(this.nanoTime)) * 31) + Integer.hashCode(this.rank)) * 31) + this.rankText.hashCode()) * 31) + Integer.hashCode(this.rankingPoint)) * 31) + Integer.hashCode(this.rewardAchievedPoint)) * 31) + this.rewardIconUrl.hashCode()) * 31) + Integer.hashCode(this.rewardNeedPoint)) * 31) + Integer.hashCode(this.totalPoint)) * 31;
        boolean z11 = this.isFocus;
        return hashCode2 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isAppEvent() {
        return this.isAppEvent;
    }

    public final boolean isFocus() {
        return this.isFocus;
    }

    public String toString() {
        return "GiftRanking(bannerIconImageUrl=" + this.bannerIconImageUrl + ", bannerIconLinkUrl=" + this.bannerIconLinkUrl + ", eventIconUrl=" + this.eventIconUrl + ", eventId=" + this.eventId + ", eventTitle=" + this.eventTitle + ", isAppEvent=" + this.isAppEvent + ", nanoTime=" + this.nanoTime + ", rank=" + this.rank + ", rankText=" + this.rankText + ", rankingPoint=" + this.rankingPoint + ", rewardAchievedPoint=" + this.rewardAchievedPoint + ", rewardIconUrl=" + this.rewardIconUrl + ", rewardNeedPoint=" + this.rewardNeedPoint + ", totalPoint=" + this.totalPoint + ", isFocus=" + this.isFocus + ')';
    }
}
