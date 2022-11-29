package com.dena.mirrorman.net.bcsvr.response;

/* loaded from: classes2.dex */
public final class LiveGameInterruptibleBcsvrResponse {
    public static final int $stable = 0;
    private final boolean interruptible;
    private final long sentAt;

    public LiveGameInterruptibleBcsvrResponse(boolean z10, long j10) {
        this.interruptible = z10;
        this.sentAt = j10;
    }

    public static /* synthetic */ LiveGameInterruptibleBcsvrResponse copy$default(LiveGameInterruptibleBcsvrResponse liveGameInterruptibleBcsvrResponse, boolean z10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = liveGameInterruptibleBcsvrResponse.interruptible;
        }
        if ((i10 & 2) != 0) {
            j10 = liveGameInterruptibleBcsvrResponse.sentAt;
        }
        return liveGameInterruptibleBcsvrResponse.copy(z10, j10);
    }

    public final boolean component1() {
        return this.interruptible;
    }

    public final long component2() {
        return this.sentAt;
    }

    public final LiveGameInterruptibleBcsvrResponse copy(boolean z10, long j10) {
        return new LiveGameInterruptibleBcsvrResponse(z10, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameInterruptibleBcsvrResponse) {
            LiveGameInterruptibleBcsvrResponse liveGameInterruptibleBcsvrResponse = (LiveGameInterruptibleBcsvrResponse) obj;
            return this.interruptible == liveGameInterruptibleBcsvrResponse.interruptible && this.sentAt == liveGameInterruptibleBcsvrResponse.sentAt;
        }
        return false;
    }

    public final boolean getInterruptible() {
        return this.interruptible;
    }

    public final long getSentAt() {
        return this.sentAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.interruptible;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + Long.hashCode(this.sentAt);
    }

    public String toString() {
        return "LiveGameInterruptibleBcsvrResponse(interruptible=" + this.interruptible + ", sentAt=" + this.sentAt + ')';
    }
}
