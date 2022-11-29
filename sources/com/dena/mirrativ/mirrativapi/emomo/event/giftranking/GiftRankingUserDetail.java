package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftRankingUserDetail implements Serializable {
    private final String badgeImageUrl;
    private final int giftPoint;
    private final String iconUrl;
    private final String labelImageUrl;
    private final String liveId;
    private final String name;
    private final int rank;
    private final String rewardImageUrl;
    private final List<GiftRankingReward> rewards;
    private final String userGrade;
    private final int userId;

    public GiftRankingUserDetail(int i10, String str, String str2, int i11, int i12, String str3, String str4, String str5, String str6, String str7, List<GiftRankingReward> list) {
        p.h(str, "liveId");
        p.h(str2, "name");
        p.h(str3, "iconUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "labelImageUrl");
        p.h(str6, "userGrade");
        p.h(str7, "rewardImageUrl");
        p.h(list, "rewards");
        this.userId = i10;
        this.liveId = str;
        this.name = str2;
        this.rank = i11;
        this.giftPoint = i12;
        this.iconUrl = str3;
        this.badgeImageUrl = str4;
        this.labelImageUrl = str5;
        this.userGrade = str6;
        this.rewardImageUrl = str7;
        this.rewards = list;
    }

    public final int component1() {
        return this.userId;
    }

    public final String component10() {
        return this.rewardImageUrl;
    }

    public final List<GiftRankingReward> component11() {
        return this.rewards;
    }

    public final String component2() {
        return this.liveId;
    }

    public final String component3() {
        return this.name;
    }

    public final int component4() {
        return this.rank;
    }

    public final int component5() {
        return this.giftPoint;
    }

    public final String component6() {
        return this.iconUrl;
    }

    public final String component7() {
        return this.badgeImageUrl;
    }

    public final String component8() {
        return this.labelImageUrl;
    }

    public final String component9() {
        return this.userGrade;
    }

    public final GiftRankingUserDetail copy(int i10, String str, String str2, int i11, int i12, String str3, String str4, String str5, String str6, String str7, List<GiftRankingReward> list) {
        p.h(str, "liveId");
        p.h(str2, "name");
        p.h(str3, "iconUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "labelImageUrl");
        p.h(str6, "userGrade");
        p.h(str7, "rewardImageUrl");
        p.h(list, "rewards");
        return new GiftRankingUserDetail(i10, str, str2, i11, i12, str3, str4, str5, str6, str7, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingUserDetail) {
            GiftRankingUserDetail giftRankingUserDetail = (GiftRankingUserDetail) obj;
            return this.userId == giftRankingUserDetail.userId && p.c(this.liveId, giftRankingUserDetail.liveId) && p.c(this.name, giftRankingUserDetail.name) && this.rank == giftRankingUserDetail.rank && this.giftPoint == giftRankingUserDetail.giftPoint && p.c(this.iconUrl, giftRankingUserDetail.iconUrl) && p.c(this.badgeImageUrl, giftRankingUserDetail.badgeImageUrl) && p.c(this.labelImageUrl, giftRankingUserDetail.labelImageUrl) && p.c(this.userGrade, giftRankingUserDetail.userGrade) && p.c(this.rewardImageUrl, giftRankingUserDetail.rewardImageUrl) && p.c(this.rewards, giftRankingUserDetail.rewards);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final int getGiftPoint() {
        return this.giftPoint;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLabelImageUrl() {
        return this.labelImageUrl;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getRewardImageUrl() {
        return this.rewardImageUrl;
    }

    public final List<GiftRankingReward> getRewards() {
        return this.rewards;
    }

    public final String getUserGrade() {
        return this.userGrade;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.userId) * 31) + this.liveId.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.giftPoint)) * 31) + this.iconUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.labelImageUrl.hashCode()) * 31) + this.userGrade.hashCode()) * 31) + this.rewardImageUrl.hashCode()) * 31) + this.rewards.hashCode();
    }

    public String toString() {
        return "GiftRankingUserDetail(userId=" + this.userId + ", liveId=" + this.liveId + ", name=" + this.name + ", rank=" + this.rank + ", giftPoint=" + this.giftPoint + ", iconUrl=" + this.iconUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", labelImageUrl=" + this.labelImageUrl + ", userGrade=" + this.userGrade + ", rewardImageUrl=" + this.rewardImageUrl + ", rewards=" + this.rewards + ')';
    }
}
