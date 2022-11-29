package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class MutualGiftAchievedBcsvrResponse {
    public static final int $stable = 0;
    private final int achievedAt;
    private final int eventId;
    private final MutualGiftUser streamer;
    private final MutualGiftUser viewer;

    public MutualGiftAchievedBcsvrResponse(int i10, MutualGiftUser mutualGiftUser, MutualGiftUser mutualGiftUser2, int i11) {
        p.h(mutualGiftUser, MRLog.TARGET_TYPE_VIEWER);
        p.h(mutualGiftUser2, "streamer");
        this.eventId = i10;
        this.viewer = mutualGiftUser;
        this.streamer = mutualGiftUser2;
        this.achievedAt = i11;
    }

    public static /* synthetic */ MutualGiftAchievedBcsvrResponse copy$default(MutualGiftAchievedBcsvrResponse mutualGiftAchievedBcsvrResponse, int i10, MutualGiftUser mutualGiftUser, MutualGiftUser mutualGiftUser2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = mutualGiftAchievedBcsvrResponse.eventId;
        }
        if ((i12 & 2) != 0) {
            mutualGiftUser = mutualGiftAchievedBcsvrResponse.viewer;
        }
        if ((i12 & 4) != 0) {
            mutualGiftUser2 = mutualGiftAchievedBcsvrResponse.streamer;
        }
        if ((i12 & 8) != 0) {
            i11 = mutualGiftAchievedBcsvrResponse.achievedAt;
        }
        return mutualGiftAchievedBcsvrResponse.copy(i10, mutualGiftUser, mutualGiftUser2, i11);
    }

    public final int component1() {
        return this.eventId;
    }

    public final MutualGiftUser component2() {
        return this.viewer;
    }

    public final MutualGiftUser component3() {
        return this.streamer;
    }

    public final int component4() {
        return this.achievedAt;
    }

    public final MutualGiftAchievedBcsvrResponse copy(int i10, MutualGiftUser mutualGiftUser, MutualGiftUser mutualGiftUser2, int i11) {
        p.h(mutualGiftUser, MRLog.TARGET_TYPE_VIEWER);
        p.h(mutualGiftUser2, "streamer");
        return new MutualGiftAchievedBcsvrResponse(i10, mutualGiftUser, mutualGiftUser2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MutualGiftAchievedBcsvrResponse) {
            MutualGiftAchievedBcsvrResponse mutualGiftAchievedBcsvrResponse = (MutualGiftAchievedBcsvrResponse) obj;
            return this.eventId == mutualGiftAchievedBcsvrResponse.eventId && p.c(this.viewer, mutualGiftAchievedBcsvrResponse.viewer) && p.c(this.streamer, mutualGiftAchievedBcsvrResponse.streamer) && this.achievedAt == mutualGiftAchievedBcsvrResponse.achievedAt;
        }
        return false;
    }

    public final int getAchievedAt() {
        return this.achievedAt;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final MutualGiftUser getStreamer() {
        return this.streamer;
    }

    public final MutualGiftUser getViewer() {
        return this.viewer;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.eventId) * 31) + this.viewer.hashCode()) * 31) + this.streamer.hashCode()) * 31) + Integer.hashCode(this.achievedAt);
    }

    public String toString() {
        return "MutualGiftAchievedBcsvrResponse(eventId=" + this.eventId + ", viewer=" + this.viewer + ", streamer=" + this.streamer + ", achievedAt=" + this.achievedAt + ')';
    }
}
