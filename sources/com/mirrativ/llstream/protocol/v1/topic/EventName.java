package com.mirrativ.llstream.protocol.v1.topic;

/* loaded from: classes4.dex */
public enum EventName {
    STREAM_EVENT_PUBLISH(TopicConstant.STREAM_EVENT_PUBLISH),
    STREAM_EVENT_UNPUBLISH(TopicConstant.STREAM_EVENT_UNPUBLISH);
    
    private final String value;

    EventName(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
