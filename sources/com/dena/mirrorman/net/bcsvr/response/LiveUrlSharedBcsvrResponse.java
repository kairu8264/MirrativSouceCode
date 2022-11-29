package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class LiveUrlSharedBcsvrResponse {
    public static final int $stable = 0;
    @c("burl")
    private final String badgeImageUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isModerator;
    @c("iurl")
    private final String profileImageUrl;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;

    public LiveUrlSharedBcsvrResponse(String str, String str2, String str3, String str4, boolean z10) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        this.userId = str;
        this.userName = str2;
        this.profileImageUrl = str3;
        this.badgeImageUrl = str4;
        this.isModerator = z10;
    }

    public static /* synthetic */ LiveUrlSharedBcsvrResponse copy$default(LiveUrlSharedBcsvrResponse liveUrlSharedBcsvrResponse, String str, String str2, String str3, String str4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveUrlSharedBcsvrResponse.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = liveUrlSharedBcsvrResponse.userName;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = liveUrlSharedBcsvrResponse.profileImageUrl;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = liveUrlSharedBcsvrResponse.badgeImageUrl;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            z10 = liveUrlSharedBcsvrResponse.isModerator;
        }
        return liveUrlSharedBcsvrResponse.copy(str, str5, str6, str7, z10);
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

    public final boolean component5() {
        return this.isModerator;
    }

    public final LiveUrlSharedBcsvrResponse copy(String str, String str2, String str3, String str4, boolean z10) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "badgeImageUrl");
        return new LiveUrlSharedBcsvrResponse(str, str2, str3, str4, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveUrlSharedBcsvrResponse) {
            LiveUrlSharedBcsvrResponse liveUrlSharedBcsvrResponse = (LiveUrlSharedBcsvrResponse) obj;
            return p.c(this.userId, liveUrlSharedBcsvrResponse.userId) && p.c(this.userName, liveUrlSharedBcsvrResponse.userName) && p.c(this.profileImageUrl, liveUrlSharedBcsvrResponse.profileImageUrl) && p.c(this.badgeImageUrl, liveUrlSharedBcsvrResponse.badgeImageUrl) && this.isModerator == liveUrlSharedBcsvrResponse.isModerator;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.userId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31;
        boolean z10 = this.isModerator;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isModerator() {
        return this.isModerator;
    }

    public String toString() {
        return "LiveUrlSharedBcsvrResponse(userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", isModerator=" + this.isModerator + ')';
    }
}
