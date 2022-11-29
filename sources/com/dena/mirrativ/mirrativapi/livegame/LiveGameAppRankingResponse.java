package com.dena.mirrativ.mirrativapi.livegame;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameAppRankingResponse {
    private final Status status;
    private final String url;

    public LiveGameAppRankingResponse(Status status, String str) {
        p.h(status, "status");
        p.h(str, "url");
        this.status = status;
        this.url = str;
    }

    public static /* synthetic */ LiveGameAppRankingResponse copy$default(LiveGameAppRankingResponse liveGameAppRankingResponse, Status status, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveGameAppRankingResponse.status;
        }
        if ((i10 & 2) != 0) {
            str = liveGameAppRankingResponse.url;
        }
        return liveGameAppRankingResponse.copy(status, str);
    }

    public final Status component1() {
        return this.status;
    }

    public final String component2() {
        return this.url;
    }

    public final LiveGameAppRankingResponse copy(Status status, String str) {
        p.h(status, "status");
        p.h(str, "url");
        return new LiveGameAppRankingResponse(status, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameAppRankingResponse) {
            LiveGameAppRankingResponse liveGameAppRankingResponse = (LiveGameAppRankingResponse) obj;
            return p.c(this.status, liveGameAppRankingResponse.status) && p.c(this.url, liveGameAppRankingResponse.url);
        }
        return false;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.url.hashCode();
    }

    public String toString() {
        return "LiveGameAppRankingResponse(status=" + this.status + ", url=" + this.url + ')';
    }
}
