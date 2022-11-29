package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.common.Description;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.emomo.event.EventButtonStyle;
import com.dena.mirrativ.mirrativapi.emomo.event.GradientColor;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingAttributedText;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ShooterEventResponse {
    public static final int $stable = 8;
    private final String achievedImageUrl;
    private final GradientColor descriptionBackground;
    private final String descriptionColor;
    private final List<Description> descriptions;
    private final int endsAt;
    private final String footerImageUrl;
    private final String highScoreAchievedImageUrl;
    private final String highScoreColor;
    private final ShooterUserDetail highScoreRankReward;
    private final List<ShooterRankingUser> highScoreRankings;
    private final String imageUrl;
    private final ShooterUserDetail rankReward;
    private final String rankingLink;
    private final List<ShooterRankingUser> rankings;
    private final String ratingAchievedImageUrl;
    private final ShooterUserDetail ratingClassReward;
    private final String ratingColor;
    private final ShooterUserDetail ratingRankReward;
    private final List<ShooterRankingUser> ratingRankings;
    private final EventButtonStyle ruleButton;
    private final String ruleLink;
    private final String rulePopupImageUrl;
    private final ShooterUserDetail scoreReward;
    private final int seasonId;
    private final int seasonNo;
    private final int startsAt;
    private final Status status;
    private final ShooterUserDetail streamerHighScoreRankReward;
    private final ShooterUserDetail streamerRankReward;
    private final ShooterUserDetail streamerRatingRankReward;
    private final ShooterUserDetail streamerScoreReward;
    private final List<GiftRankingAttributedText> subtitle;
    private final List<GiftRankingAttributedText> title;
    private final GradientColor titleBackground;
    private final String totalScoreColor;
    private final ShooterUserShooterSummary userShooterSummary;

    public ShooterEventResponse(int i10, int i11, String str, String str2, String str3, List<GiftRankingAttributedText> list, List<GiftRankingAttributedText> list2, GradientColor gradientColor, String str4, EventButtonStyle eventButtonStyle, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<Description> list3, GradientColor gradientColor2, String str12, ShooterUserShooterSummary shooterUserShooterSummary, ShooterUserDetail shooterUserDetail, ShooterUserDetail shooterUserDetail2, ShooterUserDetail shooterUserDetail3, ShooterUserDetail shooterUserDetail4, ShooterUserDetail shooterUserDetail5, ShooterUserDetail shooterUserDetail6, ShooterUserDetail shooterUserDetail7, ShooterUserDetail shooterUserDetail8, ShooterUserDetail shooterUserDetail9, List<ShooterRankingUser> list4, List<ShooterRankingUser> list5, List<ShooterRankingUser> list6, int i12, int i13, Status status) {
        p.h(str, "imageUrl");
        p.h(str2, "footerImageUrl");
        p.h(str3, "rulePopupImageUrl");
        p.h(list, "title");
        p.h(list2, "subtitle");
        p.h(gradientColor, "titleBackground");
        p.h(str4, "ruleLink");
        p.h(eventButtonStyle, "ruleButton");
        p.h(str5, "totalScoreColor");
        p.h(str6, "highScoreColor");
        p.h(str7, "ratingColor");
        p.h(str8, "rankingLink");
        p.h(str9, "achievedImageUrl");
        p.h(str10, "highScoreAchievedImageUrl");
        p.h(str11, "ratingAchievedImageUrl");
        p.h(list3, "descriptions");
        p.h(gradientColor2, "descriptionBackground");
        p.h(str12, "descriptionColor");
        p.h(list4, "rankings");
        p.h(list5, "highScoreRankings");
        p.h(list6, "ratingRankings");
        p.h(status, "status");
        this.seasonId = i10;
        this.seasonNo = i11;
        this.imageUrl = str;
        this.footerImageUrl = str2;
        this.rulePopupImageUrl = str3;
        this.title = list;
        this.subtitle = list2;
        this.titleBackground = gradientColor;
        this.ruleLink = str4;
        this.ruleButton = eventButtonStyle;
        this.totalScoreColor = str5;
        this.highScoreColor = str6;
        this.ratingColor = str7;
        this.rankingLink = str8;
        this.achievedImageUrl = str9;
        this.highScoreAchievedImageUrl = str10;
        this.ratingAchievedImageUrl = str11;
        this.descriptions = list3;
        this.descriptionBackground = gradientColor2;
        this.descriptionColor = str12;
        this.userShooterSummary = shooterUserShooterSummary;
        this.rankReward = shooterUserDetail;
        this.highScoreRankReward = shooterUserDetail2;
        this.scoreReward = shooterUserDetail3;
        this.ratingRankReward = shooterUserDetail4;
        this.ratingClassReward = shooterUserDetail5;
        this.streamerRankReward = shooterUserDetail6;
        this.streamerHighScoreRankReward = shooterUserDetail7;
        this.streamerScoreReward = shooterUserDetail8;
        this.streamerRatingRankReward = shooterUserDetail9;
        this.rankings = list4;
        this.highScoreRankings = list5;
        this.ratingRankings = list6;
        this.startsAt = i12;
        this.endsAt = i13;
        this.status = status;
    }

    public final int component1() {
        return this.seasonId;
    }

    public final EventButtonStyle component10() {
        return this.ruleButton;
    }

    public final String component11() {
        return this.totalScoreColor;
    }

    public final String component12() {
        return this.highScoreColor;
    }

    public final String component13() {
        return this.ratingColor;
    }

    public final String component14() {
        return this.rankingLink;
    }

    public final String component15() {
        return this.achievedImageUrl;
    }

    public final String component16() {
        return this.highScoreAchievedImageUrl;
    }

    public final String component17() {
        return this.ratingAchievedImageUrl;
    }

    public final List<Description> component18() {
        return this.descriptions;
    }

    public final GradientColor component19() {
        return this.descriptionBackground;
    }

    public final int component2() {
        return this.seasonNo;
    }

    public final String component20() {
        return this.descriptionColor;
    }

    public final ShooterUserShooterSummary component21() {
        return this.userShooterSummary;
    }

    public final ShooterUserDetail component22() {
        return this.rankReward;
    }

    public final ShooterUserDetail component23() {
        return this.highScoreRankReward;
    }

    public final ShooterUserDetail component24() {
        return this.scoreReward;
    }

    public final ShooterUserDetail component25() {
        return this.ratingRankReward;
    }

    public final ShooterUserDetail component26() {
        return this.ratingClassReward;
    }

    public final ShooterUserDetail component27() {
        return this.streamerRankReward;
    }

    public final ShooterUserDetail component28() {
        return this.streamerHighScoreRankReward;
    }

    public final ShooterUserDetail component29() {
        return this.streamerScoreReward;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final ShooterUserDetail component30() {
        return this.streamerRatingRankReward;
    }

    public final List<ShooterRankingUser> component31() {
        return this.rankings;
    }

    public final List<ShooterRankingUser> component32() {
        return this.highScoreRankings;
    }

    public final List<ShooterRankingUser> component33() {
        return this.ratingRankings;
    }

    public final int component34() {
        return this.startsAt;
    }

    public final int component35() {
        return this.endsAt;
    }

    public final Status component36() {
        return this.status;
    }

    public final String component4() {
        return this.footerImageUrl;
    }

    public final String component5() {
        return this.rulePopupImageUrl;
    }

    public final List<GiftRankingAttributedText> component6() {
        return this.title;
    }

    public final List<GiftRankingAttributedText> component7() {
        return this.subtitle;
    }

    public final GradientColor component8() {
        return this.titleBackground;
    }

    public final String component9() {
        return this.ruleLink;
    }

    public final ShooterEventResponse copy(int i10, int i11, String str, String str2, String str3, List<GiftRankingAttributedText> list, List<GiftRankingAttributedText> list2, GradientColor gradientColor, String str4, EventButtonStyle eventButtonStyle, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<Description> list3, GradientColor gradientColor2, String str12, ShooterUserShooterSummary shooterUserShooterSummary, ShooterUserDetail shooterUserDetail, ShooterUserDetail shooterUserDetail2, ShooterUserDetail shooterUserDetail3, ShooterUserDetail shooterUserDetail4, ShooterUserDetail shooterUserDetail5, ShooterUserDetail shooterUserDetail6, ShooterUserDetail shooterUserDetail7, ShooterUserDetail shooterUserDetail8, ShooterUserDetail shooterUserDetail9, List<ShooterRankingUser> list4, List<ShooterRankingUser> list5, List<ShooterRankingUser> list6, int i12, int i13, Status status) {
        p.h(str, "imageUrl");
        p.h(str2, "footerImageUrl");
        p.h(str3, "rulePopupImageUrl");
        p.h(list, "title");
        p.h(list2, "subtitle");
        p.h(gradientColor, "titleBackground");
        p.h(str4, "ruleLink");
        p.h(eventButtonStyle, "ruleButton");
        p.h(str5, "totalScoreColor");
        p.h(str6, "highScoreColor");
        p.h(str7, "ratingColor");
        p.h(str8, "rankingLink");
        p.h(str9, "achievedImageUrl");
        p.h(str10, "highScoreAchievedImageUrl");
        p.h(str11, "ratingAchievedImageUrl");
        p.h(list3, "descriptions");
        p.h(gradientColor2, "descriptionBackground");
        p.h(str12, "descriptionColor");
        p.h(list4, "rankings");
        p.h(list5, "highScoreRankings");
        p.h(list6, "ratingRankings");
        p.h(status, "status");
        return new ShooterEventResponse(i10, i11, str, str2, str3, list, list2, gradientColor, str4, eventButtonStyle, str5, str6, str7, str8, str9, str10, str11, list3, gradientColor2, str12, shooterUserShooterSummary, shooterUserDetail, shooterUserDetail2, shooterUserDetail3, shooterUserDetail4, shooterUserDetail5, shooterUserDetail6, shooterUserDetail7, shooterUserDetail8, shooterUserDetail9, list4, list5, list6, i12, i13, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterEventResponse) {
            ShooterEventResponse shooterEventResponse = (ShooterEventResponse) obj;
            return this.seasonId == shooterEventResponse.seasonId && this.seasonNo == shooterEventResponse.seasonNo && p.c(this.imageUrl, shooterEventResponse.imageUrl) && p.c(this.footerImageUrl, shooterEventResponse.footerImageUrl) && p.c(this.rulePopupImageUrl, shooterEventResponse.rulePopupImageUrl) && p.c(this.title, shooterEventResponse.title) && p.c(this.subtitle, shooterEventResponse.subtitle) && p.c(this.titleBackground, shooterEventResponse.titleBackground) && p.c(this.ruleLink, shooterEventResponse.ruleLink) && p.c(this.ruleButton, shooterEventResponse.ruleButton) && p.c(this.totalScoreColor, shooterEventResponse.totalScoreColor) && p.c(this.highScoreColor, shooterEventResponse.highScoreColor) && p.c(this.ratingColor, shooterEventResponse.ratingColor) && p.c(this.rankingLink, shooterEventResponse.rankingLink) && p.c(this.achievedImageUrl, shooterEventResponse.achievedImageUrl) && p.c(this.highScoreAchievedImageUrl, shooterEventResponse.highScoreAchievedImageUrl) && p.c(this.ratingAchievedImageUrl, shooterEventResponse.ratingAchievedImageUrl) && p.c(this.descriptions, shooterEventResponse.descriptions) && p.c(this.descriptionBackground, shooterEventResponse.descriptionBackground) && p.c(this.descriptionColor, shooterEventResponse.descriptionColor) && p.c(this.userShooterSummary, shooterEventResponse.userShooterSummary) && p.c(this.rankReward, shooterEventResponse.rankReward) && p.c(this.highScoreRankReward, shooterEventResponse.highScoreRankReward) && p.c(this.scoreReward, shooterEventResponse.scoreReward) && p.c(this.ratingRankReward, shooterEventResponse.ratingRankReward) && p.c(this.ratingClassReward, shooterEventResponse.ratingClassReward) && p.c(this.streamerRankReward, shooterEventResponse.streamerRankReward) && p.c(this.streamerHighScoreRankReward, shooterEventResponse.streamerHighScoreRankReward) && p.c(this.streamerScoreReward, shooterEventResponse.streamerScoreReward) && p.c(this.streamerRatingRankReward, shooterEventResponse.streamerRatingRankReward) && p.c(this.rankings, shooterEventResponse.rankings) && p.c(this.highScoreRankings, shooterEventResponse.highScoreRankings) && p.c(this.ratingRankings, shooterEventResponse.ratingRankings) && this.startsAt == shooterEventResponse.startsAt && this.endsAt == shooterEventResponse.endsAt && p.c(this.status, shooterEventResponse.status);
        }
        return false;
    }

    public final String getAchievedImageUrl() {
        return this.achievedImageUrl;
    }

    public final GradientColor getDescriptionBackground() {
        return this.descriptionBackground;
    }

    public final String getDescriptionColor() {
        return this.descriptionColor;
    }

    public final List<Description> getDescriptions() {
        return this.descriptions;
    }

    public final int getEndsAt() {
        return this.endsAt;
    }

    public final String getFooterImageUrl() {
        return this.footerImageUrl;
    }

    public final String getHighScoreAchievedImageUrl() {
        return this.highScoreAchievedImageUrl;
    }

    public final String getHighScoreColor() {
        return this.highScoreColor;
    }

    public final ShooterUserDetail getHighScoreRankReward() {
        return this.highScoreRankReward;
    }

    public final List<ShooterRankingUser> getHighScoreRankings() {
        return this.highScoreRankings;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ShooterUserDetail getRankReward() {
        return this.rankReward;
    }

    public final String getRankingLink() {
        return this.rankingLink;
    }

    public final List<ShooterRankingUser> getRankings() {
        return this.rankings;
    }

    public final String getRatingAchievedImageUrl() {
        return this.ratingAchievedImageUrl;
    }

    public final ShooterUserDetail getRatingClassReward() {
        return this.ratingClassReward;
    }

    public final String getRatingColor() {
        return this.ratingColor;
    }

    public final ShooterUserDetail getRatingRankReward() {
        return this.ratingRankReward;
    }

    public final List<ShooterRankingUser> getRatingRankings() {
        return this.ratingRankings;
    }

    public final EventButtonStyle getRuleButton() {
        return this.ruleButton;
    }

    public final String getRuleLink() {
        return this.ruleLink;
    }

    public final String getRulePopupImageUrl() {
        return this.rulePopupImageUrl;
    }

    public final ShooterUserDetail getScoreReward() {
        return this.scoreReward;
    }

    public final int getSeasonId() {
        return this.seasonId;
    }

    public final int getSeasonNo() {
        return this.seasonNo;
    }

    public final int getStartsAt() {
        return this.startsAt;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final ShooterUserDetail getStreamerHighScoreRankReward() {
        return this.streamerHighScoreRankReward;
    }

    public final ShooterUserDetail getStreamerRankReward() {
        return this.streamerRankReward;
    }

    public final ShooterUserDetail getStreamerRatingRankReward() {
        return this.streamerRatingRankReward;
    }

    public final ShooterUserDetail getStreamerScoreReward() {
        return this.streamerScoreReward;
    }

    public final List<GiftRankingAttributedText> getSubtitle() {
        return this.subtitle;
    }

    public final List<GiftRankingAttributedText> getTitle() {
        return this.title;
    }

    public final GradientColor getTitleBackground() {
        return this.titleBackground;
    }

    public final String getTotalScoreColor() {
        return this.totalScoreColor;
    }

    public final ShooterUserShooterSummary getUserShooterSummary() {
        return this.userShooterSummary;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.seasonId) * 31) + Integer.hashCode(this.seasonNo)) * 31) + this.imageUrl.hashCode()) * 31) + this.footerImageUrl.hashCode()) * 31) + this.rulePopupImageUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.titleBackground.hashCode()) * 31) + this.ruleLink.hashCode()) * 31) + this.ruleButton.hashCode()) * 31) + this.totalScoreColor.hashCode()) * 31) + this.highScoreColor.hashCode()) * 31) + this.ratingColor.hashCode()) * 31) + this.rankingLink.hashCode()) * 31) + this.achievedImageUrl.hashCode()) * 31) + this.highScoreAchievedImageUrl.hashCode()) * 31) + this.ratingAchievedImageUrl.hashCode()) * 31) + this.descriptions.hashCode()) * 31) + this.descriptionBackground.hashCode()) * 31) + this.descriptionColor.hashCode()) * 31;
        ShooterUserShooterSummary shooterUserShooterSummary = this.userShooterSummary;
        int hashCode2 = (hashCode + (shooterUserShooterSummary == null ? 0 : shooterUserShooterSummary.hashCode())) * 31;
        ShooterUserDetail shooterUserDetail = this.rankReward;
        int hashCode3 = (hashCode2 + (shooterUserDetail == null ? 0 : shooterUserDetail.hashCode())) * 31;
        ShooterUserDetail shooterUserDetail2 = this.highScoreRankReward;
        int hashCode4 = (hashCode3 + (shooterUserDetail2 == null ? 0 : shooterUserDetail2.hashCode())) * 31;
        ShooterUserDetail shooterUserDetail3 = this.scoreReward;
        int hashCode5 = (hashCode4 + (shooterUserDetail3 == null ? 0 : shooterUserDetail3.hashCode())) * 31;
        ShooterUserDetail shooterUserDetail4 = this.ratingRankReward;
        int hashCode6 = (hashCode5 + (shooterUserDetail4 == null ? 0 : shooterUserDetail4.hashCode())) * 31;
        ShooterUserDetail shooterUserDetail5 = this.ratingClassReward;
        int hashCode7 = (hashCode6 + (shooterUserDetail5 == null ? 0 : shooterUserDetail5.hashCode())) * 31;
        ShooterUserDetail shooterUserDetail6 = this.streamerRankReward;
        int hashCode8 = (hashCode7 + (shooterUserDetail6 == null ? 0 : shooterUserDetail6.hashCode())) * 31;
        ShooterUserDetail shooterUserDetail7 = this.streamerHighScoreRankReward;
        int hashCode9 = (hashCode8 + (shooterUserDetail7 == null ? 0 : shooterUserDetail7.hashCode())) * 31;
        ShooterUserDetail shooterUserDetail8 = this.streamerScoreReward;
        int hashCode10 = (hashCode9 + (shooterUserDetail8 == null ? 0 : shooterUserDetail8.hashCode())) * 31;
        ShooterUserDetail shooterUserDetail9 = this.streamerRatingRankReward;
        return ((((((((((((hashCode10 + (shooterUserDetail9 != null ? shooterUserDetail9.hashCode() : 0)) * 31) + this.rankings.hashCode()) * 31) + this.highScoreRankings.hashCode()) * 31) + this.ratingRankings.hashCode()) * 31) + Integer.hashCode(this.startsAt)) * 31) + Integer.hashCode(this.endsAt)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ShooterEventResponse(seasonId=" + this.seasonId + ", seasonNo=" + this.seasonNo + ", imageUrl=" + this.imageUrl + ", footerImageUrl=" + this.footerImageUrl + ", rulePopupImageUrl=" + this.rulePopupImageUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleBackground=" + this.titleBackground + ", ruleLink=" + this.ruleLink + ", ruleButton=" + this.ruleButton + ", totalScoreColor=" + this.totalScoreColor + ", highScoreColor=" + this.highScoreColor + ", ratingColor=" + this.ratingColor + ", rankingLink=" + this.rankingLink + ", achievedImageUrl=" + this.achievedImageUrl + ", highScoreAchievedImageUrl=" + this.highScoreAchievedImageUrl + ", ratingAchievedImageUrl=" + this.ratingAchievedImageUrl + ", descriptions=" + this.descriptions + ", descriptionBackground=" + this.descriptionBackground + ", descriptionColor=" + this.descriptionColor + ", userShooterSummary=" + this.userShooterSummary + ", rankReward=" + this.rankReward + ", highScoreRankReward=" + this.highScoreRankReward + ", scoreReward=" + this.scoreReward + ", ratingRankReward=" + this.ratingRankReward + ", ratingClassReward=" + this.ratingClassReward + ", streamerRankReward=" + this.streamerRankReward + ", streamerHighScoreRankReward=" + this.streamerHighScoreRankReward + ", streamerScoreReward=" + this.streamerScoreReward + ", streamerRatingRankReward=" + this.streamerRatingRankReward + ", rankings=" + this.rankings + ", highScoreRankings=" + this.highScoreRankings + ", ratingRankings=" + this.ratingRankings + ", startsAt=" + this.startsAt + ", endsAt=" + this.endsAt + ", status=" + this.status + ')';
    }
}
