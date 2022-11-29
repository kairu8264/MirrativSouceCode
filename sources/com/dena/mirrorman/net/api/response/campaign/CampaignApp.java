package com.dena.mirrorman.net.api.response.campaign;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class CampaignApp {
    public static final int $stable = 8;
    private final String appId;
    private String appUserId;
    private final String appUserIdLabel;
    private final String downloadButtonLabel;
    private final String downloadUrl;
    private final String iconUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean isAppUserIdHidden;
    @b(BooleanTypeAdapter.class)
    private boolean isPublishedUserId;
    @c("other_site_1")
    private final String otherSite1;
    @c("other_site_1_name")
    private final String otherSite1Name;
    @c("other_site_2")
    private final String otherSite2;
    @c("other_site_2_name")
    private final String otherSite2Name;
    private final String siteUrl;
    private final String title;
    private final String twitterUrl;
    @b(BooleanTypeAdapter.class)
    private final boolean useAppUserId;
    private final String youtubeUrl;

    public CampaignApp(String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z12) {
        p.h(str, "appId");
        p.h(str2, "title");
        p.h(str3, "iconUrl");
        p.h(str4, "appUserIdLabel");
        p.h(str5, "twitterUrl");
        p.h(str6, "siteUrl");
        p.h(str7, "downloadUrl");
        p.h(str8, "youtubeUrl");
        p.h(str9, "downloadButtonLabel");
        p.h(str10, "otherSite1");
        p.h(str11, "otherSite1Name");
        p.h(str12, "otherSite2");
        p.h(str13, "otherSite2Name");
        p.h(str14, "appUserId");
        this.appId = str;
        this.title = str2;
        this.iconUrl = str3;
        this.appUserIdLabel = str4;
        this.isAppUserIdHidden = z10;
        this.isPublishedUserId = z11;
        this.twitterUrl = str5;
        this.siteUrl = str6;
        this.downloadUrl = str7;
        this.youtubeUrl = str8;
        this.downloadButtonLabel = str9;
        this.otherSite1 = str10;
        this.otherSite1Name = str11;
        this.otherSite2 = str12;
        this.otherSite2Name = str13;
        this.appUserId = str14;
        this.useAppUserId = z12;
    }

    public final String component1() {
        return this.appId;
    }

    public final String component10() {
        return this.youtubeUrl;
    }

    public final String component11() {
        return this.downloadButtonLabel;
    }

    public final String component12() {
        return this.otherSite1;
    }

    public final String component13() {
        return this.otherSite1Name;
    }

    public final String component14() {
        return this.otherSite2;
    }

    public final String component15() {
        return this.otherSite2Name;
    }

    public final String component16() {
        return this.appUserId;
    }

    public final boolean component17() {
        return this.useAppUserId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final String component4() {
        return this.appUserIdLabel;
    }

    public final boolean component5() {
        return this.isAppUserIdHidden;
    }

    public final boolean component6() {
        return this.isPublishedUserId;
    }

    public final String component7() {
        return this.twitterUrl;
    }

    public final String component8() {
        return this.siteUrl;
    }

    public final String component9() {
        return this.downloadUrl;
    }

    public final CampaignApp copy(String str, String str2, String str3, String str4, boolean z10, boolean z11, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z12) {
        p.h(str, "appId");
        p.h(str2, "title");
        p.h(str3, "iconUrl");
        p.h(str4, "appUserIdLabel");
        p.h(str5, "twitterUrl");
        p.h(str6, "siteUrl");
        p.h(str7, "downloadUrl");
        p.h(str8, "youtubeUrl");
        p.h(str9, "downloadButtonLabel");
        p.h(str10, "otherSite1");
        p.h(str11, "otherSite1Name");
        p.h(str12, "otherSite2");
        p.h(str13, "otherSite2Name");
        p.h(str14, "appUserId");
        return new CampaignApp(str, str2, str3, str4, z10, z11, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignApp) {
            CampaignApp campaignApp = (CampaignApp) obj;
            return p.c(this.appId, campaignApp.appId) && p.c(this.title, campaignApp.title) && p.c(this.iconUrl, campaignApp.iconUrl) && p.c(this.appUserIdLabel, campaignApp.appUserIdLabel) && this.isAppUserIdHidden == campaignApp.isAppUserIdHidden && this.isPublishedUserId == campaignApp.isPublishedUserId && p.c(this.twitterUrl, campaignApp.twitterUrl) && p.c(this.siteUrl, campaignApp.siteUrl) && p.c(this.downloadUrl, campaignApp.downloadUrl) && p.c(this.youtubeUrl, campaignApp.youtubeUrl) && p.c(this.downloadButtonLabel, campaignApp.downloadButtonLabel) && p.c(this.otherSite1, campaignApp.otherSite1) && p.c(this.otherSite1Name, campaignApp.otherSite1Name) && p.c(this.otherSite2, campaignApp.otherSite2) && p.c(this.otherSite2Name, campaignApp.otherSite2Name) && p.c(this.appUserId, campaignApp.appUserId) && this.useAppUserId == campaignApp.useAppUserId;
        }
        return false;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppUserId() {
        return this.appUserId;
    }

    public final String getAppUserIdLabel() {
        return this.appUserIdLabel;
    }

    public final String getDownloadButtonLabel() {
        return this.downloadButtonLabel;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getOtherSite1() {
        return this.otherSite1;
    }

    public final String getOtherSite1Name() {
        return this.otherSite1Name;
    }

    public final String getOtherSite2() {
        return this.otherSite2;
    }

    public final String getOtherSite2Name() {
        return this.otherSite2Name;
    }

    public final String getSiteUrl() {
        return this.siteUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTwitterUrl() {
        return this.twitterUrl;
    }

    public final boolean getUseAppUserId() {
        return this.useAppUserId;
    }

    public final String getYoutubeUrl() {
        return this.youtubeUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.appId.hashCode() * 31) + this.title.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.appUserIdLabel.hashCode()) * 31;
        boolean z10 = this.isAppUserIdHidden;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isPublishedUserId;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int hashCode2 = (((((((((((((((((((((i11 + i12) * 31) + this.twitterUrl.hashCode()) * 31) + this.siteUrl.hashCode()) * 31) + this.downloadUrl.hashCode()) * 31) + this.youtubeUrl.hashCode()) * 31) + this.downloadButtonLabel.hashCode()) * 31) + this.otherSite1.hashCode()) * 31) + this.otherSite1Name.hashCode()) * 31) + this.otherSite2.hashCode()) * 31) + this.otherSite2Name.hashCode()) * 31) + this.appUserId.hashCode()) * 31;
        boolean z12 = this.useAppUserId;
        return hashCode2 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final boolean isAppUserIdHidden() {
        return this.isAppUserIdHidden;
    }

    public final boolean isPublishedUserId() {
        return this.isPublishedUserId;
    }

    public final void setAppUserId(String str) {
        p.h(str, "<set-?>");
        this.appUserId = str;
    }

    public final void setPublishedUserId(boolean z10) {
        this.isPublishedUserId = z10;
    }

    public String toString() {
        return "CampaignApp(appId=" + this.appId + ", title=" + this.title + ", iconUrl=" + this.iconUrl + ", appUserIdLabel=" + this.appUserIdLabel + ", isAppUserIdHidden=" + this.isAppUserIdHidden + ", isPublishedUserId=" + this.isPublishedUserId + ", twitterUrl=" + this.twitterUrl + ", siteUrl=" + this.siteUrl + ", downloadUrl=" + this.downloadUrl + ", youtubeUrl=" + this.youtubeUrl + ", downloadButtonLabel=" + this.downloadButtonLabel + ", otherSite1=" + this.otherSite1 + ", otherSite1Name=" + this.otherSite1Name + ", otherSite2=" + this.otherSite2 + ", otherSite2Name=" + this.otherSite2Name + ", appUserId=" + this.appUserId + ", useAppUserId=" + this.useAppUserId + ')';
    }
}
