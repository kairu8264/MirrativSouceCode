package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.closet.ClosetBuyable;
import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ClosetBuyableSetupClothes implements ClosetBuyable {
    private final String assetBundleName;
    private final String assetBundlePrefabName;
    private final String bannerImageUrl;
    private final String bannerLink;
    private final List<String> excludeParts;
    private final GameEffect gameEffect;
    private final String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private final String f21653id;
    private Integer isBuyable;
    @b(BooleanTypeAdapter.class)
    private final boolean isLimitedTime;
    private final boolean isTrial;
    private final String partTitle;
    private final Integer requiredCoin;
    private Long updatedAt;

    public ClosetBuyableSetupClothes(String str, String str2, Integer num, Integer num2, String str3, Long l10, String str4, String str5, List<String> list, boolean z10, String str6, String str7, GameEffect gameEffect, boolean z11) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str4, "assetBundleName");
        p.h(str5, "assetBundlePrefabName");
        p.h(list, "excludeParts");
        this.f21653id = str;
        this.partTitle = str2;
        this.isBuyable = num;
        this.requiredCoin = num2;
        this.iconUrl = str3;
        this.updatedAt = l10;
        this.assetBundleName = str4;
        this.assetBundlePrefabName = str5;
        this.excludeParts = list;
        this.isLimitedTime = z10;
        this.bannerImageUrl = str6;
        this.bannerLink = str7;
        this.gameEffect = gameEffect;
        this.isTrial = z11;
    }

    public final String component1() {
        return getId();
    }

    public final boolean component10() {
        return isLimitedTime();
    }

    public final String component11() {
        return getBannerImageUrl();
    }

    public final String component12() {
        return getBannerLink();
    }

    public final GameEffect component13() {
        return getGameEffect();
    }

    public final boolean component14() {
        return isTrial();
    }

    public final String component2() {
        return getPartTitle();
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
        return this.assetBundleName;
    }

    public final String component8() {
        return this.assetBundlePrefabName;
    }

    public final List<String> component9() {
        return this.excludeParts;
    }

    public final ClosetSetupClotheAsset convertSetupClotheAssets() {
        return new ClosetSetupClotheAsset(Integer.parseInt(getId()), this.assetBundleName, this.assetBundlePrefabName, this.excludeParts, getGameEffect());
    }

    public final ClosetBuyableSetupClothes copy(String str, String str2, Integer num, Integer num2, String str3, Long l10, String str4, String str5, List<String> list, boolean z10, String str6, String str7, GameEffect gameEffect, boolean z11) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str4, "assetBundleName");
        p.h(str5, "assetBundlePrefabName");
        p.h(list, "excludeParts");
        return new ClosetBuyableSetupClothes(str, str2, num, num2, str3, l10, str4, str5, list, z10, str6, str7, gameEffect, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetBuyableSetupClothes) {
            ClosetBuyableSetupClothes closetBuyableSetupClothes = (ClosetBuyableSetupClothes) obj;
            return p.c(getId(), closetBuyableSetupClothes.getId()) && p.c(getPartTitle(), closetBuyableSetupClothes.getPartTitle()) && p.c(isBuyable(), closetBuyableSetupClothes.isBuyable()) && p.c(getRequiredCoin(), closetBuyableSetupClothes.getRequiredCoin()) && p.c(getIconUrl(), closetBuyableSetupClothes.getIconUrl()) && p.c(getUpdatedAt(), closetBuyableSetupClothes.getUpdatedAt()) && p.c(this.assetBundleName, closetBuyableSetupClothes.assetBundleName) && p.c(this.assetBundlePrefabName, closetBuyableSetupClothes.assetBundlePrefabName) && p.c(this.excludeParts, closetBuyableSetupClothes.excludeParts) && isLimitedTime() == closetBuyableSetupClothes.isLimitedTime() && p.c(getBannerImageUrl(), closetBuyableSetupClothes.getBannerImageUrl()) && p.c(getBannerLink(), closetBuyableSetupClothes.getBannerLink()) && p.c(getGameEffect(), closetBuyableSetupClothes.getGameEffect()) && isTrial() == closetBuyableSetupClothes.isTrial();
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

    public final List<String> getExcludeParts() {
        return this.excludeParts;
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
        return this.f21653id;
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

    public int hashCode() {
        int hashCode = ((((((((((((((((getId().hashCode() * 31) + (getPartTitle() == null ? 0 : getPartTitle().hashCode())) * 31) + (isBuyable() == null ? 0 : isBuyable().hashCode())) * 31) + (getRequiredCoin() == null ? 0 : getRequiredCoin().hashCode())) * 31) + (getIconUrl() == null ? 0 : getIconUrl().hashCode())) * 31) + (getUpdatedAt() == null ? 0 : getUpdatedAt().hashCode())) * 31) + this.assetBundleName.hashCode()) * 31) + this.assetBundlePrefabName.hashCode()) * 31) + this.excludeParts.hashCode()) * 31;
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

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public void setUpdatedAt(Long l10) {
        this.updatedAt = l10;
    }

    public String toString() {
        return "ClosetBuyableSetupClothes(id=" + getId() + ", partTitle=" + getPartTitle() + ", isBuyable=" + isBuyable() + ", requiredCoin=" + getRequiredCoin() + ", iconUrl=" + getIconUrl() + ", updatedAt=" + getUpdatedAt() + ", assetBundleName=" + this.assetBundleName + ", assetBundlePrefabName=" + this.assetBundlePrefabName + ", excludeParts=" + this.excludeParts + ", isLimitedTime=" + isLimitedTime() + ", bannerImageUrl=" + getBannerImageUrl() + ", bannerLink=" + getBannerLink() + ", gameEffect=" + getGameEffect() + ", isTrial=" + isTrial() + ')';
    }
}
