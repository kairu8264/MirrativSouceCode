package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ViewerAvatarsResponse {
    public static final int $stable = 8;
    private final Status status;
    private final List<GroupShotViewer> viewers;

    public ViewerAvatarsResponse(List<GroupShotViewer> list, Status status) {
        p.h(list, "viewers");
        p.h(status, "status");
        this.viewers = list;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewerAvatarsResponse copy$default(ViewerAvatarsResponse viewerAvatarsResponse, List list, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = viewerAvatarsResponse.viewers;
        }
        if ((i10 & 2) != 0) {
            status = viewerAvatarsResponse.status;
        }
        return viewerAvatarsResponse.copy(list, status);
    }

    public final List<GroupShotViewer> component1() {
        return this.viewers;
    }

    public final Status component2() {
        return this.status;
    }

    public final ViewerAvatarsResponse copy(List<GroupShotViewer> list, Status status) {
        p.h(list, "viewers");
        p.h(status, "status");
        return new ViewerAvatarsResponse(list, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewerAvatarsResponse) {
            ViewerAvatarsResponse viewerAvatarsResponse = (ViewerAvatarsResponse) obj;
            return p.c(this.viewers, viewerAvatarsResponse.viewers) && p.c(this.status, viewerAvatarsResponse.status);
        }
        return false;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<GroupShotViewer> getViewers() {
        return this.viewers;
    }

    public int hashCode() {
        return (this.viewers.hashCode() * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ViewerAvatarsResponse(viewers=" + this.viewers + ", status=" + this.status + ')';
    }
}
