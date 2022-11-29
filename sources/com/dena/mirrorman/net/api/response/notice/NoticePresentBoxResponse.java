package com.dena.mirrorman.net.api.response.notice;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class NoticePresentBoxResponse {
    public static final int $stable = 8;
    private final String nextCursor;
    private final List<PresentBox> presentBoxes;
    private final Status status;

    public NoticePresentBoxResponse(List<PresentBox> list, String str, Status status) {
        p.h(list, "presentBoxes");
        p.h(str, "nextCursor");
        p.h(status, "status");
        this.presentBoxes = list;
        this.nextCursor = str;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticePresentBoxResponse copy$default(NoticePresentBoxResponse noticePresentBoxResponse, List list, String str, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = noticePresentBoxResponse.presentBoxes;
        }
        if ((i10 & 2) != 0) {
            str = noticePresentBoxResponse.nextCursor;
        }
        if ((i10 & 4) != 0) {
            status = noticePresentBoxResponse.status;
        }
        return noticePresentBoxResponse.copy(list, str, status);
    }

    public final List<PresentBox> component1() {
        return this.presentBoxes;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final Status component3() {
        return this.status;
    }

    public final NoticePresentBoxResponse copy(List<PresentBox> list, String str, Status status) {
        p.h(list, "presentBoxes");
        p.h(str, "nextCursor");
        p.h(status, "status");
        return new NoticePresentBoxResponse(list, str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NoticePresentBoxResponse) {
            NoticePresentBoxResponse noticePresentBoxResponse = (NoticePresentBoxResponse) obj;
            return p.c(this.presentBoxes, noticePresentBoxResponse.presentBoxes) && p.c(this.nextCursor, noticePresentBoxResponse.nextCursor) && p.c(this.status, noticePresentBoxResponse.status);
        }
        return false;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<PresentBox> getPresentBoxes() {
        return this.presentBoxes;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.presentBoxes.hashCode() * 31) + this.nextCursor.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "NoticePresentBoxResponse(presentBoxes=" + this.presentBoxes + ", nextCursor=" + this.nextCursor + ", status=" + this.status + ')';
    }
}
