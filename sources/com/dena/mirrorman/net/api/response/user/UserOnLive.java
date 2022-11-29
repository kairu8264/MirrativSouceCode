package com.dena.mirrorman.net.api.response.user;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class UserOnLive implements Serializable {
    public static final int $stable = 8;
    private String liveId;

    public UserOnLive() {
        this(null, 1, null);
    }

    public UserOnLive(String str) {
        p.h(str, "liveId");
        this.liveId = str;
    }

    public static /* synthetic */ UserOnLive copy$default(UserOnLive userOnLive, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userOnLive.liveId;
        }
        return userOnLive.copy(str);
    }

    public final String component1() {
        return this.liveId;
    }

    public final UserOnLive copy(String str) {
        p.h(str, "liveId");
        return new UserOnLive(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserOnLive) && p.c(this.liveId, ((UserOnLive) obj).liveId);
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public int hashCode() {
        return this.liveId.hashCode();
    }

    public final void setLiveId(String str) {
        p.h(str, "<set-?>");
        this.liveId = str;
    }

    public String toString() {
        return "UserOnLive(liveId=" + this.liveId + ')';
    }

    public /* synthetic */ UserOnLive(String str, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
