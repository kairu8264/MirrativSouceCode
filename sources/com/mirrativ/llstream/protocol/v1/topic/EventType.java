package com.mirrativ.llstream.protocol.v1.topic;

/* loaded from: classes4.dex */
public enum EventType {
    STREAM("stream"),
    OPERATION(TopicConstant.EVENT_TYPE_OPERATION);
    
    private final String value;

    EventType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
