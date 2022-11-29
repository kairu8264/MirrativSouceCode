package jf;

import android.os.Parcel;
import android.os.Parcelable;
import com.dena.mirrativ.mirrativapi.closet.ClosetAccessoryAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAsset;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatar;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarGradientColor;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleColor;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.closet.ClosetBackground;
import com.dena.mirrativ.mirrativapi.closet.ClosetSetupClotheAsset;
import com.dena.mirrorman.unity.AccessoryPosition;
import com.dena.mirrorman.unity.UnityCommandKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c implements Parcelable, Cloneable {

    /* renamed from: w  reason: collision with root package name */
    public ClosetAvatar f37908w;

    /* renamed from: x  reason: collision with root package name */
    public String f37909x;

    /* renamed from: y  reason: collision with root package name */
    public static final b f37906y = new b(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f37907z = 8;
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            jo.p.h(parcel, "source");
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }

        public final c a(ClosetAvatar closetAvatar) {
            jo.p.h(closetAvatar, "closetAvatar");
            return new c(closetAvatar);
        }
    }

    /* renamed from: jf.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0527c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37910a;

        static {
            int[] iArr = new int[k0.values().length];
            iArr[k0.GENDER.ordinal()] = 1;
            iArr[k0.PERSONA.ordinal()] = 2;
            iArr[k0.PROPOTION.ordinal()] = 3;
            iArr[k0.HEAD.ordinal()] = 4;
            iArr[k0.HAIR.ordinal()] = 5;
            iArr[k0.MOUTH.ordinal()] = 6;
            iArr[k0.SETUP_CLOTHES.ordinal()] = 7;
            iArr[k0.ONEPIECE.ordinal()] = 8;
            iArr[k0.TOPS.ordinal()] = 9;
            iArr[k0.BOTTOMS.ordinal()] = 10;
            iArr[k0.SOCKS.ordinal()] = 11;
            iArr[k0.SHOES.ordinal()] = 12;
            iArr[k0.NOSE.ordinal()] = 13;
            iArr[k0.FACE_PAINT.ordinal()] = 14;
            iArr[k0.EYEBROW.ordinal()] = 15;
            iArr[k0.BEARD.ordinal()] = 16;
            iArr[k0.CHEEK.ordinal()] = 17;
            iArr[k0.EYESHADOW.ordinal()] = 18;
            iArr[k0.LIP.ordinal()] = 19;
            iArr[k0.EYE.ordinal()] = 20;
            iArr[k0.PET.ordinal()] = 21;
            iArr[k0.HAT.ordinal()] = 22;
            iArr[k0.GLASSES.ordinal()] = 23;
            iArr[k0.SCARF.ordinal()] = 24;
            iArr[k0.WEAPON.ordinal()] = 25;
            iArr[k0.WING.ordinal()] = 26;
            iArr[k0.COMPANION.ordinal()] = 27;
            iArr[k0.COMPANION_TOPS.ordinal()] = 28;
            iArr[k0.COMPANION_HAT.ordinal()] = 29;
            iArr[k0.COMPANION_SCARF.ordinal()] = 30;
            iArr[k0.BACKGROUND.ordinal()] = 31;
            iArr[k0.BACK_WING.ordinal()] = 32;
            iArr[k0.EFFECT.ordinal()] = 33;
            iArr[k0.LEFT_INTERIOR.ordinal()] = 34;
            iArr[k0.CENTER_INTERIOR.ordinal()] = 35;
            iArr[k0.RIGHT_INTERIOR.ordinal()] = 36;
            iArr[k0.MACHINE.ordinal()] = 37;
            iArr[k0.HAT_V2.ordinal()] = 38;
            iArr[k0.HAIR_ORNAMENT.ordinal()] = 39;
            iArr[k0.HEAD_BAND.ordinal()] = 40;
            iArr[k0.GLASSES_V2.ordinal()] = 41;
            iArr[k0.MASK.ordinal()] = 42;
            iArr[k0.EARRING.ordinal()] = 43;
            iArr[k0.LEFT_WEAPON.ordinal()] = 44;
            iArr[k0.RIGHT_WEAPON.ordinal()] = 45;
            iArr[k0.BOTH_WEAPON.ordinal()] = 46;
            iArr[k0.KEMOMIMI.ordinal()] = 47;
            iArr[k0.NECKLACE.ordinal()] = 48;
            f37910a = iArr;
        }
    }

    public c(ClosetAvatar closetAvatar) {
        jo.p.h(closetAvatar, "closetAvatar");
        this.f37908w = closetAvatar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String e(c cVar, Set set, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = xn.t0.b();
        }
        return cVar.c(set);
    }

    public final String b() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e(this, null, 1, null));
        if (this.f37909x != null) {
            str = ";Key:" + this.f37909x;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final String c(Set<? extends k0> set) {
        ClosetSetupClotheAsset setupClothes;
        ClosetSetupClotheAsset onepiece;
        ClosetAsset tops;
        ClosetAsset bottoms;
        ClosetAsset socks;
        ClosetAsset shoes;
        ClosetAsset facePaint;
        ClosetAsset beard;
        ClosetAsset cheek;
        ClosetAsset eyeshadow;
        ClosetAsset lip;
        ClosetAccessoryAsset pet;
        ClosetAccessoryAsset hat;
        ClosetAccessoryAsset glasses;
        ClosetAccessoryAsset scarf;
        ClosetAccessoryAsset weapon;
        ClosetAccessoryAsset wing;
        ClosetAccessoryAsset companionType;
        ClosetAccessoryAsset companionTops;
        ClosetAccessoryAsset companionHat;
        ClosetAccessoryAsset companionScarf;
        String assetBundleString;
        ClosetAccessoryAsset backWing;
        ClosetAccessoryAsset effect;
        ClosetAccessoryAsset leftInterior;
        ClosetAccessoryAsset centerInterior;
        ClosetAccessoryAsset rightInterior;
        ClosetAccessoryAsset machine;
        ClosetAccessoryAsset hatV2;
        ClosetAccessoryAsset hairOrnament;
        ClosetAccessoryAsset headBand;
        ClosetAccessoryAsset glassesV2;
        ClosetAccessoryAsset mask;
        ClosetAccessoryAsset earring;
        ClosetAccessoryAsset leftWeapon;
        ClosetAccessoryAsset rightWeapon;
        ClosetAccessoryAsset bothWeapon;
        ClosetAccessoryAsset kemomimi;
        ClosetAccessoryAsset necklace;
        jo.p.h(set, "partsCategories");
        boolean z10 = !set.isEmpty();
        Collection<k0> collection = set;
        if (!z10) {
            collection = xn.o.d0(k0.values());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(xn.t.u(collection, 10));
        for (k0 k0Var : collection) {
            r5 = null;
            r5 = null;
            r5 = null;
            r5 = null;
            r5 = null;
            Object valueOf = null;
            switch (C0527c.f37910a[k0Var.ordinal()]) {
                case 1:
                    valueOf = Boolean.valueOf(arrayList2.add("SetGender:" + this.f37908w.getBodyId()));
                    break;
                case 2:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SetPersona:");
                    ClosetAvatarSimpleValue persona = this.f37908w.getPersona();
                    sb2.append(persona != null ? persona.getValue() : null);
                    valueOf = Boolean.valueOf(arrayList2.add(sb2.toString()));
                    break;
                case 3:
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SetBoneScale:");
                    ClosetAvatarSimpleValue proportion = this.f37908w.getProportion();
                    sb3.append(proportion != null ? proportion.getValue() : null);
                    arrayList2.add(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("SetColor:Skin,");
                    ClosetAvatarSimpleColor skinColor = this.f37908w.getSkinColor();
                    sb4.append(skinColor != null ? skinColor.getColorHex() : null);
                    valueOf = Boolean.valueOf(arrayList2.add(sb4.toString()));
                    break;
                case 4:
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Head,");
                    ClosetAsset head = this.f37908w.getHead();
                    sb5.append(head != null ? head.getAssetBundleString() : null);
                    valueOf = Boolean.valueOf(arrayList.add(sb5.toString()));
                    break;
                case 5:
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Hair,");
                    ClosetAsset hair = this.f37908w.getHair();
                    sb6.append(hair != null ? hair.getAssetBundleString() : null);
                    arrayList.add(sb6.toString());
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("SetColor:Hair,");
                    ClosetAvatarGradientColor hairColor = this.f37908w.getHairColor();
                    sb7.append(hairColor != null ? hairColor.getColorHex() : null);
                    valueOf = Boolean.valueOf(arrayList2.add(sb7.toString()));
                    break;
                case 6:
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Mouth,");
                    ClosetAsset mouth = this.f37908w.getMouth();
                    sb8.append(mouth != null ? mouth.getAssetBundleString() : null);
                    valueOf = Boolean.valueOf(arrayList.add(sb8.toString()));
                    break;
                case 7:
                    if (this.f37908w.getSetupClothes() != null) {
                        valueOf = Boolean.valueOf(arrayList.add("Set," + setupClothes.getAssetBundleString()));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (this.f37908w.getOnepiece() == null) {
                        break;
                    } else {
                        if (this.f37908w.getSetupClothes() == null) {
                            arrayList.add("Onepiece," + onepiece.getAssetBundleString());
                        }
                        valueOf = wn.v.f59242a;
                        break;
                    }
                case 9:
                    if (this.f37908w.getTops() == null) {
                        break;
                    } else {
                        if (this.f37908w.getSetupClothes() == null && this.f37908w.getOnepiece() == null) {
                            arrayList.add("Tops," + tops.getAssetBundleString());
                        }
                        valueOf = wn.v.f59242a;
                        break;
                    }
                    break;
                case 10:
                    if (this.f37908w.getBottoms() == null) {
                        break;
                    } else {
                        if (this.f37908w.getSetupClothes() == null && this.f37908w.getOnepiece() == null) {
                            arrayList.add("Bottoms," + bottoms.getAssetBundleString());
                        }
                        valueOf = wn.v.f59242a;
                        break;
                    }
                    break;
                case 11:
                    if (this.f37908w.getSocks() == null) {
                        break;
                    } else {
                        if (this.f37908w.getSetupClothes() == null) {
                            arrayList.add("Socks," + socks.getAssetBundleString());
                        }
                        valueOf = wn.v.f59242a;
                        break;
                    }
                case 12:
                    if (this.f37908w.getShoes() == null) {
                        break;
                    } else {
                        if (this.f37908w.getSetupClothes() == null) {
                            arrayList.add("Shoes," + shoes.getAssetBundleString());
                        }
                        valueOf = wn.v.f59242a;
                        break;
                    }
                case 13:
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("Nose,");
                    ClosetAsset nose = this.f37908w.getNose();
                    sb9.append(nose != null ? nose.getAssetBundleString() : null);
                    valueOf = Boolean.valueOf(arrayList.add(sb9.toString()));
                    break;
                case 14:
                    valueOf = Boolean.valueOf(this.f37908w.getFacePaint() != null ? arrayList.add("FacePaint," + facePaint.getAssetBundleString()) : arrayList.add(UnityCommandKt.DUMMY_FACE_PAINT));
                    break;
                case 15:
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("Brow,");
                    ClosetAsset eyebrow = this.f37908w.getEyebrow();
                    sb10.append(eyebrow != null ? eyebrow.getAssetBundleString() : null);
                    arrayList.add(sb10.toString());
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("SetColor:Brow,");
                    ClosetAvatarGradientColor eyebrowColor = this.f37908w.getEyebrowColor();
                    sb11.append(eyebrowColor != null ? eyebrowColor.getColorHex() : null);
                    valueOf = Boolean.valueOf(arrayList2.add(sb11.toString()));
                    break;
                case 16:
                    if (this.f37908w.getBeard() != null) {
                        arrayList.add("Beard," + beard.getAssetBundleString());
                    } else {
                        arrayList.add(UnityCommandKt.DUMMY_BEARD);
                    }
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append("SetColor:Beard,");
                    ClosetAvatarGradientColor beardColor = this.f37908w.getBeardColor();
                    sb12.append(beardColor != null ? beardColor.getColorHex() : null);
                    valueOf = Boolean.valueOf(arrayList2.add(sb12.toString()));
                    break;
                case 17:
                    if (this.f37908w.getCheek() != null) {
                        arrayList.add("Cheek," + cheek.getAssetBundleString());
                    } else {
                        arrayList.add(UnityCommandKt.DUMMY_CHEEK);
                    }
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append("SetColor:Cheek,");
                    ClosetAvatarGradientColor cheekColor = this.f37908w.getCheekColor();
                    sb13.append(cheekColor != null ? cheekColor.getColorHex() : null);
                    valueOf = Boolean.valueOf(arrayList2.add(sb13.toString()));
                    break;
                case 18:
                    if (this.f37908w.getEyeshadow() != null) {
                        arrayList.add("EyeShadow," + eyeshadow.getAssetBundleString());
                    } else {
                        arrayList.add(UnityCommandKt.DUMMY_EYESHADOW);
                    }
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append("SetColor:EyeShadow,");
                    ClosetAvatarGradientColor eyeshadowColor = this.f37908w.getEyeshadowColor();
                    sb14.append(eyeshadowColor != null ? eyeshadowColor.getColorHex() : null);
                    valueOf = Boolean.valueOf(arrayList2.add(sb14.toString()));
                    break;
                case 19:
                    if (this.f37908w.getLip() != null) {
                        arrayList.add("Lip," + lip.getAssetBundleString());
                    } else {
                        arrayList.add(UnityCommandKt.DUMMY_LIP);
                    }
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append("SetColor:Lip,");
                    ClosetAvatarGradientColor lipColor = this.f37908w.getLipColor();
                    sb15.append(lipColor != null ? lipColor.getColorHex() : null);
                    valueOf = Boolean.valueOf(arrayList2.add(sb15.toString()));
                    break;
                case 20:
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append("Eye,");
                    ClosetAsset eye = this.f37908w.getEye();
                    sb16.append(eye != null ? eye.getAssetBundleString() : null);
                    arrayList.add(sb16.toString());
                    StringBuilder sb17 = new StringBuilder();
                    sb17.append("SetColor:LeftEye,");
                    ClosetAvatarGradientColor eyeColor = this.f37908w.getEyeColor();
                    sb17.append(eyeColor != null ? eyeColor.getColorHex() : null);
                    arrayList2.add(sb17.toString());
                    StringBuilder sb18 = new StringBuilder();
                    sb18.append("SetColor:RightEye,");
                    ClosetAvatarGradientColor eyeColor2 = this.f37908w.getEyeColor();
                    sb18.append(eyeColor2 != null ? eyeColor2.getColorHex() : null);
                    valueOf = Boolean.valueOf(arrayList2.add(sb18.toString()));
                    break;
                case 21:
                    valueOf = Boolean.valueOf(this.f37908w.getPet() != null ? arrayList.add("Accessory," + pet.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.PET.getRawValue()));
                    break;
                case 22:
                    valueOf = Boolean.valueOf(this.f37908w.getHat() != null ? arrayList.add("Accessory," + hat.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.HEAD_TOP.getRawValue()));
                    break;
                case 23:
                    valueOf = Boolean.valueOf(this.f37908w.getGlasses() != null ? arrayList.add("Accessory," + glasses.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.EYE_FRONT.getRawValue()));
                    break;
                case 24:
                    valueOf = Boolean.valueOf(this.f37908w.getScarf() != null ? arrayList.add("Accessory," + scarf.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.NECK_ORIGIN.getRawValue()));
                    break;
                case 25:
                    valueOf = Boolean.valueOf(this.f37908w.getWeapon() != null ? arrayList.add("Accessory," + weapon.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.WEAPON.getRawValue()));
                    break;
                case 26:
                    valueOf = Boolean.valueOf(this.f37908w.getWing() != null ? arrayList.add("Accessory," + wing.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.SPINEBACK.getRawValue()));
                    break;
                case 27:
                    valueOf = Boolean.valueOf(this.f37908w.getCompanionType() != null ? arrayList.add("Companion," + companionType.getAssetBundleName() + ',' + companionType.getAssetBundlePrefabName() + ",being") : arrayList.add("Companion,companion_none_c_0001,companion_none_c_0001_01.prefab,being"));
                    break;
                case 28:
                    valueOf = Boolean.valueOf(this.f37908w.getCompanionTops() != null ? arrayList.add("Companion," + companionTops.getAssetBundleName() + ',' + companionTops.getAssetBundlePrefabName() + ",tops") : arrayList.add("Companion,companion_none_c_0001,companion_none_c_0001_01.prefab,tops"));
                    break;
                case 29:
                    valueOf = Boolean.valueOf(this.f37908w.getCompanionHat() != null ? arrayList.add("Companion," + companionHat.getAssetBundleName() + ',' + companionHat.getAssetBundlePrefabName() + ",cap") : arrayList.add("Companion,companion_none_c_0001,companion_none_c_0001_01.prefab,cap"));
                    break;
                case 30:
                    valueOf = Boolean.valueOf(this.f37908w.getCompanionScarf() != null ? arrayList.add("Companion," + companionScarf.getAssetBundleName() + ',' + companionScarf.getAssetBundlePrefabName() + ",scarf") : arrayList.add("Companion,companion_none_c_0001,companion_none_c_0001_01.prefab,scarf"));
                    break;
                case 31:
                    ClosetBackground background = this.f37908w.getBackground();
                    valueOf = Boolean.valueOf((background != null && (assetBundleString = background.getAssetBundleString()) != null) ? arrayList.add("Accessory," + assetBundleString) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.BACKGROUND.getRawValue()));
                    break;
                case 32:
                    valueOf = Boolean.valueOf(this.f37908w.getBackWing() != null ? arrayList.add("Accessory," + backWing.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.BACK_WINGS.getRawValue()));
                    break;
                case 33:
                    valueOf = Boolean.valueOf(this.f37908w.getEffect() != null ? arrayList.add("Accessory," + effect.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.EFFECT.getRawValue()));
                    break;
                case 34:
                    valueOf = Boolean.valueOf(this.f37908w.getLeftInterior() != null ? arrayList.add("Accessory," + leftInterior.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.LEFT_INTERIOR.getRawValue()));
                    break;
                case 35:
                    valueOf = Boolean.valueOf(this.f37908w.getCenterInterior() != null ? arrayList.add("Accessory," + centerInterior.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.CENTER_INTERIOR.getRawValue()));
                    break;
                case 36:
                    valueOf = Boolean.valueOf(this.f37908w.getRightInterior() != null ? arrayList.add("Accessory," + rightInterior.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.RIGHT_INTERIOR.getRawValue()));
                    break;
                case 37:
                    valueOf = Boolean.valueOf(this.f37908w.getMachine() != null ? arrayList.add("Accessory," + machine.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.MACHINE.getRawValue()));
                    break;
                case 38:
                    valueOf = Boolean.valueOf(this.f37908w.getHatV2() != null ? arrayList.add("Accessory," + hatV2.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.CAP_V2.getRawValue()));
                    break;
                case 39:
                    valueOf = Boolean.valueOf(this.f37908w.getHairOrnament() != null ? arrayList.add("Accessory," + hairOrnament.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.HAIR_ORNAMENT.getRawValue()));
                    break;
                case 40:
                    valueOf = Boolean.valueOf(this.f37908w.getHeadBand() != null ? arrayList.add("Accessory," + headBand.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.HEAD_BAND.getRawValue()));
                    break;
                case 41:
                    valueOf = Boolean.valueOf(this.f37908w.getGlassesV2() != null ? arrayList.add("Accessory," + glassesV2.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.GLASSES_V2.getRawValue()));
                    break;
                case 42:
                    valueOf = Boolean.valueOf(this.f37908w.getMask() != null ? arrayList.add("Accessory," + mask.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.MASK.getRawValue()));
                    break;
                case 43:
                    valueOf = Boolean.valueOf(this.f37908w.getEarring() != null ? arrayList.add("Accessory," + earring.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.EARRING.getRawValue()));
                    break;
                case 44:
                    valueOf = Boolean.valueOf(this.f37908w.getLeftWeapon() != null ? arrayList.add("Accessory," + leftWeapon.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.LEFT_WEAPON.getRawValue()));
                    break;
                case 45:
                    valueOf = Boolean.valueOf(this.f37908w.getRightWeapon() != null ? arrayList.add("Accessory," + rightWeapon.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.RIGHT_WEAPON.getRawValue()));
                    break;
                case 46:
                    valueOf = Boolean.valueOf(this.f37908w.getBothWeapon() != null ? arrayList.add("Accessory," + bothWeapon.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.BOTH_WEAPON.getRawValue()));
                    break;
                case 47:
                    valueOf = Boolean.valueOf(this.f37908w.getKemomimi() != null ? arrayList.add("Accessory," + kemomimi.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.KEMOMIMI.getRawValue()));
                    break;
                case 48:
                    valueOf = Boolean.valueOf(this.f37908w.getNecklace() != null ? arrayList.add("Accessory," + necklace.getAssetBundleString()) : arrayList.add("Accessory,accessory_none_c_0001,none_c_0001_01.prefab," + AccessoryPosition.NECKLACE.getRawValue()));
                    break;
                default:
                    valueOf = wn.v.f59242a;
                    break;
            }
            arrayList3.add(valueOf);
        }
        arrayList2.add(0, xn.a0.g0(arrayList, ":", null, null, 0, null, null, 62, null));
        return xn.a0.g0(arrayList2, ";", null, null, 0, null, null, 62, null);
    }

    public Object clone() {
        Object i10 = new xm.e().i(new xm.e().t(this, c.class), c.class);
        jo.p.g(i10, "Gson().fromJson(modelStr…tAvatarModel::class.java)");
        return i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ClosetAvatar f() {
        return this.f37908w;
    }

    public final void g(String str) {
        this.f37909x = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        jo.p.h(parcel, "dest");
        parcel.writeSerializable(this.f37908w);
        parcel.writeString(this.f37909x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "source"
            jo.p.h(r3, r0)
            java.io.Serializable r0 = r3.readSerializable()
            java.lang.String r1 = "null cannot be cast to non-null type com.dena.mirrativ.mirrativapi.closet.ClosetAvatar"
            jo.p.f(r0, r1)
            com.dena.mirrativ.mirrativapi.closet.ClosetAvatar r0 = (com.dena.mirrativ.mirrativapi.closet.ClosetAvatar) r0
            r2.<init>(r0)
            java.lang.String r3 = r3.readString()
            r2.f37909x = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jf.c.<init>(android.os.Parcel):void");
    }
}
