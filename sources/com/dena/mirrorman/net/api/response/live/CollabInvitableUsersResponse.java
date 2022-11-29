package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.Paging;
import com.dena.mirrorman.net.api.response.user.CollabInvitableUser;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class CollabInvitableUsersResponse {
    public static final int $stable = 8;
    private final Paging paging;
    private final Status status;
    private final List<CollabInvitableUser> users;

    public CollabInvitableUsersResponse(Status status, Paging paging, List<CollabInvitableUser> list) {
        p.h(status, "status");
        p.h(paging, "paging");
        p.h(list, "users");
        this.status = status;
        this.paging = paging;
        this.users = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollabInvitableUsersResponse copy$default(CollabInvitableUsersResponse collabInvitableUsersResponse, Status status, Paging paging, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = collabInvitableUsersResponse.status;
        }
        if ((i10 & 2) != 0) {
            paging = collabInvitableUsersResponse.paging;
        }
        if ((i10 & 4) != 0) {
            list = collabInvitableUsersResponse.users;
        }
        return collabInvitableUsersResponse.copy(status, paging, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final Paging component2() {
        return this.paging;
    }

    public final List<CollabInvitableUser> component3() {
        return this.users;
    }

    public final CollabInvitableUsersResponse copy(Status status, Paging paging, List<CollabInvitableUser> list) {
        p.h(status, "status");
        p.h(paging, "paging");
        p.h(list, "users");
        return new CollabInvitableUsersResponse(status, paging, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabInvitableUsersResponse) {
            CollabInvitableUsersResponse collabInvitableUsersResponse = (CollabInvitableUsersResponse) obj;
            return p.c(this.status, collabInvitableUsersResponse.status) && p.c(this.paging, collabInvitableUsersResponse.paging) && p.c(this.users, collabInvitableUsersResponse.users);
        }
        return false;
    }

    public final Paging getPaging() {
        return this.paging;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<CollabInvitableUser> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((this.status.hashCode() * 31) + this.paging.hashCode()) * 31) + this.users.hashCode();
    }

    public String toString() {
        return "CollabInvitableUsersResponse(status=" + this.status + ", paging=" + this.paging + ", users=" + this.users + ')';
    }

    public /* synthetic */ CollabInvitableUsersResponse(Status status, Paging paging, List list, int i10, h hVar) {
        this(status, paging, (i10 & 4) != 0 ? s.k() : list);
    }
}
