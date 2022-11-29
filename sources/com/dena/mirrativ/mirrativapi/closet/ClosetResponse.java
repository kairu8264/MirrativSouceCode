package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.Referer;
import jo.p;

/* loaded from: classes2.dex */
public final class ClosetResponse {
    private final Closet closet;
    private final Status status;

    public ClosetResponse(Closet closet, Status status) {
        p.h(closet, Referer.CLOSET);
        p.h(status, "status");
        this.closet = closet;
        this.status = status;
    }

    public static /* synthetic */ ClosetResponse copy$default(ClosetResponse closetResponse, Closet closet, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            closet = closetResponse.closet;
        }
        if ((i10 & 2) != 0) {
            status = closetResponse.status;
        }
        return closetResponse.copy(closet, status);
    }

    public final Closet component1() {
        return this.closet;
    }

    public final Status component2() {
        return this.status;
    }

    public final ClosetResponse copy(Closet closet, Status status) {
        p.h(closet, Referer.CLOSET);
        p.h(status, "status");
        return new ClosetResponse(closet, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetResponse) {
            ClosetResponse closetResponse = (ClosetResponse) obj;
            return p.c(this.closet, closetResponse.closet) && p.c(this.status, closetResponse.status);
        }
        return false;
    }

    public final Closet getCloset() {
        return this.closet;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.closet.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ClosetResponse(closet=" + this.closet + ", status=" + this.status + ')';
    }
}
