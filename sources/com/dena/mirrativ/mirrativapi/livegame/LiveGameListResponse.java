package com.dena.mirrativ.mirrativapi.livegame;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameListResponse implements Serializable {
    private final String currentCursor;
    private final List<LiveGameListItem> games;
    private final long latestCreatedAt;
    private final String missionBannerUrl;
    private final LiveGameMissionProgress missionProgress;
    private final String nextCursor;
    private final Status status;

    public LiveGameListResponse(Status status, List<LiveGameListItem> list, String str, LiveGameMissionProgress liveGameMissionProgress, String str2, String str3, long j10) {
        p.h(status, "status");
        p.h(list, "games");
        p.h(str, "missionBannerUrl");
        p.h(liveGameMissionProgress, "missionProgress");
        p.h(str2, "currentCursor");
        p.h(str3, "nextCursor");
        this.status = status;
        this.games = list;
        this.missionBannerUrl = str;
        this.missionProgress = liveGameMissionProgress;
        this.currentCursor = str2;
        this.nextCursor = str3;
        this.latestCreatedAt = j10;
    }

    public final Status component1() {
        return this.status;
    }

    public final List<LiveGameListItem> component2() {
        return this.games;
    }

    public final String component3() {
        return this.missionBannerUrl;
    }

    public final LiveGameMissionProgress component4() {
        return this.missionProgress;
    }

    public final String component5() {
        return this.currentCursor;
    }

    public final String component6() {
        return this.nextCursor;
    }

    public final long component7() {
        return this.latestCreatedAt;
    }

    public final LiveGameListResponse copy(Status status, List<LiveGameListItem> list, String str, LiveGameMissionProgress liveGameMissionProgress, String str2, String str3, long j10) {
        p.h(status, "status");
        p.h(list, "games");
        p.h(str, "missionBannerUrl");
        p.h(liveGameMissionProgress, "missionProgress");
        p.h(str2, "currentCursor");
        p.h(str3, "nextCursor");
        return new LiveGameListResponse(status, list, str, liveGameMissionProgress, str2, str3, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameListResponse) {
            LiveGameListResponse liveGameListResponse = (LiveGameListResponse) obj;
            return p.c(this.status, liveGameListResponse.status) && p.c(this.games, liveGameListResponse.games) && p.c(this.missionBannerUrl, liveGameListResponse.missionBannerUrl) && p.c(this.missionProgress, liveGameListResponse.missionProgress) && p.c(this.currentCursor, liveGameListResponse.currentCursor) && p.c(this.nextCursor, liveGameListResponse.nextCursor) && this.latestCreatedAt == liveGameListResponse.latestCreatedAt;
        }
        return false;
    }

    public final String getCurrentCursor() {
        return this.currentCursor;
    }

    public final List<LiveGameListItem> getGames() {
        return this.games;
    }

    public final long getLatestCreatedAt() {
        return this.latestCreatedAt;
    }

    public final String getMissionBannerUrl() {
        return this.missionBannerUrl;
    }

    public final LiveGameMissionProgress getMissionProgress() {
        return this.missionProgress;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((this.status.hashCode() * 31) + this.games.hashCode()) * 31) + this.missionBannerUrl.hashCode()) * 31) + this.missionProgress.hashCode()) * 31) + this.currentCursor.hashCode()) * 31) + this.nextCursor.hashCode()) * 31) + Long.hashCode(this.latestCreatedAt);
    }

    public String toString() {
        return "LiveGameListResponse(status=" + this.status + ", games=" + this.games + ", missionBannerUrl=" + this.missionBannerUrl + ", missionProgress=" + this.missionProgress + ", currentCursor=" + this.currentCursor + ", nextCursor=" + this.nextCursor + ", latestCreatedAt=" + this.latestCreatedAt + ')';
    }
}
