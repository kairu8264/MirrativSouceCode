package com.dena.mirrorman.clientlog.logs.detail;

import jo.h;
import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class CollabMatchingCancelTargetDetail {
    public static final int $stable = 0;
    private final int cancelType;
    private final Integer duration;

    public CollabMatchingCancelTargetDetail(int i10, Integer num) {
        this.cancelType = i10;
        this.duration = num;
    }

    public static /* synthetic */ CollabMatchingCancelTargetDetail copy$default(CollabMatchingCancelTargetDetail collabMatchingCancelTargetDetail, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = collabMatchingCancelTargetDetail.cancelType;
        }
        if ((i11 & 2) != 0) {
            num = collabMatchingCancelTargetDetail.duration;
        }
        return collabMatchingCancelTargetDetail.copy(i10, num);
    }

    public final int component1() {
        return this.cancelType;
    }

    public final Integer component2() {
        return this.duration;
    }

    public final CollabMatchingCancelTargetDetail copy(int i10, Integer num) {
        return new CollabMatchingCancelTargetDetail(i10, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CollabMatchingCancelTargetDetail) {
            CollabMatchingCancelTargetDetail collabMatchingCancelTargetDetail = (CollabMatchingCancelTargetDetail) obj;
            return this.cancelType == collabMatchingCancelTargetDetail.cancelType && p.c(this.duration, collabMatchingCancelTargetDetail.duration);
        }
        return false;
    }

    public final int getCancelType() {
        return this.cancelType;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.cancelType) * 31;
        Integer num = this.duration;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…   .create().toJson(this)");
        return s10;
    }

    public String toString() {
        return "CollabMatchingCancelTargetDetail(cancelType=" + this.cancelType + ", duration=" + this.duration + ')';
    }

    public /* synthetic */ CollabMatchingCancelTargetDetail(int i10, Integer num, int i11, h hVar) {
        this(i10, (i11 & 2) != 0 ? null : num);
    }
}
