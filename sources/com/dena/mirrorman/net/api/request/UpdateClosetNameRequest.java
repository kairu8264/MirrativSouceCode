package com.dena.mirrorman.net.api.request;

import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class UpdateClosetNameRequest {
    public static final int $stable = 0;
    @c("closet_id")
    private final int closetId;
    private final String name;

    public UpdateClosetNameRequest(int i10, String str) {
        p.h(str, "name");
        this.closetId = i10;
        this.name = str;
    }

    public static /* synthetic */ UpdateClosetNameRequest copy$default(UpdateClosetNameRequest updateClosetNameRequest, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = updateClosetNameRequest.closetId;
        }
        if ((i11 & 2) != 0) {
            str = updateClosetNameRequest.name;
        }
        return updateClosetNameRequest.copy(i10, str);
    }

    public final int component1() {
        return this.closetId;
    }

    public final String component2() {
        return this.name;
    }

    public final UpdateClosetNameRequest copy(int i10, String str) {
        p.h(str, "name");
        return new UpdateClosetNameRequest(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateClosetNameRequest) {
            UpdateClosetNameRequest updateClosetNameRequest = (UpdateClosetNameRequest) obj;
            return this.closetId == updateClosetNameRequest.closetId && p.c(this.name, updateClosetNameRequest.name);
        }
        return false;
    }

    public final int getClosetId() {
        return this.closetId;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (Integer.hashCode(this.closetId) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "UpdateClosetNameRequest(closetId=" + this.closetId + ", name=" + this.name + ')';
    }
}
