package com.dena.mirrorman.net.bcsvr.response;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.io.Serializable;
import java.util.List;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class GiftRankingBcsvrResponse implements Serializable {
    public static final int $stable = 8;
    @c("ari")
    private final List<String> achievedRewardsIcon;
    @c("biiu")
    private final String bannerIconImageUrl;
    @c("bilu")
    private final String bannerIconLinkUrl;
    @c("car")
    private final int casterAfterRank;
    @c("cbr")
    private final int casterBeforeRank;
    @c("cg")
    private final String casterGrade;
    @c("eiu")
    private final String eventIconUrl;
    @c("ei")
    private final int eventId;
    @c("et")
    private final String eventTitle;
    @c("iae")
    private final boolean isAppEvent;
    @c("ibu")
    private final boolean isBannedUser;
    private final boolean isFocus;
    @c("nt")
    private final long nanoTime;
    @c("nrc")
    private final List<GiftRankingNearbyRankedUser> nearRankCasters;
    @c("nrs")
    private final List<GiftRankingNearbyRankedUser> nearRankSenders;
    @c(TopicConstant.EXTEND_AAC_RAW)
    private final int rank;
    @c("rt")
    private final String rankText;
    @c("re")
    private final boolean rankUpAnimationEnabled;
    @c("rp")
    private final int rankingPoint;
    @c("rap")
    private final int rewardAchievedPoint;
    @c("riu")
    private final String rewardIconUrl;
    @c("rnp")
    private final int rewardNeedPoint;
    @c("sar")
    private final int senderAfterRank;
    @c("sbr")
    private final int senderBeforeRank;
    @c("sg")
    private final String senderGrade;
    @c("tp")
    private final int totalPoint;

    public GiftRankingBcsvrResponse(boolean z10, int i10, long j10, String str, String str2, boolean z11, int i11, int i12, String str3, boolean z12, String str4, String str5, int i13, int i14, List<GiftRankingNearbyRankedUser> list, int i15, int i16, List<GiftRankingNearbyRankedUser> list2, int i17, String str6, String str7, List<String> list3, String str8, int i18, int i19, boolean z13) {
        p.h(str, "eventIconUrl");
        p.h(str2, "eventTitle");
        p.h(str3, "rankText");
        p.h(str4, "bannerIconImageUrl");
        p.h(str5, "bannerIconLinkUrl");
        p.h(list, "nearRankCasters");
        p.h(list2, "nearRankSenders");
        p.h(str6, "casterGrade");
        p.h(str7, "senderGrade");
        p.h(list3, "achievedRewardsIcon");
        p.h(str8, "rewardIconUrl");
        this.isAppEvent = z10;
        this.eventId = i10;
        this.nanoTime = j10;
        this.eventIconUrl = str;
        this.eventTitle = str2;
        this.isBannedUser = z11;
        this.rankingPoint = i11;
        this.rank = i12;
        this.rankText = str3;
        this.rankUpAnimationEnabled = z12;
        this.bannerIconImageUrl = str4;
        this.bannerIconLinkUrl = str5;
        this.casterBeforeRank = i13;
        this.casterAfterRank = i14;
        this.nearRankCasters = list;
        this.senderBeforeRank = i15;
        this.senderAfterRank = i16;
        this.nearRankSenders = list2;
        this.totalPoint = i17;
        this.casterGrade = str6;
        this.senderGrade = str7;
        this.achievedRewardsIcon = list3;
        this.rewardIconUrl = str8;
        this.rewardAchievedPoint = i18;
        this.rewardNeedPoint = i19;
        this.isFocus = z13;
    }

    public final boolean component1() {
        return this.isAppEvent;
    }

    public final boolean component10() {
        return this.rankUpAnimationEnabled;
    }

    public final String component11() {
        return this.bannerIconImageUrl;
    }

    public final String component12() {
        return this.bannerIconLinkUrl;
    }

    public final int component13() {
        return this.casterBeforeRank;
    }

    public final int component14() {
        return this.casterAfterRank;
    }

    public final List<GiftRankingNearbyRankedUser> component15() {
        return this.nearRankCasters;
    }

    public final int component16() {
        return this.senderBeforeRank;
    }

    public final int component17() {
        return this.senderAfterRank;
    }

    public final List<GiftRankingNearbyRankedUser> component18() {
        return this.nearRankSenders;
    }

    public final int component19() {
        return this.totalPoint;
    }

    public final int component2() {
        return this.eventId;
    }

    public final String component20() {
        return this.casterGrade;
    }

    public final String component21() {
        return this.senderGrade;
    }

    public final List<String> component22() {
        return this.achievedRewardsIcon;
    }

    public final String component23() {
        return this.rewardIconUrl;
    }

    public final int component24() {
        return this.rewardAchievedPoint;
    }

    public final int component25() {
        return this.rewardNeedPoint;
    }

    public final boolean component26() {
        return this.isFocus;
    }

    public final long component3() {
        return this.nanoTime;
    }

    public final String component4() {
        return this.eventIconUrl;
    }

    public final String component5() {
        return this.eventTitle;
    }

    public final boolean component6() {
        return this.isBannedUser;
    }

    public final int component7() {
        return this.rankingPoint;
    }

    public final int component8() {
        return this.rank;
    }

    public final String component9() {
        return this.rankText;
    }

    public final GiftRankingBcsvrResponse copy(boolean z10, int i10, long j10, String str, String str2, boolean z11, int i11, int i12, String str3, boolean z12, String str4, String str5, int i13, int i14, List<GiftRankingNearbyRankedUser> list, int i15, int i16, List<GiftRankingNearbyRankedUser> list2, int i17, String str6, String str7, List<String> list3, String str8, int i18, int i19, boolean z13) {
        p.h(str, "eventIconUrl");
        p.h(str2, "eventTitle");
        p.h(str3, "rankText");
        p.h(str4, "bannerIconImageUrl");
        p.h(str5, "bannerIconLinkUrl");
        p.h(list, "nearRankCasters");
        p.h(list2, "nearRankSenders");
        p.h(str6, "casterGrade");
        p.h(str7, "senderGrade");
        p.h(list3, "achievedRewardsIcon");
        p.h(str8, "rewardIconUrl");
        return new GiftRankingBcsvrResponse(z10, i10, j10, str, str2, z11, i11, i12, str3, z12, str4, str5, i13, i14, list, i15, i16, list2, i17, str6, str7, list3, str8, i18, i19, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingBcsvrResponse) {
            GiftRankingBcsvrResponse giftRankingBcsvrResponse = (GiftRankingBcsvrResponse) obj;
            return this.isAppEvent == giftRankingBcsvrResponse.isAppEvent && this.eventId == giftRankingBcsvrResponse.eventId && this.nanoTime == giftRankingBcsvrResponse.nanoTime && p.c(this.eventIconUrl, giftRankingBcsvrResponse.eventIconUrl) && p.c(this.eventTitle, giftRankingBcsvrResponse.eventTitle) && this.isBannedUser == giftRankingBcsvrResponse.isBannedUser && this.rankingPoint == giftRankingBcsvrResponse.rankingPoint && this.rank == giftRankingBcsvrResponse.rank && p.c(this.rankText, giftRankingBcsvrResponse.rankText) && this.rankUpAnimationEnabled == giftRankingBcsvrResponse.rankUpAnimationEnabled && p.c(this.bannerIconImageUrl, giftRankingBcsvrResponse.bannerIconImageUrl) && p.c(this.bannerIconLinkUrl, giftRankingBcsvrResponse.bannerIconLinkUrl) && this.casterBeforeRank == giftRankingBcsvrResponse.casterBeforeRank && this.casterAfterRank == giftRankingBcsvrResponse.casterAfterRank && p.c(this.nearRankCasters, giftRankingBcsvrResponse.nearRankCasters) && this.senderBeforeRank == giftRankingBcsvrResponse.senderBeforeRank && this.senderAfterRank == giftRankingBcsvrResponse.senderAfterRank && p.c(this.nearRankSenders, giftRankingBcsvrResponse.nearRankSenders) && this.totalPoint == giftRankingBcsvrResponse.totalPoint && p.c(this.casterGrade, giftRankingBcsvrResponse.casterGrade) && p.c(this.senderGrade, giftRankingBcsvrResponse.senderGrade) && p.c(this.achievedRewardsIcon, giftRankingBcsvrResponse.achievedRewardsIcon) && p.c(this.rewardIconUrl, giftRankingBcsvrResponse.rewardIconUrl) && this.rewardAchievedPoint == giftRankingBcsvrResponse.rewardAchievedPoint && this.rewardNeedPoint == giftRankingBcsvrResponse.rewardNeedPoint && this.isFocus == giftRankingBcsvrResponse.isFocus;
        }
        return false;
    }

    public final List<String> getAchievedRewardsIcon() {
        return this.achievedRewardsIcon;
    }

    public final String getBannerIconImageUrl() {
        return this.bannerIconImageUrl;
    }

    public final String getBannerIconLinkUrl() {
        return this.bannerIconLinkUrl;
    }

    public final int getCasterAfterRank() {
        return this.casterAfterRank;
    }

    public final int getCasterBeforeRank() {
        return this.casterBeforeRank;
    }

    public final String getCasterGrade() {
        return this.casterGrade;
    }

    public final String getEventIconUrl() {
        return this.eventIconUrl;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final String getEventTitle() {
        return this.eventTitle;
    }

    public final long getNanoTime() {
        return this.nanoTime;
    }

    public final List<GiftRankingNearbyRankedUser> getNearRankCasters() {
        return this.nearRankCasters;
    }

    public final List<GiftRankingNearbyRankedUser> getNearRankSenders() {
        return this.nearRankSenders;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getRankText() {
        return this.rankText;
    }

    public final boolean getRankUpAnimationEnabled() {
        return this.rankUpAnimationEnabled;
    }

    public final int getRankingPoint() {
        return this.rankingPoint;
    }

    public final int getRewardAchievedPoint() {
        return this.rewardAchievedPoint;
    }

    public final String getRewardIconUrl() {
        return this.rewardIconUrl;
    }

    public final int getRewardNeedPoint() {
        return this.rewardNeedPoint;
    }

    public final int getSenderAfterRank() {
        return this.senderAfterRank;
    }

    public final int getSenderBeforeRank() {
        return this.senderBeforeRank;
    }

    public final String getSenderGrade() {
        return this.senderGrade;
    }

    public final int getTotalPoint() {
        return this.totalPoint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.isAppEvent;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int hashCode = ((((((((r02 * 31) + Integer.hashCode(this.eventId)) * 31) + Long.hashCode(this.nanoTime)) * 31) + this.eventIconUrl.hashCode()) * 31) + this.eventTitle.hashCode()) * 31;
        ?? r22 = this.isBannedUser;
        int i10 = r22;
        if (r22 != 0) {
            i10 = 1;
        }
        int hashCode2 = (((((((hashCode + i10) * 31) + Integer.hashCode(this.rankingPoint)) * 31) + Integer.hashCode(this.rank)) * 31) + this.rankText.hashCode()) * 31;
        ?? r23 = this.rankUpAnimationEnabled;
        int i11 = r23;
        if (r23 != 0) {
            i11 = 1;
        }
        int hashCode3 = (((((((((((((((((((((((((((((((hashCode2 + i11) * 31) + this.bannerIconImageUrl.hashCode()) * 31) + this.bannerIconLinkUrl.hashCode()) * 31) + Integer.hashCode(this.casterBeforeRank)) * 31) + Integer.hashCode(this.casterAfterRank)) * 31) + this.nearRankCasters.hashCode()) * 31) + Integer.hashCode(this.senderBeforeRank)) * 31) + Integer.hashCode(this.senderAfterRank)) * 31) + this.nearRankSenders.hashCode()) * 31) + Integer.hashCode(this.totalPoint)) * 31) + this.casterGrade.hashCode()) * 31) + this.senderGrade.hashCode()) * 31) + this.achievedRewardsIcon.hashCode()) * 31) + this.rewardIconUrl.hashCode()) * 31) + Integer.hashCode(this.rewardAchievedPoint)) * 31) + Integer.hashCode(this.rewardNeedPoint)) * 31;
        boolean z11 = this.isFocus;
        return hashCode3 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isAppEvent() {
        return this.isAppEvent;
    }

    public final boolean isAppEventRankUp() {
        return this.isAppEvent && isStreamerRankUp();
    }

    public final boolean isBannedUser() {
        return this.isBannedUser;
    }

    public final boolean isFocus() {
        return this.isFocus;
    }

    public final boolean isSenderRankUp() {
        return this.rankUpAnimationEnabled && this.senderBeforeRank > this.senderAfterRank;
    }

    public final boolean isStreamerRankUp() {
        return this.casterBeforeRank > this.casterAfterRank;
    }

    public String toString() {
        return "GiftRankingBcsvrResponse(isAppEvent=" + this.isAppEvent + ", eventId=" + this.eventId + ", nanoTime=" + this.nanoTime + ", eventIconUrl=" + this.eventIconUrl + ", eventTitle=" + this.eventTitle + ", isBannedUser=" + this.isBannedUser + ", rankingPoint=" + this.rankingPoint + ", rank=" + this.rank + ", rankText=" + this.rankText + ", rankUpAnimationEnabled=" + this.rankUpAnimationEnabled + ", bannerIconImageUrl=" + this.bannerIconImageUrl + ", bannerIconLinkUrl=" + this.bannerIconLinkUrl + ", casterBeforeRank=" + this.casterBeforeRank + ", casterAfterRank=" + this.casterAfterRank + ", nearRankCasters=" + this.nearRankCasters + ", senderBeforeRank=" + this.senderBeforeRank + ", senderAfterRank=" + this.senderAfterRank + ", nearRankSenders=" + this.nearRankSenders + ", totalPoint=" + this.totalPoint + ", casterGrade=" + this.casterGrade + ", senderGrade=" + this.senderGrade + ", achievedRewardsIcon=" + this.achievedRewardsIcon + ", rewardIconUrl=" + this.rewardIconUrl + ", rewardAchievedPoint=" + this.rewardAchievedPoint + ", rewardNeedPoint=" + this.rewardNeedPoint + ", isFocus=" + this.isFocus + ')';
    }
}
