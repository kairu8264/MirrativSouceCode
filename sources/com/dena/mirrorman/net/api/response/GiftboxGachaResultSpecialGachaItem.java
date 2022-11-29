package com.dena.mirrorman.net.api.response;

import jo.p;

/* loaded from: classes2.dex */
public final class GiftboxGachaResultSpecialGachaItem {
    public static final int $stable = 0;
    private final String imageUrl;
    private final int num;

    public GiftboxGachaResultSpecialGachaItem(String str, int i10) {
        p.h(str, "imageUrl");
        this.imageUrl = str;
        this.num = i10;
    }

    public static /* synthetic */ GiftboxGachaResultSpecialGachaItem copy$default(GiftboxGachaResultSpecialGachaItem giftboxGachaResultSpecialGachaItem, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = giftboxGachaResultSpecialGachaItem.imageUrl;
        }
        if ((i11 & 2) != 0) {
            i10 = giftboxGachaResultSpecialGachaItem.num;
        }
        return giftboxGachaResultSpecialGachaItem.copy(str, i10);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final int component2() {
        return this.num;
    }

    public final GiftboxGachaResultSpecialGachaItem copy(String str, int i10) {
        p.h(str, "imageUrl");
        return new GiftboxGachaResultSpecialGachaItem(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftboxGachaResultSpecialGachaItem) {
            GiftboxGachaResultSpecialGachaItem giftboxGachaResultSpecialGachaItem = (GiftboxGachaResultSpecialGachaItem) obj;
            return p.c(this.imageUrl, giftboxGachaResultSpecialGachaItem.imageUrl) && this.num == giftboxGachaResultSpecialGachaItem.num;
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getNum() {
        return this.num;
    }

    public int hashCode() {
        return (this.imageUrl.hashCode() * 31) + Integer.hashCode(this.num);
    }

    public String toString() {
        return "GiftboxGachaResultSpecialGachaItem(imageUrl=" + this.imageUrl + ", num=" + this.num + ')';
    }
}
