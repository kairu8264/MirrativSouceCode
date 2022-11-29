package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class CampaignButtonTapTargetDetail {
    public static final int $stable = 0;
    private final String type;

    public CampaignButtonTapTargetDetail(String str) {
        p.h(str, "type");
        this.type = str;
    }

    public static /* synthetic */ CampaignButtonTapTargetDetail copy$default(CampaignButtonTapTargetDetail campaignButtonTapTargetDetail, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = campaignButtonTapTargetDetail.type;
        }
        return campaignButtonTapTargetDetail.copy(str);
    }

    public final String component1() {
        return this.type;
    }

    public final CampaignButtonTapTargetDetail copy(String str) {
        p.h(str, "type");
        return new CampaignButtonTapTargetDetail(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CampaignButtonTapTargetDetail) && p.c(this.type, ((CampaignButtonTapTargetDetail) obj).type);
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…   .create().toJson(this)");
        return s10;
    }

    public String toString() {
        return "CampaignButtonTapTargetDetail(type=" + this.type + ')';
    }
}
