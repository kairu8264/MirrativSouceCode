package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrorman.net.api.response.Ad;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class LiveAdAppBanner extends Ad.Actions {
    public static final int $stable = 8;
    private String appId;
    private String description;
    private Integer hideAfter;
    private String iconUrl;
    private String title;

    public LiveAdAppBanner() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ LiveAdAppBanner(String str, String str2, String str3, String str4, Integer num, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : num);
    }

    public static /* synthetic */ LiveAdAppBanner copy$default(LiveAdAppBanner liveAdAppBanner, String str, String str2, String str3, String str4, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveAdAppBanner.appId;
        }
        if ((i10 & 2) != 0) {
            str2 = liveAdAppBanner.iconUrl;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = liveAdAppBanner.title;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = liveAdAppBanner.description;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            num = liveAdAppBanner.hideAfter;
        }
        return liveAdAppBanner.copy(str, str5, str6, str7, num);
    }

    public final String component1() {
        return this.appId;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final Integer component5() {
        return this.hideAfter;
    }

    public final LiveAdAppBanner copy(String str, String str2, String str3, String str4, Integer num) {
        return new LiveAdAppBanner(str, str2, str3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveAdAppBanner) {
            LiveAdAppBanner liveAdAppBanner = (LiveAdAppBanner) obj;
            return p.c(this.appId, liveAdAppBanner.appId) && p.c(this.iconUrl, liveAdAppBanner.iconUrl) && p.c(this.title, liveAdAppBanner.title) && p.c(this.description, liveAdAppBanner.description) && p.c(this.hideAfter, liveAdAppBanner.hideAfter);
        }
        return false;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getHideAfter() {
        return this.hideAfter;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.appId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.hideAfter;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setHideAfter(Integer num) {
        this.hideAfter = num;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "LiveAdAppBanner(appId=" + this.appId + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", description=" + this.description + ", hideAfter=" + this.hideAfter + ')';
    }

    public LiveAdAppBanner(String str, String str2, String str3, String str4, Integer num) {
        this.appId = str;
        this.iconUrl = str2;
        this.title = str3;
        this.description = str4;
        this.hideAfter = num;
    }
}
