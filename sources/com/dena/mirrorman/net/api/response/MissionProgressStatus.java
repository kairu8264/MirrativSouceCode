package com.dena.mirrorman.net.api.response;

/* loaded from: classes2.dex */
public final class MissionProgressStatus {
    public static final int $stable = 0;
    private final int current;
    private final int max;

    public MissionProgressStatus(int i10, int i11) {
        this.current = i10;
        this.max = i11;
    }

    public static /* synthetic */ MissionProgressStatus copy$default(MissionProgressStatus missionProgressStatus, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = missionProgressStatus.current;
        }
        if ((i12 & 2) != 0) {
            i11 = missionProgressStatus.max;
        }
        return missionProgressStatus.copy(i10, i11);
    }

    public final int component1() {
        return this.current;
    }

    public final int component2() {
        return this.max;
    }

    public final MissionProgressStatus copy(int i10, int i11) {
        return new MissionProgressStatus(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MissionProgressStatus) {
            MissionProgressStatus missionProgressStatus = (MissionProgressStatus) obj;
            return this.current == missionProgressStatus.current && this.max == missionProgressStatus.max;
        }
        return false;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getMax() {
        return this.max;
    }

    public int hashCode() {
        return (Integer.hashCode(this.current) * 31) + Integer.hashCode(this.max);
    }

    public String toString() {
        return "MissionProgressStatus(current=" + this.current + ", max=" + this.max + ')';
    }
}
