package com.dena.mirrorman.clientlog.logs;

/* loaded from: classes2.dex */
public enum BulkSendLogActionType {
    POST_THANKS_AT_SAME_TIME_BTN_TAP("post_thanks_at_same_time_btn_tap"),
    CHAT_POST_THANKS_AT_SAME_TIME("chat.post_thanks_at_same_time");
    
    private final String rawValue;

    BulkSendLogActionType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
