package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

/* loaded from: classes2.dex */
public final class GiftRankingRank {
    private final int giftPoint;
    private final int rank;

    public GiftRankingRank(int i10, int i11) {
        this.giftPoint = i10;
        this.rank = i11;
    }

    public static /* synthetic */ GiftRankingRank copy$default(GiftRankingRank giftRankingRank, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = giftRankingRank.giftPoint;
        }
        if ((i12 & 2) != 0) {
            i11 = giftRankingRank.rank;
        }
        return giftRankingRank.copy(i10, i11);
    }

    public final int component1() {
        return this.giftPoint;
    }

    public final int component2() {
        return this.rank;
    }

    public final GiftRankingRank copy(int i10, int i11) {
        return new GiftRankingRank(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingRank) {
            GiftRankingRank giftRankingRank = (GiftRankingRank) obj;
            return this.giftPoint == giftRankingRank.giftPoint && this.rank == giftRankingRank.rank;
        }
        return false;
    }

    public final int getGiftPoint() {
        return this.giftPoint;
    }

    public final int getRank() {
        return this.rank;
    }

    public int hashCode() {
        return (Integer.hashCode(this.giftPoint) * 31) + Integer.hashCode(this.rank);
    }

    public String toString() {
        return "GiftRankingRank(giftPoint=" + this.giftPoint + ", rank=" + this.rank + ')';
    }
}
