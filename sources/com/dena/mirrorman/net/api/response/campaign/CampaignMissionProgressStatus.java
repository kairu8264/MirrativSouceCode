package com.dena.mirrorman.net.api.response.campaign;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import ym.b;

/* loaded from: classes2.dex */
public final class CampaignMissionProgressStatus {
    public static final int $stable = 0;
    private final int current;
    @b(BooleanTypeAdapter.class)
    private final boolean isCompleted;
    private final int max;

    public CampaignMissionProgressStatus(int i10, int i11, boolean z10) {
        this.current = i10;
        this.max = i11;
        this.isCompleted = z10;
    }

    public static /* synthetic */ CampaignMissionProgressStatus copy$default(CampaignMissionProgressStatus campaignMissionProgressStatus, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = campaignMissionProgressStatus.current;
        }
        if ((i12 & 2) != 0) {
            i11 = campaignMissionProgressStatus.max;
        }
        if ((i12 & 4) != 0) {
            z10 = campaignMissionProgressStatus.isCompleted;
        }
        return campaignMissionProgressStatus.copy(i10, i11, z10);
    }

    public final int component1() {
        return this.current;
    }

    public final int component2() {
        return this.max;
    }

    public final boolean component3() {
        return this.isCompleted;
    }

    public final CampaignMissionProgressStatus copy(int i10, int i11, boolean z10) {
        return new CampaignMissionProgressStatus(i10, i11, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignMissionProgressStatus) {
            CampaignMissionProgressStatus campaignMissionProgressStatus = (CampaignMissionProgressStatus) obj;
            return this.current == campaignMissionProgressStatus.current && this.max == campaignMissionProgressStatus.max && this.isCompleted == campaignMissionProgressStatus.isCompleted;
        }
        return false;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getMax() {
        return this.max;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.current) * 31) + Integer.hashCode(this.max)) * 31;
        boolean z10 = this.isCompleted;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public String toString() {
        return "CampaignMissionProgressStatus(current=" + this.current + ", max=" + this.max + ", isCompleted=" + this.isCompleted + ')';
    }
}
