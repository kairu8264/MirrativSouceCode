package com.dena.mirrorman.net.api.response.event;

import android.util.Base64;
import androidx.appcompat.widget.ActivityChooserModel;
import com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.closet.ClosetBackground;
import com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset;
import com.dena.mirrativ.mirrativapi.closet.GameEffect;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.Referer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jf.c;
import jo.p;
import so.n;
import xm.e;
import xn.s;

/* loaded from: classes2.dex */
public final class ShooterMemberAvatar {
    public static final int $stable = 8;
    private final ClosetAvatar avatar;
    private final ShooterMember user;

    public ShooterMemberAvatar(ClosetAvatar closetAvatar, ShooterMember shooterMember) {
        p.h(closetAvatar, Referer.AVATAR);
        p.h(shooterMember, MRLog.TARGET_TYPE_USER);
        this.avatar = closetAvatar;
        this.user = shooterMember;
    }

    private final List<GameEffect> availableGameEffects() {
        GameEffect[] gameEffectArr = new GameEffect[52];
        ClosetBackground background = this.avatar.getBackground();
        gameEffectArr[0] = background != null ? background.getGameEffect() : null;
        ClosetAvatarSimpleValue persona = this.avatar.getPersona();
        gameEffectArr[1] = persona != null ? persona.getGameEffect() : null;
        ClosetAvatarSimpleValue proportion = this.avatar.getProportion();
        gameEffectArr[2] = proportion != null ? proportion.getGameEffect() : null;
        ClosetAsset beard = this.avatar.getBeard();
        gameEffectArr[3] = beard != null ? beard.getGameEffect() : null;
        ClosetAsset bottoms = this.avatar.getBottoms();
        gameEffectArr[4] = bottoms != null ? bottoms.getGameEffect() : null;
        ClosetAsset cheek = this.avatar.getCheek();
        gameEffectArr[5] = cheek != null ? cheek.getGameEffect() : null;
        ClosetAsset eye = this.avatar.getEye();
        gameEffectArr[6] = eye != null ? eye.getGameEffect() : null;
        ClosetAsset eyebrow = this.avatar.getEyebrow();
        gameEffectArr[7] = eyebrow != null ? eyebrow.getGameEffect() : null;
        ClosetAsset eyeshadow = this.avatar.getEyeshadow();
        gameEffectArr[8] = eyeshadow != null ? eyeshadow.getGameEffect() : null;
        ClosetAsset facePaint = this.avatar.getFacePaint();
        gameEffectArr[9] = facePaint != null ? facePaint.getGameEffect() : null;
        ClosetAsset hair = this.avatar.getHair();
        gameEffectArr[10] = hair != null ? hair.getGameEffect() : null;
        ClosetAsset head = this.avatar.getHead();
        gameEffectArr[11] = head != null ? head.getGameEffect() : null;
        ClosetAsset lip = this.avatar.getLip();
        gameEffectArr[12] = lip != null ? lip.getGameEffect() : null;
        ClosetAsset mouth = this.avatar.getMouth();
        gameEffectArr[13] = mouth != null ? mouth.getGameEffect() : null;
        ClosetAsset nose = this.avatar.getNose();
        gameEffectArr[14] = nose != null ? nose.getGameEffect() : null;
        ClosetSetupClotheAsset setupClothes = this.avatar.getSetupClothes();
        gameEffectArr[15] = setupClothes != null ? setupClothes.getGameEffect() : null;
        ClosetSetupClotheAsset onepiece = this.avatar.getOnepiece();
        gameEffectArr[16] = onepiece != null ? onepiece.getGameEffect() : null;
        ClosetAsset shoes = this.avatar.getShoes();
        gameEffectArr[17] = shoes != null ? shoes.getGameEffect() : null;
        ClosetAsset socks = this.avatar.getSocks();
        gameEffectArr[18] = socks != null ? socks.getGameEffect() : null;
        ClosetAsset tops = this.avatar.getTops();
        gameEffectArr[19] = tops != null ? tops.getGameEffect() : null;
        ClosetAccessoryAsset weapon = this.avatar.getWeapon();
        gameEffectArr[20] = weapon != null ? weapon.getGameEffect() : null;
        ClosetAccessoryAsset wing = this.avatar.getWing();
        gameEffectArr[21] = wing != null ? wing.getGameEffect() : null;
        ClosetAccessoryAsset glasses = this.avatar.getGlasses();
        gameEffectArr[22] = glasses != null ? glasses.getGameEffect() : null;
        ClosetAccessoryAsset hat = this.avatar.getHat();
        gameEffectArr[23] = hat != null ? hat.getGameEffect() : null;
        ClosetAccessoryAsset pet = this.avatar.getPet();
        gameEffectArr[24] = pet != null ? pet.getGameEffect() : null;
        ClosetAccessoryAsset scarf = this.avatar.getScarf();
        gameEffectArr[25] = scarf != null ? scarf.getGameEffect() : null;
        ClosetAvatarSimpleValue motion1 = this.avatar.getMotion1();
        gameEffectArr[26] = motion1 != null ? motion1.getGameEffect() : null;
        ClosetAvatarSimpleValue motion2 = this.avatar.getMotion2();
        gameEffectArr[27] = motion2 != null ? motion2.getGameEffect() : null;
        ClosetAvatarSimpleValue motion3 = this.avatar.getMotion3();
        gameEffectArr[28] = motion3 != null ? motion3.getGameEffect() : null;
        ClosetAvatarSimpleValue motion4 = this.avatar.getMotion4();
        gameEffectArr[29] = motion4 != null ? motion4.getGameEffect() : null;
        ClosetAccessoryAsset companionType = this.avatar.getCompanionType();
        gameEffectArr[30] = companionType != null ? companionType.getGameEffect() : null;
        ClosetAccessoryAsset companionTops = this.avatar.getCompanionTops();
        gameEffectArr[31] = companionTops != null ? companionTops.getGameEffect() : null;
        ClosetAccessoryAsset companionHat = this.avatar.getCompanionHat();
        gameEffectArr[32] = companionHat != null ? companionHat.getGameEffect() : null;
        ClosetAccessoryAsset companionScarf = this.avatar.getCompanionScarf();
        gameEffectArr[33] = companionScarf != null ? companionScarf.getGameEffect() : null;
        ClosetAvatarSimpleValue pose = this.avatar.getPose();
        gameEffectArr[34] = pose != null ? pose.getGameEffect() : null;
        ClosetAccessoryAsset backWing = this.avatar.getBackWing();
        gameEffectArr[35] = backWing != null ? backWing.getGameEffect() : null;
        ClosetAccessoryAsset effect = this.avatar.getEffect();
        gameEffectArr[36] = effect != null ? effect.getGameEffect() : null;
        ClosetAccessoryAsset leftInterior = this.avatar.getLeftInterior();
        gameEffectArr[37] = leftInterior != null ? leftInterior.getGameEffect() : null;
        ClosetAccessoryAsset centerInterior = this.avatar.getCenterInterior();
        gameEffectArr[38] = centerInterior != null ? centerInterior.getGameEffect() : null;
        ClosetAccessoryAsset rightInterior = this.avatar.getRightInterior();
        gameEffectArr[39] = rightInterior != null ? rightInterior.getGameEffect() : null;
        ClosetAccessoryAsset machine = this.avatar.getMachine();
        gameEffectArr[40] = machine != null ? machine.getGameEffect() : null;
        ClosetAccessoryAsset hatV2 = this.avatar.getHatV2();
        gameEffectArr[41] = hatV2 != null ? hatV2.getGameEffect() : null;
        ClosetAccessoryAsset hairOrnament = this.avatar.getHairOrnament();
        gameEffectArr[42] = hairOrnament != null ? hairOrnament.getGameEffect() : null;
        ClosetAccessoryAsset headBand = this.avatar.getHeadBand();
        gameEffectArr[43] = headBand != null ? headBand.getGameEffect() : null;
        ClosetAccessoryAsset glassesV2 = this.avatar.getGlassesV2();
        gameEffectArr[44] = glassesV2 != null ? glassesV2.getGameEffect() : null;
        ClosetAccessoryAsset mask = this.avatar.getMask();
        gameEffectArr[45] = mask != null ? mask.getGameEffect() : null;
        ClosetAccessoryAsset earring = this.avatar.getEarring();
        gameEffectArr[46] = earring != null ? earring.getGameEffect() : null;
        ClosetAccessoryAsset leftWeapon = this.avatar.getLeftWeapon();
        gameEffectArr[47] = leftWeapon != null ? leftWeapon.getGameEffect() : null;
        ClosetAccessoryAsset rightWeapon = this.avatar.getRightWeapon();
        gameEffectArr[48] = rightWeapon != null ? rightWeapon.getGameEffect() : null;
        ClosetAccessoryAsset bothWeapon = this.avatar.getBothWeapon();
        gameEffectArr[49] = bothWeapon != null ? bothWeapon.getGameEffect() : null;
        ClosetAccessoryAsset kemomimi = this.avatar.getKemomimi();
        gameEffectArr[50] = kemomimi != null ? kemomimi.getGameEffect() : null;
        ClosetAccessoryAsset necklace = this.avatar.getNecklace();
        gameEffectArr[51] = necklace != null ? necklace.getGameEffect() : null;
        List o10 = s.o(gameEffectArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : o10) {
            if (((GameEffect) obj).getGameItemType().isShooter()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ ShooterMemberAvatar copy$default(ShooterMemberAvatar shooterMemberAvatar, ClosetAvatar closetAvatar, ShooterMember shooterMember, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            closetAvatar = shooterMemberAvatar.avatar;
        }
        if ((i10 & 2) != 0) {
            shooterMember = shooterMemberAvatar.user;
        }
        return shooterMemberAvatar.copy(closetAvatar, shooterMember);
    }

    public final String build() {
        return c.f37906y.a(this.avatar).b();
    }

    public final ClosetAvatar component1() {
        return this.avatar;
    }

    public final ShooterMember component2() {
        return this.user;
    }

    public final ShooterMemberAvatar copy(ClosetAvatar closetAvatar, ShooterMember shooterMember) {
        p.h(closetAvatar, Referer.AVATAR);
        p.h(shooterMember, MRLog.TARGET_TYPE_USER);
        return new ShooterMemberAvatar(closetAvatar, shooterMember);
    }

    public final String createExtData() {
        HashMap<String, Object> createRatingClassData;
        GameEffect gameEffect;
        GameEffect gameEffect2;
        String assetBundlePrefabName;
        String assetBundlePrefabName2;
        List<GameEffect> availableGameEffects = availableGameEffects();
        int i10 = 0;
        for (GameEffect gameEffect3 : availableGameEffects) {
            i10 += gameEffect3.getPower();
        }
        int i11 = 0;
        for (GameEffect gameEffect4 : availableGameEffects) {
            i11 += gameEffect4.getSpeed();
        }
        int i12 = 0;
        for (GameEffect gameEffect5 : availableGameEffects) {
            i12 += gameEffect5.getAccel();
        }
        int i13 = 0;
        for (GameEffect gameEffect6 : availableGameEffects) {
            i13 += gameEffect6.getWeight();
        }
        ClosetAccessoryAsset machine = this.avatar.getMachine();
        String str = "";
        String y10 = n.y((machine == null || (assetBundlePrefabName2 = machine.getAssetBundlePrefabName()) == null) ? "" : assetBundlePrefabName2, ".prefab", "", false, 4, null);
        ClosetAccessoryAsset bothWeapon = this.avatar.getBothWeapon();
        String y11 = n.y((bothWeapon == null || (assetBundlePrefabName = bothWeapon.getAssetBundlePrefabName()) == null) ? "" : assetBundlePrefabName, ".prefab", "", false, 4, null);
        e eVar = new e();
        HashMap hashMap = new HashMap();
        hashMap.put(LogBase.USER_ID, Integer.valueOf(this.user.getUserId()));
        hashMap.put("team_id", Integer.valueOf(this.user.getTeamId()));
        hashMap.put("user_name", this.user.getName());
        hashMap.put("profile_image_url", this.user.getProfileImageUrl());
        hashMap.put("member_type", Integer.valueOf(this.user.getMemberType().getValue()));
        hashMap.put("party_type", Integer.valueOf(this.user.getPartyType().getValue()));
        hashMap.put("position", Integer.valueOf(this.user.getPosition()));
        hashMap.put("machine", y10);
        ClosetAccessoryAsset machine2 = this.avatar.getMachine();
        hashMap.put("machine_name", (machine2 == null || (gameEffect2 = machine2.getGameEffect()) == null || (r0 = gameEffect2.getPartTitle()) == null) ? "" : "");
        hashMap.put("weapon", y11);
        ClosetAccessoryAsset bothWeapon2 = this.avatar.getBothWeapon();
        hashMap.put("weapon_name", (bothWeapon2 == null || (gameEffect = bothWeapon2.getGameEffect()) == null || (r0 = gameEffect.getPartTitle()) == null) ? "" : "");
        hashMap.put("power", Integer.valueOf(i10));
        hashMap.put("speed", Integer.valueOf(i11));
        hashMap.put("accel", Integer.valueOf(i12));
        hashMap.put(ActivityChooserModel.ATTRIBUTE_WEIGHT, Integer.valueOf(i13));
        hashMap.put("victory_count", Integer.valueOf(this.user.getVictoryCount()));
        hashMap.put("victory_level", Integer.valueOf(this.user.getVictoryLevel()));
        hashMap.put("game_team_index", Integer.valueOf(this.user.getGameTeamIndex()));
        hashMap.put("rating_point", Integer.valueOf(this.user.getRatingPoint()));
        ShooterRatingClass ratingClass = this.user.getRatingClass();
        if (ratingClass != null && (createRatingClassData = ratingClass.createRatingClassData()) != null) {
            str = createRatingClassData;
        }
        hashMap.put("rating_class", str);
        hashMap.put("rating_legend_ranking", Integer.valueOf(this.user.getRatingLegendRanking()));
        hashMap.put("aura_type", Integer.valueOf(this.user.getAuraType()));
        String s10 = eVar.s(hashMap);
        p.g(s10, "extJson");
        byte[] bytes = s10.getBytes(so.c.f52772b);
        p.g(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        p.g(encodeToString, "encodeToString(extJson.t…eArray(), Base64.DEFAULT)");
        return encodeToString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterMemberAvatar) {
            ShooterMemberAvatar shooterMemberAvatar = (ShooterMemberAvatar) obj;
            return p.c(this.avatar, shooterMemberAvatar.avatar) && p.c(this.user, shooterMemberAvatar.user);
        }
        return false;
    }

    public final ClosetAvatar getAvatar() {
        return this.avatar;
    }

    public final ShooterPartyType getShooterPartyType() {
        return this.user.getPartyType();
    }

    public final ShooterMember getUser() {
        return this.user;
    }

    public int hashCode() {
        return (this.avatar.hashCode() * 31) + this.user.hashCode();
    }

    public String toString() {
        return "ShooterMemberAvatar(avatar=" + this.avatar + ", user=" + this.user + ')';
    }
}
