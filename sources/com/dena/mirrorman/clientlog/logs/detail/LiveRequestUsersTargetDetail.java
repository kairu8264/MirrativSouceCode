package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class LiveRequestUsersTargetDetail {
    public static final int $stable = 0;
    private final String impNotFollowUserNum;
    private final String impUserNum;

    public LiveRequestUsersTargetDetail(String str, String str2) {
        p.h(str, "impUserNum");
        p.h(str2, "impNotFollowUserNum");
        this.impUserNum = str;
        this.impNotFollowUserNum = str2;
    }

    public static /* synthetic */ LiveRequestUsersTargetDetail copy$default(LiveRequestUsersTargetDetail liveRequestUsersTargetDetail, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveRequestUsersTargetDetail.impUserNum;
        }
        if ((i10 & 2) != 0) {
            str2 = liveRequestUsersTargetDetail.impNotFollowUserNum;
        }
        return liveRequestUsersTargetDetail.copy(str, str2);
    }

    public final String component1() {
        return this.impUserNum;
    }

    public final String component2() {
        return this.impNotFollowUserNum;
    }

    public final LiveRequestUsersTargetDetail copy(String str, String str2) {
        p.h(str, "impUserNum");
        p.h(str2, "impNotFollowUserNum");
        return new LiveRequestUsersTargetDetail(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveRequestUsersTargetDetail) {
            LiveRequestUsersTargetDetail liveRequestUsersTargetDetail = (LiveRequestUsersTargetDetail) obj;
            return p.c(this.impUserNum, liveRequestUsersTargetDetail.impUserNum) && p.c(this.impNotFollowUserNum, liveRequestUsersTargetDetail.impNotFollowUserNum);
        }
        return false;
    }

    public final String getImpNotFollowUserNum() {
        return this.impNotFollowUserNum;
    }

    public final String getImpUserNum() {
        return this.impUserNum;
    }

    public int hashCode() {
        return (this.impUserNum.hashCode() * 31) + this.impNotFollowUserNum.hashCode();
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…   .create().toJson(this)");
        return s10;
    }

    public String toString() {
        return "LiveRequestUsersTargetDetail(impUserNum=" + this.impUserNum + ", impNotFollowUserNum=" + this.impNotFollowUserNum + ')';
    }
}
