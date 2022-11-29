package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.campaign.SharingAward;
import jo.p;

/* loaded from: classes2.dex */
public final class CampaignShareTweetResponse {
    public static final int $stable = 8;
    private final SharingAward sharingAward;
    private final Status status;

    public CampaignShareTweetResponse(Status status, SharingAward sharingAward) {
        p.h(status, "status");
        this.status = status;
        this.sharingAward = sharingAward;
    }

    public static /* synthetic */ CampaignShareTweetResponse copy$default(CampaignShareTweetResponse campaignShareTweetResponse, Status status, SharingAward sharingAward, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = campaignShareTweetResponse.status;
        }
        if ((i10 & 2) != 0) {
            sharingAward = campaignShareTweetResponse.sharingAward;
        }
        return campaignShareTweetResponse.copy(status, sharingAward);
    }

    public final Status component1() {
        return this.status;
    }

    public final SharingAward component2() {
        return this.sharingAward;
    }

    public final CampaignShareTweetResponse copy(Status status, SharingAward sharingAward) {
        p.h(status, "status");
        return new CampaignShareTweetResponse(status, sharingAward);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignShareTweetResponse) {
            CampaignShareTweetResponse campaignShareTweetResponse = (CampaignShareTweetResponse) obj;
            return p.c(this.status, campaignShareTweetResponse.status) && p.c(this.sharingAward, campaignShareTweetResponse.sharingAward);
        }
        return false;
    }

    public final SharingAward getSharingAward() {
        return this.sharingAward;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        SharingAward sharingAward = this.sharingAward;
        return hashCode + (sharingAward == null ? 0 : sharingAward.hashCode());
    }

    public String toString() {
        return "CampaignShareTweetResponse(status=" + this.status + ", sharingAward=" + this.sharingAward + ')';
    }
}
