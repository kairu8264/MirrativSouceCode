package com.dena.mirrativ.mirrativapi.livegame;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveGameGift {
    private final String description;
    private final String iconUrl;
    private final String title;

    public LiveGameGift(String str, String str2, String str3) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "iconUrl");
        this.title = str;
        this.description = str2;
        this.iconUrl = str3;
    }

    public static /* synthetic */ LiveGameGift copy$default(LiveGameGift liveGameGift, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveGameGift.title;
        }
        if ((i10 & 2) != 0) {
            str2 = liveGameGift.description;
        }
        if ((i10 & 4) != 0) {
            str3 = liveGameGift.iconUrl;
        }
        return liveGameGift.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final LiveGameGift copy(String str, String str2, String str3) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "iconUrl");
        return new LiveGameGift(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameGift) {
            LiveGameGift liveGameGift = (LiveGameGift) obj;
            return p.c(this.title, liveGameGift.title) && p.c(this.description, liveGameGift.description) && p.c(this.iconUrl, liveGameGift.iconUrl);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.iconUrl.hashCode();
    }

    public String toString() {
        return "LiveGameGift(title=" + this.title + ", description=" + this.description + ", iconUrl=" + this.iconUrl + ')';
    }
}
