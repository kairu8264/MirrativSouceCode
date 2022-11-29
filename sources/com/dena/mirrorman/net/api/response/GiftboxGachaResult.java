package com.dena.mirrorman.net.api.response;

import jo.p;

/* loaded from: classes2.dex */
public final class GiftboxGachaResult {
    public static final int $stable = 0;
    private final String giftboxGachaItemName;
    private final String giftboxGachaItemUrl;
    private final int giftboxItemId;
    private final int userGiftboxGachaId;

    public GiftboxGachaResult(String str, String str2, int i10, int i11) {
        p.h(str, "giftboxGachaItemUrl");
        p.h(str2, "giftboxGachaItemName");
        this.giftboxGachaItemUrl = str;
        this.giftboxGachaItemName = str2;
        this.giftboxItemId = i10;
        this.userGiftboxGachaId = i11;
    }

    public static /* synthetic */ GiftboxGachaResult copy$default(GiftboxGachaResult giftboxGachaResult, String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = giftboxGachaResult.giftboxGachaItemUrl;
        }
        if ((i12 & 2) != 0) {
            str2 = giftboxGachaResult.giftboxGachaItemName;
        }
        if ((i12 & 4) != 0) {
            i10 = giftboxGachaResult.giftboxItemId;
        }
        if ((i12 & 8) != 0) {
            i11 = giftboxGachaResult.userGiftboxGachaId;
        }
        return giftboxGachaResult.copy(str, str2, i10, i11);
    }

    public final String component1() {
        return this.giftboxGachaItemUrl;
    }

    public final String component2() {
        return this.giftboxGachaItemName;
    }

    public final int component3() {
        return this.giftboxItemId;
    }

    public final int component4() {
        return this.userGiftboxGachaId;
    }

    public final GiftboxGachaResult copy(String str, String str2, int i10, int i11) {
        p.h(str, "giftboxGachaItemUrl");
        p.h(str2, "giftboxGachaItemName");
        return new GiftboxGachaResult(str, str2, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftboxGachaResult) {
            GiftboxGachaResult giftboxGachaResult = (GiftboxGachaResult) obj;
            return p.c(this.giftboxGachaItemUrl, giftboxGachaResult.giftboxGachaItemUrl) && p.c(this.giftboxGachaItemName, giftboxGachaResult.giftboxGachaItemName) && this.giftboxItemId == giftboxGachaResult.giftboxItemId && this.userGiftboxGachaId == giftboxGachaResult.userGiftboxGachaId;
        }
        return false;
    }

    public final String getGiftboxGachaItemName() {
        return this.giftboxGachaItemName;
    }

    public final String getGiftboxGachaItemUrl() {
        return this.giftboxGachaItemUrl;
    }

    public final int getGiftboxItemId() {
        return this.giftboxItemId;
    }

    public final int getUserGiftboxGachaId() {
        return this.userGiftboxGachaId;
    }

    public int hashCode() {
        return (((((this.giftboxGachaItemUrl.hashCode() * 31) + this.giftboxGachaItemName.hashCode()) * 31) + Integer.hashCode(this.giftboxItemId)) * 31) + Integer.hashCode(this.userGiftboxGachaId);
    }

    public String toString() {
        return "GiftboxGachaResult(giftboxGachaItemUrl=" + this.giftboxGachaItemUrl + ", giftboxGachaItemName=" + this.giftboxGachaItemName + ", giftboxItemId=" + this.giftboxItemId + ", userGiftboxGachaId=" + this.userGiftboxGachaId + ')';
    }
}
