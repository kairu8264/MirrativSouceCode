package com.mirrativ.llstream.protocol.v1.topic;

import jo.p;

/* loaded from: classes4.dex */
public final class StreamNameImpl implements StreamName {

    /* renamed from: r  reason: collision with root package name */
    private final String f28252r;
    private final String raw;

    public StreamNameImpl(String str) {
        p.h(str, TopicConstant.EXTEND_AAC_RAW);
        this.f28252r = str;
        this.raw = str;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.StreamName
    public String getRaw() {
        return this.raw;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.StreamName
    public String getValue() {
        return '[' + getRaw() + ']';
    }
}
