package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class CommentAppUserDetail {
    public static final int $stable = 0;
    @c("cm")
    private final String appUserId;
    @c("burl")
    private final String badgeImageUrl;
    @c("collab_streamer_ac")
    private final String collabStreamerUserName;
    @c("iurl")
    private final String profileImageUrl;

    /* renamed from: t  reason: collision with root package name */
    private final int f26183t;
    private final int type;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;

    public CommentAppUserDetail(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "appUserId");
        p.h(str6, "collabStreamerUserName");
        this.f26183t = i10;
        this.userId = str;
        this.userName = str2;
        this.profileImageUrl = str3;
        this.badgeImageUrl = str4;
        this.appUserId = str5;
        this.collabStreamerUserName = str6;
        this.type = i11;
    }

    public final int component1() {
        return this.f26183t;
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

    public final String component6() {
        return this.appUserId;
    }

    public final String component7() {
        return this.collabStreamerUserName;
    }

    public final int component8() {
        return this.type;
    }

    public final CommentAppUserDetail copy(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "appUserId");
        p.h(str6, "collabStreamerUserName");
        return new CommentAppUserDetail(i10, str, str2, str3, str4, str5, str6, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommentAppUserDetail) {
            CommentAppUserDetail commentAppUserDetail = (CommentAppUserDetail) obj;
            return this.f26183t == commentAppUserDetail.f26183t && p.c(this.userId, commentAppUserDetail.userId) && p.c(this.userName, commentAppUserDetail.userName) && p.c(this.profileImageUrl, commentAppUserDetail.profileImageUrl) && p.c(this.badgeImageUrl, commentAppUserDetail.badgeImageUrl) && p.c(this.appUserId, commentAppUserDetail.appUserId) && p.c(this.collabStreamerUserName, commentAppUserDetail.collabStreamerUserName) && this.type == commentAppUserDetail.type;
        }
        return false;
    }

    public final String getAppUserId() {
        return this.appUserId;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final String getCollabStreamerUserName() {
        return this.collabStreamerUserName;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final int getT() {
        return this.f26183t;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f26183t) * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.appUserId.hashCode()) * 31) + this.collabStreamerUserName.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    public String toString() {
        return "CommentAppUserDetail(t=" + this.f26183t + ", userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", appUserId=" + this.appUserId + ", collabStreamerUserName=" + this.collabStreamerUserName + ", type=" + this.type + ')';
    }
}
