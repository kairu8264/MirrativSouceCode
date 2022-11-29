package com.dena.mirrorman.net.api.response;

import com.dena.mirrativ.mirrativapi.core.Status;
import jo.p;

/* loaded from: classes2.dex */
public final class MissionStatusResponse {
    public static final int $stable = 8;
    private final int completeMissionNum;
    private final int dailyUnreceivedMissionNum;
    private final boolean enableMission;
    private final Status status;
    private final int totalMissionNum;
    private final int unreceivedMissionNum;
    private final int weeklyUnreceivedMissionNum;

    public MissionStatusResponse(Status status, int i10, int i11, int i12, boolean z10, int i13, int i14) {
        p.h(status, "status");
        this.status = status;
        this.completeMissionNum = i10;
        this.totalMissionNum = i11;
        this.unreceivedMissionNum = i12;
        this.enableMission = z10;
        this.dailyUnreceivedMissionNum = i13;
        this.weeklyUnreceivedMissionNum = i14;
    }

    public static /* synthetic */ MissionStatusResponse copy$default(MissionStatusResponse missionStatusResponse, Status status, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            status = missionStatusResponse.status;
        }
        if ((i15 & 2) != 0) {
            i10 = missionStatusResponse.completeMissionNum;
        }
        int i16 = i10;
        if ((i15 & 4) != 0) {
            i11 = missionStatusResponse.totalMissionNum;
        }
        int i17 = i11;
        if ((i15 & 8) != 0) {
            i12 = missionStatusResponse.unreceivedMissionNum;
        }
        int i18 = i12;
        if ((i15 & 16) != 0) {
            z10 = missionStatusResponse.enableMission;
        }
        boolean z11 = z10;
        if ((i15 & 32) != 0) {
            i13 = missionStatusResponse.dailyUnreceivedMissionNum;
        }
        int i19 = i13;
        if ((i15 & 64) != 0) {
            i14 = missionStatusResponse.weeklyUnreceivedMissionNum;
        }
        return missionStatusResponse.copy(status, i16, i17, i18, z11, i19, i14);
    }

    public final Status component1() {
        return this.status;
    }

    public final int component2() {
        return this.completeMissionNum;
    }

    public final int component3() {
        return this.totalMissionNum;
    }

    public final int component4() {
        return this.unreceivedMissionNum;
    }

    public final boolean component5() {
        return this.enableMission;
    }

    public final int component6() {
        return this.dailyUnreceivedMissionNum;
    }

    public final int component7() {
        return this.weeklyUnreceivedMissionNum;
    }

    public final MissionStatusResponse copy(Status status, int i10, int i11, int i12, boolean z10, int i13, int i14) {
        p.h(status, "status");
        return new MissionStatusResponse(status, i10, i11, i12, z10, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MissionStatusResponse) {
            MissionStatusResponse missionStatusResponse = (MissionStatusResponse) obj;
            return p.c(this.status, missionStatusResponse.status) && this.completeMissionNum == missionStatusResponse.completeMissionNum && this.totalMissionNum == missionStatusResponse.totalMissionNum && this.unreceivedMissionNum == missionStatusResponse.unreceivedMissionNum && this.enableMission == missionStatusResponse.enableMission && this.dailyUnreceivedMissionNum == missionStatusResponse.dailyUnreceivedMissionNum && this.weeklyUnreceivedMissionNum == missionStatusResponse.weeklyUnreceivedMissionNum;
        }
        return false;
    }

    public final int getCompleteMissionNum() {
        return this.completeMissionNum;
    }

    public final int getDailyUnreceivedMissionNum() {
        return this.dailyUnreceivedMissionNum;
    }

    public final boolean getEnableMission() {
        return this.enableMission;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getTotalMissionNum() {
        return this.totalMissionNum;
    }

    public final int getUnreceivedMissionNum() {
        return this.unreceivedMissionNum;
    }

    public final int getWeeklyUnreceivedMissionNum() {
        return this.weeklyUnreceivedMissionNum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.status.hashCode() * 31) + Integer.hashCode(this.completeMissionNum)) * 31) + Integer.hashCode(this.totalMissionNum)) * 31) + Integer.hashCode(this.unreceivedMissionNum)) * 31;
        boolean z10 = this.enableMission;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((hashCode + i10) * 31) + Integer.hashCode(this.dailyUnreceivedMissionNum)) * 31) + Integer.hashCode(this.weeklyUnreceivedMissionNum);
    }

    public String toString() {
        return "MissionStatusResponse(status=" + this.status + ", completeMissionNum=" + this.completeMissionNum + ", totalMissionNum=" + this.totalMissionNum + ", unreceivedMissionNum=" + this.unreceivedMissionNum + ", enableMission=" + this.enableMission + ", dailyUnreceivedMissionNum=" + this.dailyUnreceivedMissionNum + ", weeklyUnreceivedMissionNum=" + this.weeklyUnreceivedMissionNum + ')';
    }
}
