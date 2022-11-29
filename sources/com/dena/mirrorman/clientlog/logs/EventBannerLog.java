package com.dena.mirrorman.clientlog.logs;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class EventBannerLog extends ActionLogBase {
    public static final int $stable = 0;

    public /* synthetic */ EventBannerLog(EventBannerActionType eventBannerActionType, EventBannerTargetType eventBannerTargetType, String str, EventBannerWhere eventBannerWhere, String str2, String str3, int i10, h hVar) {
        this(eventBannerActionType, eventBannerTargetType, str, eventBannerWhere, str2, (i10 & 32) != 0 ? null : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventBannerLog(EventBannerActionType eventBannerActionType, EventBannerTargetType eventBannerTargetType, String str, EventBannerWhere eventBannerWhere, String str2, String str3) {
        super(eventBannerActionType.getRawValue(), eventBannerTargetType.getRawValue(), str);
        p.h(eventBannerActionType, "actionType");
        p.h(eventBannerTargetType, "targetType");
        p.h(str, "targetId");
        p.h(eventBannerWhere, MRLog.PAYLOAD_KEY_WHERE);
        this.payload.put(MRLog.PAYLOAD_KEY_WHERE, eventBannerWhere.getRawValue());
        if (str2 != null) {
            this.payload.put(MRLog.PAYLOAD_KEY_LIVE_ID, str2);
        }
        if (str3 != null) {
            this.payload.put(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str3);
        }
    }
}
