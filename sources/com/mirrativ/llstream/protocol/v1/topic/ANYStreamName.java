package com.mirrativ.llstream.protocol.v1.topic;

/* loaded from: classes4.dex */
public final class ANYStreamName implements StreamName {
    private final String value = TopicConstant.MATCH_SINGLE;
    private final String raw = TopicConstant.MATCH_SINGLE;

    @Override // com.mirrativ.llstream.protocol.v1.topic.StreamName
    public String getRaw() {
        return this.raw;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.StreamName
    public String getValue() {
        return this.value;
    }
}
