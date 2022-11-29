package com.dena.mirrativ.mirrativapi.emomo.event.emomorun;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class EmomoRunReward implements Serializable {
    @b(BooleanTypeAdapter.class)
    private final boolean achieved;
    private final String badgeUrl;
    private final String condition;
    private final String description;
    @b(BooleanTypeAdapter.class)
    private final boolean disabled;
    private final GiftItemEffect effect;
    private final String iconUrl;
    private final String imageUrl;
    private final String name;
    private final String partTypeIconUrl;
    private final int rarity;
    private final int threshold;

    public EmomoRunReward(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, GiftItemEffect giftItemEffect, String str7) {
        p.h(str, "name");
        p.h(str2, "condition");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "badgeUrl");
        p.h(str5, "iconUrl");
        p.h(str6, "imageUrl");
        this.name = str;
        this.rarity = i10;
        this.threshold = i11;
        this.condition = str2;
        this.description = str3;
        this.badgeUrl = str4;
        this.iconUrl = str5;
        this.imageUrl = str6;
        this.disabled = z10;
        this.achieved = z11;
        this.effect = giftItemEffect;
        this.partTypeIconUrl = str7;
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.achieved;
    }

    public final GiftItemEffect component11() {
        return this.effect;
    }

    public final String component12() {
        return this.partTypeIconUrl;
    }

    public final int component2() {
        return this.rarity;
    }

    public final int component3() {
        return this.threshold;
    }

    public final String component4() {
        return this.condition;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.badgeUrl;
    }

    public final String component7() {
        return this.iconUrl;
    }

    public final String component8() {
        return this.imageUrl;
    }

    public final boolean component9() {
        return this.disabled;
    }

    public final EmomoRunReward copy(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, GiftItemEffect giftItemEffect, String str7) {
        p.h(str, "name");
        p.h(str2, "condition");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "badgeUrl");
        p.h(str5, "iconUrl");
        p.h(str6, "imageUrl");
        return new EmomoRunReward(str, i10, i11, str2, str3, str4, str5, str6, z10, z11, giftItemEffect, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunReward) {
            EmomoRunReward emomoRunReward = (EmomoRunReward) obj;
            return p.c(this.name, emomoRunReward.name) && this.rarity == emomoRunReward.rarity && this.threshold == emomoRunReward.threshold && p.c(this.condition, emomoRunReward.condition) && p.c(this.description, emomoRunReward.description) && p.c(this.badgeUrl, emomoRunReward.badgeUrl) && p.c(this.iconUrl, emomoRunReward.iconUrl) && p.c(this.imageUrl, emomoRunReward.imageUrl) && this.disabled == emomoRunReward.disabled && this.achieved == emomoRunReward.achieved && p.c(this.effect, emomoRunReward.effect) && p.c(this.partTypeIconUrl, emomoRunReward.partTypeIconUrl);
        }
        return false;
    }

    public final boolean getAchieved() {
        return this.achieved;
    }

    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    public final String getCondition() {
        return this.condition;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final GiftItemEffect getEffect() {
        return this.effect;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartTypeIconUrl() {
        return this.partTypeIconUrl;
    }

    public final int getRarity() {
        return this.rarity;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((this.name.hashCode() * 31) + Integer.hashCode(this.rarity)) * 31) + Integer.hashCode(this.threshold)) * 31) + this.condition.hashCode()) * 31) + this.description.hashCode()) * 31) + this.badgeUrl.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
        boolean z10 = this.disabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.achieved;
        int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        GiftItemEffect giftItemEffect = this.effect;
        int hashCode2 = (i12 + (giftItemEffect == null ? 0 : giftItemEffect.hashCode())) * 31;
        String str = this.partTypeIconUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "EmomoRunReward(name=" + this.name + ", rarity=" + this.rarity + ", threshold=" + this.threshold + ", condition=" + this.condition + ", description=" + this.description + ", badgeUrl=" + this.badgeUrl + ", iconUrl=" + this.iconUrl + ", imageUrl=" + this.imageUrl + ", disabled=" + this.disabled + ", achieved=" + this.achieved + ", effect=" + this.effect + ", partTypeIconUrl=" + this.partTypeIconUrl + ')';
    }
}
