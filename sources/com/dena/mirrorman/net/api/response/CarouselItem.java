package com.dena.mirrorman.net.api.response;

import com.dena.mirrorman.net.api.response.live.CatalogBanner;
import com.dena.mirrorman.net.api.response.live.CatalogWebBanner;
import com.dena.mirrorman.net.api.response.live.LiveCatalogMirrativQ;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class CarouselItem {
    public static final int $stable = 8;
    private final CatalogBanner catalogBanner;
    private final CatalogWebBanner catalogWebBanner;
    private final LiveCatalogMirrativQ mirrativq;
    @b(CarouselItemTypeAdapter.class)
    private final CarouselItemType type;

    public CarouselItem(CarouselItemType carouselItemType, LiveCatalogMirrativQ liveCatalogMirrativQ, CatalogBanner catalogBanner, CatalogWebBanner catalogWebBanner) {
        p.h(carouselItemType, "type");
        this.type = carouselItemType;
        this.mirrativq = liveCatalogMirrativQ;
        this.catalogBanner = catalogBanner;
        this.catalogWebBanner = catalogWebBanner;
    }

    public static /* synthetic */ CarouselItem copy$default(CarouselItem carouselItem, CarouselItemType carouselItemType, LiveCatalogMirrativQ liveCatalogMirrativQ, CatalogBanner catalogBanner, CatalogWebBanner catalogWebBanner, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            carouselItemType = carouselItem.type;
        }
        if ((i10 & 2) != 0) {
            liveCatalogMirrativQ = carouselItem.mirrativq;
        }
        if ((i10 & 4) != 0) {
            catalogBanner = carouselItem.catalogBanner;
        }
        if ((i10 & 8) != 0) {
            catalogWebBanner = carouselItem.catalogWebBanner;
        }
        return carouselItem.copy(carouselItemType, liveCatalogMirrativQ, catalogBanner, catalogWebBanner);
    }

    public final CarouselItemType component1() {
        return this.type;
    }

    public final LiveCatalogMirrativQ component2() {
        return this.mirrativq;
    }

    public final CatalogBanner component3() {
        return this.catalogBanner;
    }

    public final CatalogWebBanner component4() {
        return this.catalogWebBanner;
    }

    public final CarouselItem copy(CarouselItemType carouselItemType, LiveCatalogMirrativQ liveCatalogMirrativQ, CatalogBanner catalogBanner, CatalogWebBanner catalogWebBanner) {
        p.h(carouselItemType, "type");
        return new CarouselItem(carouselItemType, liveCatalogMirrativQ, catalogBanner, catalogWebBanner);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarouselItem) {
            CarouselItem carouselItem = (CarouselItem) obj;
            return this.type == carouselItem.type && p.c(this.mirrativq, carouselItem.mirrativq) && p.c(this.catalogBanner, carouselItem.catalogBanner) && p.c(this.catalogWebBanner, carouselItem.catalogWebBanner);
        }
        return false;
    }

    public final CatalogBanner getCatalogBanner() {
        return this.catalogBanner;
    }

    public final CatalogWebBanner getCatalogWebBanner() {
        return this.catalogWebBanner;
    }

    public final LiveCatalogMirrativQ getMirrativq() {
        return this.mirrativq;
    }

    public final CarouselItemType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        LiveCatalogMirrativQ liveCatalogMirrativQ = this.mirrativq;
        int hashCode2 = (hashCode + (liveCatalogMirrativQ == null ? 0 : liveCatalogMirrativQ.hashCode())) * 31;
        CatalogBanner catalogBanner = this.catalogBanner;
        int hashCode3 = (hashCode2 + (catalogBanner == null ? 0 : catalogBanner.hashCode())) * 31;
        CatalogWebBanner catalogWebBanner = this.catalogWebBanner;
        return hashCode3 + (catalogWebBanner != null ? catalogWebBanner.hashCode() : 0);
    }

    public String toString() {
        return "CarouselItem(type=" + this.type + ", mirrativq=" + this.mirrativq + ", catalogBanner=" + this.catalogBanner + ", catalogWebBanner=" + this.catalogWebBanner + ')';
    }
}
