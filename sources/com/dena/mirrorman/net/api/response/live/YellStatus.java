package com.dena.mirrorman.net.api.response.live;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class YellStatus {
    public static final int $stable = 0;
    private final YellStatusCondition currentState;
    private final String description;
    private final int level;
    private final int month;
    @c("next_condition_1")
    private final YellStatusCondition nextCondition1;
    @c("next_condition_2")
    private final YellStatusCondition nextCondition2;
    @c("next_condition_3")
    private final YellStatusCondition nextCondition3;
    private final int rank;

    public YellStatus(int i10, int i11, int i12, YellStatusCondition yellStatusCondition, YellStatusCondition yellStatusCondition2, YellStatusCondition yellStatusCondition3, YellStatusCondition yellStatusCondition4, String str) {
        p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
        this.month = i10;
        this.rank = i11;
        this.level = i12;
        this.currentState = yellStatusCondition;
        this.nextCondition1 = yellStatusCondition2;
        this.nextCondition2 = yellStatusCondition3;
        this.nextCondition3 = yellStatusCondition4;
        this.description = str;
    }

    public final int component1() {
        return this.month;
    }

    public final int component2() {
        return this.rank;
    }

    public final int component3() {
        return this.level;
    }

    public final YellStatusCondition component4() {
        return this.currentState;
    }

    public final YellStatusCondition component5() {
        return this.nextCondition1;
    }

    public final YellStatusCondition component6() {
        return this.nextCondition2;
    }

    public final YellStatusCondition component7() {
        return this.nextCondition3;
    }

    public final String component8() {
        return this.description;
    }

    public final YellStatus copy(int i10, int i11, int i12, YellStatusCondition yellStatusCondition, YellStatusCondition yellStatusCondition2, YellStatusCondition yellStatusCondition3, YellStatusCondition yellStatusCondition4, String str) {
        p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
        return new YellStatus(i10, i11, i12, yellStatusCondition, yellStatusCondition2, yellStatusCondition3, yellStatusCondition4, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YellStatus) {
            YellStatus yellStatus = (YellStatus) obj;
            return this.month == yellStatus.month && this.rank == yellStatus.rank && this.level == yellStatus.level && p.c(this.currentState, yellStatus.currentState) && p.c(this.nextCondition1, yellStatus.nextCondition1) && p.c(this.nextCondition2, yellStatus.nextCondition2) && p.c(this.nextCondition3, yellStatus.nextCondition3) && p.c(this.description, yellStatus.description);
        }
        return false;
    }

    public final YellStatusCondition getCurrentState() {
        return this.currentState;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getMonth() {
        return this.month;
    }

    public final YellStatusCondition getNextCondition1() {
        return this.nextCondition1;
    }

    public final YellStatusCondition getNextCondition2() {
        return this.nextCondition2;
    }

    public final YellStatusCondition getNextCondition3() {
        return this.nextCondition3;
    }

    public final int getRank() {
        return this.rank;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.month) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.level)) * 31;
        YellStatusCondition yellStatusCondition = this.currentState;
        int hashCode2 = (hashCode + (yellStatusCondition == null ? 0 : yellStatusCondition.hashCode())) * 31;
        YellStatusCondition yellStatusCondition2 = this.nextCondition1;
        int hashCode3 = (hashCode2 + (yellStatusCondition2 == null ? 0 : yellStatusCondition2.hashCode())) * 31;
        YellStatusCondition yellStatusCondition3 = this.nextCondition2;
        int hashCode4 = (hashCode3 + (yellStatusCondition3 == null ? 0 : yellStatusCondition3.hashCode())) * 31;
        YellStatusCondition yellStatusCondition4 = this.nextCondition3;
        return ((hashCode4 + (yellStatusCondition4 != null ? yellStatusCondition4.hashCode() : 0)) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "YellStatus(month=" + this.month + ", rank=" + this.rank + ", level=" + this.level + ", currentState=" + this.currentState + ", nextCondition1=" + this.nextCondition1 + ", nextCondition2=" + this.nextCondition2 + ", nextCondition3=" + this.nextCondition3 + ", description=" + this.description + ')';
    }
}
