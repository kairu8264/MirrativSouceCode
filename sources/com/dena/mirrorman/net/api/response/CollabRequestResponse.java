package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.webrtc.entity.StunServer;
import com.dena.mirrorman.webrtc.entity.TurnServer;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class CollabRequestResponse {
    public static final int $stable = 8;
    private final String collabUnicastHost;
    private final String collabUnicastKey;
    private final int collabUnicastPort;
    private final Status status;
    private final String streamingCollabLiveId;
    private final List<StunServer> stunServers;
    private final List<TurnServer> turnServers;

    public CollabRequestResponse(Status status, String str, int i10, String str2, List<StunServer> list, List<TurnServer> list2, String str3) {
        p.h(status, "status");
        p.h(str, "collabUnicastHost");
        p.h(str2, "collabUnicastKey");
        p.h(list, "stunServers");
        p.h(list2, "turnServers");
        p.h(str3, "streamingCollabLiveId");
        this.status = status;
        this.collabUnicastHost = str;
        this.collabUnicastPort = i10;
        this.collabUnicastKey = str2;
        this.stunServers = list;
        this.turnServers = list2;
        this.streamingCollabLiveId = str3;
    }

    public static /* synthetic */ CollabRequestResponse copy$default(CollabRequestResponse collabRequestResponse, Status status, String str, int i10, String str2, List list, List list2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            status = collabRequestResponse.status;
        }
        if ((i11 & 2) != 0) {
            str = collabRequestResponse.collabUnicastHost;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            i10 = collabRequestResponse.collabUnicastPort;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str2 = collabRequestResponse.collabUnicastKey;
        }
        String str5 = str2;
        List<StunServer> list3 = list;
        if ((i11 & 16) != 0) {
            list3 = collabRequestResponse.stunServers;
        }
        List list4 = list3;
        List<TurnServer> list5 = list2;
        if ((i11 & 32) != 0) {
            list5 = collabRequestResponse.turnServers;
        }
        List list6 = list5;
        if ((i11 & 64) != 0) {
            str3 = collabRequestResponse.streamingCollabLiveId;
        }
        return collabRequestResponse.copy(status, str4, i12, str5, list4, list6, str3);
    }

    public final Status component1() {
        return this.status;
    }

    public final String component2() {
        return this.collabUnicastHost;
    }

    public final int component3() {
        return this.collabUnicastPort;
    }

    public final String component4() {
        return this.collabUnicastKey;
    }

    public final List<StunServer> component5() {
        return this.stunServers;
    }

    public final List<TurnServer> component6() {
        return this.turnServers;
    }

    public final String component7() {
        return this.streamingCollabLiveId;
    }

    public final CollabRequestResponse copy(Status status, String str, int i10, String str2, List<StunServer> list, List<TurnServer> list2, String str3) {
        p.h(status, "status");
        p.h(str, "collabUnicastHost");
        p.h(str2, "collabUnicastKey");
        p.h(list, "stunServers");
        p.h(list2, "turnServers");
        p.h(str3, "streamingCollabLiveId");
        return new CollabRequestResponse(status, str, i10, str2, list, list2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabRequestResponse) {
            CollabRequestResponse collabRequestResponse = (CollabRequestResponse) obj;
            return p.c(this.status, collabRequestResponse.status) && p.c(this.collabUnicastHost, collabRequestResponse.collabUnicastHost) && this.collabUnicastPort == collabRequestResponse.collabUnicastPort && p.c(this.collabUnicastKey, collabRequestResponse.collabUnicastKey) && p.c(this.stunServers, collabRequestResponse.stunServers) && p.c(this.turnServers, collabRequestResponse.turnServers) && p.c(this.streamingCollabLiveId, collabRequestResponse.streamingCollabLiveId);
        }
        return false;
    }

    public final String getCollabUnicastHost() {
        return this.collabUnicastHost;
    }

    public final String getCollabUnicastKey() {
        return this.collabUnicastKey;
    }

    public final int getCollabUnicastPort() {
        return this.collabUnicastPort;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getStreamingCollabLiveId() {
        return this.streamingCollabLiveId;
    }

    public final List<StunServer> getStunServers() {
        return this.stunServers;
    }

    public final List<TurnServer> getTurnServers() {
        return this.turnServers;
    }

    public int hashCode() {
        return (((((((((((this.status.hashCode() * 31) + this.collabUnicastHost.hashCode()) * 31) + Integer.hashCode(this.collabUnicastPort)) * 31) + this.collabUnicastKey.hashCode()) * 31) + this.stunServers.hashCode()) * 31) + this.turnServers.hashCode()) * 31) + this.streamingCollabLiveId.hashCode();
    }

    public String toString() {
        return "CollabRequestResponse(status=" + this.status + ", collabUnicastHost=" + this.collabUnicastHost + ", collabUnicastPort=" + this.collabUnicastPort + ", collabUnicastKey=" + this.collabUnicastKey + ", stunServers=" + this.stunServers + ", turnServers=" + this.turnServers + ", streamingCollabLiveId=" + this.streamingCollabLiveId + ')';
    }
}
