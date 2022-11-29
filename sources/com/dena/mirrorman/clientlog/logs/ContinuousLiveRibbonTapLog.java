package com.dena.mirrorman.clientlog.logs;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class ContinuousLiveRibbonTapLog {
    public static final int $stable = 0;
    private final int currentContinuousLiveHoliday;
    private final int currentContinuousRecord;

    public ContinuousLiveRibbonTapLog(int i10, int i11) {
        this.currentContinuousLiveHoliday = i10;
        this.currentContinuousRecord = i11;
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…e()\n        .toJson(this)");
        return s10;
    }
}
