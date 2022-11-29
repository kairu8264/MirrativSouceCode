package com.dena.mirrorman.net.api.response.live;

import jo.h;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class CatalogBanner {
    public static final int $stable = 8;
    private String bannerImageUrl;
    @c("text1")
    private String labelText;
    @c("text2")
    private String mainText;
    @c("text3")
    private String termText;
    private String url;

    public CatalogBanner() {
        this(null, null, null, null, null, 31, null);
    }

    public CatalogBanner(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "url");
        p.h(str2, "bannerImageUrl");
        p.h(str3, "labelText");
        p.h(str4, "mainText");
        p.h(str5, "termText");
        this.url = str;
        this.bannerImageUrl = str2;
        this.labelText = str3;
        this.mainText = str4;
        this.termText = str5;
    }

    public static /* synthetic */ CatalogBanner copy$default(CatalogBanner catalogBanner, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = catalogBanner.url;
        }
        if ((i10 & 2) != 0) {
            str2 = catalogBanner.bannerImageUrl;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = catalogBanner.labelText;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = catalogBanner.mainText;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = catalogBanner.termText;
        }
        return catalogBanner.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.bannerImageUrl;
    }

    public final String component3() {
        return this.labelText;
    }

    public final String component4() {
        return this.mainText;
    }

    public final String component5() {
        return this.termText;
    }

    public final CatalogBanner copy(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "url");
        p.h(str2, "bannerImageUrl");
        p.h(str3, "labelText");
        p.h(str4, "mainText");
        p.h(str5, "termText");
        return new CatalogBanner(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatalogBanner) {
            CatalogBanner catalogBanner = (CatalogBanner) obj;
            return p.c(this.url, catalogBanner.url) && p.c(this.bannerImageUrl, catalogBanner.bannerImageUrl) && p.c(this.labelText, catalogBanner.labelText) && p.c(this.mainText, catalogBanner.mainText) && p.c(this.termText, catalogBanner.termText);
        }
        return false;
    }

    public final String getBannerImageUrl() {
        return this.bannerImageUrl;
    }

    public final String getLabelText() {
        return this.labelText;
    }

    public final String getMainText() {
        return this.mainText;
    }

    public final String getTermText() {
        return this.termText;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((this.url.hashCode() * 31) + this.bannerImageUrl.hashCode()) * 31) + this.labelText.hashCode()) * 31) + this.mainText.hashCode()) * 31) + this.termText.hashCode();
    }

    public final void setBannerImageUrl(String str) {
        p.h(str, "<set-?>");
        this.bannerImageUrl = str;
    }

    public final void setLabelText(String str) {
        p.h(str, "<set-?>");
        this.labelText = str;
    }

    public final void setMainText(String str) {
        p.h(str, "<set-?>");
        this.mainText = str;
    }

    public final void setTermText(String str) {
        p.h(str, "<set-?>");
        this.termText = str;
    }

    public final void setUrl(String str) {
        p.h(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        return "CatalogBanner(url=" + this.url + ", bannerImageUrl=" + this.bannerImageUrl + ", labelText=" + this.labelText + ", mainText=" + this.mainText + ", termText=" + this.termText + ')';
    }

    public /* synthetic */ CatalogBanner(String str, String str2, String str3, String str4, String str5, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? "" : str5);
    }
}
