package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.closet.GameItemType;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class GameEffect implements Serializable {
    private final int accel;
    private final int avatarPartsId;
    private final String description;
    private final String effectCommand;
    @b(GameEffectTypeAdapter.class)
    private final GameEffectType effectType;
    private final float effectValue;
    @b(GameItemType.TypeAdapter.class)
    private final GameItemType gameItemType;
    private final int giftEventId;
    private final String imageUrl;
    private final String partSubTitle;
    private final String partTitle;
    private final int power;
    private final String specDescription;
    private final String specTitle;
    private final int speed;
    private final int weight;

    public GameEffect(int i10, GameItemType gameItemType, int i11, int i12, int i13, int i14, int i15, GameEffectType gameEffectType, float f10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.h(gameItemType, "gameItemType");
        p.h(gameEffectType, "effectType");
        p.h(str, "partTitle");
        p.h(str2, "partSubTitle");
        p.h(str3, "specTitle");
        p.h(str4, "specDescription");
        p.h(str5, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str6, "effectCommand");
        p.h(str7, "imageUrl");
        this.avatarPartsId = i10;
        this.gameItemType = gameItemType;
        this.giftEventId = i11;
        this.power = i12;
        this.speed = i13;
        this.weight = i14;
        this.accel = i15;
        this.effectType = gameEffectType;
        this.effectValue = f10;
        this.partTitle = str;
        this.partSubTitle = str2;
        this.specTitle = str3;
        this.specDescription = str4;
        this.description = str5;
        this.effectCommand = str6;
        this.imageUrl = str7;
    }

    public final int component1() {
        return this.avatarPartsId;
    }

    public final String component10() {
        return this.partTitle;
    }

    public final String component11() {
        return this.partSubTitle;
    }

    public final String component12() {
        return this.specTitle;
    }

    public final String component13() {
        return this.specDescription;
    }

    public final String component14() {
        return this.description;
    }

    public final String component15() {
        return this.effectCommand;
    }

    public final String component16() {
        return this.imageUrl;
    }

    public final GameItemType component2() {
        return this.gameItemType;
    }

    public final int component3() {
        return this.giftEventId;
    }

    public final int component4() {
        return this.power;
    }

    public final int component5() {
        return this.speed;
    }

    public final int component6() {
        return this.weight;
    }

    public final int component7() {
        return this.accel;
    }

    public final GameEffectType component8() {
        return this.effectType;
    }

    public final float component9() {
        return this.effectValue;
    }

    public final GameEffect copy(int i10, GameItemType gameItemType, int i11, int i12, int i13, int i14, int i15, GameEffectType gameEffectType, float f10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.h(gameItemType, "gameItemType");
        p.h(gameEffectType, "effectType");
        p.h(str, "partTitle");
        p.h(str2, "partSubTitle");
        p.h(str3, "specTitle");
        p.h(str4, "specDescription");
        p.h(str5, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str6, "effectCommand");
        p.h(str7, "imageUrl");
        return new GameEffect(i10, gameItemType, i11, i12, i13, i14, i15, gameEffectType, f10, str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GameEffect) {
            GameEffect gameEffect = (GameEffect) obj;
            return this.avatarPartsId == gameEffect.avatarPartsId && this.gameItemType == gameEffect.gameItemType && this.giftEventId == gameEffect.giftEventId && this.power == gameEffect.power && this.speed == gameEffect.speed && this.weight == gameEffect.weight && this.accel == gameEffect.accel && this.effectType == gameEffect.effectType && p.c(Float.valueOf(this.effectValue), Float.valueOf(gameEffect.effectValue)) && p.c(this.partTitle, gameEffect.partTitle) && p.c(this.partSubTitle, gameEffect.partSubTitle) && p.c(this.specTitle, gameEffect.specTitle) && p.c(this.specDescription, gameEffect.specDescription) && p.c(this.description, gameEffect.description) && p.c(this.effectCommand, gameEffect.effectCommand) && p.c(this.imageUrl, gameEffect.imageUrl);
        }
        return false;
    }

    public final int getAccel() {
        return this.accel;
    }

    public final int getAvatarPartsId() {
        return this.avatarPartsId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEffectCommand() {
        return this.effectCommand;
    }

    public final GameEffectType getEffectType() {
        return this.effectType;
    }

    public final float getEffectValue() {
        return this.effectValue;
    }

    public final GameItemType getGameItemType() {
        return this.gameItemType;
    }

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getPartSubTitle() {
        return this.partSubTitle;
    }

    public final String getPartTitle() {
        return this.partTitle;
    }

    public final int getPower() {
        return this.power;
    }

    public final String getSpecDescription() {
        return this.specDescription;
    }

    public final String getSpecTitle() {
        return this.specTitle;
    }

    public final int getSpeed() {
        return this.speed;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Integer.hashCode(this.avatarPartsId) * 31) + this.gameItemType.hashCode()) * 31) + Integer.hashCode(this.giftEventId)) * 31) + Integer.hashCode(this.power)) * 31) + Integer.hashCode(this.speed)) * 31) + Integer.hashCode(this.weight)) * 31) + Integer.hashCode(this.accel)) * 31) + this.effectType.hashCode()) * 31) + Float.hashCode(this.effectValue)) * 31) + this.partTitle.hashCode()) * 31) + this.partSubTitle.hashCode()) * 31) + this.specTitle.hashCode()) * 31) + this.specDescription.hashCode()) * 31) + this.description.hashCode()) * 31) + this.effectCommand.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "GameEffect(avatarPartsId=" + this.avatarPartsId + ", gameItemType=" + this.gameItemType + ", giftEventId=" + this.giftEventId + ", power=" + this.power + ", speed=" + this.speed + ", weight=" + this.weight + ", accel=" + this.accel + ", effectType=" + this.effectType + ", effectValue=" + this.effectValue + ", partTitle=" + this.partTitle + ", partSubTitle=" + this.partSubTitle + ", specTitle=" + this.specTitle + ", specDescription=" + this.specDescription + ", description=" + this.description + ", effectCommand=" + this.effectCommand + ", imageUrl=" + this.imageUrl + ')';
    }
}
