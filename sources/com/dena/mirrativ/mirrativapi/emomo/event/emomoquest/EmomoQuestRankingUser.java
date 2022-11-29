package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import jo.p;

/* loaded from: classes2.dex */
public final class EmomoQuestRankingUser {
    private final String badgeImageUrl;
    private final String iconUrl;
    private final String labelImageUrl;
    private final String name;
    private final int rank;
    private final int score;
    private final int userId;

    public EmomoQuestRankingUser(int i10, String str, int i11, int i12, String str2, String str3, String str4) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(str3, "labelImageUrl");
        p.h(str4, "badgeImageUrl");
        this.userId = i10;
        this.name = str;
        this.rank = i11;
        this.score = i12;
        this.iconUrl = str2;
        this.labelImageUrl = str3;
        this.badgeImageUrl = str4;
    }

    public static /* synthetic */ EmomoQuestRankingUser copy$default(EmomoQuestRankingUser emomoQuestRankingUser, int i10, String str, int i11, int i12, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = emomoQuestRankingUser.userId;
        }
        if ((i13 & 2) != 0) {
            str = emomoQuestRankingUser.name;
        }
        String str5 = str;
        if ((i13 & 4) != 0) {
            i11 = emomoQuestRankingUser.rank;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = emomoQuestRankingUser.score;
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            str2 = emomoQuestRankingUser.iconUrl;
        }
        String str6 = str2;
        if ((i13 & 32) != 0) {
            str3 = emomoQuestRankingUser.labelImageUrl;
        }
        String str7 = str3;
        if ((i13 & 64) != 0) {
            str4 = emomoQuestRankingUser.badgeImageUrl;
        }
        return emomoQuestRankingUser.copy(i10, str5, i14, i15, str6, str7, str4);
    }

    public final int component1() {
        return this.userId;
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

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.labelImageUrl;
    }

    public final String component7() {
        return this.badgeImageUrl;
    }

    public final EmomoQuestRankingUser copy(int i10, String str, int i11, int i12, String str2, String str3, String str4) {
        p.h(str, "name");
        p.h(str2, "iconUrl");
        p.h(str3, "labelImageUrl");
        p.h(str4, "badgeImageUrl");
        return new EmomoQuestRankingUser(i10, str, i11, i12, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestRankingUser) {
            EmomoQuestRankingUser emomoQuestRankingUser = (EmomoQuestRankingUser) obj;
            return this.userId == emomoQuestRankingUser.userId && p.c(this.name, emomoQuestRankingUser.name) && this.rank == emomoQuestRankingUser.rank && this.score == emomoQuestRankingUser.score && p.c(this.iconUrl, emomoQuestRankingUser.iconUrl) && p.c(this.labelImageUrl, emomoQuestRankingUser.labelImageUrl) && p.c(this.badgeImageUrl, emomoQuestRankingUser.badgeImageUrl);
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

    public final int getRank() {
        return this.rank;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.userId) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.score)) * 31) + this.iconUrl.hashCode()) * 31) + this.labelImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode();
    }

    public String toString() {
        return "EmomoQuestRankingUser(userId=" + this.userId + ", name=" + this.name + ", rank=" + this.rank + ", score=" + this.score + ", iconUrl=" + this.iconUrl + ", labelImageUrl=" + this.labelImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ')';
    }
}
