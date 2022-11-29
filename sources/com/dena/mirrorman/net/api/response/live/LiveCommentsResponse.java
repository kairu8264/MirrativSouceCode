package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class LiveCommentsResponse {
    public static final int $stable = 8;
    private final List<LiveCommentFromApi> comments;
    private final Status status;

    public LiveCommentsResponse() {
        this(null, null, 3, null);
    }

    public LiveCommentsResponse(Status status, List<LiveCommentFromApi> list) {
        p.h(status, "status");
        p.h(list, "comments");
        this.status = status;
        this.comments = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveCommentsResponse copy$default(LiveCommentsResponse liveCommentsResponse, Status status, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveCommentsResponse.status;
        }
        if ((i10 & 2) != 0) {
            list = liveCommentsResponse.comments;
        }
        return liveCommentsResponse.copy(status, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final List<LiveCommentFromApi> component2() {
        return this.comments;
    }

    public final LiveCommentsResponse copy(Status status, List<LiveCommentFromApi> list) {
        p.h(status, "status");
        p.h(list, "comments");
        return new LiveCommentsResponse(status, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveCommentsResponse) {
            LiveCommentsResponse liveCommentsResponse = (LiveCommentsResponse) obj;
            return p.c(this.status, liveCommentsResponse.status) && p.c(this.comments, liveCommentsResponse.comments);
        }
        return false;
    }

    public final List<LiveCommentFromApi> getComments() {
        return this.comments;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.comments.hashCode();
    }

    public String toString() {
        return "LiveCommentsResponse(status=" + this.status + ", comments=" + this.comments + ')';
    }

    public /* synthetic */ LiveCommentsResponse(Status status, List list, int i10, h hVar) {
        this((i10 & 1) != 0 ? Status.Companion.createEmptyStatus() : status, (i10 & 2) != 0 ? s.k() : list);
    }
}
