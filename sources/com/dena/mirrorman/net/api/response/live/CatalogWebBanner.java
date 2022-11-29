package com.dena.mirrorman.net.api.response.live;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class CatalogWebBanner {
    public static final int $stable = 8;
    private String adContentUrl;
    private String period;
    private String text;
    private String url;

    public CatalogWebBanner() {
        this(null, null, null, null, 15, null);
    }

    public CatalogWebBanner(String str, String str2, String str3, String str4) {
        p.h(str, "url");
        p.h(str2, "adContentUrl");
        p.h(str3, "text");
        p.h(str4, "period");
        this.url = str;
        this.adContentUrl = str2;
        this.text = str3;
        this.period = str4;
    }

    public static /* synthetic */ CatalogWebBanner copy$default(CatalogWebBanner catalogWebBanner, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = catalogWebBanner.url;
        }
        if ((i10 & 2) != 0) {
            str2 = catalogWebBanner.adContentUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = catalogWebBanner.text;
        }
        if ((i10 & 8) != 0) {
            str4 = catalogWebBanner.period;
        }
        return catalogWebBanner.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.adContentUrl;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.period;
    }

    public final CatalogWebBanner copy(String str, String str2, String str3, String str4) {
        p.h(str, "url");
        p.h(str2, "adContentUrl");
        p.h(str3, "text");
        p.h(str4, "period");
        return new CatalogWebBanner(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatalogWebBanner) {
            CatalogWebBanner catalogWebBanner = (CatalogWebBanner) obj;
            return p.c(this.url, catalogWebBanner.url) && p.c(this.adContentUrl, catalogWebBanner.adContentUrl) && p.c(this.text, catalogWebBanner.text) && p.c(this.period, catalogWebBanner.period);
        }
        return false;
    }

    public final String getAdContentUrl() {
        return this.adContentUrl;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.url.hashCode() * 31) + this.adContentUrl.hashCode()) * 31) + this.text.hashCode()) * 31) + this.period.hashCode();
    }

    public final void setAdContentUrl(String str) {
        p.h(str, "<set-?>");
        this.adContentUrl = str;
    }

    public final void setPeriod(String str) {
        p.h(str, "<set-?>");
        this.period = str;
    }

    public final void setText(String str) {
        p.h(str, "<set-?>");
        this.text = str;
    }

    public final void setUrl(String str) {
        p.h(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        return "CatalogWebBanner(url=" + this.url + ", adContentUrl=" + this.adContentUrl + ", text=" + this.text + ", period=" + this.period + ')';
    }

    public /* synthetic */ CatalogWebBanner(String str, String str2, String str3, String str4, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
