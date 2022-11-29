package com.dena.mirrativ.mirrativapi.emomo.event.giftranking;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import java.io.Serializable;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class GiftRankingEventDetailResponse implements Serializable {
    private final GiftRankingBroadcasterRank broadcaster;
    private final GiftRankingUserDetail broadcasterRankReward;
    private final GiftRankingUserDetail broadcasterReceivedGiftReward;
    private final String gradeHelpUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isBannedBroadcaster;
    @b(BooleanTypeAdapter.class)
    private final boolean isBannedUser;
    private final GiftRankingUserDetail rankReward;
    private final List<GiftRankingUserDetail> rankings;
    private final GiftRankingUserDetail receivedGiftReward;
    private final GiftRankingUserDetail sentGiftReward;
    private final Status status;

    public GiftRankingEventDetailResponse(GiftRankingUserDetail giftRankingUserDetail, GiftRankingUserDetail giftRankingUserDetail2, GiftRankingUserDetail giftRankingUserDetail3, GiftRankingBroadcasterRank giftRankingBroadcasterRank, GiftRankingUserDetail giftRankingUserDetail4, GiftRankingUserDetail giftRankingUserDetail5, List<GiftRankingUserDetail> list, boolean z10, boolean z11, String str, Status status) {
        p.h(giftRankingUserDetail, "rankReward");
        p.h(giftRankingUserDetail2, "sentGiftReward");
        p.h(giftRankingUserDetail3, "receivedGiftReward");
        p.h(str, "gradeHelpUrl");
        p.h(status, "status");
        this.rankReward = giftRankingUserDetail;
        this.sentGiftReward = giftRankingUserDetail2;
        this.receivedGiftReward = giftRankingUserDetail3;
        this.broadcaster = giftRankingBroadcasterRank;
        this.broadcasterRankReward = giftRankingUserDetail4;
        this.broadcasterReceivedGiftReward = giftRankingUserDetail5;
        this.rankings = list;
        this.isBannedUser = z10;
        this.isBannedBroadcaster = z11;
        this.gradeHelpUrl = str;
        this.status = status;
    }

    public final GiftRankingUserDetail component1() {
        return this.rankReward;
    }

    public final String component10() {
        return this.gradeHelpUrl;
    }

    public final Status component11() {
        return this.status;
    }

    public final GiftRankingUserDetail component2() {
        return this.sentGiftReward;
    }

    public final GiftRankingUserDetail component3() {
        return this.receivedGiftReward;
    }

    public final GiftRankingBroadcasterRank component4() {
        return this.broadcaster;
    }

    public final GiftRankingUserDetail component5() {
        return this.broadcasterRankReward;
    }

    public final GiftRankingUserDetail component6() {
        return this.broadcasterReceivedGiftReward;
    }

    public final List<GiftRankingUserDetail> component7() {
        return this.rankings;
    }

    public final boolean component8() {
        return this.isBannedUser;
    }

    public final boolean component9() {
        return this.isBannedBroadcaster;
    }

    public final GiftRankingEventDetailResponse copy(GiftRankingUserDetail giftRankingUserDetail, GiftRankingUserDetail giftRankingUserDetail2, GiftRankingUserDetail giftRankingUserDetail3, GiftRankingBroadcasterRank giftRankingBroadcasterRank, GiftRankingUserDetail giftRankingUserDetail4, GiftRankingUserDetail giftRankingUserDetail5, List<GiftRankingUserDetail> list, boolean z10, boolean z11, String str, Status status) {
        p.h(giftRankingUserDetail, "rankReward");
        p.h(giftRankingUserDetail2, "sentGiftReward");
        p.h(giftRankingUserDetail3, "receivedGiftReward");
        p.h(str, "gradeHelpUrl");
        p.h(status, "status");
        return new GiftRankingEventDetailResponse(giftRankingUserDetail, giftRankingUserDetail2, giftRankingUserDetail3, giftRankingBroadcasterRank, giftRankingUserDetail4, giftRankingUserDetail5, list, z10, z11, str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftRankingEventDetailResponse) {
            GiftRankingEventDetailResponse giftRankingEventDetailResponse = (GiftRankingEventDetailResponse) obj;
            return p.c(this.rankReward, giftRankingEventDetailResponse.rankReward) && p.c(this.sentGiftReward, giftRankingEventDetailResponse.sentGiftReward) && p.c(this.receivedGiftReward, giftRankingEventDetailResponse.receivedGiftReward) && p.c(this.broadcaster, giftRankingEventDetailResponse.broadcaster) && p.c(this.broadcasterRankReward, giftRankingEventDetailResponse.broadcasterRankReward) && p.c(this.broadcasterReceivedGiftReward, giftRankingEventDetailResponse.broadcasterReceivedGiftReward) && p.c(this.rankings, giftRankingEventDetailResponse.rankings) && this.isBannedUser == giftRankingEventDetailResponse.isBannedUser && this.isBannedBroadcaster == giftRankingEventDetailResponse.isBannedBroadcaster && p.c(this.gradeHelpUrl, giftRankingEventDetailResponse.gradeHelpUrl) && p.c(this.status, giftRankingEventDetailResponse.status);
        }
        return false;
    }

    public final GiftRankingBroadcasterRank getBroadcaster() {
        return this.broadcaster;
    }

    public final GiftRankingUserDetail getBroadcasterRankReward() {
        return this.broadcasterRankReward;
    }

    public final GiftRankingUserDetail getBroadcasterReceivedGiftReward() {
        return this.broadcasterReceivedGiftReward;
    }

    public final String getGradeHelpUrl() {
        return this.gradeHelpUrl;
    }

    public final GiftRankingUserDetail getRankReward() {
        return this.rankReward;
    }

    public final List<GiftRankingUserDetail> getRankings() {
        return this.rankings;
    }

    public final GiftRankingUserDetail getReceivedGiftReward() {
        return this.receivedGiftReward;
    }

    public final GiftRankingUserDetail getSentGiftReward() {
        return this.sentGiftReward;
    }

    public final Status getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.rankReward.hashCode() * 31) + this.sentGiftReward.hashCode()) * 31) + this.receivedGiftReward.hashCode()) * 31;
        GiftRankingBroadcasterRank giftRankingBroadcasterRank = this.broadcaster;
        int hashCode2 = (hashCode + (giftRankingBroadcasterRank == null ? 0 : giftRankingBroadcasterRank.hashCode())) * 31;
        GiftRankingUserDetail giftRankingUserDetail = this.broadcasterRankReward;
        int hashCode3 = (hashCode2 + (giftRankingUserDetail == null ? 0 : giftRankingUserDetail.hashCode())) * 31;
        GiftRankingUserDetail giftRankingUserDetail2 = this.broadcasterReceivedGiftReward;
        int hashCode4 = (hashCode3 + (giftRankingUserDetail2 == null ? 0 : giftRankingUserDetail2.hashCode())) * 31;
        List<GiftRankingUserDetail> list = this.rankings;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z10 = this.isBannedUser;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode5 + i10) * 31;
        boolean z11 = this.isBannedBroadcaster;
        return ((((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.gradeHelpUrl.hashCode()) * 31) + this.status.hashCode();
    }

    public final boolean isBannedBroadcaster() {
        return this.isBannedBroadcaster;
    }

    public final boolean isBannedUser() {
        return this.isBannedUser;
    }

    public final boolean isVisibleImmediateBroadcasterRankView() {
        return this.broadcaster != null;
    }

    public String toString() {
        return "GiftRankingEventDetailResponse(rankReward=" + this.rankReward + ", sentGiftReward=" + this.sentGiftReward + ", receivedGiftReward=" + this.receivedGiftReward + ", broadcaster=" + this.broadcaster + ", broadcasterRankReward=" + this.broadcasterRankReward + ", broadcasterReceivedGiftReward=" + this.broadcasterReceivedGiftReward + ", rankings=" + this.rankings + ", isBannedUser=" + this.isBannedUser + ", isBannedBroadcaster=" + this.isBannedBroadcaster + ", gradeHelpUrl=" + this.gradeHelpUrl + ", status=" + this.status + ')';
    }
}
