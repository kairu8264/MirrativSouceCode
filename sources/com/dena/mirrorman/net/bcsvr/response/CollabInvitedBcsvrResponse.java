package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.api.response.CollabTypeAdapter;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class CollabInvitedBcsvrResponse {
    public static final int $stable = 0;
    @b(CollabTypeAdapter.class)
    private final CollabType collabType;
    private final String inviteUserId;
    @c("burl")
    private final String streamerBadgeImageUrl;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String streamerName;
    @c("iurl")
    private final String streamerProfileImageUrl;
    @c("u")
    private final String streamerUserId;

    public CollabInvitedBcsvrResponse(String str, CollabType collabType, String str2, String str3, String str4, String str5) {
        p.h(str, "inviteUserId");
        p.h(collabType, "collabType");
        p.h(str2, "streamerUserId");
        p.h(str3, "streamerName");
        p.h(str4, "streamerProfileImageUrl");
        p.h(str5, "streamerBadgeImageUrl");
        this.inviteUserId = str;
        this.collabType = collabType;
        this.streamerUserId = str2;
        this.streamerName = str3;
        this.streamerProfileImageUrl = str4;
        this.streamerBadgeImageUrl = str5;
    }

    public static /* synthetic */ CollabInvitedBcsvrResponse copy$default(CollabInvitedBcsvrResponse collabInvitedBcsvrResponse, String str, CollabType collabType, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = collabInvitedBcsvrResponse.inviteUserId;
        }
        if ((i10 & 2) != 0) {
            collabType = collabInvitedBcsvrResponse.collabType;
        }
        CollabType collabType2 = collabType;
        if ((i10 & 4) != 0) {
            str2 = collabInvitedBcsvrResponse.streamerUserId;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = collabInvitedBcsvrResponse.streamerName;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = collabInvitedBcsvrResponse.streamerProfileImageUrl;
        }
        String str8 = str4;
        if ((i10 & 32) != 0) {
            str5 = collabInvitedBcsvrResponse.streamerBadgeImageUrl;
        }
        return collabInvitedBcsvrResponse.copy(str, collabType2, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.inviteUserId;
    }

    public final CollabType component2() {
        return this.collabType;
    }

    public final String component3() {
        return this.streamerUserId;
    }

    public final String component4() {
        return this.streamerName;
    }

    public final String component5() {
        return this.streamerProfileImageUrl;
    }

    public final String component6() {
        return this.streamerBadgeImageUrl;
    }

    public final CollabInvitedBcsvrResponse copy(String str, CollabType collabType, String str2, String str3, String str4, String str5) {
        p.h(str, "inviteUserId");
        p.h(collabType, "collabType");
        p.h(str2, "streamerUserId");
        p.h(str3, "streamerName");
        p.h(str4, "streamerProfileImageUrl");
        p.h(str5, "streamerBadgeImageUrl");
        return new CollabInvitedBcsvrResponse(str, collabType, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabInvitedBcsvrResponse) {
            CollabInvitedBcsvrResponse collabInvitedBcsvrResponse = (CollabInvitedBcsvrResponse) obj;
            return p.c(this.inviteUserId, collabInvitedBcsvrResponse.inviteUserId) && this.collabType == collabInvitedBcsvrResponse.collabType && p.c(this.streamerUserId, collabInvitedBcsvrResponse.streamerUserId) && p.c(this.streamerName, collabInvitedBcsvrResponse.streamerName) && p.c(this.streamerProfileImageUrl, collabInvitedBcsvrResponse.streamerProfileImageUrl) && p.c(this.streamerBadgeImageUrl, collabInvitedBcsvrResponse.streamerBadgeImageUrl);
        }
        return false;
    }

    public final CollabType getCollabType() {
        return this.collabType;
    }

    public final String getInviteUserId() {
        return this.inviteUserId;
    }

    public final String getStreamerBadgeImageUrl() {
        return this.streamerBadgeImageUrl;
    }

    public final String getStreamerName() {
        return this.streamerName;
    }

    public final String getStreamerProfileImageUrl() {
        return this.streamerProfileImageUrl;
    }

    public final String getStreamerUserId() {
        return this.streamerUserId;
    }

    public int hashCode() {
        return (((((((((this.inviteUserId.hashCode() * 31) + this.collabType.hashCode()) * 31) + this.streamerUserId.hashCode()) * 31) + this.streamerName.hashCode()) * 31) + this.streamerProfileImageUrl.hashCode()) * 31) + this.streamerBadgeImageUrl.hashCode();
    }

    public String toString() {
        return "CollabInvitedBcsvrResponse(inviteUserId=" + this.inviteUserId + ", collabType=" + this.collabType + ", streamerUserId=" + this.streamerUserId + ", streamerName=" + this.streamerName + ", streamerProfileImageUrl=" + this.streamerProfileImageUrl + ", streamerBadgeImageUrl=" + this.streamerBadgeImageUrl + ')';
    }
}
