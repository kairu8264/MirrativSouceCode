package com.dena.mirrorman.net.bcsvr.response;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameDisconnectBcsvrResponse {
    public static final int $stable = 8;
    private final String liveGameId;
    private final List<String> userIds;

    public LiveGameDisconnectBcsvrResponse(String str, List<String> list) {
        p.h(str, "liveGameId");
        p.h(list, "userIds");
        this.liveGameId = str;
        this.userIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveGameDisconnectBcsvrResponse copy$default(LiveGameDisconnectBcsvrResponse liveGameDisconnectBcsvrResponse, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveGameDisconnectBcsvrResponse.liveGameId;
        }
        if ((i10 & 2) != 0) {
            list = liveGameDisconnectBcsvrResponse.userIds;
        }
        return liveGameDisconnectBcsvrResponse.copy(str, list);
    }

    public final String component1() {
        return this.liveGameId;
    }

    public final List<String> component2() {
        return this.userIds;
    }

    public final LiveGameDisconnectBcsvrResponse copy(String str, List<String> list) {
        p.h(str, "liveGameId");
        p.h(list, "userIds");
        return new LiveGameDisconnectBcsvrResponse(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameDisconnectBcsvrResponse) {
            LiveGameDisconnectBcsvrResponse liveGameDisconnectBcsvrResponse = (LiveGameDisconnectBcsvrResponse) obj;
            return p.c(this.liveGameId, liveGameDisconnectBcsvrResponse.liveGameId) && p.c(this.userIds, liveGameDisconnectBcsvrResponse.userIds);
        }
        return false;
    }

    public final String getLiveGameId() {
        return this.liveGameId;
    }

    public final List<String> getUserIds() {
        return this.userIds;
    }

    public int hashCode() {
        return (this.liveGameId.hashCode() * 31) + this.userIds.hashCode();
    }

    public String toString() {
        return "LiveGameDisconnectBcsvrResponse(liveGameId=" + this.liveGameId + ", userIds=" + this.userIds + ')';
    }
}
