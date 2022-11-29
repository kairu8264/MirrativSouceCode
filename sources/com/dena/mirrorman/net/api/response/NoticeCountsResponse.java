package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.notice.NoticeCountsParams;
import jo.p;

/* loaded from: classes2.dex */
public final class NoticeCountsResponse {
    public static final int $stable = 8;
    private final NoticeCountsParams counts;
    private final Status status;

    public NoticeCountsResponse(Status status, NoticeCountsParams noticeCountsParams) {
        p.h(status, "status");
        p.h(noticeCountsParams, "counts");
        this.status = status;
        this.counts = noticeCountsParams;
    }

    public static /* synthetic */ NoticeCountsResponse copy$default(NoticeCountsResponse noticeCountsResponse, Status status, NoticeCountsParams noticeCountsParams, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = noticeCountsResponse.status;
        }
        if ((i10 & 2) != 0) {
            noticeCountsParams = noticeCountsResponse.counts;
        }
        return noticeCountsResponse.copy(status, noticeCountsParams);
    }

    public final Status component1() {
        return this.status;
    }

    public final NoticeCountsParams component2() {
        return this.counts;
    }

    public final NoticeCountsResponse copy(Status status, NoticeCountsParams noticeCountsParams) {
        p.h(status, "status");
        p.h(noticeCountsParams, "counts");
        return new NoticeCountsResponse(status, noticeCountsParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoticeCountsResponse) {
            NoticeCountsResponse noticeCountsResponse = (NoticeCountsResponse) obj;
            return p.c(this.status, noticeCountsResponse.status) && p.c(this.counts, noticeCountsResponse.counts);
        }
        return false;
    }

    public final NoticeCountsParams getCounts() {
        return this.counts;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.counts.hashCode();
    }

    public String toString() {
        return "NoticeCountsResponse(status=" + this.status + ", counts=" + this.counts + ')';
    }
}
