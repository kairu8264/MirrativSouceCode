package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ShooterUserDetail {
    public static final int $stable = 8;
    private final String badgeImageUrl;
    private final String iconUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isBanned;
    private final String labelImageUrl;
    private final List<ShooterRewardMember> members;
    private final String name;
    private final int rank;
    private final ShooterRatingClass ratingClass;
    private final int ratingLegendRanking;
    private final int ratingPoint;
    private final List<ShooterReward> rewards;
    private final int score;
    private final int userId;
    private final int victoryCount;
    private final int victoryLevel;

    public ShooterUserDetail(int i10, String str, int i11, int i12, int i13, int i14, int i15, ShooterRatingClass shooterRatingClass, int i16, String str2, String str3, String str4, boolean z10, List<ShooterRewardMember> list, List<ShooterReward> list2) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(str3, "labelImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(list, "members");
        p.h(list2, "rewards");
        this.userId = i10;
        this.name = str;
        this.rank = i11;
        this.score = i12;
        this.victoryCount = i13;
        this.victoryLevel = i14;
        this.ratingPoint = i15;
        this.ratingClass = shooterRatingClass;
        this.ratingLegendRanking = i16;
        this.iconUrl = str2;
        this.labelImageUrl = str3;
        this.badgeImageUrl = str4;
        this.isBanned = z10;
        this.members = list;
        this.rewards = list2;
    }

    public final int component1() {
        return this.userId;
    }

    public final String component10() {
        return this.iconUrl;
    }

    public final String component11() {
        return this.labelImageUrl;
    }

    public final String component12() {
        return this.badgeImageUrl;
    }

    public final boolean component13() {
        return this.isBanned;
    }

    public final List<ShooterRewardMember> component14() {
        return this.members;
    }

    public final List<ShooterReward> component15() {
        return this.rewards;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.rank;
    }

    public final int component4() {
        return this.score;
    }

    public final int component5() {
        return this.victoryCount;
    }

    public final int component6() {
        return this.victoryLevel;
    }

    public final int component7() {
        return this.ratingPoint;
    }

    public final ShooterRatingClass component8() {
        return this.ratingClass;
    }

    public final int component9() {
        return this.ratingLegendRanking;
    }

    public final ShooterUserDetail copy(int i10, String str, int i11, int i12, int i13, int i14, int i15, ShooterRatingClass shooterRatingClass, int i16, String str2, String str3, String str4, boolean z10, List<ShooterRewardMember> list, List<ShooterReward> list2) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(str3, "labelImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(list, "members");
        p.h(list2, "rewards");
        return new ShooterUserDetail(i10, str, i11, i12, i13, i14, i15, shooterRatingClass, i16, str2, str3, str4, z10, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterUserDetail) {
            ShooterUserDetail shooterUserDetail = (ShooterUserDetail) obj;
            return this.userId == shooterUserDetail.userId && p.c(this.name, shooterUserDetail.name) && this.rank == shooterUserDetail.rank && this.score == shooterUserDetail.score && this.victoryCount == shooterUserDetail.victoryCount && this.victoryLevel == shooterUserDetail.victoryLevel && this.ratingPoint == shooterUserDetail.ratingPoint && p.c(this.ratingClass, shooterUserDetail.ratingClass) && this.ratingLegendRanking == shooterUserDetail.ratingLegendRanking && p.c(this.iconUrl, shooterUserDetail.iconUrl) && p.c(this.labelImageUrl, shooterUserDetail.labelImageUrl) && p.c(this.badgeImageUrl, shooterUserDetail.badgeImageUrl) && this.isBanned == shooterUserDetail.isBanned && p.c(this.members, shooterUserDetail.members) && p.c(this.rewards, shooterUserDetail.rewards);
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

    public final List<ShooterRewardMember> getMembers() {
        return this.members;
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

    public final List<ShooterReward> getRewards() {
        return this.rewards;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.userId) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.victoryCount)) * 31) + Integer.hashCode(this.victoryLevel)) * 31) + Integer.hashCode(this.ratingPoint)) * 31;
        ShooterRatingClass shooterRatingClass = this.ratingClass;
        int hashCode2 = (((((((((hashCode + (shooterRatingClass == null ? 0 : shooterRatingClass.hashCode())) * 31) + Integer.hashCode(this.ratingLegendRanking)) * 31) + this.iconUrl.hashCode()) * 31) + this.labelImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31;
        boolean z10 = this.isBanned;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode2 + i10) * 31) + this.members.hashCode()) * 31) + this.rewards.hashCode();
    }

    public final boolean isBanned() {
        return this.isBanned;
    }

    public String toString() {
        return "ShooterUserDetail(userId=" + this.userId + ", name=" + this.name + ", rank=" + this.rank + ", score=" + this.score + ", victoryCount=" + this.victoryCount + ", victoryLevel=" + this.victoryLevel + ", ratingPoint=" + this.ratingPoint + ", ratingClass=" + this.ratingClass + ", ratingLegendRanking=" + this.ratingLegendRanking + ", iconUrl=" + this.iconUrl + ", labelImageUrl=" + this.labelImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", isBanned=" + this.isBanned + ", members=" + this.members + ", rewards=" + this.rewards + ')';
    }
}
