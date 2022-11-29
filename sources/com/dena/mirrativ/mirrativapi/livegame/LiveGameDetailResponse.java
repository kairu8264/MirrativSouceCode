package com.dena.mirrativ.mirrativapi.livegame;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameDetailResponse {
    private final LiveGameListItem game;
    private final Status status;

    public LiveGameDetailResponse(Status status, LiveGameListItem liveGameListItem) {
        p.h(status, "status");
        p.h(liveGameListItem, "game");
        this.status = status;
        this.game = liveGameListItem;
    }

    public static /* synthetic */ LiveGameDetailResponse copy$default(LiveGameDetailResponse liveGameDetailResponse, Status status, LiveGameListItem liveGameListItem, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveGameDetailResponse.status;
        }
        if ((i10 & 2) != 0) {
            liveGameListItem = liveGameDetailResponse.game;
        }
        return liveGameDetailResponse.copy(status, liveGameListItem);
    }

    public final Status component1() {
        return this.status;
    }

    public final LiveGameListItem component2() {
        return this.game;
    }

    public final LiveGameDetailResponse copy(Status status, LiveGameListItem liveGameListItem) {
        p.h(status, "status");
        p.h(liveGameListItem, "game");
        return new LiveGameDetailResponse(status, liveGameListItem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameDetailResponse) {
            LiveGameDetailResponse liveGameDetailResponse = (LiveGameDetailResponse) obj;
            return p.c(this.status, liveGameDetailResponse.status) && p.c(this.game, liveGameDetailResponse.game);
        }
        return false;
    }

    public final LiveGameListItem getGame() {
        return this.game;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.game.hashCode();
    }

    public String toString() {
        return "LiveGameDetailResponse(status=" + this.status + ", game=" + this.game + ')';
    }
}
