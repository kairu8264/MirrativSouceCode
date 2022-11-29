package com.dena.mirrorman.net.api.response;

import com.dena.mirrorman.net.api.response.live.CatalogBanner;
import com.dena.mirrorman.net.api.response.live.GroupShotItem;
import com.dena.mirrorman.net.api.response.live.LiveBasicParams;
import com.dena.mirrorman.net.api.response.live.LiveCatalogAnnouncement;
import com.dena.mirrorman.net.api.response.live.LiveCatalogMirrativQ;
import java.util.List;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class DashboardCatalogItem {
    public static final int $stable = 8;
    private final List<CarouselItem> carousel;
    private final CatalogBanner catalogBanner;
    private final List<GroupShotItem> groupShots;
    private final LiveCatalogAnnouncement liveAnnouncement;
    private final LiveBasicParams live_large;
    private final LiveBasicParams live_small;
    private final LiveCatalogMirrativQ mirrativq;
    @b(DashboardCatalogItemTypeAdapter.class)
    private final DashboardCatalogItemType type;

    public DashboardCatalogItem(DashboardCatalogItemType dashboardCatalogItemType, LiveBasicParams liveBasicParams, LiveBasicParams liveBasicParams2, LiveCatalogMirrativQ liveCatalogMirrativQ, LiveCatalogAnnouncement liveCatalogAnnouncement, CatalogBanner catalogBanner, List<CarouselItem> list, List<GroupShotItem> list2) {
        p.h(dashboardCatalogItemType, "type");
        this.type = dashboardCatalogItemType;
        this.live_large = liveBasicParams;
        this.live_small = liveBasicParams2;
        this.mirrativq = liveCatalogMirrativQ;
        this.liveAnnouncement = liveCatalogAnnouncement;
        this.catalogBanner = catalogBanner;
        this.carousel = list;
        this.groupShots = list2;
    }

    public final DashboardCatalogItemType component1() {
        return this.type;
    }

    public final LiveBasicParams component2() {
        return this.live_large;
    }

    public final LiveBasicParams component3() {
        return this.live_small;
    }

    public final LiveCatalogMirrativQ component4() {
        return this.mirrativq;
    }

    public final LiveCatalogAnnouncement component5() {
        return this.liveAnnouncement;
    }

    public final CatalogBanner component6() {
        return this.catalogBanner;
    }

    public final List<CarouselItem> component7() {
        return this.carousel;
    }

    public final List<GroupShotItem> component8() {
        return this.groupShots;
    }

    public final DashboardCatalogItem copy(DashboardCatalogItemType dashboardCatalogItemType, LiveBasicParams liveBasicParams, LiveBasicParams liveBasicParams2, LiveCatalogMirrativQ liveCatalogMirrativQ, LiveCatalogAnnouncement liveCatalogAnnouncement, CatalogBanner catalogBanner, List<CarouselItem> list, List<GroupShotItem> list2) {
        p.h(dashboardCatalogItemType, "type");
        return new DashboardCatalogItem(dashboardCatalogItemType, liveBasicParams, liveBasicParams2, liveCatalogMirrativQ, liveCatalogAnnouncement, catalogBanner, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DashboardCatalogItem) {
            DashboardCatalogItem dashboardCatalogItem = (DashboardCatalogItem) obj;
            return this.type == dashboardCatalogItem.type && p.c(this.live_large, dashboardCatalogItem.live_large) && p.c(this.live_small, dashboardCatalogItem.live_small) && p.c(this.mirrativq, dashboardCatalogItem.mirrativq) && p.c(this.liveAnnouncement, dashboardCatalogItem.liveAnnouncement) && p.c(this.catalogBanner, dashboardCatalogItem.catalogBanner) && p.c(this.carousel, dashboardCatalogItem.carousel) && p.c(this.groupShots, dashboardCatalogItem.groupShots);
        }
        return false;
    }

    public final List<CarouselItem> getCarousel() {
        return this.carousel;
    }

    public final CatalogBanner getCatalogBanner() {
        return this.catalogBanner;
    }

    public final List<GroupShotItem> getGroupShots() {
        return this.groupShots;
    }

    public final LiveCatalogAnnouncement getLiveAnnouncement() {
        return this.liveAnnouncement;
    }

    public final LiveBasicParams getLive_large() {
        return this.live_large;
    }

    public final LiveBasicParams getLive_small() {
        return this.live_small;
    }

    public final LiveCatalogMirrativQ getMirrativq() {
        return this.mirrativq;
    }

    public final DashboardCatalogItemType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        LiveBasicParams liveBasicParams = this.live_large;
        int hashCode2 = (hashCode + (liveBasicParams == null ? 0 : liveBasicParams.hashCode())) * 31;
        LiveBasicParams liveBasicParams2 = this.live_small;
        int hashCode3 = (hashCode2 + (liveBasicParams2 == null ? 0 : liveBasicParams2.hashCode())) * 31;
        LiveCatalogMirrativQ liveCatalogMirrativQ = this.mirrativq;
        int hashCode4 = (hashCode3 + (liveCatalogMirrativQ == null ? 0 : liveCatalogMirrativQ.hashCode())) * 31;
        LiveCatalogAnnouncement liveCatalogAnnouncement = this.liveAnnouncement;
        int hashCode5 = (hashCode4 + (liveCatalogAnnouncement == null ? 0 : liveCatalogAnnouncement.hashCode())) * 31;
        CatalogBanner catalogBanner = this.catalogBanner;
        int hashCode6 = (hashCode5 + (catalogBanner == null ? 0 : catalogBanner.hashCode())) * 31;
        List<CarouselItem> list = this.carousel;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupShotItem> list2 = this.groupShots;
        return hashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "DashboardCatalogItem(type=" + this.type + ", live_large=" + this.live_large + ", live_small=" + this.live_small + ", mirrativq=" + this.mirrativq + ", liveAnnouncement=" + this.liveAnnouncement + ", catalogBanner=" + this.catalogBanner + ", carousel=" + this.carousel + ", groupShots=" + this.groupShots + ')';
    }

    public /* synthetic */ DashboardCatalogItem(DashboardCatalogItemType dashboardCatalogItemType, LiveBasicParams liveBasicParams, LiveBasicParams liveBasicParams2, LiveCatalogMirrativQ liveCatalogMirrativQ, LiveCatalogAnnouncement liveCatalogAnnouncement, CatalogBanner catalogBanner, List list, List list2, int i10, h hVar) {
        this(dashboardCatalogItemType, (i10 & 2) != 0 ? null : liveBasicParams, (i10 & 4) != 0 ? null : liveBasicParams2, (i10 & 8) != 0 ? null : liveCatalogMirrativQ, (i10 & 16) != 0 ? null : liveCatalogAnnouncement, (i10 & 32) != 0 ? null : catalogBanner, (i10 & 64) != 0 ? null : list, (i10 & 128) == 0 ? list2 : null);
    }
}
