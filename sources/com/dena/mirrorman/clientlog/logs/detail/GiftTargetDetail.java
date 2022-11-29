package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class GiftTargetDetail {
    public static final int $stable = 8;
    private String collabStreamerAc;
    private boolean shouldPlayAnimation;

    public GiftTargetDetail(String str, boolean z10) {
        this.collabStreamerAc = str;
        this.shouldPlayAnimation = z10;
    }

    public final String getCollabStreamerAc() {
        return this.collabStreamerAc;
    }

    public final boolean getShouldPlayAnimation() {
        return this.shouldPlayAnimation;
    }

    public final void setCollabStreamerAc(String str) {
        this.collabStreamerAc = str;
    }

    public final void setShouldPlayAnimation(boolean z10) {
        this.shouldPlayAnimation = z10;
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…e()\n        .toJson(this)");
        return s10;
    }
}
