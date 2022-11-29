package com.dena.mirrativ.mirrativapi.emomo.event;

import com.dena.mirrativ.mirrativapi.emomo.event.emomoquest.EmomoQuestGameEffectType;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class EmomoQuestItemAttribute implements Serializable {
    @b(EmomoQuestGameEffectType.TypeAdapter.class)
    private final EmomoQuestGameEffectType effectType;
    private final boolean isSpecial;
    private final String specialValue;
    private final String title;
    private final String value;

    public EmomoQuestItemAttribute(String str, String str2, EmomoQuestGameEffectType emomoQuestGameEffectType, boolean z10, String str3) {
        p.h(str, "title");
        p.h(str2, "value");
        p.h(emomoQuestGameEffectType, "effectType");
        p.h(str3, "specialValue");
        this.title = str;
        this.value = str2;
        this.effectType = emomoQuestGameEffectType;
        this.isSpecial = z10;
        this.specialValue = str3;
    }

    public static /* synthetic */ EmomoQuestItemAttribute copy$default(EmomoQuestItemAttribute emomoQuestItemAttribute, String str, String str2, EmomoQuestGameEffectType emomoQuestGameEffectType, boolean z10, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = emomoQuestItemAttribute.title;
        }
        if ((i10 & 2) != 0) {
            str2 = emomoQuestItemAttribute.value;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            emomoQuestGameEffectType = emomoQuestItemAttribute.effectType;
        }
        EmomoQuestGameEffectType emomoQuestGameEffectType2 = emomoQuestGameEffectType;
        if ((i10 & 8) != 0) {
            z10 = emomoQuestItemAttribute.isSpecial;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            str3 = emomoQuestItemAttribute.specialValue;
        }
        return emomoQuestItemAttribute.copy(str, str4, emomoQuestGameEffectType2, z11, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.value;
    }

    public final EmomoQuestGameEffectType component3() {
        return this.effectType;
    }

    public final boolean component4() {
        return this.isSpecial;
    }

    public final String component5() {
        return this.specialValue;
    }

    public final EmomoQuestItemAttribute copy(String str, String str2, EmomoQuestGameEffectType emomoQuestGameEffectType, boolean z10, String str3) {
        p.h(str, "title");
        p.h(str2, "value");
        p.h(emomoQuestGameEffectType, "effectType");
        p.h(str3, "specialValue");
        return new EmomoQuestItemAttribute(str, str2, emomoQuestGameEffectType, z10, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestItemAttribute) {
            EmomoQuestItemAttribute emomoQuestItemAttribute = (EmomoQuestItemAttribute) obj;
            return p.c(this.title, emomoQuestItemAttribute.title) && p.c(this.value, emomoQuestItemAttribute.value) && this.effectType == emomoQuestItemAttribute.effectType && this.isSpecial == emomoQuestItemAttribute.isSpecial && p.c(this.specialValue, emomoQuestItemAttribute.specialValue);
        }
        return false;
    }

    public final EmomoQuestGameEffectType getEffectType() {
        return this.effectType;
    }

    public final String getSpecialValue() {
        return this.specialValue;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.title.hashCode() * 31) + this.value.hashCode()) * 31) + this.effectType.hashCode()) * 31;
        boolean z10 = this.isSpecial;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.specialValue.hashCode();
    }

    public final boolean isSpecial() {
        return this.isSpecial;
    }

    public String toString() {
        return "EmomoQuestItemAttribute(title=" + this.title + ", value=" + this.value + ", effectType=" + this.effectType + ", isSpecial=" + this.isSpecial + ", specialValue=" + this.specialValue + ')';
    }
}
