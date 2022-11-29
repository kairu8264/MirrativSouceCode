package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class LiveCatalogMirrativQ {
    public static final int $stable = 8;
    private String imageUrl;
    @b(BooleanTypeAdapter.class)
    private boolean isFollowing;
    private String shareText;
    private String url;
    private String userId;

    public LiveCatalogMirrativQ() {
        this(false, null, null, null, null, 31, null);
    }

    public LiveCatalogMirrativQ(boolean z10, String str, String str2, String str3, String str4) {
        p.h(str, "url");
        p.h(str2, "userId");
        p.h(str3, "shareText");
        p.h(str4, "imageUrl");
        this.isFollowing = z10;
        this.url = str;
        this.userId = str2;
        this.shareText = str3;
        this.imageUrl = str4;
    }

    public static /* synthetic */ LiveCatalogMirrativQ copy$default(LiveCatalogMirrativQ liveCatalogMirrativQ, boolean z10, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = liveCatalogMirrativQ.isFollowing;
        }
        if ((i10 & 2) != 0) {
            str = liveCatalogMirrativQ.url;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = liveCatalogMirrativQ.userId;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = liveCatalogMirrativQ.shareText;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = liveCatalogMirrativQ.imageUrl;
        }
        return liveCatalogMirrativQ.copy(z10, str5, str6, str7, str4);
    }

    public final boolean component1() {
        return this.isFollowing;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.shareText;
    }

    public final String component5() {
        return this.imageUrl;
    }

    public final LiveCatalogMirrativQ copy(boolean z10, String str, String str2, String str3, String str4) {
        p.h(str, "url");
        p.h(str2, "userId");
        p.h(str3, "shareText");
        p.h(str4, "imageUrl");
        return new LiveCatalogMirrativQ(z10, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveCatalogMirrativQ) {
            LiveCatalogMirrativQ liveCatalogMirrativQ = (LiveCatalogMirrativQ) obj;
            return this.isFollowing == liveCatalogMirrativQ.isFollowing && p.c(this.url, liveCatalogMirrativQ.url) && p.c(this.userId, liveCatalogMirrativQ.userId) && p.c(this.shareText, liveCatalogMirrativQ.shareText) && p.c(this.imageUrl, liveCatalogMirrativQ.imageUrl);
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z10 = this.isFollowing;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((((((r02 * 31) + this.url.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.shareText.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public final boolean isFollowing() {
        return this.isFollowing;
    }

    public final void setFollowing(boolean z10) {
        this.isFollowing = z10;
    }

    public final void setImageUrl(String str) {
        p.h(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setShareText(String str) {
        p.h(str, "<set-?>");
        this.shareText = str;
    }

    public final void setUrl(String str) {
        p.h(str, "<set-?>");
        this.url = str;
    }

    public final void setUserId(String str) {
        p.h(str, "<set-?>");
        this.userId = str;
    }

    public String toString() {
        return "LiveCatalogMirrativQ(isFollowing=" + this.isFollowing + ", url=" + this.url + ", userId=" + this.userId + ", shareText=" + this.shareText + ", imageUrl=" + this.imageUrl + ')';
    }

    public /* synthetic */ LiveCatalogMirrativQ(boolean z10, String str, String str2, String str3, String str4, int i10, h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) == 0 ? str4 : "");
    }
}
