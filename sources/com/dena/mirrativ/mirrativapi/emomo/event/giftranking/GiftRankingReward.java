package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class GiftRankingReward implements Serializable {
    @b(BooleanTypeAdapter.class)
    private final boolean achieved;
    private final String badgeUrl;
    private final String condition;
    private final String description;
    @b(BooleanTypeAdapter.class)
    private final boolean disabled;
    private final String iconUrl;
    private final String imageUrl;
    private final String name;
    private final String partTypeIconUrl;
    private final int rarity;

    public GiftRankingReward(String str, int i10, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, String str7) {
        p.h(str, "name");
        p.h(str2, "condition");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "badgeUrl");
        p.h(str5, "iconUrl");
        p.h(str6, "imageUrl");
        this.name = str;
        this.rarity = i10;
        this.condition = str2;
        this.description = str3;
        this.badgeUrl = str4;
        this.iconUrl = str5;
        this.imageUrl = str6;
        this.disabled = z10;
        this.achieved = z11;
        this.partTypeIconUrl = str7;
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.partTypeIconUrl;
    }

    public final int component2() {
        return this.rarity;
    }

    public final String component3() {
        return this.condition;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.badgeUrl;
    }

    public final String component6() {
        return this.iconUrl;
    }

    public final String component7() {
        return this.imageUrl;
    }

    public final boolean component8() {
        return this.disabled;
    }

    public final boolean component9() {
        return this.achieved;
    }

    public final GiftRankingReward copy(String str, int i10, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, String str7) {
        p.h(str, "name");
        p.h(str2, "condition");
        p.h(str3, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str4, "badgeUrl");
        p.h(str5, "iconUrl");
        p.h(str6, "imageUrl");
        return new GiftRankingReward(str, i10, str2, str3, str4, str5, str6, z10, z11, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingReward) {
            GiftRankingReward giftRankingReward = (GiftRankingReward) obj;
            return p.c(this.name, giftRankingReward.name) && this.rarity == giftRankingReward.rarity && p.c(this.condition, giftRankingReward.condition) && p.c(this.description, giftRankingReward.description) && p.c(this.badgeUrl, giftRankingReward.badgeUrl) && p.c(this.iconUrl, giftRankingReward.iconUrl) && p.c(this.imageUrl, giftRankingReward.imageUrl) && this.disabled == giftRankingReward.disabled && this.achieved == giftRankingReward.achieved && p.c(this.partTypeIconUrl, giftRankingReward.partTypeIconUrl);
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((this.name.hashCode() * 31) + Integer.hashCode(this.rarity)) * 31) + this.condition.hashCode()) * 31) + this.description.hashCode()) * 31) + this.badgeUrl.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
        boolean z10 = this.disabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.achieved;
        int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
        String str = this.partTypeIconUrl;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GiftRankingReward(name=" + this.name + ", rarity=" + this.rarity + ", condition=" + this.condition + ", description=" + this.description + ", badgeUrl=" + this.badgeUrl + ", iconUrl=" + this.iconUrl + ", imageUrl=" + this.imageUrl + ", disabled=" + this.disabled + ", achieved=" + this.achieved + ", partTypeIconUrl=" + this.partTypeIconUrl + ')';
    }
}
