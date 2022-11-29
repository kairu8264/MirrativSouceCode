package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.webrtc.entity.StunServer;
import com.dena.mirrorman.webrtc.entity.TurnServer;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class CollabMatchingStartResponse {
    public static final int $stable = 8;
    private final Status status;
    private final List<StunServer> stunServers;
    private final List<TurnServer> turnServers;

    public CollabMatchingStartResponse(Status status, List<StunServer> list, List<TurnServer> list2) {
        p.h(status, "status");
        p.h(list, "stunServers");
        p.h(list2, "turnServers");
        this.status = status;
        this.stunServers = list;
        this.turnServers = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollabMatchingStartResponse copy$default(CollabMatchingStartResponse collabMatchingStartResponse, Status status, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = collabMatchingStartResponse.status;
        }
        if ((i10 & 2) != 0) {
            list = collabMatchingStartResponse.stunServers;
        }
        if ((i10 & 4) != 0) {
            list2 = collabMatchingStartResponse.turnServers;
        }
        return collabMatchingStartResponse.copy(status, list, list2);
    }

    public final Status component1() {
        return this.status;
    }

    public final List<StunServer> component2() {
        return this.stunServers;
    }

    public final List<TurnServer> component3() {
        return this.turnServers;
    }

    public final CollabMatchingStartResponse copy(Status status, List<StunServer> list, List<TurnServer> list2) {
        p.h(status, "status");
        p.h(list, "stunServers");
        p.h(list2, "turnServers");
        return new CollabMatchingStartResponse(status, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabMatchingStartResponse) {
            CollabMatchingStartResponse collabMatchingStartResponse = (CollabMatchingStartResponse) obj;
            return p.c(this.status, collabMatchingStartResponse.status) && p.c(this.stunServers, collabMatchingStartResponse.stunServers) && p.c(this.turnServers, collabMatchingStartResponse.turnServers);
        }
        return false;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<StunServer> getStunServers() {
        return this.stunServers;
    }

    public final List<TurnServer> getTurnServers() {
        return this.turnServers;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.stunServers.hashCode()) * 31) + this.turnServers.hashCode();
    }

    public String toString() {
        return "CollabMatchingStartResponse(status=" + this.status + ", stunServers=" + this.stunServers + ", turnServers=" + this.turnServers + ')';
    }
}
