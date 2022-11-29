package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class CollabClosedBcsvrResponse {
    public static final int $stable = 0;
    @c("burl")
    private final String badgeImageUrl;
    @c("iurl")
    private final String profileImageUrl;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;

    public CollabClosedBcsvrResponse(String str, String str2, String str3, String str4) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        this.userId = str;
        this.userName = str2;
        this.profileImageUrl = str3;
        this.badgeImageUrl = str4;
    }

    public static /* synthetic */ CollabClosedBcsvrResponse copy$default(CollabClosedBcsvrResponse collabClosedBcsvrResponse, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = collabClosedBcsvrResponse.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = collabClosedBcsvrResponse.userName;
        }
        if ((i10 & 4) != 0) {
            str3 = collabClosedBcsvrResponse.profileImageUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = collabClosedBcsvrResponse.badgeImageUrl;
        }
        return collabClosedBcsvrResponse.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.profileImageUrl;
    }

    public final String component4() {
        return this.badgeImageUrl;
    }

    public final CollabClosedBcsvrResponse copy(String str, String str2, String str3, String str4) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        return new CollabClosedBcsvrResponse(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabClosedBcsvrResponse) {
            CollabClosedBcsvrResponse collabClosedBcsvrResponse = (CollabClosedBcsvrResponse) obj;
            return p.c(this.userId, collabClosedBcsvrResponse.userId) && p.c(this.userName, collabClosedBcsvrResponse.userName) && p.c(this.profileImageUrl, collabClosedBcsvrResponse.profileImageUrl) && p.c(this.badgeImageUrl, collabClosedBcsvrResponse.badgeImageUrl);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode();
    }

    public String toString() {
        return "CollabClosedBcsvrResponse(userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ')';
    }

    public /* synthetic */ CollabClosedBcsvrResponse(String str, String str2, String str3, String str4, int i10, h hVar) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
