package com.dena.mirrorman.clientlog.logs;

/* loaded from: classes2.dex */
public enum EventBannerTargetType {
    NONE(""),
    EVENT_TARGET_TYPE("event"),
    EVENT_RANKING_TARGET_TYPE("event_ranking");
    
    private final String rawValue;

    EventBannerTargetType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
