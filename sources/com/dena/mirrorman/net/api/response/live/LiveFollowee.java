package com.dena.mirrorman.net.api.response.live;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveFollowee implements Serializable {
    public static final int $stable = 8;
    private String name;
    private String profileImageUrl;

    public LiveFollowee() {
        this(null, null, 3, null);
    }

    public LiveFollowee(String str, String str2) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        this.name = str;
        this.profileImageUrl = str2;
    }

    public static /* synthetic */ LiveFollowee copy$default(LiveFollowee liveFollowee, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveFollowee.name;
        }
        if ((i10 & 2) != 0) {
            str2 = liveFollowee.profileImageUrl;
        }
        return liveFollowee.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.profileImageUrl;
    }

    public final LiveFollowee copy(String str, String str2) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        return new LiveFollowee(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveFollowee) {
            LiveFollowee liveFollowee = (LiveFollowee) obj;
            return p.c(this.name, liveFollowee.name) && p.c(this.profileImageUrl, liveFollowee.profileImageUrl);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.profileImageUrl.hashCode();
    }

    public final void setName(String str) {
        p.h(str, "<set-?>");
        this.name = str;
    }

    public final void setProfileImageUrl(String str) {
        p.h(str, "<set-?>");
        this.profileImageUrl = str;
    }

    public String toString() {
        return "LiveFollowee(name=" + this.name + ", profileImageUrl=" + this.profileImageUrl + ')';
    }

    public /* synthetic */ LiveFollowee(String str, String str2, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
