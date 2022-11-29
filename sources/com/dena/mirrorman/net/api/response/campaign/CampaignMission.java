package com.dena.mirrorman.net.api.response.campaign;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class CampaignMission {
    public static final int $stable = 8;

    /* renamed from: id  reason: collision with root package name */
    private int f26165id;
    private final String inactivationText;
    @b(BooleanTypeAdapter.class)
    private final boolean isInactivation;
    @b(PrizeGrantTypeAdapter.class)
    private final PrizeGrantType prizeGrantType;
    private final List<CampaignPrize> prizes;
    private final CampaignMissionProgressStatus progressStatus;
    @b(CampaignProgressTypeAdapter.class)
    private final CampaignProgressType progressType;
    @b(CampaignMissionReceiveStatusTypeAdapter.class)
    private final CampaignMissionReceiveStatus receiveStatus;
    private final String title;

    public CampaignMission(int i10, String str, CampaignProgressType campaignProgressType, CampaignMissionProgressStatus campaignMissionProgressStatus, PrizeGrantType prizeGrantType, List<CampaignPrize> list, boolean z10, String str2, CampaignMissionReceiveStatus campaignMissionReceiveStatus) {
        p.h(str, "title");
        p.h(campaignProgressType, "progressType");
        p.h(campaignMissionProgressStatus, "progressStatus");
        p.h(prizeGrantType, "prizeGrantType");
        p.h(list, "prizes");
        p.h(str2, "inactivationText");
        p.h(campaignMissionReceiveStatus, "receiveStatus");
        this.f26165id = i10;
        this.title = str;
        this.progressType = campaignProgressType;
        this.progressStatus = campaignMissionProgressStatus;
        this.prizeGrantType = prizeGrantType;
        this.prizes = list;
        this.isInactivation = z10;
        this.inactivationText = str2;
        this.receiveStatus = campaignMissionReceiveStatus;
    }

    public final int component1() {
        return this.f26165id;
    }

    public final String component2() {
        return this.title;
    }

    public final CampaignProgressType component3() {
        return this.progressType;
    }

    public final CampaignMissionProgressStatus component4() {
        return this.progressStatus;
    }

    public final PrizeGrantType component5() {
        return this.prizeGrantType;
    }

    public final List<CampaignPrize> component6() {
        return this.prizes;
    }

    public final boolean component7() {
        return this.isInactivation;
    }

    public final String component8() {
        return this.inactivationText;
    }

    public final CampaignMissionReceiveStatus component9() {
        return this.receiveStatus;
    }

    public final CampaignMission copy(int i10, String str, CampaignProgressType campaignProgressType, CampaignMissionProgressStatus campaignMissionProgressStatus, PrizeGrantType prizeGrantType, List<CampaignPrize> list, boolean z10, String str2, CampaignMissionReceiveStatus campaignMissionReceiveStatus) {
        p.h(str, "title");
        p.h(campaignProgressType, "progressType");
        p.h(campaignMissionProgressStatus, "progressStatus");
        p.h(prizeGrantType, "prizeGrantType");
        p.h(list, "prizes");
        p.h(str2, "inactivationText");
        p.h(campaignMissionReceiveStatus, "receiveStatus");
        return new CampaignMission(i10, str, campaignProgressType, campaignMissionProgressStatus, prizeGrantType, list, z10, str2, campaignMissionReceiveStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignMission) {
            CampaignMission campaignMission = (CampaignMission) obj;
            return this.f26165id == campaignMission.f26165id && p.c(this.title, campaignMission.title) && this.progressType == campaignMission.progressType && p.c(this.progressStatus, campaignMission.progressStatus) && this.prizeGrantType == campaignMission.prizeGrantType && p.c(this.prizes, campaignMission.prizes) && this.isInactivation == campaignMission.isInactivation && p.c(this.inactivationText, campaignMission.inactivationText) && this.receiveStatus == campaignMission.receiveStatus;
        }
        return false;
    }

    public final int getId() {
        return this.f26165id;
    }

    public final String getInactivationText() {
        return this.inactivationText;
    }

    public final PrizeGrantType getPrizeGrantType() {
        return this.prizeGrantType;
    }

    public final List<CampaignPrize> getPrizes() {
        return this.prizes;
    }

    public final CampaignMissionProgressStatus getProgressStatus() {
        return this.progressStatus;
    }

    public final CampaignProgressType getProgressType() {
        return this.progressType;
    }

    public final CampaignMissionReceiveStatus getReceiveStatus() {
        return this.receiveStatus;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f26165id) * 31) + this.title.hashCode()) * 31) + this.progressType.hashCode()) * 31) + this.progressStatus.hashCode()) * 31) + this.prizeGrantType.hashCode()) * 31) + this.prizes.hashCode()) * 31;
        boolean z10 = this.isInactivation;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + this.inactivationText.hashCode()) * 31) + this.receiveStatus.hashCode();
    }

    public final boolean isInactivation() {
        return this.isInactivation;
    }

    public final void setId(int i10) {
        this.f26165id = i10;
    }

    public String toString() {
        return "CampaignMission(id=" + this.f26165id + ", title=" + this.title + ", progressType=" + this.progressType + ", progressStatus=" + this.progressStatus + ", prizeGrantType=" + this.prizeGrantType + ", prizes=" + this.prizes + ", isInactivation=" + this.isInactivation + ", inactivationText=" + this.inactivationText + ", receiveStatus=" + this.receiveStatus + ')';
    }
}
