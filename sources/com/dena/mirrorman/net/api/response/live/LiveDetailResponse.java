package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveDetailResponse extends LiveDetailParams {
    public static final int $stable = 8;
    private final Status status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveDetailResponse(Status status) {
        super(null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, false, null, 1073741823, null);
        p.h(status, "status");
        this.status = status;
    }

    public static /* synthetic */ LiveDetailResponse copy$default(LiveDetailResponse liveDetailResponse, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveDetailResponse.status;
        }
        return liveDetailResponse.copy(status);
    }

    public final Status component1() {
        return this.status;
    }

    public final LiveDetailResponse copy(Status status) {
        p.h(status, "status");
        return new LiveDetailResponse(status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveDetailResponse) && p.c(this.status, ((LiveDetailResponse) obj).status);
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return "LiveDetailResponse(status=" + this.status + ')';
    }
}
