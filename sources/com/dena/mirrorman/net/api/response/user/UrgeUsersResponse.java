package com.dena.mirrorman.net.api.response.user;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class UrgeUsersResponse {
    public static final int $stable = 8;
    private final int currentPage;
    private final int nextPage;
    private final Status status;
    private final List<UrgeUser> users;

    public UrgeUsersResponse(Status status, int i10, int i11, List<UrgeUser> list) {
        p.h(status, "status");
        p.h(list, "users");
        this.status = status;
        this.nextPage = i10;
        this.currentPage = i11;
        this.users = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UrgeUsersResponse copy$default(UrgeUsersResponse urgeUsersResponse, Status status, int i10, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            status = urgeUsersResponse.status;
        }
        if ((i12 & 2) != 0) {
            i10 = urgeUsersResponse.nextPage;
        }
        if ((i12 & 4) != 0) {
            i11 = urgeUsersResponse.currentPage;
        }
        if ((i12 & 8) != 0) {
            list = urgeUsersResponse.users;
        }
        return urgeUsersResponse.copy(status, i10, i11, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final int component2() {
        return this.nextPage;
    }

    public final int component3() {
        return this.currentPage;
    }

    public final List<UrgeUser> component4() {
        return this.users;
    }

    public final UrgeUsersResponse copy(Status status, int i10, int i11, List<UrgeUser> list) {
        p.h(status, "status");
        p.h(list, "users");
        return new UrgeUsersResponse(status, i10, i11, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UrgeUsersResponse) {
            UrgeUsersResponse urgeUsersResponse = (UrgeUsersResponse) obj;
            return p.c(this.status, urgeUsersResponse.status) && this.nextPage == urgeUsersResponse.nextPage && this.currentPage == urgeUsersResponse.currentPage && p.c(this.users, urgeUsersResponse.users);
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

    public final List<UrgeUser> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + Integer.hashCode(this.nextPage)) * 31) + Integer.hashCode(this.currentPage)) * 31) + this.users.hashCode();
    }

    public String toString() {
        return "UrgeUsersResponse(status=" + this.status + ", nextPage=" + this.nextPage + ", currentPage=" + this.currentPage + ", users=" + this.users + ')';
    }

    public /* synthetic */ UrgeUsersResponse(Status status, int i10, int i11, List list, int i12, h hVar) {
        this(status, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? s.k() : list);
    }
}
