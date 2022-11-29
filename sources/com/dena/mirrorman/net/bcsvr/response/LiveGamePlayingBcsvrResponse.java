package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrorman.net.api.response.live.ViewerLiveGameGift;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGamePlayingBcsvrResponse {
    public static final int $stable = 8;
    private final List<ViewerLiveGameGift> gifts;
    private final String liveGameId;
    private final String viewerSelfStartIconUrl;

    public LiveGamePlayingBcsvrResponse(String str, List<ViewerLiveGameGift> list, String str2) {
        p.h(str, "liveGameId");
        p.h(list, "gifts");
        p.h(str2, "viewerSelfStartIconUrl");
        this.liveGameId = str;
        this.gifts = list;
        this.viewerSelfStartIconUrl = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveGamePlayingBcsvrResponse copy$default(LiveGamePlayingBcsvrResponse liveGamePlayingBcsvrResponse, String str, List list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveGamePlayingBcsvrResponse.liveGameId;
        }
        if ((i10 & 2) != 0) {
            list = liveGamePlayingBcsvrResponse.gifts;
        }
        if ((i10 & 4) != 0) {
            str2 = liveGamePlayingBcsvrResponse.viewerSelfStartIconUrl;
        }
        return liveGamePlayingBcsvrResponse.copy(str, list, str2);
    }

    public final String component1() {
        return this.liveGameId;
    }

    public final List<ViewerLiveGameGift> component2() {
        return this.gifts;
    }

    public final String component3() {
        return this.viewerSelfStartIconUrl;
    }

    public final LiveGamePlayingBcsvrResponse copy(String str, List<ViewerLiveGameGift> list, String str2) {
        p.h(str, "liveGameId");
        p.h(list, "gifts");
        p.h(str2, "viewerSelfStartIconUrl");
        return new LiveGamePlayingBcsvrResponse(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGamePlayingBcsvrResponse) {
            LiveGamePlayingBcsvrResponse liveGamePlayingBcsvrResponse = (LiveGamePlayingBcsvrResponse) obj;
            return p.c(this.liveGameId, liveGamePlayingBcsvrResponse.liveGameId) && p.c(this.gifts, liveGamePlayingBcsvrResponse.gifts) && p.c(this.viewerSelfStartIconUrl, liveGamePlayingBcsvrResponse.viewerSelfStartIconUrl);
        }
        return false;
    }

    public final List<ViewerLiveGameGift> getGifts() {
        return this.gifts;
    }

    public final String getLiveGameId() {
        return this.liveGameId;
    }

    public final String getViewerSelfStartIconUrl() {
        return this.viewerSelfStartIconUrl;
    }

    public int hashCode() {
        return (((this.liveGameId.hashCode() * 31) + this.gifts.hashCode()) * 31) + this.viewerSelfStartIconUrl.hashCode();
    }

    public String toString() {
        return "LiveGamePlayingBcsvrResponse(liveGameId=" + this.liveGameId + ", gifts=" + this.gifts + ", viewerSelfStartIconUrl=" + this.viewerSelfStartIconUrl + ')';
    }
}
