package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class CurrentUserGiftRankTargetDetail {
    public static final int $stable = 0;
    private final int eventId;
    private final boolean isAppEvent;
    private final int rank;
    private final int value;

    public CurrentUserGiftRankTargetDetail(boolean z10, int i10, int i11, int i12) {
        this.isAppEvent = z10;
        this.eventId = i10;
        this.rank = i11;
        this.value = i12;
    }

    public static /* synthetic */ CurrentUserGiftRankTargetDetail copy$default(CurrentUserGiftRankTargetDetail currentUserGiftRankTargetDetail, boolean z10, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = currentUserGiftRankTargetDetail.isAppEvent;
        }
        if ((i13 & 2) != 0) {
            i10 = currentUserGiftRankTargetDetail.eventId;
        }
        if ((i13 & 4) != 0) {
            i11 = currentUserGiftRankTargetDetail.rank;
        }
        if ((i13 & 8) != 0) {
            i12 = currentUserGiftRankTargetDetail.value;
        }
        return currentUserGiftRankTargetDetail.copy(z10, i10, i11, i12);
    }

    public final boolean component1() {
        return this.isAppEvent;
    }

    public final int component2() {
        return this.eventId;
    }

    public final int component3() {
        return this.rank;
    }

    public final int component4() {
        return this.value;
    }

    public final CurrentUserGiftRankTargetDetail copy(boolean z10, int i10, int i11, int i12) {
        return new CurrentUserGiftRankTargetDetail(z10, i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CurrentUserGiftRankTargetDetail) {
            CurrentUserGiftRankTargetDetail currentUserGiftRankTargetDetail = (CurrentUserGiftRankTargetDetail) obj;
            return this.isAppEvent == currentUserGiftRankTargetDetail.isAppEvent && this.eventId == currentUserGiftRankTargetDetail.eventId && this.rank == currentUserGiftRankTargetDetail.rank && this.value == currentUserGiftRankTargetDetail.value;
        }
        return false;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z10 = this.isAppEvent;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (((((r02 * 31) + Integer.hashCode(this.eventId)) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.value);
    }

    public final boolean isAppEvent() {
        return this.isAppEvent;
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…   .create().toJson(this)");
        return s10;
    }

    public String toString() {
        return "CurrentUserGiftRankTargetDetail(isAppEvent=" + this.isAppEvent + ", eventId=" + this.eventId + ", rank=" + this.rank + ", value=" + this.value + ')';
    }
}
