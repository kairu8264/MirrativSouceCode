package com.dena.mirrativ.mirrativapi.core;

import jo.p;

/* loaded from: classes2.dex */
public final class StatusResponse {
    private final Status status;

    public StatusResponse(Status status) {
        p.h(status, "status");
        this.status = status;
    }

    public static /* synthetic */ StatusResponse copy$default(StatusResponse statusResponse, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = statusResponse.status;
        }
        return statusResponse.copy(status);
    }

    public final Status component1() {
        return this.status;
    }

    public final StatusResponse copy(Status status) {
        p.h(status, "status");
        return new StatusResponse(status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StatusResponse) && p.c(this.status, ((StatusResponse) obj).status);
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public String toString() {
        return "StatusResponse(status=" + this.status + ')';
    }
}
