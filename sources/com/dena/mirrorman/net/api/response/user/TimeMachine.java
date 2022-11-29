package com.dena.mirrorman.net.api.response.user;

import jo.p;

/* loaded from: classes2.dex */
public final class TimeMachine {
    public static final int $stable = 0;
    private final double offset;
    private final double resetAt;
    private final double speed;

    public TimeMachine(double d10, double d11, double d12) {
        this.speed = d10;
        this.resetAt = d11;
        this.offset = d12;
    }

    public static /* synthetic */ TimeMachine copy$default(TimeMachine timeMachine, double d10, double d11, double d12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = timeMachine.speed;
        }
        double d13 = d10;
        if ((i10 & 2) != 0) {
            d11 = timeMachine.resetAt;
        }
        double d14 = d11;
        if ((i10 & 4) != 0) {
            d12 = timeMachine.offset;
        }
        return timeMachine.copy(d13, d14, d12);
    }

    public final double component1() {
        return this.speed;
    }

    public final double component2() {
        return this.resetAt;
    }

    public final double component3() {
        return this.offset;
    }

    public final TimeMachine copy(double d10, double d11, double d12) {
        return new TimeMachine(d10, d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimeMachine) {
            TimeMachine timeMachine = (TimeMachine) obj;
            return p.c(Double.valueOf(this.speed), Double.valueOf(timeMachine.speed)) && p.c(Double.valueOf(this.resetAt), Double.valueOf(timeMachine.resetAt)) && p.c(Double.valueOf(this.offset), Double.valueOf(timeMachine.offset));
        }
        return false;
    }

    public final long getLocalTime(long j10) {
        double d10 = this.resetAt;
        double d11 = 1000;
        return (long) (((j10 - (d10 * d11)) * this.speed) + ((d10 + this.offset) * d11));
    }

    public final double getOffset() {
        return this.offset;
    }

    public final double getResetAt() {
        return this.resetAt;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public int hashCode() {
        return (((Double.hashCode(this.speed) * 31) + Double.hashCode(this.resetAt)) * 31) + Double.hashCode(this.offset);
    }

    public String toString() {
        return "TimeMachine(speed=" + this.speed + ", resetAt=" + this.resetAt + ", offset=" + this.offset + ')';
    }
}
