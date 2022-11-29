package com.dena.mirrorman.net.api.response.user;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class CollabInvitableUser {
    public static final int $stable = 8;
    private final List<UserBadgeImageUrl> badges;
    private final String catalogLabelImageUrl;
    private final int latestLiveStartedAt;
    private final String name;
    private final String profileImageUrl;
    private final String userId;
    private final int yellLevel;
    private final int yellRank;

    public CollabInvitableUser(int i10, String str, String str2, String str3, List<UserBadgeImageUrl> list, String str4, int i11, int i12) {
        p.h(str, "userId");
        p.h(str2, "name");
        p.h(str3, "profileImageUrl");
        p.h(list, "badges");
        this.latestLiveStartedAt = i10;
        this.userId = str;
        this.name = str2;
        this.profileImageUrl = str3;
        this.badges = list;
        this.catalogLabelImageUrl = str4;
        this.yellRank = i11;
        this.yellLevel = i12;
    }

    public final int component1() {
        return this.latestLiveStartedAt;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.profileImageUrl;
    }

    public final List<UserBadgeImageUrl> component5() {
        return this.badges;
    }

    public final String component6() {
        return this.catalogLabelImageUrl;
    }

    public final int component7() {
        return this.yellRank;
    }

    public final int component8() {
        return this.yellLevel;
    }

    public final CollabInvitableUser copy(int i10, String str, String str2, String str3, List<UserBadgeImageUrl> list, String str4, int i11, int i12) {
        p.h(str, "userId");
        p.h(str2, "name");
        p.h(str3, "profileImageUrl");
        p.h(list, "badges");
        return new CollabInvitableUser(i10, str, str2, str3, list, str4, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabInvitableUser) {
            CollabInvitableUser collabInvitableUser = (CollabInvitableUser) obj;
            return this.latestLiveStartedAt == collabInvitableUser.latestLiveStartedAt && p.c(this.userId, collabInvitableUser.userId) && p.c(this.name, collabInvitableUser.name) && p.c(this.profileImageUrl, collabInvitableUser.profileImageUrl) && p.c(this.badges, collabInvitableUser.badges) && p.c(this.catalogLabelImageUrl, collabInvitableUser.catalogLabelImageUrl) && this.yellRank == collabInvitableUser.yellRank && this.yellLevel == collabInvitableUser.yellLevel;
        }
        return false;
    }

    public final List<UserBadgeImageUrl> getBadges() {
        return this.badges;
    }

    public final String getCatalogLabelImageUrl() {
        return this.catalogLabelImageUrl;
    }

    public final int getLatestLiveStartedAt() {
        return this.latestLiveStartedAt;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getYellLevel() {
        return this.yellLevel;
    }

    public final int getYellRank() {
        return this.yellRank;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.latestLiveStartedAt) * 31) + this.userId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badges.hashCode()) * 31;
        String str = this.catalogLabelImageUrl;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.yellRank)) * 31) + Integer.hashCode(this.yellLevel);
    }

    public String toString() {
        return "CollabInvitableUser(latestLiveStartedAt=" + this.latestLiveStartedAt + ", userId=" + this.userId + ", name=" + this.name + ", profileImageUrl=" + this.profileImageUrl + ", badges=" + this.badges + ", catalogLabelImageUrl=" + this.catalogLabelImageUrl + ", yellRank=" + this.yellRank + ", yellLevel=" + this.yellLevel + ')';
    }
}
