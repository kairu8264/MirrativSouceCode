package com.dena.mirrorman.net.api.response;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftResultItem implements Serializable {
    public static final int $stable = 0;
    private final int count;

    /* renamed from: id  reason: collision with root package name */
    private final String f26152id;
    private final String largeImageUrl;
    private final String smallImageUrl;

    public GiftResultItem(String str, String str2, String str3, int i10) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "smallImageUrl");
        p.h(str3, "largeImageUrl");
        this.f26152id = str;
        this.smallImageUrl = str2;
        this.largeImageUrl = str3;
        this.count = i10;
    }

    public static /* synthetic */ GiftResultItem copy$default(GiftResultItem giftResultItem, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = giftResultItem.f26152id;
        }
        if ((i11 & 2) != 0) {
            str2 = giftResultItem.smallImageUrl;
        }
        if ((i11 & 4) != 0) {
            str3 = giftResultItem.largeImageUrl;
        }
        if ((i11 & 8) != 0) {
            i10 = giftResultItem.count;
        }
        return giftResultItem.copy(str, str2, str3, i10);
    }

    public final String component1() {
        return this.f26152id;
    }

    public final String component2() {
        return this.smallImageUrl;
    }

    public final String component3() {
        return this.largeImageUrl;
    }

    public final int component4() {
        return this.count;
    }

    public final GiftResultItem copy(String str, String str2, String str3, int i10) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "smallImageUrl");
        p.h(str3, "largeImageUrl");
        return new GiftResultItem(str, str2, str3, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftResultItem) {
            GiftResultItem giftResultItem = (GiftResultItem) obj;
            return p.c(this.f26152id, giftResultItem.f26152id) && p.c(this.smallImageUrl, giftResultItem.smallImageUrl) && p.c(this.largeImageUrl, giftResultItem.largeImageUrl) && this.count == giftResultItem.count;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getId() {
        return this.f26152id;
    }

    public final String getLargeImageUrl() {
        return this.largeImageUrl;
    }

    public final String getSmallImageUrl() {
        return this.smallImageUrl;
    }

    public int hashCode() {
        return (((((this.f26152id.hashCode() * 31) + this.smallImageUrl.hashCode()) * 31) + this.largeImageUrl.hashCode()) * 31) + Integer.hashCode(this.count);
    }

    public String toString() {
        return "GiftResultItem(id=" + this.f26152id + ", smallImageUrl=" + this.smallImageUrl + ", largeImageUrl=" + this.largeImageUrl + ", count=" + this.count + ')';
    }
}
