package com.dena.mirrorman.clientlog.logs;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class ContinuousLiveHolidayPurchasePopupLog {
    public static final int $stable = 0;
    private final int currentContinuousLiveHoliday;
    private final int currentContinuousRecord;
    private final int isPurchaseEnabled;
    private final String notEnabledReason;

    public ContinuousLiveHolidayPurchasePopupLog(int i10, int i11, int i12, String str) {
        p.h(str, "notEnabledReason");
        this.isPurchaseEnabled = i10;
        this.currentContinuousLiveHoliday = i11;
        this.currentContinuousRecord = i12;
        this.notEnabledReason = str;
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…e()\n        .toJson(this)");
        return s10;
    }
}
