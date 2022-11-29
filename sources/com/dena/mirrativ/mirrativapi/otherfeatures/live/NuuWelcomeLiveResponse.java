package com.dena.mirrativ.mirrativapi.otherfeatures.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class NuuWelcomeLiveResponse {
    private final String liveId;
    private final Status status;

    public NuuWelcomeLiveResponse(String str, Status status) {
        p.h(str, "liveId");
        p.h(status, "status");
        this.liveId = str;
        this.status = status;
    }

    public static /* synthetic */ NuuWelcomeLiveResponse copy$default(NuuWelcomeLiveResponse nuuWelcomeLiveResponse, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = nuuWelcomeLiveResponse.liveId;
        }
        if ((i10 & 2) != 0) {
            status = nuuWelcomeLiveResponse.status;
        }
        return nuuWelcomeLiveResponse.copy(str, status);
    }

    public final String component1() {
        return this.liveId;
    }

    public final Status component2() {
        return this.status;
    }

    public final NuuWelcomeLiveResponse copy(String str, Status status) {
        p.h(str, "liveId");
        p.h(status, "status");
        return new NuuWelcomeLiveResponse(str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NuuWelcomeLiveResponse) {
            NuuWelcomeLiveResponse nuuWelcomeLiveResponse = (NuuWelcomeLiveResponse) obj;
            return p.c(this.liveId, nuuWelcomeLiveResponse.liveId) && p.c(this.status, nuuWelcomeLiveResponse.status);
        }
        return false;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.liveId.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "NuuWelcomeLiveResponse(liveId=" + this.liveId + ", status=" + this.status + ')';
    }
}
