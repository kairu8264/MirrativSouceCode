package com.mirrativ.llstream.protocol.v1.topic;

/* loaded from: classes4.dex */
public interface StreamTopic extends Topic {
    Extend getExtend();

    PacketType getPacketType();

    StreamName getStreamName();

    StreamType getStreamType();

    ProtocolVersion getVersion();
}
