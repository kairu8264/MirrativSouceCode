package com.mirrativ.llstream.protocol.v1.topic;

/* loaded from: classes4.dex */
public enum EventKey {
    EVENT_TYPE(TopicConstant.EVENT_TYPE);
    
    private final String value;

    EventKey(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
