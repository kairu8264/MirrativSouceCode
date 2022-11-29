package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class SeasonYellStatusResponse {
    public static final int $stable = 8;
    private final Status status;
    private final String yellLpUrl;
    private final YellStatus yellStatus;

    public SeasonYellStatusResponse(String str, YellStatus yellStatus, Status status) {
        p.h(str, "yellLpUrl");
        p.h(yellStatus, "yellStatus");
        p.h(status, "status");
        this.yellLpUrl = str;
        this.yellStatus = yellStatus;
        this.status = status;
    }

    public static /* synthetic */ SeasonYellStatusResponse copy$default(SeasonYellStatusResponse seasonYellStatusResponse, String str, YellStatus yellStatus, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = seasonYellStatusResponse.yellLpUrl;
        }
        if ((i10 & 2) != 0) {
            yellStatus = seasonYellStatusResponse.yellStatus;
        }
        if ((i10 & 4) != 0) {
            status = seasonYellStatusResponse.status;
        }
        return seasonYellStatusResponse.copy(str, yellStatus, status);
    }

    public final String component1() {
        return this.yellLpUrl;
    }

    public final YellStatus component2() {
        return this.yellStatus;
    }

    public final Status component3() {
        return this.status;
    }

    public final SeasonYellStatusResponse copy(String str, YellStatus yellStatus, Status status) {
        p.h(str, "yellLpUrl");
        p.h(yellStatus, "yellStatus");
        p.h(status, "status");
        return new SeasonYellStatusResponse(str, yellStatus, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeasonYellStatusResponse) {
            SeasonYellStatusResponse seasonYellStatusResponse = (SeasonYellStatusResponse) obj;
            return p.c(this.yellLpUrl, seasonYellStatusResponse.yellLpUrl) && p.c(this.yellStatus, seasonYellStatusResponse.yellStatus) && p.c(this.status, seasonYellStatusResponse.status);
        }
        return false;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getYellLpUrl() {
        return this.yellLpUrl;
    }

    public final YellStatus getYellStatus() {
        return this.yellStatus;
    }

    public int hashCode() {
        return (((this.yellLpUrl.hashCode() * 31) + this.yellStatus.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "SeasonYellStatusResponse(yellLpUrl=" + this.yellLpUrl + ", yellStatus=" + this.yellStatus + ", status=" + this.status + ')';
    }
}
