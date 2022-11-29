package com.mirrativ.llstream.protocol.v1.topic;

import java.util.ArrayList;
import jo.h;

/* loaded from: classes4.dex */
public final class EventTopicBuilder implements EventTopic {
    public static final Companion Companion = new Companion(null);
    private static final String TOPIC_EVENT_HEALTH = TopicUtil.Companion.toString("v1", TopicConstant.EVENT_TYPE, TopicConstant.EVENT_TYPE_HEALTH);
    private EventName eventName;
    private EventType eventType;
    private StreamName streamName;
    private final ProtocolVersion version = ProtocolVersion.CURRENT;
    private final EventKey eventKey = EventKey.EVENT_TYPE;
    private String value = "";

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final String getTOPIC_EVENT_HEALTH() {
            return EventTopicBuilder.TOPIC_EVENT_HEALTH;
        }
    }

    public final EventTopicBuilder anyStream() {
        this.streamName = new ANYStreamName();
        return this;
    }

    public final EventTopicBuilder build() {
        EventType eventType = getEventType();
        if (eventType != null) {
            StreamName streamName = getStreamName();
            if (streamName != null) {
                EventName eventName = getEventName();
                if (eventName != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(getVersion().getValue());
                    arrayList.add(getEventKey().getValue());
                    arrayList.add(eventType.getValue());
                    arrayList.add(streamName.getValue());
                    arrayList.add(eventName.getValue());
                    this.value = TopicUtil.Companion.toString(arrayList);
                    return this;
                }
                throw new EventTopicBuilderException("eventName is nil");
            }
            throw new EventTopicBuilderException("streamName is nil");
        }
        throw new EventTopicBuilderException("eventType is nil");
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.EventTopic
    public EventKey getEventKey() {
        return this.eventKey;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.EventTopic
    public EventName getEventName() {
        return this.eventName;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.EventTopic
    public EventType getEventType() {
        return this.eventType;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.EventTopic
    public StreamName getStreamName() {
        return this.streamName;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.Topic
    public String getValue() {
        return this.value;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.EventTopic
    public ProtocolVersion getVersion() {
        return this.version;
    }

    public final EventTopicBuilder setEventName(EventName eventName) {
        this.eventName = eventName;
        return this;
    }

    public final EventTopicBuilder setEventType(EventType eventType) {
        this.eventType = eventType;
        return this;
    }

    public final EventTopicBuilder setStreamName(StreamName streamName) {
        this.streamName = streamName;
        return this;
    }
}
