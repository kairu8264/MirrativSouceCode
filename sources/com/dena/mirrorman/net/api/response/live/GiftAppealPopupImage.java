package com.dena.mirrorman.net.api.response.live;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftAppealPopupImage {
    public static final int $stable = 0;
    private final String body;
    private final int giftAppealPopupId;
    private final String triangle;

    public GiftAppealPopupImage(int i10, String str, String str2) {
        p.h(str, TtmlNode.TAG_BODY);
        p.h(str2, "triangle");
        this.giftAppealPopupId = i10;
        this.body = str;
        this.triangle = str2;
    }

    public static /* synthetic */ GiftAppealPopupImage copy$default(GiftAppealPopupImage giftAppealPopupImage, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = giftAppealPopupImage.giftAppealPopupId;
        }
        if ((i11 & 2) != 0) {
            str = giftAppealPopupImage.body;
        }
        if ((i11 & 4) != 0) {
            str2 = giftAppealPopupImage.triangle;
        }
        return giftAppealPopupImage.copy(i10, str, str2);
    }

    public final int component1() {
        return this.giftAppealPopupId;
    }

    public final String component2() {
        return this.body;
    }

    public final String component3() {
        return this.triangle;
    }

    public final GiftAppealPopupImage copy(int i10, String str, String str2) {
        p.h(str, TtmlNode.TAG_BODY);
        p.h(str2, "triangle");
        return new GiftAppealPopupImage(i10, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftAppealPopupImage) {
            GiftAppealPopupImage giftAppealPopupImage = (GiftAppealPopupImage) obj;
            return this.giftAppealPopupId == giftAppealPopupImage.giftAppealPopupId && p.c(this.body, giftAppealPopupImage.body) && p.c(this.triangle, giftAppealPopupImage.triangle);
        }
        return false;
    }

    public final String getBody() {
        return this.body;
    }

    public final int getGiftAppealPopupId() {
        return this.giftAppealPopupId;
    }

    public final String getTriangle() {
        return this.triangle;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.giftAppealPopupId) * 31) + this.body.hashCode()) * 31) + this.triangle.hashCode();
    }

    public String toString() {
        return "GiftAppealPopupImage(giftAppealPopupId=" + this.giftAppealPopupId + ", body=" + this.body + ", triangle=" + this.triangle + ')';
    }
}
