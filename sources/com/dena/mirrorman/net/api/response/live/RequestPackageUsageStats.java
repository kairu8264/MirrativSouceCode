package com.dena.mirrorman.net.api.response.live;

import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class RequestPackageUsageStats implements Serializable {
    public static final int $stable = 0;
    private final String imageUrl;
    private final String title;

    public RequestPackageUsageStats(String str, String str2) {
        p.h(str, "title");
        p.h(str2, "imageUrl");
        this.title = str;
        this.imageUrl = str2;
    }

    public static /* synthetic */ RequestPackageUsageStats copy$default(RequestPackageUsageStats requestPackageUsageStats, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = requestPackageUsageStats.title;
        }
        if ((i10 & 2) != 0) {
            str2 = requestPackageUsageStats.imageUrl;
        }
        return requestPackageUsageStats.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final RequestPackageUsageStats copy(String str, String str2) {
        p.h(str, "title");
        p.h(str2, "imageUrl");
        return new RequestPackageUsageStats(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequestPackageUsageStats) {
            RequestPackageUsageStats requestPackageUsageStats = (RequestPackageUsageStats) obj;
            return p.c(this.title, requestPackageUsageStats.title) && p.c(this.imageUrl, requestPackageUsageStats.imageUrl);
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "RequestPackageUsageStats(title=" + this.title + ", imageUrl=" + this.imageUrl + ')';
    }
}
