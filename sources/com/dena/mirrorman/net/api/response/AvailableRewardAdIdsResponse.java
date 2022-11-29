package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class AvailableRewardAdIdsResponse {
    public static final int $stable = 8;
    private final List<Integer> rewardAdIds;
    private final Status status;

    public AvailableRewardAdIdsResponse(Status status, List<Integer> list) {
        p.h(status, "status");
        p.h(list, "rewardAdIds");
        this.status = status;
        this.rewardAdIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableRewardAdIdsResponse copy$default(AvailableRewardAdIdsResponse availableRewardAdIdsResponse, Status status, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = availableRewardAdIdsResponse.status;
        }
        if ((i10 & 2) != 0) {
            list = availableRewardAdIdsResponse.rewardAdIds;
        }
        return availableRewardAdIdsResponse.copy(status, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final List<Integer> component2() {
        return this.rewardAdIds;
    }

    public final AvailableRewardAdIdsResponse copy(Status status, List<Integer> list) {
        p.h(status, "status");
        p.h(list, "rewardAdIds");
        return new AvailableRewardAdIdsResponse(status, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AvailableRewardAdIdsResponse) {
            AvailableRewardAdIdsResponse availableRewardAdIdsResponse = (AvailableRewardAdIdsResponse) obj;
            return p.c(this.status, availableRewardAdIdsResponse.status) && p.c(this.rewardAdIds, availableRewardAdIdsResponse.rewardAdIds);
        }
        return false;
    }

    public final List<Integer> getRewardAdIds() {
        return this.rewardAdIds;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.rewardAdIds.hashCode();
    }

    public String toString() {
        return "AvailableRewardAdIdsResponse(status=" + this.status + ", rewardAdIds=" + this.rewardAdIds + ')';
    }
}
