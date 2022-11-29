package com.dena.mirrorman.net.bcsvr.response;

import jo.p;

/* loaded from: classes2.dex */
public final class MutualGiftUser {
    public static final int $stable = 0;
    private final String profileImageUrl;
    private final String userId;

    public MutualGiftUser(String str, String str2) {
        p.h(str, "userId");
        p.h(str2, "profileImageUrl");
        this.userId = str;
        this.profileImageUrl = str2;
    }

    public static /* synthetic */ MutualGiftUser copy$default(MutualGiftUser mutualGiftUser, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mutualGiftUser.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = mutualGiftUser.profileImageUrl;
        }
        return mutualGiftUser.copy(str, str2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.profileImageUrl;
    }

    public final MutualGiftUser copy(String str, String str2) {
        p.h(str, "userId");
        p.h(str2, "profileImageUrl");
        return new MutualGiftUser(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MutualGiftUser) {
            MutualGiftUser mutualGiftUser = (MutualGiftUser) obj;
            return p.c(this.userId, mutualGiftUser.userId) && p.c(this.profileImageUrl, mutualGiftUser.profileImageUrl);
        }
        return false;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + this.profileImageUrl.hashCode();
    }

    public String toString() {
        return "MutualGiftUser(userId=" + this.userId + ", profileImageUrl=" + this.profileImageUrl + ')';
    }
}
