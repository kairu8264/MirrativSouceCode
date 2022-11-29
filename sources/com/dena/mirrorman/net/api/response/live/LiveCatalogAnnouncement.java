package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveCatalogAnnouncement {
    public static final int $stable = 8;
    private final App.AppParams app;
    private final String body;
    private final UserBasicParams broadcaster;
    private final int startAt;
    private final String url;

    public LiveCatalogAnnouncement(UserBasicParams userBasicParams, String str, String str2, int i10, App.AppParams appParams) {
        p.h(userBasicParams, "broadcaster");
        p.h(str, "url");
        p.h(str2, TtmlNode.TAG_BODY);
        this.broadcaster = userBasicParams;
        this.url = str;
        this.body = str2;
        this.startAt = i10;
        this.app = appParams;
    }

    public static /* synthetic */ LiveCatalogAnnouncement copy$default(LiveCatalogAnnouncement liveCatalogAnnouncement, UserBasicParams userBasicParams, String str, String str2, int i10, App.AppParams appParams, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userBasicParams = liveCatalogAnnouncement.broadcaster;
        }
        if ((i11 & 2) != 0) {
            str = liveCatalogAnnouncement.url;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = liveCatalogAnnouncement.body;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            i10 = liveCatalogAnnouncement.startAt;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            appParams = liveCatalogAnnouncement.app;
        }
        return liveCatalogAnnouncement.copy(userBasicParams, str3, str4, i12, appParams);
    }

    public final UserBasicParams component1() {
        return this.broadcaster;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.body;
    }

    public final int component4() {
        return this.startAt;
    }

    public final App.AppParams component5() {
        return this.app;
    }

    public final LiveCatalogAnnouncement copy(UserBasicParams userBasicParams, String str, String str2, int i10, App.AppParams appParams) {
        p.h(userBasicParams, "broadcaster");
        p.h(str, "url");
        p.h(str2, TtmlNode.TAG_BODY);
        return new LiveCatalogAnnouncement(userBasicParams, str, str2, i10, appParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveCatalogAnnouncement) {
            LiveCatalogAnnouncement liveCatalogAnnouncement = (LiveCatalogAnnouncement) obj;
            return p.c(this.broadcaster, liveCatalogAnnouncement.broadcaster) && p.c(this.url, liveCatalogAnnouncement.url) && p.c(this.body, liveCatalogAnnouncement.body) && this.startAt == liveCatalogAnnouncement.startAt && p.c(this.app, liveCatalogAnnouncement.app);
        }
        return false;
    }

    public final App.AppParams getApp() {
        return this.app;
    }

    public final String getBody() {
        return this.body;
    }

    public final UserBasicParams getBroadcaster() {
        return this.broadcaster;
    }

    public final int getStartAt() {
        return this.startAt;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((((((this.broadcaster.hashCode() * 31) + this.url.hashCode()) * 31) + this.body.hashCode()) * 31) + Integer.hashCode(this.startAt)) * 31;
        App.AppParams appParams = this.app;
        return hashCode + (appParams == null ? 0 : appParams.hashCode());
    }

    public String toString() {
        return "LiveCatalogAnnouncement(broadcaster=" + this.broadcaster + ", url=" + this.url + ", body=" + this.body + ", startAt=" + this.startAt + ", app=" + this.app + ')';
    }
}
