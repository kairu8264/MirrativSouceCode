package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class CollabRequestCanceledBcsvrResponse {
    public static final int $stable = 0;
    @c("burl")
    private final String badgeImageUrl;
    private final String canceledUserId;
    @c("iurl")
    private final String profileImageUrl;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;

    public CollabRequestCanceledBcsvrResponse(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "canceledUserId");
        p.h(str2, "userId");
        p.h(str3, "userName");
        p.h(str4, "profileImageUrl");
        p.h(str5, "badgeImageUrl");
        this.canceledUserId = str;
        this.userId = str2;
        this.userName = str3;
        this.profileImageUrl = str4;
        this.badgeImageUrl = str5;
    }

    public static /* synthetic */ CollabRequestCanceledBcsvrResponse copy$default(CollabRequestCanceledBcsvrResponse collabRequestCanceledBcsvrResponse, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = collabRequestCanceledBcsvrResponse.canceledUserId;
        }
        if ((i10 & 2) != 0) {
            str2 = collabRequestCanceledBcsvrResponse.userId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = collabRequestCanceledBcsvrResponse.userName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = collabRequestCanceledBcsvrResponse.profileImageUrl;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = collabRequestCanceledBcsvrResponse.badgeImageUrl;
        }
        return collabRequestCanceledBcsvrResponse.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.canceledUserId;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.userName;
    }

    public final String component4() {
        return this.profileImageUrl;
    }

    public final String component5() {
        return this.badgeImageUrl;
    }

    public final CollabRequestCanceledBcsvrResponse copy(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "canceledUserId");
        p.h(str2, "userId");
        p.h(str3, "userName");
        p.h(str4, "profileImageUrl");
        p.h(str5, "badgeImageUrl");
        return new CollabRequestCanceledBcsvrResponse(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabRequestCanceledBcsvrResponse) {
            CollabRequestCanceledBcsvrResponse collabRequestCanceledBcsvrResponse = (CollabRequestCanceledBcsvrResponse) obj;
            return p.c(this.canceledUserId, collabRequestCanceledBcsvrResponse.canceledUserId) && p.c(this.userId, collabRequestCanceledBcsvrResponse.userId) && p.c(this.userName, collabRequestCanceledBcsvrResponse.userName) && p.c(this.profileImageUrl, collabRequestCanceledBcsvrResponse.profileImageUrl) && p.c(this.badgeImageUrl, collabRequestCanceledBcsvrResponse.badgeImageUrl);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final String getCanceledUserId() {
        return this.canceledUserId;
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
        return (((((((this.canceledUserId.hashCode() * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode();
    }

    public String toString() {
        return "CollabRequestCanceledBcsvrResponse(canceledUserId=" + this.canceledUserId + ", userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ')';
    }

    public /* synthetic */ CollabRequestCanceledBcsvrResponse(String str, String str2, String str3, String str4, String str5, int i10, h hVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5);
    }
}
