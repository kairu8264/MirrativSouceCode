package com.dena.mirrorman.net.bcsvr.response;

import jo.p;

/* loaded from: classes2.dex */
public final class ShooterMatchingBcsvrResponse {
    public static final int $stable = 0;
    private final String name;
    private final String profileImageUrl;
    private final int userId;

    public ShooterMatchingBcsvrResponse(int i10, String str, String str2) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        this.userId = i10;
        this.name = str;
        this.profileImageUrl = str2;
    }

    public static /* synthetic */ ShooterMatchingBcsvrResponse copy$default(ShooterMatchingBcsvrResponse shooterMatchingBcsvrResponse, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = shooterMatchingBcsvrResponse.userId;
        }
        if ((i11 & 2) != 0) {
            str = shooterMatchingBcsvrResponse.name;
        }
        if ((i11 & 4) != 0) {
            str2 = shooterMatchingBcsvrResponse.profileImageUrl;
        }
        return shooterMatchingBcsvrResponse.copy(i10, str, str2);
    }

    public final int component1() {
        return this.userId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.profileImageUrl;
    }

    public final ShooterMatchingBcsvrResponse copy(int i10, String str, String str2) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        return new ShooterMatchingBcsvrResponse(i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterMatchingBcsvrResponse) {
            ShooterMatchingBcsvrResponse shooterMatchingBcsvrResponse = (ShooterMatchingBcsvrResponse) obj;
            return this.userId == shooterMatchingBcsvrResponse.userId && p.c(this.name, shooterMatchingBcsvrResponse.name) && p.c(this.profileImageUrl, shooterMatchingBcsvrResponse.profileImageUrl);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.userId) * 31) + this.name.hashCode()) * 31) + this.profileImageUrl.hashCode();
    }

    public String toString() {
        return "ShooterMatchingBcsvrResponse(userId=" + this.userId + ", name=" + this.name + ", profileImageUrl=" + this.profileImageUrl + ')';
    }
}
