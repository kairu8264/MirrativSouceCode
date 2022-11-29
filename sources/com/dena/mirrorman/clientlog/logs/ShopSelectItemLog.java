package com.dena.mirrorman.clientlog.logs;

import com.google.android.exoplayer2.C;
import jo.h;
import jo.p;
import ke.a;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class ShopSelectItemLog {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String backWingsId;
    private final String backgroundsId;
    private final String beardsId;
    private final String bothWeaponId;
    private final String bottomId;
    private final String centerInteriorsId;
    private final String cheeksId;
    private final String clothesId;
    private final String earringId;
    private final String effectsId;
    private final String eyebrowsId;
    private final String eyesId;
    private final String eyeshadowsId;
    private final String facePaintsId;
    private final String glassesId;
    private final String glassesV2Id;
    private final String hairOrnamentId;
    private final String hairsId;
    private final String hatV2Id;
    private final String hatsId;
    private final String headBandId;
    private final String headsId;
    private final String kemomimiId;
    private final String leftInteriorsId;
    private final String leftWeaponId;
    private final String lipsId;
    private final String machineId;
    private final String maskId;
    private final String motion1Id;
    private final String motion2Id;
    private final String motion3Id;
    private final String motion4Id;
    private final String mouthsId;
    private final String necklaceId;
    private final String nosesId;
    private final String onepiecesId;
    private final String personasId;
    private final String petsId;
    private final String proportionsId;
    private final String rightInteriorsId;
    private final String rightWeaponId;
    private final String scarfsId;
    private final String shoesId;
    private final String socksId;
    private final String topId;
    private final String weaponsId;
    private final String wingsId;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ShopSelectItemLog build(a aVar) {
            p.h(aVar, "equipAvatars");
            return aVar.a();
        }
    }

    public ShopSelectItemLog() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 32767, null);
    }

    public ShopSelectItemLog(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47) {
        this.personasId = str;
        this.proportionsId = str2;
        this.headsId = str3;
        this.hairsId = str4;
        this.eyebrowsId = str5;
        this.eyesId = str6;
        this.eyeshadowsId = str7;
        this.cheeksId = str8;
        this.nosesId = str9;
        this.beardsId = str10;
        this.mouthsId = str11;
        this.lipsId = str12;
        this.facePaintsId = str13;
        this.clothesId = str14;
        this.onepiecesId = str15;
        this.topId = str16;
        this.bottomId = str17;
        this.socksId = str18;
        this.shoesId = str19;
        this.hatsId = str20;
        this.glassesId = str21;
        this.scarfsId = str22;
        this.petsId = str23;
        this.weaponsId = str24;
        this.wingsId = str25;
        this.backgroundsId = str26;
        this.motion1Id = str27;
        this.motion2Id = str28;
        this.motion3Id = str29;
        this.motion4Id = str30;
        this.backWingsId = str31;
        this.effectsId = str32;
        this.leftInteriorsId = str33;
        this.centerInteriorsId = str34;
        this.rightInteriorsId = str35;
        this.machineId = str36;
        this.hatV2Id = str37;
        this.hairOrnamentId = str38;
        this.headBandId = str39;
        this.glassesV2Id = str40;
        this.maskId = str41;
        this.earringId = str42;
        this.leftWeaponId = str43;
        this.rightWeaponId = str44;
        this.bothWeaponId = str45;
        this.kemomimiId = str46;
        this.necklaceId = str47;
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "gson.toJson(this)");
        return s10;
    }

    public /* synthetic */ ShopSelectItemLog(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, int i10, int i11, h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, (i10 & 2048) != 0 ? null : str12, (i10 & 4096) != 0 ? null : str13, (i10 & 8192) != 0 ? null : str14, (i10 & 16384) != 0 ? null : str15, (i10 & 32768) != 0 ? null : str16, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str17, (i10 & 131072) != 0 ? null : str18, (i10 & 262144) != 0 ? null : str19, (i10 & 524288) != 0 ? null : str20, (i10 & 1048576) != 0 ? null : str21, (i10 & 2097152) != 0 ? null : str22, (i10 & 4194304) != 0 ? null : str23, (i10 & 8388608) != 0 ? null : str24, (i10 & 16777216) != 0 ? null : str25, (i10 & 33554432) != 0 ? null : str26, (i10 & 67108864) != 0 ? null : str27, (i10 & 134217728) != 0 ? null : str28, (i10 & 268435456) != 0 ? null : str29, (i10 & 536870912) != 0 ? null : str30, (i10 & 1073741824) != 0 ? null : str31, (i10 & Integer.MIN_VALUE) != 0 ? null : str32, (i11 & 1) != 0 ? null : str33, (i11 & 2) != 0 ? null : str34, (i11 & 4) != 0 ? null : str35, (i11 & 8) != 0 ? null : str36, (i11 & 16) != 0 ? null : str37, (i11 & 32) != 0 ? null : str38, (i11 & 64) != 0 ? null : str39, (i11 & 128) != 0 ? null : str40, (i11 & 256) != 0 ? null : str41, (i11 & 512) != 0 ? null : str42, (i11 & 1024) != 0 ? null : str43, (i11 & 2048) != 0 ? null : str44, (i11 & 4096) != 0 ? null : str45, (i11 & 8192) != 0 ? null : str46, (i11 & 16384) != 0 ? null : str47);
    }
}
