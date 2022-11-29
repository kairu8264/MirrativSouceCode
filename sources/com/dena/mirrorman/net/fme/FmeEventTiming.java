package com.dena.mirrorman.net.fme;

import java.util.Arrays;
import jo.p;

/* loaded from: classes2.dex */
public final class FmeEventTiming {
    public static final int $stable = 8;
    private final byte[] eventData;
    private final int eventMillis;
    private final EventType eventType;
    private final int size;

    public FmeEventTiming(int i10, int i11, EventType eventType, byte[] bArr) {
        p.h(eventType, "eventType");
        p.h(bArr, "eventData");
        this.eventMillis = i10;
        this.size = i11;
        this.eventType = eventType;
        this.eventData = bArr;
    }

    public static /* synthetic */ FmeEventTiming copy$default(FmeEventTiming fmeEventTiming, int i10, int i11, EventType eventType, byte[] bArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = fmeEventTiming.eventMillis;
        }
        if ((i12 & 2) != 0) {
            i11 = fmeEventTiming.size;
        }
        if ((i12 & 4) != 0) {
            eventType = fmeEventTiming.eventType;
        }
        if ((i12 & 8) != 0) {
            bArr = fmeEventTiming.eventData;
        }
        return fmeEventTiming.copy(i10, i11, eventType, bArr);
    }

    public final int component1() {
        return this.eventMillis;
    }

    public final int component2() {
        return this.size;
    }

    public final EventType component3() {
        return this.eventType;
    }

    public final byte[] component4() {
        return this.eventData;
    }

    public final FmeEventTiming copy(int i10, int i11, EventType eventType, byte[] bArr) {
        p.h(eventType, "eventType");
        p.h(bArr, "eventData");
        return new FmeEventTiming(i10, i11, eventType, bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FmeEventTiming) {
            FmeEventTiming fmeEventTiming = (FmeEventTiming) obj;
            return this.eventMillis == fmeEventTiming.eventMillis && this.size == fmeEventTiming.size && this.eventType == fmeEventTiming.eventType && p.c(this.eventData, fmeEventTiming.eventData);
        }
        return false;
    }

    public final byte[] getEventData() {
        return this.eventData;
    }

    public final int getEventMillis() {
        return this.eventMillis;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.eventMillis) * 31) + Integer.hashCode(this.size)) * 31) + this.eventType.hashCode()) * 31) + Arrays.hashCode(this.eventData);
    }

    public String toString() {
        return "FmeEventTiming(eventMillis=" + this.eventMillis + ", size=" + this.size + ", eventType=" + this.eventType + ", eventData=" + Arrays.toString(this.eventData) + ')';
    }
}
