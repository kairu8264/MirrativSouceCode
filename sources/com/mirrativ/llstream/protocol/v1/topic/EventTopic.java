package com.mirrativ.llstream.protocol.v1.topic;

/* loaded from: classes4.dex */
public interface EventTopic extends Topic {
    EventKey getEventKey();

    EventName getEventName();

    EventType getEventType();

    StreamName getStreamName();

    ProtocolVersion getVersion();
}
