package com.dena.mirrorman.net.api.response;

import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class SimpleGiftGachaStock {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int collabUserId;
    private final int count;
    private final int giftEventId;
    private final String imageUrl;
    private final String senderId;
    private final String stockImageUrl;
    private final int time;
    @b(GiftGachaStockTypeAdapter.class)
    private final GiftGachaStockType type;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final SimpleGiftGachaStock convert(GiftGachaStock giftGachaStock) {
            p.h(giftGachaStock, "giftGachaStock");
            return new SimpleGiftGachaStock(giftGachaStock.getUser().getProfileImageUrl(), giftGachaStock.getStockImageUrl(), giftGachaStock.getCount(), giftGachaStock.getUser().getUserId(), giftGachaStock.getCollabUserId(), giftGachaStock.getType(), giftGachaStock.getTime(), giftGachaStock.getGiftEventId());
        }
    }

    public SimpleGiftGachaStock(String str, String str2, int i10, String str3, int i11, GiftGachaStockType giftGachaStockType, int i12, int i13) {
        p.h(str, "imageUrl");
        p.h(str2, "stockImageUrl");
        p.h(str3, "senderId");
        p.h(giftGachaStockType, "type");
        this.imageUrl = str;
        this.stockImageUrl = str2;
        this.count = i10;
        this.senderId = str3;
        this.collabUserId = i11;
        this.type = giftGachaStockType;
        this.time = i12;
        this.giftEventId = i13;
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final String component2() {
        return this.stockImageUrl;
    }

    public final int component3() {
        return this.count;
    }

    public final String component4() {
        return this.senderId;
    }

    public final int component5() {
        return this.collabUserId;
    }

    public final GiftGachaStockType component6() {
        return this.type;
    }

    public final int component7() {
        return this.time;
    }

    public final int component8() {
        return this.giftEventId;
    }

    public final SimpleGiftGachaStock copy(String str, String str2, int i10, String str3, int i11, GiftGachaStockType giftGachaStockType, int i12, int i13) {
        p.h(str, "imageUrl");
        p.h(str2, "stockImageUrl");
        p.h(str3, "senderId");
        p.h(giftGachaStockType, "type");
        return new SimpleGiftGachaStock(str, str2, i10, str3, i11, giftGachaStockType, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleGiftGachaStock) {
            SimpleGiftGachaStock simpleGiftGachaStock = (SimpleGiftGachaStock) obj;
            return p.c(this.imageUrl, simpleGiftGachaStock.imageUrl) && p.c(this.stockImageUrl, simpleGiftGachaStock.stockImageUrl) && this.count == simpleGiftGachaStock.count && p.c(this.senderId, simpleGiftGachaStock.senderId) && this.collabUserId == simpleGiftGachaStock.collabUserId && this.type == simpleGiftGachaStock.type && this.time == simpleGiftGachaStock.time && this.giftEventId == simpleGiftGachaStock.giftEventId;
        }
        return false;
    }

    public final int getCollabUserId() {
        return this.collabUserId;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getGiftEventId() {
        return this.giftEventId;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSenderId() {
        return this.senderId;
    }

    public final String getStockImageUrl() {
        return this.stockImageUrl;
    }

    public final int getTime() {
        return this.time;
    }

    public final GiftGachaStockType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((this.imageUrl.hashCode() * 31) + this.stockImageUrl.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + this.senderId.hashCode()) * 31) + Integer.hashCode(this.collabUserId)) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.time)) * 31) + Integer.hashCode(this.giftEventId);
    }

    public String toString() {
        return "SimpleGiftGachaStock(imageUrl=" + this.imageUrl + ", stockImageUrl=" + this.stockImageUrl + ", count=" + this.count + ", senderId=" + this.senderId + ", collabUserId=" + this.collabUserId + ", type=" + this.type + ", time=" + this.time + ", giftEventId=" + this.giftEventId + ')';
    }
}
