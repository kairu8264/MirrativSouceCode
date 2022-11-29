package com.dena.mirrativ.mirrativapi.emomo.event.emomorun;

import com.dena.mirrativ.mirrativapi.common.Description;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.emomo.event.EventButtonStyle;
import com.dena.mirrativ.mirrativapi.emomo.event.GradientColor;
import com.dena.mirrativ.mirrativapi.emomo.event.giftranking.GiftRankingAttributedText;
import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class EmomoRunEventResponse implements Serializable {
    private final String achievedImageUrl;
    private final String beforeOpenColor;
    private final GradientColor descriptionBackground;
    private final String descriptionColor;
    private final List<Description> descriptions;
    private final int endsAt;
    private final String footerImageUrl;
    private final int giftEventId;
    private final String imageUrl;
    private final GradientColor infoBackground;
    private final String infoColor;
    private final String infoHeaderColor;
    private final String infoHighlightColor;
    private final EmomoRunUserDetail rankReward;
    private final GradientColor rankingBackground;
    private final EventButtonStyle rankingButton;
    private final String rankingColor;
    private final String rankingHeaderColor;
    private final String rankingHeaderTitleColor;
    private final String rankingHighlightColor;
    private final String rankingLink;
    private final List<EmomoRunUserList> rankings;
    private final int remainingGachaCount;
    private final EventButtonStyle ruleButton;
    private final String ruleLink;
    private final String rulePopupImageUrl;
    private final EmomoRunUserDetail scoreReward;
    private final String separatorColor;
    private final int startsAt;
    private final Status status;
    private final List<GiftRankingAttributedText> subtitle;
    private final List<GiftRankingAttributedText> title;
    private final GradientColor titleBackground;

    public EmomoRunEventResponse(int i10, String str, String str2, String str3, String str4, List<GiftRankingAttributedText> list, List<GiftRankingAttributedText> list2, GradientColor gradientColor, String str5, EventButtonStyle eventButtonStyle, GradientColor gradientColor2, String str6, String str7, String str8, GradientColor gradientColor3, String str9, String str10, String str11, String str12, String str13, EventButtonStyle eventButtonStyle2, List<Description> list3, GradientColor gradientColor4, String str14, String str15, String str16, EmomoRunUserDetail emomoRunUserDetail, EmomoRunUserDetail emomoRunUserDetail2, List<EmomoRunUserList> list4, int i11, int i12, int i13, Status status) {
        p.h(str, "imageUrl");
        p.h(str2, "footerImageUrl");
        p.h(str3, "rulePopupImageUrl");
        p.h(str4, "achievedImageUrl");
        p.h(list, "title");
        p.h(list2, "subtitle");
        p.h(gradientColor, "titleBackground");
        p.h(str5, "ruleLink");
        p.h(eventButtonStyle, "ruleButton");
        p.h(gradientColor2, "infoBackground");
        p.h(str6, "infoColor");
        p.h(str7, "infoHighlightColor");
        p.h(str8, "infoHeaderColor");
        p.h(gradientColor3, "rankingBackground");
        p.h(str9, "rankingColor");
        p.h(str10, "rankingHighlightColor");
        p.h(str11, "rankingHeaderColor");
        p.h(str12, "rankingHeaderTitleColor");
        p.h(str13, "rankingLink");
        p.h(eventButtonStyle2, "rankingButton");
        p.h(list3, "descriptions");
        p.h(gradientColor4, "descriptionBackground");
        p.h(str14, "descriptionColor");
        p.h(str15, "separatorColor");
        p.h(str16, "beforeOpenColor");
        p.h(emomoRunUserDetail, "rankReward");
        p.h(emomoRunUserDetail2, "scoreReward");
        p.h(list4, "rankings");
        p.h(status, "status");
        this.giftEventId = i10;
        this.imageUrl = str;
        this.footerImageUrl = str2;
        this.rulePopupImageUrl = str3;
        this.achievedImageUrl = str4;
        this.title = list;
        this.subtitle = list2;
        this.titleBackground = gradientColor;
        this.ruleLink = str5;
        this.ruleButton = eventButtonStyle;
        this.infoBackground = gradientColor2;
        this.infoColor = str6;
        this.infoHighlightColor = str7;
        this.infoHeaderColor = str8;
        this.rankingBackground = gradientColor3;
        this.rankingColor = str9;
        this.rankingHighlightColor = str10;
        this.rankingHeaderColor = str11;
        this.rankingHeaderTitleColor = str12;
        this.rankingLink = str13;
        this.rankingButton = eventButtonStyle2;
        this.descriptions = list3;
        this.descriptionBackground = gradientColor4;
        this.descriptionColor = str14;
        this.separatorColor = str15;
        this.beforeOpenColor = str16;
        this.rankReward = emomoRunUserDetail;
        this.scoreReward = emomoRunUserDetail2;
        this.rankings = list4;
        this.startsAt = i11;
        this.endsAt = i12;
        this.remainingGachaCount = i13;
        this.status = status;
    }

    public final int component1() {
        return this.giftEventId;
    }

    public final EventButtonStyle component10() {
        return this.ruleButton;
    }

    public final GradientColor component11() {
        return this.infoBackground;
    }

    public final String component12() {
        return this.infoColor;
    }

    public final String component13() {
        return this.infoHighlightColor;
    }

    public final String component14() {
        return this.infoHeaderColor;
    }

    public final GradientColor component15() {
        return this.rankingBackground;
    }

    public final String component16() {
        return this.rankingColor;
    }

    public final String component17() {
        return this.rankingHighlightColor;
    }

    public final String component18() {
        return this.rankingHeaderColor;
    }

    public final String component19() {
        return this.rankingHeaderTitleColor;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component20() {
        return this.rankingLink;
    }

    public final EventButtonStyle component21() {
        return this.rankingButton;
    }

    public final List<Description> component22() {
        return this.descriptions;
    }

    public final GradientColor component23() {
        return this.descriptionBackground;
    }

    public final String component24() {
        return this.descriptionColor;
    }

    public final String component25() {
        return this.separatorColor;
    }

    public final String component26() {
        return this.beforeOpenColor;
    }

    public final EmomoRunUserDetail component27() {
        return this.rankReward;
    }

    public final EmomoRunUserDetail component28() {
        return this.scoreReward;
    }

    public final List<EmomoRunUserList> component29() {
        return this.rankings;
    }

    public final String component3() {
        return this.footerImageUrl;
    }

    public final int component30() {
        return this.startsAt;
    }

    public final int component31() {
        return this.endsAt;
    }

    public final int component32() {
        return this.remainingGachaCount;
    }

    public final Status component33() {
        return this.status;
    }

    public final String component4() {
        return this.rulePopupImageUrl;
    }

    public final String component5() {
        return this.achievedImageUrl;
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

    public final EmomoRunEventResponse copy(int i10, String str, String str2, String str3, String str4, List<GiftRankingAttributedText> list, List<GiftRankingAttributedText> list2, GradientColor gradientColor, String str5, EventButtonStyle eventButtonStyle, GradientColor gradientColor2, String str6, String str7, String str8, GradientColor gradientColor3, String str9, String str10, String str11, String str12, String str13, EventButtonStyle eventButtonStyle2, List<Description> list3, GradientColor gradientColor4, String str14, String str15, String str16, EmomoRunUserDetail emomoRunUserDetail, EmomoRunUserDetail emomoRunUserDetail2, List<EmomoRunUserList> list4, int i11, int i12, int i13, Status status) {
        p.h(str, "imageUrl");
        p.h(str2, "footerImageUrl");
        p.h(str3, "rulePopupImageUrl");
        p.h(str4, "achievedImageUrl");
        p.h(list, "title");
        p.h(list2, "subtitle");
        p.h(gradientColor, "titleBackground");
        p.h(str5, "ruleLink");
        p.h(eventButtonStyle, "ruleButton");
        p.h(gradientColor2, "infoBackground");
        p.h(str6, "infoColor");
        p.h(str7, "infoHighlightColor");
        p.h(str8, "infoHeaderColor");
        p.h(gradientColor3, "rankingBackground");
        p.h(str9, "rankingColor");
        p.h(str10, "rankingHighlightColor");
        p.h(str11, "rankingHeaderColor");
        p.h(str12, "rankingHeaderTitleColor");
        p.h(str13, "rankingLink");
        p.h(eventButtonStyle2, "rankingButton");
        p.h(list3, "descriptions");
        p.h(gradientColor4, "descriptionBackground");
        p.h(str14, "descriptionColor");
        p.h(str15, "separatorColor");
        p.h(str16, "beforeOpenColor");
        p.h(emomoRunUserDetail, "rankReward");
        p.h(emomoRunUserDetail2, "scoreReward");
        p.h(list4, "rankings");
        p.h(status, "status");
        return new EmomoRunEventResponse(i10, str, str2, str3, str4, list, list2, gradientColor, str5, eventButtonStyle, gradientColor2, str6, str7, str8, gradientColor3, str9, str10, str11, str12, str13, eventButtonStyle2, list3, gradientColor4, str14, str15, str16, emomoRunUserDetail, emomoRunUserDetail2, list4, i11, i12, i13, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunEventResponse) {
            EmomoRunEventResponse emomoRunEventResponse = (EmomoRunEventResponse) obj;
            return this.giftEventId == emomoRunEventResponse.giftEventId && p.c(this.imageUrl, emomoRunEventResponse.imageUrl) && p.c(this.footerImageUrl, emomoRunEventResponse.footerImageUrl) && p.c(this.rulePopupImageUrl, emomoRunEventResponse.rulePopupImageUrl) && p.c(this.achievedImageUrl, emomoRunEventResponse.achievedImageUrl) && p.c(this.title, emomoRunEventResponse.title) && p.c(this.subtitle, emomoRunEventResponse.subtitle) && p.c(this.titleBackground, emomoRunEventResponse.titleBackground) && p.c(this.ruleLink, emomoRunEventResponse.ruleLink) && p.c(this.ruleButton, emomoRunEventResponse.ruleButton) && p.c(this.infoBackground, emomoRunEventResponse.infoBackground) && p.c(this.infoColor, emomoRunEventResponse.infoColor) && p.c(this.infoHighlightColor, emomoRunEventResponse.infoHighlightColor) && p.c(this.infoHeaderColor, emomoRunEventResponse.infoHeaderColor) && p.c(this.rankingBackground, emomoRunEventResponse.rankingBackground) && p.c(this.rankingColor, emomoRunEventResponse.rankingColor) && p.c(this.rankingHighlightColor, emomoRunEventResponse.rankingHighlightColor) && p.c(this.rankingHeaderColor, emomoRunEventResponse.rankingHeaderColor) && p.c(this.rankingHeaderTitleColor, emomoRunEventResponse.rankingHeaderTitleColor) && p.c(this.rankingLink, emomoRunEventResponse.rankingLink) && p.c(this.rankingButton, emomoRunEventResponse.rankingButton) && p.c(this.descriptions, emomoRunEventResponse.descriptions) && p.c(this.descriptionBackground, emomoRunEventResponse.descriptionBackground) && p.c(this.descriptionColor, emomoRunEventResponse.descriptionColor) && p.c(this.separatorColor, emomoRunEventResponse.separatorColor) && p.c(this.beforeOpenColor, emomoRunEventResponse.beforeOpenColor) && p.c(this.rankReward, emomoRunEventResponse.rankReward) && p.c(this.scoreReward, emomoRunEventResponse.scoreReward) && p.c(this.rankings, emomoRunEventResponse.rankings) && this.startsAt == emomoRunEventResponse.startsAt && this.endsAt == emomoRunEventResponse.endsAt && this.remainingGachaCount == emomoRunEventResponse.remainingGachaCount && p.c(this.status, emomoRunEventResponse.status);
        }
        return false;
    }

    public final String getAchievedImageUrl() {
        return this.achievedImageUrl;
    }

    public final String getBeforeOpenColor() {
        return this.beforeOpenColor;
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

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final GradientColor getInfoBackground() {
        return this.infoBackground;
    }

    public final String getInfoColor() {
        return this.infoColor;
    }

    public final String getInfoHeaderColor() {
        return this.infoHeaderColor;
    }

    public final String getInfoHighlightColor() {
        return this.infoHighlightColor;
    }

    public final EmomoRunUserDetail getRankReward() {
        return this.rankReward;
    }

    public final GradientColor getRankingBackground() {
        return this.rankingBackground;
    }

    public final EventButtonStyle getRankingButton() {
        return this.rankingButton;
    }

    public final String getRankingColor() {
        return this.rankingColor;
    }

    public final String getRankingHeaderColor() {
        return this.rankingHeaderColor;
    }

    public final String getRankingHeaderTitleColor() {
        return this.rankingHeaderTitleColor;
    }

    public final String getRankingHighlightColor() {
        return this.rankingHighlightColor;
    }

    public final String getRankingLink() {
        return this.rankingLink;
    }

    public final List<EmomoRunUserList> getRankings() {
        return this.rankings;
    }

    public final int getRemainingGachaCount() {
        return this.remainingGachaCount;
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

    public final EmomoRunUserDetail getScoreReward() {
        return this.scoreReward;
    }

    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    public final int getStartsAt() {
        return this.startsAt;
    }

    public final Status getStatus() {
        return this.status;
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

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.giftEventId) * 31) + this.imageUrl.hashCode()) * 31) + this.footerImageUrl.hashCode()) * 31) + this.rulePopupImageUrl.hashCode()) * 31) + this.achievedImageUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.titleBackground.hashCode()) * 31) + this.ruleLink.hashCode()) * 31) + this.ruleButton.hashCode()) * 31) + this.infoBackground.hashCode()) * 31) + this.infoColor.hashCode()) * 31) + this.infoHighlightColor.hashCode()) * 31) + this.infoHeaderColor.hashCode()) * 31) + this.rankingBackground.hashCode()) * 31) + this.rankingColor.hashCode()) * 31) + this.rankingHighlightColor.hashCode()) * 31) + this.rankingHeaderColor.hashCode()) * 31) + this.rankingHeaderTitleColor.hashCode()) * 31) + this.rankingLink.hashCode()) * 31) + this.rankingButton.hashCode()) * 31) + this.descriptions.hashCode()) * 31) + this.descriptionBackground.hashCode()) * 31) + this.descriptionColor.hashCode()) * 31) + this.separatorColor.hashCode()) * 31) + this.beforeOpenColor.hashCode()) * 31) + this.rankReward.hashCode()) * 31) + this.scoreReward.hashCode()) * 31) + this.rankings.hashCode()) * 31) + Integer.hashCode(this.startsAt)) * 31) + Integer.hashCode(this.endsAt)) * 31) + Integer.hashCode(this.remainingGachaCount)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "EmomoRunEventResponse(giftEventId=" + this.giftEventId + ", imageUrl=" + this.imageUrl + ", footerImageUrl=" + this.footerImageUrl + ", rulePopupImageUrl=" + this.rulePopupImageUrl + ", achievedImageUrl=" + this.achievedImageUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleBackground=" + this.titleBackground + ", ruleLink=" + this.ruleLink + ", ruleButton=" + this.ruleButton + ", infoBackground=" + this.infoBackground + ", infoColor=" + this.infoColor + ", infoHighlightColor=" + this.infoHighlightColor + ", infoHeaderColor=" + this.infoHeaderColor + ", rankingBackground=" + this.rankingBackground + ", rankingColor=" + this.rankingColor + ", rankingHighlightColor=" + this.rankingHighlightColor + ", rankingHeaderColor=" + this.rankingHeaderColor + ", rankingHeaderTitleColor=" + this.rankingHeaderTitleColor + ", rankingLink=" + this.rankingLink + ", rankingButton=" + this.rankingButton + ", descriptions=" + this.descriptions + ", descriptionBackground=" + this.descriptionBackground + ", descriptionColor=" + this.descriptionColor + ", separatorColor=" + this.separatorColor + ", beforeOpenColor=" + this.beforeOpenColor + ", rankReward=" + this.rankReward + ", scoreReward=" + this.scoreReward + ", rankings=" + this.rankings + ", startsAt=" + this.startsAt + ", endsAt=" + this.endsAt + ", remainingGachaCount=" + this.remainingGachaCount + ", status=" + this.status + ')';
    }
}
