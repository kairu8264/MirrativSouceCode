package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.e;
import ym.c;

/* loaded from: classes2.dex */
public final class InvitationBannerTargerDetail {
    public static final int $stable = 0;
    @c("image_url")
    private final String imageUrl;
    @c("link_url")
    private final String linkUrl;

    public InvitationBannerTargerDetail(String str, String str2) {
        p.h(str, "imageUrl");
        p.h(str2, "linkUrl");
        this.imageUrl = str;
        this.linkUrl = str2;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String toJson() {
        String s10 = new e().s(this);
        p.g(s10, "Gson().toJson(this)");
        return s10;
    }
}
