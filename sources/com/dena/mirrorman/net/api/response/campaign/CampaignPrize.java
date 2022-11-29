package com.dena.mirrorman.net.api.response.campaign;

import jo.p;

/* loaded from: classes2.dex */
public final class CampaignPrize {
    public static final int $stable = 0;
    private final String prizeImageUrl;
    private final String prizeName;
    private final String prizeNum;

    public CampaignPrize(String str, String str2, String str3) {
        p.h(str, "prizeImageUrl");
        p.h(str2, "prizeName");
        p.h(str3, "prizeNum");
        this.prizeImageUrl = str;
        this.prizeName = str2;
        this.prizeNum = str3;
    }

    public static /* synthetic */ CampaignPrize copy$default(CampaignPrize campaignPrize, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = campaignPrize.prizeImageUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = campaignPrize.prizeName;
        }
        if ((i10 & 4) != 0) {
            str3 = campaignPrize.prizeNum;
        }
        return campaignPrize.copy(str, str2, str3);
    }

    public final String component1() {
        return this.prizeImageUrl;
    }

    public final String component2() {
        return this.prizeName;
    }

    public final String component3() {
        return this.prizeNum;
    }

    public final CampaignPrize copy(String str, String str2, String str3) {
        p.h(str, "prizeImageUrl");
        p.h(str2, "prizeName");
        p.h(str3, "prizeNum");
        return new CampaignPrize(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignPrize) {
            CampaignPrize campaignPrize = (CampaignPrize) obj;
            return p.c(this.prizeImageUrl, campaignPrize.prizeImageUrl) && p.c(this.prizeName, campaignPrize.prizeName) && p.c(this.prizeNum, campaignPrize.prizeNum);
        }
        return false;
    }

    public final String getPrizeImageUrl() {
        return this.prizeImageUrl;
    }

    public final String getPrizeName() {
        return this.prizeName;
    }

    public final String getPrizeNum() {
        return this.prizeNum;
    }

    public int hashCode() {
        return (((this.prizeImageUrl.hashCode() * 31) + this.prizeName.hashCode()) * 31) + this.prizeNum.hashCode();
    }

    public String toString() {
        return "CampaignPrize(prizeImageUrl=" + this.prizeImageUrl + ", prizeName=" + this.prizeName + ", prizeNum=" + this.prizeNum + ')';
    }
}
