package com.dena.mirrorman.net.api.response.notice;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class NoticeNewsResponse {
    public static final int $stable = 8;
    private final List<NewsNotice> newsNotices;
    private final String nextCursor;
    private final Status status;

    public NoticeNewsResponse(List<NewsNotice> list, String str, Status status) {
        p.h(list, "newsNotices");
        p.h(str, "nextCursor");
        p.h(status, "status");
        this.newsNotices = list;
        this.nextCursor = str;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeNewsResponse copy$default(NoticeNewsResponse noticeNewsResponse, List list, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = noticeNewsResponse.newsNotices;
        }
        if ((i10 & 2) != 0) {
            str = noticeNewsResponse.nextCursor;
        }
        if ((i10 & 4) != 0) {
            status = noticeNewsResponse.status;
        }
        return noticeNewsResponse.copy(list, str, status);
    }

    public final List<NewsNotice> component1() {
        return this.newsNotices;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final Status component3() {
        return this.status;
    }

    public final NoticeNewsResponse copy(List<NewsNotice> list, String str, Status status) {
        p.h(list, "newsNotices");
        p.h(str, "nextCursor");
        p.h(status, "status");
        return new NoticeNewsResponse(list, str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoticeNewsResponse) {
            NoticeNewsResponse noticeNewsResponse = (NoticeNewsResponse) obj;
            return p.c(this.newsNotices, noticeNewsResponse.newsNotices) && p.c(this.nextCursor, noticeNewsResponse.nextCursor) && p.c(this.status, noticeNewsResponse.status);
        }
        return false;
    }

    public final List<NewsNotice> getNewsNotices() {
        return this.newsNotices;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.newsNotices.hashCode() * 31) + this.nextCursor.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "NoticeNewsResponse(newsNotices=" + this.newsNotices + ", nextCursor=" + this.nextCursor + ", status=" + this.status + ')';
    }
}
