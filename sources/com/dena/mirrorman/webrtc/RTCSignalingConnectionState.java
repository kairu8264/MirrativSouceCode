package com.dena.mirrorman.webrtc;

/* loaded from: classes3.dex */
public enum RTCSignalingConnectionState {
    CONNECTED("connected"),
    DISCONNECTED("disconnected"),
    FAILED("failed");
    
    private final String rawValue;

    RTCSignalingConnectionState(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
