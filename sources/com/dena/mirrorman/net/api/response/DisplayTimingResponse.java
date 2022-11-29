package com.dena.mirrorman.net.api.response;

/* loaded from: classes2.dex */
public final class DisplayTimingResponse {
    public static final int $stable = 0;
    private final int liveStart;
    private final int next;
    private final int nonDisplay;

    public DisplayTimingResponse(int i10, int i11, int i12) {
        this.liveStart = i10;
        this.next = i11;
        this.nonDisplay = i12;
    }

    public static /* synthetic */ DisplayTimingResponse copy$default(DisplayTimingResponse displayTimingResponse, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = displayTimingResponse.liveStart;
        }
        if ((i13 & 2) != 0) {
            i11 = displayTimingResponse.next;
        }
        if ((i13 & 4) != 0) {
            i12 = displayTimingResponse.nonDisplay;
        }
        return displayTimingResponse.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.liveStart;
    }

    public final int component2() {
        return this.next;
    }

    public final int component3() {
        return this.nonDisplay;
    }

    public final DisplayTimingResponse copy(int i10, int i11, int i12) {
        return new DisplayTimingResponse(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DisplayTimingResponse) {
            DisplayTimingResponse displayTimingResponse = (DisplayTimingResponse) obj;
            return this.liveStart == displayTimingResponse.liveStart && this.next == displayTimingResponse.next && this.nonDisplay == displayTimingResponse.nonDisplay;
        }
        return false;
    }

    public final int getLiveStart() {
        return this.liveStart;
    }

    public final int getNext() {
        return this.next;
    }

    public final int getNonDisplay() {
        return this.nonDisplay;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.liveStart) * 31) + Integer.hashCode(this.next)) * 31) + Integer.hashCode(this.nonDisplay);
    }

    public String toString() {
        return "DisplayTimingResponse(liveStart=" + this.liveStart + ", next=" + this.next + ", nonDisplay=" + this.nonDisplay + ')';
    }
}
