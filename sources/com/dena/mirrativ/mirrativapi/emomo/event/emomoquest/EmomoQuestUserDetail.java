package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class EmomoQuestUserDetail {
    private final String badgeImageUrl;
    private final String grade;
    private final String iconUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isBanned;
    private final String labelImageUrl;
    private final String name;
    private final int rank;
    private final List<EmomoQuestReward> rewards;
    private final int score;
    private final int userId;

    public EmomoQuestUserDetail(int i10, String str, String str2, int i11, int i12, String str3, String str4, String str5, boolean z10, List<EmomoQuestReward> list) {
        p.h(str, "name");
        p.h(str2, "grade");
        p.h(str3, "iconUrl");
        p.h(str4, "labelImageUrl");
        p.h(str5, "badgeImageUrl");
        p.h(list, "rewards");
        this.userId = i10;
        this.name = str;
        this.grade = str2;
        this.rank = i11;
        this.score = i12;
        this.iconUrl = str3;
        this.labelImageUrl = str4;
        this.badgeImageUrl = str5;
        this.isBanned = z10;
        this.rewards = list;
    }

    public final int component1() {
        return this.userId;
    }

    public final List<EmomoQuestReward> component10() {
        return this.rewards;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.grade;
    }

    public final int component4() {
        return this.rank;
    }

    public final int component5() {
        return this.score;
    }

    public final String component6() {
        return this.iconUrl;
    }

    public final String component7() {
        return this.labelImageUrl;
    }

    public final String component8() {
        return this.badgeImageUrl;
    }

    public final boolean component9() {
        return this.isBanned;
    }

    public final EmomoQuestUserDetail copy(int i10, String str, String str2, int i11, int i12, String str3, String str4, String str5, boolean z10, List<EmomoQuestReward> list) {
        p.h(str, "name");
        p.h(str2, "grade");
        p.h(str3, "iconUrl");
        p.h(str4, "labelImageUrl");
        p.h(str5, "badgeImageUrl");
        p.h(list, "rewards");
        return new EmomoQuestUserDetail(i10, str, str2, i11, i12, str3, str4, str5, z10, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestUserDetail) {
            EmomoQuestUserDetail emomoQuestUserDetail = (EmomoQuestUserDetail) obj;
            return this.userId == emomoQuestUserDetail.userId && p.c(this.name, emomoQuestUserDetail.name) && p.c(this.grade, emomoQuestUserDetail.grade) && this.rank == emomoQuestUserDetail.rank && this.score == emomoQuestUserDetail.score && p.c(this.iconUrl, emomoQuestUserDetail.iconUrl) && p.c(this.labelImageUrl, emomoQuestUserDetail.labelImageUrl) && p.c(this.badgeImageUrl, emomoQuestUserDetail.badgeImageUrl) && this.isBanned == emomoQuestUserDetail.isBanned && p.c(this.rewards, emomoQuestUserDetail.rewards);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final String getGrade() {
        return this.grade;
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

    public final List<EmomoQuestReward> getRewards() {
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
        int hashCode = ((((((((((((((Integer.hashCode(this.userId) * 31) + this.name.hashCode()) * 31) + this.grade.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.score)) * 31) + this.iconUrl.hashCode()) * 31) + this.labelImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31;
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
        return "EmomoQuestUserDetail(userId=" + this.userId + ", name=" + this.name + ", grade=" + this.grade + ", rank=" + this.rank + ", score=" + this.score + ", iconUrl=" + this.iconUrl + ", labelImageUrl=" + this.labelImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", isBanned=" + this.isBanned + ", rewards=" + this.rewards + ')';
    }
}
