package com.dena.mirrorman.clientlog.logs.detail;

import java.util.List;
import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class NoticeCampaignPageVisibleTargetDetail {
    public static final int $stable = 8;
    private final List<NoticeCampaignPageTargetDetail> catalog;
    private final NoticeCampaignPageMyappClosedCampaign myappClosedCampaigns;

    public NoticeCampaignPageVisibleTargetDetail(List<NoticeCampaignPageTargetDetail> list, NoticeCampaignPageMyappClosedCampaign noticeCampaignPageMyappClosedCampaign) {
        p.h(list, "catalog");
        this.catalog = list;
        this.myappClosedCampaigns = noticeCampaignPageMyappClosedCampaign;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeCampaignPageVisibleTargetDetail copy$default(NoticeCampaignPageVisibleTargetDetail noticeCampaignPageVisibleTargetDetail, List list, NoticeCampaignPageMyappClosedCampaign noticeCampaignPageMyappClosedCampaign, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = noticeCampaignPageVisibleTargetDetail.catalog;
        }
        if ((i10 & 2) != 0) {
            noticeCampaignPageMyappClosedCampaign = noticeCampaignPageVisibleTargetDetail.myappClosedCampaigns;
        }
        return noticeCampaignPageVisibleTargetDetail.copy(list, noticeCampaignPageMyappClosedCampaign);
    }

    public final List<NoticeCampaignPageTargetDetail> component1() {
        return this.catalog;
    }

    public final NoticeCampaignPageMyappClosedCampaign component2() {
        return this.myappClosedCampaigns;
    }

    public final NoticeCampaignPageVisibleTargetDetail copy(List<NoticeCampaignPageTargetDetail> list, NoticeCampaignPageMyappClosedCampaign noticeCampaignPageMyappClosedCampaign) {
        p.h(list, "catalog");
        return new NoticeCampaignPageVisibleTargetDetail(list, noticeCampaignPageMyappClosedCampaign);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoticeCampaignPageVisibleTargetDetail) {
            NoticeCampaignPageVisibleTargetDetail noticeCampaignPageVisibleTargetDetail = (NoticeCampaignPageVisibleTargetDetail) obj;
            return p.c(this.catalog, noticeCampaignPageVisibleTargetDetail.catalog) && p.c(this.myappClosedCampaigns, noticeCampaignPageVisibleTargetDetail.myappClosedCampaigns);
        }
        return false;
    }

    public final List<NoticeCampaignPageTargetDetail> getCatalog() {
        return this.catalog;
    }

    public final NoticeCampaignPageMyappClosedCampaign getMyappClosedCampaigns() {
        return this.myappClosedCampaigns;
    }

    public int hashCode() {
        int hashCode = this.catalog.hashCode() * 31;
        NoticeCampaignPageMyappClosedCampaign noticeCampaignPageMyappClosedCampaign = this.myappClosedCampaigns;
        return hashCode + (noticeCampaignPageMyappClosedCampaign == null ? 0 : noticeCampaignPageMyappClosedCampaign.hashCode());
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…e()\n        .toJson(this)");
        return s10;
    }

    public String toString() {
        return "NoticeCampaignPageVisibleTargetDetail(catalog=" + this.catalog + ", myappClosedCampaigns=" + this.myappClosedCampaigns + ')';
    }
}
