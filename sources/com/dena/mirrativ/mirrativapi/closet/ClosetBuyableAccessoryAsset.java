package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.closet.ClosetBuyable;
import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ClosetBuyableAccessoryAsset implements ClosetBuyable {
    @b(BooleanTypeAdapter.class)
    private final Boolean addPartTextEnabled;
    private final String assetBundleName;
    private final String assetBundlePrefabName;
    private final String bannerImageUrl;
    private final String bannerLink;
    private final GameEffect gameEffect;
    private final String helpImageUrl;
    private final String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private final String f21650id;
    private Integer isBuyable;
    @b(BooleanTypeAdapter.class)
    private final boolean isLimitedTime;
    private final boolean isTrial;
    private final String name;
    private String partText;
    private final String partTitle;
    private final String position;
    private final Integer rarity;
    private final Integer requiredCoin;
    private final Integer requiredKandume;
    private Long updatedAt;

    public ClosetBuyableAccessoryAsset(String str, String str2, Integer num, Integer num2, String str3, Long l10, String str4, Boolean bool, String str5, String str6, String str7, String str8, Integer num3, String str9, boolean z10, String str10, String str11, GameEffect gameEffect, boolean z11, Integer num4) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str5, "assetBundleName");
        p.h(str6, "assetBundlePrefabName");
        this.f21650id = str;
        this.partTitle = str2;
        this.isBuyable = num;
        this.requiredCoin = num2;
        this.iconUrl = str3;
        this.updatedAt = l10;
        this.partText = str4;
        this.addPartTextEnabled = bool;
        this.assetBundleName = str5;
        this.assetBundlePrefabName = str6;
        this.helpImageUrl = str7;
        this.position = str8;
        this.requiredKandume = num3;
        this.name = str9;
        this.isLimitedTime = z10;
        this.bannerImageUrl = str10;
        this.bannerLink = str11;
        this.gameEffect = gameEffect;
        this.isTrial = z11;
        this.rarity = num4;
    }

    public final String component1() {
        return getId();
    }

    public final String component10() {
        return this.assetBundlePrefabName;
    }

    public final String component11() {
        return this.helpImageUrl;
    }

    public final String component12() {
        return this.position;
    }

    public final Integer component13() {
        return this.requiredKandume;
    }

    public final String component14() {
        return this.name;
    }

    public final boolean component15() {
        return isLimitedTime();
    }

    public final String component16() {
        return getBannerImageUrl();
    }

    public final String component17() {
        return getBannerLink();
    }

    public final GameEffect component18() {
        return getGameEffect();
    }

    public final boolean component19() {
        return isTrial();
    }

    public final String component2() {
        return getPartTitle();
    }

    public final Integer component20() {
        return this.rarity;
    }

    public final Integer component3() {
        return isBuyable();
    }

    public final Integer component4() {
        return getRequiredCoin();
    }

    public final String component5() {
        return getIconUrl();
    }

    public final Long component6() {
        return getUpdatedAt();
    }

    public final String component7() {
        return this.partText;
    }

    public final Boolean component8() {
        return this.addPartTextEnabled;
    }

    public final String component9() {
        return this.assetBundleName;
    }

    public final ClosetAccessoryAsset convertClosetAssets() {
        return new ClosetAccessoryAsset(Integer.parseInt(getId()), this.partText, this.addPartTextEnabled, this.helpImageUrl, this.assetBundleName, this.assetBundlePrefabName, this.position, this.name, getGameEffect());
    }

    public final ClosetBuyableAccessoryAsset copy(String str, String str2, Integer num, Integer num2, String str3, Long l10, String str4, Boolean bool, String str5, String str6, String str7, String str8, Integer num3, String str9, boolean z10, String str10, String str11, GameEffect gameEffect, boolean z11, Integer num4) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str5, "assetBundleName");
        p.h(str6, "assetBundlePrefabName");
        return new ClosetBuyableAccessoryAsset(str, str2, num, num2, str3, l10, str4, bool, str5, str6, str7, str8, num3, str9, z10, str10, str11, gameEffect, z11, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetBuyableAccessoryAsset) {
            ClosetBuyableAccessoryAsset closetBuyableAccessoryAsset = (ClosetBuyableAccessoryAsset) obj;
            return p.c(getId(), closetBuyableAccessoryAsset.getId()) && p.c(getPartTitle(), closetBuyableAccessoryAsset.getPartTitle()) && p.c(isBuyable(), closetBuyableAccessoryAsset.isBuyable()) && p.c(getRequiredCoin(), closetBuyableAccessoryAsset.getRequiredCoin()) && p.c(getIconUrl(), closetBuyableAccessoryAsset.getIconUrl()) && p.c(getUpdatedAt(), closetBuyableAccessoryAsset.getUpdatedAt()) && p.c(this.partText, closetBuyableAccessoryAsset.partText) && p.c(this.addPartTextEnabled, closetBuyableAccessoryAsset.addPartTextEnabled) && p.c(this.assetBundleName, closetBuyableAccessoryAsset.assetBundleName) && p.c(this.assetBundlePrefabName, closetBuyableAccessoryAsset.assetBundlePrefabName) && p.c(this.helpImageUrl, closetBuyableAccessoryAsset.helpImageUrl) && p.c(this.position, closetBuyableAccessoryAsset.position) && p.c(this.requiredKandume, closetBuyableAccessoryAsset.requiredKandume) && p.c(this.name, closetBuyableAccessoryAsset.name) && isLimitedTime() == closetBuyableAccessoryAsset.isLimitedTime() && p.c(getBannerImageUrl(), closetBuyableAccessoryAsset.getBannerImageUrl()) && p.c(getBannerLink(), closetBuyableAccessoryAsset.getBannerLink()) && p.c(getGameEffect(), closetBuyableAccessoryAsset.getGameEffect()) && isTrial() == closetBuyableAccessoryAsset.isTrial() && p.c(this.rarity, closetBuyableAccessoryAsset.rarity);
        }
        return false;
    }

    public final Boolean getAddPartTextEnabled() {
        return this.addPartTextEnabled;
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

    public final String getHelpImageUrl() {
        return this.helpImageUrl;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getIconUrl() {
        return this.iconUrl;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getId() {
        return this.f21650id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartText() {
        return this.partText;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getPartTitle() {
        return this.partTitle;
    }

    public final String getPosition() {
        return this.position;
    }

    public final Integer getRarity() {
        return this.rarity;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public Integer getRequiredCoin() {
        return this.requiredCoin;
    }

    public final Integer getRequiredKandume() {
        return this.requiredKandume;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = ((((((((((getId().hashCode() * 31) + (getPartTitle() == null ? 0 : getPartTitle().hashCode())) * 31) + (isBuyable() == null ? 0 : isBuyable().hashCode())) * 31) + (getRequiredCoin() == null ? 0 : getRequiredCoin().hashCode())) * 31) + (getIconUrl() == null ? 0 : getIconUrl().hashCode())) * 31) + (getUpdatedAt() == null ? 0 : getUpdatedAt().hashCode())) * 31;
        String str = this.partText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.addPartTextEnabled;
        int hashCode3 = (((((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.assetBundleName.hashCode()) * 31) + this.assetBundlePrefabName.hashCode()) * 31;
        String str2 = this.helpImageUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.position;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.requiredKandume;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.name;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean isLimitedTime = isLimitedTime();
        int i10 = isLimitedTime;
        if (isLimitedTime) {
            i10 = 1;
        }
        int hashCode8 = (((((((hashCode7 + i10) * 31) + (getBannerImageUrl() == null ? 0 : getBannerImageUrl().hashCode())) * 31) + (getBannerLink() == null ? 0 : getBannerLink().hashCode())) * 31) + (getGameEffect() == null ? 0 : getGameEffect().hashCode())) * 31;
        boolean isTrial = isTrial();
        int i11 = (hashCode8 + (isTrial ? 1 : isTrial)) * 31;
        Integer num2 = this.rarity;
        return i11 + (num2 != null ? num2.hashCode() : 0);
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

    public final void setPartText(String str) {
        this.partText = str;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public void setUpdatedAt(Long l10) {
        this.updatedAt = l10;
    }

    public String toString() {
        return "ClosetBuyableAccessoryAsset(id=" + getId() + ", partTitle=" + getPartTitle() + ", isBuyable=" + isBuyable() + ", requiredCoin=" + getRequiredCoin() + ", iconUrl=" + getIconUrl() + ", updatedAt=" + getUpdatedAt() + ", partText=" + this.partText + ", addPartTextEnabled=" + this.addPartTextEnabled + ", assetBundleName=" + this.assetBundleName + ", assetBundlePrefabName=" + this.assetBundlePrefabName + ", helpImageUrl=" + this.helpImageUrl + ", position=" + this.position + ", requiredKandume=" + this.requiredKandume + ", name=" + this.name + ", isLimitedTime=" + isLimitedTime() + ", bannerImageUrl=" + getBannerImageUrl() + ", bannerLink=" + getBannerLink() + ", gameEffect=" + getGameEffect() + ", isTrial=" + isTrial() + ", rarity=" + this.rarity + ')';
    }
}
