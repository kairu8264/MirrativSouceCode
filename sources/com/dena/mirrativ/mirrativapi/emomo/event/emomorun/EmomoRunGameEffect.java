package com.dena.mirrativ.mirrativapi.emomo.event.emomorun;

import com.dena.mirrativ.mirrativapi.closet.GameEffectType;
import com.dena.mirrativ.mirrativapi.closet.GameEffectTypeAdapter;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class EmomoRunGameEffect implements Serializable {
    private final String description;
    private final String effectCommand;
    @b(GameEffectTypeAdapter.class)
    private final GameEffectType effectType;
    private final String imageUrl;
    private final float value;

    public EmomoRunGameEffect(GameEffectType gameEffectType, String str, float f10, String str2, String str3) {
        p.h(gameEffectType, "effectType");
        p.h(str, "effectCommand");
        p.h(str2, "imageUrl");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        this.effectType = gameEffectType;
        this.effectCommand = str;
        this.value = f10;
        this.imageUrl = str2;
        this.description = str3;
    }

    public static /* synthetic */ EmomoRunGameEffect copy$default(EmomoRunGameEffect emomoRunGameEffect, GameEffectType gameEffectType, String str, float f10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gameEffectType = emomoRunGameEffect.effectType;
        }
        if ((i10 & 2) != 0) {
            str = emomoRunGameEffect.effectCommand;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            f10 = emomoRunGameEffect.value;
        }
        float f11 = f10;
        if ((i10 & 8) != 0) {
            str2 = emomoRunGameEffect.imageUrl;
        }
        String str5 = str2;
        if ((i10 & 16) != 0) {
            str3 = emomoRunGameEffect.description;
        }
        return emomoRunGameEffect.copy(gameEffectType, str4, f11, str5, str3);
    }

    public final GameEffectType component1() {
        return this.effectType;
    }

    public final String component2() {
        return this.effectCommand;
    }

    public final float component3() {
        return this.value;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.description;
    }

    public final EmomoRunGameEffect copy(GameEffectType gameEffectType, String str, float f10, String str2, String str3) {
        p.h(gameEffectType, "effectType");
        p.h(str, "effectCommand");
        p.h(str2, "imageUrl");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        return new EmomoRunGameEffect(gameEffectType, str, f10, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunGameEffect) {
            EmomoRunGameEffect emomoRunGameEffect = (EmomoRunGameEffect) obj;
            return this.effectType == emomoRunGameEffect.effectType && p.c(this.effectCommand, emomoRunGameEffect.effectCommand) && p.c(Float.valueOf(this.value), Float.valueOf(emomoRunGameEffect.value)) && p.c(this.imageUrl, emomoRunGameEffect.imageUrl) && p.c(this.description, emomoRunGameEffect.description);
        }
        return false;
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

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((this.effectType.hashCode() * 31) + this.effectCommand.hashCode()) * 31) + Float.hashCode(this.value)) * 31) + this.imageUrl.hashCode()) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "EmomoRunGameEffect(effectType=" + this.effectType + ", effectCommand=" + this.effectCommand + ", value=" + this.value + ", imageUrl=" + this.imageUrl + ", description=" + this.description + ')';
    }
}
