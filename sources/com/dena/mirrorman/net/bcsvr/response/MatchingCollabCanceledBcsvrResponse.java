package com.dena.mirrorman.net.bcsvr.response;

import jo.p;

/* loaded from: classes2.dex */
public final class MatchingCollabCanceledBcsvrResponse {
    public static final int $stable = 0;
    private final String userId;

    public MatchingCollabCanceledBcsvrResponse(String str) {
        p.h(str, "userId");
        this.userId = str;
    }

    public static /* synthetic */ MatchingCollabCanceledBcsvrResponse copy$default(MatchingCollabCanceledBcsvrResponse matchingCollabCanceledBcsvrResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = matchingCollabCanceledBcsvrResponse.userId;
        }
        return matchingCollabCanceledBcsvrResponse.copy(str);
    }

    public final String component1() {
        return this.userId;
    }

    public final MatchingCollabCanceledBcsvrResponse copy(String str) {
        p.h(str, "userId");
        return new MatchingCollabCanceledBcsvrResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MatchingCollabCanceledBcsvrResponse) && p.c(this.userId, ((MatchingCollabCanceledBcsvrResponse) obj).userId);
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode();
    }

    public String toString() {
        return "MatchingCollabCanceledBcsvrResponse(userId=" + this.userId + ')';
    }
}
