package com.dena.mirrativ.mirrativapi.livegame;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameStartResponse implements Serializable {
    private final boolean isLandscape;
    private final String launchUrl;
    private final String liveGameId;
    private final String playId;
    private final Status status;

    public LiveGameStartResponse(Status status, String str, String str2, String str3, boolean z10) {
        p.h(status, "status");
        p.h(str, "liveGameId");
        p.h(str2, "launchUrl");
        p.h(str3, "playId");
        this.status = status;
        this.liveGameId = str;
        this.launchUrl = str2;
        this.playId = str3;
        this.isLandscape = z10;
    }

    public static /* synthetic */ LiveGameStartResponse copy$default(LiveGameStartResponse liveGameStartResponse, Status status, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveGameStartResponse.status;
        }
        if ((i10 & 2) != 0) {
            str = liveGameStartResponse.liveGameId;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = liveGameStartResponse.launchUrl;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = liveGameStartResponse.playId;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            z10 = liveGameStartResponse.isLandscape;
        }
        return liveGameStartResponse.copy(status, str4, str5, str6, z10);
    }

    public final Status component1() {
        return this.status;
    }

    public final String component2() {
        return this.liveGameId;
    }

    public final String component3() {
        return this.launchUrl;
    }

    public final String component4() {
        return this.playId;
    }

    public final boolean component5() {
        return this.isLandscape;
    }

    public final LiveGameStartResponse copy(Status status, String str, String str2, String str3, boolean z10) {
        p.h(status, "status");
        p.h(str, "liveGameId");
        p.h(str2, "launchUrl");
        p.h(str3, "playId");
        return new LiveGameStartResponse(status, str, str2, str3, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameStartResponse) {
            LiveGameStartResponse liveGameStartResponse = (LiveGameStartResponse) obj;
            return p.c(this.status, liveGameStartResponse.status) && p.c(this.liveGameId, liveGameStartResponse.liveGameId) && p.c(this.launchUrl, liveGameStartResponse.launchUrl) && p.c(this.playId, liveGameStartResponse.playId) && this.isLandscape == liveGameStartResponse.isLandscape;
        }
        return false;
    }

    public final String getLaunchUrl() {
        return this.launchUrl;
    }

    public final String getLiveGameId() {
        return this.liveGameId;
    }

    public final String getPlayId() {
        return this.playId;
    }

    public final Status getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.status.hashCode() * 31) + this.liveGameId.hashCode()) * 31) + this.launchUrl.hashCode()) * 31) + this.playId.hashCode()) * 31;
        boolean z10 = this.isLandscape;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isLandscape() {
        return this.isLandscape;
    }

    public String toString() {
        return "LiveGameStartResponse(status=" + this.status + ", liveGameId=" + this.liveGameId + ", launchUrl=" + this.launchUrl + ", playId=" + this.playId + ", isLandscape=" + this.isLandscape + ')';
    }
}
