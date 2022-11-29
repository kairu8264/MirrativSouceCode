package com.dena.mirrativ.mirrativapi.otherfeatures.passbook.coin;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class CoinHistoriesResponse {
    private final int currentPage;
    private final long freeCoin;
    @c("history")
    private final List<CoinHistory> histories;
    private final int nextPage;
    private final long paidCoin;
    private final Status status;

    public CoinHistoriesResponse(long j10, long j11, List<CoinHistory> list, int i10, int i11, Status status) {
        p.h(list, "histories");
        p.h(status, "status");
        this.paidCoin = j10;
        this.freeCoin = j11;
        this.histories = list;
        this.nextPage = i10;
        this.currentPage = i11;
        this.status = status;
    }

    public final long component1() {
        return this.paidCoin;
    }

    public final long component2() {
        return this.freeCoin;
    }

    public final List<CoinHistory> component3() {
        return this.histories;
    }

    public final int component4() {
        return this.nextPage;
    }

    public final int component5() {
        return this.currentPage;
    }

    public final Status component6() {
        return this.status;
    }

    public final CoinHistoriesResponse copy(long j10, long j11, List<CoinHistory> list, int i10, int i11, Status status) {
        p.h(list, "histories");
        p.h(status, "status");
        return new CoinHistoriesResponse(j10, j11, list, i10, i11, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CoinHistoriesResponse) {
            CoinHistoriesResponse coinHistoriesResponse = (CoinHistoriesResponse) obj;
            return this.paidCoin == coinHistoriesResponse.paidCoin && this.freeCoin == coinHistoriesResponse.freeCoin && p.c(this.histories, coinHistoriesResponse.histories) && this.nextPage == coinHistoriesResponse.nextPage && this.currentPage == coinHistoriesResponse.currentPage && p.c(this.status, coinHistoriesResponse.status);
        }
        return false;
    }

    public final long getCoin() {
        return this.paidCoin + this.freeCoin;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final long getFreeCoin() {
        return this.freeCoin;
    }

    public final List<CoinHistory> getHistories() {
        return this.histories;
    }

    public final int getNextPage() {
        return this.nextPage;
    }

    public final long getPaidCoin() {
        return this.paidCoin;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.paidCoin) * 31) + Long.hashCode(this.freeCoin)) * 31) + this.histories.hashCode()) * 31) + Integer.hashCode(this.nextPage)) * 31) + Integer.hashCode(this.currentPage)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "CoinHistoriesResponse(paidCoin=" + this.paidCoin + ", freeCoin=" + this.freeCoin + ", histories=" + this.histories + ", nextPage=" + this.nextPage + ", currentPage=" + this.currentPage + ", status=" + this.status + ')';
    }
}
