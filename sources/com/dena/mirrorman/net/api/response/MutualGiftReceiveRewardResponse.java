package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class MutualGiftReceiveRewardResponse {
    public static final int $stable = 8;
    private final MutualGiftReward receivedReward;
    private final Status status;
    private final MutualGiftUser streamer;
    private final MutualGiftUser viewer;

    public MutualGiftReceiveRewardResponse(Status status, MutualGiftUser mutualGiftUser, MutualGiftUser mutualGiftUser2, MutualGiftReward mutualGiftReward) {
        p.h(status, "status");
        p.h(mutualGiftUser, "streamer");
        p.h(mutualGiftUser2, MRLog.TARGET_TYPE_VIEWER);
        p.h(mutualGiftReward, "receivedReward");
        this.status = status;
        this.streamer = mutualGiftUser;
        this.viewer = mutualGiftUser2;
        this.receivedReward = mutualGiftReward;
    }

    public static /* synthetic */ MutualGiftReceiveRewardResponse copy$default(MutualGiftReceiveRewardResponse mutualGiftReceiveRewardResponse, Status status, MutualGiftUser mutualGiftUser, MutualGiftUser mutualGiftUser2, MutualGiftReward mutualGiftReward, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = mutualGiftReceiveRewardResponse.status;
        }
        if ((i10 & 2) != 0) {
            mutualGiftUser = mutualGiftReceiveRewardResponse.streamer;
        }
        if ((i10 & 4) != 0) {
            mutualGiftUser2 = mutualGiftReceiveRewardResponse.viewer;
        }
        if ((i10 & 8) != 0) {
            mutualGiftReward = mutualGiftReceiveRewardResponse.receivedReward;
        }
        return mutualGiftReceiveRewardResponse.copy(status, mutualGiftUser, mutualGiftUser2, mutualGiftReward);
    }

    public final Status component1() {
        return this.status;
    }

    public final MutualGiftUser component2() {
        return this.streamer;
    }

    public final MutualGiftUser component3() {
        return this.viewer;
    }

    public final MutualGiftReward component4() {
        return this.receivedReward;
    }

    public final MutualGiftReceiveRewardResponse copy(Status status, MutualGiftUser mutualGiftUser, MutualGiftUser mutualGiftUser2, MutualGiftReward mutualGiftReward) {
        p.h(status, "status");
        p.h(mutualGiftUser, "streamer");
        p.h(mutualGiftUser2, MRLog.TARGET_TYPE_VIEWER);
        p.h(mutualGiftReward, "receivedReward");
        return new MutualGiftReceiveRewardResponse(status, mutualGiftUser, mutualGiftUser2, mutualGiftReward);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MutualGiftReceiveRewardResponse) {
            MutualGiftReceiveRewardResponse mutualGiftReceiveRewardResponse = (MutualGiftReceiveRewardResponse) obj;
            return p.c(this.status, mutualGiftReceiveRewardResponse.status) && p.c(this.streamer, mutualGiftReceiveRewardResponse.streamer) && p.c(this.viewer, mutualGiftReceiveRewardResponse.viewer) && p.c(this.receivedReward, mutualGiftReceiveRewardResponse.receivedReward);
        }
        return false;
    }

    public final MutualGiftReward getReceivedReward() {
        return this.receivedReward;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final MutualGiftUser getStreamer() {
        return this.streamer;
    }

    public final MutualGiftUser getViewer() {
        return this.viewer;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.streamer.hashCode()) * 31) + this.viewer.hashCode()) * 31) + this.receivedReward.hashCode();
    }

    public String toString() {
        return "MutualGiftReceiveRewardResponse(status=" + this.status + ", streamer=" + this.streamer + ", viewer=" + this.viewer + ", receivedReward=" + this.receivedReward + ')';
    }
}
