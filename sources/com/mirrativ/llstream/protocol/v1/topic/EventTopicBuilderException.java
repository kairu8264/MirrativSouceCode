package com.mirrativ.llstream.protocol.v1.topic;

import jo.p;

/* loaded from: classes4.dex */
public final class EventTopicBuilderException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventTopicBuilderException(String str) {
        super(str);
        p.h(str, "message");
    }
}
