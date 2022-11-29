package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class GroupShotParticipantTargetDetail {
    public static final int $stable = 0;
    private final String sort;
    private final int uu;

    public GroupShotParticipantTargetDetail(String str, int i10) {
        p.h(str, "sort");
        this.sort = str;
        this.uu = i10;
    }

    public static /* synthetic */ GroupShotParticipantTargetDetail copy$default(GroupShotParticipantTargetDetail groupShotParticipantTargetDetail, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = groupShotParticipantTargetDetail.sort;
        }
        if ((i11 & 2) != 0) {
            i10 = groupShotParticipantTargetDetail.uu;
        }
        return groupShotParticipantTargetDetail.copy(str, i10);
    }

    public final String component1() {
        return this.sort;
    }

    public final int component2() {
        return this.uu;
    }

    public final GroupShotParticipantTargetDetail copy(String str, int i10) {
        p.h(str, "sort");
        return new GroupShotParticipantTargetDetail(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GroupShotParticipantTargetDetail) {
            GroupShotParticipantTargetDetail groupShotParticipantTargetDetail = (GroupShotParticipantTargetDetail) obj;
            return p.c(this.sort, groupShotParticipantTargetDetail.sort) && this.uu == groupShotParticipantTargetDetail.uu;
        }
        return false;
    }

    public final String getSort() {
        return this.sort;
    }

    public final int getUu() {
        return this.uu;
    }

    public int hashCode() {
        return (this.sort.hashCode() * 31) + Integer.hashCode(this.uu);
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…   .create().toJson(this)");
        return s10;
    }

    public String toString() {
        return "GroupShotParticipantTargetDetail(sort=" + this.sort + ", uu=" + this.uu + ')';
    }
}
