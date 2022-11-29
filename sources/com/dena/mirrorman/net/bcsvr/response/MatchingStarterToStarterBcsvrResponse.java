package com.dena.mirrorman.net.bcsvr.response;

import jo.p;

/* loaded from: classes2.dex */
public final class MatchingStarterToStarterBcsvrResponse {
    public static final int $stable = 0;
    private final String matchedLiveId;

    public MatchingStarterToStarterBcsvrResponse(String str) {
        p.h(str, "matchedLiveId");
        this.matchedLiveId = str;
    }

    public static /* synthetic */ MatchingStarterToStarterBcsvrResponse copy$default(MatchingStarterToStarterBcsvrResponse matchingStarterToStarterBcsvrResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = matchingStarterToStarterBcsvrResponse.matchedLiveId;
        }
        return matchingStarterToStarterBcsvrResponse.copy(str);
    }

    public final String component1() {
        return this.matchedLiveId;
    }

    public final MatchingStarterToStarterBcsvrResponse copy(String str) {
        p.h(str, "matchedLiveId");
        return new MatchingStarterToStarterBcsvrResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MatchingStarterToStarterBcsvrResponse) && p.c(this.matchedLiveId, ((MatchingStarterToStarterBcsvrResponse) obj).matchedLiveId);
    }

    public final String getMatchedLiveId() {
        return this.matchedLiveId;
    }

    public int hashCode() {
        return this.matchedLiveId.hashCode();
    }

    public String toString() {
        return "MatchingStarterToStarterBcsvrResponse(matchedLiveId=" + this.matchedLiveId + ')';
    }
}
