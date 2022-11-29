package com.dena.mirrorman.net.api.response.event;

import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ShooterRankingUser implements Serializable {
    public static final int $stable = 8;
    private final String badgeImageUrl;
    private final String iconUrl;
    private final String labelImageUrl;
    private final String liveId;
    private final List<String> memberImageUrls;
    private final List<Integer> memberVictoryLevels;
    private final String name;
    private final int rank;
    private final ShooterRatingClass ratingClass;
    private final int ratingLegendRanking;
    private final int ratingPoint;
    private final int score;
    private final int userId;
    private final int victoryCount;
    private final int victoryLevel;

    public ShooterRankingUser(int i10, String str, String str2, int i11, int i12, int i13, int i14, int i15, ShooterRatingClass shooterRatingClass, int i16, String str3, String str4, String str5, List<String> list, List<Integer> list2) {
        p.h(str, "liveId");
        p.h(str2, "name");
        p.h(str3, "iconUrl");
        p.h(str4, "labelImageUrl");
        p.h(str5, "badgeImageUrl");
        p.h(list, "memberImageUrls");
        p.h(list2, "memberVictoryLevels");
        this.userId = i10;
        this.liveId = str;
        this.name = str2;
        this.rank = i11;
        this.score = i12;
        this.victoryCount = i13;
        this.victoryLevel = i14;
        this.ratingPoint = i15;
        this.ratingClass = shooterRatingClass;
        this.ratingLegendRanking = i16;
        this.iconUrl = str3;
        this.labelImageUrl = str4;
        this.badgeImageUrl = str5;
        this.memberImageUrls = list;
        this.memberVictoryLevels = list2;
    }

    public final int component1() {
        return this.userId;
    }

    public final int component10() {
        return this.ratingLegendRanking;
    }

    public final String component11() {
        return this.iconUrl;
    }

    public final String component12() {
        return this.labelImageUrl;
    }

    public final String component13() {
        return this.badgeImageUrl;
    }

    public final List<String> component14() {
        return this.memberImageUrls;
    }

    public final List<Integer> component15() {
        return this.memberVictoryLevels;
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
        return this.score;
    }

    public final int component6() {
        return this.victoryCount;
    }

    public final int component7() {
        return this.victoryLevel;
    }

    public final int component8() {
        return this.ratingPoint;
    }

    public final ShooterRatingClass component9() {
        return this.ratingClass;
    }

    public final ShooterRankingUser copy(int i10, String str, String str2, int i11, int i12, int i13, int i14, int i15, ShooterRatingClass shooterRatingClass, int i16, String str3, String str4, String str5, List<String> list, List<Integer> list2) {
        p.h(str, "liveId");
        p.h(str2, "name");
        p.h(str3, "iconUrl");
        p.h(str4, "labelImageUrl");
        p.h(str5, "badgeImageUrl");
        p.h(list, "memberImageUrls");
        p.h(list2, "memberVictoryLevels");
        return new ShooterRankingUser(i10, str, str2, i11, i12, i13, i14, i15, shooterRatingClass, i16, str3, str4, str5, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterRankingUser) {
            ShooterRankingUser shooterRankingUser = (ShooterRankingUser) obj;
            return this.userId == shooterRankingUser.userId && p.c(this.liveId, shooterRankingUser.liveId) && p.c(this.name, shooterRankingUser.name) && this.rank == shooterRankingUser.rank && this.score == shooterRankingUser.score && this.victoryCount == shooterRankingUser.victoryCount && this.victoryLevel == shooterRankingUser.victoryLevel && this.ratingPoint == shooterRankingUser.ratingPoint && p.c(this.ratingClass, shooterRankingUser.ratingClass) && this.ratingLegendRanking == shooterRankingUser.ratingLegendRanking && p.c(this.iconUrl, shooterRankingUser.iconUrl) && p.c(this.labelImageUrl, shooterRankingUser.labelImageUrl) && p.c(this.badgeImageUrl, shooterRankingUser.badgeImageUrl) && p.c(this.memberImageUrls, shooterRankingUser.memberImageUrls) && p.c(this.memberVictoryLevels, shooterRankingUser.memberVictoryLevels);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
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

    public final List<String> getMemberImageUrls() {
        return this.memberImageUrls;
    }

    public final List<Integer> getMemberVictoryLevels() {
        return this.memberVictoryLevels;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRank() {
        return this.rank;
    }

    public final ShooterRatingClass getRatingClass() {
        return this.ratingClass;
    }

    public final int getRatingLegendRanking() {
        return this.ratingLegendRanking;
    }

    public final int getRatingPoint() {
        return this.ratingPoint;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getVictoryCount() {
        return this.victoryCount;
    }

    public final int getVictoryLevel() {
        return this.victoryLevel;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.userId) * 31) + this.liveId.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.victoryCount)) * 31) + Integer.hashCode(this.victoryLevel)) * 31) + Integer.hashCode(this.ratingPoint)) * 31;
        ShooterRatingClass shooterRatingClass = this.ratingClass;
        return ((((((((((((hashCode + (shooterRatingClass == null ? 0 : shooterRatingClass.hashCode())) * 31) + Integer.hashCode(this.ratingLegendRanking)) * 31) + this.iconUrl.hashCode()) * 31) + this.labelImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.memberImageUrls.hashCode()) * 31) + this.memberVictoryLevels.hashCode();
    }

    public String toString() {
        return "ShooterRankingUser(userId=" + this.userId + ", liveId=" + this.liveId + ", name=" + this.name + ", rank=" + this.rank + ", score=" + this.score + ", victoryCount=" + this.victoryCount + ", victoryLevel=" + this.victoryLevel + ", ratingPoint=" + this.ratingPoint + ", ratingClass=" + this.ratingClass + ", ratingLegendRanking=" + this.ratingLegendRanking + ", iconUrl=" + this.iconUrl + ", labelImageUrl=" + this.labelImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", memberImageUrls=" + this.memberImageUrls + ", memberVictoryLevels=" + this.memberVictoryLevels + ')';
    }
}
