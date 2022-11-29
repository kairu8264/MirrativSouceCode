package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;
import ym.c;

/* loaded from: classes2.dex */
public final class GroupShotGalleryResponse {
    public static final int $stable = 8;
    @c("group_shots")
    private final List<GroupShotItem> items;
    private final int nextId;
    private final Status status;

    public GroupShotGalleryResponse(List<GroupShotItem> list, int i10, Status status) {
        p.h(list, "items");
        p.h(status, "status");
        this.items = list;
        this.nextId = i10;
        this.status = status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupShotGalleryResponse copy$default(GroupShotGalleryResponse groupShotGalleryResponse, List list, int i10, Status status, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = groupShotGalleryResponse.items;
        }
        if ((i11 & 2) != 0) {
            i10 = groupShotGalleryResponse.nextId;
        }
        if ((i11 & 4) != 0) {
            status = groupShotGalleryResponse.status;
        }
        return groupShotGalleryResponse.copy(list, i10, status);
    }

    public final List<GroupShotItem> component1() {
        return this.items;
    }

    public final int component2() {
        return this.nextId;
    }

    public final Status component3() {
        return this.status;
    }

    public final GroupShotGalleryResponse copy(List<GroupShotItem> list, int i10, Status status) {
        p.h(list, "items");
        p.h(status, "status");
        return new GroupShotGalleryResponse(list, i10, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupShotGalleryResponse) {
            GroupShotGalleryResponse groupShotGalleryResponse = (GroupShotGalleryResponse) obj;
            return p.c(this.items, groupShotGalleryResponse.items) && this.nextId == groupShotGalleryResponse.nextId && p.c(this.status, groupShotGalleryResponse.status);
        }
        return false;
    }

    public final List<GroupShotItem> getItems() {
        return this.items;
    }

    public final int getNextId() {
        return this.nextId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.items.hashCode() * 31) + Integer.hashCode(this.nextId)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "GroupShotGalleryResponse(items=" + this.items + ", nextId=" + this.nextId + ", status=" + this.status + ')';
    }

    public /* synthetic */ GroupShotGalleryResponse(List list, int i10, Status status, int i11, h hVar) {
        this((i11 & 1) != 0 ? s.k() : list, (i11 & 2) != 0 ? 0 : i10, status);
    }
}
