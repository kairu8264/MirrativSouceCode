package com.dena.mirrorman.clientlog.logs;

/* loaded from: classes2.dex */
public enum ResponseTimeLogTargetType {
    LLSTREAM_PLAYER("llstreamPlayer"),
    RTMP_PLAYER("rtmpPlayer"),
    HLS_PLAYER("hlsPlayer");
    
    private final String rawValue;

    ResponseTimeLogTargetType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
