package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class GiftboxGachaResponse {
    public static final int $stable = 8;
    private final String iconUrl;
    private final Status status;
    private final String title;

    public GiftboxGachaResponse(String str, String str2, Status status) {
        p.h(str, "title");
        p.h(str2, "iconUrl");
        p.h(status, "status");
        this.title = str;
        this.iconUrl = str2;
        this.status = status;
    }

    public static /* synthetic */ GiftboxGachaResponse copy$default(GiftboxGachaResponse giftboxGachaResponse, String str, String str2, Status status, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = giftboxGachaResponse.title;
        }
        if ((i10 & 2) != 0) {
            str2 = giftboxGachaResponse.iconUrl;
        }
        if ((i10 & 4) != 0) {
            status = giftboxGachaResponse.status;
        }
        return giftboxGachaResponse.copy(str, str2, status);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.iconUrl;
    }

    public final Status component3() {
        return this.status;
    }

    public final GiftboxGachaResponse copy(String str, String str2, Status status) {
        p.h(str, "title");
        p.h(str2, "iconUrl");
        p.h(status, "status");
        return new GiftboxGachaResponse(str, str2, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftboxGachaResponse) {
            GiftboxGachaResponse giftboxGachaResponse = (GiftboxGachaResponse) obj;
            return p.c(this.title, giftboxGachaResponse.title) && p.c(this.iconUrl, giftboxGachaResponse.iconUrl) && p.c(this.status, giftboxGachaResponse.status);
        }
        return false;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "GiftboxGachaResponse(title=" + this.title + ", iconUrl=" + this.iconUrl + ", status=" + this.status + ')';
    }
}
