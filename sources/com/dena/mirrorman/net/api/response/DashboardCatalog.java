package com.dena.mirrorman.net.api.response;

import androidx.appcompat.widget.ListPopupWindow;
import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.LivesResponse;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import xn.t;
import ym.b;

/* loaded from: classes2.dex */
public final class DashboardCatalog {
    private final AnnouncementUrls announcementUrls;
    private final String appId;
    private final String iconUrl;
    private final int isMyApp;
    private final int latest_diamonds_given_at;
    private final List<DashboardCatalogItem> list;
    private final int livesNum;
    private final String nextCursor;
    @b(BooleanTypeAdapter.class)
    private final boolean standingViewEnabled;
    private final Status status;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DashboardCatalog(Status status, List<DashboardCatalogItem> list, String str, int i10, AnnouncementUrls announcementUrls, int i11, String str2, String str3, String str4, int i12, boolean z10) {
        p.h(status, "status");
        p.h(list, "list");
        this.status = status;
        this.list = list;
        this.nextCursor = str;
        this.latest_diamonds_given_at = i10;
        this.announcementUrls = announcementUrls;
        this.livesNum = i11;
        this.appId = str2;
        this.iconUrl = str3;
        this.title = str4;
        this.isMyApp = i12;
        this.standingViewEnabled = z10;
    }

    public final Status component1() {
        return this.status;
    }

    public final int component10() {
        return this.isMyApp;
    }

    public final boolean component11() {
        return this.standingViewEnabled;
    }

    public final List<DashboardCatalogItem> component2() {
        return this.list;
    }

    public final String component3() {
        return this.nextCursor;
    }

    public final int component4() {
        return this.latest_diamonds_given_at;
    }

    public final AnnouncementUrls component5() {
        return this.announcementUrls;
    }

    public final int component6() {
        return this.livesNum;
    }

    public final String component7() {
        return this.appId;
    }

    public final String component8() {
        return this.iconUrl;
    }

    public final String component9() {
        return this.title;
    }

    public final DashboardCatalog copy(Status status, List<DashboardCatalogItem> list, String str, int i10, AnnouncementUrls announcementUrls, int i11, String str2, String str3, String str4, int i12, boolean z10) {
        p.h(status, "status");
        p.h(list, "list");
        return new DashboardCatalog(status, list, str, i10, announcementUrls, i11, str2, str3, str4, i12, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DashboardCatalog) {
            DashboardCatalog dashboardCatalog = (DashboardCatalog) obj;
            return p.c(this.status, dashboardCatalog.status) && p.c(this.list, dashboardCatalog.list) && p.c(this.nextCursor, dashboardCatalog.nextCursor) && this.latest_diamonds_given_at == dashboardCatalog.latest_diamonds_given_at && p.c(this.announcementUrls, dashboardCatalog.announcementUrls) && this.livesNum == dashboardCatalog.livesNum && p.c(this.appId, dashboardCatalog.appId) && p.c(this.iconUrl, dashboardCatalog.iconUrl) && p.c(this.title, dashboardCatalog.title) && this.isMyApp == dashboardCatalog.isMyApp && this.standingViewEnabled == dashboardCatalog.standingViewEnabled;
        }
        return false;
    }

    public final AnnouncementUrls getAnnouncementUrls() {
        return this.announcementUrls;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getLatest_diamonds_given_at() {
        return this.latest_diamonds_given_at;
    }

    public final List<DashboardCatalogItem> getList() {
        return this.list;
    }

    public final int getLivesNum() {
        return this.livesNum;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final boolean getStandingViewEnabled() {
        return this.standingViewEnabled;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.status.hashCode() * 31) + this.list.hashCode()) * 31;
        String str = this.nextCursor;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.latest_diamonds_given_at)) * 31;
        AnnouncementUrls announcementUrls = this.announcementUrls;
        int hashCode3 = (((hashCode2 + (announcementUrls == null ? 0 : announcementUrls.hashCode())) * 31) + Integer.hashCode(this.livesNum)) * 31;
        String str2 = this.appId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode6 = (((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.isMyApp)) * 31;
        boolean z10 = this.standingViewEnabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode6 + i10;
    }

    public final int isMyApp() {
        return this.isMyApp;
    }

    public String toString() {
        return "DashboardCatalog(status=" + this.status + ", list=" + this.list + ", nextCursor=" + this.nextCursor + ", latest_diamonds_given_at=" + this.latest_diamonds_given_at + ", announcementUrls=" + this.announcementUrls + ", livesNum=" + this.livesNum + ", appId=" + this.appId + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", isMyApp=" + this.isMyApp + ", standingViewEnabled=" + this.standingViewEnabled + ')';
    }

    public /* synthetic */ DashboardCatalog(Status status, List list, String str, int i10, AnnouncementUrls announcementUrls, int i11, String str2, String str3, String str4, int i12, boolean z10, int i13, h hVar) {
        this(status, list, str, (i13 & 8) != 0 ? 0 : i10, (i13 & 16) != 0 ? null : announcementUrls, (i13 & 32) != 0 ? 0 : i11, (i13 & 64) != 0 ? null : str2, (i13 & 128) != 0 ? null : str3, (i13 & 256) != 0 ? null : str4, (i13 & 512) != 0 ? 0 : i12, (i13 & 1024) != 0 ? false : z10);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final DashboardCatalog convert(App.AppPage appPage) {
            p.h(appPage, "appPage");
            Status status = appPage.getStatus();
            List<LiveBasicParams> lives = appPage.getLives();
            ArrayList arrayList = new ArrayList(t.u(lives, 10));
            for (LiveBasicParams liveBasicParams : lives) {
                arrayList.add(new DashboardCatalogItem(DashboardCatalogItemType.LIVE_SMALL, null, liveBasicParams, null, null, null, null, null, ListPopupWindow.EXPAND_LIST_TIMEOUT, null));
            }
            return new DashboardCatalog(status, arrayList, String.valueOf(appPage.getNextPage()), 0, null, 0, appPage.getAppId(), appPage.getIconUrl(), appPage.getTitle(), appPage.isMyApp(), false, 1080, null);
        }

        public final DashboardCatalog convert(LivesResponse livesResponse) {
            p.h(livesResponse, "liveBasicList");
            Status status = livesResponse.getStatus();
            List<LiveBasicParams> liveSmalls = livesResponse.getLiveSmalls();
            ArrayList arrayList = new ArrayList(t.u(liveSmalls, 10));
            for (LiveBasicParams liveBasicParams : liveSmalls) {
                arrayList.add(new DashboardCatalogItem(DashboardCatalogItemType.LIVE_SMALL, null, liveBasicParams, null, null, null, null, null, ListPopupWindow.EXPAND_LIST_TIMEOUT, null));
            }
            return new DashboardCatalog(status, arrayList, livesResponse.getNextPage() > 0 ? String.valueOf(livesResponse.getNextPage()) : null, 0, null, livesResponse.getLivesNum(), null, null, null, 0, false, 2008, null);
        }
    }
}
