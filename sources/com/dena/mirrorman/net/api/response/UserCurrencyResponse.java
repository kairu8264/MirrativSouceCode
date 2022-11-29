package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class UserCurrencyResponse {
    public static final int $stable = 8;
    private final int remainingFreeCoins;
    private final int remainingKandumes;
    @c("remaining_diamonds")
    private final int remainingOrbs;
    private final int remainingPaidCoins;
    private final Status status;

    public UserCurrencyResponse(int i10, int i11, int i12, int i13, Status status) {
        p.h(status, "status");
        this.remainingFreeCoins = i10;
        this.remainingPaidCoins = i11;
        this.remainingKandumes = i12;
        this.remainingOrbs = i13;
        this.status = status;
    }

    public static /* synthetic */ UserCurrencyResponse copy$default(UserCurrencyResponse userCurrencyResponse, int i10, int i11, int i12, int i13, Status status, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = userCurrencyResponse.remainingFreeCoins;
        }
        if ((i14 & 2) != 0) {
            i11 = userCurrencyResponse.remainingPaidCoins;
        }
        int i15 = i11;
        if ((i14 & 4) != 0) {
            i12 = userCurrencyResponse.remainingKandumes;
        }
        int i16 = i12;
        if ((i14 & 8) != 0) {
            i13 = userCurrencyResponse.remainingOrbs;
        }
        int i17 = i13;
        if ((i14 & 16) != 0) {
            status = userCurrencyResponse.status;
        }
        return userCurrencyResponse.copy(i10, i15, i16, i17, status);
    }

    public final int component1() {
        return this.remainingFreeCoins;
    }

    public final int component2() {
        return this.remainingPaidCoins;
    }

    public final int component3() {
        return this.remainingKandumes;
    }

    public final int component4() {
        return this.remainingOrbs;
    }

    public final Status component5() {
        return this.status;
    }

    public final UserCurrencyResponse copy(int i10, int i11, int i12, int i13, Status status) {
        p.h(status, "status");
        return new UserCurrencyResponse(i10, i11, i12, i13, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserCurrencyResponse) {
            UserCurrencyResponse userCurrencyResponse = (UserCurrencyResponse) obj;
            return this.remainingFreeCoins == userCurrencyResponse.remainingFreeCoins && this.remainingPaidCoins == userCurrencyResponse.remainingPaidCoins && this.remainingKandumes == userCurrencyResponse.remainingKandumes && this.remainingOrbs == userCurrencyResponse.remainingOrbs && p.c(this.status, userCurrencyResponse.status);
        }
        return false;
    }

    public final int getRemainingFreeCoins() {
        return this.remainingFreeCoins;
    }

    public final int getRemainingKandumes() {
        return this.remainingKandumes;
    }

    public final int getRemainingOrbs() {
        return this.remainingOrbs;
    }

    public final int getRemainingPaidCoins() {
        return this.remainingPaidCoins;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.remainingFreeCoins) * 31) + Integer.hashCode(this.remainingPaidCoins)) * 31) + Integer.hashCode(this.remainingKandumes)) * 31) + Integer.hashCode(this.remainingOrbs)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "UserCurrencyResponse(remainingFreeCoins=" + this.remainingFreeCoins + ", remainingPaidCoins=" + this.remainingPaidCoins + ", remainingKandumes=" + this.remainingKandumes + ", remainingOrbs=" + this.remainingOrbs + ", status=" + this.status + ')';
    }

    public /* synthetic */ UserCurrencyResponse(int i10, int i11, int i12, int i13, Status status, int i14, h hVar) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13, status);
    }
}
