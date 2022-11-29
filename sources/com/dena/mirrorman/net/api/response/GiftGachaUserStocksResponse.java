package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class GiftGachaUserStocksResponse {
    public static final int $stable = 8;
    private final int currentMeter;
    @b(BooleanTypeAdapter.class)
    private final boolean enabled;
    private final long endsAt;
    private final List<GiftGachaStock> giftGachaStocks;
    private final int maxMeter;
    private final long startsAt;
    private final Status status;
    private final String stockImageUrl;

    public GiftGachaUserStocksResponse(boolean z10, List<GiftGachaStock> list, long j10, long j11, int i10, int i11, String str, Status status) {
        p.h(list, "giftGachaStocks");
        p.h(str, "stockImageUrl");
        p.h(status, "status");
        this.enabled = z10;
        this.giftGachaStocks = list;
        this.startsAt = j10;
        this.endsAt = j11;
        this.currentMeter = i10;
        this.maxMeter = i11;
        this.stockImageUrl = str;
        this.status = status;
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final List<GiftGachaStock> component2() {
        return this.giftGachaStocks;
    }

    public final long component3() {
        return this.startsAt;
    }

    public final long component4() {
        return this.endsAt;
    }

    public final int component5() {
        return this.currentMeter;
    }

    public final int component6() {
        return this.maxMeter;
    }

    public final String component7() {
        return this.stockImageUrl;
    }

    public final Status component8() {
        return this.status;
    }

    public final GiftGachaUserStocksResponse copy(boolean z10, List<GiftGachaStock> list, long j10, long j11, int i10, int i11, String str, Status status) {
        p.h(list, "giftGachaStocks");
        p.h(str, "stockImageUrl");
        p.h(status, "status");
        return new GiftGachaUserStocksResponse(z10, list, j10, j11, i10, i11, str, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftGachaUserStocksResponse) {
            GiftGachaUserStocksResponse giftGachaUserStocksResponse = (GiftGachaUserStocksResponse) obj;
            return this.enabled == giftGachaUserStocksResponse.enabled && p.c(this.giftGachaStocks, giftGachaUserStocksResponse.giftGachaStocks) && this.startsAt == giftGachaUserStocksResponse.startsAt && this.endsAt == giftGachaUserStocksResponse.endsAt && this.currentMeter == giftGachaUserStocksResponse.currentMeter && this.maxMeter == giftGachaUserStocksResponse.maxMeter && p.c(this.stockImageUrl, giftGachaUserStocksResponse.stockImageUrl) && p.c(this.status, giftGachaUserStocksResponse.status);
        }
        return false;
    }

    public final int getCurrentMeter() {
        return this.currentMeter;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getEndsAt() {
        return this.endsAt;
    }

    public final List<GiftGachaStock> getGiftGachaStocks() {
        return this.giftGachaStocks;
    }

    public final int getMaxMeter() {
        return this.maxMeter;
    }

    public final long getStartsAt() {
        return this.startsAt;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getStockImageUrl() {
        return this.stockImageUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z10 = this.enabled;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((((((((((((r02 * 31) + this.giftGachaStocks.hashCode()) * 31) + Long.hashCode(this.startsAt)) * 31) + Long.hashCode(this.endsAt)) * 31) + Integer.hashCode(this.currentMeter)) * 31) + Integer.hashCode(this.maxMeter)) * 31) + this.stockImageUrl.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "GiftGachaUserStocksResponse(enabled=" + this.enabled + ", giftGachaStocks=" + this.giftGachaStocks + ", startsAt=" + this.startsAt + ", endsAt=" + this.endsAt + ", currentMeter=" + this.currentMeter + ", maxMeter=" + this.maxMeter + ", stockImageUrl=" + this.stockImageUrl + ", status=" + this.status + ')';
    }
}
