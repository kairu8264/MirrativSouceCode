package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;
import xn.r;

/* loaded from: classes2.dex */
public final class CatalogTargetDetail {
    public static final int $stable = 0;
    private final String catalogSelectedApp;
    private final int itemIndex;
    private final String liveId;
    private final int liveIndex;
    private final String reason;
    private final String recommendText;
    private final String ribbonId;

    public CatalogTargetDetail(String str, int i10, int i11, String str2, String str3, String str4, String str5) {
        p.h(str, "liveId");
        p.h(str2, "recommendText");
        p.h(str3, "catalogSelectedApp");
        this.liveId = str;
        this.itemIndex = i10;
        this.liveIndex = i11;
        this.recommendText = str2;
        this.catalogSelectedApp = str3;
        this.reason = str4;
        this.ribbonId = str5;
    }

    public static /* synthetic */ CatalogTargetDetail copy$default(CatalogTargetDetail catalogTargetDetail, String str, int i10, int i11, String str2, String str3, String str4, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = catalogTargetDetail.liveId;
        }
        if ((i12 & 2) != 0) {
            i10 = catalogTargetDetail.itemIndex;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = catalogTargetDetail.liveIndex;
        }
        int i14 = i11;
        if ((i12 & 8) != 0) {
            str2 = catalogTargetDetail.recommendText;
        }
        String str6 = str2;
        if ((i12 & 16) != 0) {
            str3 = catalogTargetDetail.catalogSelectedApp;
        }
        String str7 = str3;
        if ((i12 & 32) != 0) {
            str4 = catalogTargetDetail.reason;
        }
        String str8 = str4;
        if ((i12 & 64) != 0) {
            str5 = catalogTargetDetail.ribbonId;
        }
        return catalogTargetDetail.copy(str, i13, i14, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.liveId;
    }

    public final int component2() {
        return this.itemIndex;
    }

    public final int component3() {
        return this.liveIndex;
    }

    public final String component4() {
        return this.recommendText;
    }

    public final String component5() {
        return this.catalogSelectedApp;
    }

    public final String component6() {
        return this.reason;
    }

    public final String component7() {
        return this.ribbonId;
    }

    public final CatalogTargetDetail copy(String str, int i10, int i11, String str2, String str3, String str4, String str5) {
        p.h(str, "liveId");
        p.h(str2, "recommendText");
        p.h(str3, "catalogSelectedApp");
        return new CatalogTargetDetail(str, i10, i11, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CatalogTargetDetail) {
            CatalogTargetDetail catalogTargetDetail = (CatalogTargetDetail) obj;
            return p.c(this.liveId, catalogTargetDetail.liveId) && this.itemIndex == catalogTargetDetail.itemIndex && this.liveIndex == catalogTargetDetail.liveIndex && p.c(this.recommendText, catalogTargetDetail.recommendText) && p.c(this.catalogSelectedApp, catalogTargetDetail.catalogSelectedApp) && p.c(this.reason, catalogTargetDetail.reason) && p.c(this.ribbonId, catalogTargetDetail.ribbonId);
        }
        return false;
    }

    public final String getCatalogSelectedApp() {
        return this.catalogSelectedApp;
    }

    public final int getItemIndex() {
        return this.itemIndex;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final int getLiveIndex() {
        return this.liveIndex;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRecommendText() {
        return this.recommendText;
    }

    public final String getRibbonId() {
        return this.ribbonId;
    }

    public int hashCode() {
        int hashCode = ((((((((this.liveId.hashCode() * 31) + Integer.hashCode(this.itemIndex)) * 31) + Integer.hashCode(this.liveIndex)) * 31) + this.recommendText.hashCode()) * 31) + this.catalogSelectedApp.hashCode()) * 31;
        String str = this.reason;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ribbonId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toArrayJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(r.d(this));
        p.g(s10, "GsonBuilder()\n        .s…    .toJson(listOf(this))");
        return s10;
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…e()\n        .toJson(this)");
        return s10;
    }

    public String toString() {
        return "CatalogTargetDetail(liveId=" + this.liveId + ", itemIndex=" + this.itemIndex + ", liveIndex=" + this.liveIndex + ", recommendText=" + this.recommendText + ", catalogSelectedApp=" + this.catalogSelectedApp + ", reason=" + this.reason + ", ribbonId=" + this.ribbonId + ')';
    }
}
