package com.dena.mirrativ.mirrativapi.livegame.giftranking;

import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftRankingYesterdayRanking implements Serializable {
    private final String liveId;
    private final String profileImageUrl;
    private final String rank;
    private final String userId;
    private final String userName;

    public GiftRankingYesterdayRanking(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "rank");
        p.h(str2, "userId");
        p.h(str3, "userName");
        p.h(str4, "profileImageUrl");
        p.h(str5, "liveId");
        this.rank = str;
        this.userId = str2;
        this.userName = str3;
        this.profileImageUrl = str4;
        this.liveId = str5;
    }

    public static /* synthetic */ GiftRankingYesterdayRanking copy$default(GiftRankingYesterdayRanking giftRankingYesterdayRanking, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = giftRankingYesterdayRanking.rank;
        }
        if ((i10 & 2) != 0) {
            str2 = giftRankingYesterdayRanking.userId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = giftRankingYesterdayRanking.userName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = giftRankingYesterdayRanking.profileImageUrl;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = giftRankingYesterdayRanking.liveId;
        }
        return giftRankingYesterdayRanking.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.rank;
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
        return this.liveId;
    }

    public final GiftRankingYesterdayRanking copy(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "rank");
        p.h(str2, "userId");
        p.h(str3, "userName");
        p.h(str4, "profileImageUrl");
        p.h(str5, "liveId");
        return new GiftRankingYesterdayRanking(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingYesterdayRanking) {
            GiftRankingYesterdayRanking giftRankingYesterdayRanking = (GiftRankingYesterdayRanking) obj;
            return p.c(this.rank, giftRankingYesterdayRanking.rank) && p.c(this.userId, giftRankingYesterdayRanking.userId) && p.c(this.userName, giftRankingYesterdayRanking.userName) && p.c(this.profileImageUrl, giftRankingYesterdayRanking.profileImageUrl) && p.c(this.liveId, giftRankingYesterdayRanking.liveId);
        }
        return false;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((((((this.rank.hashCode() * 31) + this.userId.hashCode()) * 31) + this.userName.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.liveId.hashCode();
    }

    public String toString() {
        return "GiftRankingYesterdayRanking(rank=" + this.rank + ", userId=" + this.userId + ", userName=" + this.userName + ", profileImageUrl=" + this.profileImageUrl + ", liveId=" + this.liveId + ')';
    }
}
