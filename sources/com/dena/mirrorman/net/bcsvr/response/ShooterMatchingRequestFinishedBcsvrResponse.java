package com.dena.mirrorman.net.bcsvr.response;

/* loaded from: classes2.dex */
public final class ShooterMatchingRequestFinishedBcsvrResponse {
    public static final int $stable = 0;
    private final long time;

    public ShooterMatchingRequestFinishedBcsvrResponse(long j10) {
        this.time = j10;
    }

    public static /* synthetic */ ShooterMatchingRequestFinishedBcsvrResponse copy$default(ShooterMatchingRequestFinishedBcsvrResponse shooterMatchingRequestFinishedBcsvrResponse, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = shooterMatchingRequestFinishedBcsvrResponse.time;
        }
        return shooterMatchingRequestFinishedBcsvrResponse.copy(j10);
    }

    public final long component1() {
        return this.time;
    }

    public final ShooterMatchingRequestFinishedBcsvrResponse copy(long j10) {
        return new ShooterMatchingRequestFinishedBcsvrResponse(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShooterMatchingRequestFinishedBcsvrResponse) && this.time == ((ShooterMatchingRequestFinishedBcsvrResponse) obj).time;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time);
    }

    public String toString() {
        return "ShooterMatchingRequestFinishedBcsvrResponse(time=" + this.time + ')';
    }
}
