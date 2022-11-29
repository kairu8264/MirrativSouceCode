package com.dena.mirrorman.net.api.response.notice;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class NoticeYourResponse {
    public static final int $stable = 8;
    private final String nextCursor;
    private final Status status;
    private final List<YourNotice> yourNotices;

    public NoticeYourResponse(List<YourNotice> list, String str, Status status) {
        p.h(list, "yourNotices");
        p.h(str, "nextCursor");
        p.h(status, "status");
        this.yourNotices = list;
        this.nextCursor = str;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeYourResponse copy$default(NoticeYourResponse noticeYourResponse, List list, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = noticeYourResponse.yourNotices;
        }
        if ((i10 & 2) != 0) {
            str = noticeYourResponse.nextCursor;
        }
        if ((i10 & 4) != 0) {
            status = noticeYourResponse.status;
        }
        return noticeYourResponse.copy(list, str, status);
    }

    public final List<YourNotice> component1() {
        return this.yourNotices;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final Status component3() {
        return this.status;
    }

    public final NoticeYourResponse copy(List<YourNotice> list, String str, Status status) {
        p.h(list, "yourNotices");
        p.h(str, "nextCursor");
        p.h(status, "status");
        return new NoticeYourResponse(list, str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoticeYourResponse) {
            NoticeYourResponse noticeYourResponse = (NoticeYourResponse) obj;
            return p.c(this.yourNotices, noticeYourResponse.yourNotices) && p.c(this.nextCursor, noticeYourResponse.nextCursor) && p.c(this.status, noticeYourResponse.status);
        }
        return false;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<YourNotice> getYourNotices() {
        return this.yourNotices;
    }

    public int hashCode() {
        return (((this.yourNotices.hashCode() * 31) + this.nextCursor.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "NoticeYourResponse(yourNotices=" + this.yourNotices + ", nextCursor=" + this.nextCursor + ", status=" + this.status + ')';
    }
}
