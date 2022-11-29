package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class LuckyPrizeBcsvrResponse {
    public static final int $stable = 0;
    @c("burl")
    private final String badgeImageUrl;
    @c("iurl")
    private final String profileImageUrl;
    private final String rewardImageUrl;
    private final String rewardTitle;
    private final String speech;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;

    public LuckyPrizeBcsvrResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "rewardTitle");
        p.h(str4, "rewardImageUrl");
        p.h(str5, "profileImageUrl");
        p.h(str6, "badgeImageUrl");
        this.userId = str;
        this.userName = str2;
        this.rewardTitle = str3;
        this.rewardImageUrl = str4;
        this.profileImageUrl = str5;
        this.badgeImageUrl = str6;
        this.speech = str7;
    }

    public static /* synthetic */ LuckyPrizeBcsvrResponse copy$default(LuckyPrizeBcsvrResponse luckyPrizeBcsvrResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = luckyPrizeBcsvrResponse.userId;
        }
        if ((i10 & 2) != 0) {
            str2 = luckyPrizeBcsvrResponse.userName;
        }
        String str8 = str2;
        if ((i10 & 4) != 0) {
            str3 = luckyPrizeBcsvrResponse.rewardTitle;
        }
        String str9 = str3;
        if ((i10 & 8) != 0) {
            str4 = luckyPrizeBcsvrResponse.rewardImageUrl;
        }
        String str10 = str4;
        if ((i10 & 16) != 0) {
            str5 = luckyPrizeBcsvrResponse.profileImageUrl;
        }
        String str11 = str5;
        if ((i10 & 32) != 0) {
            str6 = luckyPrizeBcsvrResponse.badgeImageUrl;
        }
        String str12 = str6;
        if ((i10 & 64) != 0) {
            str7 = luckyPrizeBcsvrResponse.speech;
        }
        return luckyPrizeBcsvrResponse.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.rewardTitle;
    }

    public final String component4() {
        return this.rewardImageUrl;
    }

    public final String component5() {
        return this.profileImageUrl;
    }

    public final String component6() {
        return this.badgeImageUrl;
    }

    public final String component7() {
        return this.speech;
    }

    public final LuckyPrizeBcsvrResponse copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "rewardTitle");
        p.h(str4, "rewardImageUrl");
        p.h(str5, "profileImageUrl");
        p.h(str6, "badgeImageUrl");
        return new LuckyPrizeBcsvrResponse(str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LuckyPrizeBcsvrResponse) {
            LuckyPrizeBcsvrResponse luckyPrizeBcsvrResponse = (LuckyPrizeBcsvrResponse) obj;
            return p.c(this.userId, luckyPrizeBcsvrResponse.userId) && p.c(this.userName, luckyPrizeBcsvrResponse.userName) && p.c(this.rewardTitle, luckyPrizeBcsvrResponse.rewardTitle) && p.c(this.rewardImageUrl, luckyPrizeBcsvrResponse.rewardImageUrl) && p.c(this.profileImageUrl, luckyPrizeBcsvrResponse.profileImageUrl) && p.c(this.badgeImageUrl, luckyPrizeBcsvrResponse.badgeImageUrl) && p.c(this.speech, luckyPrizeBcsvrResponse.speech);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getRewardImageUrl() {
        return this.rewardImageUrl;
    }

    public final String getRewardTitle() {
        return this.rewardTitle;
    }

    public final String getSpeech() {
        return this.speech;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.userId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.rewardTitle.hashCode()) * 31) + this.rewardImageUrl.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.badgeImageUrl.hashCode()) * 31;
        String str = this.speech;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "LuckyPrizeBcsvrResponse(userId=" + this.userId + ", userName=" + this.userName + ", rewardTitle=" + this.rewardTitle + ", rewardImageUrl=" + this.rewardImageUrl + ", profileImageUrl=" + this.profileImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ", speech=" + this.speech + ')';
    }

    public /* synthetic */ LuckyPrizeBcsvrResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, h hVar) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? "" : str5, (i10 & 32) != 0 ? "" : str6, str7);
    }
}
