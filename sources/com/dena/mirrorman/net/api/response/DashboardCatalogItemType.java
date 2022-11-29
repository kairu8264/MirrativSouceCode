package com.dena.mirrorman.net.api.response;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public enum DashboardCatalogItemType {
    LIVE_SMALL("live_small"),
    LIVE_LARGE("live_large"),
    MIRRATIVQ("mirrativq"),
    LIVE_ANNOUNCEMENT("live_announcement"),
    CATALOG_BANNER("catalog_banner"),
    CAROUSEL("carousel"),
    UNKNOWN("unknown"),
    GROUP_SHOT("group_shot");
    
    public static final Companion Companion = new Companion(null);
    private final String typeName;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final DashboardCatalogItemType fromTypeName(String str) {
            p.h(str, "typeName");
            switch (str.hashCode()) {
                case -1608981062:
                    if (str.equals("live_announcement")) {
                        return DashboardCatalogItemType.LIVE_ANNOUNCEMENT;
                    }
                    break;
                case 2908512:
                    if (str.equals("carousel")) {
                        return DashboardCatalogItemType.CAROUSEL;
                    }
                    break;
                case 302480914:
                    if (str.equals("catalog_banner")) {
                        return DashboardCatalogItemType.CATALOG_BANNER;
                    }
                    break;
                case 320520309:
                    if (str.equals("mirrativq")) {
                        return DashboardCatalogItemType.MIRRATIVQ;
                    }
                    break;
                case 1206480424:
                    if (str.equals("live_large")) {
                        return DashboardCatalogItemType.LIVE_LARGE;
                    }
                    break;
                case 1213286388:
                    if (str.equals("live_small")) {
                        return DashboardCatalogItemType.LIVE_SMALL;
                    }
                    break;
                case 1282462906:
                    if (str.equals("group_shot")) {
                        return DashboardCatalogItemType.GROUP_SHOT;
                    }
                    break;
            }
            return DashboardCatalogItemType.UNKNOWN;
        }
    }

    DashboardCatalogItemType(String str) {
        this.typeName = str;
    }

    public final String getTypeName() {
        return this.typeName;
    }
}
