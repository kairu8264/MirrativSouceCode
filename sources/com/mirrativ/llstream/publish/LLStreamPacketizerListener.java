package com.mirrativ.llstream.publish;

import com.mirrativ.llstream.protocol.v1.packet.Packet;
import com.mirrativ.llstream.protocol.v1.topic.StreamTopic;

/* loaded from: classes4.dex */
public interface LLStreamPacketizerListener {
    void onPacketize(LLStreamPacketizer lLStreamPacketizer, StreamTopic streamTopic, Packet packet);
}
