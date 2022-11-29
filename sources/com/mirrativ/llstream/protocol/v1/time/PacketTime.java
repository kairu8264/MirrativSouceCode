package com.mirrativ.llstream.protocol.v1.time;

import com.mirrativ.llstream.decoder.a;
import java.time.Instant;
import jo.h;
import jo.p;

/* loaded from: classes4.dex */
public final class PacketTime {
    public static final Companion Companion = new Companion(null);
    private final long millisec;
    private final long relativeCounter;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final PacketTime from(Instant instant) {
            p.h(instant, "from");
            return from(TimeContext.Companion.getShared(), instant);
        }

        public final PacketTime now() {
            return now(TimeContext.Companion.getShared());
        }

        public final PacketTime from(TimeContext timeContext, Instant instant) {
            p.h(timeContext, "ctx");
            p.h(instant, "from");
            return new PacketTime(instant.toEpochMilli(), timeContext.getCounter().get());
        }

        public final PacketTime now(TimeContext timeContext) {
            p.h(timeContext, "ctx");
            return new PacketTime(Instant.now().toEpochMilli(), timeContext.incrementAndGet());
        }
    }

    public PacketTime(long j10, long j11) {
        this.millisec = j10;
        this.relativeCounter = j11;
    }

    public static /* synthetic */ PacketTime copy$default(PacketTime packetTime, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = packetTime.millisec;
        }
        if ((i10 & 2) != 0) {
            j11 = packetTime.relativeCounter;
        }
        return packetTime.copy(j10, j11);
    }

    public final long component1() {
        return this.millisec;
    }

    public final long component2() {
        return this.relativeCounter;
    }

    public final PacketTime copy(long j10, long j11) {
        return new PacketTime(j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PacketTime) {
            PacketTime packetTime = (PacketTime) obj;
            return this.millisec == packetTime.millisec && this.relativeCounter == packetTime.relativeCounter;
        }
        return false;
    }

    public final long getMillisec() {
        return this.millisec;
    }

    public final long getRelativeCounter() {
        return this.relativeCounter;
    }

    public final long getTime() {
        long j10 = 1000000;
        return (this.relativeCounter % j10) + (this.millisec * j10);
    }

    public int hashCode() {
        return Long.hashCode(this.relativeCounter) + (Long.hashCode(this.millisec) * 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("PacketTime(millisec=");
        a10.append(this.millisec);
        a10.append(", relativeCounter=");
        a10.append(this.relativeCounter);
        a10.append(')');
        return a10.toString();
    }
}
