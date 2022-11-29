package com.dena.mirrorman.net.api.response.live;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveOwnedCustomVideoBitrate {
    public static final int $stable = 8;
    private Integer high;
    private Integer low;
    private Integer middle;

    public LiveOwnedCustomVideoBitrate() {
        this(null, null, null, 7, null);
    }

    public LiveOwnedCustomVideoBitrate(Integer num, Integer num2, Integer num3) {
        this.high = num;
        this.middle = num2;
        this.low = num3;
    }

    public static /* synthetic */ LiveOwnedCustomVideoBitrate copy$default(LiveOwnedCustomVideoBitrate liveOwnedCustomVideoBitrate, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = liveOwnedCustomVideoBitrate.high;
        }
        if ((i10 & 2) != 0) {
            num2 = liveOwnedCustomVideoBitrate.middle;
        }
        if ((i10 & 4) != 0) {
            num3 = liveOwnedCustomVideoBitrate.low;
        }
        return liveOwnedCustomVideoBitrate.copy(num, num2, num3);
    }

    public final Integer component1() {
        return this.high;
    }

    public final Integer component2() {
        return this.middle;
    }

    public final Integer component3() {
        return this.low;
    }

    public final LiveOwnedCustomVideoBitrate copy(Integer num, Integer num2, Integer num3) {
        return new LiveOwnedCustomVideoBitrate(num, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveOwnedCustomVideoBitrate) {
            LiveOwnedCustomVideoBitrate liveOwnedCustomVideoBitrate = (LiveOwnedCustomVideoBitrate) obj;
            return p.c(this.high, liveOwnedCustomVideoBitrate.high) && p.c(this.middle, liveOwnedCustomVideoBitrate.middle) && p.c(this.low, liveOwnedCustomVideoBitrate.low);
        }
        return false;
    }

    public final Integer getHigh() {
        return this.high;
    }

    public final Integer getLow() {
        return this.low;
    }

    public final Integer getMiddle() {
        return this.middle;
    }

    public int hashCode() {
        Integer num = this.high;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.middle;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.low;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setHigh(Integer num) {
        this.high = num;
    }

    public final void setLow(Integer num) {
        this.low = num;
    }

    public final void setMiddle(Integer num) {
        this.middle = num;
    }

    public String toString() {
        return "LiveOwnedCustomVideoBitrate(high=" + this.high + ", middle=" + this.middle + ", low=" + this.low + ')';
    }

    public /* synthetic */ LiveOwnedCustomVideoBitrate(Integer num, Integer num2, Integer num3, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3);
    }
}
