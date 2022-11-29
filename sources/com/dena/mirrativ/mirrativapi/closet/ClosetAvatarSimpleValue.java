package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.closet.ClosetBuyable;
import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ClosetAvatarSimpleValue implements ClosetBuyable {
    private final String bannerImageUrl;
    private final String bannerLink;
    private final GameEffect gameEffect;
    private String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private String f21648id;
    private Integer isBuyable;
    @b(BooleanTypeAdapter.class)
    private final boolean isLimitedTime;
    private final boolean isTrial;
    private String partTitle;
    private Integer requiredCoin;
    private Long updatedAt;
    private final String value;

    public ClosetAvatarSimpleValue(String str, String str2, String str3, Integer num, Integer num2, String str4, Long l10, boolean z10, String str5, String str6, GameEffect gameEffect, boolean z11) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "value");
        this.f21648id = str;
        this.value = str2;
        this.partTitle = str3;
        this.isBuyable = num;
        this.requiredCoin = num2;
        this.iconUrl = str4;
        this.updatedAt = l10;
        this.isLimitedTime = z10;
        this.bannerImageUrl = str5;
        this.bannerLink = str6;
        this.gameEffect = gameEffect;
        this.isTrial = z11;
    }

    public final String component1() {
        return getId();
    }

    public final String component10() {
        return getBannerLink();
    }

    public final GameEffect component11() {
        return getGameEffect();
    }

    public final boolean component12() {
        return isTrial();
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return getPartTitle();
    }

    public final Integer component4() {
        return isBuyable();
    }

    public final Integer component5() {
        return getRequiredCoin();
    }

    public final String component6() {
        return getIconUrl();
    }

    public final Long component7() {
        return getUpdatedAt();
    }

    public final boolean component8() {
        return isLimitedTime();
    }

    public final String component9() {
        return getBannerImageUrl();
    }

    public final ClosetAvatarSimpleValue copy(String str, String str2, String str3, Integer num, Integer num2, String str4, Long l10, boolean z10, String str5, String str6, GameEffect gameEffect, boolean z11) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "value");
        return new ClosetAvatarSimpleValue(str, str2, str3, num, num2, str4, l10, z10, str5, str6, gameEffect, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetAvatarSimpleValue) {
            ClosetAvatarSimpleValue closetAvatarSimpleValue = (ClosetAvatarSimpleValue) obj;
            return p.c(getId(), closetAvatarSimpleValue.getId()) && p.c(this.value, closetAvatarSimpleValue.value) && p.c(getPartTitle(), closetAvatarSimpleValue.getPartTitle()) && p.c(isBuyable(), closetAvatarSimpleValue.isBuyable()) && p.c(getRequiredCoin(), closetAvatarSimpleValue.getRequiredCoin()) && p.c(getIconUrl(), closetAvatarSimpleValue.getIconUrl()) && p.c(getUpdatedAt(), closetAvatarSimpleValue.getUpdatedAt()) && isLimitedTime() == closetAvatarSimpleValue.isLimitedTime() && p.c(getBannerImageUrl(), closetAvatarSimpleValue.getBannerImageUrl()) && p.c(getBannerLink(), closetAvatarSimpleValue.getBannerLink()) && p.c(getGameEffect(), closetAvatarSimpleValue.getGameEffect()) && isTrial() == closetAvatarSimpleValue.isTrial();
        }
        return false;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getBannerImageUrl() {
        return this.bannerImageUrl;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getBannerLink() {
        return this.bannerLink;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public GameEffect getGameEffect() {
        return this.gameEffect;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getIconUrl() {
        return this.iconUrl;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getId() {
        return this.f21648id;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getPartTitle() {
        return this.partTitle;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public Integer getRequiredCoin() {
        return this.requiredCoin;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((((((((((((getId().hashCode() * 31) + this.value.hashCode()) * 31) + (getPartTitle() == null ? 0 : getPartTitle().hashCode())) * 31) + (isBuyable() == null ? 0 : isBuyable().hashCode())) * 31) + (getRequiredCoin() == null ? 0 : getRequiredCoin().hashCode())) * 31) + (getIconUrl() == null ? 0 : getIconUrl().hashCode())) * 31) + (getUpdatedAt() == null ? 0 : getUpdatedAt().hashCode())) * 31;
        boolean isLimitedTime = isLimitedTime();
        int i10 = isLimitedTime;
        if (isLimitedTime) {
            i10 = 1;
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + (getBannerImageUrl() == null ? 0 : getBannerImageUrl().hashCode())) * 31) + (getBannerLink() == null ? 0 : getBannerLink().hashCode())) * 31) + (getGameEffect() != null ? getGameEffect().hashCode() : 0)) * 31;
        boolean isTrial = isTrial();
        return hashCode2 + (isTrial ? 1 : isTrial);
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public Integer isBuyable() {
        return this.isBuyable;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public boolean isLimitedTime() {
        return this.isLimitedTime;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public boolean isOwn() {
        return ClosetBuyable.DefaultImpls.isOwn(this);
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public boolean isTrial() {
        return this.isTrial;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public void setBuyable(Integer num) {
        this.isBuyable = num;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(String str) {
        p.h(str, "<set-?>");
        this.f21648id = str;
    }

    public void setPartTitle(String str) {
        this.partTitle = str;
    }

    public void setRequiredCoin(Integer num) {
        this.requiredCoin = num;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public void setUpdatedAt(Long l10) {
        this.updatedAt = l10;
    }

    public String toString() {
        return "ClosetAvatarSimpleValue(id=" + getId() + ", value=" + this.value + ", partTitle=" + getPartTitle() + ", isBuyable=" + isBuyable() + ", requiredCoin=" + getRequiredCoin() + ", iconUrl=" + getIconUrl() + ", updatedAt=" + getUpdatedAt() + ", isLimitedTime=" + isLimitedTime() + ", bannerImageUrl=" + getBannerImageUrl() + ", bannerLink=" + getBannerLink() + ", gameEffect=" + getGameEffect() + ", isTrial=" + isTrial() + ')';
    }
}
