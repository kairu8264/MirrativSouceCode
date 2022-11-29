package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveCommentResponse {
    public static final int $stable = 8;
    private String comment;
    private Status status;
    private String userId;

    public LiveCommentResponse(Status status, String str, String str2) {
        p.h(status, "status");
        p.h(str, "comment");
        p.h(str2, "userId");
        this.status = status;
        this.comment = str;
        this.userId = str2;
    }

    public static /* synthetic */ LiveCommentResponse copy$default(LiveCommentResponse liveCommentResponse, Status status, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveCommentResponse.status;
        }
        if ((i10 & 2) != 0) {
            str = liveCommentResponse.comment;
        }
        if ((i10 & 4) != 0) {
            str2 = liveCommentResponse.userId;
        }
        return liveCommentResponse.copy(status, str, str2);
    }

    public final Status component1() {
        return this.status;
    }

    public final String component2() {
        return this.comment;
    }

    public final String component3() {
        return this.userId;
    }

    public final LiveCommentResponse copy(Status status, String str, String str2) {
        p.h(status, "status");
        p.h(str, "comment");
        p.h(str2, "userId");
        return new LiveCommentResponse(status, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveCommentResponse) {
            LiveCommentResponse liveCommentResponse = (LiveCommentResponse) obj;
            return p.c(this.status, liveCommentResponse.status) && p.c(this.comment, liveCommentResponse.comment) && p.c(this.userId, liveCommentResponse.userId);
        }
        return false;
    }

    public final String getComment() {
        return this.comment;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.comment.hashCode()) * 31) + this.userId.hashCode();
    }

    public final void setComment(String str) {
        p.h(str, "<set-?>");
        this.comment = str;
    }

    public final void setStatus(Status status) {
        p.h(status, "<set-?>");
        this.status = status;
    }

    public final void setUserId(String str) {
        p.h(str, "<set-?>");
        this.userId = str;
    }

    public String toString() {
        return "LiveCommentResponse(status=" + this.status + ", comment=" + this.comment + ", userId=" + this.userId + ')';
    }

    public /* synthetic */ LiveCommentResponse(Status status, String str, String str2, int i10, h hVar) {
        this(status, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2);
    }
}
