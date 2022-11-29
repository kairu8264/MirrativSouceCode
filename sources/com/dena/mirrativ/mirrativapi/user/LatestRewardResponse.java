package com.dena.mirrativ.mirrativapi.user;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class LatestRewardResponse {
    private final int currentMonth;
    private final int fixedCashRate;
    private final int fixedCoinRate;
    private final int fixedGrade;
    private final int fixedMonth;
    private final int fixedRank;
    private final boolean isVisibleHistory;
    private final boolean isVisibleRanking;
    private final int rankingMonth;
    private final int rewardCash;
    private final int rewardCoin;
    private final int rewardDate;
    private final Status status;

    public LatestRewardResponse(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z11, Status status) {
        p.h(status, "status");
        this.rankingMonth = i10;
        this.isVisibleRanking = z10;
        this.fixedMonth = i11;
        this.fixedRank = i12;
        this.fixedGrade = i13;
        this.fixedCashRate = i14;
        this.fixedCoinRate = i15;
        this.rewardDate = i16;
        this.rewardCash = i17;
        this.rewardCoin = i18;
        this.currentMonth = i19;
        this.isVisibleHistory = z11;
        this.status = status;
    }

    public final int component1() {
        return this.rankingMonth;
    }

    public final int component10() {
        return this.rewardCoin;
    }

    public final int component11() {
        return this.currentMonth;
    }

    public final boolean component12() {
        return this.isVisibleHistory;
    }

    public final Status component13() {
        return this.status;
    }

    public final boolean component2() {
        return this.isVisibleRanking;
    }

    public final int component3() {
        return this.fixedMonth;
    }

    public final int component4() {
        return this.fixedRank;
    }

    public final int component5() {
        return this.fixedGrade;
    }

    public final int component6() {
        return this.fixedCashRate;
    }

    public final int component7() {
        return this.fixedCoinRate;
    }

    public final int component8() {
        return this.rewardDate;
    }

    public final int component9() {
        return this.rewardCash;
    }

    public final LatestRewardResponse copy(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z11, Status status) {
        p.h(status, "status");
        return new LatestRewardResponse(i10, z10, i11, i12, i13, i14, i15, i16, i17, i18, i19, z11, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatestRewardResponse) {
            LatestRewardResponse latestRewardResponse = (LatestRewardResponse) obj;
            return this.rankingMonth == latestRewardResponse.rankingMonth && this.isVisibleRanking == latestRewardResponse.isVisibleRanking && this.fixedMonth == latestRewardResponse.fixedMonth && this.fixedRank == latestRewardResponse.fixedRank && this.fixedGrade == latestRewardResponse.fixedGrade && this.fixedCashRate == latestRewardResponse.fixedCashRate && this.fixedCoinRate == latestRewardResponse.fixedCoinRate && this.rewardDate == latestRewardResponse.rewardDate && this.rewardCash == latestRewardResponse.rewardCash && this.rewardCoin == latestRewardResponse.rewardCoin && this.currentMonth == latestRewardResponse.currentMonth && this.isVisibleHistory == latestRewardResponse.isVisibleHistory && p.c(this.status, latestRewardResponse.status);
        }
        return false;
    }

    public final int getCurrentMonth() {
        return this.currentMonth;
    }

    public final int getFixedCashRate() {
        return this.fixedCashRate;
    }

    public final int getFixedCoinRate() {
        return this.fixedCoinRate;
    }

    public final int getFixedGrade() {
        return this.fixedGrade;
    }

    public final int getFixedMonth() {
        return this.fixedMonth;
    }

    public final int getFixedRank() {
        return this.fixedRank;
    }

    public final int getRankingMonth() {
        return this.rankingMonth;
    }

    public final int getRewardCash() {
        return this.rewardCash;
    }

    public final int getRewardCoin() {
        return this.rewardCoin;
    }

    public final int getRewardDate() {
        return this.rewardDate;
    }

    public final Status getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.rankingMonth) * 31;
        boolean z10 = this.isVisibleRanking;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((((((((((((((hashCode + i10) * 31) + Integer.hashCode(this.fixedMonth)) * 31) + Integer.hashCode(this.fixedRank)) * 31) + Integer.hashCode(this.fixedGrade)) * 31) + Integer.hashCode(this.fixedCashRate)) * 31) + Integer.hashCode(this.fixedCoinRate)) * 31) + Integer.hashCode(this.rewardDate)) * 31) + Integer.hashCode(this.rewardCash)) * 31) + Integer.hashCode(this.rewardCoin)) * 31) + Integer.hashCode(this.currentMonth)) * 31;
        boolean z11 = this.isVisibleHistory;
        return ((hashCode2 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.status.hashCode();
    }

    public final boolean isVisibleHistory() {
        return this.isVisibleHistory;
    }

    public final boolean isVisibleRanking() {
        return this.isVisibleRanking;
    }

    public String toString() {
        return "LatestRewardResponse(rankingMonth=" + this.rankingMonth + ", isVisibleRanking=" + this.isVisibleRanking + ", fixedMonth=" + this.fixedMonth + ", fixedRank=" + this.fixedRank + ", fixedGrade=" + this.fixedGrade + ", fixedCashRate=" + this.fixedCashRate + ", fixedCoinRate=" + this.fixedCoinRate + ", rewardDate=" + this.rewardDate + ", rewardCash=" + this.rewardCash + ", rewardCoin=" + this.rewardCoin + ", currentMonth=" + this.currentMonth + ", isVisibleHistory=" + this.isVisibleHistory + ", status=" + this.status + ')';
    }
}
