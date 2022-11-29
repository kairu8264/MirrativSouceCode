package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.webrtc.entity.StunServer;
import com.dena.mirrorman.webrtc.entity.TurnServer;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class AcceptedMatchedCollabResponse {
    public static final int $stable = 8;
    private final String collabUnicastHost;
    private final String collabUnicastKey;
    private final int collabUnicastPort;
    @b(BooleanTypeAdapter.class)
    private final boolean isLeader;
    private final String matchedLiveId;
    private final String matchedUserId;
    private final String matchedUserName;
    private final Status status;
    private final List<StunServer> stunServers;
    private final List<TurnServer> turnServers;

    public AcceptedMatchedCollabResponse(Status status, String str, int i10, String str2, List<StunServer> list, List<TurnServer> list2, boolean z10, String str3, String str4, String str5) {
        p.h(status, "status");
        p.h(str, "collabUnicastHost");
        p.h(str2, "collabUnicastKey");
        p.h(list, "stunServers");
        p.h(list2, "turnServers");
        p.h(str3, "matchedLiveId");
        p.h(str4, "matchedUserId");
        p.h(str5, "matchedUserName");
        this.status = status;
        this.collabUnicastHost = str;
        this.collabUnicastPort = i10;
        this.collabUnicastKey = str2;
        this.stunServers = list;
        this.turnServers = list2;
        this.isLeader = z10;
        this.matchedLiveId = str3;
        this.matchedUserId = str4;
        this.matchedUserName = str5;
    }

    public final Status component1() {
        return this.status;
    }

    public final String component10() {
        return this.matchedUserName;
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

    public final boolean component7() {
        return this.isLeader;
    }

    public final String component8() {
        return this.matchedLiveId;
    }

    public final String component9() {
        return this.matchedUserId;
    }

    public final AcceptedMatchedCollabResponse copy(Status status, String str, int i10, String str2, List<StunServer> list, List<TurnServer> list2, boolean z10, String str3, String str4, String str5) {
        p.h(status, "status");
        p.h(str, "collabUnicastHost");
        p.h(str2, "collabUnicastKey");
        p.h(list, "stunServers");
        p.h(list2, "turnServers");
        p.h(str3, "matchedLiveId");
        p.h(str4, "matchedUserId");
        p.h(str5, "matchedUserName");
        return new AcceptedMatchedCollabResponse(status, str, i10, str2, list, list2, z10, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AcceptedMatchedCollabResponse) {
            AcceptedMatchedCollabResponse acceptedMatchedCollabResponse = (AcceptedMatchedCollabResponse) obj;
            return p.c(this.status, acceptedMatchedCollabResponse.status) && p.c(this.collabUnicastHost, acceptedMatchedCollabResponse.collabUnicastHost) && this.collabUnicastPort == acceptedMatchedCollabResponse.collabUnicastPort && p.c(this.collabUnicastKey, acceptedMatchedCollabResponse.collabUnicastKey) && p.c(this.stunServers, acceptedMatchedCollabResponse.stunServers) && p.c(this.turnServers, acceptedMatchedCollabResponse.turnServers) && this.isLeader == acceptedMatchedCollabResponse.isLeader && p.c(this.matchedLiveId, acceptedMatchedCollabResponse.matchedLiveId) && p.c(this.matchedUserId, acceptedMatchedCollabResponse.matchedUserId) && p.c(this.matchedUserName, acceptedMatchedCollabResponse.matchedUserName);
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

    public final String getMatchedLiveId() {
        return this.matchedLiveId;
    }

    public final String getMatchedUserId() {
        return this.matchedUserId;
    }

    public final String getMatchedUserName() {
        return this.matchedUserName;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((this.status.hashCode() * 31) + this.collabUnicastHost.hashCode()) * 31) + Integer.hashCode(this.collabUnicastPort)) * 31) + this.collabUnicastKey.hashCode()) * 31) + this.stunServers.hashCode()) * 31) + this.turnServers.hashCode()) * 31;
        boolean z10 = this.isLeader;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((hashCode + i10) * 31) + this.matchedLiveId.hashCode()) * 31) + this.matchedUserId.hashCode()) * 31) + this.matchedUserName.hashCode();
    }

    public final boolean isLeader() {
        return this.isLeader;
    }

    public String toString() {
        return "AcceptedMatchedCollabResponse(status=" + this.status + ", collabUnicastHost=" + this.collabUnicastHost + ", collabUnicastPort=" + this.collabUnicastPort + ", collabUnicastKey=" + this.collabUnicastKey + ", stunServers=" + this.stunServers + ", turnServers=" + this.turnServers + ", isLeader=" + this.isLeader + ", matchedLiveId=" + this.matchedLiveId + ", matchedUserId=" + this.matchedUserId + ", matchedUserName=" + this.matchedUserName + ')';
    }
}
