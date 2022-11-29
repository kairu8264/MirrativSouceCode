package com.dena.mirrativ.mirrativapi.emomo.event.emomorun;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import java.io.Serializable;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class EmomoRunUserDetail implements Serializable {
    private final String badgeImageUrl;
    private final int highScore;
    private final String iconUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isBanned;
    private final String labelImageUrl;
    private final String liveId;
    private final String name;
    private final int rank;
    private final List<EmomoRunReward> rewards;
    private final int score;
    private final int userId;

    public EmomoRunUserDetail(int i10, String str, String str2, int i11, int i12, int i13, String str3, String str4, String str5, boolean z10, List<EmomoRunReward> list) {
        p.h(str, "liveId");
        p.h(str2, "name");
        p.h(str3, "iconUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "labelImageUrl");
        p.h(list, "rewards");
        this.userId = i10;
        this.liveId = str;
        this.name = str2;
        this.rank = i11;
        this.score = i12;
        this.highScore = i13;
        this.iconUrl = str3;
        this.badgeImageUrl = str4;
        this.labelImageUrl = str5;
        this.isBanned = z10;
        this.rewards = list;
    }

    public final int component1() {
        return this.userId;
    }

    public final boolean component10() {
        return this.isBanned;
    }

    public final List<EmomoRunReward> component11() {
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
        return this.score;
    }

    public final int component6() {
        return this.highScore;
    }

    public final String component7() {
        return this.iconUrl;
    }

    public final String component8() {
        return this.badgeImageUrl;
    }

    public final String component9() {
        return this.labelImageUrl;
    }

    public final EmomoRunUserDetail copy(int i10, String str, String str2, int i11, int i12, int i13, String str3, String str4, String str5, boolean z10, List<EmomoRunReward> list) {
        p.h(str, "liveId");
        p.h(str2, "name");
        p.h(str3, "iconUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "labelImageUrl");
        p.h(list, "rewards");
        return new EmomoRunUserDetail(i10, str, str2, i11, i12, i13, str3, str4, str5, z10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunUserDetail) {
            EmomoRunUserDetail emomoRunUserDetail = (EmomoRunUserDetail) obj;
            return this.userId == emomoRunUserDetail.userId && p.c(this.liveId, emomoRunUserDetail.liveId) && p.c(this.name, emomoRunUserDetail.name) && this.rank == emomoRunUserDetail.rank && this.score == emomoRunUserDetail.score && this.highScore == emomoRunUserDetail.highScore && p.c(this.iconUrl, emomoRunUserDetail.iconUrl) && p.c(this.badgeImageUrl, emomoRunUserDetail.badgeImageUrl) && p.c(this.labelImageUrl, emomoRunUserDetail.labelImageUrl) && this.isBanned == emomoRunUserDetail.isBanned && p.c(this.rewards, emomoRunUserDetail.rewards);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final int getHighScore() {
        return this.highScore;
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

    public final List<EmomoRunReward> getRewards() {
        return this.rewards;
    }

    public final int getScore() {
        return this.score;
    }

    public final int getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((((Integer.hashCode(this.userId) * 31) + this.liveId.hashCode()) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.highScore)) * 31) + this.iconUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.labelImageUrl.hashCode()) * 31;
        boolean z10 = this.isBanned;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.rewards.hashCode();
    }

    public final boolean isBanned() {
        return this.isBanned;
    }

    public String toString() {
        return "EmomoRunUserDetail(userId=" + this.userId + ", liveId=" + this.liveId + ", name=" + this.name + ", rank=" + this.rank + ", score=" + this.score + ", highScore=" + this.highScore + ", iconUrl=" + this.iconUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", labelImageUrl=" + this.labelImageUrl + ", isBanned=" + this.isBanned + ", rewards=" + this.rewards + ')';
    }
}
