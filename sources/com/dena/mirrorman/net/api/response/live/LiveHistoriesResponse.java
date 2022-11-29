package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class LiveHistoriesResponse {
    public static final int $stable = 8;
    private final int currentPage;
    private final List<LiveBasicParams> lives;
    private final int livesNum;
    private final int nextPage;
    private final Status status;

    public LiveHistoriesResponse() {
        this(null, 0, 0, 0, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LiveHistoriesResponse(List<? extends LiveBasicParams> list, int i10, int i11, int i12, Status status) {
        p.h(list, "lives");
        p.h(status, "status");
        this.lives = list;
        this.livesNum = i10;
        this.nextPage = i11;
        this.currentPage = i12;
        this.status = status;
    }

    public static /* synthetic */ LiveHistoriesResponse copy$default(LiveHistoriesResponse liveHistoriesResponse, List list, int i10, int i11, int i12, Status status, int i13, Object obj) {
        List<LiveBasicParams> list2 = list;
        if ((i13 & 1) != 0) {
            list2 = liveHistoriesResponse.lives;
        }
        if ((i13 & 2) != 0) {
            i10 = liveHistoriesResponse.livesNum;
        }
        int i14 = i10;
        if ((i13 & 4) != 0) {
            i11 = liveHistoriesResponse.nextPage;
        }
        int i15 = i11;
        if ((i13 & 8) != 0) {
            i12 = liveHistoriesResponse.currentPage;
        }
        int i16 = i12;
        if ((i13 & 16) != 0) {
            status = liveHistoriesResponse.status;
        }
        return liveHistoriesResponse.copy(list2, i14, i15, i16, status);
    }

    public final List<LiveBasicParams> component1() {
        return this.lives;
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

    public final LiveHistoriesResponse copy(List<? extends LiveBasicParams> list, int i10, int i11, int i12, Status status) {
        p.h(list, "lives");
        p.h(status, "status");
        return new LiveHistoriesResponse(list, i10, i11, i12, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveHistoriesResponse) {
            LiveHistoriesResponse liveHistoriesResponse = (LiveHistoriesResponse) obj;
            return p.c(this.lives, liveHistoriesResponse.lives) && this.livesNum == liveHistoriesResponse.livesNum && this.nextPage == liveHistoriesResponse.nextPage && this.currentPage == liveHistoriesResponse.currentPage && p.c(this.status, liveHistoriesResponse.status);
        }
        return false;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final List<LiveBasicParams> getLives() {
        return this.lives;
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
        return (((((((this.lives.hashCode() * 31) + Integer.hashCode(this.livesNum)) * 31) + Integer.hashCode(this.nextPage)) * 31) + Integer.hashCode(this.currentPage)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "LiveHistoriesResponse(lives=" + this.lives + ", livesNum=" + this.livesNum + ", nextPage=" + this.nextPage + ", currentPage=" + this.currentPage + ", status=" + this.status + ')';
    }

    public /* synthetic */ LiveHistoriesResponse(List list, int i10, int i11, int i12, Status status, int i13, h hVar) {
        this((i13 & 1) != 0 ? s.k() : list, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) == 0 ? i12 : 0, (i13 & 16) != 0 ? Status.Companion.createEmptyStatus() : status);
    }
}
