package com.dena.mirrorman.net.api.response.user;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class PurchaseContinuousLiveHolidayResponse {
    public static final int $stable = 8;
    private final int continuousLiveHolidayNum;
    private final int remainingFreeCoins;
    private final int remainingPaidCoins;
    private final Status status;

    public PurchaseContinuousLiveHolidayResponse(int i10, int i11, int i12, Status status) {
        p.h(status, "status");
        this.continuousLiveHolidayNum = i10;
        this.remainingFreeCoins = i11;
        this.remainingPaidCoins = i12;
        this.status = status;
    }

    public final int getContinuousLiveHolidayNum() {
        return this.continuousLiveHolidayNum;
    }

    public final int getRemainingFreeCoins() {
        return this.remainingFreeCoins;
    }

    public final int getRemainingPaidCoins() {
        return this.remainingPaidCoins;
    }

    public final Status getStatus() {
        return this.status;
    }
}
