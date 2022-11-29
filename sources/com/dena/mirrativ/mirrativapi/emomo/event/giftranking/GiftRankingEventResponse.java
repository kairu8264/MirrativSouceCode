package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

import com.dena.mirrativ.mirrativapi.common.Description;
import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.emomo.event.GradientColor;
import java.io.Serializable;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class GiftRankingEventResponse implements Serializable {
    private final String achievedImageUrl;
    private final GiftRankingButtonStyle activeDateButton;
    private final String beforeOpenColor;
    private final int currentDate;
    @b(BooleanTypeAdapter.class)
    private final boolean dailyReward;
    private final List<GiftRankingDate> dates;
    private final GradientColor descriptionBackground;
    private final String descriptionColor;
    private final List<Description> descriptions;
    private final int eventId;
    private final GiftRankingButtonStyle futureDateButton;
    private final String imageUrl;
    private final GradientColor infoBackground;
    private final String infoColor;
    private final String infoHighlightColor;
    private final GiftRankingButtonStyle pastDateButton;
    private final GradientColor rankingBackground;
    private final String rankingColor;
    private final String rankingHighlightColor;
    private final String rankingLink;
    private final GiftRankingButtonStyle ruleButton;
    private final String ruleIndexBackground;
    private final String ruleIndexColor;
    private final String ruleLink;
    private final String ruleTitleColor;
    private final String ruleUrl;
    private final String selectedTabColor;
    private final String separatorColor;
    private final Status status;
    private final List<GiftRankingAttributedText> subtitle;
    private final List<GiftRankingAttributedText> title;
    private final GradientColor titleBackground;
    private final GiftRankingButtonStyle todayButton;
    private final String unselectedTabColor;

    public GiftRankingEventResponse(int i10, String str, String str2, List<GiftRankingAttributedText> list, List<GiftRankingAttributedText> list2, GradientColor gradientColor, boolean z10, String str3, GiftRankingButtonStyle giftRankingButtonStyle, String str4, GradientColor gradientColor2, String str5, String str6, GradientColor gradientColor3, String str7, String str8, String str9, List<Description> list3, GradientColor gradientColor4, String str10, String str11, int i11, List<GiftRankingDate> list4, GiftRankingButtonStyle giftRankingButtonStyle2, GiftRankingButtonStyle giftRankingButtonStyle3, GiftRankingButtonStyle giftRankingButtonStyle4, GiftRankingButtonStyle giftRankingButtonStyle5, String str12, String str13, String str14, String str15, String str16, String str17, Status status) {
        p.h(str, "imageUrl");
        p.h(str2, "achievedImageUrl");
        p.h(list, "title");
        p.h(list2, "subtitle");
        p.h(gradientColor, "titleBackground");
        p.h(str3, "ruleLink");
        p.h(giftRankingButtonStyle, "ruleButton");
        p.h(gradientColor2, "infoBackground");
        p.h(str5, "infoColor");
        p.h(str6, "infoHighlightColor");
        p.h(gradientColor3, "rankingBackground");
        p.h(str7, "rankingColor");
        p.h(str8, "rankingHighlightColor");
        p.h(str9, "rankingLink");
        p.h(list3, "descriptions");
        p.h(gradientColor4, "descriptionBackground");
        p.h(str10, "descriptionColor");
        p.h(str11, "separatorColor");
        p.h(list4, "dates");
        p.h(giftRankingButtonStyle2, "pastDateButton");
        p.h(giftRankingButtonStyle3, "todayButton");
        p.h(giftRankingButtonStyle4, "futureDateButton");
        p.h(giftRankingButtonStyle5, "activeDateButton");
        p.h(str12, "ruleTitleColor");
        p.h(str13, "ruleIndexColor");
        p.h(str14, "ruleIndexBackground");
        p.h(str15, "selectedTabColor");
        p.h(str16, "unselectedTabColor");
        p.h(str17, "beforeOpenColor");
        p.h(status, "status");
        this.eventId = i10;
        this.imageUrl = str;
        this.achievedImageUrl = str2;
        this.title = list;
        this.subtitle = list2;
        this.titleBackground = gradientColor;
        this.dailyReward = z10;
        this.ruleLink = str3;
        this.ruleButton = giftRankingButtonStyle;
        this.ruleUrl = str4;
        this.infoBackground = gradientColor2;
        this.infoColor = str5;
        this.infoHighlightColor = str6;
        this.rankingBackground = gradientColor3;
        this.rankingColor = str7;
        this.rankingHighlightColor = str8;
        this.rankingLink = str9;
        this.descriptions = list3;
        this.descriptionBackground = gradientColor4;
        this.descriptionColor = str10;
        this.separatorColor = str11;
        this.currentDate = i11;
        this.dates = list4;
        this.pastDateButton = giftRankingButtonStyle2;
        this.todayButton = giftRankingButtonStyle3;
        this.futureDateButton = giftRankingButtonStyle4;
        this.activeDateButton = giftRankingButtonStyle5;
        this.ruleTitleColor = str12;
        this.ruleIndexColor = str13;
        this.ruleIndexBackground = str14;
        this.selectedTabColor = str15;
        this.unselectedTabColor = str16;
        this.beforeOpenColor = str17;
        this.status = status;
    }

    public final int component1() {
        return this.eventId;
    }

    public final String component10() {
        return this.ruleUrl;
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

    public final GradientColor component14() {
        return this.rankingBackground;
    }

    public final String component15() {
        return this.rankingColor;
    }

    public final String component16() {
        return this.rankingHighlightColor;
    }

    public final String component17() {
        return this.rankingLink;
    }

    public final List<Description> component18() {
        return this.descriptions;
    }

    public final GradientColor component19() {
        return this.descriptionBackground;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component20() {
        return this.descriptionColor;
    }

    public final String component21() {
        return this.separatorColor;
    }

    public final int component22() {
        return this.currentDate;
    }

    public final List<GiftRankingDate> component23() {
        return this.dates;
    }

    public final GiftRankingButtonStyle component24() {
        return this.pastDateButton;
    }

    public final GiftRankingButtonStyle component25() {
        return this.todayButton;
    }

    public final GiftRankingButtonStyle component26() {
        return this.futureDateButton;
    }

    public final GiftRankingButtonStyle component27() {
        return this.activeDateButton;
    }

    public final String component28() {
        return this.ruleTitleColor;
    }

    public final String component29() {
        return this.ruleIndexColor;
    }

    public final String component3() {
        return this.achievedImageUrl;
    }

    public final String component30() {
        return this.ruleIndexBackground;
    }

    public final String component31() {
        return this.selectedTabColor;
    }

    public final String component32() {
        return this.unselectedTabColor;
    }

    public final String component33() {
        return this.beforeOpenColor;
    }

    public final Status component34() {
        return this.status;
    }

    public final List<GiftRankingAttributedText> component4() {
        return this.title;
    }

    public final List<GiftRankingAttributedText> component5() {
        return this.subtitle;
    }

    public final GradientColor component6() {
        return this.titleBackground;
    }

    public final boolean component7() {
        return this.dailyReward;
    }

    public final String component8() {
        return this.ruleLink;
    }

    public final GiftRankingButtonStyle component9() {
        return this.ruleButton;
    }

    public final GiftRankingEventResponse copy(int i10, String str, String str2, List<GiftRankingAttributedText> list, List<GiftRankingAttributedText> list2, GradientColor gradientColor, boolean z10, String str3, GiftRankingButtonStyle giftRankingButtonStyle, String str4, GradientColor gradientColor2, String str5, String str6, GradientColor gradientColor3, String str7, String str8, String str9, List<Description> list3, GradientColor gradientColor4, String str10, String str11, int i11, List<GiftRankingDate> list4, GiftRankingButtonStyle giftRankingButtonStyle2, GiftRankingButtonStyle giftRankingButtonStyle3, GiftRankingButtonStyle giftRankingButtonStyle4, GiftRankingButtonStyle giftRankingButtonStyle5, String str12, String str13, String str14, String str15, String str16, String str17, Status status) {
        p.h(str, "imageUrl");
        p.h(str2, "achievedImageUrl");
        p.h(list, "title");
        p.h(list2, "subtitle");
        p.h(gradientColor, "titleBackground");
        p.h(str3, "ruleLink");
        p.h(giftRankingButtonStyle, "ruleButton");
        p.h(gradientColor2, "infoBackground");
        p.h(str5, "infoColor");
        p.h(str6, "infoHighlightColor");
        p.h(gradientColor3, "rankingBackground");
        p.h(str7, "rankingColor");
        p.h(str8, "rankingHighlightColor");
        p.h(str9, "rankingLink");
        p.h(list3, "descriptions");
        p.h(gradientColor4, "descriptionBackground");
        p.h(str10, "descriptionColor");
        p.h(str11, "separatorColor");
        p.h(list4, "dates");
        p.h(giftRankingButtonStyle2, "pastDateButton");
        p.h(giftRankingButtonStyle3, "todayButton");
        p.h(giftRankingButtonStyle4, "futureDateButton");
        p.h(giftRankingButtonStyle5, "activeDateButton");
        p.h(str12, "ruleTitleColor");
        p.h(str13, "ruleIndexColor");
        p.h(str14, "ruleIndexBackground");
        p.h(str15, "selectedTabColor");
        p.h(str16, "unselectedTabColor");
        p.h(str17, "beforeOpenColor");
        p.h(status, "status");
        return new GiftRankingEventResponse(i10, str, str2, list, list2, gradientColor, z10, str3, giftRankingButtonStyle, str4, gradientColor2, str5, str6, gradientColor3, str7, str8, str9, list3, gradientColor4, str10, str11, i11, list4, giftRankingButtonStyle2, giftRankingButtonStyle3, giftRankingButtonStyle4, giftRankingButtonStyle5, str12, str13, str14, str15, str16, str17, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingEventResponse) {
            GiftRankingEventResponse giftRankingEventResponse = (GiftRankingEventResponse) obj;
            return this.eventId == giftRankingEventResponse.eventId && p.c(this.imageUrl, giftRankingEventResponse.imageUrl) && p.c(this.achievedImageUrl, giftRankingEventResponse.achievedImageUrl) && p.c(this.title, giftRankingEventResponse.title) && p.c(this.subtitle, giftRankingEventResponse.subtitle) && p.c(this.titleBackground, giftRankingEventResponse.titleBackground) && this.dailyReward == giftRankingEventResponse.dailyReward && p.c(this.ruleLink, giftRankingEventResponse.ruleLink) && p.c(this.ruleButton, giftRankingEventResponse.ruleButton) && p.c(this.ruleUrl, giftRankingEventResponse.ruleUrl) && p.c(this.infoBackground, giftRankingEventResponse.infoBackground) && p.c(this.infoColor, giftRankingEventResponse.infoColor) && p.c(this.infoHighlightColor, giftRankingEventResponse.infoHighlightColor) && p.c(this.rankingBackground, giftRankingEventResponse.rankingBackground) && p.c(this.rankingColor, giftRankingEventResponse.rankingColor) && p.c(this.rankingHighlightColor, giftRankingEventResponse.rankingHighlightColor) && p.c(this.rankingLink, giftRankingEventResponse.rankingLink) && p.c(this.descriptions, giftRankingEventResponse.descriptions) && p.c(this.descriptionBackground, giftRankingEventResponse.descriptionBackground) && p.c(this.descriptionColor, giftRankingEventResponse.descriptionColor) && p.c(this.separatorColor, giftRankingEventResponse.separatorColor) && this.currentDate == giftRankingEventResponse.currentDate && p.c(this.dates, giftRankingEventResponse.dates) && p.c(this.pastDateButton, giftRankingEventResponse.pastDateButton) && p.c(this.todayButton, giftRankingEventResponse.todayButton) && p.c(this.futureDateButton, giftRankingEventResponse.futureDateButton) && p.c(this.activeDateButton, giftRankingEventResponse.activeDateButton) && p.c(this.ruleTitleColor, giftRankingEventResponse.ruleTitleColor) && p.c(this.ruleIndexColor, giftRankingEventResponse.ruleIndexColor) && p.c(this.ruleIndexBackground, giftRankingEventResponse.ruleIndexBackground) && p.c(this.selectedTabColor, giftRankingEventResponse.selectedTabColor) && p.c(this.unselectedTabColor, giftRankingEventResponse.unselectedTabColor) && p.c(this.beforeOpenColor, giftRankingEventResponse.beforeOpenColor) && p.c(this.status, giftRankingEventResponse.status);
        }
        return false;
    }

    public final String getAchievedImageUrl() {
        return this.achievedImageUrl;
    }

    public final GiftRankingButtonStyle getActiveDateButton() {
        return this.activeDateButton;
    }

    public final String getBeforeOpenColor() {
        return this.beforeOpenColor;
    }

    public final int getCurrentDate() {
        return this.currentDate;
    }

    public final boolean getDailyReward() {
        return this.dailyReward;
    }

    public final List<GiftRankingDate> getDates() {
        return this.dates;
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

    public final int getEventId() {
        return this.eventId;
    }

    public final GiftRankingButtonStyle getFutureDateButton() {
        return this.futureDateButton;
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

    public final String getInfoHighlightColor() {
        return this.infoHighlightColor;
    }

    public final GiftRankingButtonStyle getPastDateButton() {
        return this.pastDateButton;
    }

    public final GradientColor getRankingBackground() {
        return this.rankingBackground;
    }

    public final String getRankingColor() {
        return this.rankingColor;
    }

    public final String getRankingHighlightColor() {
        return this.rankingHighlightColor;
    }

    public final String getRankingLink() {
        return this.rankingLink;
    }

    public final GiftRankingButtonStyle getRuleButton() {
        return this.ruleButton;
    }

    public final String getRuleIndexBackground() {
        return this.ruleIndexBackground;
    }

    public final String getRuleIndexColor() {
        return this.ruleIndexColor;
    }

    public final String getRuleLink() {
        return this.ruleLink;
    }

    public final String getRuleTitleColor() {
        return this.ruleTitleColor;
    }

    public final String getRuleUrl() {
        return this.ruleUrl;
    }

    public final String getSelectedTabColor() {
        return this.selectedTabColor;
    }

    public final String getSeparatorColor() {
        return this.separatorColor;
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

    public final GiftRankingButtonStyle getTodayButton() {
        return this.todayButton;
    }

    public final String getUnselectedTabColor() {
        return this.unselectedTabColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.eventId) * 31) + this.imageUrl.hashCode()) * 31) + this.achievedImageUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.titleBackground.hashCode()) * 31;
        boolean z10 = this.dailyReward;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + this.ruleLink.hashCode()) * 31) + this.ruleButton.hashCode()) * 31;
        String str = this.ruleUrl;
        return ((((((((((((((((((((((((((((((((((((((((((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.infoBackground.hashCode()) * 31) + this.infoColor.hashCode()) * 31) + this.infoHighlightColor.hashCode()) * 31) + this.rankingBackground.hashCode()) * 31) + this.rankingColor.hashCode()) * 31) + this.rankingHighlightColor.hashCode()) * 31) + this.rankingLink.hashCode()) * 31) + this.descriptions.hashCode()) * 31) + this.descriptionBackground.hashCode()) * 31) + this.descriptionColor.hashCode()) * 31) + this.separatorColor.hashCode()) * 31) + Integer.hashCode(this.currentDate)) * 31) + this.dates.hashCode()) * 31) + this.pastDateButton.hashCode()) * 31) + this.todayButton.hashCode()) * 31) + this.futureDateButton.hashCode()) * 31) + this.activeDateButton.hashCode()) * 31) + this.ruleTitleColor.hashCode()) * 31) + this.ruleIndexColor.hashCode()) * 31) + this.ruleIndexBackground.hashCode()) * 31) + this.selectedTabColor.hashCode()) * 31) + this.unselectedTabColor.hashCode()) * 31) + this.beforeOpenColor.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "GiftRankingEventResponse(eventId=" + this.eventId + ", imageUrl=" + this.imageUrl + ", achievedImageUrl=" + this.achievedImageUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", titleBackground=" + this.titleBackground + ", dailyReward=" + this.dailyReward + ", ruleLink=" + this.ruleLink + ", ruleButton=" + this.ruleButton + ", ruleUrl=" + this.ruleUrl + ", infoBackground=" + this.infoBackground + ", infoColor=" + this.infoColor + ", infoHighlightColor=" + this.infoHighlightColor + ", rankingBackground=" + this.rankingBackground + ", rankingColor=" + this.rankingColor + ", rankingHighlightColor=" + this.rankingHighlightColor + ", rankingLink=" + this.rankingLink + ", descriptions=" + this.descriptions + ", descriptionBackground=" + this.descriptionBackground + ", descriptionColor=" + this.descriptionColor + ", separatorColor=" + this.separatorColor + ", currentDate=" + this.currentDate + ", dates=" + this.dates + ", pastDateButton=" + this.pastDateButton + ", todayButton=" + this.todayButton + ", futureDateButton=" + this.futureDateButton + ", activeDateButton=" + this.activeDateButton + ", ruleTitleColor=" + this.ruleTitleColor + ", ruleIndexColor=" + this.ruleIndexColor + ", ruleIndexBackground=" + this.ruleIndexBackground + ", selectedTabColor=" + this.selectedTabColor + ", unselectedTabColor=" + this.unselectedTabColor + ", beforeOpenColor=" + this.beforeOpenColor + ", status=" + this.status + ')';
    }
}
