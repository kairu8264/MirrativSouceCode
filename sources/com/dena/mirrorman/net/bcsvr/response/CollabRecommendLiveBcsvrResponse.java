package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class CollabRecommendLiveBcsvrResponse {
    public static final int $stable = 0;
    @c("burl")
    private final String badgeImageUrl;
    @c("cm")
    private final String liveComment;
    private final String liveId;
    @c("iurl")
    private final String profileImageUrl;
    private final String speech;
    @c(TopicConstant.PACKET_TYPE_TEXT)
    private final int type;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;

    public CollabRecommendLiveBcsvrResponse(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "liveComment");
        p.h(str7, "liveId");
        this.type = i10;
        this.userId = str;
        this.userName = str2;
        this.profileImageUrl = str3;
        this.badgeImageUrl = str4;
        this.liveComment = str5;
        this.speech = str6;
        this.liveId = str7;
    }

    public final int component1() {
        return this.type;
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
        return this.liveComment;
    }

    public final String component7() {
        return this.speech;
    }

    public final String component8() {
        return this.liveId;
    }

    public final CollabRecommendLiveBcsvrResponse copy(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        p.h(str5, "liveComment");
        p.h(str7, "liveId");
        return new CollabRecommendLiveBcsvrResponse(i10, str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabRecommendLiveBcsvrResponse) {
            CollabRecommendLiveBcsvrResponse collabRecommendLiveBcsvrResponse = (CollabRecommendLiveBcsvrResponse) obj;
            return this.type == collabRecommendLiveBcsvrResponse.type && p.c(this.userId, collabRecommendLiveBcsvrResponse.userId) && p.c(this.userName, collabRecommendLiveBcsvrResponse.userName) && p.c(this.profileImageUrl, collabRecommendLiveBcsvrResponse.profileImageUrl) && p.c(this.badgeImageUrl, collabRecommendLiveBcsvrResponse.badgeImageUrl) && p.c(this.liveComment, collabRecommendLiveBcsvrResponse.liveComment) && p.c(this.speech, collabRecommendLiveBcsvrResponse.speech) && p.c(this.liveId, collabRecommendLiveBcsvrResponse.liveId);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final String getLiveComment() {
        return this.liveComment;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getSpeech() {
        return this.speech;
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
        int hashCode = ((((((((((Integer.hashCode(this.type) * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31) + this.liveComment.hashCode()) * 31;
        String str = this.speech;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.liveId.hashCode();
    }

    public String toString() {
        return "CollabRecommendLiveBcsvrResponse(type=" + this.type + ", userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", liveComment=" + this.liveComment + ", speech=" + this.speech + ", liveId=" + this.liveId + ')';
    }

    public /* synthetic */ CollabRecommendLiveBcsvrResponse(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, h hVar) {
        this(i10, str, str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) != 0 ? "" : str5, str6, str7);
    }
}
