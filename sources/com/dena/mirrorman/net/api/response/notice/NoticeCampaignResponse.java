package com.dena.mirrorman.net.api.response.notice;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class NoticeCampaignResponse {
    public static final int $stable = 8;
    private final List<CampaignNotice> campaignNotices;
    @b(BooleanTypeAdapter.class)
    private final boolean hasCampaignRewards;
    private final int hasMyappClosedCampaigns;
    private final int hasMyappClosedCampaignsRewards;
    private final long latestCreatedAt;
    private final String nextCursor;
    private final Status status;

    public NoticeCampaignResponse(List<CampaignNotice> list, long j10, String str, Status status, boolean z10, int i10, int i11) {
        p.h(list, "campaignNotices");
        p.h(str, "nextCursor");
        p.h(status, "status");
        this.campaignNotices = list;
        this.latestCreatedAt = j10;
        this.nextCursor = str;
        this.status = status;
        this.hasCampaignRewards = z10;
        this.hasMyappClosedCampaigns = i10;
        this.hasMyappClosedCampaignsRewards = i11;
    }

    public final List<CampaignNotice> component1() {
        return this.campaignNotices;
    }

    public final long component2() {
        return this.latestCreatedAt;
    }

    public final String component3() {
        return this.nextCursor;
    }

    public final Status component4() {
        return this.status;
    }

    public final boolean component5() {
        return this.hasCampaignRewards;
    }

    public final int component6() {
        return this.hasMyappClosedCampaigns;
    }

    public final int component7() {
        return this.hasMyappClosedCampaignsRewards;
    }

    public final NoticeCampaignResponse copy(List<CampaignNotice> list, long j10, String str, Status status, boolean z10, int i10, int i11) {
        p.h(list, "campaignNotices");
        p.h(str, "nextCursor");
        p.h(status, "status");
        return new NoticeCampaignResponse(list, j10, str, status, z10, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoticeCampaignResponse) {
            NoticeCampaignResponse noticeCampaignResponse = (NoticeCampaignResponse) obj;
            return p.c(this.campaignNotices, noticeCampaignResponse.campaignNotices) && this.latestCreatedAt == noticeCampaignResponse.latestCreatedAt && p.c(this.nextCursor, noticeCampaignResponse.nextCursor) && p.c(this.status, noticeCampaignResponse.status) && this.hasCampaignRewards == noticeCampaignResponse.hasCampaignRewards && this.hasMyappClosedCampaigns == noticeCampaignResponse.hasMyappClosedCampaigns && this.hasMyappClosedCampaignsRewards == noticeCampaignResponse.hasMyappClosedCampaignsRewards;
        }
        return false;
    }

    public final List<CampaignNotice> getCampaignNotices() {
        return this.campaignNotices;
    }

    public final boolean getHasCampaignRewards() {
        return this.hasCampaignRewards;
    }

    public final int getHasMyappClosedCampaigns() {
        return this.hasMyappClosedCampaigns;
    }

    public final int getHasMyappClosedCampaignsRewards() {
        return this.hasMyappClosedCampaignsRewards;
    }

    public final long getLatestCreatedAt() {
        return this.latestCreatedAt;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final Status getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.campaignNotices.hashCode() * 31) + Long.hashCode(this.latestCreatedAt)) * 31) + this.nextCursor.hashCode()) * 31) + this.status.hashCode()) * 31;
        boolean z10 = this.hasCampaignRewards;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + Integer.hashCode(this.hasMyappClosedCampaigns)) * 31) + Integer.hashCode(this.hasMyappClosedCampaignsRewards);
    }

    public String toString() {
        return "NoticeCampaignResponse(campaignNotices=" + this.campaignNotices + ", latestCreatedAt=" + this.latestCreatedAt + ", nextCursor=" + this.nextCursor + ", status=" + this.status + ", hasCampaignRewards=" + this.hasCampaignRewards + ", hasMyappClosedCampaigns=" + this.hasMyappClosedCampaigns + ", hasMyappClosedCampaignsRewards=" + this.hasMyappClosedCampaignsRewards + ')';
    }
}
