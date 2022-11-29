package com.dena.mirrorman.net.api.response;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class FeverValue {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int currentMeter;
    private final long endsAt;
    private final int maxMeter;
    private final long startsAt;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final FeverValue convert(GiftGachaUserStocksResponse giftGachaUserStocksResponse) {
            p.h(giftGachaUserStocksResponse, "response");
            return new FeverValue(giftGachaUserStocksResponse.getCurrentMeter(), giftGachaUserStocksResponse.getMaxMeter(), giftGachaUserStocksResponse.getStartsAt(), giftGachaUserStocksResponse.getEndsAt());
        }
    }

    public FeverValue(int i10, int i11, long j10, long j11) {
        this.currentMeter = i10;
        this.maxMeter = i11;
        this.startsAt = j10;
        this.endsAt = j11;
    }

    public static /* synthetic */ FeverValue copy$default(FeverValue feverValue, int i10, int i11, long j10, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = feverValue.currentMeter;
        }
        if ((i12 & 2) != 0) {
            i11 = feverValue.maxMeter;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            j10 = feverValue.startsAt;
        }
        long j12 = j10;
        if ((i12 & 8) != 0) {
            j11 = feverValue.endsAt;
        }
        return feverValue.copy(i10, i13, j12, j11);
    }

    public final int component1() {
        return this.currentMeter;
    }

    public final int component2() {
        return this.maxMeter;
    }

    public final long component3() {
        return this.startsAt;
    }

    public final long component4() {
        return this.endsAt;
    }

    public final FeverValue copy(int i10, int i11, long j10, long j11) {
        return new FeverValue(i10, i11, j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeverValue) {
            FeverValue feverValue = (FeverValue) obj;
            return this.currentMeter == feverValue.currentMeter && this.maxMeter == feverValue.maxMeter && this.startsAt == feverValue.startsAt && this.endsAt == feverValue.endsAt;
        }
        return false;
    }

    public final int getCurrentMeter() {
        return this.currentMeter;
    }

    public final long getEndsAt() {
        return this.endsAt;
    }

    public final int getMaxMeter() {
        return this.maxMeter;
    }

    public final long getStartsAt() {
        return this.startsAt;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.currentMeter) * 31) + Integer.hashCode(this.maxMeter)) * 31) + Long.hashCode(this.startsAt)) * 31) + Long.hashCode(this.endsAt);
    }

    public String toString() {
        return "FeverValue(currentMeter=" + this.currentMeter + ", maxMeter=" + this.maxMeter + ", startsAt=" + this.startsAt + ", endsAt=" + this.endsAt + ')';
    }
}
