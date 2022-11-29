package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class CampaignShareInfoResponse {
    public static final int $stable = 8;
    private final String campaignId;
    private final String code;
    private final Status status;
    private final String text;
    private final String url;

    public CampaignShareInfoResponse(String str, String str2, String str3, String str4, Status status) {
        p.h(str, "campaignId");
        p.h(str2, "code");
        p.h(str3, "text");
        p.h(str4, "url");
        p.h(status, "status");
        this.campaignId = str;
        this.code = str2;
        this.text = str3;
        this.url = str4;
        this.status = status;
    }

    public static /* synthetic */ CampaignShareInfoResponse copy$default(CampaignShareInfoResponse campaignShareInfoResponse, String str, String str2, String str3, String str4, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = campaignShareInfoResponse.campaignId;
        }
        if ((i10 & 2) != 0) {
            str2 = campaignShareInfoResponse.code;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = campaignShareInfoResponse.text;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = campaignShareInfoResponse.url;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            status = campaignShareInfoResponse.status;
        }
        return campaignShareInfoResponse.copy(str, str5, str6, str7, status);
    }

    public final String component1() {
        return this.campaignId;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.url;
    }

    public final Status component5() {
        return this.status;
    }

    public final CampaignShareInfoResponse copy(String str, String str2, String str3, String str4, Status status) {
        p.h(str, "campaignId");
        p.h(str2, "code");
        p.h(str3, "text");
        p.h(str4, "url");
        p.h(status, "status");
        return new CampaignShareInfoResponse(str, str2, str3, str4, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignShareInfoResponse) {
            CampaignShareInfoResponse campaignShareInfoResponse = (CampaignShareInfoResponse) obj;
            return p.c(this.campaignId, campaignShareInfoResponse.campaignId) && p.c(this.code, campaignShareInfoResponse.code) && p.c(this.text, campaignShareInfoResponse.text) && p.c(this.url, campaignShareInfoResponse.url) && p.c(this.status, campaignShareInfoResponse.status);
        }
        return false;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getCode() {
        return this.code;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((this.campaignId.hashCode() * 31) + this.code.hashCode()) * 31) + this.text.hashCode()) * 31) + this.url.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "CampaignShareInfoResponse(campaignId=" + this.campaignId + ", code=" + this.code + ", text=" + this.text + ", url=" + this.url + ", status=" + this.status + ')';
    }
}
