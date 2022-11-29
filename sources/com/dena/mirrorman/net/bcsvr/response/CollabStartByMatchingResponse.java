package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class CollabStartByMatchingResponse {
    public static final int $stable = 0;
    @c("iurl")
    private final String profileImageUrl;
    @c(TopicConstant.PACKET_TYPE_TEXT)
    private final int type;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;

    public CollabStartByMatchingResponse(int i10, String str, String str2, String str3) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        this.type = i10;
        this.userId = str;
        this.userName = str2;
        this.profileImageUrl = str3;
    }

    public static /* synthetic */ CollabStartByMatchingResponse copy$default(CollabStartByMatchingResponse collabStartByMatchingResponse, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = collabStartByMatchingResponse.type;
        }
        if ((i11 & 2) != 0) {
            str = collabStartByMatchingResponse.userId;
        }
        if ((i11 & 4) != 0) {
            str2 = collabStartByMatchingResponse.userName;
        }
        if ((i11 & 8) != 0) {
            str3 = collabStartByMatchingResponse.profileImageUrl;
        }
        return collabStartByMatchingResponse.copy(i10, str, str2, str3);
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

    public final CollabStartByMatchingResponse copy(int i10, String str, String str2, String str3) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        return new CollabStartByMatchingResponse(i10, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabStartByMatchingResponse) {
            CollabStartByMatchingResponse collabStartByMatchingResponse = (CollabStartByMatchingResponse) obj;
            return this.type == collabStartByMatchingResponse.type && p.c(this.userId, collabStartByMatchingResponse.userId) && p.c(this.userName, collabStartByMatchingResponse.userName) && p.c(this.profileImageUrl, collabStartByMatchingResponse.profileImageUrl);
        }
        return false;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
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
        return (((((Integer.hashCode(this.type) * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode();
    }

    public String toString() {
        return "CollabStartByMatchingResponse(type=" + this.type + ", userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ')';
    }

    public /* synthetic */ CollabStartByMatchingResponse(int i10, String str, String str2, String str3, int i11, h hVar) {
        this(i10, str, str2, (i11 & 8) != 0 ? "" : str3);
    }
}
