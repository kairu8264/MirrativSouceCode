package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import ym.b;

/* loaded from: classes2.dex */
public final class EventFeverState {
    public static final int $stable = 0;
    private final long feverEndsAt;
    @b(BooleanTypeAdapter.class)
    private final boolean isFever;

    public EventFeverState(boolean z10, long j10) {
        this.isFever = z10;
        this.feverEndsAt = j10;
    }

    public static /* synthetic */ EventFeverState copy$default(EventFeverState eventFeverState, boolean z10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = eventFeverState.isFever;
        }
        if ((i10 & 2) != 0) {
            j10 = eventFeverState.feverEndsAt;
        }
        return eventFeverState.copy(z10, j10);
    }

    public final boolean component1() {
        return this.isFever;
    }

    public final long component2() {
        return this.feverEndsAt;
    }

    public final EventFeverState copy(boolean z10, long j10) {
        return new EventFeverState(z10, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventFeverState) {
            EventFeverState eventFeverState = (EventFeverState) obj;
            return this.isFever == eventFeverState.isFever && this.feverEndsAt == eventFeverState.feverEndsAt;
        }
        return false;
    }

    public final long getFeverEndsAt() {
        return this.feverEndsAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.isFever;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + Long.hashCode(this.feverEndsAt);
    }

    public final boolean isFever() {
        return this.isFever;
    }

    public String toString() {
        return "EventFeverState(isFever=" + this.isFever + ", feverEndsAt=" + this.feverEndsAt + ')';
    }
}
