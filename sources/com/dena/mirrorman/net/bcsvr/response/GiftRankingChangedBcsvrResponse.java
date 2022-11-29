package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class GiftRankingChangedBcsvrResponse {
    public static final int $stable = 0;
    @c("ei")
    private final int eventId;
    @c("iae")
    private final boolean isAppEvent;
    @c("nt")
    private final long nanoTime;
    @c(TopicConstant.EXTEND_AAC_RAW)
    private final int rank;
    @c("rt")
    private final String rankText;
    @c("rp")
    private final int rankingPoint;

    public GiftRankingChangedBcsvrResponse(boolean z10, int i10, int i11, int i12, String str, long j10) {
        p.h(str, "rankText");
        this.isAppEvent = z10;
        this.eventId = i10;
        this.rankingPoint = i11;
        this.rank = i12;
        this.rankText = str;
        this.nanoTime = j10;
    }

    public static /* synthetic */ GiftRankingChangedBcsvrResponse copy$default(GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse, boolean z10, int i10, int i11, int i12, String str, long j10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = giftRankingChangedBcsvrResponse.isAppEvent;
        }
        if ((i13 & 2) != 0) {
            i10 = giftRankingChangedBcsvrResponse.eventId;
        }
        int i14 = i10;
        if ((i13 & 4) != 0) {
            i11 = giftRankingChangedBcsvrResponse.rankingPoint;
        }
        int i15 = i11;
        if ((i13 & 8) != 0) {
            i12 = giftRankingChangedBcsvrResponse.rank;
        }
        int i16 = i12;
        if ((i13 & 16) != 0) {
            str = giftRankingChangedBcsvrResponse.rankText;
        }
        String str2 = str;
        if ((i13 & 32) != 0) {
            j10 = giftRankingChangedBcsvrResponse.nanoTime;
        }
        return giftRankingChangedBcsvrResponse.copy(z10, i14, i15, i16, str2, j10);
    }

    public final boolean component1() {
        return this.isAppEvent;
    }

    public final int component2() {
        return this.eventId;
    }

    public final int component3() {
        return this.rankingPoint;
    }

    public final int component4() {
        return this.rank;
    }

    public final String component5() {
        return this.rankText;
    }

    public final long component6() {
        return this.nanoTime;
    }

    public final GiftRankingChangedBcsvrResponse copy(boolean z10, int i10, int i11, int i12, String str, long j10) {
        p.h(str, "rankText");
        return new GiftRankingChangedBcsvrResponse(z10, i10, i11, i12, str, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingChangedBcsvrResponse) {
            GiftRankingChangedBcsvrResponse giftRankingChangedBcsvrResponse = (GiftRankingChangedBcsvrResponse) obj;
            return this.isAppEvent == giftRankingChangedBcsvrResponse.isAppEvent && this.eventId == giftRankingChangedBcsvrResponse.eventId && this.rankingPoint == giftRankingChangedBcsvrResponse.rankingPoint && this.rank == giftRankingChangedBcsvrResponse.rank && p.c(this.rankText, giftRankingChangedBcsvrResponse.rankText) && this.nanoTime == giftRankingChangedBcsvrResponse.nanoTime;
        }
        return false;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final long getNanoTime() {
        return this.nanoTime;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getRankText() {
        return this.rankText;
    }

    public final int getRankingPoint() {
        return this.rankingPoint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z10 = this.isAppEvent;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((((((((r02 * 31) + Integer.hashCode(this.eventId)) * 31) + Integer.hashCode(this.rankingPoint)) * 31) + Integer.hashCode(this.rank)) * 31) + this.rankText.hashCode()) * 31) + Long.hashCode(this.nanoTime);
    }

    public final boolean isAppEvent() {
        return this.isAppEvent;
    }

    public String toString() {
        return "GiftRankingChangedBcsvrResponse(isAppEvent=" + this.isAppEvent + ", eventId=" + this.eventId + ", rankingPoint=" + this.rankingPoint + ", rank=" + this.rank + ", rankText=" + this.rankText + ", nanoTime=" + this.nanoTime + ')';
    }
}
