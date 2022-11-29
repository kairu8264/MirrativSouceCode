package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import com.dena.mirrorman.net.api.response.user.UserGroup;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class PrivateLiveInvitationsResponse {
    public static final int $stable = 8;
    private final int allFollowers;
    private final List<UserGroup> groups;
    private final Status status;
    private final List<UserBasicParams> users;

    /* JADX WARN: Multi-variable type inference failed */
    public PrivateLiveInvitationsResponse(Status status, List<? extends UserBasicParams> list, List<UserGroup> list2, int i10) {
        p.h(status, "status");
        p.h(list, "users");
        p.h(list2, "groups");
        this.status = status;
        this.users = list;
        this.groups = list2;
        this.allFollowers = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivateLiveInvitationsResponse copy$default(PrivateLiveInvitationsResponse privateLiveInvitationsResponse, Status status, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            status = privateLiveInvitationsResponse.status;
        }
        if ((i11 & 2) != 0) {
            list = privateLiveInvitationsResponse.users;
        }
        if ((i11 & 4) != 0) {
            list2 = privateLiveInvitationsResponse.groups;
        }
        if ((i11 & 8) != 0) {
            i10 = privateLiveInvitationsResponse.allFollowers;
        }
        return privateLiveInvitationsResponse.copy(status, list, list2, i10);
    }

    public final Status component1() {
        return this.status;
    }

    public final List<UserBasicParams> component2() {
        return this.users;
    }

    public final List<UserGroup> component3() {
        return this.groups;
    }

    public final int component4() {
        return this.allFollowers;
    }

    public final PrivateLiveInvitationsResponse copy(Status status, List<? extends UserBasicParams> list, List<UserGroup> list2, int i10) {
        p.h(status, "status");
        p.h(list, "users");
        p.h(list2, "groups");
        return new PrivateLiveInvitationsResponse(status, list, list2, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrivateLiveInvitationsResponse) {
            PrivateLiveInvitationsResponse privateLiveInvitationsResponse = (PrivateLiveInvitationsResponse) obj;
            return p.c(this.status, privateLiveInvitationsResponse.status) && p.c(this.users, privateLiveInvitationsResponse.users) && p.c(this.groups, privateLiveInvitationsResponse.groups) && this.allFollowers == privateLiveInvitationsResponse.allFollowers;
        }
        return false;
    }

    public final int getAllFollowers() {
        return this.allFollowers;
    }

    public final List<UserGroup> getGroups() {
        return this.groups;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final List<UserBasicParams> getUsers() {
        return this.users;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + this.users.hashCode()) * 31) + this.groups.hashCode()) * 31) + Integer.hashCode(this.allFollowers);
    }

    public String toString() {
        return "PrivateLiveInvitationsResponse(status=" + this.status + ", users=" + this.users + ", groups=" + this.groups + ", allFollowers=" + this.allFollowers + ')';
    }
}
