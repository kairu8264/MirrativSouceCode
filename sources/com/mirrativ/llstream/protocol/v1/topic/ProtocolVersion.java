package com.mirrativ.llstream.protocol.v1.topic;

/* loaded from: classes4.dex */
public enum ProtocolVersion {
    CURRENT("v1");
    
    private final String value;

    ProtocolVersion(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
