package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.LinkedLive;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveLinkedBcsvrResponse {
    public static final int $stable = 8;
    private final LinkedLive linkedLive;
    private final LinkedLive live;

    /* renamed from: t  reason: collision with root package name */
    private final int f26187t;

    public LiveLinkedBcsvrResponse(LinkedLive linkedLive, LinkedLive linkedLive2, int i10) {
        p.h(linkedLive, "linkedLive");
        p.h(linkedLive2, MRLog.TARGET_TYPE_LIVE);
        this.linkedLive = linkedLive;
        this.live = linkedLive2;
        this.f26187t = i10;
    }

    public static /* synthetic */ LiveLinkedBcsvrResponse copy$default(LiveLinkedBcsvrResponse liveLinkedBcsvrResponse, LinkedLive linkedLive, LinkedLive linkedLive2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkedLive = liveLinkedBcsvrResponse.linkedLive;
        }
        if ((i11 & 2) != 0) {
            linkedLive2 = liveLinkedBcsvrResponse.live;
        }
        if ((i11 & 4) != 0) {
            i10 = liveLinkedBcsvrResponse.f26187t;
        }
        return liveLinkedBcsvrResponse.copy(linkedLive, linkedLive2, i10);
    }

    public final LinkedLive component1() {
        return this.linkedLive;
    }

    public final LinkedLive component2() {
        return this.live;
    }

    public final int component3() {
        return this.f26187t;
    }

    public final LiveLinkedBcsvrResponse copy(LinkedLive linkedLive, LinkedLive linkedLive2, int i10) {
        p.h(linkedLive, "linkedLive");
        p.h(linkedLive2, MRLog.TARGET_TYPE_LIVE);
        return new LiveLinkedBcsvrResponse(linkedLive, linkedLive2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveLinkedBcsvrResponse) {
            LiveLinkedBcsvrResponse liveLinkedBcsvrResponse = (LiveLinkedBcsvrResponse) obj;
            return p.c(this.linkedLive, liveLinkedBcsvrResponse.linkedLive) && p.c(this.live, liveLinkedBcsvrResponse.live) && this.f26187t == liveLinkedBcsvrResponse.f26187t;
        }
        return false;
    }

    public final LinkedLive getLinkedLive() {
        return this.linkedLive;
    }

    public final LinkedLive getLive() {
        return this.live;
    }

    public final int getT() {
        return this.f26187t;
    }

    public int hashCode() {
        return (((this.linkedLive.hashCode() * 31) + this.live.hashCode()) * 31) + Integer.hashCode(this.f26187t);
    }

    public String toString() {
        return "LiveLinkedBcsvrResponse(linkedLive=" + this.linkedLive + ", live=" + this.live + ", t=" + this.f26187t + ')';
    }
}
