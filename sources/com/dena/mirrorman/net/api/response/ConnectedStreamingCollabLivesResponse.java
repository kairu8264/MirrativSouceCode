package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ConnectedStreamingCollabLivesResponse {
    public static final int $stable = 8;
    private final List<ConnectedStreamingCollabLive> lives;
    private final Status status;

    public ConnectedStreamingCollabLivesResponse(Status status, List<ConnectedStreamingCollabLive> list) {
        p.h(status, "status");
        p.h(list, "lives");
        this.status = status;
        this.lives = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectedStreamingCollabLivesResponse copy$default(ConnectedStreamingCollabLivesResponse connectedStreamingCollabLivesResponse, Status status, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = connectedStreamingCollabLivesResponse.status;
        }
        if ((i10 & 2) != 0) {
            list = connectedStreamingCollabLivesResponse.lives;
        }
        return connectedStreamingCollabLivesResponse.copy(status, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final List<ConnectedStreamingCollabLive> component2() {
        return this.lives;
    }

    public final ConnectedStreamingCollabLivesResponse copy(Status status, List<ConnectedStreamingCollabLive> list) {
        p.h(status, "status");
        p.h(list, "lives");
        return new ConnectedStreamingCollabLivesResponse(status, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectedStreamingCollabLivesResponse) {
            ConnectedStreamingCollabLivesResponse connectedStreamingCollabLivesResponse = (ConnectedStreamingCollabLivesResponse) obj;
            return p.c(this.status, connectedStreamingCollabLivesResponse.status) && p.c(this.lives, connectedStreamingCollabLivesResponse.lives);
        }
        return false;
    }

    public final List<ConnectedStreamingCollabLive> getLives() {
        return this.lives;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.lives.hashCode();
    }

    public String toString() {
        return "ConnectedStreamingCollabLivesResponse(status=" + this.status + ", lives=" + this.lives + ')';
    }
}
