package com.dena.mirrorman.net.api.response.user;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;

/* loaded from: classes2.dex */
public final class UserGroupsResponse {
    public static final int $stable = 8;
    private final int currentPage;
    private final List<UserGroup> groups;
    private final int nextPage;
    private final Status status;

    public UserGroupsResponse(Status status, int i10, int i11, List<UserGroup> list) {
        p.h(status, "status");
        p.h(list, "groups");
        this.status = status;
        this.nextPage = i10;
        this.currentPage = i11;
        this.groups = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserGroupsResponse copy$default(UserGroupsResponse userGroupsResponse, Status status, int i10, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            status = userGroupsResponse.status;
        }
        if ((i12 & 2) != 0) {
            i10 = userGroupsResponse.nextPage;
        }
        if ((i12 & 4) != 0) {
            i11 = userGroupsResponse.currentPage;
        }
        if ((i12 & 8) != 0) {
            list = userGroupsResponse.groups;
        }
        return userGroupsResponse.copy(status, i10, i11, list);
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

    public final List<UserGroup> component4() {
        return this.groups;
    }

    public final UserGroupsResponse copy(Status status, int i10, int i11, List<UserGroup> list) {
        p.h(status, "status");
        p.h(list, "groups");
        return new UserGroupsResponse(status, i10, i11, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserGroupsResponse) {
            UserGroupsResponse userGroupsResponse = (UserGroupsResponse) obj;
            return p.c(this.status, userGroupsResponse.status) && this.nextPage == userGroupsResponse.nextPage && this.currentPage == userGroupsResponse.currentPage && p.c(this.groups, userGroupsResponse.groups);
        }
        return false;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final List<UserGroup> getGroups() {
        return this.groups;
    }

    public final int getNextPage() {
        return this.nextPage;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + Integer.hashCode(this.nextPage)) * 31) + Integer.hashCode(this.currentPage)) * 31) + this.groups.hashCode();
    }

    public String toString() {
        return "UserGroupsResponse(status=" + this.status + ", nextPage=" + this.nextPage + ", currentPage=" + this.currentPage + ", groups=" + this.groups + ')';
    }

    public /* synthetic */ UserGroupsResponse(Status status, int i10, int i11, List list, int i12, h hVar) {
        this(status, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? s.k() : list);
    }
}
