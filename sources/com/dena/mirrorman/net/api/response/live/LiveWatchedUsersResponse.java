package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class LiveWatchedUsersResponse {
    public static final int $stable = 8;
    private final int currentPage;
    private final int nextPage;
    private final Status status;
    private final List<UserBasicWithGraphParams> users;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveWatchedUsersResponse(Status status, List<? extends UserBasicWithGraphParams> list, int i10, int i11) {
        p.h(status, "status");
        p.h(list, "users");
        this.status = status;
        this.users = list;
        this.currentPage = i10;
        this.nextPage = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveWatchedUsersResponse copy$default(LiveWatchedUsersResponse liveWatchedUsersResponse, Status status, List list, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            status = liveWatchedUsersResponse.status;
        }
        if ((i12 & 2) != 0) {
            list = liveWatchedUsersResponse.users;
        }
        if ((i12 & 4) != 0) {
            i10 = liveWatchedUsersResponse.currentPage;
        }
        if ((i12 & 8) != 0) {
            i11 = liveWatchedUsersResponse.nextPage;
        }
        return liveWatchedUsersResponse.copy(status, list, i10, i11);
    }

    public final Status component1() {
        return this.status;
    }

    public final List<UserBasicWithGraphParams> component2() {
        return this.users;
    }

    public final int component3() {
        return this.currentPage;
    }

    public final int component4() {
        return this.nextPage;
    }

    public final LiveWatchedUsersResponse copy(Status status, List<? extends UserBasicWithGraphParams> list, int i10, int i11) {
        p.h(status, "status");
        p.h(list, "users");
        return new LiveWatchedUsersResponse(status, list, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveWatchedUsersResponse) {
            LiveWatchedUsersResponse liveWatchedUsersResponse = (LiveWatchedUsersResponse) obj;
            return p.c(this.status, liveWatchedUsersResponse.status) && p.c(this.users, liveWatchedUsersResponse.users) && this.currentPage == liveWatchedUsersResponse.currentPage && this.nextPage == liveWatchedUsersResponse.nextPage;
        }
        return false;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final int getNextPage() {
        return this.nextPage;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<UserBasicWithGraphParams> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.users.hashCode()) * 31) + Integer.hashCode(this.currentPage)) * 31) + Integer.hashCode(this.nextPage);
    }

    public String toString() {
        return "LiveWatchedUsersResponse(status=" + this.status + ", users=" + this.users + ", currentPage=" + this.currentPage + ", nextPage=" + this.nextPage + ')';
    }

    public /* synthetic */ LiveWatchedUsersResponse(Status status, List list, int i10, int i11, int i12, h hVar) {
        this(status, (i12 & 2) != 0 ? s.k() : list, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }
}
