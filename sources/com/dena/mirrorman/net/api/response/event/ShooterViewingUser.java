package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ShooterViewingUser {
    public static final int $stable = 0;
    private final String badgeImageUrl;
    private final String iconUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isCompleted;
    @b(BooleanTypeAdapter.class)
    private final boolean isMatchingViewer;
    private final String labelImageUrl;
    private final String name;
    private final String nextRewardIconUrl;
    private final int nextRewardThreshold;
    private final ShooterRatingClass ratingClass;
    private final int ratingLegendRanking;
    private final int ratingPoint;
    private final int score;
    private final String userId;
    private final int victoryCount;
    private final int victoryLevel;

    public ShooterViewingUser(String str, String str2, int i10, int i11, int i12, int i13, ShooterRatingClass shooterRatingClass, int i14, String str3, String str4, String str5, String str6, int i15, boolean z10, boolean z11) {
        p.h(str, "userId");
        p.h(str2, "name");
        p.h(str3, "iconUrl");
        this.userId = str;
        this.name = str2;
        this.score = i10;
        this.victoryCount = i11;
        this.victoryLevel = i12;
        this.ratingPoint = i13;
        this.ratingClass = shooterRatingClass;
        this.ratingLegendRanking = i14;
        this.iconUrl = str3;
        this.labelImageUrl = str4;
        this.badgeImageUrl = str5;
        this.nextRewardIconUrl = str6;
        this.nextRewardThreshold = i15;
        this.isCompleted = z10;
        this.isMatchingViewer = z11;
    }

    public final String component1() {
        return this.userId;
    }

    public final String component10() {
        return this.labelImageUrl;
    }

    public final String component11() {
        return this.badgeImageUrl;
    }

    public final String component12() {
        return this.nextRewardIconUrl;
    }

    public final int component13() {
        return this.nextRewardThreshold;
    }

    public final boolean component14() {
        return this.isCompleted;
    }

    public final boolean component15() {
        return this.isMatchingViewer;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.score;
    }

    public final int component4() {
        return this.victoryCount;
    }

    public final int component5() {
        return this.victoryLevel;
    }

    public final int component6() {
        return this.ratingPoint;
    }

    public final ShooterRatingClass component7() {
        return this.ratingClass;
    }

    public final int component8() {
        return this.ratingLegendRanking;
    }

    public final String component9() {
        return this.iconUrl;
    }

    public final ShooterViewingUser copy(String str, String str2, int i10, int i11, int i12, int i13, ShooterRatingClass shooterRatingClass, int i14, String str3, String str4, String str5, String str6, int i15, boolean z10, boolean z11) {
        p.h(str, "userId");
        p.h(str2, "name");
        p.h(str3, "iconUrl");
        return new ShooterViewingUser(str, str2, i10, i11, i12, i13, shooterRatingClass, i14, str3, str4, str5, str6, i15, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterViewingUser) {
            ShooterViewingUser shooterViewingUser = (ShooterViewingUser) obj;
            return p.c(this.userId, shooterViewingUser.userId) && p.c(this.name, shooterViewingUser.name) && this.score == shooterViewingUser.score && this.victoryCount == shooterViewingUser.victoryCount && this.victoryLevel == shooterViewingUser.victoryLevel && this.ratingPoint == shooterViewingUser.ratingPoint && p.c(this.ratingClass, shooterViewingUser.ratingClass) && this.ratingLegendRanking == shooterViewingUser.ratingLegendRanking && p.c(this.iconUrl, shooterViewingUser.iconUrl) && p.c(this.labelImageUrl, shooterViewingUser.labelImageUrl) && p.c(this.badgeImageUrl, shooterViewingUser.badgeImageUrl) && p.c(this.nextRewardIconUrl, shooterViewingUser.nextRewardIconUrl) && this.nextRewardThreshold == shooterViewingUser.nextRewardThreshold && this.isCompleted == shooterViewingUser.isCompleted && this.isMatchingViewer == shooterViewingUser.isMatchingViewer;
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

    public final String getName() {
        return this.name;
    }

    public final String getNextRewardIconUrl() {
        return this.nextRewardIconUrl;
    }

    public final int getNextRewardThreshold() {
        return this.nextRewardThreshold;
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

    public final String getUserId() {
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
        int hashCode = ((((((((((this.userId.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.victoryCount)) * 31) + Integer.hashCode(this.victoryLevel)) * 31) + Integer.hashCode(this.ratingPoint)) * 31;
        ShooterRatingClass shooterRatingClass = this.ratingClass;
        int hashCode2 = (((((hashCode + (shooterRatingClass == null ? 0 : shooterRatingClass.hashCode())) * 31) + Integer.hashCode(this.ratingLegendRanking)) * 31) + this.iconUrl.hashCode()) * 31;
        String str = this.labelImageUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badgeImageUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nextRewardIconUrl;
        int hashCode5 = (((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.nextRewardThreshold)) * 31;
        boolean z10 = this.isCompleted;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode5 + i10) * 31;
        boolean z11 = this.isMatchingViewer;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final boolean isMatchingViewer() {
        return this.isMatchingViewer;
    }

    public String toString() {
        return "ShooterViewingUser(userId=" + this.userId + ", name=" + this.name + ", score=" + this.score + ", victoryCount=" + this.victoryCount + ", victoryLevel=" + this.victoryLevel + ", ratingPoint=" + this.ratingPoint + ", ratingClass=" + this.ratingClass + ", ratingLegendRanking=" + this.ratingLegendRanking + ", iconUrl=" + this.iconUrl + ", labelImageUrl=" + this.labelImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", nextRewardIconUrl=" + this.nextRewardIconUrl + ", nextRewardThreshold=" + this.nextRewardThreshold + ", isCompleted=" + this.isCompleted + ", isMatchingViewer=" + this.isMatchingViewer + ')';
    }

    public /* synthetic */ ShooterViewingUser(String str, String str2, int i10, int i11, int i12, int i13, ShooterRatingClass shooterRatingClass, int i14, String str3, String str4, String str5, String str6, int i15, boolean z10, boolean z11, int i16, h hVar) {
        this((i16 & 1) != 0 ? "" : str, (i16 & 2) != 0 ? "" : str2, i10, i11, i12, i13, shooterRatingClass, i14, (i16 & 256) != 0 ? "" : str3, (i16 & 512) != 0 ? null : str4, (i16 & 1024) != 0 ? null : str5, (i16 & 2048) != 0 ? null : str6, i15, z10, z11);
    }
}
