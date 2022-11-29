package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.ReceivedDiamonds;
import com.dena.mirrorman.net.api.response.user.UserProfile;
import java.io.Serializable;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class BroadcastResult implements Serializable {
    public static final int $stable = 8;
    private final ChatStatus chatStatus;
    private final int currentLiveContinuousNum;
    @b(BroadcastResultEventTypeAdapter.class)
    private final BroadcastResultEventType eventType;
    private final int giftCoins;
    private final boolean hasReceivableMission;
    private final int isGiftSupported;
    private final int isUpdatedMaxLiveContinuousNum;
    private final int maxOnlineViewerNum;
    private final int postThanksToLiveWatchedUsersEnabled;
    private final ReceivedDiamonds receivedDiamonds;
    private final String shareText;
    private final int shouldRequestReview;
    @b(BooleanTypeAdapter.class)
    private final boolean shouldShowLiveAnnouncement;
    private final Status status;
    private final String title;
    private final int totalViewerNum;
    private final UserProfile user;

    public BroadcastResult(Status status, String str, int i10, int i11, int i12, int i13, int i14, int i15, ReceivedDiamonds receivedDiamonds, UserProfile userProfile, BroadcastResultEventType broadcastResultEventType, int i16, int i17, String str2, boolean z10, boolean z11, ChatStatus chatStatus) {
        p.h(status, "status");
        p.h(str, "title");
        p.h(userProfile, MRLog.TARGET_TYPE_USER);
        p.h(broadcastResultEventType, "eventType");
        p.h(str2, "shareText");
        p.h(chatStatus, "chatStatus");
        this.status = status;
        this.title = str;
        this.totalViewerNum = i10;
        this.maxOnlineViewerNum = i11;
        this.postThanksToLiveWatchedUsersEnabled = i12;
        this.giftCoins = i13;
        this.isGiftSupported = i14;
        this.shouldRequestReview = i15;
        this.receivedDiamonds = receivedDiamonds;
        this.user = userProfile;
        this.eventType = broadcastResultEventType;
        this.currentLiveContinuousNum = i16;
        this.isUpdatedMaxLiveContinuousNum = i17;
        this.shareText = str2;
        this.shouldShowLiveAnnouncement = z10;
        this.hasReceivableMission = z11;
        this.chatStatus = chatStatus;
    }

    public final Status component1() {
        return this.status;
    }

    public final UserProfile component10() {
        return this.user;
    }

    public final BroadcastResultEventType component11() {
        return this.eventType;
    }

    public final int component12() {
        return this.currentLiveContinuousNum;
    }

    public final int component13() {
        return this.isUpdatedMaxLiveContinuousNum;
    }

    public final String component14() {
        return this.shareText;
    }

    public final boolean component15() {
        return this.shouldShowLiveAnnouncement;
    }

    public final boolean component16() {
        return this.hasReceivableMission;
    }

    public final ChatStatus component17() {
        return this.chatStatus;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.totalViewerNum;
    }

    public final int component4() {
        return this.maxOnlineViewerNum;
    }

    public final int component5() {
        return this.postThanksToLiveWatchedUsersEnabled;
    }

    public final int component6() {
        return this.giftCoins;
    }

    public final int component7() {
        return this.isGiftSupported;
    }

    public final int component8() {
        return this.shouldRequestReview;
    }

    public final ReceivedDiamonds component9() {
        return this.receivedDiamonds;
    }

    public final BroadcastResult copy(Status status, String str, int i10, int i11, int i12, int i13, int i14, int i15, ReceivedDiamonds receivedDiamonds, UserProfile userProfile, BroadcastResultEventType broadcastResultEventType, int i16, int i17, String str2, boolean z10, boolean z11, ChatStatus chatStatus) {
        p.h(status, "status");
        p.h(str, "title");
        p.h(userProfile, MRLog.TARGET_TYPE_USER);
        p.h(broadcastResultEventType, "eventType");
        p.h(str2, "shareText");
        p.h(chatStatus, "chatStatus");
        return new BroadcastResult(status, str, i10, i11, i12, i13, i14, i15, receivedDiamonds, userProfile, broadcastResultEventType, i16, i17, str2, z10, z11, chatStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BroadcastResult) {
            BroadcastResult broadcastResult = (BroadcastResult) obj;
            return p.c(this.status, broadcastResult.status) && p.c(this.title, broadcastResult.title) && this.totalViewerNum == broadcastResult.totalViewerNum && this.maxOnlineViewerNum == broadcastResult.maxOnlineViewerNum && this.postThanksToLiveWatchedUsersEnabled == broadcastResult.postThanksToLiveWatchedUsersEnabled && this.giftCoins == broadcastResult.giftCoins && this.isGiftSupported == broadcastResult.isGiftSupported && this.shouldRequestReview == broadcastResult.shouldRequestReview && p.c(this.receivedDiamonds, broadcastResult.receivedDiamonds) && p.c(this.user, broadcastResult.user) && this.eventType == broadcastResult.eventType && this.currentLiveContinuousNum == broadcastResult.currentLiveContinuousNum && this.isUpdatedMaxLiveContinuousNum == broadcastResult.isUpdatedMaxLiveContinuousNum && p.c(this.shareText, broadcastResult.shareText) && this.shouldShowLiveAnnouncement == broadcastResult.shouldShowLiveAnnouncement && this.hasReceivableMission == broadcastResult.hasReceivableMission && p.c(this.chatStatus, broadcastResult.chatStatus);
        }
        return false;
    }

    public final ChatStatus getChatStatus() {
        return this.chatStatus;
    }

    public final int getCurrentLiveContinuousNum() {
        return this.currentLiveContinuousNum;
    }

    public final BroadcastResultEventType getEventType() {
        return this.eventType;
    }

    public final int getGiftCoins() {
        return this.giftCoins;
    }

    public final boolean getHasReceivableMission() {
        return this.hasReceivableMission;
    }

    public final int getMaxOnlineViewerNum() {
        return this.maxOnlineViewerNum;
    }

    public final int getPostThanksToLiveWatchedUsersEnabled() {
        return this.postThanksToLiveWatchedUsersEnabled;
    }

    public final ReceivedDiamonds getReceivedDiamonds() {
        return this.receivedDiamonds;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final int getShouldRequestReview() {
        return this.shouldRequestReview;
    }

    public final boolean getShouldShowLiveAnnouncement() {
        return this.shouldShowLiveAnnouncement;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotalViewerNum() {
        return this.totalViewerNum;
    }

    public final UserProfile getUser() {
        return this.user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((this.status.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.totalViewerNum)) * 31) + Integer.hashCode(this.maxOnlineViewerNum)) * 31) + Integer.hashCode(this.postThanksToLiveWatchedUsersEnabled)) * 31) + Integer.hashCode(this.giftCoins)) * 31) + Integer.hashCode(this.isGiftSupported)) * 31) + Integer.hashCode(this.shouldRequestReview)) * 31;
        ReceivedDiamonds receivedDiamonds = this.receivedDiamonds;
        int hashCode2 = (((((((((((hashCode + (receivedDiamonds == null ? 0 : receivedDiamonds.hashCode())) * 31) + this.user.hashCode()) * 31) + this.eventType.hashCode()) * 31) + Integer.hashCode(this.currentLiveContinuousNum)) * 31) + Integer.hashCode(this.isUpdatedMaxLiveContinuousNum)) * 31) + this.shareText.hashCode()) * 31;
        boolean z10 = this.shouldShowLiveAnnouncement;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z11 = this.hasReceivableMission;
        return ((i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31) + this.chatStatus.hashCode();
    }

    public final int isGiftSupported() {
        return this.isGiftSupported;
    }

    public final int isUpdatedMaxLiveContinuousNum() {
        return this.isUpdatedMaxLiveContinuousNum;
    }

    public String toString() {
        return "BroadcastResult(status=" + this.status + ", title=" + this.title + ", totalViewerNum=" + this.totalViewerNum + ", maxOnlineViewerNum=" + this.maxOnlineViewerNum + ", postThanksToLiveWatchedUsersEnabled=" + this.postThanksToLiveWatchedUsersEnabled + ", giftCoins=" + this.giftCoins + ", isGiftSupported=" + this.isGiftSupported + ", shouldRequestReview=" + this.shouldRequestReview + ", receivedDiamonds=" + this.receivedDiamonds + ", user=" + this.user + ", eventType=" + this.eventType + ", currentLiveContinuousNum=" + this.currentLiveContinuousNum + ", isUpdatedMaxLiveContinuousNum=" + this.isUpdatedMaxLiveContinuousNum + ", shareText=" + this.shareText + ", shouldShowLiveAnnouncement=" + this.shouldShowLiveAnnouncement + ", hasReceivableMission=" + this.hasReceivableMission + ", chatStatus=" + this.chatStatus + ')';
    }
}
