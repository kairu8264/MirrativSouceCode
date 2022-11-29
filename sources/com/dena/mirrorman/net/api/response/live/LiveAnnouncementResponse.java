package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveAnnouncementResponse {
    public static final int $stable = 8;
    private final LiveAnnouncement liveAnnouncement;
    private final Status status;

    public LiveAnnouncementResponse(LiveAnnouncement liveAnnouncement, Status status) {
        p.h(liveAnnouncement, "liveAnnouncement");
        p.h(status, "status");
        this.liveAnnouncement = liveAnnouncement;
        this.status = status;
    }

    public static /* synthetic */ LiveAnnouncementResponse copy$default(LiveAnnouncementResponse liveAnnouncementResponse, LiveAnnouncement liveAnnouncement, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            liveAnnouncement = liveAnnouncementResponse.liveAnnouncement;
        }
        if ((i10 & 2) != 0) {
            status = liveAnnouncementResponse.status;
        }
        return liveAnnouncementResponse.copy(liveAnnouncement, status);
    }

    public final LiveAnnouncement component1() {
        return this.liveAnnouncement;
    }

    public final Status component2() {
        return this.status;
    }

    public final LiveAnnouncementResponse copy(LiveAnnouncement liveAnnouncement, Status status) {
        p.h(liveAnnouncement, "liveAnnouncement");
        p.h(status, "status");
        return new LiveAnnouncementResponse(liveAnnouncement, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveAnnouncementResponse) {
            LiveAnnouncementResponse liveAnnouncementResponse = (LiveAnnouncementResponse) obj;
            return p.c(this.liveAnnouncement, liveAnnouncementResponse.liveAnnouncement) && p.c(this.status, liveAnnouncementResponse.status);
        }
        return false;
    }

    public final LiveAnnouncement getLiveAnnouncement() {
        return this.liveAnnouncement;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.liveAnnouncement.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "LiveAnnouncementResponse(liveAnnouncement=" + this.liveAnnouncement + ", status=" + this.status + ')';
    }
}
