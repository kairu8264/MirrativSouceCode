package com.mirrativ.llstream.protocol.v1.packet;

import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import jo.h;
import jo.p;
import po.n;
import xn.o;

/* loaded from: classes4.dex */
public final class PacketReader {
    public static final Companion Companion = new Companion(null);
    public static final int PACKET_DATA_FIELD_POS = 17;
    public static final int PACKET_TIME_FIELD_POS = 9;
    public static final int PACKET_TIME_FIELD_SIZE = 8;
    public static final int PACKET_TOPIC_FIELD_POS = 2;
    public static final int PACKET_TOPIC_FIELD_SIZE = 3;

    /* renamed from: d  reason: collision with root package name */
    private final ByteBuffer f28251d;
    private final ByteBuffer data;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public PacketReader(ByteBuffer byteBuffer) {
        p.h(byteBuffer, "d");
        this.f28251d = byteBuffer;
        this.data = byteBuffer;
    }

    public final ByteBuffer getD() {
        return this.f28251d;
    }

    public final ZonedDateTime parseTime() {
        byte[] array = this.data.array();
        p.g(array, "data.array()");
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli((long) (((((float) ByteBuffer.wrap(o.X(array, n.t(9, 17))).getLong()) / 1000.0d) / 1000.0d) / 1000.0d)), ZoneId.systemDefault());
        p.g(ofInstant, "ofInstant(instant, zoneId)");
        return ofInstant;
    }

    public final ZonedDateTime parseTimeMilli() {
        byte[] array = this.data.array();
        p.g(array, "data.array()");
        ZonedDateTime ofInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(ByteBuffer.wrap(o.X(array, n.t(9, 17))).getLong()), ZoneId.systemDefault());
        p.g(ofInstant, "ofInstant(instant, zoneId)");
        return ofInstant;
    }
}
