package com.dena.mirrorman.net.api.response.campaign;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class CampaignMissionReceivePrizesResponse implements Serializable {
    public static final int $stable = 8;
    private final String description;
    private final String imageUrl;
    private final Status status;
    private final String title;

    public CampaignMissionReceivePrizesResponse(String str, String str2, String str3, Status status) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "imageUrl");
        p.h(status, "status");
        this.title = str;
        this.description = str2;
        this.imageUrl = str3;
        this.status = status;
    }

    public static /* synthetic */ CampaignMissionReceivePrizesResponse copy$default(CampaignMissionReceivePrizesResponse campaignMissionReceivePrizesResponse, String str, String str2, String str3, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = campaignMissionReceivePrizesResponse.title;
        }
        if ((i10 & 2) != 0) {
            str2 = campaignMissionReceivePrizesResponse.description;
        }
        if ((i10 & 4) != 0) {
            str3 = campaignMissionReceivePrizesResponse.imageUrl;
        }
        if ((i10 & 8) != 0) {
            status = campaignMissionReceivePrizesResponse.status;
        }
        return campaignMissionReceivePrizesResponse.copy(str, str2, str3, status);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final Status component4() {
        return this.status;
    }

    public final CampaignMissionReceivePrizesResponse copy(String str, String str2, String str3, Status status) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "imageUrl");
        p.h(status, "status");
        return new CampaignMissionReceivePrizesResponse(str, str2, str3, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignMissionReceivePrizesResponse) {
            CampaignMissionReceivePrizesResponse campaignMissionReceivePrizesResponse = (CampaignMissionReceivePrizesResponse) obj;
            return p.c(this.title, campaignMissionReceivePrizesResponse.title) && p.c(this.description, campaignMissionReceivePrizesResponse.description) && p.c(this.imageUrl, campaignMissionReceivePrizesResponse.imageUrl) && p.c(this.status, campaignMissionReceivePrizesResponse.status);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "CampaignMissionReceivePrizesResponse(title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", status=" + this.status + ')';
    }
}
