package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class CatalogBannerTargetDetail {
    public static final int $stable = 0;
    private final String appId;
    private final String imageUrl;
    private final String linkUrl;
    private final String position;
    private final String text;

    public CatalogBannerTargetDetail(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "position");
        p.h(str2, "linkUrl");
        p.h(str3, "imageUrl");
        p.h(str4, "text");
        p.h(str5, "appId");
        this.position = str;
        this.linkUrl = str2;
        this.imageUrl = str3;
        this.text = str4;
        this.appId = str5;
    }

    public static /* synthetic */ CatalogBannerTargetDetail copy$default(CatalogBannerTargetDetail catalogBannerTargetDetail, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = catalogBannerTargetDetail.position;
        }
        if ((i10 & 2) != 0) {
            str2 = catalogBannerTargetDetail.linkUrl;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = catalogBannerTargetDetail.imageUrl;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = catalogBannerTargetDetail.text;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = catalogBannerTargetDetail.appId;
        }
        return catalogBannerTargetDetail.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.position;
    }

    public final String component2() {
        return this.linkUrl;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final String component4() {
        return this.text;
    }

    public final String component5() {
        return this.appId;
    }

    public final CatalogBannerTargetDetail copy(String str, String str2, String str3, String str4, String str5) {
        p.h(str, "position");
        p.h(str2, "linkUrl");
        p.h(str3, "imageUrl");
        p.h(str4, "text");
        p.h(str5, "appId");
        return new CatalogBannerTargetDetail(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatalogBannerTargetDetail) {
            CatalogBannerTargetDetail catalogBannerTargetDetail = (CatalogBannerTargetDetail) obj;
            return p.c(this.position, catalogBannerTargetDetail.position) && p.c(this.linkUrl, catalogBannerTargetDetail.linkUrl) && p.c(this.imageUrl, catalogBannerTargetDetail.imageUrl) && p.c(this.text, catalogBannerTargetDetail.text) && p.c(this.appId, catalogBannerTargetDetail.appId);
        }
        return false;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((this.position.hashCode() * 31) + this.linkUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.text.hashCode()) * 31) + this.appId.hashCode();
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…   .create().toJson(this)");
        return s10;
    }

    public String toString() {
        return "CatalogBannerTargetDetail(position=" + this.position + ", linkUrl=" + this.linkUrl + ", imageUrl=" + this.imageUrl + ", text=" + this.text + ", appId=" + this.appId + ')';
    }
}
