package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class LiveHeartbeatResponse {
    public static final int $stable = 8;
    private final int giftEventRank;
    @b(BooleanTypeAdapter.class)
    private final boolean isLive;
    @b(BooleanTypeAdapter.class)
    private final boolean isMatchingCollabEnabled;
    private final int onlineUserNum;
    private final Status status;
    private final int totalViewerNum;

    public LiveHeartbeatResponse(Status status, int i10, int i11, int i12, boolean z10, boolean z11) {
        p.h(status, "status");
        this.status = status;
        this.onlineUserNum = i10;
        this.totalViewerNum = i11;
        this.giftEventRank = i12;
        this.isLive = z10;
        this.isMatchingCollabEnabled = z11;
    }

    public static /* synthetic */ LiveHeartbeatResponse copy$default(LiveHeartbeatResponse liveHeartbeatResponse, Status status, int i10, int i11, int i12, boolean z10, boolean z11, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            status = liveHeartbeatResponse.status;
        }
        if ((i13 & 2) != 0) {
            i10 = liveHeartbeatResponse.onlineUserNum;
        }
        int i14 = i10;
        if ((i13 & 4) != 0) {
            i11 = liveHeartbeatResponse.totalViewerNum;
        }
        int i15 = i11;
        if ((i13 & 8) != 0) {
            i12 = liveHeartbeatResponse.giftEventRank;
        }
        int i16 = i12;
        if ((i13 & 16) != 0) {
            z10 = liveHeartbeatResponse.isLive;
        }
        boolean z12 = z10;
        if ((i13 & 32) != 0) {
            z11 = liveHeartbeatResponse.isMatchingCollabEnabled;
        }
        return liveHeartbeatResponse.copy(status, i14, i15, i16, z12, z11);
    }

    public final Status component1() {
        return this.status;
    }

    public final int component2() {
        return this.onlineUserNum;
    }

    public final int component3() {
        return this.totalViewerNum;
    }

    public final int component4() {
        return this.giftEventRank;
    }

    public final boolean component5() {
        return this.isLive;
    }

    public final boolean component6() {
        return this.isMatchingCollabEnabled;
    }

    public final LiveHeartbeatResponse copy(Status status, int i10, int i11, int i12, boolean z10, boolean z11) {
        p.h(status, "status");
        return new LiveHeartbeatResponse(status, i10, i11, i12, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveHeartbeatResponse) {
            LiveHeartbeatResponse liveHeartbeatResponse = (LiveHeartbeatResponse) obj;
            return p.c(this.status, liveHeartbeatResponse.status) && this.onlineUserNum == liveHeartbeatResponse.onlineUserNum && this.totalViewerNum == liveHeartbeatResponse.totalViewerNum && this.giftEventRank == liveHeartbeatResponse.giftEventRank && this.isLive == liveHeartbeatResponse.isLive && this.isMatchingCollabEnabled == liveHeartbeatResponse.isMatchingCollabEnabled;
        }
        return false;
    }

    public final int getGiftEventRank() {
        return this.giftEventRank;
    }

    public final int getOnlineUserNum() {
        return this.onlineUserNum;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getTotalViewerNum() {
        return this.totalViewerNum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.status.hashCode() * 31) + Integer.hashCode(this.onlineUserNum)) * 31) + Integer.hashCode(this.totalViewerNum)) * 31) + Integer.hashCode(this.giftEventRank)) * 31;
        boolean z10 = this.isLive;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isMatchingCollabEnabled;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isMatchingCollabEnabled() {
        return this.isMatchingCollabEnabled;
    }

    public String toString() {
        return "LiveHeartbeatResponse(status=" + this.status + ", onlineUserNum=" + this.onlineUserNum + ", totalViewerNum=" + this.totalViewerNum + ", giftEventRank=" + this.giftEventRank + ", isLive=" + this.isLive + ", isMatchingCollabEnabled=" + this.isMatchingCollabEnabled + ')';
    }
}
