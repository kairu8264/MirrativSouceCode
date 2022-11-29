package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.Serializable;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class GiftRankingNearbyRankedUser implements Serializable {
    public static final int $stable = 0;
    @c("biu")
    private final String badgeImageUrl;
    @c("gp")
    private final int giftPoint;
    @c("iu")
    private final String iconUrl;
    @c("liu")
    private final String labelImageUrl;
    @c(TopicConstant.EXTEND_AVC_NDR)
    private final String name;
    @c(TopicConstant.EXTEND_AAC_RAW)
    private final int rank;
    @c("u")
    private final String userId;

    public GiftRankingNearbyRankedUser(String str, String str2, int i10, int i11, String str3, String str4, String str5) {
        p.h(str, "userId");
        p.h(str2, "name");
        this.userId = str;
        this.name = str2;
        this.rank = i10;
        this.giftPoint = i11;
        this.iconUrl = str3;
        this.labelImageUrl = str4;
        this.badgeImageUrl = str5;
    }

    public static /* synthetic */ GiftRankingNearbyRankedUser copy$default(GiftRankingNearbyRankedUser giftRankingNearbyRankedUser, String str, String str2, int i10, int i11, String str3, String str4, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = giftRankingNearbyRankedUser.userId;
        }
        if ((i12 & 2) != 0) {
            str2 = giftRankingNearbyRankedUser.name;
        }
        String str6 = str2;
        if ((i12 & 4) != 0) {
            i10 = giftRankingNearbyRankedUser.rank;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = giftRankingNearbyRankedUser.giftPoint;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            str3 = giftRankingNearbyRankedUser.iconUrl;
        }
        String str7 = str3;
        if ((i12 & 32) != 0) {
            str4 = giftRankingNearbyRankedUser.labelImageUrl;
        }
        String str8 = str4;
        if ((i12 & 64) != 0) {
            str5 = giftRankingNearbyRankedUser.badgeImageUrl;
        }
        return giftRankingNearbyRankedUser.copy(str, str6, i13, i14, str7, str8, str5);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.rank;
    }

    public final int component4() {
        return this.giftPoint;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.labelImageUrl;
    }

    public final String component7() {
        return this.badgeImageUrl;
    }

    public final GiftRankingNearbyRankedUser copy(String str, String str2, int i10, int i11, String str3, String str4, String str5) {
        p.h(str, "userId");
        p.h(str2, "name");
        return new GiftRankingNearbyRankedUser(str, str2, i10, i11, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingNearbyRankedUser) {
            GiftRankingNearbyRankedUser giftRankingNearbyRankedUser = (GiftRankingNearbyRankedUser) obj;
            return p.c(this.userId, giftRankingNearbyRankedUser.userId) && p.c(this.name, giftRankingNearbyRankedUser.name) && this.rank == giftRankingNearbyRankedUser.rank && this.giftPoint == giftRankingNearbyRankedUser.giftPoint && p.c(this.iconUrl, giftRankingNearbyRankedUser.iconUrl) && p.c(this.labelImageUrl, giftRankingNearbyRankedUser.labelImageUrl) && p.c(this.badgeImageUrl, giftRankingNearbyRankedUser.badgeImageUrl);
        }
        return false;
    }

    public final String getBadgeImageUrl() {
        return this.badgeImageUrl;
    }

    public final int getGiftPoint() {
        return this.giftPoint;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLabelImageUrl() {
        return this.labelImageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((((this.userId.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.giftPoint)) * 31;
        String str = this.iconUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.labelImageUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.badgeImageUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "GiftRankingNearbyRankedUser(userId=" + this.userId + ", name=" + this.name + ", rank=" + this.rank + ", giftPoint=" + this.giftPoint + ", iconUrl=" + this.iconUrl + ", labelImageUrl=" + this.labelImageUrl + ", badgeImageUrl=" + this.badgeImageUrl + ')';
    }
}
