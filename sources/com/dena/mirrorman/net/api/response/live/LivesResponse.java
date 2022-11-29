package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class LivesResponse {
    public static final int $stable = 8;
    private int currentPage;
    private List<? extends LiveBasicParams> liveSmalls;
    private int livesNum;
    private int nextPage;
    private Status status;

    public LivesResponse() {
        this(null, 0, 0, 0, null, 31, null);
    }

    public LivesResponse(List<? extends LiveBasicParams> list, int i10, int i11, int i12, Status status) {
        p.h(list, "liveSmalls");
        p.h(status, "status");
        this.liveSmalls = list;
        this.livesNum = i10;
        this.nextPage = i11;
        this.currentPage = i12;
        this.status = status;
    }

    public static /* synthetic */ LivesResponse copy$default(LivesResponse livesResponse, List list, int i10, int i11, int i12, Status status, int i13, Object obj) {
        List<? extends LiveBasicParams> list2 = list;
        if ((i13 & 1) != 0) {
            list2 = livesResponse.liveSmalls;
        }
        if ((i13 & 2) != 0) {
            i10 = livesResponse.livesNum;
        }
        int i14 = i10;
        if ((i13 & 4) != 0) {
            i11 = livesResponse.nextPage;
        }
        int i15 = i11;
        if ((i13 & 8) != 0) {
            i12 = livesResponse.currentPage;
        }
        int i16 = i12;
        if ((i13 & 16) != 0) {
            status = livesResponse.status;
        }
        return livesResponse.copy(list2, i14, i15, i16, status);
    }

    public final List<LiveBasicParams> component1() {
        return this.liveSmalls;
    }

    public final int component2() {
        return this.livesNum;
    }

    public final int component3() {
        return this.nextPage;
    }

    public final int component4() {
        return this.currentPage;
    }

    public final Status component5() {
        return this.status;
    }

    public final LivesResponse copy(List<? extends LiveBasicParams> list, int i10, int i11, int i12, Status status) {
        p.h(list, "liveSmalls");
        p.h(status, "status");
        return new LivesResponse(list, i10, i11, i12, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LivesResponse) {
            LivesResponse livesResponse = (LivesResponse) obj;
            return p.c(this.liveSmalls, livesResponse.liveSmalls) && this.livesNum == livesResponse.livesNum && this.nextPage == livesResponse.nextPage && this.currentPage == livesResponse.currentPage && p.c(this.status, livesResponse.status);
        }
        return false;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final List<LiveBasicParams> getLiveSmalls() {
        return this.liveSmalls;
    }

    public final int getLivesNum() {
        return this.livesNum;
    }

    public final int getNextPage() {
        return this.nextPage;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.liveSmalls.hashCode() * 31) + Integer.hashCode(this.livesNum)) * 31) + Integer.hashCode(this.nextPage)) * 31) + Integer.hashCode(this.currentPage)) * 31) + this.status.hashCode();
    }

    public final void setCurrentPage(int i10) {
        this.currentPage = i10;
    }

    public final void setLiveSmalls(List<? extends LiveBasicParams> list) {
        p.h(list, "<set-?>");
        this.liveSmalls = list;
    }

    public final void setLivesNum(int i10) {
        this.livesNum = i10;
    }

    public final void setNextPage(int i10) {
        this.nextPage = i10;
    }

    public final void setStatus(Status status) {
        p.h(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        return "LivesResponse(liveSmalls=" + this.liveSmalls + ", livesNum=" + this.livesNum + ", nextPage=" + this.nextPage + ", currentPage=" + this.currentPage + ", status=" + this.status + ')';
    }

    public /* synthetic */ LivesResponse(List list, int i10, int i11, int i12, Status status, int i13, h hVar) {
        this((i13 & 1) != 0 ? s.k() : list, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) == 0 ? i12 : 0, (i13 & 16) != 0 ? Status.Companion.createEmptyStatus() : status);
    }
}
