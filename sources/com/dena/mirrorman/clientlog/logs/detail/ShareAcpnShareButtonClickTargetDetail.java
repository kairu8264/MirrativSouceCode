package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class ShareAcpnShareButtonClickTargetDetail {
    public static final int $stable = 0;
    private final String campaignId;

    public ShareAcpnShareButtonClickTargetDetail(String str) {
        p.h(str, "campaignId");
        this.campaignId = str;
    }

    public static /* synthetic */ ShareAcpnShareButtonClickTargetDetail copy$default(ShareAcpnShareButtonClickTargetDetail shareAcpnShareButtonClickTargetDetail, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shareAcpnShareButtonClickTargetDetail.campaignId;
        }
        return shareAcpnShareButtonClickTargetDetail.copy(str);
    }

    public final String component1() {
        return this.campaignId;
    }

    public final ShareAcpnShareButtonClickTargetDetail copy(String str) {
        p.h(str, "campaignId");
        return new ShareAcpnShareButtonClickTargetDetail(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShareAcpnShareButtonClickTargetDetail) && p.c(this.campaignId, ((ShareAcpnShareButtonClickTargetDetail) obj).campaignId);
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public int hashCode() {
        return this.campaignId.hashCode();
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…   .create().toJson(this)");
        return s10;
    }

    public String toString() {
        return "ShareAcpnShareButtonClickTargetDetail(campaignId=" + this.campaignId + ')';
    }
}
