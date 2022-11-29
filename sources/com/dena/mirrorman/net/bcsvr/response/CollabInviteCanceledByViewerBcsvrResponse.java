package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.CollabTypeAdapter;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.h;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class CollabInviteCanceledByViewerBcsvrResponse {
    public static final int $stable = 0;
    @c("burl")
    private final String badgeImageUrl;
    @b(CollabTypeAdapter.class)
    private final CollabType collabType;
    @c("iurl")
    private final String profileImageUrl;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;

    public CollabInviteCanceledByViewerBcsvrResponse(String str, String str2, String str3, String str4, CollabType collabType) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(collabType, "collabType");
        this.userId = str;
        this.userName = str2;
        this.profileImageUrl = str3;
        this.badgeImageUrl = str4;
        this.collabType = collabType;
    }

    public static /* synthetic */ CollabInviteCanceledByViewerBcsvrResponse copy$default(CollabInviteCanceledByViewerBcsvrResponse collabInviteCanceledByViewerBcsvrResponse, String str, String str2, String str3, String str4, CollabType collabType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = collabInviteCanceledByViewerBcsvrResponse.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = collabInviteCanceledByViewerBcsvrResponse.userName;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = collabInviteCanceledByViewerBcsvrResponse.profileImageUrl;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = collabInviteCanceledByViewerBcsvrResponse.badgeImageUrl;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            collabType = collabInviteCanceledByViewerBcsvrResponse.collabType;
        }
        return collabInviteCanceledByViewerBcsvrResponse.copy(str, str5, str6, str7, collabType);
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

    public final CollabType component5() {
        return this.collabType;
    }

    public final CollabInviteCanceledByViewerBcsvrResponse copy(String str, String str2, String str3, String str4, CollabType collabType) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(collabType, "collabType");
        return new CollabInviteCanceledByViewerBcsvrResponse(str, str2, str3, str4, collabType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabInviteCanceledByViewerBcsvrResponse) {
            CollabInviteCanceledByViewerBcsvrResponse collabInviteCanceledByViewerBcsvrResponse = (CollabInviteCanceledByViewerBcsvrResponse) obj;
            return p.c(this.userId, collabInviteCanceledByViewerBcsvrResponse.userId) && p.c(this.userName, collabInviteCanceledByViewerBcsvrResponse.userName) && p.c(this.profileImageUrl, collabInviteCanceledByViewerBcsvrResponse.profileImageUrl) && p.c(this.badgeImageUrl, collabInviteCanceledByViewerBcsvrResponse.badgeImageUrl) && this.collabType == collabInviteCanceledByViewerBcsvrResponse.collabType;
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final CollabType getCollabType() {
        return this.collabType;
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
        return (((((((this.userId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.collabType.hashCode();
    }

    public String toString() {
        return "CollabInviteCanceledByViewerBcsvrResponse(userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", collabType=" + this.collabType + ')';
    }

    public /* synthetic */ CollabInviteCanceledByViewerBcsvrResponse(String str, String str2, String str3, String str4, CollabType collabType, int i10, h hVar) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, collabType);
    }
}
