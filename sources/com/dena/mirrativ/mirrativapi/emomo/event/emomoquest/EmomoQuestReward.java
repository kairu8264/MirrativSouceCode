package com.dena.mirrativ.mirrativapi.emomo.event.emomoquest;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.emomo.event.GiftItemEffect;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class EmomoQuestReward {
    @b(BooleanTypeAdapter.class)
    private final boolean achieved;
    private final String badgeUrl;
    private final String condition;
    private final String description;
    private final GiftItemEffect effect;
    private final String iconUrl;
    private final String imageUrl;
    private final String name;
    private final String partTypeIconUrl;
    private final int rarity;
    private final int threshold;

    public EmomoQuestReward(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, GiftItemEffect giftItemEffect) {
        p.h(str, "name");
        p.h(str2, "condition");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "badgeUrl");
        p.h(str5, "iconUrl");
        p.h(str6, "imageUrl");
        p.h(str7, "partTypeIconUrl");
        this.name = str;
        this.rarity = i10;
        this.threshold = i11;
        this.condition = str2;
        this.description = str3;
        this.badgeUrl = str4;
        this.iconUrl = str5;
        this.imageUrl = str6;
        this.partTypeIconUrl = str7;
        this.achieved = z10;
        this.effect = giftItemEffect;
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

    public final String component9() {
        return this.partTypeIconUrl;
    }

    public final EmomoQuestReward copy(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, GiftItemEffect giftItemEffect) {
        p.h(str, "name");
        p.h(str2, "condition");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "badgeUrl");
        p.h(str5, "iconUrl");
        p.h(str6, "imageUrl");
        p.h(str7, "partTypeIconUrl");
        return new EmomoQuestReward(str, i10, i11, str2, str3, str4, str5, str6, str7, z10, giftItemEffect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoQuestReward) {
            EmomoQuestReward emomoQuestReward = (EmomoQuestReward) obj;
            return p.c(this.name, emomoQuestReward.name) && this.rarity == emomoQuestReward.rarity && this.threshold == emomoQuestReward.threshold && p.c(this.condition, emomoQuestReward.condition) && p.c(this.description, emomoQuestReward.description) && p.c(this.badgeUrl, emomoQuestReward.badgeUrl) && p.c(this.iconUrl, emomoQuestReward.iconUrl) && p.c(this.imageUrl, emomoQuestReward.imageUrl) && p.c(this.partTypeIconUrl, emomoQuestReward.partTypeIconUrl) && this.achieved == emomoQuestReward.achieved && p.c(this.effect, emomoQuestReward.effect);
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
        int hashCode = ((((((((((((((((this.name.hashCode() * 31) + Integer.hashCode(this.rarity)) * 31) + Integer.hashCode(this.threshold)) * 31) + this.condition.hashCode()) * 31) + this.description.hashCode()) * 31) + this.badgeUrl.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.partTypeIconUrl.hashCode()) * 31;
        boolean z10 = this.achieved;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        GiftItemEffect giftItemEffect = this.effect;
        return i11 + (giftItemEffect == null ? 0 : giftItemEffect.hashCode());
    }

    public String toString() {
        return "EmomoQuestReward(name=" + this.name + ", rarity=" + this.rarity + ", threshold=" + this.threshold + ", condition=" + this.condition + ", description=" + this.description + ", badgeUrl=" + this.badgeUrl + ", iconUrl=" + this.iconUrl + ", imageUrl=" + this.imageUrl + ", partTypeIconUrl=" + this.partTypeIconUrl + ", achieved=" + this.achieved + ", effect=" + this.effect + ')';
    }
}
