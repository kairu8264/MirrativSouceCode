package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class MissionReceiveRewardResponse {
    public static final int $stable = 8;
    private final String rewardImageUrl;
    private final String rewardTitle;
    private final Status status;

    public MissionReceiveRewardResponse(Status status, String str, String str2) {
        p.h(status, "status");
        p.h(str, "rewardImageUrl");
        p.h(str2, "rewardTitle");
        this.status = status;
        this.rewardImageUrl = str;
        this.rewardTitle = str2;
    }

    public static /* synthetic */ MissionReceiveRewardResponse copy$default(MissionReceiveRewardResponse missionReceiveRewardResponse, Status status, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = missionReceiveRewardResponse.status;
        }
        if ((i10 & 2) != 0) {
            str = missionReceiveRewardResponse.rewardImageUrl;
        }
        if ((i10 & 4) != 0) {
            str2 = missionReceiveRewardResponse.rewardTitle;
        }
        return missionReceiveRewardResponse.copy(status, str, str2);
    }

    public final Status component1() {
        return this.status;
    }

    public final String component2() {
        return this.rewardImageUrl;
    }

    public final String component3() {
        return this.rewardTitle;
    }

    public final MissionReceiveRewardResponse copy(Status status, String str, String str2) {
        p.h(status, "status");
        p.h(str, "rewardImageUrl");
        p.h(str2, "rewardTitle");
        return new MissionReceiveRewardResponse(status, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MissionReceiveRewardResponse) {
            MissionReceiveRewardResponse missionReceiveRewardResponse = (MissionReceiveRewardResponse) obj;
            return p.c(this.status, missionReceiveRewardResponse.status) && p.c(this.rewardImageUrl, missionReceiveRewardResponse.rewardImageUrl) && p.c(this.rewardTitle, missionReceiveRewardResponse.rewardTitle);
        }
        return false;
    }

    public final String getRewardImageUrl() {
        return this.rewardImageUrl;
    }

    public final String getRewardTitle() {
        return this.rewardTitle;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.rewardImageUrl.hashCode()) * 31) + this.rewardTitle.hashCode();
    }

    public String toString() {
        return "MissionReceiveRewardResponse(status=" + this.status + ", rewardImageUrl=" + this.rewardImageUrl + ", rewardTitle=" + this.rewardTitle + ')';
    }
}
