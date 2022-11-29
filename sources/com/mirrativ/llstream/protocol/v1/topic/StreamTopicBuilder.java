package com.mirrativ.llstream.protocol.v1.topic;

import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import so.c;
import wn.s;

/* loaded from: classes4.dex */
public final class StreamTopicBuilder implements StreamTopic, Cloneable {
    public static final Companion Companion = new Companion(null);
    private static final List<String> digits;
    private static final int factor;
    private boolean anyStream;
    private Extend extend;
    private PacketType packetType;
    private StreamName streamName;
    private final ProtocolVersion version = ProtocolVersion.CURRENT;
    private final StreamType streamType = StreamType.STREAM_TYPE;
    private String value = "";

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final List<String> getDigits() {
            return StreamTopicBuilder.digits;
        }

        /* renamed from: getFactor-pVg5ArA  reason: not valid java name */
        public final int m29getFactorpVg5ArA() {
            return StreamTopicBuilder.factor;
        }
    }

    static {
        ArrayList arrayList = new ArrayList("0123456789abcdefghijklmnopqrstuvwxyz".length());
        for (int i10 = 0; i10 < "0123456789abcdefghijklmnopqrstuvwxyz".length(); i10++) {
            arrayList.add(String.valueOf("0123456789abcdefghijklmnopqrstuvwxyz".charAt(i10)));
        }
        digits = arrayList;
        factor = 16;
    }

    /* renamed from: fnv1aHash-OGnWXxg  reason: not valid java name */
    private final int m28fnv1aHashOGnWXxg(String str) {
        byte[] bytes = str.getBytes(c.f52772b);
        p.g(bytes, "this as java.lang.String).getBytes(charset)");
        int i10 = -2128831035;
        for (byte b10 : bytes) {
            i10 = s.a(s.a(i10 ^ s.a(b10)) * 16777619);
        }
        return i10;
    }

    public final StreamTopic build() {
        String str;
        StreamName streamName = getStreamName();
        if (streamName != null) {
            if (getPacketType() != null) {
                if (this.anyStream) {
                    str = TopicConstant.MATCH_SINGLE;
                } else {
                    str = digits.get(Integer.remainderUnsigned(m28fnv1aHashOGnWXxg(streamName.getValue()), factor));
                }
                this.value = makeTopicString(str);
                return this;
            }
            throw new StreamTopicBuilderException("packetType is null");
        }
        throw new StreamTopicBuilderException("streamName is null");
    }

    public final List<StreamTopic> buildAnyStreamGroup() {
        if (getStreamName() != null) {
            if (getPacketType() != null) {
                setAnyStream();
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                int i11 = factor;
                if (i11 >= 0) {
                    while (true) {
                        Object clone = clone();
                        p.f(clone, "null cannot be cast to non-null type com.mirrativ.llstream.protocol.v1.topic.StreamTopicBuilder");
                        StreamTopicBuilder streamTopicBuilder = (StreamTopicBuilder) clone;
                        streamTopicBuilder.value = streamTopicBuilder.makeTopicString(digits.get(Integer.remainderUnsigned(s.a(i10), factor)));
                        arrayList.add(streamTopicBuilder);
                        if (i10 == i11) {
                            break;
                        }
                        i10++;
                    }
                }
                return arrayList;
            }
            throw new StreamTopicBuilderException("packetType is null");
        }
        throw new StreamTopicBuilderException("streamName is null");
    }

    public Object clone() {
        return super.clone();
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.StreamTopic
    public Extend getExtend() {
        return this.extend;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.StreamTopic
    public PacketType getPacketType() {
        return this.packetType;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.StreamTopic
    public StreamName getStreamName() {
        return this.streamName;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.StreamTopic
    public StreamType getStreamType() {
        return this.streamType;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.Topic
    public String getValue() {
        return this.value;
    }

    @Override // com.mirrativ.llstream.protocol.v1.topic.StreamTopic
    public ProtocolVersion getVersion() {
        return this.version;
    }

    public final String makeTopicString(String str) {
        p.h(str, "group");
        StreamName streamName = getStreamName();
        PacketType packetType = getPacketType();
        if (streamName == null || packetType == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(getVersion().getValue());
        arrayList.add(getStreamType().getValue());
        arrayList.add(str);
        arrayList.add(streamName.getValue());
        arrayList.add(packetType.getValue());
        Extend extend = getExtend();
        if (extend != null) {
            arrayList.add(extend.getValue());
        }
        return TopicUtil.Companion.toString(arrayList);
    }

    public final StreamTopicBuilder setAnyStream() {
        this.streamName = new ANYStreamName();
        this.anyStream = true;
        return this;
    }

    public final StreamTopicBuilder setExtend(Extend extend) {
        p.h(extend, "extend");
        this.extend = extend;
        return this;
    }

    public final StreamTopicBuilder setPacketType(PacketType packetType) {
        p.h(packetType, "packetType");
        this.packetType = packetType;
        return this;
    }

    public final StreamTopicBuilder setStreamName(String str) {
        p.h(str, "name");
        this.streamName = new StreamNameImpl(str);
        this.anyStream = false;
        return this;
    }
}
