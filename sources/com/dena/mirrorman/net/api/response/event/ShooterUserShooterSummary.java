package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ShooterUserShooterSummary {
    public static final int $stable = 0;
    private final String badgeImageUrl;
    private final int highScore;
    private final int highScoreRank;
    private final String iconUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isBanned;
    private final String labelImageUrl;
    private final String name;
    private final ShooterRatingClass ratingClass;
    private final int ratingPoint;
    private final int ratingRank;
    private final int totalScore;
    private final int totalScoreRank;
    private final int userId;
    private final int victoryCount;
    private final int victoryLevel;

    public ShooterUserShooterSummary(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, ShooterRatingClass shooterRatingClass, int i17, int i18, String str2, String str3, String str4, boolean z10) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(str3, "labelImageUrl");
        p.h(str4, "badgeImageUrl");
        this.userId = i10;
        this.name = str;
        this.totalScoreRank = i11;
        this.totalScore = i12;
        this.highScoreRank = i13;
        this.highScore = i14;
        this.ratingRank = i15;
        this.ratingPoint = i16;
        this.ratingClass = shooterRatingClass;
        this.victoryCount = i17;
        this.victoryLevel = i18;
        this.iconUrl = str2;
        this.labelImageUrl = str3;
        this.badgeImageUrl = str4;
        this.isBanned = z10;
    }

    public final int component1() {
        return this.userId;
    }

    public final int component10() {
        return this.victoryCount;
    }

    public final int component11() {
        return this.victoryLevel;
    }

    public final String component12() {
        return this.iconUrl;
    }

    public final String component13() {
        return this.labelImageUrl;
    }

    public final String component14() {
        return this.badgeImageUrl;
    }

    public final boolean component15() {
        return this.isBanned;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.totalScoreRank;
    }

    public final int component4() {
        return this.totalScore;
    }

    public final int component5() {
        return this.highScoreRank;
    }

    public final int component6() {
        return this.highScore;
    }

    public final int component7() {
        return this.ratingRank;
    }

    public final int component8() {
        return this.ratingPoint;
    }

    public final ShooterRatingClass component9() {
        return this.ratingClass;
    }

    public final ShooterUserShooterSummary copy(int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, ShooterRatingClass shooterRatingClass, int i17, int i18, String str2, String str3, String str4, boolean z10) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(str3, "labelImageUrl");
        p.h(str4, "badgeImageUrl");
        return new ShooterUserShooterSummary(i10, str, i11, i12, i13, i14, i15, i16, shooterRatingClass, i17, i18, str2, str3, str4, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterUserShooterSummary) {
            ShooterUserShooterSummary shooterUserShooterSummary = (ShooterUserShooterSummary) obj;
            return this.userId == shooterUserShooterSummary.userId && p.c(this.name, shooterUserShooterSummary.name) && this.totalScoreRank == shooterUserShooterSummary.totalScoreRank && this.totalScore == shooterUserShooterSummary.totalScore && this.highScoreRank == shooterUserShooterSummary.highScoreRank && this.highScore == shooterUserShooterSummary.highScore && this.ratingRank == shooterUserShooterSummary.ratingRank && this.ratingPoint == shooterUserShooterSummary.ratingPoint && p.c(this.ratingClass, shooterUserShooterSummary.ratingClass) && this.victoryCount == shooterUserShooterSummary.victoryCount && this.victoryLevel == shooterUserShooterSummary.victoryLevel && p.c(this.iconUrl, shooterUserShooterSummary.iconUrl) && p.c(this.labelImageUrl, shooterUserShooterSummary.labelImageUrl) && p.c(this.badgeImageUrl, shooterUserShooterSummary.badgeImageUrl) && this.isBanned == shooterUserShooterSummary.isBanned;
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final int getHighScore() {
        return this.highScore;
    }

    public final int getHighScoreRank() {
        return this.highScoreRank;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLabelImageUrl() {
        return this.labelImageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final ShooterRatingClass getRatingClass() {
        return this.ratingClass;
    }

    public final int getRatingPoint() {
        return this.ratingPoint;
    }

    public final int getRatingRank() {
        return this.ratingRank;
    }

    public final int getTotalScore() {
        return this.totalScore;
    }

    public final int getTotalScoreRank() {
        return this.totalScoreRank;
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
        int hashCode = ((((((((((((((Integer.hashCode(this.userId) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.totalScoreRank)) * 31) + Integer.hashCode(this.totalScore)) * 31) + Integer.hashCode(this.highScoreRank)) * 31) + Integer.hashCode(this.highScore)) * 31) + Integer.hashCode(this.ratingRank)) * 31) + Integer.hashCode(this.ratingPoint)) * 31;
        ShooterRatingClass shooterRatingClass = this.ratingClass;
        int hashCode2 = (((((((((((hashCode + (shooterRatingClass == null ? 0 : shooterRatingClass.hashCode())) * 31) + Integer.hashCode(this.victoryCount)) * 31) + Integer.hashCode(this.victoryLevel)) * 31) + this.iconUrl.hashCode()) * 31) + this.labelImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31;
        boolean z10 = this.isBanned;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode2 + i10;
    }

    public final boolean isBanned() {
        return this.isBanned;
    }

    public String toString() {
        return "ShooterUserShooterSummary(userId=" + this.userId + ", name=" + this.name + ", totalScoreRank=" + this.totalScoreRank + ", totalScore=" + this.totalScore + ", highScoreRank=" + this.highScoreRank + ", highScore=" + this.highScore + ", ratingRank=" + this.ratingRank + ", ratingPoint=" + this.ratingPoint + ", ratingClass=" + this.ratingClass + ", victoryCount=" + this.victoryCount + ", victoryLevel=" + this.victoryLevel + ", iconUrl=" + this.iconUrl + ", labelImageUrl=" + this.labelImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", isBanned=" + this.isBanned + ')';
    }
}
