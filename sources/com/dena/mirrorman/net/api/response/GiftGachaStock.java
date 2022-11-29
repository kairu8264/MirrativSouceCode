package com.dena.mirrorman.net.api.response;

import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class GiftGachaStock {
    public static final int $stable = 8;
    private final int collabUserId;
    private final int count;
    private final int giftEventId;
    private final String stockImageUrl;
    private final int time;
    @b(GiftGachaStockTypeAdapter.class)
    private final GiftGachaStockType type;
    private final UserBasicParams user;

    public GiftGachaStock(int i10, int i11, UserBasicParams userBasicParams, int i12, GiftGachaStockType giftGachaStockType, String str, int i13) {
        p.h(userBasicParams, MRLog.TARGET_TYPE_USER);
        p.h(giftGachaStockType, "type");
        p.h(str, "stockImageUrl");
        this.collabUserId = i10;
        this.giftEventId = i11;
        this.user = userBasicParams;
        this.count = i12;
        this.type = giftGachaStockType;
        this.stockImageUrl = str;
        this.time = i13;
    }

    public static /* synthetic */ GiftGachaStock copy$default(GiftGachaStock giftGachaStock, int i10, int i11, UserBasicParams userBasicParams, int i12, GiftGachaStockType giftGachaStockType, String str, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = giftGachaStock.collabUserId;
        }
        if ((i14 & 2) != 0) {
            i11 = giftGachaStock.giftEventId;
        }
        int i15 = i11;
        if ((i14 & 4) != 0) {
            userBasicParams = giftGachaStock.user;
        }
        UserBasicParams userBasicParams2 = userBasicParams;
        if ((i14 & 8) != 0) {
            i12 = giftGachaStock.count;
        }
        int i16 = i12;
        if ((i14 & 16) != 0) {
            giftGachaStockType = giftGachaStock.type;
        }
        GiftGachaStockType giftGachaStockType2 = giftGachaStockType;
        if ((i14 & 32) != 0) {
            str = giftGachaStock.stockImageUrl;
        }
        String str2 = str;
        if ((i14 & 64) != 0) {
            i13 = giftGachaStock.time;
        }
        return giftGachaStock.copy(i10, i15, userBasicParams2, i16, giftGachaStockType2, str2, i13);
    }

    public final int component1() {
        return this.collabUserId;
    }

    public final int component2() {
        return this.giftEventId;
    }

    public final UserBasicParams component3() {
        return this.user;
    }

    public final int component4() {
        return this.count;
    }

    public final GiftGachaStockType component5() {
        return this.type;
    }

    public final String component6() {
        return this.stockImageUrl;
    }

    public final int component7() {
        return this.time;
    }

    public final GiftGachaStock copy(int i10, int i11, UserBasicParams userBasicParams, int i12, GiftGachaStockType giftGachaStockType, String str, int i13) {
        p.h(userBasicParams, MRLog.TARGET_TYPE_USER);
        p.h(giftGachaStockType, "type");
        p.h(str, "stockImageUrl");
        return new GiftGachaStock(i10, i11, userBasicParams, i12, giftGachaStockType, str, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftGachaStock) {
            GiftGachaStock giftGachaStock = (GiftGachaStock) obj;
            return this.collabUserId == giftGachaStock.collabUserId && this.giftEventId == giftGachaStock.giftEventId && p.c(this.user, giftGachaStock.user) && this.count == giftGachaStock.count && this.type == giftGachaStock.type && p.c(this.stockImageUrl, giftGachaStock.stockImageUrl) && this.time == giftGachaStock.time;
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

    public final String getStockImageUrl() {
        return this.stockImageUrl;
    }

    public final int getTime() {
        return this.time;
    }

    public final GiftGachaStockType getType() {
        return this.type;
    }

    public final UserBasicParams getUser() {
        return this.user;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.collabUserId) * 31) + Integer.hashCode(this.giftEventId)) * 31) + this.user.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + this.type.hashCode()) * 31) + this.stockImageUrl.hashCode()) * 31) + Integer.hashCode(this.time);
    }

    public String toString() {
        return "GiftGachaStock(collabUserId=" + this.collabUserId + ", giftEventId=" + this.giftEventId + ", user=" + this.user + ", count=" + this.count + ", type=" + this.type + ", stockImageUrl=" + this.stockImageUrl + ", time=" + this.time + ')';
    }
}
