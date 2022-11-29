package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class ShooterAcceptMatchingResponse {
    public static final int $stable = 8;
    private final String liveId;
    private final Status status;

    public ShooterAcceptMatchingResponse(String str, Status status) {
        p.h(str, "liveId");
        p.h(status, "status");
        this.liveId = str;
        this.status = status;
    }

    public static /* synthetic */ ShooterAcceptMatchingResponse copy$default(ShooterAcceptMatchingResponse shooterAcceptMatchingResponse, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shooterAcceptMatchingResponse.liveId;
        }
        if ((i10 & 2) != 0) {
            status = shooterAcceptMatchingResponse.status;
        }
        return shooterAcceptMatchingResponse.copy(str, status);
    }

    public final String component1() {
        return this.liveId;
    }

    public final Status component2() {
        return this.status;
    }

    public final ShooterAcceptMatchingResponse copy(String str, Status status) {
        p.h(str, "liveId");
        p.h(status, "status");
        return new ShooterAcceptMatchingResponse(str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterAcceptMatchingResponse) {
            ShooterAcceptMatchingResponse shooterAcceptMatchingResponse = (ShooterAcceptMatchingResponse) obj;
            return p.c(this.liveId, shooterAcceptMatchingResponse.liveId) && p.c(this.status, shooterAcceptMatchingResponse.status);
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
        return "ShooterAcceptMatchingResponse(liveId=" + this.liveId + ", status=" + this.status + ')';
    }
}
