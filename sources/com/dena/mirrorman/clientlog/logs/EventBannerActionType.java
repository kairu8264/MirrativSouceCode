package com.dena.mirrorman.clientlog.logs;

/* loaded from: classes2.dex */
public enum EventBannerActionType {
    EVENT_BANNER_IMP("event_banner.imp"),
    EVENT_BANNER_CLICK("event_banner.click"),
    AVATAR_ITEM_BANNER_CLICK("avatar_item_banner.click"),
    LIVE_VIEW_BACK("live_view.back");
    
    private final String rawValue;

    EventBannerActionType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
