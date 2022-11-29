package com.dena.mirrorman.net.api.response.livegame;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGamePingResponse implements Serializable {
    public static final int $stable = 8;
    private final boolean isPlaying;
    private final Status status;

    public LiveGamePingResponse(Status status, boolean z10) {
        p.h(status, "status");
        this.status = status;
        this.isPlaying = z10;
    }

    public static /* synthetic */ LiveGamePingResponse copy$default(LiveGamePingResponse liveGamePingResponse, Status status, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveGamePingResponse.status;
        }
        if ((i10 & 2) != 0) {
            z10 = liveGamePingResponse.isPlaying;
        }
        return liveGamePingResponse.copy(status, z10);
    }

    public final Status component1() {
        return this.status;
    }

    public final boolean component2() {
        return this.isPlaying;
    }

    public final LiveGamePingResponse copy(Status status, boolean z10) {
        p.h(status, "status");
        return new LiveGamePingResponse(status, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGamePingResponse) {
            LiveGamePingResponse liveGamePingResponse = (LiveGamePingResponse) obj;
            return p.c(this.status, liveGamePingResponse.status) && this.isPlaying == liveGamePingResponse.isPlaying;
        }
        return false;
    }

    public final Status getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        boolean z10 = this.isPlaying;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public String toString() {
        return "LiveGamePingResponse(status=" + this.status + ", isPlaying=" + this.isPlaying + ')';
    }
}
