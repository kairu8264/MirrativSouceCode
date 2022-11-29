package com.dena.mirrorman.net.api.response;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public enum CarouselItemType {
    MIRRATIVQ("mirrativq"),
    CATALOG_BANNER("catalog_banner"),
    CATALOG_WEB_BANNER("catalog_web_banner"),
    UNKNOWN("unknown");
    
    public static final Companion Companion = new Companion(null);
    private final String typeName;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final CarouselItemType fromTypeName(String str) {
            p.h(str, "typeName");
            int hashCode = str.hashCode();
            if (hashCode != 71837277) {
                if (hashCode != 302480914) {
                    if (hashCode == 320520309 && str.equals("mirrativq")) {
                        return CarouselItemType.MIRRATIVQ;
                    }
                } else if (str.equals("catalog_banner")) {
                    return CarouselItemType.CATALOG_BANNER;
                }
            } else if (str.equals("catalog_web_banner")) {
                return CarouselItemType.CATALOG_WEB_BANNER;
            }
            return CarouselItemType.UNKNOWN;
        }
    }

    CarouselItemType(String str) {
        this.typeName = str;
    }

    public final String getTypeName() {
        return this.typeName;
    }
}
