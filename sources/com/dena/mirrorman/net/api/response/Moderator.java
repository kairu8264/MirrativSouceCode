package com.dena.mirrorman.net.api.response;

import jo.p;

/* loaded from: classes2.dex */
public final class Moderator {
    public static final int $stable = 0;
    private final String name;
    private final String profileImageUrl;
    private final String userId;

    public Moderator(String str, String str2, String str3) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        p.h(str3, "userId");
        this.name = str;
        this.profileImageUrl = str2;
        this.userId = str3;
    }

    public static /* synthetic */ Moderator copy$default(Moderator moderator, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = moderator.name;
        }
        if ((i10 & 2) != 0) {
            str2 = moderator.profileImageUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = moderator.userId;
        }
        return moderator.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.profileImageUrl;
    }

    public final String component3() {
        return this.userId;
    }

    public final Moderator copy(String str, String str2, String str3) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        p.h(str3, "userId");
        return new Moderator(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Moderator) {
            Moderator moderator = (Moderator) obj;
            return p.c(this.name, moderator.name) && p.c(this.profileImageUrl, moderator.profileImageUrl) && p.c(this.userId, moderator.userId);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.profileImageUrl.hashCode()) * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "Moderator(name=" + this.name + ", profileImageUrl=" + this.profileImageUrl + ", userId=" + this.userId + ')';
    }
}
