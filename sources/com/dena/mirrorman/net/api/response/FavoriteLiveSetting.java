package com.dena.mirrorman.net.api.response;

import jf.w;
import jo.p;

/* loaded from: classes2.dex */
public final class FavoriteLiveSetting {
    public static final int $stable = 0;
    private final String appIconUrl;
    private final String appId;
    private final String appShortTitle;
    private final String appTitle;

    /* renamed from: id  reason: collision with root package name */
    private final int f26147id;
    private final String liveThumbnailImageUrl;
    private final String memo;
    private final String title;

    public FavoriteLiveSetting(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.h(str, "title");
        p.h(str2, "appId");
        p.h(str3, "appIconUrl");
        p.h(str4, "appTitle");
        p.h(str5, "memo");
        p.h(str6, "liveThumbnailImageUrl");
        p.h(str7, "appShortTitle");
        this.f26147id = i10;
        this.title = str;
        this.appId = str2;
        this.appIconUrl = str3;
        this.appTitle = str4;
        this.memo = str5;
        this.liveThumbnailImageUrl = str6;
        this.appShortTitle = str7;
    }

    public final int component1() {
        return this.f26147id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.appId;
    }

    public final String component4() {
        return this.appIconUrl;
    }

    public final String component5() {
        return this.appTitle;
    }

    public final String component6() {
        return this.memo;
    }

    public final String component7() {
        return this.liveThumbnailImageUrl;
    }

    public final String component8() {
        return this.appShortTitle;
    }

    public final FavoriteLiveSetting copy(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.h(str, "title");
        p.h(str2, "appId");
        p.h(str3, "appIconUrl");
        p.h(str4, "appTitle");
        p.h(str5, "memo");
        p.h(str6, "liveThumbnailImageUrl");
        p.h(str7, "appShortTitle");
        return new FavoriteLiveSetting(i10, str, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FavoriteLiveSetting) {
            FavoriteLiveSetting favoriteLiveSetting = (FavoriteLiveSetting) obj;
            return this.f26147id == favoriteLiveSetting.f26147id && p.c(this.title, favoriteLiveSetting.title) && p.c(this.appId, favoriteLiveSetting.appId) && p.c(this.appIconUrl, favoriteLiveSetting.appIconUrl) && p.c(this.appTitle, favoriteLiveSetting.appTitle) && p.c(this.memo, favoriteLiveSetting.memo) && p.c(this.liveThumbnailImageUrl, favoriteLiveSetting.liveThumbnailImageUrl) && p.c(this.appShortTitle, favoriteLiveSetting.appShortTitle);
        }
        return false;
    }

    public final String getAppIconUrl() {
        return this.appIconUrl;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppShortTitle() {
        return this.appShortTitle;
    }

    public final String getAppTitle() {
        return this.appTitle;
    }

    public final int getId() {
        return this.f26147id;
    }

    public final w getLiveAppSetting() {
        return new w(this.appId, this.appIconUrl, this.appTitle, this.appShortTitle);
    }

    public final String getLiveThumbnailImageUrl() {
        return this.liveThumbnailImageUrl;
    }

    public final String getMemo() {
        return this.memo;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f26147id) * 31) + this.title.hashCode()) * 31) + this.appId.hashCode()) * 31) + this.appIconUrl.hashCode()) * 31) + this.appTitle.hashCode()) * 31) + this.memo.hashCode()) * 31) + this.liveThumbnailImageUrl.hashCode()) * 31) + this.appShortTitle.hashCode();
    }

    public final boolean isNotSet() {
        if (this.title.length() == 0) {
            if (this.appId.length() == 0) {
                if (this.memo.length() == 0) {
                    if (this.liveThumbnailImageUrl.length() == 0) {
                        if (this.appShortTitle.length() == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        return "FavoriteLiveSetting(id=" + this.f26147id + ", title=" + this.title + ", appId=" + this.appId + ", appIconUrl=" + this.appIconUrl + ", appTitle=" + this.appTitle + ", memo=" + this.memo + ", liveThumbnailImageUrl=" + this.liveThumbnailImageUrl + ", appShortTitle=" + this.appShortTitle + ')';
    }
}
