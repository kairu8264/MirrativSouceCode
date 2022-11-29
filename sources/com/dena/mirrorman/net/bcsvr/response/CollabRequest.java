package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.h;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class CollabRequest {
    public static final int $stable = 0;
    @c("burl")
    private final String badgeImageUrl;
    private final Integer collabType;
    @b(BooleanTypeAdapter.class)
    private final boolean isReconnect;
    @c("iurl")
    private final String profileImageUrl;
    @c(TopicConstant.PACKET_TYPE_TEXT)
    private final int type;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;

    public CollabRequest(int i10, String str, String str2, String str3, String str4, boolean z10, Integer num) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        this.type = i10;
        this.userId = str;
        this.userName = str2;
        this.profileImageUrl = str3;
        this.badgeImageUrl = str4;
        this.isReconnect = z10;
        this.collabType = num;
    }

    public static /* synthetic */ CollabRequest copy$default(CollabRequest collabRequest, int i10, String str, String str2, String str3, String str4, boolean z10, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = collabRequest.type;
        }
        if ((i11 & 2) != 0) {
            str = collabRequest.userId;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = collabRequest.userName;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = collabRequest.profileImageUrl;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = collabRequest.badgeImageUrl;
        }
        String str8 = str4;
        if ((i11 & 32) != 0) {
            z10 = collabRequest.isReconnect;
        }
        boolean z11 = z10;
        if ((i11 & 64) != 0) {
            num = collabRequest.collabType;
        }
        return collabRequest.copy(i10, str5, str6, str7, str8, z11, num);
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

    public final boolean component6() {
        return this.isReconnect;
    }

    public final Integer component7() {
        return this.collabType;
    }

    public final CollabRequest copy(int i10, String str, String str2, String str3, String str4, boolean z10, Integer num) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        return new CollabRequest(i10, str, str2, str3, str4, z10, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabRequest) {
            CollabRequest collabRequest = (CollabRequest) obj;
            return this.type == collabRequest.type && p.c(this.userId, collabRequest.userId) && p.c(this.userName, collabRequest.userName) && p.c(this.profileImageUrl, collabRequest.profileImageUrl) && p.c(this.badgeImageUrl, collabRequest.badgeImageUrl) && this.isReconnect == collabRequest.isReconnect && p.c(this.collabType, collabRequest.collabType);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final Integer getCollabType() {
        return this.collabType;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.type) * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31;
        boolean z10 = this.isReconnect;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        Integer num = this.collabType;
        return i11 + (num == null ? 0 : num.hashCode());
    }

    public final boolean isReconnect() {
        return this.isReconnect;
    }

    public String toString() {
        return "CollabRequest(type=" + this.type + ", userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", isReconnect=" + this.isReconnect + ", collabType=" + this.collabType + ')';
    }

    public /* synthetic */ CollabRequest(int i10, String str, String str2, String str3, String str4, boolean z10, Integer num, int i11, h hVar) {
        this(i10, str, str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, z10, num);
    }
}
