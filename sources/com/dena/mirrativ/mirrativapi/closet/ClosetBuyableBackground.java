package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.closet.ClosetBuyable;
import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ClosetBuyableBackground implements ClosetBuyable {
    private final String assetBundleName;
    private final String assetBundlePrefabName;
    private final String bannerImageUrl;
    private final String bannerLink;
    private final GameEffect gameEffect;
    private final String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private final String f21652id;
    private Integer isBuyable;
    @b(BooleanTypeAdapter.class)
    private final boolean isLimitedTime;
    private final boolean isTrial;
    private final String partTitle;
    private final String position;
    private final Integer requiredCoin;
    private Long updatedAt;
    private String url;

    public ClosetBuyableBackground(String str, String str2, String str3, Integer num, Integer num2, String str4, Long l10, String str5, String str6, String str7, boolean z10, String str8, String str9, GameEffect gameEffect, boolean z11) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "url");
        this.f21652id = str;
        this.url = str2;
        this.partTitle = str3;
        this.isBuyable = num;
        this.requiredCoin = num2;
        this.iconUrl = str4;
        this.updatedAt = l10;
        this.assetBundleName = str5;
        this.assetBundlePrefabName = str6;
        this.position = str7;
        this.isLimitedTime = z10;
        this.bannerImageUrl = str8;
        this.bannerLink = str9;
        this.gameEffect = gameEffect;
        this.isTrial = z11;
    }

    public final String component1() {
        return getId();
    }

    public final String component10() {
        return this.position;
    }

    public final boolean component11() {
        return isLimitedTime();
    }

    public final String component12() {
        return getBannerImageUrl();
    }

    public final String component13() {
        return getBannerLink();
    }

    public final GameEffect component14() {
        return getGameEffect();
    }

    public final boolean component15() {
        return isTrial();
    }

    public final String component2() {
        return this.url;
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

    public final String component8() {
        return this.assetBundleName;
    }

    public final String component9() {
        return this.assetBundlePrefabName;
    }

    public final ClosetBackground convertClosetBackground() {
        return new ClosetBackground(Integer.parseInt(getId()), this.url, this.assetBundleName, this.assetBundlePrefabName, this.position, getGameEffect());
    }

    public final ClosetBuyableBackground copy(String str, String str2, String str3, Integer num, Integer num2, String str4, Long l10, String str5, String str6, String str7, boolean z10, String str8, String str9, GameEffect gameEffect, boolean z11) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "url");
        return new ClosetBuyableBackground(str, str2, str3, num, num2, str4, l10, str5, str6, str7, z10, str8, str9, gameEffect, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetBuyableBackground) {
            ClosetBuyableBackground closetBuyableBackground = (ClosetBuyableBackground) obj;
            return p.c(getId(), closetBuyableBackground.getId()) && p.c(this.url, closetBuyableBackground.url) && p.c(getPartTitle(), closetBuyableBackground.getPartTitle()) && p.c(isBuyable(), closetBuyableBackground.isBuyable()) && p.c(getRequiredCoin(), closetBuyableBackground.getRequiredCoin()) && p.c(getIconUrl(), closetBuyableBackground.getIconUrl()) && p.c(getUpdatedAt(), closetBuyableBackground.getUpdatedAt()) && p.c(this.assetBundleName, closetBuyableBackground.assetBundleName) && p.c(this.assetBundlePrefabName, closetBuyableBackground.assetBundlePrefabName) && p.c(this.position, closetBuyableBackground.position) && isLimitedTime() == closetBuyableBackground.isLimitedTime() && p.c(getBannerImageUrl(), closetBuyableBackground.getBannerImageUrl()) && p.c(getBannerLink(), closetBuyableBackground.getBannerLink()) && p.c(getGameEffect(), closetBuyableBackground.getGameEffect()) && isTrial() == closetBuyableBackground.isTrial();
        }
        return false;
    }

    public final String getAssetBundleName() {
        return this.assetBundleName;
    }

    public final String getAssetBundlePrefabName() {
        return this.assetBundlePrefabName;
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
        return this.f21652id;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getPartTitle() {
        return this.partTitle;
    }

    public final String getPosition() {
        return this.position;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public Integer getRequiredCoin() {
        return this.requiredCoin;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((((((((((((getId().hashCode() * 31) + this.url.hashCode()) * 31) + (getPartTitle() == null ? 0 : getPartTitle().hashCode())) * 31) + (isBuyable() == null ? 0 : isBuyable().hashCode())) * 31) + (getRequiredCoin() == null ? 0 : getRequiredCoin().hashCode())) * 31) + (getIconUrl() == null ? 0 : getIconUrl().hashCode())) * 31) + (getUpdatedAt() == null ? 0 : getUpdatedAt().hashCode())) * 31;
        String str = this.assetBundleName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.assetBundlePrefabName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.position;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean isLimitedTime = isLimitedTime();
        int i10 = isLimitedTime;
        if (isLimitedTime) {
            i10 = 1;
        }
        int hashCode5 = (((((((hashCode4 + i10) * 31) + (getBannerImageUrl() == null ? 0 : getBannerImageUrl().hashCode())) * 31) + (getBannerLink() == null ? 0 : getBannerLink().hashCode())) * 31) + (getGameEffect() != null ? getGameEffect().hashCode() : 0)) * 31;
        boolean isTrial = isTrial();
        return hashCode5 + (isTrial ? 1 : isTrial);
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

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public void setUpdatedAt(Long l10) {
        this.updatedAt = l10;
    }

    public final void setUrl(String str) {
        p.h(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        return "ClosetBuyableBackground(id=" + getId() + ", url=" + this.url + ", partTitle=" + getPartTitle() + ", isBuyable=" + isBuyable() + ", requiredCoin=" + getRequiredCoin() + ", iconUrl=" + getIconUrl() + ", updatedAt=" + getUpdatedAt() + ", assetBundleName=" + this.assetBundleName + ", assetBundlePrefabName=" + this.assetBundlePrefabName + ", position=" + this.position + ", isLimitedTime=" + isLimitedTime() + ", bannerImageUrl=" + getBannerImageUrl() + ", bannerLink=" + getBannerLink() + ", gameEffect=" + getGameEffect() + ", isTrial=" + isTrial() + ')';
    }
}
