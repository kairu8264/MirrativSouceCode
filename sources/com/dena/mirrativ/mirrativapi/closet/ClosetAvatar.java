package com.dena.mirrativ.mirrativapi.closet;

import java.io.Serializable;
import jo.p;
import xm.e;

/* loaded from: classes2.dex */
public final class ClosetAvatar implements Serializable {
    private ClosetAccessoryAsset backWing;
    private ClosetBackground background;
    private ClosetAsset beard;
    private ClosetAvatarGradientColor beardColor;
    private String bodyId;
    private ClosetAccessoryAsset bothWeapon;
    private ClosetAsset bottoms;
    private ClosetAccessoryAsset centerInterior;
    private ClosetAsset cheek;
    private ClosetAvatarGradientColor cheekColor;
    private ClosetAccessoryAsset companionHat;
    private ClosetAccessoryAsset companionScarf;
    private ClosetAccessoryAsset companionTops;
    private ClosetAccessoryAsset companionType;
    private ClosetAccessoryAsset earring;
    private ClosetAccessoryAsset effect;
    private ClosetAsset eye;
    private ClosetAvatarGradientColor eyeColor;
    private ClosetAsset eyebrow;
    private ClosetAvatarGradientColor eyebrowColor;
    private ClosetAsset eyeshadow;
    private ClosetAvatarGradientColor eyeshadowColor;
    private ClosetAsset facePaint;
    private ClosetAccessoryAsset glasses;
    private ClosetAccessoryAsset glassesV2;
    private ClosetAsset hair;
    private ClosetAvatarGradientColor hairColor;
    private ClosetAccessoryAsset hairOrnament;
    private ClosetAccessoryAsset hat;
    private ClosetAccessoryAsset hatV2;
    private ClosetAsset head;
    private ClosetAccessoryAsset headBand;
    private ClosetAccessoryAsset kemomimi;
    private ClosetAccessoryAsset leftInterior;
    private ClosetAccessoryAsset leftWeapon;
    private ClosetAsset lip;
    private ClosetAvatarGradientColor lipColor;
    private ClosetAccessoryAsset machine;
    private ClosetAccessoryAsset mask;
    private ClosetAvatarSimpleValue motion1;
    private ClosetAvatarSimpleValue motion2;
    private ClosetAvatarSimpleValue motion3;
    private ClosetAvatarSimpleValue motion4;
    private ClosetAsset mouth;
    private ClosetAccessoryAsset necklace;
    private ClosetAsset nose;
    private ClosetSetupClotheAsset onepiece;
    private ClosetAvatarSimpleValue persona;
    private ClosetAccessoryAsset pet;
    private ClosetAvatarSimpleValue pose;
    private ClosetAvatarSimpleValue proportion;
    private ClosetAccessoryAsset rightInterior;
    private ClosetAccessoryAsset rightWeapon;
    private ClosetAccessoryAsset scarf;
    private ClosetSetupClotheAsset setupClothes;
    private ClosetAsset shoes;
    private ClosetAvatarSimpleColor skinColor;
    private ClosetAsset socks;
    private ClosetAsset tops;
    private ClosetAccessoryAsset weapon;
    private ClosetAccessoryAsset wing;

    public ClosetAvatar(String str, ClosetAvatarGradientColor closetAvatarGradientColor, ClosetAvatarGradientColor closetAvatarGradientColor2, ClosetAvatarGradientColor closetAvatarGradientColor3, ClosetAvatarGradientColor closetAvatarGradientColor4, ClosetAvatarGradientColor closetAvatarGradientColor5, ClosetAvatarGradientColor closetAvatarGradientColor6, ClosetAvatarGradientColor closetAvatarGradientColor7, ClosetAvatarSimpleColor closetAvatarSimpleColor, ClosetBackground closetBackground, ClosetAvatarSimpleValue closetAvatarSimpleValue, ClosetAvatarSimpleValue closetAvatarSimpleValue2, ClosetAsset closetAsset, ClosetAsset closetAsset2, ClosetAsset closetAsset3, ClosetAsset closetAsset4, ClosetAsset closetAsset5, ClosetAsset closetAsset6, ClosetAsset closetAsset7, ClosetAsset closetAsset8, ClosetAsset closetAsset9, ClosetAsset closetAsset10, ClosetAsset closetAsset11, ClosetAsset closetAsset12, ClosetSetupClotheAsset closetSetupClotheAsset, ClosetSetupClotheAsset closetSetupClotheAsset2, ClosetAsset closetAsset13, ClosetAsset closetAsset14, ClosetAsset closetAsset15, ClosetAccessoryAsset closetAccessoryAsset, ClosetAccessoryAsset closetAccessoryAsset2, ClosetAccessoryAsset closetAccessoryAsset3, ClosetAccessoryAsset closetAccessoryAsset4, ClosetAccessoryAsset closetAccessoryAsset5, ClosetAccessoryAsset closetAccessoryAsset6, ClosetAvatarSimpleValue closetAvatarSimpleValue3, ClosetAvatarSimpleValue closetAvatarSimpleValue4, ClosetAvatarSimpleValue closetAvatarSimpleValue5, ClosetAvatarSimpleValue closetAvatarSimpleValue6, ClosetAccessoryAsset closetAccessoryAsset7, ClosetAccessoryAsset closetAccessoryAsset8, ClosetAccessoryAsset closetAccessoryAsset9, ClosetAccessoryAsset closetAccessoryAsset10, ClosetAvatarSimpleValue closetAvatarSimpleValue7, ClosetAccessoryAsset closetAccessoryAsset11, ClosetAccessoryAsset closetAccessoryAsset12, ClosetAccessoryAsset closetAccessoryAsset13, ClosetAccessoryAsset closetAccessoryAsset14, ClosetAccessoryAsset closetAccessoryAsset15, ClosetAccessoryAsset closetAccessoryAsset16, ClosetAccessoryAsset closetAccessoryAsset17, ClosetAccessoryAsset closetAccessoryAsset18, ClosetAccessoryAsset closetAccessoryAsset19, ClosetAccessoryAsset closetAccessoryAsset20, ClosetAccessoryAsset closetAccessoryAsset21, ClosetAccessoryAsset closetAccessoryAsset22, ClosetAccessoryAsset closetAccessoryAsset23, ClosetAccessoryAsset closetAccessoryAsset24, ClosetAccessoryAsset closetAccessoryAsset25, ClosetAccessoryAsset closetAccessoryAsset26, ClosetAccessoryAsset closetAccessoryAsset27) {
        p.h(str, "bodyId");
        this.bodyId = str;
        this.beardColor = closetAvatarGradientColor;
        this.cheekColor = closetAvatarGradientColor2;
        this.eyeColor = closetAvatarGradientColor3;
        this.eyebrowColor = closetAvatarGradientColor4;
        this.eyeshadowColor = closetAvatarGradientColor5;
        this.hairColor = closetAvatarGradientColor6;
        this.lipColor = closetAvatarGradientColor7;
        this.skinColor = closetAvatarSimpleColor;
        this.background = closetBackground;
        this.persona = closetAvatarSimpleValue;
        this.proportion = closetAvatarSimpleValue2;
        this.beard = closetAsset;
        this.bottoms = closetAsset2;
        this.cheek = closetAsset3;
        this.eye = closetAsset4;
        this.eyebrow = closetAsset5;
        this.eyeshadow = closetAsset6;
        this.facePaint = closetAsset7;
        this.hair = closetAsset8;
        this.head = closetAsset9;
        this.lip = closetAsset10;
        this.mouth = closetAsset11;
        this.nose = closetAsset12;
        this.setupClothes = closetSetupClotheAsset;
        this.onepiece = closetSetupClotheAsset2;
        this.shoes = closetAsset13;
        this.socks = closetAsset14;
        this.tops = closetAsset15;
        this.weapon = closetAccessoryAsset;
        this.wing = closetAccessoryAsset2;
        this.glasses = closetAccessoryAsset3;
        this.hat = closetAccessoryAsset4;
        this.pet = closetAccessoryAsset5;
        this.scarf = closetAccessoryAsset6;
        this.motion1 = closetAvatarSimpleValue3;
        this.motion2 = closetAvatarSimpleValue4;
        this.motion3 = closetAvatarSimpleValue5;
        this.motion4 = closetAvatarSimpleValue6;
        this.companionType = closetAccessoryAsset7;
        this.companionTops = closetAccessoryAsset8;
        this.companionHat = closetAccessoryAsset9;
        this.companionScarf = closetAccessoryAsset10;
        this.pose = closetAvatarSimpleValue7;
        this.backWing = closetAccessoryAsset11;
        this.effect = closetAccessoryAsset12;
        this.leftInterior = closetAccessoryAsset13;
        this.centerInterior = closetAccessoryAsset14;
        this.rightInterior = closetAccessoryAsset15;
        this.machine = closetAccessoryAsset16;
        this.hatV2 = closetAccessoryAsset17;
        this.hairOrnament = closetAccessoryAsset18;
        this.headBand = closetAccessoryAsset19;
        this.glassesV2 = closetAccessoryAsset20;
        this.mask = closetAccessoryAsset21;
        this.earring = closetAccessoryAsset22;
        this.leftWeapon = closetAccessoryAsset23;
        this.rightWeapon = closetAccessoryAsset24;
        this.bothWeapon = closetAccessoryAsset25;
        this.kemomimi = closetAccessoryAsset26;
        this.necklace = closetAccessoryAsset27;
    }

    public final ClosetAvatar clone() {
        Object i10 = new e().i(new e().s(this), ClosetAvatar.class);
        p.g(i10, "Gson().fromJson(json, ClosetAvatar::class.java)");
        return (ClosetAvatar) i10;
    }

    public final String component1() {
        return this.bodyId;
    }

    public final ClosetBackground component10() {
        return this.background;
    }

    public final ClosetAvatarSimpleValue component11() {
        return this.persona;
    }

    public final ClosetAvatarSimpleValue component12() {
        return this.proportion;
    }

    public final ClosetAsset component13() {
        return this.beard;
    }

    public final ClosetAsset component14() {
        return this.bottoms;
    }

    public final ClosetAsset component15() {
        return this.cheek;
    }

    public final ClosetAsset component16() {
        return this.eye;
    }

    public final ClosetAsset component17() {
        return this.eyebrow;
    }

    public final ClosetAsset component18() {
        return this.eyeshadow;
    }

    public final ClosetAsset component19() {
        return this.facePaint;
    }

    public final ClosetAvatarGradientColor component2() {
        return this.beardColor;
    }

    public final ClosetAsset component20() {
        return this.hair;
    }

    public final ClosetAsset component21() {
        return this.head;
    }

    public final ClosetAsset component22() {
        return this.lip;
    }

    public final ClosetAsset component23() {
        return this.mouth;
    }

    public final ClosetAsset component24() {
        return this.nose;
    }

    public final ClosetSetupClotheAsset component25() {
        return this.setupClothes;
    }

    public final ClosetSetupClotheAsset component26() {
        return this.onepiece;
    }

    public final ClosetAsset component27() {
        return this.shoes;
    }

    public final ClosetAsset component28() {
        return this.socks;
    }

    public final ClosetAsset component29() {
        return this.tops;
    }

    public final ClosetAvatarGradientColor component3() {
        return this.cheekColor;
    }

    public final ClosetAccessoryAsset component30() {
        return this.weapon;
    }

    public final ClosetAccessoryAsset component31() {
        return this.wing;
    }

    public final ClosetAccessoryAsset component32() {
        return this.glasses;
    }

    public final ClosetAccessoryAsset component33() {
        return this.hat;
    }

    public final ClosetAccessoryAsset component34() {
        return this.pet;
    }

    public final ClosetAccessoryAsset component35() {
        return this.scarf;
    }

    public final ClosetAvatarSimpleValue component36() {
        return this.motion1;
    }

    public final ClosetAvatarSimpleValue component37() {
        return this.motion2;
    }

    public final ClosetAvatarSimpleValue component38() {
        return this.motion3;
    }

    public final ClosetAvatarSimpleValue component39() {
        return this.motion4;
    }

    public final ClosetAvatarGradientColor component4() {
        return this.eyeColor;
    }

    public final ClosetAccessoryAsset component40() {
        return this.companionType;
    }

    public final ClosetAccessoryAsset component41() {
        return this.companionTops;
    }

    public final ClosetAccessoryAsset component42() {
        return this.companionHat;
    }

    public final ClosetAccessoryAsset component43() {
        return this.companionScarf;
    }

    public final ClosetAvatarSimpleValue component44() {
        return this.pose;
    }

    public final ClosetAccessoryAsset component45() {
        return this.backWing;
    }

    public final ClosetAccessoryAsset component46() {
        return this.effect;
    }

    public final ClosetAccessoryAsset component47() {
        return this.leftInterior;
    }

    public final ClosetAccessoryAsset component48() {
        return this.centerInterior;
    }

    public final ClosetAccessoryAsset component49() {
        return this.rightInterior;
    }

    public final ClosetAvatarGradientColor component5() {
        return this.eyebrowColor;
    }

    public final ClosetAccessoryAsset component50() {
        return this.machine;
    }

    public final ClosetAccessoryAsset component51() {
        return this.hatV2;
    }

    public final ClosetAccessoryAsset component52() {
        return this.hairOrnament;
    }

    public final ClosetAccessoryAsset component53() {
        return this.headBand;
    }

    public final ClosetAccessoryAsset component54() {
        return this.glassesV2;
    }

    public final ClosetAccessoryAsset component55() {
        return this.mask;
    }

    public final ClosetAccessoryAsset component56() {
        return this.earring;
    }

    public final ClosetAccessoryAsset component57() {
        return this.leftWeapon;
    }

    public final ClosetAccessoryAsset component58() {
        return this.rightWeapon;
    }

    public final ClosetAccessoryAsset component59() {
        return this.bothWeapon;
    }

    public final ClosetAvatarGradientColor component6() {
        return this.eyeshadowColor;
    }

    public final ClosetAccessoryAsset component60() {
        return this.kemomimi;
    }

    public final ClosetAccessoryAsset component61() {
        return this.necklace;
    }

    public final ClosetAvatarGradientColor component7() {
        return this.hairColor;
    }

    public final ClosetAvatarGradientColor component8() {
        return this.lipColor;
    }

    public final ClosetAvatarSimpleColor component9() {
        return this.skinColor;
    }

    public final ClosetAvatar copy(String str, ClosetAvatarGradientColor closetAvatarGradientColor, ClosetAvatarGradientColor closetAvatarGradientColor2, ClosetAvatarGradientColor closetAvatarGradientColor3, ClosetAvatarGradientColor closetAvatarGradientColor4, ClosetAvatarGradientColor closetAvatarGradientColor5, ClosetAvatarGradientColor closetAvatarGradientColor6, ClosetAvatarGradientColor closetAvatarGradientColor7, ClosetAvatarSimpleColor closetAvatarSimpleColor, ClosetBackground closetBackground, ClosetAvatarSimpleValue closetAvatarSimpleValue, ClosetAvatarSimpleValue closetAvatarSimpleValue2, ClosetAsset closetAsset, ClosetAsset closetAsset2, ClosetAsset closetAsset3, ClosetAsset closetAsset4, ClosetAsset closetAsset5, ClosetAsset closetAsset6, ClosetAsset closetAsset7, ClosetAsset closetAsset8, ClosetAsset closetAsset9, ClosetAsset closetAsset10, ClosetAsset closetAsset11, ClosetAsset closetAsset12, ClosetSetupClotheAsset closetSetupClotheAsset, ClosetSetupClotheAsset closetSetupClotheAsset2, ClosetAsset closetAsset13, ClosetAsset closetAsset14, ClosetAsset closetAsset15, ClosetAccessoryAsset closetAccessoryAsset, ClosetAccessoryAsset closetAccessoryAsset2, ClosetAccessoryAsset closetAccessoryAsset3, ClosetAccessoryAsset closetAccessoryAsset4, ClosetAccessoryAsset closetAccessoryAsset5, ClosetAccessoryAsset closetAccessoryAsset6, ClosetAvatarSimpleValue closetAvatarSimpleValue3, ClosetAvatarSimpleValue closetAvatarSimpleValue4, ClosetAvatarSimpleValue closetAvatarSimpleValue5, ClosetAvatarSimpleValue closetAvatarSimpleValue6, ClosetAccessoryAsset closetAccessoryAsset7, ClosetAccessoryAsset closetAccessoryAsset8, ClosetAccessoryAsset closetAccessoryAsset9, ClosetAccessoryAsset closetAccessoryAsset10, ClosetAvatarSimpleValue closetAvatarSimpleValue7, ClosetAccessoryAsset closetAccessoryAsset11, ClosetAccessoryAsset closetAccessoryAsset12, ClosetAccessoryAsset closetAccessoryAsset13, ClosetAccessoryAsset closetAccessoryAsset14, ClosetAccessoryAsset closetAccessoryAsset15, ClosetAccessoryAsset closetAccessoryAsset16, ClosetAccessoryAsset closetAccessoryAsset17, ClosetAccessoryAsset closetAccessoryAsset18, ClosetAccessoryAsset closetAccessoryAsset19, ClosetAccessoryAsset closetAccessoryAsset20, ClosetAccessoryAsset closetAccessoryAsset21, ClosetAccessoryAsset closetAccessoryAsset22, ClosetAccessoryAsset closetAccessoryAsset23, ClosetAccessoryAsset closetAccessoryAsset24, ClosetAccessoryAsset closetAccessoryAsset25, ClosetAccessoryAsset closetAccessoryAsset26, ClosetAccessoryAsset closetAccessoryAsset27) {
        p.h(str, "bodyId");
        return new ClosetAvatar(str, closetAvatarGradientColor, closetAvatarGradientColor2, closetAvatarGradientColor3, closetAvatarGradientColor4, closetAvatarGradientColor5, closetAvatarGradientColor6, closetAvatarGradientColor7, closetAvatarSimpleColor, closetBackground, closetAvatarSimpleValue, closetAvatarSimpleValue2, closetAsset, closetAsset2, closetAsset3, closetAsset4, closetAsset5, closetAsset6, closetAsset7, closetAsset8, closetAsset9, closetAsset10, closetAsset11, closetAsset12, closetSetupClotheAsset, closetSetupClotheAsset2, closetAsset13, closetAsset14, closetAsset15, closetAccessoryAsset, closetAccessoryAsset2, closetAccessoryAsset3, closetAccessoryAsset4, closetAccessoryAsset5, closetAccessoryAsset6, closetAvatarSimpleValue3, closetAvatarSimpleValue4, closetAvatarSimpleValue5, closetAvatarSimpleValue6, closetAccessoryAsset7, closetAccessoryAsset8, closetAccessoryAsset9, closetAccessoryAsset10, closetAvatarSimpleValue7, closetAccessoryAsset11, closetAccessoryAsset12, closetAccessoryAsset13, closetAccessoryAsset14, closetAccessoryAsset15, closetAccessoryAsset16, closetAccessoryAsset17, closetAccessoryAsset18, closetAccessoryAsset19, closetAccessoryAsset20, closetAccessoryAsset21, closetAccessoryAsset22, closetAccessoryAsset23, closetAccessoryAsset24, closetAccessoryAsset25, closetAccessoryAsset26, closetAccessoryAsset27);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetAvatar) {
            ClosetAvatar closetAvatar = (ClosetAvatar) obj;
            return p.c(this.bodyId, closetAvatar.bodyId) && p.c(this.beardColor, closetAvatar.beardColor) && p.c(this.cheekColor, closetAvatar.cheekColor) && p.c(this.eyeColor, closetAvatar.eyeColor) && p.c(this.eyebrowColor, closetAvatar.eyebrowColor) && p.c(this.eyeshadowColor, closetAvatar.eyeshadowColor) && p.c(this.hairColor, closetAvatar.hairColor) && p.c(this.lipColor, closetAvatar.lipColor) && p.c(this.skinColor, closetAvatar.skinColor) && p.c(this.background, closetAvatar.background) && p.c(this.persona, closetAvatar.persona) && p.c(this.proportion, closetAvatar.proportion) && p.c(this.beard, closetAvatar.beard) && p.c(this.bottoms, closetAvatar.bottoms) && p.c(this.cheek, closetAvatar.cheek) && p.c(this.eye, closetAvatar.eye) && p.c(this.eyebrow, closetAvatar.eyebrow) && p.c(this.eyeshadow, closetAvatar.eyeshadow) && p.c(this.facePaint, closetAvatar.facePaint) && p.c(this.hair, closetAvatar.hair) && p.c(this.head, closetAvatar.head) && p.c(this.lip, closetAvatar.lip) && p.c(this.mouth, closetAvatar.mouth) && p.c(this.nose, closetAvatar.nose) && p.c(this.setupClothes, closetAvatar.setupClothes) && p.c(this.onepiece, closetAvatar.onepiece) && p.c(this.shoes, closetAvatar.shoes) && p.c(this.socks, closetAvatar.socks) && p.c(this.tops, closetAvatar.tops) && p.c(this.weapon, closetAvatar.weapon) && p.c(this.wing, closetAvatar.wing) && p.c(this.glasses, closetAvatar.glasses) && p.c(this.hat, closetAvatar.hat) && p.c(this.pet, closetAvatar.pet) && p.c(this.scarf, closetAvatar.scarf) && p.c(this.motion1, closetAvatar.motion1) && p.c(this.motion2, closetAvatar.motion2) && p.c(this.motion3, closetAvatar.motion3) && p.c(this.motion4, closetAvatar.motion4) && p.c(this.companionType, closetAvatar.companionType) && p.c(this.companionTops, closetAvatar.companionTops) && p.c(this.companionHat, closetAvatar.companionHat) && p.c(this.companionScarf, closetAvatar.companionScarf) && p.c(this.pose, closetAvatar.pose) && p.c(this.backWing, closetAvatar.backWing) && p.c(this.effect, closetAvatar.effect) && p.c(this.leftInterior, closetAvatar.leftInterior) && p.c(this.centerInterior, closetAvatar.centerInterior) && p.c(this.rightInterior, closetAvatar.rightInterior) && p.c(this.machine, closetAvatar.machine) && p.c(this.hatV2, closetAvatar.hatV2) && p.c(this.hairOrnament, closetAvatar.hairOrnament) && p.c(this.headBand, closetAvatar.headBand) && p.c(this.glassesV2, closetAvatar.glassesV2) && p.c(this.mask, closetAvatar.mask) && p.c(this.earring, closetAvatar.earring) && p.c(this.leftWeapon, closetAvatar.leftWeapon) && p.c(this.rightWeapon, closetAvatar.rightWeapon) && p.c(this.bothWeapon, closetAvatar.bothWeapon) && p.c(this.kemomimi, closetAvatar.kemomimi) && p.c(this.necklace, closetAvatar.necklace);
        }
        return false;
    }

    public final ClosetAccessoryAsset getBackWing() {
        return this.backWing;
    }

    public final ClosetBackground getBackground() {
        return this.background;
    }

    public final ClosetAsset getBeard() {
        return this.beard;
    }

    public final ClosetAvatarGradientColor getBeardColor() {
        return this.beardColor;
    }

    public final String getBodyId() {
        return this.bodyId;
    }

    public final ClosetAccessoryAsset getBothWeapon() {
        return this.bothWeapon;
    }

    public final ClosetAsset getBottoms() {
        return this.bottoms;
    }

    public final ClosetAccessoryAsset getCenterInterior() {
        return this.centerInterior;
    }

    public final ClosetAsset getCheek() {
        return this.cheek;
    }

    public final ClosetAvatarGradientColor getCheekColor() {
        return this.cheekColor;
    }

    public final ClosetAccessoryAsset getCompanionHat() {
        return this.companionHat;
    }

    public final ClosetAccessoryAsset getCompanionScarf() {
        return this.companionScarf;
    }

    public final ClosetAccessoryAsset getCompanionTops() {
        return this.companionTops;
    }

    public final ClosetAccessoryAsset getCompanionType() {
        return this.companionType;
    }

    public final ClosetAccessoryAsset getEarring() {
        return this.earring;
    }

    public final ClosetAccessoryAsset getEffect() {
        return this.effect;
    }

    public final ClosetAsset getEye() {
        return this.eye;
    }

    public final ClosetAvatarGradientColor getEyeColor() {
        return this.eyeColor;
    }

    public final ClosetAsset getEyebrow() {
        return this.eyebrow;
    }

    public final ClosetAvatarGradientColor getEyebrowColor() {
        return this.eyebrowColor;
    }

    public final ClosetAsset getEyeshadow() {
        return this.eyeshadow;
    }

    public final ClosetAvatarGradientColor getEyeshadowColor() {
        return this.eyeshadowColor;
    }

    public final ClosetAsset getFacePaint() {
        return this.facePaint;
    }

    public final ClosetAccessoryAsset getGlasses() {
        return this.glasses;
    }

    public final ClosetAccessoryAsset getGlassesV2() {
        return this.glassesV2;
    }

    public final ClosetAsset getHair() {
        return this.hair;
    }

    public final ClosetAvatarGradientColor getHairColor() {
        return this.hairColor;
    }

    public final ClosetAccessoryAsset getHairOrnament() {
        return this.hairOrnament;
    }

    public final ClosetAccessoryAsset getHat() {
        return this.hat;
    }

    public final ClosetAccessoryAsset getHatV2() {
        return this.hatV2;
    }

    public final ClosetAsset getHead() {
        return this.head;
    }

    public final ClosetAccessoryAsset getHeadBand() {
        return this.headBand;
    }

    public final ClosetAccessoryAsset getKemomimi() {
        return this.kemomimi;
    }

    public final ClosetAccessoryAsset getLeftInterior() {
        return this.leftInterior;
    }

    public final ClosetAccessoryAsset getLeftWeapon() {
        return this.leftWeapon;
    }

    public final ClosetAsset getLip() {
        return this.lip;
    }

    public final ClosetAvatarGradientColor getLipColor() {
        return this.lipColor;
    }

    public final ClosetAccessoryAsset getMachine() {
        return this.machine;
    }

    public final ClosetAccessoryAsset getMask() {
        return this.mask;
    }

    public final ClosetAvatarSimpleValue getMotion1() {
        return this.motion1;
    }

    public final ClosetAvatarSimpleValue getMotion2() {
        return this.motion2;
    }

    public final ClosetAvatarSimpleValue getMotion3() {
        return this.motion3;
    }

    public final ClosetAvatarSimpleValue getMotion4() {
        return this.motion4;
    }

    public final ClosetAsset getMouth() {
        return this.mouth;
    }

    public final ClosetAccessoryAsset getNecklace() {
        return this.necklace;
    }

    public final ClosetAsset getNose() {
        return this.nose;
    }

    public final ClosetSetupClotheAsset getOnepiece() {
        return this.onepiece;
    }

    public final ClosetAvatarSimpleValue getPersona() {
        return this.persona;
    }

    public final ClosetAccessoryAsset getPet() {
        return this.pet;
    }

    public final ClosetAvatarSimpleValue getPose() {
        return this.pose;
    }

    public final ClosetAvatarSimpleValue getProportion() {
        return this.proportion;
    }

    public final ClosetAccessoryAsset getRightInterior() {
        return this.rightInterior;
    }

    public final ClosetAccessoryAsset getRightWeapon() {
        return this.rightWeapon;
    }

    public final ClosetAccessoryAsset getScarf() {
        return this.scarf;
    }

    public final ClosetSetupClotheAsset getSetupClothes() {
        return this.setupClothes;
    }

    public final ClosetAsset getShoes() {
        return this.shoes;
    }

    public final ClosetAvatarSimpleColor getSkinColor() {
        return this.skinColor;
    }

    public final ClosetAsset getSocks() {
        return this.socks;
    }

    public final ClosetAsset getTops() {
        return this.tops;
    }

    public final ClosetAccessoryAsset getWeapon() {
        return this.weapon;
    }

    public final ClosetAccessoryAsset getWing() {
        return this.wing;
    }

    public int hashCode() {
        int hashCode = this.bodyId.hashCode() * 31;
        ClosetAvatarGradientColor closetAvatarGradientColor = this.beardColor;
        int hashCode2 = (hashCode + (closetAvatarGradientColor == null ? 0 : closetAvatarGradientColor.hashCode())) * 31;
        ClosetAvatarGradientColor closetAvatarGradientColor2 = this.cheekColor;
        int hashCode3 = (hashCode2 + (closetAvatarGradientColor2 == null ? 0 : closetAvatarGradientColor2.hashCode())) * 31;
        ClosetAvatarGradientColor closetAvatarGradientColor3 = this.eyeColor;
        int hashCode4 = (hashCode3 + (closetAvatarGradientColor3 == null ? 0 : closetAvatarGradientColor3.hashCode())) * 31;
        ClosetAvatarGradientColor closetAvatarGradientColor4 = this.eyebrowColor;
        int hashCode5 = (hashCode4 + (closetAvatarGradientColor4 == null ? 0 : closetAvatarGradientColor4.hashCode())) * 31;
        ClosetAvatarGradientColor closetAvatarGradientColor5 = this.eyeshadowColor;
        int hashCode6 = (hashCode5 + (closetAvatarGradientColor5 == null ? 0 : closetAvatarGradientColor5.hashCode())) * 31;
        ClosetAvatarGradientColor closetAvatarGradientColor6 = this.hairColor;
        int hashCode7 = (hashCode6 + (closetAvatarGradientColor6 == null ? 0 : closetAvatarGradientColor6.hashCode())) * 31;
        ClosetAvatarGradientColor closetAvatarGradientColor7 = this.lipColor;
        int hashCode8 = (hashCode7 + (closetAvatarGradientColor7 == null ? 0 : closetAvatarGradientColor7.hashCode())) * 31;
        ClosetAvatarSimpleColor closetAvatarSimpleColor = this.skinColor;
        int hashCode9 = (hashCode8 + (closetAvatarSimpleColor == null ? 0 : closetAvatarSimpleColor.hashCode())) * 31;
        ClosetBackground closetBackground = this.background;
        int hashCode10 = (hashCode9 + (closetBackground == null ? 0 : closetBackground.hashCode())) * 31;
        ClosetAvatarSimpleValue closetAvatarSimpleValue = this.persona;
        int hashCode11 = (hashCode10 + (closetAvatarSimpleValue == null ? 0 : closetAvatarSimpleValue.hashCode())) * 31;
        ClosetAvatarSimpleValue closetAvatarSimpleValue2 = this.proportion;
        int hashCode12 = (hashCode11 + (closetAvatarSimpleValue2 == null ? 0 : closetAvatarSimpleValue2.hashCode())) * 31;
        ClosetAsset closetAsset = this.beard;
        int hashCode13 = (hashCode12 + (closetAsset == null ? 0 : closetAsset.hashCode())) * 31;
        ClosetAsset closetAsset2 = this.bottoms;
        int hashCode14 = (hashCode13 + (closetAsset2 == null ? 0 : closetAsset2.hashCode())) * 31;
        ClosetAsset closetAsset3 = this.cheek;
        int hashCode15 = (hashCode14 + (closetAsset3 == null ? 0 : closetAsset3.hashCode())) * 31;
        ClosetAsset closetAsset4 = this.eye;
        int hashCode16 = (hashCode15 + (closetAsset4 == null ? 0 : closetAsset4.hashCode())) * 31;
        ClosetAsset closetAsset5 = this.eyebrow;
        int hashCode17 = (hashCode16 + (closetAsset5 == null ? 0 : closetAsset5.hashCode())) * 31;
        ClosetAsset closetAsset6 = this.eyeshadow;
        int hashCode18 = (hashCode17 + (closetAsset6 == null ? 0 : closetAsset6.hashCode())) * 31;
        ClosetAsset closetAsset7 = this.facePaint;
        int hashCode19 = (hashCode18 + (closetAsset7 == null ? 0 : closetAsset7.hashCode())) * 31;
        ClosetAsset closetAsset8 = this.hair;
        int hashCode20 = (hashCode19 + (closetAsset8 == null ? 0 : closetAsset8.hashCode())) * 31;
        ClosetAsset closetAsset9 = this.head;
        int hashCode21 = (hashCode20 + (closetAsset9 == null ? 0 : closetAsset9.hashCode())) * 31;
        ClosetAsset closetAsset10 = this.lip;
        int hashCode22 = (hashCode21 + (closetAsset10 == null ? 0 : closetAsset10.hashCode())) * 31;
        ClosetAsset closetAsset11 = this.mouth;
        int hashCode23 = (hashCode22 + (closetAsset11 == null ? 0 : closetAsset11.hashCode())) * 31;
        ClosetAsset closetAsset12 = this.nose;
        int hashCode24 = (hashCode23 + (closetAsset12 == null ? 0 : closetAsset12.hashCode())) * 31;
        ClosetSetupClotheAsset closetSetupClotheAsset = this.setupClothes;
        int hashCode25 = (hashCode24 + (closetSetupClotheAsset == null ? 0 : closetSetupClotheAsset.hashCode())) * 31;
        ClosetSetupClotheAsset closetSetupClotheAsset2 = this.onepiece;
        int hashCode26 = (hashCode25 + (closetSetupClotheAsset2 == null ? 0 : closetSetupClotheAsset2.hashCode())) * 31;
        ClosetAsset closetAsset13 = this.shoes;
        int hashCode27 = (hashCode26 + (closetAsset13 == null ? 0 : closetAsset13.hashCode())) * 31;
        ClosetAsset closetAsset14 = this.socks;
        int hashCode28 = (hashCode27 + (closetAsset14 == null ? 0 : closetAsset14.hashCode())) * 31;
        ClosetAsset closetAsset15 = this.tops;
        int hashCode29 = (hashCode28 + (closetAsset15 == null ? 0 : closetAsset15.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset = this.weapon;
        int hashCode30 = (hashCode29 + (closetAccessoryAsset == null ? 0 : closetAccessoryAsset.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset2 = this.wing;
        int hashCode31 = (hashCode30 + (closetAccessoryAsset2 == null ? 0 : closetAccessoryAsset2.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset3 = this.glasses;
        int hashCode32 = (hashCode31 + (closetAccessoryAsset3 == null ? 0 : closetAccessoryAsset3.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset4 = this.hat;
        int hashCode33 = (hashCode32 + (closetAccessoryAsset4 == null ? 0 : closetAccessoryAsset4.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset5 = this.pet;
        int hashCode34 = (hashCode33 + (closetAccessoryAsset5 == null ? 0 : closetAccessoryAsset5.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset6 = this.scarf;
        int hashCode35 = (hashCode34 + (closetAccessoryAsset6 == null ? 0 : closetAccessoryAsset6.hashCode())) * 31;
        ClosetAvatarSimpleValue closetAvatarSimpleValue3 = this.motion1;
        int hashCode36 = (hashCode35 + (closetAvatarSimpleValue3 == null ? 0 : closetAvatarSimpleValue3.hashCode())) * 31;
        ClosetAvatarSimpleValue closetAvatarSimpleValue4 = this.motion2;
        int hashCode37 = (hashCode36 + (closetAvatarSimpleValue4 == null ? 0 : closetAvatarSimpleValue4.hashCode())) * 31;
        ClosetAvatarSimpleValue closetAvatarSimpleValue5 = this.motion3;
        int hashCode38 = (hashCode37 + (closetAvatarSimpleValue5 == null ? 0 : closetAvatarSimpleValue5.hashCode())) * 31;
        ClosetAvatarSimpleValue closetAvatarSimpleValue6 = this.motion4;
        int hashCode39 = (hashCode38 + (closetAvatarSimpleValue6 == null ? 0 : closetAvatarSimpleValue6.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset7 = this.companionType;
        int hashCode40 = (hashCode39 + (closetAccessoryAsset7 == null ? 0 : closetAccessoryAsset7.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset8 = this.companionTops;
        int hashCode41 = (hashCode40 + (closetAccessoryAsset8 == null ? 0 : closetAccessoryAsset8.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset9 = this.companionHat;
        int hashCode42 = (hashCode41 + (closetAccessoryAsset9 == null ? 0 : closetAccessoryAsset9.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset10 = this.companionScarf;
        int hashCode43 = (hashCode42 + (closetAccessoryAsset10 == null ? 0 : closetAccessoryAsset10.hashCode())) * 31;
        ClosetAvatarSimpleValue closetAvatarSimpleValue7 = this.pose;
        int hashCode44 = (hashCode43 + (closetAvatarSimpleValue7 == null ? 0 : closetAvatarSimpleValue7.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset11 = this.backWing;
        int hashCode45 = (hashCode44 + (closetAccessoryAsset11 == null ? 0 : closetAccessoryAsset11.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset12 = this.effect;
        int hashCode46 = (hashCode45 + (closetAccessoryAsset12 == null ? 0 : closetAccessoryAsset12.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset13 = this.leftInterior;
        int hashCode47 = (hashCode46 + (closetAccessoryAsset13 == null ? 0 : closetAccessoryAsset13.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset14 = this.centerInterior;
        int hashCode48 = (hashCode47 + (closetAccessoryAsset14 == null ? 0 : closetAccessoryAsset14.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset15 = this.rightInterior;
        int hashCode49 = (hashCode48 + (closetAccessoryAsset15 == null ? 0 : closetAccessoryAsset15.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset16 = this.machine;
        int hashCode50 = (hashCode49 + (closetAccessoryAsset16 == null ? 0 : closetAccessoryAsset16.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset17 = this.hatV2;
        int hashCode51 = (hashCode50 + (closetAccessoryAsset17 == null ? 0 : closetAccessoryAsset17.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset18 = this.hairOrnament;
        int hashCode52 = (hashCode51 + (closetAccessoryAsset18 == null ? 0 : closetAccessoryAsset18.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset19 = this.headBand;
        int hashCode53 = (hashCode52 + (closetAccessoryAsset19 == null ? 0 : closetAccessoryAsset19.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset20 = this.glassesV2;
        int hashCode54 = (hashCode53 + (closetAccessoryAsset20 == null ? 0 : closetAccessoryAsset20.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset21 = this.mask;
        int hashCode55 = (hashCode54 + (closetAccessoryAsset21 == null ? 0 : closetAccessoryAsset21.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset22 = this.earring;
        int hashCode56 = (hashCode55 + (closetAccessoryAsset22 == null ? 0 : closetAccessoryAsset22.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset23 = this.leftWeapon;
        int hashCode57 = (hashCode56 + (closetAccessoryAsset23 == null ? 0 : closetAccessoryAsset23.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset24 = this.rightWeapon;
        int hashCode58 = (hashCode57 + (closetAccessoryAsset24 == null ? 0 : closetAccessoryAsset24.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset25 = this.bothWeapon;
        int hashCode59 = (hashCode58 + (closetAccessoryAsset25 == null ? 0 : closetAccessoryAsset25.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset26 = this.kemomimi;
        int hashCode60 = (hashCode59 + (closetAccessoryAsset26 == null ? 0 : closetAccessoryAsset26.hashCode())) * 31;
        ClosetAccessoryAsset closetAccessoryAsset27 = this.necklace;
        return hashCode60 + (closetAccessoryAsset27 != null ? closetAccessoryAsset27.hashCode() : 0);
    }

    public final void setBackWing(ClosetAccessoryAsset closetAccessoryAsset) {
        this.backWing = closetAccessoryAsset;
    }

    public final void setBackground(ClosetBackground closetBackground) {
        this.background = closetBackground;
    }

    public final void setBeard(ClosetAsset closetAsset) {
        this.beard = closetAsset;
    }

    public final void setBeardColor(ClosetAvatarGradientColor closetAvatarGradientColor) {
        this.beardColor = closetAvatarGradientColor;
    }

    public final void setBodyId(String str) {
        p.h(str, "<set-?>");
        this.bodyId = str;
    }

    public final void setBothWeapon(ClosetAccessoryAsset closetAccessoryAsset) {
        this.bothWeapon = closetAccessoryAsset;
    }

    public final void setBottoms(ClosetAsset closetAsset) {
        this.bottoms = closetAsset;
    }

    public final void setCenterInterior(ClosetAccessoryAsset closetAccessoryAsset) {
        this.centerInterior = closetAccessoryAsset;
    }

    public final void setCheek(ClosetAsset closetAsset) {
        this.cheek = closetAsset;
    }

    public final void setCheekColor(ClosetAvatarGradientColor closetAvatarGradientColor) {
        this.cheekColor = closetAvatarGradientColor;
    }

    public final void setCompanionHat(ClosetAccessoryAsset closetAccessoryAsset) {
        this.companionHat = closetAccessoryAsset;
    }

    public final void setCompanionScarf(ClosetAccessoryAsset closetAccessoryAsset) {
        this.companionScarf = closetAccessoryAsset;
    }

    public final void setCompanionTops(ClosetAccessoryAsset closetAccessoryAsset) {
        this.companionTops = closetAccessoryAsset;
    }

    public final void setCompanionType(ClosetAccessoryAsset closetAccessoryAsset) {
        this.companionType = closetAccessoryAsset;
    }

    public final void setEarring(ClosetAccessoryAsset closetAccessoryAsset) {
        this.earring = closetAccessoryAsset;
    }

    public final void setEffect(ClosetAccessoryAsset closetAccessoryAsset) {
        this.effect = closetAccessoryAsset;
    }

    public final void setEye(ClosetAsset closetAsset) {
        this.eye = closetAsset;
    }

    public final void setEyeColor(ClosetAvatarGradientColor closetAvatarGradientColor) {
        this.eyeColor = closetAvatarGradientColor;
    }

    public final void setEyebrow(ClosetAsset closetAsset) {
        this.eyebrow = closetAsset;
    }

    public final void setEyebrowColor(ClosetAvatarGradientColor closetAvatarGradientColor) {
        this.eyebrowColor = closetAvatarGradientColor;
    }

    public final void setEyeshadow(ClosetAsset closetAsset) {
        this.eyeshadow = closetAsset;
    }

    public final void setEyeshadowColor(ClosetAvatarGradientColor closetAvatarGradientColor) {
        this.eyeshadowColor = closetAvatarGradientColor;
    }

    public final void setFacePaint(ClosetAsset closetAsset) {
        this.facePaint = closetAsset;
    }

    public final void setGlasses(ClosetAccessoryAsset closetAccessoryAsset) {
        this.glasses = closetAccessoryAsset;
    }

    public final void setGlassesV2(ClosetAccessoryAsset closetAccessoryAsset) {
        this.glassesV2 = closetAccessoryAsset;
    }

    public final void setHair(ClosetAsset closetAsset) {
        this.hair = closetAsset;
    }

    public final void setHairColor(ClosetAvatarGradientColor closetAvatarGradientColor) {
        this.hairColor = closetAvatarGradientColor;
    }

    public final void setHairOrnament(ClosetAccessoryAsset closetAccessoryAsset) {
        this.hairOrnament = closetAccessoryAsset;
    }

    public final void setHat(ClosetAccessoryAsset closetAccessoryAsset) {
        this.hat = closetAccessoryAsset;
    }

    public final void setHatV2(ClosetAccessoryAsset closetAccessoryAsset) {
        this.hatV2 = closetAccessoryAsset;
    }

    public final void setHead(ClosetAsset closetAsset) {
        this.head = closetAsset;
    }

    public final void setHeadBand(ClosetAccessoryAsset closetAccessoryAsset) {
        this.headBand = closetAccessoryAsset;
    }

    public final void setKemomimi(ClosetAccessoryAsset closetAccessoryAsset) {
        this.kemomimi = closetAccessoryAsset;
    }

    public final void setLeftInterior(ClosetAccessoryAsset closetAccessoryAsset) {
        this.leftInterior = closetAccessoryAsset;
    }

    public final void setLeftWeapon(ClosetAccessoryAsset closetAccessoryAsset) {
        this.leftWeapon = closetAccessoryAsset;
    }

    public final void setLip(ClosetAsset closetAsset) {
        this.lip = closetAsset;
    }

    public final void setLipColor(ClosetAvatarGradientColor closetAvatarGradientColor) {
        this.lipColor = closetAvatarGradientColor;
    }

    public final void setMachine(ClosetAccessoryAsset closetAccessoryAsset) {
        this.machine = closetAccessoryAsset;
    }

    public final void setMask(ClosetAccessoryAsset closetAccessoryAsset) {
        this.mask = closetAccessoryAsset;
    }

    public final void setMotion1(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        this.motion1 = closetAvatarSimpleValue;
    }

    public final void setMotion2(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        this.motion2 = closetAvatarSimpleValue;
    }

    public final void setMotion3(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        this.motion3 = closetAvatarSimpleValue;
    }

    public final void setMotion4(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        this.motion4 = closetAvatarSimpleValue;
    }

    public final void setMouth(ClosetAsset closetAsset) {
        this.mouth = closetAsset;
    }

    public final void setNecklace(ClosetAccessoryAsset closetAccessoryAsset) {
        this.necklace = closetAccessoryAsset;
    }

    public final void setNose(ClosetAsset closetAsset) {
        this.nose = closetAsset;
    }

    public final void setOnepiece(ClosetSetupClotheAsset closetSetupClotheAsset) {
        this.onepiece = closetSetupClotheAsset;
    }

    public final void setPersona(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        this.persona = closetAvatarSimpleValue;
    }

    public final void setPet(ClosetAccessoryAsset closetAccessoryAsset) {
        this.pet = closetAccessoryAsset;
    }

    public final void setPose(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        this.pose = closetAvatarSimpleValue;
    }

    public final void setProportion(ClosetAvatarSimpleValue closetAvatarSimpleValue) {
        this.proportion = closetAvatarSimpleValue;
    }

    public final void setRightInterior(ClosetAccessoryAsset closetAccessoryAsset) {
        this.rightInterior = closetAccessoryAsset;
    }

    public final void setRightWeapon(ClosetAccessoryAsset closetAccessoryAsset) {
        this.rightWeapon = closetAccessoryAsset;
    }

    public final void setScarf(ClosetAccessoryAsset closetAccessoryAsset) {
        this.scarf = closetAccessoryAsset;
    }

    public final void setSetupClothes(ClosetSetupClotheAsset closetSetupClotheAsset) {
        this.setupClothes = closetSetupClotheAsset;
    }

    public final void setShoes(ClosetAsset closetAsset) {
        this.shoes = closetAsset;
    }

    public final void setSkinColor(ClosetAvatarSimpleColor closetAvatarSimpleColor) {
        this.skinColor = closetAvatarSimpleColor;
    }

    public final void setSocks(ClosetAsset closetAsset) {
        this.socks = closetAsset;
    }

    public final void setTops(ClosetAsset closetAsset) {
        this.tops = closetAsset;
    }

    public final void setWeapon(ClosetAccessoryAsset closetAccessoryAsset) {
        this.weapon = closetAccessoryAsset;
    }

    public final void setWing(ClosetAccessoryAsset closetAccessoryAsset) {
        this.wing = closetAccessoryAsset;
    }

    public String toString() {
        return "ClosetAvatar(bodyId=" + this.bodyId + ", beardColor=" + this.beardColor + ", cheekColor=" + this.cheekColor + ", eyeColor=" + this.eyeColor + ", eyebrowColor=" + this.eyebrowColor + ", eyeshadowColor=" + this.eyeshadowColor + ", hairColor=" + this.hairColor + ", lipColor=" + this.lipColor + ", skinColor=" + this.skinColor + ", background=" + this.background + ", persona=" + this.persona + ", proportion=" + this.proportion + ", beard=" + this.beard + ", bottoms=" + this.bottoms + ", cheek=" + this.cheek + ", eye=" + this.eye + ", eyebrow=" + this.eyebrow + ", eyeshadow=" + this.eyeshadow + ", facePaint=" + this.facePaint + ", hair=" + this.hair + ", head=" + this.head + ", lip=" + this.lip + ", mouth=" + this.mouth + ", nose=" + this.nose + ", setupClothes=" + this.setupClothes + ", onepiece=" + this.onepiece + ", shoes=" + this.shoes + ", socks=" + this.socks + ", tops=" + this.tops + ", weapon=" + this.weapon + ", wing=" + this.wing + ", glasses=" + this.glasses + ", hat=" + this.hat + ", pet=" + this.pet + ", scarf=" + this.scarf + ", motion1=" + this.motion1 + ", motion2=" + this.motion2 + ", motion3=" + this.motion3 + ", motion4=" + this.motion4 + ", companionType=" + this.companionType + ", companionTops=" + this.companionTops + ", companionHat=" + this.companionHat + ", companionScarf=" + this.companionScarf + ", pose=" + this.pose + ", backWing=" + this.backWing + ", effect=" + this.effect + ", leftInterior=" + this.leftInterior + ", centerInterior=" + this.centerInterior + ", rightInterior=" + this.rightInterior + ", machine=" + this.machine + ", hatV2=" + this.hatV2 + ", hairOrnament=" + this.hairOrnament + ", headBand=" + this.headBand + ", glassesV2=" + this.glassesV2 + ", mask=" + this.mask + ", earring=" + this.earring + ", leftWeapon=" + this.leftWeapon + ", rightWeapon=" + this.rightWeapon + ", bothWeapon=" + this.bothWeapon + ", kemomimi=" + this.kemomimi + ", necklace=" + this.necklace + ')';
    }
}
