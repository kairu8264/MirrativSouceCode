package com.dena.mirrativ.mirrativapi.emomo.event;

import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffectType;
import java.io.Serializable;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;
import ym.b;

/* loaded from: classes2.dex */
public final class GiftItemEffect implements Serializable {
    private final GiftItemAttribute clothingBonus;
    private final String description;
    private final String effectImageUrl;
    private final List<EmomoQuestItemAttribute> emomoQuestParams;
    private final GiftItemAttribute emomoRun;
    private final List<GiftItemAttribute> machineParams;
    private final String subtitle;
    @b(GiftItemEffectType.TypeAdapter.class)
    private final GiftItemEffectType type;

    public GiftItemEffect(GiftItemEffectType giftItemEffectType, String str, List<GiftItemAttribute> list, GiftItemAttribute giftItemAttribute, GiftItemAttribute giftItemAttribute2, List<EmomoQuestItemAttribute> list2, String str2, String str3) {
        p.h(giftItemEffectType, "type");
        p.h(str, "effectImageUrl");
        p.h(list, "machineParams");
        p.h(list2, "emomoQuestParams");
        this.type = giftItemEffectType;
        this.effectImageUrl = str;
        this.machineParams = list;
        this.clothingBonus = giftItemAttribute;
        this.emomoRun = giftItemAttribute2;
        this.emomoQuestParams = list2;
        this.subtitle = str2;
        this.description = str3;
    }

    public final GiftItemEffectType component1() {
        return this.type;
    }

    public final String component2() {
        return this.effectImageUrl;
    }

    public final List<GiftItemAttribute> component3() {
        return this.machineParams;
    }

    public final GiftItemAttribute component4() {
        return this.clothingBonus;
    }

    public final GiftItemAttribute component5() {
        return this.emomoRun;
    }

    public final List<EmomoQuestItemAttribute> component6() {
        return this.emomoQuestParams;
    }

    public final String component7() {
        return this.subtitle;
    }

    public final String component8() {
        return this.description;
    }

    public final GiftItemEffect copy(GiftItemEffectType giftItemEffectType, String str, List<GiftItemAttribute> list, GiftItemAttribute giftItemAttribute, GiftItemAttribute giftItemAttribute2, List<EmomoQuestItemAttribute> list2, String str2, String str3) {
        p.h(giftItemEffectType, "type");
        p.h(str, "effectImageUrl");
        p.h(list, "machineParams");
        p.h(list2, "emomoQuestParams");
        return new GiftItemEffect(giftItemEffectType, str, list, giftItemAttribute, giftItemAttribute2, list2, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftItemEffect) {
            GiftItemEffect giftItemEffect = (GiftItemEffect) obj;
            return this.type == giftItemEffect.type && p.c(this.effectImageUrl, giftItemEffect.effectImageUrl) && p.c(this.machineParams, giftItemEffect.machineParams) && p.c(this.clothingBonus, giftItemEffect.clothingBonus) && p.c(this.emomoRun, giftItemEffect.emomoRun) && p.c(this.emomoQuestParams, giftItemEffect.emomoQuestParams) && p.c(this.subtitle, giftItemEffect.subtitle) && p.c(this.description, giftItemEffect.description);
        }
        return false;
    }

    public final GiftItemAttribute getClothingBonus() {
        return this.clothingBonus;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEffectImageUrl() {
        return this.effectImageUrl;
    }

    public final List<EmomoQuestItemAttribute> getEmomoQuestParams() {
        return this.emomoQuestParams;
    }

    public final GiftItemAttribute getEmomoRun() {
        return this.emomoRun;
    }

    public final List<GiftItemAttribute> getMachineParams() {
        return this.machineParams;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final GiftItemEffectType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.type.hashCode() * 31) + this.effectImageUrl.hashCode()) * 31) + this.machineParams.hashCode()) * 31;
        GiftItemAttribute giftItemAttribute = this.clothingBonus;
        int hashCode2 = (hashCode + (giftItemAttribute == null ? 0 : giftItemAttribute.hashCode())) * 31;
        GiftItemAttribute giftItemAttribute2 = this.emomoRun;
        int hashCode3 = (((hashCode2 + (giftItemAttribute2 == null ? 0 : giftItemAttribute2.hashCode())) * 31) + this.emomoQuestParams.hashCode()) * 31;
        String str = this.subtitle;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GiftItemEffect(type=" + this.type + ", effectImageUrl=" + this.effectImageUrl + ", machineParams=" + this.machineParams + ", clothingBonus=" + this.clothingBonus + ", emomoRun=" + this.emomoRun + ", emomoQuestParams=" + this.emomoQuestParams + ", subtitle=" + this.subtitle + ", description=" + this.description + ')';
    }

    public /* synthetic */ GiftItemEffect(GiftItemEffectType giftItemEffectType, String str, List list, GiftItemAttribute giftItemAttribute, GiftItemAttribute giftItemAttribute2, List list2, String str2, String str3, int i10, h hVar) {
        this(giftItemEffectType, str, (i10 & 4) != 0 ? s.k() : list, giftItemAttribute, giftItemAttribute2, (i10 & 32) != 0 ? s.k() : list2, str2, str3);
    }
}
