package com.mirrativ.llstream.protocol.v1.packet;

import androidx.appcompat.widget.ActivityChooserModel;
import com.mirrativ.llstream.protocol.v1.tag.Tag;
import com.mirrativ.llstream.protocol.v1.tag.TagRandomValue;
import com.mirrativ.llstream.protocol.v1.time.PacketTime;
import com.mirrativ.llstream.protocol.v1.topic.EventTopic;
import com.mirrativ.llstream.protocol.v1.topic.Topic;
import java.nio.ByteBuffer;
import java.util.Iterator;
import jo.p;
import po.n;
import xn.o;

/* loaded from: classes4.dex */
public final class Packet {
    private ByteBuffer buf;
    private Topic topic;

    public Packet(ByteBuffer byteBuffer) {
        p.h(byteBuffer, "buf");
        this.buf = byteBuffer;
    }

    public final ByteBuffer getBuf() {
        return this.buf;
    }

    public final byte[] getBytes() {
        byte[] array = this.buf.array();
        p.g(array, "buf.array()");
        return o.X(array, n.t(0, this.buf.position()));
    }

    public final Topic getTopic() {
        return this.topic;
    }

    public final void setBuf(ByteBuffer byteBuffer) {
        p.h(byteBuffer, "<set-?>");
        this.buf = byteBuffer;
    }

    public final void setTopic(Topic topic) {
        this.topic = topic;
    }

    public final void write(PacketTime packetTime, Topic topic, Tag tag, byte[] bArr) {
        p.h(packetTime, ActivityChooserModel.ATTRIBUTE_TIME);
        p.h(topic, "topic");
        p.h(tag, "tag");
        p.h(bArr, "data");
        this.topic = topic;
        this.buf.clear();
        this.buf.put(PacketConstant.Companion.getSYNC_BYTE());
        writeTopic(topic);
        writeTag(tag);
        writeTime(packetTime);
        this.buf.put(bArr);
    }

    public final void writeTag(Tag tag) {
        p.h(tag, "tag");
        TagRandomValue rand = tag.getRand();
        this.buf.put(tag.getCategory().getValue());
        this.buf.put(tag.getSystem().getValue());
        this.buf.putShort(rand.getValue());
    }

    public final void writeTime(PacketTime packetTime) {
        p.h(packetTime, "packetTime");
        this.buf.putLong(packetTime.getTime());
    }

    public final void writeTimeMilli(PacketTime packetTime) {
        p.h(packetTime, "packetTime");
        long j10 = 1000;
        this.buf.putLong((packetTime.getTime() / j10) / j10);
    }

    public final void writeTopic(Topic topic) {
        TopicPacket next;
        p.h(topic, "topic");
        String value = topic.getValue();
        Iterator<TopicPacket> it = PacketConstant.Companion.getTopicPacketPair().iterator();
        do {
            if (!it.hasNext()) {
                if ((topic instanceof EventTopic ? (EventTopic) topic : null) != null) {
                    this.buf.put(PacketConstant.Companion.getTopicBytesPlain_PTIME());
                    return;
                }
                throw new PacketException("packet write error");
            }
            next = it.next();
        } while (!so.n.p(value, next.getSuffix(), false, 2, null));
        this.buf.put(next.getData());
    }
}
