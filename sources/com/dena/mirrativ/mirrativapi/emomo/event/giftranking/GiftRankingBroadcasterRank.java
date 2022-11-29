package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

import jo.p;

/* loaded from: classes2.dex */
public final class GiftRankingBroadcasterRank {
    private final String badgeImageUrl;
    private final int giftPoint;
    private final String iconUrl;
    private final String labelImageUrl;
    private final GiftRankingRank lowerUser;
    private final String name;
    private final int rank;
    private final GiftRankingRank upperUser;
    private final String userGrade;

    public GiftRankingBroadcasterRank(String str, String str2, String str3, String str4, String str5, int i10, int i11, GiftRankingRank giftRankingRank, GiftRankingRank giftRankingRank2) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(str3, "labelImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "userGrade");
        this.name = str;
        this.iconUrl = str2;
        this.labelImageUrl = str3;
        this.badgeImageUrl = str4;
        this.userGrade = str5;
        this.giftPoint = i10;
        this.rank = i11;
        this.upperUser = giftRankingRank;
        this.lowerUser = giftRankingRank2;
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.labelImageUrl;
    }

    public final String component4() {
        return this.badgeImageUrl;
    }

    public final String component5() {
        return this.userGrade;
    }

    public final int component6() {
        return this.giftPoint;
    }

    public final int component7() {
        return this.rank;
    }

    public final GiftRankingRank component8() {
        return this.upperUser;
    }

    public final GiftRankingRank component9() {
        return this.lowerUser;
    }

    public final GiftRankingBroadcasterRank copy(String str, String str2, String str3, String str4, String str5, int i10, int i11, GiftRankingRank giftRankingRank, GiftRankingRank giftRankingRank2) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(str3, "labelImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "userGrade");
        return new GiftRankingBroadcasterRank(str, str2, str3, str4, str5, i10, i11, giftRankingRank, giftRankingRank2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingBroadcasterRank) {
            GiftRankingBroadcasterRank giftRankingBroadcasterRank = (GiftRankingBroadcasterRank) obj;
            return p.c(this.name, giftRankingBroadcasterRank.name) && p.c(this.iconUrl, giftRankingBroadcasterRank.iconUrl) && p.c(this.labelImageUrl, giftRankingBroadcasterRank.labelImageUrl) && p.c(this.badgeImageUrl, giftRankingBroadcasterRank.badgeImageUrl) && p.c(this.userGrade, giftRankingBroadcasterRank.userGrade) && this.giftPoint == giftRankingBroadcasterRank.giftPoint && this.rank == giftRankingBroadcasterRank.rank && p.c(this.upperUser, giftRankingBroadcasterRank.upperUser) && p.c(this.lowerUser, giftRankingBroadcasterRank.lowerUser);
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

    public final GiftRankingRank getLowerUser() {
        return this.lowerUser;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRank() {
        return this.rank;
    }

    public final GiftRankingRank getUpperUser() {
        return this.upperUser;
    }

    public final String getUserGrade() {
        return this.userGrade;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.name.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + this.labelImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.userGrade.hashCode()) * 31) + Integer.hashCode(this.giftPoint)) * 31) + Integer.hashCode(this.rank)) * 31;
        GiftRankingRank giftRankingRank = this.upperUser;
        int hashCode2 = (hashCode + (giftRankingRank == null ? 0 : giftRankingRank.hashCode())) * 31;
        GiftRankingRank giftRankingRank2 = this.lowerUser;
        return hashCode2 + (giftRankingRank2 != null ? giftRankingRank2.hashCode() : 0);
    }

    public String toString() {
        return "GiftRankingBroadcasterRank(name=" + this.name + ", iconUrl=" + this.iconUrl + ", labelImageUrl=" + this.labelImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", userGrade=" + this.userGrade + ", giftPoint=" + this.giftPoint + ", rank=" + this.rank + ", upperUser=" + this.upperUser + ", lowerUser=" + this.lowerUser + ')';
    }
}
