package com.dena.mirrorman.net.api.response.live;

import jo.p;

/* loaded from: classes2.dex */
public final class LiveOwnedBitrateControlParams {
    public static final int $stable = 0;
    private final Double decreaseRate;
    private final Integer increaseValue;

    public LiveOwnedBitrateControlParams(Integer num, Double d10) {
        this.increaseValue = num;
        this.decreaseRate = d10;
    }

    public static /* synthetic */ LiveOwnedBitrateControlParams copy$default(LiveOwnedBitrateControlParams liveOwnedBitrateControlParams, Integer num, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = liveOwnedBitrateControlParams.increaseValue;
        }
        if ((i10 & 2) != 0) {
            d10 = liveOwnedBitrateControlParams.decreaseRate;
        }
        return liveOwnedBitrateControlParams.copy(num, d10);
    }

    public final Integer component1() {
        return this.increaseValue;
    }

    public final Double component2() {
        return this.decreaseRate;
    }

    public final LiveOwnedBitrateControlParams copy(Integer num, Double d10) {
        return new LiveOwnedBitrateControlParams(num, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveOwnedBitrateControlParams) {
            LiveOwnedBitrateControlParams liveOwnedBitrateControlParams = (LiveOwnedBitrateControlParams) obj;
            return p.c(this.increaseValue, liveOwnedBitrateControlParams.increaseValue) && p.c(this.decreaseRate, liveOwnedBitrateControlParams.decreaseRate);
        }
        return false;
    }

    public final Double getDecreaseRate() {
        return this.decreaseRate;
    }

    public final Integer getIncreaseValue() {
        return this.increaseValue;
    }

    public int hashCode() {
        Integer num = this.increaseValue;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d10 = this.decreaseRate;
        return hashCode + (d10 != null ? d10.hashCode() : 0);
    }

    public String toString() {
        return "LiveOwnedBitrateControlParams(increaseValue=" + this.increaseValue + ", decreaseRate=" + this.decreaseRate + ')';
    }
}
