package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.App;
import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveTimeline implements Serializable {
    public static final int $stable = 8;
    private final App.AppParams app;
    private final String description;
    private final String imageUrl;
    private long timestamp;
    private final String title;

    public LiveTimeline() {
        this(0L, null, null, null, null, 31, null);
    }

    public LiveTimeline(long j10, String str, String str2, String str3, App.AppParams appParams) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "imageUrl");
        this.timestamp = j10;
        this.title = str;
        this.description = str2;
        this.imageUrl = str3;
        this.app = appParams;
    }

    public static /* synthetic */ LiveTimeline copy$default(LiveTimeline liveTimeline, long j10, String str, String str2, String str3, App.AppParams appParams, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = liveTimeline.timestamp;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = liveTimeline.title;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = liveTimeline.description;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = liveTimeline.imageUrl;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            appParams = liveTimeline.app;
        }
        return liveTimeline.copy(j11, str4, str5, str6, appParams);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final App.AppParams component5() {
        return this.app;
    }

    public final LiveTimeline copy(long j10, String str, String str2, String str3, App.AppParams appParams) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "imageUrl");
        return new LiveTimeline(j10, str, str2, str3, appParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveTimeline) {
            LiveTimeline liveTimeline = (LiveTimeline) obj;
            return this.timestamp == liveTimeline.timestamp && p.c(this.title, liveTimeline.title) && p.c(this.description, liveTimeline.description) && p.c(this.imageUrl, liveTimeline.imageUrl) && p.c(this.app, liveTimeline.app);
        }
        return false;
    }

    public final App.AppParams getApp() {
        return this.app;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.timestamp) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
        App.AppParams appParams = this.app;
        return hashCode + (appParams == null ? 0 : appParams.hashCode());
    }

    public final void setTimestamp(long j10) {
        this.timestamp = j10;
    }

    public String toString() {
        return "LiveTimeline(timestamp=" + this.timestamp + ", title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", app=" + this.app + ')';
    }

    public /* synthetic */ LiveTimeline(long j10, String str, String str2, String str3, App.AppParams appParams, int i10, h hVar) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "E" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? null : appParams);
    }
}
