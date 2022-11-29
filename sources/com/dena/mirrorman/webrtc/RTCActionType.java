package com.dena.mirrorman.webrtc;

/* loaded from: classes3.dex */
public enum RTCActionType {
    NEGOTIATE("rtc.negotiate"),
    SIGNALING_STATE("rtc.signaling_state"),
    SIGNALING_CONNECTION_STATE("rtc.signaling_connection_state"),
    SIGNALING_MESSAGE_ERROR("rtc.signaling_message_error"),
    ICE_CONNECTION_STATE("rtc.ice_connection_state"),
    ICE_GATHERING_STATE("rtc.ice_gathering_state");
    
    private final String rawValue;

    RTCActionType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
