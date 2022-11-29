package com.dena.mirrorman.net.api.response.campaign;

import com.dena.mirrorman.net.api.Referer;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class SharingAward {
    public static final int $stable = 8;
    private final CampaignMission mission;
    private final List<String> notes;
    private final String prizeDeliveryDate;

    public SharingAward(List<String> list, String str, CampaignMission campaignMission) {
        p.h(list, "notes");
        p.h(str, "prizeDeliveryDate");
        p.h(campaignMission, Referer.MISSION);
        this.notes = list;
        this.prizeDeliveryDate = str;
        this.mission = campaignMission;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharingAward copy$default(SharingAward sharingAward, List list, String str, CampaignMission campaignMission, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = sharingAward.notes;
        }
        if ((i10 & 2) != 0) {
            str = sharingAward.prizeDeliveryDate;
        }
        if ((i10 & 4) != 0) {
            campaignMission = sharingAward.mission;
        }
        return sharingAward.copy(list, str, campaignMission);
    }

    public final List<String> component1() {
        return this.notes;
    }

    public final String component2() {
        return this.prizeDeliveryDate;
    }

    public final CampaignMission component3() {
        return this.mission;
    }

    public final SharingAward copy(List<String> list, String str, CampaignMission campaignMission) {
        p.h(list, "notes");
        p.h(str, "prizeDeliveryDate");
        p.h(campaignMission, Referer.MISSION);
        return new SharingAward(list, str, campaignMission);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SharingAward) {
            SharingAward sharingAward = (SharingAward) obj;
            return p.c(this.notes, sharingAward.notes) && p.c(this.prizeDeliveryDate, sharingAward.prizeDeliveryDate) && p.c(this.mission, sharingAward.mission);
        }
        return false;
    }

    public final CampaignMission getMission() {
        return this.mission;
    }

    public final List<String> getNotes() {
        return this.notes;
    }

    public final String getPrizeDeliveryDate() {
        return this.prizeDeliveryDate;
    }

    public int hashCode() {
        return (((this.notes.hashCode() * 31) + this.prizeDeliveryDate.hashCode()) * 31) + this.mission.hashCode();
    }

    public String toString() {
        return "SharingAward(notes=" + this.notes + ", prizeDeliveryDate=" + this.prizeDeliveryDate + ", mission=" + this.mission + ')';
    }
}
