package com.dena.mirrorman.clientlog.logs;

import jo.p;

/* loaded from: classes2.dex */
public final class DurationFromPlayStartLog extends ActionLogBase {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DurationFromPlayStartLog(ResponseTimeLogTargetType responseTimeLogTargetType, int i10, long j10, long j11) {
        super("response_time", responseTimeLogTargetType.getRawValue(), String.valueOf(i10));
        p.h(responseTimeLogTargetType, ActionLogBase.TARGET_TYPE);
        this.payload.put("duration", String.valueOf(j10));
        this.payload.put("view_duration", String.valueOf(j11));
    }
}
