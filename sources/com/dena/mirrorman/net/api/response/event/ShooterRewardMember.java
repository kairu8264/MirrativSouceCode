package com.dena.mirrorman.net.api.response.event;

import jo.p;

/* loaded from: classes2.dex */
public final class ShooterRewardMember {
    public static final int $stable = 0;
    private final String badgeImageUrl;
    private final String iconUrl;
    private final String labelImageUrl;
    private final String name;
    private final int score;
    private final int userId;
    private final int victoryCount;
    private final int victoryLevel;

    public ShooterRewardMember(int i10, String str, String str2, String str3, String str4, int i11, int i12, int i13) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(str3, "labelImageUrl");
        p.h(str4, "badgeImageUrl");
        this.userId = i10;
        this.name = str;
        this.iconUrl = str2;
        this.labelImageUrl = str3;
        this.badgeImageUrl = str4;
        this.score = i11;
        this.victoryCount = i12;
        this.victoryLevel = i13;
    }

    public final int component1() {
        return this.userId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final String component4() {
        return this.labelImageUrl;
    }

    public final String component5() {
        return this.badgeImageUrl;
    }

    public final int component6() {
        return this.score;
    }

    public final int component7() {
        return this.victoryCount;
    }

    public final int component8() {
        return this.victoryLevel;
    }

    public final ShooterRewardMember copy(int i10, String str, String str2, String str3, String str4, int i11, int i12, int i13) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(str3, "labelImageUrl");
        p.h(str4, "badgeImageUrl");
        return new ShooterRewardMember(i10, str, str2, str3, str4, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterRewardMember) {
            ShooterRewardMember shooterRewardMember = (ShooterRewardMember) obj;
            return this.userId == shooterRewardMember.userId && p.c(this.name, shooterRewardMember.name) && p.c(this.iconUrl, shooterRewardMember.iconUrl) && p.c(this.labelImageUrl, shooterRewardMember.labelImageUrl) && p.c(this.badgeImageUrl, shooterRewardMember.badgeImageUrl) && this.score == shooterRewardMember.score && this.victoryCount == shooterRewardMember.victoryCount && this.victoryLevel == shooterRewardMember.victoryLevel;
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
        return (((((((((((((Integer.hashCode(this.userId) * 31) + this.name.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.labelImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.victoryCount)) * 31) + Integer.hashCode(this.victoryLevel);
    }

    public String toString() {
        return "ShooterRewardMember(userId=" + this.userId + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", labelImageUrl=" + this.labelImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", score=" + this.score + ", victoryCount=" + this.victoryCount + ", victoryLevel=" + this.victoryLevel + ')';
    }
}
