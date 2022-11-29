package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveEndResponse {
    public static final int $stable = 8;
    private final String announcementUrl;
    private final Integer giftCoins;
    private LiveEndLiveParam live;
    private final ReceivedDiamonds receivedDiamonds;
    private final Status status;
    private LiveEndUserParam user;

    public LiveEndResponse(Status status, LiveEndUserParam liveEndUserParam, LiveEndLiveParam liveEndLiveParam, String str, Integer num, ReceivedDiamonds receivedDiamonds) {
        p.h(status, "status");
        p.h(str, "announcementUrl");
        p.h(receivedDiamonds, "receivedDiamonds");
        this.status = status;
        this.user = liveEndUserParam;
        this.live = liveEndLiveParam;
        this.announcementUrl = str;
        this.giftCoins = num;
        this.receivedDiamonds = receivedDiamonds;
    }

    public static /* synthetic */ LiveEndResponse copy$default(LiveEndResponse liveEndResponse, Status status, LiveEndUserParam liveEndUserParam, LiveEndLiveParam liveEndLiveParam, String str, Integer num, ReceivedDiamonds receivedDiamonds, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            status = liveEndResponse.status;
        }
        if ((i10 & 2) != 0) {
            liveEndUserParam = liveEndResponse.user;
        }
        LiveEndUserParam liveEndUserParam2 = liveEndUserParam;
        if ((i10 & 4) != 0) {
            liveEndLiveParam = liveEndResponse.live;
        }
        LiveEndLiveParam liveEndLiveParam2 = liveEndLiveParam;
        if ((i10 & 8) != 0) {
            str = liveEndResponse.announcementUrl;
        }
        String str2 = str;
        if ((i10 & 16) != 0) {
            num = liveEndResponse.giftCoins;
        }
        Integer num2 = num;
        if ((i10 & 32) != 0) {
            receivedDiamonds = liveEndResponse.receivedDiamonds;
        }
        return liveEndResponse.copy(status, liveEndUserParam2, liveEndLiveParam2, str2, num2, receivedDiamonds);
    }

    public final Status component1() {
        return this.status;
    }

    public final LiveEndUserParam component2() {
        return this.user;
    }

    public final LiveEndLiveParam component3() {
        return this.live;
    }

    public final String component4() {
        return this.announcementUrl;
    }

    public final Integer component5() {
        return this.giftCoins;
    }

    public final ReceivedDiamonds component6() {
        return this.receivedDiamonds;
    }

    public final LiveEndResponse copy(Status status, LiveEndUserParam liveEndUserParam, LiveEndLiveParam liveEndLiveParam, String str, Integer num, ReceivedDiamonds receivedDiamonds) {
        p.h(status, "status");
        p.h(str, "announcementUrl");
        p.h(receivedDiamonds, "receivedDiamonds");
        return new LiveEndResponse(status, liveEndUserParam, liveEndLiveParam, str, num, receivedDiamonds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveEndResponse) {
            LiveEndResponse liveEndResponse = (LiveEndResponse) obj;
            return p.c(this.status, liveEndResponse.status) && p.c(this.user, liveEndResponse.user) && p.c(this.live, liveEndResponse.live) && p.c(this.announcementUrl, liveEndResponse.announcementUrl) && p.c(this.giftCoins, liveEndResponse.giftCoins) && p.c(this.receivedDiamonds, liveEndResponse.receivedDiamonds);
        }
        return false;
    }

    public final String getAnnouncementUrl() {
        return this.announcementUrl;
    }

    public final Integer getGiftCoins() {
        return this.giftCoins;
    }

    public final LiveEndLiveParam getLive() {
        return this.live;
    }

    public final ReceivedDiamonds getReceivedDiamonds() {
        return this.receivedDiamonds;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final LiveEndUserParam getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        LiveEndUserParam liveEndUserParam = this.user;
        int hashCode2 = (hashCode + (liveEndUserParam == null ? 0 : liveEndUserParam.hashCode())) * 31;
        LiveEndLiveParam liveEndLiveParam = this.live;
        int hashCode3 = (((hashCode2 + (liveEndLiveParam == null ? 0 : liveEndLiveParam.hashCode())) * 31) + this.announcementUrl.hashCode()) * 31;
        Integer num = this.giftCoins;
        return ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.receivedDiamonds.hashCode();
    }

    public final void setLive(LiveEndLiveParam liveEndLiveParam) {
        this.live = liveEndLiveParam;
    }

    public final void setUser(LiveEndUserParam liveEndUserParam) {
        this.user = liveEndUserParam;
    }

    public String toString() {
        return "LiveEndResponse(status=" + this.status + ", user=" + this.user + ", live=" + this.live + ", announcementUrl=" + this.announcementUrl + ", giftCoins=" + this.giftCoins + ", receivedDiamonds=" + this.receivedDiamonds + ')';
    }

    public /* synthetic */ LiveEndResponse(Status status, LiveEndUserParam liveEndUserParam, LiveEndLiveParam liveEndLiveParam, String str, Integer num, ReceivedDiamonds receivedDiamonds, int i10, h hVar) {
        this(status, liveEndUserParam, liveEndLiveParam, (i10 & 8) != 0 ? "" : str, num, receivedDiamonds);
    }
}
