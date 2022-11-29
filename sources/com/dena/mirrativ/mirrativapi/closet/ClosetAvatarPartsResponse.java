package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ClosetAvatarPartsResponse implements Serializable {
    private final List<ClosetBuyableBackground> backgrounds;
    private final List<ClosetAvatarGradientColor> beardColors;
    private final List<ClosetAvatarBody> bodies;
    private final List<ClosetBuyableAccessoryAsset> bothWeapons;
    private final List<ClosetAvatarGradientColor> cheekColors;
    private final ClosetAvatarCompanion companion;
    private final List<ClosetBuyableAccessoryAsset> earrings;
    private final List<ClosetAvatarGradientColor> eyeColors;
    private final List<ClosetAvatarGradientColor> eyebrowColors;
    private final List<ClosetAvatarGradientColor> eyeshadowColors;
    private final List<ClosetBuyableAccessoryAsset> glassesV2;
    private final List<ClosetAvatarGradientColor> hairColors;
    private final List<ClosetBuyableAccessoryAsset> hairOrnaments;
    private final List<ClosetBuyableAccessoryAsset> hatsV2;
    private final List<ClosetBuyableAccessoryAsset> headBands;
    private final List<ClosetBuyableAccessoryAsset> kemomimis;
    private final List<ClosetBuyableAccessoryAsset> leftWeapons;
    private final List<ClosetAvatarGradientColor> lipColors;
    private final List<ClosetBuyableAccessoryAsset> machines;
    private final List<ClosetBuyableAccessoryAsset> masks;
    private final List<ClosetAvatarSimpleValue> motions;
    private final List<ClosetBuyableAccessoryAsset> necklaces;
    private final List<ClosetAvatarSimpleValue> poses;
    private final int remainingKandumes;
    private final List<ClosetBuyableAccessoryAsset> rightWeapons;
    private final List<ClosetAvatarSimpleColor> skinColors;
    private final Status status;
    private final int userAvatarPartsNum;

    public ClosetAvatarPartsResponse(int i10, int i11, List<ClosetAvatarSimpleColor> list, List<ClosetAvatarGradientColor> list2, List<ClosetAvatarGradientColor> list3, List<ClosetAvatarGradientColor> list4, List<ClosetAvatarGradientColor> list5, List<ClosetAvatarGradientColor> list6, List<ClosetAvatarGradientColor> list7, List<ClosetAvatarGradientColor> list8, List<ClosetBuyableBackground> list9, List<ClosetAvatarSimpleValue> list10, List<ClosetAvatarSimpleValue> list11, List<ClosetAvatarBody> list12, ClosetAvatarCompanion closetAvatarCompanion, List<ClosetBuyableAccessoryAsset> list13, List<ClosetBuyableAccessoryAsset> list14, List<ClosetBuyableAccessoryAsset> list15, List<ClosetBuyableAccessoryAsset> list16, List<ClosetBuyableAccessoryAsset> list17, List<ClosetBuyableAccessoryAsset> list18, List<ClosetBuyableAccessoryAsset> list19, List<ClosetBuyableAccessoryAsset> list20, List<ClosetBuyableAccessoryAsset> list21, List<ClosetBuyableAccessoryAsset> list22, List<ClosetBuyableAccessoryAsset> list23, List<ClosetBuyableAccessoryAsset> list24, Status status) {
        p.h(list, "skinColors");
        p.h(list2, "hairColors");
        p.h(list3, "eyebrowColors");
        p.h(list4, "eyeColors");
        p.h(list5, "beardColors");
        p.h(list6, "eyeshadowColors");
        p.h(list7, "cheekColors");
        p.h(list8, "lipColors");
        p.h(list9, "backgrounds");
        p.h(list10, "poses");
        p.h(list11, "motions");
        p.h(list12, "bodies");
        p.h(closetAvatarCompanion, "companion");
        p.h(status, "status");
        this.userAvatarPartsNum = i10;
        this.remainingKandumes = i11;
        this.skinColors = list;
        this.hairColors = list2;
        this.eyebrowColors = list3;
        this.eyeColors = list4;
        this.beardColors = list5;
        this.eyeshadowColors = list6;
        this.cheekColors = list7;
        this.lipColors = list8;
        this.backgrounds = list9;
        this.poses = list10;
        this.motions = list11;
        this.bodies = list12;
        this.companion = closetAvatarCompanion;
        this.machines = list13;
        this.hatsV2 = list14;
        this.hairOrnaments = list15;
        this.headBands = list16;
        this.glassesV2 = list17;
        this.masks = list18;
        this.earrings = list19;
        this.leftWeapons = list20;
        this.rightWeapons = list21;
        this.bothWeapons = list22;
        this.kemomimis = list23;
        this.necklaces = list24;
        this.status = status;
    }

    public final int component1() {
        return this.userAvatarPartsNum;
    }

    public final List<ClosetAvatarGradientColor> component10() {
        return this.lipColors;
    }

    public final List<ClosetBuyableBackground> component11() {
        return this.backgrounds;
    }

    public final List<ClosetAvatarSimpleValue> component12() {
        return this.poses;
    }

    public final List<ClosetAvatarSimpleValue> component13() {
        return this.motions;
    }

    public final List<ClosetAvatarBody> component14() {
        return this.bodies;
    }

    public final ClosetAvatarCompanion component15() {
        return this.companion;
    }

    public final List<ClosetBuyableAccessoryAsset> component16() {
        return this.machines;
    }

    public final List<ClosetBuyableAccessoryAsset> component17() {
        return this.hatsV2;
    }

    public final List<ClosetBuyableAccessoryAsset> component18() {
        return this.hairOrnaments;
    }

    public final List<ClosetBuyableAccessoryAsset> component19() {
        return this.headBands;
    }

    public final int component2() {
        return this.remainingKandumes;
    }

    public final List<ClosetBuyableAccessoryAsset> component20() {
        return this.glassesV2;
    }

    public final List<ClosetBuyableAccessoryAsset> component21() {
        return this.masks;
    }

    public final List<ClosetBuyableAccessoryAsset> component22() {
        return this.earrings;
    }

    public final List<ClosetBuyableAccessoryAsset> component23() {
        return this.leftWeapons;
    }

    public final List<ClosetBuyableAccessoryAsset> component24() {
        return this.rightWeapons;
    }

    public final List<ClosetBuyableAccessoryAsset> component25() {
        return this.bothWeapons;
    }

    public final List<ClosetBuyableAccessoryAsset> component26() {
        return this.kemomimis;
    }

    public final List<ClosetBuyableAccessoryAsset> component27() {
        return this.necklaces;
    }

    public final Status component28() {
        return this.status;
    }

    public final List<ClosetAvatarSimpleColor> component3() {
        return this.skinColors;
    }

    public final List<ClosetAvatarGradientColor> component4() {
        return this.hairColors;
    }

    public final List<ClosetAvatarGradientColor> component5() {
        return this.eyebrowColors;
    }

    public final List<ClosetAvatarGradientColor> component6() {
        return this.eyeColors;
    }

    public final List<ClosetAvatarGradientColor> component7() {
        return this.beardColors;
    }

    public final List<ClosetAvatarGradientColor> component8() {
        return this.eyeshadowColors;
    }

    public final List<ClosetAvatarGradientColor> component9() {
        return this.cheekColors;
    }

    public final ClosetAvatarPartsResponse copy(int i10, int i11, List<ClosetAvatarSimpleColor> list, List<ClosetAvatarGradientColor> list2, List<ClosetAvatarGradientColor> list3, List<ClosetAvatarGradientColor> list4, List<ClosetAvatarGradientColor> list5, List<ClosetAvatarGradientColor> list6, List<ClosetAvatarGradientColor> list7, List<ClosetAvatarGradientColor> list8, List<ClosetBuyableBackground> list9, List<ClosetAvatarSimpleValue> list10, List<ClosetAvatarSimpleValue> list11, List<ClosetAvatarBody> list12, ClosetAvatarCompanion closetAvatarCompanion, List<ClosetBuyableAccessoryAsset> list13, List<ClosetBuyableAccessoryAsset> list14, List<ClosetBuyableAccessoryAsset> list15, List<ClosetBuyableAccessoryAsset> list16, List<ClosetBuyableAccessoryAsset> list17, List<ClosetBuyableAccessoryAsset> list18, List<ClosetBuyableAccessoryAsset> list19, List<ClosetBuyableAccessoryAsset> list20, List<ClosetBuyableAccessoryAsset> list21, List<ClosetBuyableAccessoryAsset> list22, List<ClosetBuyableAccessoryAsset> list23, List<ClosetBuyableAccessoryAsset> list24, Status status) {
        p.h(list, "skinColors");
        p.h(list2, "hairColors");
        p.h(list3, "eyebrowColors");
        p.h(list4, "eyeColors");
        p.h(list5, "beardColors");
        p.h(list6, "eyeshadowColors");
        p.h(list7, "cheekColors");
        p.h(list8, "lipColors");
        p.h(list9, "backgrounds");
        p.h(list10, "poses");
        p.h(list11, "motions");
        p.h(list12, "bodies");
        p.h(closetAvatarCompanion, "companion");
        p.h(status, "status");
        return new ClosetAvatarPartsResponse(i10, i11, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, closetAvatarCompanion, list13, list14, list15, list16, list17, list18, list19, list20, list21, list22, list23, list24, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetAvatarPartsResponse) {
            ClosetAvatarPartsResponse closetAvatarPartsResponse = (ClosetAvatarPartsResponse) obj;
            return this.userAvatarPartsNum == closetAvatarPartsResponse.userAvatarPartsNum && this.remainingKandumes == closetAvatarPartsResponse.remainingKandumes && p.c(this.skinColors, closetAvatarPartsResponse.skinColors) && p.c(this.hairColors, closetAvatarPartsResponse.hairColors) && p.c(this.eyebrowColors, closetAvatarPartsResponse.eyebrowColors) && p.c(this.eyeColors, closetAvatarPartsResponse.eyeColors) && p.c(this.beardColors, closetAvatarPartsResponse.beardColors) && p.c(this.eyeshadowColors, closetAvatarPartsResponse.eyeshadowColors) && p.c(this.cheekColors, closetAvatarPartsResponse.cheekColors) && p.c(this.lipColors, closetAvatarPartsResponse.lipColors) && p.c(this.backgrounds, closetAvatarPartsResponse.backgrounds) && p.c(this.poses, closetAvatarPartsResponse.poses) && p.c(this.motions, closetAvatarPartsResponse.motions) && p.c(this.bodies, closetAvatarPartsResponse.bodies) && p.c(this.companion, closetAvatarPartsResponse.companion) && p.c(this.machines, closetAvatarPartsResponse.machines) && p.c(this.hatsV2, closetAvatarPartsResponse.hatsV2) && p.c(this.hairOrnaments, closetAvatarPartsResponse.hairOrnaments) && p.c(this.headBands, closetAvatarPartsResponse.headBands) && p.c(this.glassesV2, closetAvatarPartsResponse.glassesV2) && p.c(this.masks, closetAvatarPartsResponse.masks) && p.c(this.earrings, closetAvatarPartsResponse.earrings) && p.c(this.leftWeapons, closetAvatarPartsResponse.leftWeapons) && p.c(this.rightWeapons, closetAvatarPartsResponse.rightWeapons) && p.c(this.bothWeapons, closetAvatarPartsResponse.bothWeapons) && p.c(this.kemomimis, closetAvatarPartsResponse.kemomimis) && p.c(this.necklaces, closetAvatarPartsResponse.necklaces) && p.c(this.status, closetAvatarPartsResponse.status);
        }
        return false;
    }

    public final List<ClosetBuyableBackground> getBackgrounds() {
        return this.backgrounds;
    }

    public final List<ClosetAvatarGradientColor> getBeardColors() {
        return this.beardColors;
    }

    public final List<ClosetAvatarBody> getBodies() {
        return this.bodies;
    }

    public final List<ClosetBuyableAccessoryAsset> getBothWeapons() {
        return this.bothWeapons;
    }

    public final List<ClosetAvatarGradientColor> getCheekColors() {
        return this.cheekColors;
    }

    public final ClosetAvatarCompanion getCompanion() {
        return this.companion;
    }

    public final List<ClosetBuyableAccessoryAsset> getEarrings() {
        return this.earrings;
    }

    public final List<ClosetAvatarGradientColor> getEyeColors() {
        return this.eyeColors;
    }

    public final List<ClosetAvatarGradientColor> getEyebrowColors() {
        return this.eyebrowColors;
    }

    public final List<ClosetAvatarGradientColor> getEyeshadowColors() {
        return this.eyeshadowColors;
    }

    public final List<ClosetBuyableAccessoryAsset> getGlassesV2() {
        return this.glassesV2;
    }

    public final List<ClosetAvatarGradientColor> getHairColors() {
        return this.hairColors;
    }

    public final List<ClosetBuyableAccessoryAsset> getHairOrnaments() {
        return this.hairOrnaments;
    }

    public final List<ClosetBuyableAccessoryAsset> getHatsV2() {
        return this.hatsV2;
    }

    public final List<ClosetBuyableAccessoryAsset> getHeadBands() {
        return this.headBands;
    }

    public final List<ClosetBuyableAccessoryAsset> getKemomimis() {
        return this.kemomimis;
    }

    public final List<ClosetBuyableAccessoryAsset> getLeftWeapons() {
        return this.leftWeapons;
    }

    public final List<ClosetAvatarGradientColor> getLipColors() {
        return this.lipColors;
    }

    public final List<ClosetBuyableAccessoryAsset> getMachines() {
        return this.machines;
    }

    public final List<ClosetBuyableAccessoryAsset> getMasks() {
        return this.masks;
    }

    public final List<ClosetAvatarSimpleValue> getMotions() {
        return this.motions;
    }

    public final List<ClosetBuyableAccessoryAsset> getNecklaces() {
        return this.necklaces;
    }

    public final List<ClosetAvatarSimpleValue> getPoses() {
        return this.poses;
    }

    public final int getRemainingKandumes() {
        return this.remainingKandumes;
    }

    public final List<ClosetBuyableAccessoryAsset> getRightWeapons() {
        return this.rightWeapons;
    }

    public final List<ClosetAvatarSimpleColor> getSkinColors() {
        return this.skinColors;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getUserAvatarPartsNum() {
        return this.userAvatarPartsNum;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((Integer.hashCode(this.userAvatarPartsNum) * 31) + Integer.hashCode(this.remainingKandumes)) * 31) + this.skinColors.hashCode()) * 31) + this.hairColors.hashCode()) * 31) + this.eyebrowColors.hashCode()) * 31) + this.eyeColors.hashCode()) * 31) + this.beardColors.hashCode()) * 31) + this.eyeshadowColors.hashCode()) * 31) + this.cheekColors.hashCode()) * 31) + this.lipColors.hashCode()) * 31) + this.backgrounds.hashCode()) * 31) + this.poses.hashCode()) * 31) + this.motions.hashCode()) * 31) + this.bodies.hashCode()) * 31) + this.companion.hashCode()) * 31;
        List<ClosetBuyableAccessoryAsset> list = this.machines;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list2 = this.hatsV2;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list3 = this.hairOrnaments;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list4 = this.headBands;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list5 = this.glassesV2;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list6 = this.masks;
        int hashCode7 = (hashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list7 = this.earrings;
        int hashCode8 = (hashCode7 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list8 = this.leftWeapons;
        int hashCode9 = (hashCode8 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list9 = this.rightWeapons;
        int hashCode10 = (hashCode9 + (list9 == null ? 0 : list9.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list10 = this.bothWeapons;
        int hashCode11 = (hashCode10 + (list10 == null ? 0 : list10.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list11 = this.kemomimis;
        int hashCode12 = (hashCode11 + (list11 == null ? 0 : list11.hashCode())) * 31;
        List<ClosetBuyableAccessoryAsset> list12 = this.necklaces;
        return ((hashCode12 + (list12 != null ? list12.hashCode() : 0)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ClosetAvatarPartsResponse(userAvatarPartsNum=" + this.userAvatarPartsNum + ", remainingKandumes=" + this.remainingKandumes + ", skinColors=" + this.skinColors + ", hairColors=" + this.hairColors + ", eyebrowColors=" + this.eyebrowColors + ", eyeColors=" + this.eyeColors + ", beardColors=" + this.beardColors + ", eyeshadowColors=" + this.eyeshadowColors + ", cheekColors=" + this.cheekColors + ", lipColors=" + this.lipColors + ", backgrounds=" + this.backgrounds + ", poses=" + this.poses + ", motions=" + this.motions + ", bodies=" + this.bodies + ", companion=" + this.companion + ", machines=" + this.machines + ", hatsV2=" + this.hatsV2 + ", hairOrnaments=" + this.hairOrnaments + ", headBands=" + this.headBands + ", glassesV2=" + this.glassesV2 + ", masks=" + this.masks + ", earrings=" + this.earrings + ", leftWeapons=" + this.leftWeapons + ", rightWeapons=" + this.rightWeapons + ", bothWeapons=" + this.bothWeapons + ", kemomimis=" + this.kemomimis + ", necklaces=" + this.necklaces + ", status=" + this.status + ')';
    }
}
