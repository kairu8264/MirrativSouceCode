package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.Ad;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import java.io.Serializable;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class App {
    public static final int $stable = 0;

    /* loaded from: classes2.dex */
    public static final class AdBackground {
        public static final int $stable = 8;
        private List<Integer> gradient;

        public final List<Integer> getGradient() {
            return this.gradient;
        }

        public final void setGradient(List<Integer> list) {
            this.gradient = list;
        }
    }

    /* loaded from: classes2.dex */
    public static final class AdFooterBannerParams extends Ad.Actions {
        public static final int $stable = 8;
        private AdBackground background;
        private String description;
        private String iconUrl;
        private String title;

        public final AdBackground getBackground() {
            return this.background;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getTitle() {
            return this.title;
        }

        public final void setBackground(AdBackground adBackground) {
            this.background = adBackground;
        }

        public final void setDescription(String str) {
            this.description = str;
        }

        public final void setIconUrl(String str) {
            this.iconUrl = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class AdHeaderBannerParams extends Ad.Actions {
        public static final int $stable = 8;
        private AdBackground background;
        private String title;

        public final AdBackground getBackground() {
            return this.background;
        }

        public final String getTitle() {
            return this.title;
        }

        public final void setBackground(AdBackground adBackground) {
            this.background = adBackground;
        }

        public final void setTitle(String str) {
            this.title = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class AdParams implements Serializable {
        public static final int $stable = 8;
        private AdFooterBannerParams footerBanner;
        private AdHeaderBannerParams headerBanner;

        public final AdFooterBannerParams getFooterBanner() {
            return this.footerBanner;
        }

        public final AdHeaderBannerParams getHeaderBanner() {
            return this.headerBanner;
        }

        public final void setFooterBanner(AdFooterBannerParams adFooterBannerParams) {
            this.footerBanner = adFooterBannerParams;
        }

        public final void setHeaderBanner(AdHeaderBannerParams adHeaderBannerParams) {
            this.headerBanner = adHeaderBannerParams;
        }
    }

    /* loaded from: classes2.dex */
    public static final class AppPage {
        public static final int $stable = 8;
        private final String appId;
        private final String iconUrl;
        private final int isMyApp;
        private final List<LiveBasicParams> lives;
        private final int nextPage;
        private final Status status;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public AppPage(String str, String str2, String str3, int i10, List<? extends LiveBasicParams> list, Status status, int i11) {
            p.h(str, "appId");
            p.h(str2, "iconUrl");
            p.h(str3, "title");
            p.h(list, "lives");
            p.h(status, "status");
            this.appId = str;
            this.iconUrl = str2;
            this.title = str3;
            this.isMyApp = i10;
            this.lives = list;
            this.status = status;
            this.nextPage = i11;
        }

        public static /* synthetic */ AppPage copy$default(AppPage appPage, String str, String str2, String str3, int i10, List list, Status status, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = appPage.appId;
            }
            if ((i12 & 2) != 0) {
                str2 = appPage.iconUrl;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                str3 = appPage.title;
            }
            String str5 = str3;
            if ((i12 & 8) != 0) {
                i10 = appPage.isMyApp;
            }
            int i13 = i10;
            List<LiveBasicParams> list2 = list;
            if ((i12 & 16) != 0) {
                list2 = appPage.lives;
            }
            List list3 = list2;
            if ((i12 & 32) != 0) {
                status = appPage.status;
            }
            Status status2 = status;
            if ((i12 & 64) != 0) {
                i11 = appPage.nextPage;
            }
            return appPage.copy(str, str4, str5, i13, list3, status2, i11);
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

        public final int component4() {
            return this.isMyApp;
        }

        public final List<LiveBasicParams> component5() {
            return this.lives;
        }

        public final Status component6() {
            return this.status;
        }

        public final int component7() {
            return this.nextPage;
        }

        public final AppPage copy(String str, String str2, String str3, int i10, List<? extends LiveBasicParams> list, Status status, int i11) {
            p.h(str, "appId");
            p.h(str2, "iconUrl");
            p.h(str3, "title");
            p.h(list, "lives");
            p.h(status, "status");
            return new AppPage(str, str2, str3, i10, list, status, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AppPage) {
                AppPage appPage = (AppPage) obj;
                return p.c(this.appId, appPage.appId) && p.c(this.iconUrl, appPage.iconUrl) && p.c(this.title, appPage.title) && this.isMyApp == appPage.isMyApp && p.c(this.lives, appPage.lives) && p.c(this.status, appPage.status) && this.nextPage == appPage.nextPage;
            }
            return false;
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final List<LiveBasicParams> getLives() {
            return this.lives;
        }

        public final int getNextPage() {
            return this.nextPage;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((((((this.appId.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.isMyApp)) * 31) + this.lives.hashCode()) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.nextPage);
        }

        public final int isMyApp() {
            return this.isMyApp;
        }

        public String toString() {
            return "AppPage(appId=" + this.appId + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", isMyApp=" + this.isMyApp + ", lives=" + this.lives + ", status=" + this.status + ", nextPage=" + this.nextPage + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class AppParams implements Serializable {
        public static final int $stable = 8;

        /* renamed from: ad  reason: collision with root package name */
        private final AdParams f26144ad;
        private final String appId;
        private AppUserDetailResponse appUserDetail;
        private final String appUserIdLabel;
        private final String iconUrl;
        @b(BooleanTypeAdapter.class)
        private final boolean isAppUserIdHidden;
        @b(BooleanTypeAdapter.class)
        private final boolean isCategory;
        @b(BooleanTypeAdapter.class)
        private final boolean isHoldingCampaign;
        @b(BooleanTypeAdapter.class)
        private final boolean isListing;
        private final int isPr;
        private final int pushEnabled;
        private final boolean requestAppUserIdRegistration;
        private final String shortTitle;
        private final Status status;
        private final String title;

        public AppParams(String str, String str2, String str3, int i10, int i11, boolean z10, boolean z11, boolean z12, String str4, boolean z13, boolean z14, AdParams adParams, AppUserDetailResponse appUserDetailResponse, Status status, String str5) {
            p.h(str, "appId");
            p.h(str2, "iconUrl");
            p.h(str3, "title");
            p.h(str4, "appUserIdLabel");
            p.h(status, "status");
            p.h(str5, "shortTitle");
            this.appId = str;
            this.iconUrl = str2;
            this.title = str3;
            this.isPr = i10;
            this.pushEnabled = i11;
            this.isHoldingCampaign = z10;
            this.isListing = z11;
            this.isCategory = z12;
            this.appUserIdLabel = str4;
            this.isAppUserIdHidden = z13;
            this.requestAppUserIdRegistration = z14;
            this.f26144ad = adParams;
            this.appUserDetail = appUserDetailResponse;
            this.status = status;
            this.shortTitle = str5;
        }

        public final String component1() {
            return this.appId;
        }

        public final boolean component10() {
            return this.isAppUserIdHidden;
        }

        public final boolean component11() {
            return this.requestAppUserIdRegistration;
        }

        public final AdParams component12() {
            return this.f26144ad;
        }

        public final AppUserDetailResponse component13() {
            return this.appUserDetail;
        }

        public final Status component14() {
            return this.status;
        }

        public final String component15() {
            return this.shortTitle;
        }

        public final String component2() {
            return this.iconUrl;
        }

        public final String component3() {
            return this.title;
        }

        public final int component4() {
            return this.isPr;
        }

        public final int component5() {
            return this.pushEnabled;
        }

        public final boolean component6() {
            return this.isHoldingCampaign;
        }

        public final boolean component7() {
            return this.isListing;
        }

        public final boolean component8() {
            return this.isCategory;
        }

        public final String component9() {
            return this.appUserIdLabel;
        }

        public final AppParams copy(String str, String str2, String str3, int i10, int i11, boolean z10, boolean z11, boolean z12, String str4, boolean z13, boolean z14, AdParams adParams, AppUserDetailResponse appUserDetailResponse, Status status, String str5) {
            p.h(str, "appId");
            p.h(str2, "iconUrl");
            p.h(str3, "title");
            p.h(str4, "appUserIdLabel");
            p.h(status, "status");
            p.h(str5, "shortTitle");
            return new AppParams(str, str2, str3, i10, i11, z10, z11, z12, str4, z13, z14, adParams, appUserDetailResponse, status, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AppParams) {
                AppParams appParams = (AppParams) obj;
                return p.c(this.appId, appParams.appId) && p.c(this.iconUrl, appParams.iconUrl) && p.c(this.title, appParams.title) && this.isPr == appParams.isPr && this.pushEnabled == appParams.pushEnabled && this.isHoldingCampaign == appParams.isHoldingCampaign && this.isListing == appParams.isListing && this.isCategory == appParams.isCategory && p.c(this.appUserIdLabel, appParams.appUserIdLabel) && this.isAppUserIdHidden == appParams.isAppUserIdHidden && this.requestAppUserIdRegistration == appParams.requestAppUserIdRegistration && p.c(this.f26144ad, appParams.f26144ad) && p.c(this.appUserDetail, appParams.appUserDetail) && p.c(this.status, appParams.status) && p.c(this.shortTitle, appParams.shortTitle);
            }
            return false;
        }

        public final AdParams getAd() {
            return this.f26144ad;
        }

        public final String getAppId() {
            return this.appId;
        }

        public final AppUserDetailResponse getAppUserDetail() {
            return this.appUserDetail;
        }

        public final String getAppUserIdLabel() {
            return this.appUserIdLabel;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final int getPushEnabled() {
            return this.pushEnabled;
        }

        public final boolean getRequestAppUserIdRegistration() {
            return this.requestAppUserIdRegistration;
        }

        public final String getShortTitle() {
            return this.shortTitle;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((((((this.appId.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.isPr)) * 31) + Integer.hashCode(this.pushEnabled)) * 31;
            boolean z10 = this.isHoldingCampaign;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode + i10) * 31;
            boolean z11 = this.isListing;
            int i12 = z11;
            if (z11 != 0) {
                i12 = 1;
            }
            int i13 = (i11 + i12) * 31;
            boolean z12 = this.isCategory;
            int i14 = z12;
            if (z12 != 0) {
                i14 = 1;
            }
            int hashCode2 = (((i13 + i14) * 31) + this.appUserIdLabel.hashCode()) * 31;
            boolean z13 = this.isAppUserIdHidden;
            int i15 = z13;
            if (z13 != 0) {
                i15 = 1;
            }
            int i16 = (hashCode2 + i15) * 31;
            boolean z14 = this.requestAppUserIdRegistration;
            int i17 = (i16 + (z14 ? 1 : z14 ? 1 : 0)) * 31;
            AdParams adParams = this.f26144ad;
            int hashCode3 = (i17 + (adParams == null ? 0 : adParams.hashCode())) * 31;
            AppUserDetailResponse appUserDetailResponse = this.appUserDetail;
            return ((((hashCode3 + (appUserDetailResponse != null ? appUserDetailResponse.hashCode() : 0)) * 31) + this.status.hashCode()) * 31) + this.shortTitle.hashCode();
        }

        public final boolean isAppUserIdHidden() {
            return this.isAppUserIdHidden;
        }

        public final boolean isCategory() {
            return this.isCategory;
        }

        public final boolean isHoldingCampaign() {
            return this.isHoldingCampaign;
        }

        public final boolean isListing() {
            return this.isListing;
        }

        public final int isPr() {
            return this.isPr;
        }

        public final void setAppUserDetail(AppUserDetailResponse appUserDetailResponse) {
            this.appUserDetail = appUserDetailResponse;
        }

        public String toString() {
            return "AppParams(appId=" + this.appId + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", isPr=" + this.isPr + ", pushEnabled=" + this.pushEnabled + ", isHoldingCampaign=" + this.isHoldingCampaign + ", isListing=" + this.isListing + ", isCategory=" + this.isCategory + ", appUserIdLabel=" + this.appUserIdLabel + ", isAppUserIdHidden=" + this.isAppUserIdHidden + ", requestAppUserIdRegistration=" + this.requestAppUserIdRegistration + ", ad=" + this.f26144ad + ", appUserDetail=" + this.appUserDetail + ", status=" + this.status + ", shortTitle=" + this.shortTitle + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class Apps {
        public static final int $stable = 8;
        private final List<AppParams> apps;
        private final int currentPage;
        private final String nextCursor;
        private final int nextPage;
        private final Status status;

        public Apps(List<AppParams> list, String str, int i10, int i11, Status status) {
            p.h(list, "apps");
            p.h(str, "nextCursor");
            p.h(status, "status");
            this.apps = list;
            this.nextCursor = str;
            this.nextPage = i10;
            this.currentPage = i11;
            this.status = status;
        }

        public static /* synthetic */ Apps copy$default(Apps apps, List list, String str, int i10, int i11, Status status, int i12, Object obj) {
            List<AppParams> list2 = list;
            if ((i12 & 1) != 0) {
                list2 = apps.apps;
            }
            if ((i12 & 2) != 0) {
                str = apps.nextCursor;
            }
            String str2 = str;
            if ((i12 & 4) != 0) {
                i10 = apps.nextPage;
            }
            int i13 = i10;
            if ((i12 & 8) != 0) {
                i11 = apps.currentPage;
            }
            int i14 = i11;
            if ((i12 & 16) != 0) {
                status = apps.status;
            }
            return apps.copy(list2, str2, i13, i14, status);
        }

        public final List<AppParams> component1() {
            return this.apps;
        }

        public final String component2() {
            return this.nextCursor;
        }

        public final int component3() {
            return this.nextPage;
        }

        public final int component4() {
            return this.currentPage;
        }

        public final Status component5() {
            return this.status;
        }

        public final Apps copy(List<AppParams> list, String str, int i10, int i11, Status status) {
            p.h(list, "apps");
            p.h(str, "nextCursor");
            p.h(status, "status");
            return new Apps(list, str, i10, i11, status);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Apps) {
                Apps apps = (Apps) obj;
                return p.c(this.apps, apps.apps) && p.c(this.nextCursor, apps.nextCursor) && this.nextPage == apps.nextPage && this.currentPage == apps.currentPage && p.c(this.status, apps.status);
            }
            return false;
        }

        public final List<AppParams> getApps() {
            return this.apps;
        }

        public final int getCurrentPage() {
            return this.currentPage;
        }

        public final String getNextCursor() {
            return this.nextCursor;
        }

        public final int getNextPage() {
            return this.nextPage;
        }

        public final Status getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (((((((this.apps.hashCode() * 31) + this.nextCursor.hashCode()) * 31) + Integer.hashCode(this.nextPage)) * 31) + Integer.hashCode(this.currentPage)) * 31) + this.status.hashCode();
        }

        public String toString() {
            return "Apps(apps=" + this.apps + ", nextCursor=" + this.nextCursor + ", nextPage=" + this.nextPage + ", currentPage=" + this.currentPage + ", status=" + this.status + ')';
        }
    }
}
