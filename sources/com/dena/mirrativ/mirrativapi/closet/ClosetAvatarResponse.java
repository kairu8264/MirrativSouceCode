package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.Referer;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class ClosetAvatarResponse implements Serializable {
    private final ClosetAvatar avatar;
    private final String avatarBodyImageUrl;
    private final Closet closet;
    private final String shareText;
    private final Status status;

    public ClosetAvatarResponse(Closet closet, ClosetAvatar closetAvatar, String str, String str2, Status status) {
        p.h(closetAvatar, Referer.AVATAR);
        p.h(str, "avatarBodyImageUrl");
        p.h(str2, "shareText");
        p.h(status, "status");
        this.closet = closet;
        this.avatar = closetAvatar;
        this.avatarBodyImageUrl = str;
        this.shareText = str2;
        this.status = status;
    }

    public static /* synthetic */ ClosetAvatarResponse copy$default(ClosetAvatarResponse closetAvatarResponse, Closet closet, ClosetAvatar closetAvatar, String str, String str2, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            closet = closetAvatarResponse.closet;
        }
        if ((i10 & 2) != 0) {
            closetAvatar = closetAvatarResponse.avatar;
        }
        ClosetAvatar closetAvatar2 = closetAvatar;
        if ((i10 & 4) != 0) {
            str = closetAvatarResponse.avatarBodyImageUrl;
        }
        String str3 = str;
        if ((i10 & 8) != 0) {
            str2 = closetAvatarResponse.shareText;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            status = closetAvatarResponse.status;
        }
        return closetAvatarResponse.copy(closet, closetAvatar2, str3, str4, status);
    }

    public final Closet component1() {
        return this.closet;
    }

    public final ClosetAvatar component2() {
        return this.avatar;
    }

    public final String component3() {
        return this.avatarBodyImageUrl;
    }

    public final String component4() {
        return this.shareText;
    }

    public final Status component5() {
        return this.status;
    }

    public final ClosetAvatarResponse copy(Closet closet, ClosetAvatar closetAvatar, String str, String str2, Status status) {
        p.h(closetAvatar, Referer.AVATAR);
        p.h(str, "avatarBodyImageUrl");
        p.h(str2, "shareText");
        p.h(status, "status");
        return new ClosetAvatarResponse(closet, closetAvatar, str, str2, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetAvatarResponse) {
            ClosetAvatarResponse closetAvatarResponse = (ClosetAvatarResponse) obj;
            return p.c(this.closet, closetAvatarResponse.closet) && p.c(this.avatar, closetAvatarResponse.avatar) && p.c(this.avatarBodyImageUrl, closetAvatarResponse.avatarBodyImageUrl) && p.c(this.shareText, closetAvatarResponse.shareText) && p.c(this.status, closetAvatarResponse.status);
        }
        return false;
    }

    public final ClosetAvatar getAvatar() {
        return this.avatar;
    }

    public final String getAvatarBodyImageUrl() {
        return this.avatarBodyImageUrl;
    }

    public final Closet getCloset() {
        return this.closet;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        Closet closet = this.closet;
        return ((((((((closet == null ? 0 : closet.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.avatarBodyImageUrl.hashCode()) * 31) + this.shareText.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ClosetAvatarResponse(closet=" + this.closet + ", avatar=" + this.avatar + ", avatarBodyImageUrl=" + this.avatarBodyImageUrl + ", shareText=" + this.shareText + ", status=" + this.status + ')';
    }
}
