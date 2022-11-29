package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class LivePolling extends LiveDetailParams {
    public static final int $stable = 8;
    private String moderatorUserId;
    private Status status;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePolling(Status status, String str) {
        super(null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, false, null, 1073741823, null);
        p.h(status, "status");
        this.status = status;
        this.moderatorUserId = str;
    }

    public static /* synthetic */ LivePolling copy$default(LivePolling livePolling, Status status, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = livePolling.status;
        }
        if ((i10 & 2) != 0) {
            str = livePolling.moderatorUserId;
        }
        return livePolling.copy(status, str);
    }

    public final Status component1() {
        return this.status;
    }

    public final String component2() {
        return this.moderatorUserId;
    }

    public final LivePolling copy(Status status, String str) {
        p.h(status, "status");
        return new LivePolling(status, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LivePolling) {
            LivePolling livePolling = (LivePolling) obj;
            return p.c(this.status, livePolling.status) && p.c(this.moderatorUserId, livePolling.moderatorUserId);
        }
        return false;
    }

    public final String getModeratorUserId() {
        return this.moderatorUserId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.moderatorUserId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setModeratorUserId(String str) {
        this.moderatorUserId = str;
    }

    public final void setStatus(Status status) {
        p.h(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        return "LivePolling(status=" + this.status + ", moderatorUserId=" + this.moderatorUserId + ')';
    }
}
