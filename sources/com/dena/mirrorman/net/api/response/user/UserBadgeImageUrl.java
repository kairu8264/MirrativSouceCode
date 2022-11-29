package com.dena.mirrorman.net.api.response.user;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class UserBadgeImageUrl implements Serializable {
    public static final int $stable = 8;
    private String imageUrl;
    private String smallImageUrl;

    public UserBadgeImageUrl() {
        this(null, null, 3, null);
    }

    public UserBadgeImageUrl(String str, String str2) {
        p.h(str, "imageUrl");
        p.h(str2, "smallImageUrl");
        this.imageUrl = str;
        this.smallImageUrl = str2;
    }

    public static /* synthetic */ UserBadgeImageUrl copy$default(UserBadgeImageUrl userBadgeImageUrl, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userBadgeImageUrl.imageUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = userBadgeImageUrl.smallImageUrl;
        }
        return userBadgeImageUrl.copy(str, str2);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.smallImageUrl;
    }

    public final UserBadgeImageUrl copy(String str, String str2) {
        p.h(str, "imageUrl");
        p.h(str2, "smallImageUrl");
        return new UserBadgeImageUrl(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserBadgeImageUrl) {
            UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) obj;
            return p.c(this.imageUrl, userBadgeImageUrl.imageUrl) && p.c(this.smallImageUrl, userBadgeImageUrl.smallImageUrl);
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSmallImageUrl() {
        return this.smallImageUrl;
    }

    public int hashCode() {
        return (this.imageUrl.hashCode() * 31) + this.smallImageUrl.hashCode();
    }

    public final void setImageUrl(String str) {
        p.h(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setSmallImageUrl(String str) {
        p.h(str, "<set-?>");
        this.smallImageUrl = str;
    }

    public String toString() {
        return "UserBadgeImageUrl(imageUrl=" + this.imageUrl + ", smallImageUrl=" + this.smallImageUrl + ')';
    }

    public /* synthetic */ UserBadgeImageUrl(String str, String str2, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
