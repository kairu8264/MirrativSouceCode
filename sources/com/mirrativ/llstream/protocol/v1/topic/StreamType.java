package com.mirrativ.llstream.protocol.v1.topic;

/* loaded from: classes4.dex */
public enum StreamType {
    STREAM_TYPE("s");
    
    private final String value;

    StreamType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
