package com.dena.mirrorman.net.bcsvr.response;

import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameEndBcsvrResponse {
    public static final int $stable = 0;
    private final String liveGameId;

    public LiveGameEndBcsvrResponse(String str) {
        p.h(str, "liveGameId");
        this.liveGameId = str;
    }

    public static /* synthetic */ LiveGameEndBcsvrResponse copy$default(LiveGameEndBcsvrResponse liveGameEndBcsvrResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveGameEndBcsvrResponse.liveGameId;
        }
        return liveGameEndBcsvrResponse.copy(str);
    }

    public final String component1() {
        return this.liveGameId;
    }

    public final LiveGameEndBcsvrResponse copy(String str) {
        p.h(str, "liveGameId");
        return new LiveGameEndBcsvrResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveGameEndBcsvrResponse) && p.c(this.liveGameId, ((LiveGameEndBcsvrResponse) obj).liveGameId);
    }

    public final String getLiveGameId() {
        return this.liveGameId;
    }

    public int hashCode() {
        return this.liveGameId.hashCode();
    }

    public String toString() {
        return "LiveGameEndBcsvrResponse(liveGameId=" + this.liveGameId + ')';
    }
}
