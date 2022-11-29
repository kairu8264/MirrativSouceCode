package com.dena.mirrorman.net.api.response.livegame;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.LiveGameListCounts;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class NewCountsResponse implements Serializable {
    public static final int $stable = 8;
    private final LiveGameListCounts counts;
    private final Status status;

    public NewCountsResponse(Status status, LiveGameListCounts liveGameListCounts) {
        p.h(status, "status");
        p.h(liveGameListCounts, "counts");
        this.status = status;
        this.counts = liveGameListCounts;
    }

    public static /* synthetic */ NewCountsResponse copy$default(NewCountsResponse newCountsResponse, Status status, LiveGameListCounts liveGameListCounts, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = newCountsResponse.status;
        }
        if ((i10 & 2) != 0) {
            liveGameListCounts = newCountsResponse.counts;
        }
        return newCountsResponse.copy(status, liveGameListCounts);
    }

    public final Status component1() {
        return this.status;
    }

    public final LiveGameListCounts component2() {
        return this.counts;
    }

    public final NewCountsResponse copy(Status status, LiveGameListCounts liveGameListCounts) {
        p.h(status, "status");
        p.h(liveGameListCounts, "counts");
        return new NewCountsResponse(status, liveGameListCounts);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NewCountsResponse) {
            NewCountsResponse newCountsResponse = (NewCountsResponse) obj;
            return p.c(this.status, newCountsResponse.status) && p.c(this.counts, newCountsResponse.counts);
        }
        return false;
    }

    public final LiveGameListCounts getCounts() {
        return this.counts;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.counts.hashCode();
    }

    public String toString() {
        return "NewCountsResponse(status=" + this.status + ", counts=" + this.counts + ')';
    }
}
