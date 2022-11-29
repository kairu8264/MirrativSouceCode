package com.dena.mirrorman.net.api.response;

import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class ShareTwitterCard implements Serializable {
    public static final int $stable = 8;
    private String description;
    private String imageUrl;
    private String site;
    private String title;

    public ShareTwitterCard() {
        this(null, null, null, null, 15, null);
    }

    public ShareTwitterCard(String str, String str2, String str3, String str4) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "imageUrl");
        p.h(str4, "site");
        this.title = str;
        this.description = str2;
        this.imageUrl = str3;
        this.site = str4;
    }

    public static /* synthetic */ ShareTwitterCard copy$default(ShareTwitterCard shareTwitterCard, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shareTwitterCard.title;
        }
        if ((i10 & 2) != 0) {
            str2 = shareTwitterCard.description;
        }
        if ((i10 & 4) != 0) {
            str3 = shareTwitterCard.imageUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = shareTwitterCard.site;
        }
        return shareTwitterCard.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final String component4() {
        return this.site;
    }

    public final ShareTwitterCard copy(String str, String str2, String str3, String str4) {
        p.h(str, "title");
        p.h(str2, MRLog.PAYLOAD_KEY_DESCRIPTION);
        p.h(str3, "imageUrl");
        p.h(str4, "site");
        return new ShareTwitterCard(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShareTwitterCard) {
            ShareTwitterCard shareTwitterCard = (ShareTwitterCard) obj;
            return p.c(this.title, shareTwitterCard.title) && p.c(this.description, shareTwitterCard.description) && p.c(this.imageUrl, shareTwitterCard.imageUrl) && p.c(this.site, shareTwitterCard.site);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getSite() {
        return this.site;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.site.hashCode();
    }

    public final void setDescription(String str) {
        p.h(str, "<set-?>");
        this.description = str;
    }

    public final void setImageUrl(String str) {
        p.h(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setSite(String str) {
        p.h(str, "<set-?>");
        this.site = str;
    }

    public final void setTitle(String str) {
        p.h(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "ShareTwitterCard(title=" + this.title + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", site=" + this.site + ')';
    }

    public /* synthetic */ ShareTwitterCard(String str, String str2, String str3, String str4, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
