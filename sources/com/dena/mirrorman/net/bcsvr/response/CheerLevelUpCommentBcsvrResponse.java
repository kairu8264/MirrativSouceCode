package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrativ.mirrativapi.user.YellRankType;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class CheerLevelUpCommentBcsvrResponse {
    public static final int $stable = 0;

    /* renamed from: cm  reason: collision with root package name */
    private final String f26182cm;
    private final boolean isYellRankUp;
    @c("iurl")
    private final String profileImageUrl;
    private final String speech;
    @c(TopicConstant.PACKET_TYPE_TEXT)
    private final int type;
    @c("u")
    private final String userId;
    @c(TopicConstant.PACKET_TYPE_AUDIO_AAC)
    private final String userName;
    private final String yellBonusDescription;
    private final int yellLevel;
    private final String yellLpUrl;
    @b(YellRankType.TypeAdapter.class)
    private final YellRankType yellRank;

    public CheerLevelUpCommentBcsvrResponse(int i10, String str, String str2, String str3, String str4, YellRankType yellRankType, int i11, boolean z10, String str5, String str6, String str7) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "speech");
        p.h(yellRankType, "yellRank");
        p.h(str5, "yellLpUrl");
        p.h(str6, "yellBonusDescription");
        p.h(str7, "cm");
        this.type = i10;
        this.userId = str;
        this.userName = str2;
        this.profileImageUrl = str3;
        this.speech = str4;
        this.yellRank = yellRankType;
        this.yellLevel = i11;
        this.isYellRankUp = z10;
        this.yellLpUrl = str5;
        this.yellBonusDescription = str6;
        this.f26182cm = str7;
    }

    public final int component1() {
        return this.type;
    }

    public final String component10() {
        return this.yellBonusDescription;
    }

    public final String component11() {
        return this.f26182cm;
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
        return this.speech;
    }

    public final YellRankType component6() {
        return this.yellRank;
    }

    public final int component7() {
        return this.yellLevel;
    }

    public final boolean component8() {
        return this.isYellRankUp;
    }

    public final String component9() {
        return this.yellLpUrl;
    }

    public final CheerLevelUpCommentBcsvrResponse copy(int i10, String str, String str2, String str3, String str4, YellRankType yellRankType, int i11, boolean z10, String str5, String str6, String str7) {
        p.h(str, "userId");
        p.h(str2, "userName");
        p.h(str3, "profileImageUrl");
        p.h(str4, "speech");
        p.h(yellRankType, "yellRank");
        p.h(str5, "yellLpUrl");
        p.h(str6, "yellBonusDescription");
        p.h(str7, "cm");
        return new CheerLevelUpCommentBcsvrResponse(i10, str, str2, str3, str4, yellRankType, i11, z10, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheerLevelUpCommentBcsvrResponse) {
            CheerLevelUpCommentBcsvrResponse cheerLevelUpCommentBcsvrResponse = (CheerLevelUpCommentBcsvrResponse) obj;
            return this.type == cheerLevelUpCommentBcsvrResponse.type && p.c(this.userId, cheerLevelUpCommentBcsvrResponse.userId) && p.c(this.userName, cheerLevelUpCommentBcsvrResponse.userName) && p.c(this.profileImageUrl, cheerLevelUpCommentBcsvrResponse.profileImageUrl) && p.c(this.speech, cheerLevelUpCommentBcsvrResponse.speech) && this.yellRank == cheerLevelUpCommentBcsvrResponse.yellRank && this.yellLevel == cheerLevelUpCommentBcsvrResponse.yellLevel && this.isYellRankUp == cheerLevelUpCommentBcsvrResponse.isYellRankUp && p.c(this.yellLpUrl, cheerLevelUpCommentBcsvrResponse.yellLpUrl) && p.c(this.yellBonusDescription, cheerLevelUpCommentBcsvrResponse.yellBonusDescription) && p.c(this.f26182cm, cheerLevelUpCommentBcsvrResponse.f26182cm);
        }
        return false;
    }

    public final String getCm() {
        return this.f26182cm;
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

    public final String getYellBonusDescription() {
        return this.yellBonusDescription;
    }

    public final int getYellLevel() {
        return this.yellLevel;
    }

    public final String getYellLpUrl() {
        return this.yellLpUrl;
    }

    public final YellRankType getYellRank() {
        return this.yellRank;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.type) * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.speech.hashCode()) * 31) + this.yellRank.hashCode()) * 31) + Integer.hashCode(this.yellLevel)) * 31;
        boolean z10 = this.isYellRankUp;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((((hashCode + i10) * 31) + this.yellLpUrl.hashCode()) * 31) + this.yellBonusDescription.hashCode()) * 31) + this.f26182cm.hashCode();
    }

    public final boolean isYellRankUp() {
        return this.isYellRankUp;
    }

    public String toString() {
        return "CheerLevelUpCommentBcsvrResponse(type=" + this.type + ", userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", speech=" + this.speech + ", yellRank=" + this.yellRank + ", yellLevel=" + this.yellLevel + ", isYellRankUp=" + this.isYellRankUp + ", yellLpUrl=" + this.yellLpUrl + ", yellBonusDescription=" + this.yellBonusDescription + ", cm=" + this.f26182cm + ')';
    }
}
