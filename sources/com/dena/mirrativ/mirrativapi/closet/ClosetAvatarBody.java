package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.closet.ClosetBuyable;
import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ClosetAvatarBody implements ClosetBuyable {
    private final List<ClosetBuyableAccessoryAsset> backWings;
    private final String bannerImageUrl;
    private final String bannerLink;
    private final List<ClosetBuyableAsset> beards;
    private final String bodyId;
    private final List<ClosetBuyableAsset> bottoms;
    private final List<ClosetBuyableAccessoryAsset> centerInteriors;
    private final List<ClosetBuyableAsset> cheeks;
    private final List<ClosetBuyableAccessoryAsset> effects;
    private final List<ClosetBuyableAsset> eyebrows;
    private final List<ClosetBuyableAsset> eyes;
    private final List<ClosetBuyableAsset> eyeshadows;
    private final List<ClosetBuyableAsset> facePaints;
    private final GameEffect gameEffect;
    private final List<ClosetBuyableAccessoryAsset> glasses;
    private final List<ClosetBuyableAsset> hairs;
    private final List<ClosetBuyableAccessoryAsset> hats;
    private final List<ClosetBuyableAsset> heads;
    private String iconUrl;

    /* renamed from: id  reason: collision with root package name */
    private final String f21645id;
    private Integer isBuyable;
    @b(BooleanTypeAdapter.class)
    private final boolean isLimitedTime;
    private final boolean isTrial;
    private final List<ClosetBuyableAccessoryAsset> leftInteriors;
    private final List<ClosetBuyableAsset> lips;
    private final List<ClosetBuyableAsset> mouths;
    private final List<ClosetBuyableAsset> noses;
    private final List<ClosetBuyableSetupClothes> onepieces;
    private final String partTitle;
    private final List<ClosetAvatarSimpleValue> personas;
    private final List<ClosetBuyableAccessoryAsset> pets;
    private final List<ClosetAvatarSimpleValue> proportions;
    private final Integer requiredCoin;
    private final List<ClosetBuyableAccessoryAsset> rightInteriors;
    private final List<ClosetBuyableAccessoryAsset> scarfs;
    private final List<ClosetBuyableSetupClothes> setupClothes;
    private final List<ClosetBuyableAsset> shoes;
    private final List<ClosetBuyableAsset> socks;
    private final List<ClosetBuyableAsset> tops;
    private Long updatedAt;
    private final List<ClosetBuyableAccessoryAsset> weapons;
    private final List<ClosetBuyableAccessoryAsset> wings;

    public ClosetAvatarBody(String str, String str2, Integer num, Integer num2, Long l10, boolean z10, String str3, String str4, GameEffect gameEffect, boolean z11, String str5, String str6, List<ClosetAvatarSimpleValue> list, List<ClosetAvatarSimpleValue> list2, List<ClosetBuyableAsset> list3, List<ClosetBuyableAsset> list4, List<ClosetBuyableAsset> list5, List<ClosetBuyableAsset> list6, List<ClosetBuyableAsset> list7, List<ClosetBuyableAsset> list8, List<ClosetBuyableAsset> list9, List<ClosetBuyableAsset> list10, List<ClosetBuyableAsset> list11, List<ClosetBuyableAsset> list12, List<ClosetBuyableAsset> list13, List<ClosetBuyableAsset> list14, List<ClosetBuyableAsset> list15, List<ClosetBuyableAsset> list16, List<ClosetBuyableAsset> list17, List<ClosetBuyableAccessoryAsset> list18, List<ClosetBuyableAccessoryAsset> list19, List<ClosetBuyableSetupClothes> list20, List<ClosetBuyableSetupClothes> list21, List<ClosetBuyableAccessoryAsset> list22, List<ClosetBuyableAccessoryAsset> list23, List<ClosetBuyableAccessoryAsset> list24, List<ClosetBuyableAccessoryAsset> list25, List<ClosetBuyableAccessoryAsset> list26, List<ClosetBuyableAccessoryAsset> list27, List<ClosetBuyableAccessoryAsset> list28, List<ClosetBuyableAccessoryAsset> list29, List<ClosetBuyableAccessoryAsset> list30) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str5, "bodyId");
        this.f21645id = str;
        this.partTitle = str2;
        this.isBuyable = num;
        this.requiredCoin = num2;
        this.updatedAt = l10;
        this.isLimitedTime = z10;
        this.bannerImageUrl = str3;
        this.bannerLink = str4;
        this.gameEffect = gameEffect;
        this.isTrial = z11;
        this.bodyId = str5;
        this.iconUrl = str6;
        this.personas = list;
        this.proportions = list2;
        this.beards = list3;
        this.bottoms = list4;
        this.cheeks = list5;
        this.eyes = list6;
        this.eyebrows = list7;
        this.eyeshadows = list8;
        this.facePaints = list9;
        this.hairs = list10;
        this.heads = list11;
        this.lips = list12;
        this.mouths = list13;
        this.noses = list14;
        this.shoes = list15;
        this.socks = list16;
        this.tops = list17;
        this.weapons = list18;
        this.wings = list19;
        this.setupClothes = list20;
        this.onepieces = list21;
        this.glasses = list22;
        this.hats = list23;
        this.pets = list24;
        this.scarfs = list25;
        this.backWings = list26;
        this.effects = list27;
        this.leftInteriors = list28;
        this.centerInteriors = list29;
        this.rightInteriors = list30;
    }

    public final String component1() {
        return getId();
    }

    public final boolean component10() {
        return isTrial();
    }

    public final String component11() {
        return this.bodyId;
    }

    public final String component12() {
        return getIconUrl();
    }

    public final List<ClosetAvatarSimpleValue> component13() {
        return this.personas;
    }

    public final List<ClosetAvatarSimpleValue> component14() {
        return this.proportions;
    }

    public final List<ClosetBuyableAsset> component15() {
        return this.beards;
    }

    public final List<ClosetBuyableAsset> component16() {
        return this.bottoms;
    }

    public final List<ClosetBuyableAsset> component17() {
        return this.cheeks;
    }

    public final List<ClosetBuyableAsset> component18() {
        return this.eyes;
    }

    public final List<ClosetBuyableAsset> component19() {
        return this.eyebrows;
    }

    public final String component2() {
        return getPartTitle();
    }

    public final List<ClosetBuyableAsset> component20() {
        return this.eyeshadows;
    }

    public final List<ClosetBuyableAsset> component21() {
        return this.facePaints;
    }

    public final List<ClosetBuyableAsset> component22() {
        return this.hairs;
    }

    public final List<ClosetBuyableAsset> component23() {
        return this.heads;
    }

    public final List<ClosetBuyableAsset> component24() {
        return this.lips;
    }

    public final List<ClosetBuyableAsset> component25() {
        return this.mouths;
    }

    public final List<ClosetBuyableAsset> component26() {
        return this.noses;
    }

    public final List<ClosetBuyableAsset> component27() {
        return this.shoes;
    }

    public final List<ClosetBuyableAsset> component28() {
        return this.socks;
    }

    public final List<ClosetBuyableAsset> component29() {
        return this.tops;
    }

    public final Integer component3() {
        return isBuyable();
    }

    public final List<ClosetBuyableAccessoryAsset> component30() {
        return this.weapons;
    }

    public final List<ClosetBuyableAccessoryAsset> component31() {
        return this.wings;
    }

    public final List<ClosetBuyableSetupClothes> component32() {
        return this.setupClothes;
    }

    public final List<ClosetBuyableSetupClothes> component33() {
        return this.onepieces;
    }

    public final List<ClosetBuyableAccessoryAsset> component34() {
        return this.glasses;
    }

    public final List<ClosetBuyableAccessoryAsset> component35() {
        return this.hats;
    }

    public final List<ClosetBuyableAccessoryAsset> component36() {
        return this.pets;
    }

    public final List<ClosetBuyableAccessoryAsset> component37() {
        return this.scarfs;
    }

    public final List<ClosetBuyableAccessoryAsset> component38() {
        return this.backWings;
    }

    public final List<ClosetBuyableAccessoryAsset> component39() {
        return this.effects;
    }

    public final Integer component4() {
        return getRequiredCoin();
    }

    public final List<ClosetBuyableAccessoryAsset> component40() {
        return this.leftInteriors;
    }

    public final List<ClosetBuyableAccessoryAsset> component41() {
        return this.centerInteriors;
    }

    public final List<ClosetBuyableAccessoryAsset> component42() {
        return this.rightInteriors;
    }

    public final Long component5() {
        return getUpdatedAt();
    }

    public final boolean component6() {
        return isLimitedTime();
    }

    public final String component7() {
        return getBannerImageUrl();
    }

    public final String component8() {
        return getBannerLink();
    }

    public final GameEffect component9() {
        return getGameEffect();
    }

    public final ClosetAvatarBody copy(String str, String str2, Integer num, Integer num2, Long l10, boolean z10, String str3, String str4, GameEffect gameEffect, boolean z11, String str5, String str6, List<ClosetAvatarSimpleValue> list, List<ClosetAvatarSimpleValue> list2, List<ClosetBuyableAsset> list3, List<ClosetBuyableAsset> list4, List<ClosetBuyableAsset> list5, List<ClosetBuyableAsset> list6, List<ClosetBuyableAsset> list7, List<ClosetBuyableAsset> list8, List<ClosetBuyableAsset> list9, List<ClosetBuyableAsset> list10, List<ClosetBuyableAsset> list11, List<ClosetBuyableAsset> list12, List<ClosetBuyableAsset> list13, List<ClosetBuyableAsset> list14, List<ClosetBuyableAsset> list15, List<ClosetBuyableAsset> list16, List<ClosetBuyableAsset> list17, List<ClosetBuyableAccessoryAsset> list18, List<ClosetBuyableAccessoryAsset> list19, List<ClosetBuyableSetupClothes> list20, List<ClosetBuyableSetupClothes> list21, List<ClosetBuyableAccessoryAsset> list22, List<ClosetBuyableAccessoryAsset> list23, List<ClosetBuyableAccessoryAsset> list24, List<ClosetBuyableAccessoryAsset> list25, List<ClosetBuyableAccessoryAsset> list26, List<ClosetBuyableAccessoryAsset> list27, List<ClosetBuyableAccessoryAsset> list28, List<ClosetBuyableAccessoryAsset> list29, List<ClosetBuyableAccessoryAsset> list30) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str5, "bodyId");
        return new ClosetAvatarBody(str, str2, num, num2, l10, z10, str3, str4, gameEffect, z11, str5, str6, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, list16, list17, list18, list19, list20, list21, list22, list23, list24, list25, list26, list27, list28, list29, list30);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetAvatarBody) {
            ClosetAvatarBody closetAvatarBody = (ClosetAvatarBody) obj;
            return p.c(getId(), closetAvatarBody.getId()) && p.c(getPartTitle(), closetAvatarBody.getPartTitle()) && p.c(isBuyable(), closetAvatarBody.isBuyable()) && p.c(getRequiredCoin(), closetAvatarBody.getRequiredCoin()) && p.c(getUpdatedAt(), closetAvatarBody.getUpdatedAt()) && isLimitedTime() == closetAvatarBody.isLimitedTime() && p.c(getBannerImageUrl(), closetAvatarBody.getBannerImageUrl()) && p.c(getBannerLink(), closetAvatarBody.getBannerLink()) && p.c(getGameEffect(), closetAvatarBody.getGameEffect()) && isTrial() == closetAvatarBody.isTrial() && p.c(this.bodyId, closetAvatarBody.bodyId) && p.c(getIconUrl(), closetAvatarBody.getIconUrl()) && p.c(this.personas, closetAvatarBody.personas) && p.c(this.proportions, closetAvatarBody.proportions) && p.c(this.beards, closetAvatarBody.beards) && p.c(this.bottoms, closetAvatarBody.bottoms) && p.c(this.cheeks, closetAvatarBody.cheeks) && p.c(this.eyes, closetAvatarBody.eyes) && p.c(this.eyebrows, closetAvatarBody.eyebrows) && p.c(this.eyeshadows, closetAvatarBody.eyeshadows) && p.c(this.facePaints, closetAvatarBody.facePaints) && p.c(this.hairs, closetAvatarBody.hairs) && p.c(this.heads, closetAvatarBody.heads) && p.c(this.lips, closetAvatarBody.lips) && p.c(this.mouths, closetAvatarBody.mouths) && p.c(this.noses, closetAvatarBody.noses) && p.c(this.shoes, closetAvatarBody.shoes) && p.c(this.socks, closetAvatarBody.socks) && p.c(this.tops, closetAvatarBody.tops) && p.c(this.weapons, closetAvatarBody.weapons) && p.c(this.wings, closetAvatarBody.wings) && p.c(this.setupClothes, closetAvatarBody.setupClothes) && p.c(this.onepieces, closetAvatarBody.onepieces) && p.c(this.glasses, closetAvatarBody.glasses) && p.c(this.hats, closetAvatarBody.hats) && p.c(this.pets, closetAvatarBody.pets) && p.c(this.scarfs, closetAvatarBody.scarfs) && p.c(this.backWings, closetAvatarBody.backWings) && p.c(this.effects, closetAvatarBody.effects) && p.c(this.leftInteriors, closetAvatarBody.leftInteriors) && p.c(this.centerInteriors, closetAvatarBody.centerInteriors) && p.c(this.rightInteriors, closetAvatarBody.rightInteriors);
        }
        return false;
    }

    public final List<ClosetBuyableAccessoryAsset> getBackWings() {
        return this.backWings;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getBannerImageUrl() {
        return this.bannerImageUrl;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getBannerLink() {
        return this.bannerLink;
    }

    public final List<ClosetBuyableAsset> getBeards() {
        return this.beards;
    }

    public final String getBodyId() {
        return this.bodyId;
    }

    public final List<ClosetBuyableAsset> getBottoms() {
        return this.bottoms;
    }

    public final List<ClosetBuyableAccessoryAsset> getCenterInteriors() {
        return this.centerInteriors;
    }

    public final List<ClosetBuyableAsset> getCheeks() {
        return this.cheeks;
    }

    public final List<ClosetBuyableAccessoryAsset> getEffects() {
        return this.effects;
    }

    public final List<ClosetBuyableAsset> getEyebrows() {
        return this.eyebrows;
    }

    public final List<ClosetBuyableAsset> getEyes() {
        return this.eyes;
    }

    public final List<ClosetBuyableAsset> getEyeshadows() {
        return this.eyeshadows;
    }

    public final List<ClosetBuyableAsset> getFacePaints() {
        return this.facePaints;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public GameEffect getGameEffect() {
        return this.gameEffect;
    }

    public final List<ClosetBuyableAccessoryAsset> getGlasses() {
        return this.glasses;
    }

    public final List<ClosetBuyableAsset> getHairs() {
        return this.hairs;
    }

    public final List<ClosetBuyableAccessoryAsset> getHats() {
        return this.hats;
    }

    public final List<ClosetBuyableAsset> getHeads() {
        return this.heads;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getIconUrl() {
        return this.iconUrl;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getId() {
        return this.f21645id;
    }

    public final List<ClosetBuyableAccessoryAsset> getLeftInteriors() {
        return this.leftInteriors;
    }

    public final List<ClosetBuyableAsset> getLips() {
        return this.lips;
    }

    public final List<ClosetBuyableAsset> getMouths() {
        return this.mouths;
    }

    public final List<ClosetBuyableAsset> getNoses() {
        return this.noses;
    }

    public final List<ClosetBuyableSetupClothes> getOnepieces() {
        return this.onepieces;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public String getPartTitle() {
        return this.partTitle;
    }

    public final List<ClosetAvatarSimpleValue> getPersonas() {
        return this.personas;
    }

    public final List<ClosetBuyableAccessoryAsset> getPets() {
        return this.pets;
    }

    public final List<ClosetAvatarSimpleValue> getProportions() {
        return this.proportions;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public Integer getRequiredCoin() {
        return this.requiredCoin;
    }

    public final List<ClosetBuyableAccessoryAsset> getRightInteriors() {
        return this.rightInteriors;
    }

    public final List<ClosetBuyableAccessoryAsset> getScarfs() {
        return this.scarfs;
    }

    public final List<ClosetBuyableSetupClothes> getSetupClothes() {
        return this.setupClothes;
    }

    public final List<ClosetBuyableAsset> getShoes() {
        return this.shoes;
    }

    public final List<ClosetBuyableAsset> getSocks() {
        return this.socks;
    }

    public final List<ClosetBuyableAsset> getTops() {
        return this.tops;
    }

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public final List<ClosetBuyableAccessoryAsset> getWeapons() {
        return this.weapons;
    }

    public final List<ClosetBuyableAccessoryAsset> getWings() {
        return this.wings;
    }

    public int hashCode() {
        int hashCode = ((((((((getId().hashCode() * 31) + (getPartTitle() == null ? 0 : getPartTitle().hashCode())) * 31) + (isBuyable() == null ? 0 : isBuyable().hashCode())) * 31) + (getRequiredCoin() == null ? 0 : getRequiredCoin().hashCode())) * 31) + (getUpdatedAt() == null ? 0 : getUpdatedAt().hashCode())) * 31;
        boolean isLimitedTime = isLimitedTime();
        int i10 = isLimitedTime;
        if (isLimitedTime) {
            i10 = 1;
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + (getBannerImageUrl() == null ? 0 : getBannerImageUrl().hashCode())) * 31) + (getBannerLink() == null ? 0 : getBannerLink().hashCode())) * 31) + (getGameEffect() == null ? 0 : getGameEffect().hashCode())) * 31;
        boolean isTrial = isTrial();
        int hashCode3 = (((((hashCode2 + (isTrial ? 1 : isTrial)) * 31) + this.bodyId.hashCode()) * 31) + (getIconUrl() == null ? 0 : getIconUrl().hashCode())) * 31;
        List<ClosetAvatarSimpleValue> list = this.personas;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<ClosetAvatarSimpleValue> list2 = this.proportions;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ClosetBuyableAsset> list3 = this.beards;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ClosetBuyableAsset> list4 = this.bottoms;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<ClosetBuyableAsset> list5 = this.cheeks;
        int hashCode8 = (hashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<ClosetBuyableAsset> list6 = this.eyes;
        int hashCode9 = (hashCode8 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<ClosetBuyableAsset> list7 = this.eyebrows;
        int hashCode10 = (hashCode9 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<ClosetBuyableAsset> list8 = this.eyeshadows;
        int hashCode11 = (hashCode10 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<ClosetBuyableAsset> list9 = this.facePaints;
        int hashCode12 = (hashCode11 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<ClosetBuyableAsset> list10 = this.hairs;
        int hashCode13 = (hashCode12 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<ClosetBuyableAsset> list11 = this.heads;
        int hashCode14 = (hashCode13 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<ClosetBuyableAsset> list12 = this.lips;
        int hashCode15 = (hashCode14 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<ClosetBuyableAsset> list13 = this.mouths;
        int hashCode16 = (hashCode15 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<ClosetBuyableAsset> list14 = this.noses;
        int hashCode17 = (hashCode16 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<ClosetBuyableAsset> list15 = this.shoes;
        int hashCode18 = (hashCode17 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<ClosetBuyableAsset> list16 = this.socks;
        int hashCode19 = (hashCode18 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<ClosetBuyableAsset> list17 = this.tops;
        int hashCode20 = (hashCode19 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list18 = this.weapons;
        int hashCode21 = (hashCode20 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list19 = this.wings;
        int hashCode22 = (hashCode21 + (list19 == null ? 0 : list19.hashCode())) * 31;
        List<ClosetBuyableSetupClothes> list20 = this.setupClothes;
        int hashCode23 = (hashCode22 + (list20 == null ? 0 : list20.hashCode())) * 31;
        List<ClosetBuyableSetupClothes> list21 = this.onepieces;
        int hashCode24 = (hashCode23 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list22 = this.glasses;
        int hashCode25 = (hashCode24 + (list22 == null ? 0 : list22.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list23 = this.hats;
        int hashCode26 = (hashCode25 + (list23 == null ? 0 : list23.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list24 = this.pets;
        int hashCode27 = (hashCode26 + (list24 == null ? 0 : list24.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list25 = this.scarfs;
        int hashCode28 = (hashCode27 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list26 = this.backWings;
        int hashCode29 = (hashCode28 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list27 = this.effects;
        int hashCode30 = (hashCode29 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list28 = this.leftInteriors;
        int hashCode31 = (hashCode30 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list29 = this.centerInteriors;
        int hashCode32 = (hashCode31 + (list29 == null ? 0 : list29.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list30 = this.rightInteriors;
        return hashCode32 + (list30 != null ? list30.hashCode() : 0);
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

    @Override // com.dena.mirrativ.mirrativapi.closet.ClosetBuyable
    public void setUpdatedAt(Long l10) {
        this.updatedAt = l10;
    }

    public String toString() {
        return "ClosetAvatarBody(id=" + getId() + ", partTitle=" + getPartTitle() + ", isBuyable=" + isBuyable() + ", requiredCoin=" + getRequiredCoin() + ", updatedAt=" + getUpdatedAt() + ", isLimitedTime=" + isLimitedTime() + ", bannerImageUrl=" + getBannerImageUrl() + ", bannerLink=" + getBannerLink() + ", gameEffect=" + getGameEffect() + ", isTrial=" + isTrial() + ", bodyId=" + this.bodyId + ", iconUrl=" + getIconUrl() + ", personas=" + this.personas + ", proportions=" + this.proportions + ", beards=" + this.beards + ", bottoms=" + this.bottoms + ", cheeks=" + this.cheeks + ", eyes=" + this.eyes + ", eyebrows=" + this.eyebrows + ", eyeshadows=" + this.eyeshadows + ", facePaints=" + this.facePaints + ", hairs=" + this.hairs + ", heads=" + this.heads + ", lips=" + this.lips + ", mouths=" + this.mouths + ", noses=" + this.noses + ", shoes=" + this.shoes + ", socks=" + this.socks + ", tops=" + this.tops + ", weapons=" + this.weapons + ", wings=" + this.wings + ", setupClothes=" + this.setupClothes + ", onepieces=" + this.onepieces + ", glasses=" + this.glasses + ", hats=" + this.hats + ", pets=" + this.pets + ", scarfs=" + this.scarfs + ", backWings=" + this.backWings + ", effects=" + this.effects + ", leftInteriors=" + this.leftInteriors + ", centerInteriors=" + this.centerInteriors + ", rightInteriors=" + this.rightInteriors + ')';
    }
}
