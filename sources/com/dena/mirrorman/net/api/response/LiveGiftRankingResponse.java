package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.live.LiveGiftRankingUser;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGiftRankingResponse {
    public static final int $stable = 8;
    private final String nextCursor;
    private final List<LiveGiftRankingUser> ranking;
    private final Status status;

    public LiveGiftRankingResponse(List<LiveGiftRankingUser> list, String str, Status status) {
        p.h(list, "ranking");
        p.h(str, "nextCursor");
        p.h(status, "status");
        this.ranking = list;
        this.nextCursor = str;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveGiftRankingResponse copy$default(LiveGiftRankingResponse liveGiftRankingResponse, List list, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = liveGiftRankingResponse.ranking;
        }
        if ((i10 & 2) != 0) {
            str = liveGiftRankingResponse.nextCursor;
        }
        if ((i10 & 4) != 0) {
            status = liveGiftRankingResponse.status;
        }
        return liveGiftRankingResponse.copy(list, str, status);
    }

    public final List<LiveGiftRankingUser> component1() {
        return this.ranking;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final Status component3() {
        return this.status;
    }

    public final LiveGiftRankingResponse copy(List<LiveGiftRankingUser> list, String str, Status status) {
        p.h(list, "ranking");
        p.h(str, "nextCursor");
        p.h(status, "status");
        return new LiveGiftRankingResponse(list, str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGiftRankingResponse) {
            LiveGiftRankingResponse liveGiftRankingResponse = (LiveGiftRankingResponse) obj;
            return p.c(this.ranking, liveGiftRankingResponse.ranking) && p.c(this.nextCursor, liveGiftRankingResponse.nextCursor) && p.c(this.status, liveGiftRankingResponse.status);
        }
        return false;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<LiveGiftRankingUser> getRanking() {
        return this.ranking;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.ranking.hashCode() * 31) + this.nextCursor.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "LiveGiftRankingResponse(ranking=" + this.ranking + ", nextCursor=" + this.nextCursor + ", status=" + this.status + ')';
    }
}
