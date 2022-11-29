package com.dena.mirrorman.net.api.response;

import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftPanelBanner implements Serializable {
    public static final int $stable = 0;
    private final String description;
    private final int endsAt;
    private final String eventPageUrl;
    private final String imageUrl;
    private final String title;
    private final int type;
    private final String url;

    public GiftPanelBanner(int i10, String str, String str2, int i11, String str3, String str4, String str5) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "url");
        p.h(str4, "eventPageUrl");
        p.h(str5, "imageUrl");
        this.type = i10;
        this.title = str;
        this.description = str2;
        this.endsAt = i11;
        this.url = str3;
        this.eventPageUrl = str4;
        this.imageUrl = str5;
    }

    public static /* synthetic */ GiftPanelBanner copy$default(GiftPanelBanner giftPanelBanner, int i10, String str, String str2, int i11, String str3, String str4, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = giftPanelBanner.type;
        }
        if ((i12 & 2) != 0) {
            str = giftPanelBanner.title;
        }
        String str6 = str;
        if ((i12 & 4) != 0) {
            str2 = giftPanelBanner.description;
        }
        String str7 = str2;
        if ((i12 & 8) != 0) {
            i11 = giftPanelBanner.endsAt;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            str3 = giftPanelBanner.url;
        }
        String str8 = str3;
        if ((i12 & 32) != 0) {
            str4 = giftPanelBanner.eventPageUrl;
        }
        String str9 = str4;
        if ((i12 & 64) != 0) {
            str5 = giftPanelBanner.imageUrl;
        }
        return giftPanelBanner.copy(i10, str6, str7, i13, str8, str9, str5);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final int component4() {
        return this.endsAt;
    }

    public final String component5() {
        return this.url;
    }

    public final String component6() {
        return this.eventPageUrl;
    }

    public final String component7() {
        return this.imageUrl;
    }

    public final GiftPanelBanner copy(int i10, String str, String str2, int i11, String str3, String str4, String str5) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "url");
        p.h(str4, "eventPageUrl");
        p.h(str5, "imageUrl");
        return new GiftPanelBanner(i10, str, str2, i11, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftPanelBanner) {
            GiftPanelBanner giftPanelBanner = (GiftPanelBanner) obj;
            return this.type == giftPanelBanner.type && p.c(this.title, giftPanelBanner.title) && p.c(this.description, giftPanelBanner.description) && this.endsAt == giftPanelBanner.endsAt && p.c(this.url, giftPanelBanner.url) && p.c(this.eventPageUrl, giftPanelBanner.eventPageUrl) && p.c(this.imageUrl, giftPanelBanner.imageUrl);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getEndsAt() {
        return this.endsAt;
    }

    public final String getEventPageUrl() {
        return this.eventPageUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.type) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.endsAt)) * 31) + this.url.hashCode()) * 31) + this.eventPageUrl.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "GiftPanelBanner(type=" + this.type + ", title=" + this.title + ", description=" + this.description + ", endsAt=" + this.endsAt + ", url=" + this.url + ", eventPageUrl=" + this.eventPageUrl + ", imageUrl=" + this.imageUrl + ')';
    }
}
