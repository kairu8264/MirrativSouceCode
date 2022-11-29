package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class RankingUserDetailResponse implements Serializable {
    public static final int $stable = 8;
    private final List<GiftRanking> rankings;
    private final Status status;

    public RankingUserDetailResponse(List<GiftRanking> list, Status status) {
        p.h(list, "rankings");
        p.h(status, "status");
        this.rankings = list;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankingUserDetailResponse copy$default(RankingUserDetailResponse rankingUserDetailResponse, List list, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = rankingUserDetailResponse.rankings;
        }
        if ((i10 & 2) != 0) {
            status = rankingUserDetailResponse.status;
        }
        return rankingUserDetailResponse.copy(list, status);
    }

    public final List<GiftRanking> component1() {
        return this.rankings;
    }

    public final Status component2() {
        return this.status;
    }

    public final RankingUserDetailResponse copy(List<GiftRanking> list, Status status) {
        p.h(list, "rankings");
        p.h(status, "status");
        return new RankingUserDetailResponse(list, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RankingUserDetailResponse) {
            RankingUserDetailResponse rankingUserDetailResponse = (RankingUserDetailResponse) obj;
            return p.c(this.rankings, rankingUserDetailResponse.rankings) && p.c(this.status, rankingUserDetailResponse.status);
        }
        return false;
    }

    public final List<GiftRanking> getRankings() {
        return this.rankings;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.rankings.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "RankingUserDetailResponse(rankings=" + this.rankings + ", status=" + this.status + ')';
    }
}
