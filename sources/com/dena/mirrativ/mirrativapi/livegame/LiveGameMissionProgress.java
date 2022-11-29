package com.dena.mirrativ.mirrativapi.livegame;

import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class LiveGameMissionProgress {
    private final int givenCoin;
    private final int maxCoin;
    @b(LiveGameMissionProgressStatusTypeAdapter.class)
    private final LiveGameMissionProgressStatusType status;

    public LiveGameMissionProgress(int i10, LiveGameMissionProgressStatusType liveGameMissionProgressStatusType, int i11) {
        p.h(liveGameMissionProgressStatusType, "status");
        this.givenCoin = i10;
        this.status = liveGameMissionProgressStatusType;
        this.maxCoin = i11;
    }

    public static /* synthetic */ LiveGameMissionProgress copy$default(LiveGameMissionProgress liveGameMissionProgress, int i10, LiveGameMissionProgressStatusType liveGameMissionProgressStatusType, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = liveGameMissionProgress.givenCoin;
        }
        if ((i12 & 2) != 0) {
            liveGameMissionProgressStatusType = liveGameMissionProgress.status;
        }
        if ((i12 & 4) != 0) {
            i11 = liveGameMissionProgress.maxCoin;
        }
        return liveGameMissionProgress.copy(i10, liveGameMissionProgressStatusType, i11);
    }

    public final int component1() {
        return this.givenCoin;
    }

    public final LiveGameMissionProgressStatusType component2() {
        return this.status;
    }

    public final int component3() {
        return this.maxCoin;
    }

    public final LiveGameMissionProgress copy(int i10, LiveGameMissionProgressStatusType liveGameMissionProgressStatusType, int i11) {
        p.h(liveGameMissionProgressStatusType, "status");
        return new LiveGameMissionProgress(i10, liveGameMissionProgressStatusType, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameMissionProgress) {
            LiveGameMissionProgress liveGameMissionProgress = (LiveGameMissionProgress) obj;
            return this.givenCoin == liveGameMissionProgress.givenCoin && this.status == liveGameMissionProgress.status && this.maxCoin == liveGameMissionProgress.maxCoin;
        }
        return false;
    }

    public final int getGivenCoin() {
        return this.givenCoin;
    }

    public final int getMaxCoin() {
        return this.maxCoin;
    }

    public final LiveGameMissionProgressStatusType getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.givenCoin) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.maxCoin);
    }

    public String toString() {
        return "LiveGameMissionProgress(givenCoin=" + this.givenCoin + ", status=" + this.status + ", maxCoin=" + this.maxCoin + ')';
    }
}
