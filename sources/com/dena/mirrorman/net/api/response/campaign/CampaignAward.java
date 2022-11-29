package com.dena.mirrorman.net.api.response.campaign;

import java.util.Collection;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class CampaignAward {
    public static final int $stable = 8;
    private final List<CampaignMission> missions;
    private final List<String> notes;
    private final String prizeDeliveryDate;

    public CampaignAward(List<String> list, String str, List<CampaignMission> list2) {
        p.h(list, "notes");
        p.h(str, "prizeDeliveryDate");
        p.h(list2, "missions");
        this.notes = list;
        this.prizeDeliveryDate = str;
        this.missions = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignAward copy$default(CampaignAward campaignAward, List list, String str, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = campaignAward.notes;
        }
        if ((i10 & 2) != 0) {
            str = campaignAward.prizeDeliveryDate;
        }
        if ((i10 & 4) != 0) {
            list2 = campaignAward.missions;
        }
        return campaignAward.copy(list, str, list2);
    }

    public final List<String> component1() {
        return this.notes;
    }

    public final String component2() {
        return this.prizeDeliveryDate;
    }

    public final List<CampaignMission> component3() {
        return this.missions;
    }

    public final CampaignAward copy(List<String> list, String str, List<CampaignMission> list2) {
        p.h(list, "notes");
        p.h(str, "prizeDeliveryDate");
        p.h(list2, "missions");
        return new CampaignAward(list, str, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignAward) {
            CampaignAward campaignAward = (CampaignAward) obj;
            return p.c(this.notes, campaignAward.notes) && p.c(this.prizeDeliveryDate, campaignAward.prizeDeliveryDate) && p.c(this.missions, campaignAward.missions);
        }
        return false;
    }

    public final List<CampaignMission> getMissions() {
        return this.missions;
    }

    public final List<String> getNotes() {
        return this.notes;
    }

    public final String getPrizeDeliveryDate() {
        return this.prizeDeliveryDate;
    }

    public int hashCode() {
        return (((this.notes.hashCode() * 31) + this.prizeDeliveryDate.hashCode()) * 31) + this.missions.hashCode();
    }

    public final boolean isAllMissionReceiveHidden() {
        boolean z10;
        List<CampaignMission> list = this.missions;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (CampaignMission campaignMission : list) {
                if (campaignMission.getReceiveStatus() == CampaignMissionReceiveStatus.HIDDEN) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (!z10) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        return "CampaignAward(notes=" + this.notes + ", prizeDeliveryDate=" + this.prizeDeliveryDate + ", missions=" + this.missions + ')';
    }
}
