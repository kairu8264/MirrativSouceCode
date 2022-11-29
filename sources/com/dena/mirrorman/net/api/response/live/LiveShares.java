package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.ShareTwitter;
import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveShares implements Serializable {
    public static final int $stable = 8;
    private String description;
    private LiveShareOthers others;
    private String title;
    private ShareTwitter twitter;

    public LiveShares() {
        this(null, null, null, null, 15, null);
    }

    public LiveShares(String str, String str2, LiveShareOthers liveShareOthers, ShareTwitter shareTwitter) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(liveShareOthers, "others");
        this.title = str;
        this.description = str2;
        this.others = liveShareOthers;
        this.twitter = shareTwitter;
    }

    public static /* synthetic */ LiveShares copy$default(LiveShares liveShares, String str, String str2, LiveShareOthers liveShareOthers, ShareTwitter shareTwitter, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveShares.title;
        }
        if ((i10 & 2) != 0) {
            str2 = liveShares.description;
        }
        if ((i10 & 4) != 0) {
            liveShareOthers = liveShares.others;
        }
        if ((i10 & 8) != 0) {
            shareTwitter = liveShares.twitter;
        }
        return liveShares.copy(str, str2, liveShareOthers, shareTwitter);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final LiveShareOthers component3() {
        return this.others;
    }

    public final ShareTwitter component4() {
        return this.twitter;
    }

    public final LiveShares copy(String str, String str2, LiveShareOthers liveShareOthers, ShareTwitter shareTwitter) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(liveShareOthers, "others");
        return new LiveShares(str, str2, liveShareOthers, shareTwitter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveShares) {
            LiveShares liveShares = (LiveShares) obj;
            return p.c(this.title, liveShares.title) && p.c(this.description, liveShares.description) && p.c(this.others, liveShares.others) && p.c(this.twitter, liveShares.twitter);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final LiveShareOthers getOthers() {
        return this.others;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ShareTwitter getTwitter() {
        return this.twitter;
    }

    public int hashCode() {
        int hashCode = ((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.others.hashCode()) * 31;
        ShareTwitter shareTwitter = this.twitter;
        return hashCode + (shareTwitter == null ? 0 : shareTwitter.hashCode());
    }

    public final void setDescription(String str) {
        p.h(str, "<set-?>");
        this.description = str;
    }

    public final void setOthers(LiveShareOthers liveShareOthers) {
        p.h(liveShareOthers, "<set-?>");
        this.others = liveShareOthers;
    }

    public final void setTitle(String str) {
        p.h(str, "<set-?>");
        this.title = str;
    }

    public final void setTwitter(ShareTwitter shareTwitter) {
        this.twitter = shareTwitter;
    }

    public String toString() {
        return "LiveShares(title=" + this.title + ", description=" + this.description + ", others=" + this.others + ", twitter=" + this.twitter + ')';
    }

    public /* synthetic */ LiveShares(String str, String str2, LiveShareOthers liveShareOthers, ShareTwitter shareTwitter, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? new LiveShareOthers(null, 1, null) : liveShareOthers, (i10 & 8) != 0 ? null : shareTwitter);
    }
}
