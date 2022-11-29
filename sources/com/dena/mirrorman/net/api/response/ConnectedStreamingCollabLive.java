package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ConnectedStreamingCollabLive {
    public static final int $stable = 8;
    @b(BooleanTypeAdapter.class)
    private final boolean isLeader;
    private final LiveBasicParams live;

    public ConnectedStreamingCollabLive(LiveBasicParams liveBasicParams, boolean z10) {
        p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        this.live = liveBasicParams;
        this.isLeader = z10;
    }

    public static /* synthetic */ ConnectedStreamingCollabLive copy$default(ConnectedStreamingCollabLive connectedStreamingCollabLive, LiveBasicParams liveBasicParams, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            liveBasicParams = connectedStreamingCollabLive.live;
        }
        if ((i10 & 2) != 0) {
            z10 = connectedStreamingCollabLive.isLeader;
        }
        return connectedStreamingCollabLive.copy(liveBasicParams, z10);
    }

    public final LiveBasicParams component1() {
        return this.live;
    }

    public final boolean component2() {
        return this.isLeader;
    }

    public final ConnectedStreamingCollabLive copy(LiveBasicParams liveBasicParams, boolean z10) {
        p.h(liveBasicParams, MRLog.TARGET_TYPE_LIVE);
        return new ConnectedStreamingCollabLive(liveBasicParams, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectedStreamingCollabLive) {
            ConnectedStreamingCollabLive connectedStreamingCollabLive = (ConnectedStreamingCollabLive) obj;
            return p.c(this.live, connectedStreamingCollabLive.live) && this.isLeader == connectedStreamingCollabLive.isLeader;
        }
        return false;
    }

    public final LiveBasicParams getLive() {
        return this.live;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.live.hashCode() * 31;
        boolean z10 = this.isLeader;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isLeader() {
        return this.isLeader;
    }

    public String toString() {
        return "ConnectedStreamingCollabLive(live=" + this.live + ", isLeader=" + this.isLeader + ')';
    }
}
