package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrorman.net.api.response.App;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveAnnouncement implements Serializable {
    public static final int $stable = 8;
    private final App.AppParams app;
    private final String body;
    private final int startAt;

    public LiveAnnouncement(String str, int i10, App.AppParams appParams) {
        p.h(str, TtmlNode.TAG_BODY);
        this.body = str;
        this.startAt = i10;
        this.app = appParams;
    }

    public static /* synthetic */ LiveAnnouncement copy$default(LiveAnnouncement liveAnnouncement, String str, int i10, App.AppParams appParams, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = liveAnnouncement.body;
        }
        if ((i11 & 2) != 0) {
            i10 = liveAnnouncement.startAt;
        }
        if ((i11 & 4) != 0) {
            appParams = liveAnnouncement.app;
        }
        return liveAnnouncement.copy(str, i10, appParams);
    }

    public final String component1() {
        return this.body;
    }

    public final int component2() {
        return this.startAt;
    }

    public final App.AppParams component3() {
        return this.app;
    }

    public final LiveAnnouncement copy(String str, int i10, App.AppParams appParams) {
        p.h(str, TtmlNode.TAG_BODY);
        return new LiveAnnouncement(str, i10, appParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveAnnouncement) {
            LiveAnnouncement liveAnnouncement = (LiveAnnouncement) obj;
            return p.c(this.body, liveAnnouncement.body) && this.startAt == liveAnnouncement.startAt && p.c(this.app, liveAnnouncement.app);
        }
        return false;
    }

    public final App.AppParams getApp() {
        return this.app;
    }

    public final String getBody() {
        return this.body;
    }

    public final int getStartAt() {
        return this.startAt;
    }

    public int hashCode() {
        int hashCode = ((this.body.hashCode() * 31) + Integer.hashCode(this.startAt)) * 31;
        App.AppParams appParams = this.app;
        return hashCode + (appParams == null ? 0 : appParams.hashCode());
    }

    public String toString() {
        return "LiveAnnouncement(body=" + this.body + ", startAt=" + this.startAt + ", app=" + this.app + ')';
    }
}
