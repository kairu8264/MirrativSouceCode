package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class GiftboxGachaTargetDetail {
    public static final int $stable = 0;
    private final int presentId;
    private final String presentName;

    public GiftboxGachaTargetDetail(int i10, String str) {
        p.h(str, "presentName");
        this.presentId = i10;
        this.presentName = str;
    }

    public static /* synthetic */ GiftboxGachaTargetDetail copy$default(GiftboxGachaTargetDetail giftboxGachaTargetDetail, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = giftboxGachaTargetDetail.presentId;
        }
        if ((i11 & 2) != 0) {
            str = giftboxGachaTargetDetail.presentName;
        }
        return giftboxGachaTargetDetail.copy(i10, str);
    }

    public final int component1() {
        return this.presentId;
    }

    public final String component2() {
        return this.presentName;
    }

    public final GiftboxGachaTargetDetail copy(int i10, String str) {
        p.h(str, "presentName");
        return new GiftboxGachaTargetDetail(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GiftboxGachaTargetDetail) {
            GiftboxGachaTargetDetail giftboxGachaTargetDetail = (GiftboxGachaTargetDetail) obj;
            return this.presentId == giftboxGachaTargetDetail.presentId && p.c(this.presentName, giftboxGachaTargetDetail.presentName);
        }
        return false;
    }

    public final int getPresentId() {
        return this.presentId;
    }

    public final String getPresentName() {
        return this.presentName;
    }

    public int hashCode() {
        return (Integer.hashCode(this.presentId) * 31) + this.presentName.hashCode();
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…e()\n        .toJson(this)");
        return s10;
    }

    public String toString() {
        return "GiftboxGachaTargetDetail(presentId=" + this.presentId + ", presentName=" + this.presentName + ')';
    }
}
