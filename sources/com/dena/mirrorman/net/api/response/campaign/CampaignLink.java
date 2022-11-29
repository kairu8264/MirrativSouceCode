package com.dena.mirrorman.net.api.response.campaign;

import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class CampaignLink {
    public static final int $stable = 0;
    private final String description;
    private final String label;
    private final String title;
    private final String url;

    public CampaignLink(String str, String str2, String str3, String str4) {
        p.h(str, LogBase.LABEL);
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "url");
        p.h(str4, "title");
        this.label = str;
        this.description = str2;
        this.url = str3;
        this.title = str4;
    }

    public static /* synthetic */ CampaignLink copy$default(CampaignLink campaignLink, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = campaignLink.label;
        }
        if ((i10 & 2) != 0) {
            str2 = campaignLink.description;
        }
        if ((i10 & 4) != 0) {
            str3 = campaignLink.url;
        }
        if ((i10 & 8) != 0) {
            str4 = campaignLink.title;
        }
        return campaignLink.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.title;
    }

    public final CampaignLink copy(String str, String str2, String str3, String str4) {
        p.h(str, LogBase.LABEL);
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "url");
        p.h(str4, "title");
        return new CampaignLink(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignLink) {
            CampaignLink campaignLink = (CampaignLink) obj;
            return p.c(this.label, campaignLink.label) && p.c(this.description, campaignLink.description) && p.c(this.url, campaignLink.url) && p.c(this.title, campaignLink.title);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.label.hashCode() * 31) + this.description.hashCode()) * 31) + this.url.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "CampaignLink(label=" + this.label + ", description=" + this.description + ", url=" + this.url + ", title=" + this.title + ')';
    }
}
