package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import com.dena.mirrativ.mirrativapi.common.Description;
import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoQuestEventResponse {
    private final String achievedImageUrl;
    private final List<Description> descriptions;
    private final String footerImageUrl;
    private final String gachaPageUrl;
    private final int giftEventId;
    private final String gradeHelpUrl;
    private final String gradeImageUrl;
    private final String imageUrl;
    private final EmomoQuestUserDetail rankReward;
    private final List<EmomoQuestRankingUser> rankings;
    private final String rulePageUrl;
    private final List<EmomoQuestReward> stageRewards;
    private final Status status;
    private final String subtitle;
    private final String title;

    public EmomoQuestEventResponse(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<Description> list, List<EmomoQuestReward> list2, EmomoQuestUserDetail emomoQuestUserDetail, List<EmomoQuestRankingUser> list3, String str9, Status status) {
        p.h(str, "imageUrl");
        p.h(str2, "footerImageUrl");
        p.h(str3, "rulePageUrl");
        p.h(str4, "gachaPageUrl");
        p.h(str5, "title");
        p.h(str6, "subtitle");
        p.h(str7, "achievedImageUrl");
        p.h(str8, "gradeImageUrl");
        p.h(list, "descriptions");
        p.h(list2, "stageRewards");
        p.h(emomoQuestUserDetail, "rankReward");
        p.h(list3, "rankings");
        p.h(str9, "gradeHelpUrl");
        p.h(status, "status");
        this.giftEventId = i10;
        this.imageUrl = str;
        this.footerImageUrl = str2;
        this.rulePageUrl = str3;
        this.gachaPageUrl = str4;
        this.title = str5;
        this.subtitle = str6;
        this.achievedImageUrl = str7;
        this.gradeImageUrl = str8;
        this.descriptions = list;
        this.stageRewards = list2;
        this.rankReward = emomoQuestUserDetail;
        this.rankings = list3;
        this.gradeHelpUrl = str9;
        this.status = status;
    }

    public final int component1() {
        return this.giftEventId;
    }

    public final List<Description> component10() {
        return this.descriptions;
    }

    public final List<EmomoQuestReward> component11() {
        return this.stageRewards;
    }

    public final EmomoQuestUserDetail component12() {
        return this.rankReward;
    }

    public final List<EmomoQuestRankingUser> component13() {
        return this.rankings;
    }

    public final String component14() {
        return this.gradeHelpUrl;
    }

    public final Status component15() {
        return this.status;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.footerImageUrl;
    }

    public final String component4() {
        return this.rulePageUrl;
    }

    public final String component5() {
        return this.gachaPageUrl;
    }

    public final String component6() {
        return this.title;
    }

    public final String component7() {
        return this.subtitle;
    }

    public final String component8() {
        return this.achievedImageUrl;
    }

    public final String component9() {
        return this.gradeImageUrl;
    }

    public final EmomoQuestEventResponse copy(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<Description> list, List<EmomoQuestReward> list2, EmomoQuestUserDetail emomoQuestUserDetail, List<EmomoQuestRankingUser> list3, String str9, Status status) {
        p.h(str, "imageUrl");
        p.h(str2, "footerImageUrl");
        p.h(str3, "rulePageUrl");
        p.h(str4, "gachaPageUrl");
        p.h(str5, "title");
        p.h(str6, "subtitle");
        p.h(str7, "achievedImageUrl");
        p.h(str8, "gradeImageUrl");
        p.h(list, "descriptions");
        p.h(list2, "stageRewards");
        p.h(emomoQuestUserDetail, "rankReward");
        p.h(list3, "rankings");
        p.h(str9, "gradeHelpUrl");
        p.h(status, "status");
        return new EmomoQuestEventResponse(i10, str, str2, str3, str4, str5, str6, str7, str8, list, list2, emomoQuestUserDetail, list3, str9, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestEventResponse) {
            EmomoQuestEventResponse emomoQuestEventResponse = (EmomoQuestEventResponse) obj;
            return this.giftEventId == emomoQuestEventResponse.giftEventId && p.c(this.imageUrl, emomoQuestEventResponse.imageUrl) && p.c(this.footerImageUrl, emomoQuestEventResponse.footerImageUrl) && p.c(this.rulePageUrl, emomoQuestEventResponse.rulePageUrl) && p.c(this.gachaPageUrl, emomoQuestEventResponse.gachaPageUrl) && p.c(this.title, emomoQuestEventResponse.title) && p.c(this.subtitle, emomoQuestEventResponse.subtitle) && p.c(this.achievedImageUrl, emomoQuestEventResponse.achievedImageUrl) && p.c(this.gradeImageUrl, emomoQuestEventResponse.gradeImageUrl) && p.c(this.descriptions, emomoQuestEventResponse.descriptions) && p.c(this.stageRewards, emomoQuestEventResponse.stageRewards) && p.c(this.rankReward, emomoQuestEventResponse.rankReward) && p.c(this.rankings, emomoQuestEventResponse.rankings) && p.c(this.gradeHelpUrl, emomoQuestEventResponse.gradeHelpUrl) && p.c(this.status, emomoQuestEventResponse.status);
        }
        return false;
    }

    public final String getAchievedImageUrl() {
        return this.achievedImageUrl;
    }

    public final List<Description> getDescriptions() {
        return this.descriptions;
    }

    public final String getFooterImageUrl() {
        return this.footerImageUrl;
    }

    public final String getGachaPageUrl() {
        return this.gachaPageUrl;
    }

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    public final String getGradeHelpUrl() {
        return this.gradeHelpUrl;
    }

    public final String getGradeImageUrl() {
        return this.gradeImageUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final EmomoQuestUserDetail getRankReward() {
        return this.rankReward;
    }

    public final List<EmomoQuestRankingUser> getRankings() {
        return this.rankings;
    }

    public final String getRulePageUrl() {
        return this.rulePageUrl;
    }

    public final List<EmomoQuestReward> getStageRewards() {
        return this.stageRewards;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Integer.hashCode(this.giftEventId) * 31) + this.imageUrl.hashCode()) * 31) + this.footerImageUrl.hashCode()) * 31) + this.rulePageUrl.hashCode()) * 31) + this.gachaPageUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.achievedImageUrl.hashCode()) * 31) + this.gradeImageUrl.hashCode()) * 31) + this.descriptions.hashCode()) * 31) + this.stageRewards.hashCode()) * 31) + this.rankReward.hashCode()) * 31) + this.rankings.hashCode()) * 31) + this.gradeHelpUrl.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "EmomoQuestEventResponse(giftEventId=" + this.giftEventId + ", imageUrl=" + this.imageUrl + ", footerImageUrl=" + this.footerImageUrl + ", rulePageUrl=" + this.rulePageUrl + ", gachaPageUrl=" + this.gachaPageUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", achievedImageUrl=" + this.achievedImageUrl + ", gradeImageUrl=" + this.gradeImageUrl + ", descriptions=" + this.descriptions + ", stageRewards=" + this.stageRewards + ", rankReward=" + this.rankReward + ", rankings=" + this.rankings + ", gradeHelpUrl=" + this.gradeHelpUrl + ", status=" + this.status + ')';
    }
}
