package com.dena.mirrativ.mirrativapi.livegame.giftranking;

import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftRankingRanking implements Serializable {
    private final String badgeImageUrl;
    private final String labelImageUrl;
    private final List<String> liveGameIconUrls;
    private final String liveId;
    private final long point;
    private final String profileImageUrl;
    private final String rank;
    private final String userId;
    private final String userName;

    public GiftRankingRanking(String str, long j10, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
        p.h(str, "rank");
        p.h(str2, "userId");
        p.h(str3, "userName");
        p.h(str4, "profileImageUrl");
        p.h(str5, "badgeImageUrl");
        p.h(str6, "labelImageUrl");
        p.h(str7, "liveId");
        p.h(list, "liveGameIconUrls");
        this.rank = str;
        this.point = j10;
        this.userId = str2;
        this.userName = str3;
        this.profileImageUrl = str4;
        this.badgeImageUrl = str5;
        this.labelImageUrl = str6;
        this.liveId = str7;
        this.liveGameIconUrls = list;
    }

    public final String component1() {
        return this.rank;
    }

    public final long component2() {
        return this.point;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.userName;
    }

    public final String component5() {
        return this.profileImageUrl;
    }

    public final String component6() {
        return this.badgeImageUrl;
    }

    public final String component7() {
        return this.labelImageUrl;
    }

    public final String component8() {
        return this.liveId;
    }

    public final List<String> component9() {
        return this.liveGameIconUrls;
    }

    public final GiftRankingRanking copy(String str, long j10, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
        p.h(str, "rank");
        p.h(str2, "userId");
        p.h(str3, "userName");
        p.h(str4, "profileImageUrl");
        p.h(str5, "badgeImageUrl");
        p.h(str6, "labelImageUrl");
        p.h(str7, "liveId");
        p.h(list, "liveGameIconUrls");
        return new GiftRankingRanking(str, j10, str2, str3, str4, str5, str6, str7, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingRanking) {
            GiftRankingRanking giftRankingRanking = (GiftRankingRanking) obj;
            return p.c(this.rank, giftRankingRanking.rank) && this.point == giftRankingRanking.point && p.c(this.userId, giftRankingRanking.userId) && p.c(this.userName, giftRankingRanking.userName) && p.c(this.profileImageUrl, giftRankingRanking.profileImageUrl) && p.c(this.badgeImageUrl, giftRankingRanking.badgeImageUrl) && p.c(this.labelImageUrl, giftRankingRanking.labelImageUrl) && p.c(this.liveId, giftRankingRanking.liveId) && p.c(this.liveGameIconUrls, giftRankingRanking.liveGameIconUrls);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final String getLabelImageUrl() {
        return this.labelImageUrl;
    }

    public final List<String> getLiveGameIconUrls() {
        return this.liveGameIconUrls;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final long getPoint() {
        return this.point;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((((((((((((this.rank.hashCode() * 31) + Long.hashCode(this.point)) * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.labelImageUrl.hashCode()) * 31) + this.liveId.hashCode()) * 31) + this.liveGameIconUrls.hashCode();
    }

    public String toString() {
        return "GiftRankingRanking(rank=" + this.rank + ", point=" + this.point + ", userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", labelImageUrl=" + this.labelImageUrl + ", liveId=" + this.liveId + ", liveGameIconUrls=" + this.liveGameIconUrls + ')';
    }
}
