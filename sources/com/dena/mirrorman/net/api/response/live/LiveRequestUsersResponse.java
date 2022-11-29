package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class LiveRequestUsersResponse {
    public static final int $stable = 8;
    private final String nextCursor;
    private final Status status;
    private final List<UrgeUser> users;

    public LiveRequestUsersResponse(Status status, List<UrgeUser> list, String str) {
        p.h(status, "status");
        p.h(list, "users");
        p.h(str, "nextCursor");
        this.status = status;
        this.users = list;
        this.nextCursor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveRequestUsersResponse copy$default(LiveRequestUsersResponse liveRequestUsersResponse, Status status, List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveRequestUsersResponse.status;
        }
        if ((i10 & 2) != 0) {
            list = liveRequestUsersResponse.users;
        }
        if ((i10 & 4) != 0) {
            str = liveRequestUsersResponse.nextCursor;
        }
        return liveRequestUsersResponse.copy(status, list, str);
    }

    public final Status component1() {
        return this.status;
    }

    public final List<UrgeUser> component2() {
        return this.users;
    }

    public final String component3() {
        return this.nextCursor;
    }

    public final LiveRequestUsersResponse copy(Status status, List<UrgeUser> list, String str) {
        p.h(status, "status");
        p.h(list, "users");
        p.h(str, "nextCursor");
        return new LiveRequestUsersResponse(status, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveRequestUsersResponse) {
            LiveRequestUsersResponse liveRequestUsersResponse = (LiveRequestUsersResponse) obj;
            return p.c(this.status, liveRequestUsersResponse.status) && p.c(this.users, liveRequestUsersResponse.users) && p.c(this.nextCursor, liveRequestUsersResponse.nextCursor);
        }
        return false;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<UrgeUser> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.users.hashCode()) * 31) + this.nextCursor.hashCode();
    }

    public String toString() {
        return "LiveRequestUsersResponse(status=" + this.status + ", users=" + this.users + ", nextCursor=" + this.nextCursor + ')';
    }

    public /* synthetic */ LiveRequestUsersResponse(Status status, List list, String str, int i10, h hVar) {
        this(status, (i10 & 2) != 0 ? s.k() : list, str);
    }
}
