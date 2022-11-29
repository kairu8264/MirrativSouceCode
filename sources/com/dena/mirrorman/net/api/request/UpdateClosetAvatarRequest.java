package com.dena.mirrorman.net.api.request;

import com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarGradientColor;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleColor;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.closet.ClosetBackground;
import com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class UpdateClosetAvatarRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    @c("back_wing_id")
    private final Integer backWingId;
    @c("background_id")
    private final Integer backgroundId;
    @c("beard_color_id")
    private final Integer beardColorId;
    @c("beard_color_percentage")
    private final Float beardColorPercentage;
    @c("beard_id")
    private final Integer beardId;
    @c("body_id")
    private final String bodyId;
    @c("both_weapon_id")
    private final Integer bothWeaponId;
    @c("bottoms_id")
    private final Integer bottomsId;
    @c("center_interior_id")
    private final Integer centerInteriorId;
    @c("cheek_color_id")
    private final Integer cheekColorId;
    @c("cheek_color_percentage")
    private final Float cheekColorPercentage;
    @c("cheek_id")
    private final Integer cheekId;
    @c("closet_id")
    private final int closetId;
    @c("companion_hat_id")
    private final Integer companionHatId;
    @c("companion_scarf_id")
    private final Integer companionScarfId;
    @c("companion_tops_id")
    private final Integer companionTopsId;
    @c("companion_type_id")
    private final Integer companionTypeId;
    @c("earring_id")
    private final Integer earringId;
    @c("effect_id")
    private final Integer effectId;
    @c("eye_color_id")
    private final Integer eyeColorId;
    @c("eye_color_percentage")
    private final Float eyeColorPercentage;
    @c("eye_id")
    private final Integer eyeId;
    @c("eyeshadow_color_id")
    private final Integer eyeShadowColorId;
    @c("eyebrow_color_id")
    private final Integer eyebrowColorId;
    @c("eyebrow_color_percentage")
    private final Float eyebrowColorPercentage;
    @c("eyebrow_id")
    private final Integer eyebrowId;
    @c("eyeshadow_color_percentage")
    private final Float eyeshadowColorPercentage;
    @c("eyeshadow_id")
    private final Integer eyeshadowId;
    @c("face_paint_id")
    private final Integer facePaintId;
    @c("glasses_id")
    private final Integer glassesId;
    @c("glasses_v2_id")
    private final Integer glassesV2Id;
    @c("hair_color_id")
    private final Integer hairColorId;
    @c("hair_color_percentage")
    private final Float hairColorPercentage;
    @c("hair_id")
    private final Integer hairId;
    @c("hair_ornament_id")
    private final Integer hairOrnamentId;
    @c("hat_id")
    private final Integer hatId;
    @c("hat_v2_id")
    private final Integer hatV2Id;
    @c("head_band_id")
    private final Integer headBandId;
    @c("head_id")
    private final Integer headId;
    @c("kemomimi_id")
    private final Integer kemomimiId;
    @c("left_interior_id")
    private final Integer leftInteriorId;
    @c("left_weapon_id")
    private final Integer leftWeaponId;
    @c("lip_color_id")
    private final Integer lipColorId;
    @c("lip_color_percentage")
    private final Float lipColorPercentage;
    @c("lip_id")
    private final Integer lipId;
    @c("machine_id")
    private final Integer machineId;
    @c("mask_id")
    private final Integer maskId;
    @c("motion1_id")
    private final Integer motion1Id;
    @c("motion2_id")
    private final Integer motion2Id;
    @c("motion3_id")
    private final Integer motion3Id;
    @c("motion4_id")
    private final Integer motion4Id;
    @c("mouth_id")
    private final Integer mouthId;
    @c("necklace_id")
    private final Integer necklaceId;
    @c("nose_id")
    private final Integer noseId;
    @c("onepiece_id")
    private final Integer onepieceId;
    @c("persona_id")
    private final String personaId;
    @c("pet_id")
    private final Integer petId;
    @c("pose_id")
    private final Integer poseId;
    @c("proportion_id")
    private final String proportionId;
    @c("right_interior_id")
    private final Integer rightInteriorId;
    @c("right_weapon_id")
    private final Integer rightWeaponId;
    @c("scarf_id")
    private final Integer scarfId;
    @c("setup_clothes_id")
    private final Integer setupClothesId;
    @c("shoes_id")
    private final Integer shoesId;
    @c("skin_color_id")
    private final Integer skinColorId;
    @c("socks_id")
    private final Integer socksId;
    @c("tops_id")
    private final Integer topsId;
    @c("weapon_id")
    private final Integer weaponId;
    @c("wing_id")
    private final Integer wingId;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final UpdateClosetAvatarRequest convert(ClosetAvatar closetAvatar, int i10) {
            String id2;
            String id3;
            String id4;
            String id5;
            String id6;
            p.h(closetAvatar, "closetAvatar");
            String bodyId = closetAvatar.getBodyId();
            ClosetAvatarSimpleColor skinColor = closetAvatar.getSkinColor();
            Integer valueOf = skinColor != null ? Integer.valueOf(skinColor.getId()) : null;
            ClosetAvatarGradientColor hairColor = closetAvatar.getHairColor();
            Integer valueOf2 = hairColor != null ? Integer.valueOf(hairColor.getId()) : null;
            ClosetAvatarGradientColor eyebrowColor = closetAvatar.getEyebrowColor();
            Integer valueOf3 = eyebrowColor != null ? Integer.valueOf(eyebrowColor.getId()) : null;
            ClosetAvatarGradientColor eyeColor = closetAvatar.getEyeColor();
            Integer valueOf4 = eyeColor != null ? Integer.valueOf(eyeColor.getId()) : null;
            ClosetAvatarGradientColor beardColor = closetAvatar.getBeardColor();
            Integer valueOf5 = beardColor != null ? Integer.valueOf(beardColor.getId()) : null;
            ClosetAvatarGradientColor eyeshadowColor = closetAvatar.getEyeshadowColor();
            Integer valueOf6 = eyeshadowColor != null ? Integer.valueOf(eyeshadowColor.getId()) : null;
            ClosetAvatarGradientColor cheekColor = closetAvatar.getCheekColor();
            Integer valueOf7 = cheekColor != null ? Integer.valueOf(cheekColor.getId()) : null;
            ClosetAvatarGradientColor lipColor = closetAvatar.getLipColor();
            Integer valueOf8 = lipColor != null ? Integer.valueOf(lipColor.getId()) : null;
            ClosetAvatarGradientColor hairColor2 = closetAvatar.getHairColor();
            Float valueOf9 = hairColor2 != null ? Float.valueOf(hairColor2.getPercentage()) : null;
            ClosetAvatarGradientColor eyebrowColor2 = closetAvatar.getEyebrowColor();
            Float valueOf10 = eyebrowColor2 != null ? Float.valueOf(eyebrowColor2.getPercentage()) : null;
            ClosetAvatarGradientColor eyeColor2 = closetAvatar.getEyeColor();
            Float valueOf11 = eyeColor2 != null ? Float.valueOf(eyeColor2.getPercentage()) : null;
            ClosetAvatarGradientColor beardColor2 = closetAvatar.getBeardColor();
            Float valueOf12 = beardColor2 != null ? Float.valueOf(beardColor2.getPercentage()) : null;
            ClosetAvatarGradientColor eyeshadowColor2 = closetAvatar.getEyeshadowColor();
            Float valueOf13 = eyeshadowColor2 != null ? Float.valueOf(eyeshadowColor2.getPercentage()) : null;
            ClosetAvatarGradientColor cheekColor2 = closetAvatar.getCheekColor();
            Float valueOf14 = cheekColor2 != null ? Float.valueOf(cheekColor2.getPercentage()) : null;
            ClosetAvatarGradientColor lipColor2 = closetAvatar.getLipColor();
            Float valueOf15 = lipColor2 != null ? Float.valueOf(lipColor2.getPercentage()) : null;
            ClosetAsset head = closetAvatar.getHead();
            Integer valueOf16 = head != null ? Integer.valueOf(head.getId()) : null;
            ClosetAvatarSimpleValue proportion = closetAvatar.getProportion();
            String id7 = proportion != null ? proportion.getId() : null;
            ClosetAvatarSimpleValue persona = closetAvatar.getPersona();
            String id8 = persona != null ? persona.getId() : null;
            ClosetBackground background = closetAvatar.getBackground();
            Integer valueOf17 = background != null ? Integer.valueOf(background.getId()) : null;
            ClosetAsset hair = closetAvatar.getHair();
            Integer valueOf18 = hair != null ? Integer.valueOf(hair.getId()) : null;
            ClosetAsset mouth = closetAvatar.getMouth();
            Integer valueOf19 = mouth != null ? Integer.valueOf(mouth.getId()) : null;
            ClosetSetupClotheAsset setupClothes = closetAvatar.getSetupClothes();
            Integer valueOf20 = setupClothes != null ? Integer.valueOf(setupClothes.getId()) : null;
            ClosetSetupClotheAsset onepiece = closetAvatar.getOnepiece();
            Integer valueOf21 = onepiece != null ? Integer.valueOf(onepiece.getId()) : null;
            ClosetAccessoryAsset hat = closetAvatar.getHat();
            Integer valueOf22 = hat != null ? Integer.valueOf(hat.getId()) : null;
            ClosetAccessoryAsset glasses = closetAvatar.getGlasses();
            Integer valueOf23 = glasses != null ? Integer.valueOf(glasses.getId()) : null;
            ClosetAccessoryAsset scarf = closetAvatar.getScarf();
            Integer valueOf24 = scarf != null ? Integer.valueOf(scarf.getId()) : null;
            ClosetAsset nose = closetAvatar.getNose();
            Integer valueOf25 = nose != null ? Integer.valueOf(nose.getId()) : null;
            ClosetAsset facePaint = closetAvatar.getFacePaint();
            Integer valueOf26 = facePaint != null ? Integer.valueOf(facePaint.getId()) : null;
            ClosetAsset eyebrow = closetAvatar.getEyebrow();
            Integer valueOf27 = eyebrow != null ? Integer.valueOf(eyebrow.getId()) : null;
            ClosetAccessoryAsset pet = closetAvatar.getPet();
            Integer valueOf28 = pet != null ? Integer.valueOf(pet.getId()) : null;
            ClosetAsset tops = closetAvatar.getTops();
            Integer valueOf29 = tops != null ? Integer.valueOf(tops.getId()) : null;
            ClosetAsset bottoms = closetAvatar.getBottoms();
            Integer valueOf30 = bottoms != null ? Integer.valueOf(bottoms.getId()) : null;
            ClosetAsset socks = closetAvatar.getSocks();
            Integer valueOf31 = socks != null ? Integer.valueOf(socks.getId()) : null;
            ClosetAsset shoes = closetAvatar.getShoes();
            Integer valueOf32 = shoes != null ? Integer.valueOf(shoes.getId()) : null;
            ClosetAccessoryAsset weapon = closetAvatar.getWeapon();
            Integer valueOf33 = weapon != null ? Integer.valueOf(weapon.getId()) : null;
            ClosetAccessoryAsset wing = closetAvatar.getWing();
            Integer valueOf34 = wing != null ? Integer.valueOf(wing.getId()) : null;
            ClosetAsset beard = closetAvatar.getBeard();
            Integer valueOf35 = beard != null ? Integer.valueOf(beard.getId()) : null;
            ClosetAsset cheek = closetAvatar.getCheek();
            Integer valueOf36 = cheek != null ? Integer.valueOf(cheek.getId()) : null;
            ClosetAsset eyeshadow = closetAvatar.getEyeshadow();
            Integer valueOf37 = eyeshadow != null ? Integer.valueOf(eyeshadow.getId()) : null;
            ClosetAsset lip = closetAvatar.getLip();
            Integer valueOf38 = lip != null ? Integer.valueOf(lip.getId()) : null;
            ClosetAsset eye = closetAvatar.getEye();
            Integer valueOf39 = eye != null ? Integer.valueOf(eye.getId()) : null;
            ClosetAvatarSimpleValue motion1 = closetAvatar.getMotion1();
            Integer valueOf40 = (motion1 == null || (id6 = motion1.getId()) == null) ? null : Integer.valueOf(Integer.parseInt(id6));
            ClosetAvatarSimpleValue motion2 = closetAvatar.getMotion2();
            Integer valueOf41 = (motion2 == null || (id5 = motion2.getId()) == null) ? null : Integer.valueOf(Integer.parseInt(id5));
            ClosetAvatarSimpleValue motion3 = closetAvatar.getMotion3();
            Integer valueOf42 = (motion3 == null || (id4 = motion3.getId()) == null) ? null : Integer.valueOf(Integer.parseInt(id4));
            ClosetAvatarSimpleValue motion4 = closetAvatar.getMotion4();
            Integer valueOf43 = (motion4 == null || (id3 = motion4.getId()) == null) ? null : Integer.valueOf(Integer.parseInt(id3));
            ClosetAccessoryAsset companionType = closetAvatar.getCompanionType();
            Integer valueOf44 = companionType != null ? Integer.valueOf(companionType.getId()) : null;
            ClosetAccessoryAsset companionTops = closetAvatar.getCompanionTops();
            Integer valueOf45 = companionTops != null ? Integer.valueOf(companionTops.getId()) : null;
            ClosetAccessoryAsset companionHat = closetAvatar.getCompanionHat();
            Integer valueOf46 = companionHat != null ? Integer.valueOf(companionHat.getId()) : null;
            ClosetAccessoryAsset companionScarf = closetAvatar.getCompanionScarf();
            Integer valueOf47 = companionScarf != null ? Integer.valueOf(companionScarf.getId()) : null;
            ClosetAvatarSimpleValue pose = closetAvatar.getPose();
            Integer valueOf48 = (pose == null || (id2 = pose.getId()) == null) ? null : Integer.valueOf(Integer.parseInt(id2));
            ClosetAccessoryAsset backWing = closetAvatar.getBackWing();
            Integer valueOf49 = backWing != null ? Integer.valueOf(backWing.getId()) : null;
            ClosetAccessoryAsset effect = closetAvatar.getEffect();
            Integer valueOf50 = effect != null ? Integer.valueOf(effect.getId()) : null;
            ClosetAccessoryAsset leftInterior = closetAvatar.getLeftInterior();
            Integer valueOf51 = leftInterior != null ? Integer.valueOf(leftInterior.getId()) : null;
            ClosetAccessoryAsset centerInterior = closetAvatar.getCenterInterior();
            Integer valueOf52 = centerInterior != null ? Integer.valueOf(centerInterior.getId()) : null;
            ClosetAccessoryAsset rightInterior = closetAvatar.getRightInterior();
            Integer valueOf53 = rightInterior != null ? Integer.valueOf(rightInterior.getId()) : null;
            ClosetAccessoryAsset machine = closetAvatar.getMachine();
            Integer valueOf54 = machine != null ? Integer.valueOf(machine.getId()) : null;
            ClosetAccessoryAsset hatV2 = closetAvatar.getHatV2();
            Integer valueOf55 = hatV2 != null ? Integer.valueOf(hatV2.getId()) : null;
            ClosetAccessoryAsset hairOrnament = closetAvatar.getHairOrnament();
            Integer valueOf56 = hairOrnament != null ? Integer.valueOf(hairOrnament.getId()) : null;
            ClosetAccessoryAsset headBand = closetAvatar.getHeadBand();
            Integer valueOf57 = headBand != null ? Integer.valueOf(headBand.getId()) : null;
            ClosetAccessoryAsset glassesV2 = closetAvatar.getGlassesV2();
            Integer valueOf58 = glassesV2 != null ? Integer.valueOf(glassesV2.getId()) : null;
            ClosetAccessoryAsset mask = closetAvatar.getMask();
            Integer valueOf59 = mask != null ? Integer.valueOf(mask.getId()) : null;
            ClosetAccessoryAsset earring = closetAvatar.getEarring();
            Integer valueOf60 = earring != null ? Integer.valueOf(earring.getId()) : null;
            ClosetAccessoryAsset leftWeapon = closetAvatar.getLeftWeapon();
            Integer valueOf61 = leftWeapon != null ? Integer.valueOf(leftWeapon.getId()) : null;
            ClosetAccessoryAsset rightWeapon = closetAvatar.getRightWeapon();
            Integer valueOf62 = rightWeapon != null ? Integer.valueOf(rightWeapon.getId()) : null;
            ClosetAccessoryAsset bothWeapon = closetAvatar.getBothWeapon();
            Integer valueOf63 = bothWeapon != null ? Integer.valueOf(bothWeapon.getId()) : null;
            ClosetAccessoryAsset kemomimi = closetAvatar.getKemomimi();
            Integer valueOf64 = kemomimi != null ? Integer.valueOf(kemomimi.getId()) : null;
            ClosetAccessoryAsset necklace = closetAvatar.getNecklace();
            return new UpdateClosetAvatarRequest(bodyId, i10, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, id7, id8, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, valueOf64, necklace != null ? Integer.valueOf(necklace.getId()) : null);
        }
    }

    public UpdateClosetAvatarRequest(String str, int i10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Integer num9, String str2, String str3, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, Integer num38, Integer num39, Integer num40, Integer num41, Integer num42, Integer num43, Integer num44, Integer num45, Integer num46, Integer num47, Integer num48, Integer num49, Integer num50, Integer num51, Integer num52, Integer num53, Integer num54, Integer num55, Integer num56, Integer num57, Integer num58) {
        p.h(str, "bodyId");
        this.bodyId = str;
        this.closetId = i10;
        this.skinColorId = num;
        this.hairColorId = num2;
        this.eyebrowColorId = num3;
        this.eyeColorId = num4;
        this.beardColorId = num5;
        this.eyeShadowColorId = num6;
        this.cheekColorId = num7;
        this.lipColorId = num8;
        this.hairColorPercentage = f10;
        this.eyebrowColorPercentage = f11;
        this.eyeColorPercentage = f12;
        this.beardColorPercentage = f13;
        this.eyeshadowColorPercentage = f14;
        this.cheekColorPercentage = f15;
        this.lipColorPercentage = f16;
        this.headId = num9;
        this.proportionId = str2;
        this.personaId = str3;
        this.backgroundId = num10;
        this.hairId = num11;
        this.mouthId = num12;
        this.setupClothesId = num13;
        this.onepieceId = num14;
        this.hatId = num15;
        this.glassesId = num16;
        this.scarfId = num17;
        this.noseId = num18;
        this.facePaintId = num19;
        this.eyebrowId = num20;
        this.petId = num21;
        this.topsId = num22;
        this.bottomsId = num23;
        this.socksId = num24;
        this.shoesId = num25;
        this.weaponId = num26;
        this.wingId = num27;
        this.beardId = num28;
        this.cheekId = num29;
        this.eyeshadowId = num30;
        this.lipId = num31;
        this.eyeId = num32;
        this.motion1Id = num33;
        this.motion2Id = num34;
        this.motion3Id = num35;
        this.motion4Id = num36;
        this.companionTypeId = num37;
        this.companionTopsId = num38;
        this.companionHatId = num39;
        this.companionScarfId = num40;
        this.poseId = num41;
        this.backWingId = num42;
        this.effectId = num43;
        this.leftInteriorId = num44;
        this.centerInteriorId = num45;
        this.rightInteriorId = num46;
        this.machineId = num47;
        this.hatV2Id = num48;
        this.hairOrnamentId = num49;
        this.headBandId = num50;
        this.glassesV2Id = num51;
        this.maskId = num52;
        this.earringId = num53;
        this.leftWeaponId = num54;
        this.rightWeaponId = num55;
        this.bothWeaponId = num56;
        this.kemomimiId = num57;
        this.necklaceId = num58;
    }

    public final String component1() {
        return this.bodyId;
    }

    public final Integer component10() {
        return this.lipColorId;
    }

    public final Float component11() {
        return this.hairColorPercentage;
    }

    public final Float component12() {
        return this.eyebrowColorPercentage;
    }

    public final Float component13() {
        return this.eyeColorPercentage;
    }

    public final Float component14() {
        return this.beardColorPercentage;
    }

    public final Float component15() {
        return this.eyeshadowColorPercentage;
    }

    public final Float component16() {
        return this.cheekColorPercentage;
    }

    public final Float component17() {
        return this.lipColorPercentage;
    }

    public final Integer component18() {
        return this.headId;
    }

    public final String component19() {
        return this.proportionId;
    }

    public final int component2() {
        return this.closetId;
    }

    public final String component20() {
        return this.personaId;
    }

    public final Integer component21() {
        return this.backgroundId;
    }

    public final Integer component22() {
        return this.hairId;
    }

    public final Integer component23() {
        return this.mouthId;
    }

    public final Integer component24() {
        return this.setupClothesId;
    }

    public final Integer component25() {
        return this.onepieceId;
    }

    public final Integer component26() {
        return this.hatId;
    }

    public final Integer component27() {
        return this.glassesId;
    }

    public final Integer component28() {
        return this.scarfId;
    }

    public final Integer component29() {
        return this.noseId;
    }

    public final Integer component3() {
        return this.skinColorId;
    }

    public final Integer component30() {
        return this.facePaintId;
    }

    public final Integer component31() {
        return this.eyebrowId;
    }

    public final Integer component32() {
        return this.petId;
    }

    public final Integer component33() {
        return this.topsId;
    }

    public final Integer component34() {
        return this.bottomsId;
    }

    public final Integer component35() {
        return this.socksId;
    }

    public final Integer component36() {
        return this.shoesId;
    }

    public final Integer component37() {
        return this.weaponId;
    }

    public final Integer component38() {
        return this.wingId;
    }

    public final Integer component39() {
        return this.beardId;
    }

    public final Integer component4() {
        return this.hairColorId;
    }

    public final Integer component40() {
        return this.cheekId;
    }

    public final Integer component41() {
        return this.eyeshadowId;
    }

    public final Integer component42() {
        return this.lipId;
    }

    public final Integer component43() {
        return this.eyeId;
    }

    public final Integer component44() {
        return this.motion1Id;
    }

    public final Integer component45() {
        return this.motion2Id;
    }

    public final Integer component46() {
        return this.motion3Id;
    }

    public final Integer component47() {
        return this.motion4Id;
    }

    public final Integer component48() {
        return this.companionTypeId;
    }

    public final Integer component49() {
        return this.companionTopsId;
    }

    public final Integer component5() {
        return this.eyebrowColorId;
    }

    public final Integer component50() {
        return this.companionHatId;
    }

    public final Integer component51() {
        return this.companionScarfId;
    }

    public final Integer component52() {
        return this.poseId;
    }

    public final Integer component53() {
        return this.backWingId;
    }

    public final Integer component54() {
        return this.effectId;
    }

    public final Integer component55() {
        return this.leftInteriorId;
    }

    public final Integer component56() {
        return this.centerInteriorId;
    }

    public final Integer component57() {
        return this.rightInteriorId;
    }

    public final Integer component58() {
        return this.machineId;
    }

    public final Integer component59() {
        return this.hatV2Id;
    }

    public final Integer component6() {
        return this.eyeColorId;
    }

    public final Integer component60() {
        return this.hairOrnamentId;
    }

    public final Integer component61() {
        return this.headBandId;
    }

    public final Integer component62() {
        return this.glassesV2Id;
    }

    public final Integer component63() {
        return this.maskId;
    }

    public final Integer component64() {
        return this.earringId;
    }

    public final Integer component65() {
        return this.leftWeaponId;
    }

    public final Integer component66() {
        return this.rightWeaponId;
    }

    public final Integer component67() {
        return this.bothWeaponId;
    }

    public final Integer component68() {
        return this.kemomimiId;
    }

    public final Integer component69() {
        return this.necklaceId;
    }

    public final Integer component7() {
        return this.beardColorId;
    }

    public final Integer component8() {
        return this.eyeShadowColorId;
    }

    public final Integer component9() {
        return this.cheekColorId;
    }

    public final UpdateClosetAvatarRequest copy(String str, int i10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Integer num9, String str2, String str3, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, Integer num38, Integer num39, Integer num40, Integer num41, Integer num42, Integer num43, Integer num44, Integer num45, Integer num46, Integer num47, Integer num48, Integer num49, Integer num50, Integer num51, Integer num52, Integer num53, Integer num54, Integer num55, Integer num56, Integer num57, Integer num58) {
        p.h(str, "bodyId");
        return new UpdateClosetAvatarRequest(str, i10, num, num2, num3, num4, num5, num6, num7, num8, f10, f11, f12, f13, f14, f15, f16, num9, str2, str3, num10, num11, num12, num13, num14, num15, num16, num17, num18, num19, num20, num21, num22, num23, num24, num25, num26, num27, num28, num29, num30, num31, num32, num33, num34, num35, num36, num37, num38, num39, num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51, num52, num53, num54, num55, num56, num57, num58);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateClosetAvatarRequest) {
            UpdateClosetAvatarRequest updateClosetAvatarRequest = (UpdateClosetAvatarRequest) obj;
            return p.c(this.bodyId, updateClosetAvatarRequest.bodyId) && this.closetId == updateClosetAvatarRequest.closetId && p.c(this.skinColorId, updateClosetAvatarRequest.skinColorId) && p.c(this.hairColorId, updateClosetAvatarRequest.hairColorId) && p.c(this.eyebrowColorId, updateClosetAvatarRequest.eyebrowColorId) && p.c(this.eyeColorId, updateClosetAvatarRequest.eyeColorId) && p.c(this.beardColorId, updateClosetAvatarRequest.beardColorId) && p.c(this.eyeShadowColorId, updateClosetAvatarRequest.eyeShadowColorId) && p.c(this.cheekColorId, updateClosetAvatarRequest.cheekColorId) && p.c(this.lipColorId, updateClosetAvatarRequest.lipColorId) && p.c(this.hairColorPercentage, updateClosetAvatarRequest.hairColorPercentage) && p.c(this.eyebrowColorPercentage, updateClosetAvatarRequest.eyebrowColorPercentage) && p.c(this.eyeColorPercentage, updateClosetAvatarRequest.eyeColorPercentage) && p.c(this.beardColorPercentage, updateClosetAvatarRequest.beardColorPercentage) && p.c(this.eyeshadowColorPercentage, updateClosetAvatarRequest.eyeshadowColorPercentage) && p.c(this.cheekColorPercentage, updateClosetAvatarRequest.cheekColorPercentage) && p.c(this.lipColorPercentage, updateClosetAvatarRequest.lipColorPercentage) && p.c(this.headId, updateClosetAvatarRequest.headId) && p.c(this.proportionId, updateClosetAvatarRequest.proportionId) && p.c(this.personaId, updateClosetAvatarRequest.personaId) && p.c(this.backgroundId, updateClosetAvatarRequest.backgroundId) && p.c(this.hairId, updateClosetAvatarRequest.hairId) && p.c(this.mouthId, updateClosetAvatarRequest.mouthId) && p.c(this.setupClothesId, updateClosetAvatarRequest.setupClothesId) && p.c(this.onepieceId, updateClosetAvatarRequest.onepieceId) && p.c(this.hatId, updateClosetAvatarRequest.hatId) && p.c(this.glassesId, updateClosetAvatarRequest.glassesId) && p.c(this.scarfId, updateClosetAvatarRequest.scarfId) && p.c(this.noseId, updateClosetAvatarRequest.noseId) && p.c(this.facePaintId, updateClosetAvatarRequest.facePaintId) && p.c(this.eyebrowId, updateClosetAvatarRequest.eyebrowId) && p.c(this.petId, updateClosetAvatarRequest.petId) && p.c(this.topsId, updateClosetAvatarRequest.topsId) && p.c(this.bottomsId, updateClosetAvatarRequest.bottomsId) && p.c(this.socksId, updateClosetAvatarRequest.socksId) && p.c(this.shoesId, updateClosetAvatarRequest.shoesId) && p.c(this.weaponId, updateClosetAvatarRequest.weaponId) && p.c(this.wingId, updateClosetAvatarRequest.wingId) && p.c(this.beardId, updateClosetAvatarRequest.beardId) && p.c(this.cheekId, updateClosetAvatarRequest.cheekId) && p.c(this.eyeshadowId, updateClosetAvatarRequest.eyeshadowId) && p.c(this.lipId, updateClosetAvatarRequest.lipId) && p.c(this.eyeId, updateClosetAvatarRequest.eyeId) && p.c(this.motion1Id, updateClosetAvatarRequest.motion1Id) && p.c(this.motion2Id, updateClosetAvatarRequest.motion2Id) && p.c(this.motion3Id, updateClosetAvatarRequest.motion3Id) && p.c(this.motion4Id, updateClosetAvatarRequest.motion4Id) && p.c(this.companionTypeId, updateClosetAvatarRequest.companionTypeId) && p.c(this.companionTopsId, updateClosetAvatarRequest.companionTopsId) && p.c(this.companionHatId, updateClosetAvatarRequest.companionHatId) && p.c(this.companionScarfId, updateClosetAvatarRequest.companionScarfId) && p.c(this.poseId, updateClosetAvatarRequest.poseId) && p.c(this.backWingId, updateClosetAvatarRequest.backWingId) && p.c(this.effectId, updateClosetAvatarRequest.effectId) && p.c(this.leftInteriorId, updateClosetAvatarRequest.leftInteriorId) && p.c(this.centerInteriorId, updateClosetAvatarRequest.centerInteriorId) && p.c(this.rightInteriorId, updateClosetAvatarRequest.rightInteriorId) && p.c(this.machineId, updateClosetAvatarRequest.machineId) && p.c(this.hatV2Id, updateClosetAvatarRequest.hatV2Id) && p.c(this.hairOrnamentId, updateClosetAvatarRequest.hairOrnamentId) && p.c(this.headBandId, updateClosetAvatarRequest.headBandId) && p.c(this.glassesV2Id, updateClosetAvatarRequest.glassesV2Id) && p.c(this.maskId, updateClosetAvatarRequest.maskId) && p.c(this.earringId, updateClosetAvatarRequest.earringId) && p.c(this.leftWeaponId, updateClosetAvatarRequest.leftWeaponId) && p.c(this.rightWeaponId, updateClosetAvatarRequest.rightWeaponId) && p.c(this.bothWeaponId, updateClosetAvatarRequest.bothWeaponId) && p.c(this.kemomimiId, updateClosetAvatarRequest.kemomimiId) && p.c(this.necklaceId, updateClosetAvatarRequest.necklaceId);
        }
        return false;
    }

    public final Integer getBackWingId() {
        return this.backWingId;
    }

    public final Integer getBackgroundId() {
        return this.backgroundId;
    }

    public final Integer getBeardColorId() {
        return this.beardColorId;
    }

    public final Float getBeardColorPercentage() {
        return this.beardColorPercentage;
    }

    public final Integer getBeardId() {
        return this.beardId;
    }

    public final String getBodyId() {
        return this.bodyId;
    }

    public final Integer getBothWeaponId() {
        return this.bothWeaponId;
    }

    public final Integer getBottomsId() {
        return this.bottomsId;
    }

    public final Integer getCenterInteriorId() {
        return this.centerInteriorId;
    }

    public final Integer getCheekColorId() {
        return this.cheekColorId;
    }

    public final Float getCheekColorPercentage() {
        return this.cheekColorPercentage;
    }

    public final Integer getCheekId() {
        return this.cheekId;
    }

    public final int getClosetId() {
        return this.closetId;
    }

    public final Integer getCompanionHatId() {
        return this.companionHatId;
    }

    public final Integer getCompanionScarfId() {
        return this.companionScarfId;
    }

    public final Integer getCompanionTopsId() {
        return this.companionTopsId;
    }

    public final Integer getCompanionTypeId() {
        return this.companionTypeId;
    }

    public final Integer getEarringId() {
        return this.earringId;
    }

    public final Integer getEffectId() {
        return this.effectId;
    }

    public final Integer getEyeColorId() {
        return this.eyeColorId;
    }

    public final Float getEyeColorPercentage() {
        return this.eyeColorPercentage;
    }

    public final Integer getEyeId() {
        return this.eyeId;
    }

    public final Integer getEyeShadowColorId() {
        return this.eyeShadowColorId;
    }

    public final Integer getEyebrowColorId() {
        return this.eyebrowColorId;
    }

    public final Float getEyebrowColorPercentage() {
        return this.eyebrowColorPercentage;
    }

    public final Integer getEyebrowId() {
        return this.eyebrowId;
    }

    public final Float getEyeshadowColorPercentage() {
        return this.eyeshadowColorPercentage;
    }

    public final Integer getEyeshadowId() {
        return this.eyeshadowId;
    }

    public final Integer getFacePaintId() {
        return this.facePaintId;
    }

    public final Integer getGlassesId() {
        return this.glassesId;
    }

    public final Integer getGlassesV2Id() {
        return this.glassesV2Id;
    }

    public final Integer getHairColorId() {
        return this.hairColorId;
    }

    public final Float getHairColorPercentage() {
        return this.hairColorPercentage;
    }

    public final Integer getHairId() {
        return this.hairId;
    }

    public final Integer getHairOrnamentId() {
        return this.hairOrnamentId;
    }

    public final Integer getHatId() {
        return this.hatId;
    }

    public final Integer getHatV2Id() {
        return this.hatV2Id;
    }

    public final Integer getHeadBandId() {
        return this.headBandId;
    }

    public final Integer getHeadId() {
        return this.headId;
    }

    public final Integer getKemomimiId() {
        return this.kemomimiId;
    }

    public final Integer getLeftInteriorId() {
        return this.leftInteriorId;
    }

    public final Integer getLeftWeaponId() {
        return this.leftWeaponId;
    }

    public final Integer getLipColorId() {
        return this.lipColorId;
    }

    public final Float getLipColorPercentage() {
        return this.lipColorPercentage;
    }

    public final Integer getLipId() {
        return this.lipId;
    }

    public final Integer getMachineId() {
        return this.machineId;
    }

    public final Integer getMaskId() {
        return this.maskId;
    }

    public final Integer getMotion1Id() {
        return this.motion1Id;
    }

    public final Integer getMotion2Id() {
        return this.motion2Id;
    }

    public final Integer getMotion3Id() {
        return this.motion3Id;
    }

    public final Integer getMotion4Id() {
        return this.motion4Id;
    }

    public final Integer getMouthId() {
        return this.mouthId;
    }

    public final Integer getNecklaceId() {
        return this.necklaceId;
    }

    public final Integer getNoseId() {
        return this.noseId;
    }

    public final Integer getOnepieceId() {
        return this.onepieceId;
    }

    public final String getPersonaId() {
        return this.personaId;
    }

    public final Integer getPetId() {
        return this.petId;
    }

    public final Integer getPoseId() {
        return this.poseId;
    }

    public final String getProportionId() {
        return this.proportionId;
    }

    public final Integer getRightInteriorId() {
        return this.rightInteriorId;
    }

    public final Integer getRightWeaponId() {
        return this.rightWeaponId;
    }

    public final Integer getScarfId() {
        return this.scarfId;
    }

    public final Integer getSetupClothesId() {
        return this.setupClothesId;
    }

    public final Integer getShoesId() {
        return this.shoesId;
    }

    public final Integer getSkinColorId() {
        return this.skinColorId;
    }

    public final Integer getSocksId() {
        return this.socksId;
    }

    public final Integer getTopsId() {
        return this.topsId;
    }

    public final Integer getWeaponId() {
        return this.weaponId;
    }

    public final Integer getWingId() {
        return this.wingId;
    }

    public int hashCode() {
        int hashCode = ((this.bodyId.hashCode() * 31) + Integer.hashCode(this.closetId)) * 31;
        Integer num = this.skinColorId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hairColorId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.eyebrowColorId;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.eyeColorId;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.beardColorId;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.eyeShadowColorId;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.cheekColorId;
        int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.lipColorId;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Float f10 = this.hairColorPercentage;
        int hashCode10 = (hashCode9 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.eyebrowColorPercentage;
        int hashCode11 = (hashCode10 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.eyeColorPercentage;
        int hashCode12 = (hashCode11 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.beardColorPercentage;
        int hashCode13 = (hashCode12 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.eyeshadowColorPercentage;
        int hashCode14 = (hashCode13 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.cheekColorPercentage;
        int hashCode15 = (hashCode14 + (f15 == null ? 0 : f15.hashCode())) * 31;
        Float f16 = this.lipColorPercentage;
        int hashCode16 = (hashCode15 + (f16 == null ? 0 : f16.hashCode())) * 31;
        Integer num9 = this.headId;
        int hashCode17 = (hashCode16 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str = this.proportionId;
        int hashCode18 = (hashCode17 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.personaId;
        int hashCode19 = (hashCode18 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num10 = this.backgroundId;
        int hashCode20 = (hashCode19 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.hairId;
        int hashCode21 = (hashCode20 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.mouthId;
        int hashCode22 = (hashCode21 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.setupClothesId;
        int hashCode23 = (hashCode22 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.onepieceId;
        int hashCode24 = (hashCode23 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.hatId;
        int hashCode25 = (hashCode24 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.glassesId;
        int hashCode26 = (hashCode25 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.scarfId;
        int hashCode27 = (hashCode26 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.noseId;
        int hashCode28 = (hashCode27 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.facePaintId;
        int hashCode29 = (hashCode28 + (num19 == null ? 0 : num19.hashCode())) * 31;
        Integer num20 = this.eyebrowId;
        int hashCode30 = (hashCode29 + (num20 == null ? 0 : num20.hashCode())) * 31;
        Integer num21 = this.petId;
        int hashCode31 = (hashCode30 + (num21 == null ? 0 : num21.hashCode())) * 31;
        Integer num22 = this.topsId;
        int hashCode32 = (hashCode31 + (num22 == null ? 0 : num22.hashCode())) * 31;
        Integer num23 = this.bottomsId;
        int hashCode33 = (hashCode32 + (num23 == null ? 0 : num23.hashCode())) * 31;
        Integer num24 = this.socksId;
        int hashCode34 = (hashCode33 + (num24 == null ? 0 : num24.hashCode())) * 31;
        Integer num25 = this.shoesId;
        int hashCode35 = (hashCode34 + (num25 == null ? 0 : num25.hashCode())) * 31;
        Integer num26 = this.weaponId;
        int hashCode36 = (hashCode35 + (num26 == null ? 0 : num26.hashCode())) * 31;
        Integer num27 = this.wingId;
        int hashCode37 = (hashCode36 + (num27 == null ? 0 : num27.hashCode())) * 31;
        Integer num28 = this.beardId;
        int hashCode38 = (hashCode37 + (num28 == null ? 0 : num28.hashCode())) * 31;
        Integer num29 = this.cheekId;
        int hashCode39 = (hashCode38 + (num29 == null ? 0 : num29.hashCode())) * 31;
        Integer num30 = this.eyeshadowId;
        int hashCode40 = (hashCode39 + (num30 == null ? 0 : num30.hashCode())) * 31;
        Integer num31 = this.lipId;
        int hashCode41 = (hashCode40 + (num31 == null ? 0 : num31.hashCode())) * 31;
        Integer num32 = this.eyeId;
        int hashCode42 = (hashCode41 + (num32 == null ? 0 : num32.hashCode())) * 31;
        Integer num33 = this.motion1Id;
        int hashCode43 = (hashCode42 + (num33 == null ? 0 : num33.hashCode())) * 31;
        Integer num34 = this.motion2Id;
        int hashCode44 = (hashCode43 + (num34 == null ? 0 : num34.hashCode())) * 31;
        Integer num35 = this.motion3Id;
        int hashCode45 = (hashCode44 + (num35 == null ? 0 : num35.hashCode())) * 31;
        Integer num36 = this.motion4Id;
        int hashCode46 = (hashCode45 + (num36 == null ? 0 : num36.hashCode())) * 31;
        Integer num37 = this.companionTypeId;
        int hashCode47 = (hashCode46 + (num37 == null ? 0 : num37.hashCode())) * 31;
        Integer num38 = this.companionTopsId;
        int hashCode48 = (hashCode47 + (num38 == null ? 0 : num38.hashCode())) * 31;
        Integer num39 = this.companionHatId;
        int hashCode49 = (hashCode48 + (num39 == null ? 0 : num39.hashCode())) * 31;
        Integer num40 = this.companionScarfId;
        int hashCode50 = (hashCode49 + (num40 == null ? 0 : num40.hashCode())) * 31;
        Integer num41 = this.poseId;
        int hashCode51 = (hashCode50 + (num41 == null ? 0 : num41.hashCode())) * 31;
        Integer num42 = this.backWingId;
        int hashCode52 = (hashCode51 + (num42 == null ? 0 : num42.hashCode())) * 31;
        Integer num43 = this.effectId;
        int hashCode53 = (hashCode52 + (num43 == null ? 0 : num43.hashCode())) * 31;
        Integer num44 = this.leftInteriorId;
        int hashCode54 = (hashCode53 + (num44 == null ? 0 : num44.hashCode())) * 31;
        Integer num45 = this.centerInteriorId;
        int hashCode55 = (hashCode54 + (num45 == null ? 0 : num45.hashCode())) * 31;
        Integer num46 = this.rightInteriorId;
        int hashCode56 = (hashCode55 + (num46 == null ? 0 : num46.hashCode())) * 31;
        Integer num47 = this.machineId;
        int hashCode57 = (hashCode56 + (num47 == null ? 0 : num47.hashCode())) * 31;
        Integer num48 = this.hatV2Id;
        int hashCode58 = (hashCode57 + (num48 == null ? 0 : num48.hashCode())) * 31;
        Integer num49 = this.hairOrnamentId;
        int hashCode59 = (hashCode58 + (num49 == null ? 0 : num49.hashCode())) * 31;
        Integer num50 = this.headBandId;
        int hashCode60 = (hashCode59 + (num50 == null ? 0 : num50.hashCode())) * 31;
        Integer num51 = this.glassesV2Id;
        int hashCode61 = (hashCode60 + (num51 == null ? 0 : num51.hashCode())) * 31;
        Integer num52 = this.maskId;
        int hashCode62 = (hashCode61 + (num52 == null ? 0 : num52.hashCode())) * 31;
        Integer num53 = this.earringId;
        int hashCode63 = (hashCode62 + (num53 == null ? 0 : num53.hashCode())) * 31;
        Integer num54 = this.leftWeaponId;
        int hashCode64 = (hashCode63 + (num54 == null ? 0 : num54.hashCode())) * 31;
        Integer num55 = this.rightWeaponId;
        int hashCode65 = (hashCode64 + (num55 == null ? 0 : num55.hashCode())) * 31;
        Integer num56 = this.bothWeaponId;
        int hashCode66 = (hashCode65 + (num56 == null ? 0 : num56.hashCode())) * 31;
        Integer num57 = this.kemomimiId;
        int hashCode67 = (hashCode66 + (num57 == null ? 0 : num57.hashCode())) * 31;
        Integer num58 = this.necklaceId;
        return hashCode67 + (num58 != null ? num58.hashCode() : 0);
    }

    public String toString() {
        return "UpdateClosetAvatarRequest(bodyId=" + this.bodyId + ", closetId=" + this.closetId + ", skinColorId=" + this.skinColorId + ", hairColorId=" + this.hairColorId + ", eyebrowColorId=" + this.eyebrowColorId + ", eyeColorId=" + this.eyeColorId + ", beardColorId=" + this.beardColorId + ", eyeShadowColorId=" + this.eyeShadowColorId + ", cheekColorId=" + this.cheekColorId + ", lipColorId=" + this.lipColorId + ", hairColorPercentage=" + this.hairColorPercentage + ", eyebrowColorPercentage=" + this.eyebrowColorPercentage + ", eyeColorPercentage=" + this.eyeColorPercentage + ", beardColorPercentage=" + this.beardColorPercentage + ", eyeshadowColorPercentage=" + this.eyeshadowColorPercentage + ", cheekColorPercentage=" + this.cheekColorPercentage + ", lipColorPercentage=" + this.lipColorPercentage + ", headId=" + this.headId + ", proportionId=" + this.proportionId + ", personaId=" + this.personaId + ", backgroundId=" + this.backgroundId + ", hairId=" + this.hairId + ", mouthId=" + this.mouthId + ", setupClothesId=" + this.setupClothesId + ", onepieceId=" + this.onepieceId + ", hatId=" + this.hatId + ", glassesId=" + this.glassesId + ", scarfId=" + this.scarfId + ", noseId=" + this.noseId + ", facePaintId=" + this.facePaintId + ", eyebrowId=" + this.eyebrowId + ", petId=" + this.petId + ", topsId=" + this.topsId + ", bottomsId=" + this.bottomsId + ", socksId=" + this.socksId + ", shoesId=" + this.shoesId + ", weaponId=" + this.weaponId + ", wingId=" + this.wingId + ", beardId=" + this.beardId + ", cheekId=" + this.cheekId + ", eyeshadowId=" + this.eyeshadowId + ", lipId=" + this.lipId + ", eyeId=" + this.eyeId + ", motion1Id=" + this.motion1Id + ", motion2Id=" + this.motion2Id + ", motion3Id=" + this.motion3Id + ", motion4Id=" + this.motion4Id + ", companionTypeId=" + this.companionTypeId + ", companionTopsId=" + this.companionTopsId + ", companionHatId=" + this.companionHatId + ", companionScarfId=" + this.companionScarfId + ", poseId=" + this.poseId + ", backWingId=" + this.backWingId + ", effectId=" + this.effectId + ", leftInteriorId=" + this.leftInteriorId + ", centerInteriorId=" + this.centerInteriorId + ", rightInteriorId=" + this.rightInteriorId + ", machineId=" + this.machineId + ", hatV2Id=" + this.hatV2Id + ", hairOrnamentId=" + this.hairOrnamentId + ", headBandId=" + this.headBandId + ", glassesV2Id=" + this.glassesV2Id + ", maskId=" + this.maskId + ", earringId=" + this.earringId + ", leftWeaponId=" + this.leftWeaponId + ", rightWeaponId=" + this.rightWeaponId + ", bothWeaponId=" + this.bothWeaponId + ", kemomimiId=" + this.kemomimiId + ", necklaceId=" + this.necklaceId + ')';
    }
}
