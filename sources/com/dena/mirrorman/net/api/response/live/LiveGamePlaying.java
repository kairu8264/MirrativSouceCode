package com.dena.mirrorman.net.api.response.live;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGamePlaying {
    public static final int $stable = 8;
    private final List<ViewerLiveGameGift> gifts;
    private final String liveGameId;
    private final String viewerSelfStartIconUrl;

    public LiveGamePlaying(String str, List<ViewerLiveGameGift> list, String str2) {
        p.h(str, "liveGameId");
        p.h(list, "gifts");
        p.h(str2, "viewerSelfStartIconUrl");
        this.liveGameId = str;
        this.gifts = list;
        this.viewerSelfStartIconUrl = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveGamePlaying copy$default(LiveGamePlaying liveGamePlaying, String str, List list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveGamePlaying.liveGameId;
        }
        if ((i10 & 2) != 0) {
            list = liveGamePlaying.gifts;
        }
        if ((i10 & 4) != 0) {
            str2 = liveGamePlaying.viewerSelfStartIconUrl;
        }
        return liveGamePlaying.copy(str, list, str2);
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

    public final LiveGamePlaying copy(String str, List<ViewerLiveGameGift> list, String str2) {
        p.h(str, "liveGameId");
        p.h(list, "gifts");
        p.h(str2, "viewerSelfStartIconUrl");
        return new LiveGamePlaying(str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGamePlaying) {
            LiveGamePlaying liveGamePlaying = (LiveGamePlaying) obj;
            return p.c(this.liveGameId, liveGamePlaying.liveGameId) && p.c(this.gifts, liveGamePlaying.gifts) && p.c(this.viewerSelfStartIconUrl, liveGamePlaying.viewerSelfStartIconUrl);
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
        return "LiveGamePlaying(liveGameId=" + this.liveGameId + ", gifts=" + this.gifts + ", viewerSelfStartIconUrl=" + this.viewerSelfStartIconUrl + ')';
    }
}
