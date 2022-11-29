package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.CollabTypeAdapter;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.h;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class CollabInviteCanceledByStreamerBcsvrResponse {
    public static final int $stable = 0;
    @c("burl")
    private final String badgeImageUrl;
    @b(CollabTypeAdapter.class)
    private final CollabType collabType;
    private final String invitedUserId;
    @c("iurl")
    private final String profileImageUrl;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;

    public CollabInviteCanceledByStreamerBcsvrResponse(String str, String str2, String str3, String str4, String str5, CollabType collabType) {
        p.h(str, "invitedUserId");
        p.h(str2, "userId");
        p.h(str3, "userName");
        p.h(str4, "profileImageUrl");
        p.h(str5, "badgeImageUrl");
        p.h(collabType, "collabType");
        this.invitedUserId = str;
        this.userId = str2;
        this.userName = str3;
        this.profileImageUrl = str4;
        this.badgeImageUrl = str5;
        this.collabType = collabType;
    }

    public static /* synthetic */ CollabInviteCanceledByStreamerBcsvrResponse copy$default(CollabInviteCanceledByStreamerBcsvrResponse collabInviteCanceledByStreamerBcsvrResponse, String str, String str2, String str3, String str4, String str5, CollabType collabType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = collabInviteCanceledByStreamerBcsvrResponse.invitedUserId;
        }
        if ((i10 & 2) != 0) {
            str2 = collabInviteCanceledByStreamerBcsvrResponse.userId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = collabInviteCanceledByStreamerBcsvrResponse.userName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = collabInviteCanceledByStreamerBcsvrResponse.profileImageUrl;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = collabInviteCanceledByStreamerBcsvrResponse.badgeImageUrl;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            collabType = collabInviteCanceledByStreamerBcsvrResponse.collabType;
        }
        return collabInviteCanceledByStreamerBcsvrResponse.copy(str, str6, str7, str8, str9, collabType);
    }

    public final String component1() {
        return this.invitedUserId;
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

    public final CollabType component6() {
        return this.collabType;
    }

    public final CollabInviteCanceledByStreamerBcsvrResponse copy(String str, String str2, String str3, String str4, String str5, CollabType collabType) {
        p.h(str, "invitedUserId");
        p.h(str2, "userId");
        p.h(str3, "userName");
        p.h(str4, "profileImageUrl");
        p.h(str5, "badgeImageUrl");
        p.h(collabType, "collabType");
        return new CollabInviteCanceledByStreamerBcsvrResponse(str, str2, str3, str4, str5, collabType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabInviteCanceledByStreamerBcsvrResponse) {
            CollabInviteCanceledByStreamerBcsvrResponse collabInviteCanceledByStreamerBcsvrResponse = (CollabInviteCanceledByStreamerBcsvrResponse) obj;
            return p.c(this.invitedUserId, collabInviteCanceledByStreamerBcsvrResponse.invitedUserId) && p.c(this.userId, collabInviteCanceledByStreamerBcsvrResponse.userId) && p.c(this.userName, collabInviteCanceledByStreamerBcsvrResponse.userName) && p.c(this.profileImageUrl, collabInviteCanceledByStreamerBcsvrResponse.profileImageUrl) && p.c(this.badgeImageUrl, collabInviteCanceledByStreamerBcsvrResponse.badgeImageUrl) && this.collabType == collabInviteCanceledByStreamerBcsvrResponse.collabType;
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final CollabType getCollabType() {
        return this.collabType;
    }

    public final String getInvitedUserId() {
        return this.invitedUserId;
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
        return (((((((((this.invitedUserId.hashCode() * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.collabType.hashCode();
    }

    public String toString() {
        return "CollabInviteCanceledByStreamerBcsvrResponse(invitedUserId=" + this.invitedUserId + ", userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", collabType=" + this.collabType + ')';
    }

    public /* synthetic */ CollabInviteCanceledByStreamerBcsvrResponse(String str, String str2, String str3, String str4, String str5, CollabType collabType, int i10, h hVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5, collabType);
    }
}
