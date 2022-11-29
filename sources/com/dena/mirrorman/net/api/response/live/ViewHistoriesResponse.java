package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class ViewHistoriesResponse {
    public static final int $stable = 8;
    private final String currentCursor;
    private final List<ViewHistoryParams> lives;
    private final String nextCursor;
    private final Status status;

    public ViewHistoriesResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewHistoriesResponse(List<? extends ViewHistoryParams> list, String str, String str2, Status status) {
        p.h(list, "lives");
        p.h(str, "nextCursor");
        p.h(str2, "currentCursor");
        p.h(status, "status");
        this.lives = list;
        this.nextCursor = str;
        this.currentCursor = str2;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewHistoriesResponse copy$default(ViewHistoriesResponse viewHistoriesResponse, List list, String str, String str2, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = viewHistoriesResponse.lives;
        }
        if ((i10 & 2) != 0) {
            str = viewHistoriesResponse.nextCursor;
        }
        if ((i10 & 4) != 0) {
            str2 = viewHistoriesResponse.currentCursor;
        }
        if ((i10 & 8) != 0) {
            status = viewHistoriesResponse.status;
        }
        return viewHistoriesResponse.copy(list, str, str2, status);
    }

    public final List<ViewHistoryParams> component1() {
        return this.lives;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final String component3() {
        return this.currentCursor;
    }

    public final Status component4() {
        return this.status;
    }

    public final ViewHistoriesResponse copy(List<? extends ViewHistoryParams> list, String str, String str2, Status status) {
        p.h(list, "lives");
        p.h(str, "nextCursor");
        p.h(str2, "currentCursor");
        p.h(status, "status");
        return new ViewHistoriesResponse(list, str, str2, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewHistoriesResponse) {
            ViewHistoriesResponse viewHistoriesResponse = (ViewHistoriesResponse) obj;
            return p.c(this.lives, viewHistoriesResponse.lives) && p.c(this.nextCursor, viewHistoriesResponse.nextCursor) && p.c(this.currentCursor, viewHistoriesResponse.currentCursor) && p.c(this.status, viewHistoriesResponse.status);
        }
        return false;
    }

    public final String getCurrentCursor() {
        return this.currentCursor;
    }

    public final List<ViewHistoryParams> getLives() {
        return this.lives;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.lives.hashCode() * 31) + this.nextCursor.hashCode()) * 31) + this.currentCursor.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ViewHistoriesResponse(lives=" + this.lives + ", nextCursor=" + this.nextCursor + ", currentCursor=" + this.currentCursor + ", status=" + this.status + ')';
    }

    public /* synthetic */ ViewHistoriesResponse(List list, String str, String str2, Status status, int i10, h hVar) {
        this((i10 & 1) != 0 ? s.k() : list, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? Status.Companion.createEmptyStatus() : status);
    }
}
