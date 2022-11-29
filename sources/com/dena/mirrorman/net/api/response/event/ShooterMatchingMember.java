package com.dena.mirrorman.net.api.response.event;

import jo.p;

/* loaded from: classes2.dex */
public final class ShooterMatchingMember {
    public static final int $stable = 0;
    private final String iconUrl;
    private final String name;
    private final String userId;

    public ShooterMatchingMember(String str, String str2, String str3) {
        p.h(str, "userId");
        p.h(str2, "name");
        p.h(str3, "iconUrl");
        this.userId = str;
        this.name = str2;
        this.iconUrl = str3;
    }

    public static /* synthetic */ ShooterMatchingMember copy$default(ShooterMatchingMember shooterMatchingMember, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shooterMatchingMember.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = shooterMatchingMember.name;
        }
        if ((i10 & 4) != 0) {
            str3 = shooterMatchingMember.iconUrl;
        }
        return shooterMatchingMember.copy(str, str2, str3);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final ShooterMatchingMember copy(String str, String str2, String str3) {
        p.h(str, "userId");
        p.h(str2, "name");
        p.h(str3, "iconUrl");
        return new ShooterMatchingMember(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterMatchingMember) {
            ShooterMatchingMember shooterMatchingMember = (ShooterMatchingMember) obj;
            return p.c(this.userId, shooterMatchingMember.userId) && p.c(this.name, shooterMatchingMember.name) && p.c(this.iconUrl, shooterMatchingMember.iconUrl);
        }
        return false;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + this.name.hashCode()) * 31) + this.iconUrl.hashCode();
    }

    public String toString() {
        return "ShooterMatchingMember(userId=" + this.userId + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ')';
    }
}
