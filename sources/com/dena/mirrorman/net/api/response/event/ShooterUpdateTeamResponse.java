package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.event.ShooterTeamStatus;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ShooterUpdateTeamResponse {
    public static final int $stable = 8;
    private final int groupId;
    private final int hostUserId;
    private final int invitedWaitInterval;
    private final int invitingWaitInterval;
    private final int seasonId;
    private final Status status;
    private final int teamId;
    @b(ShooterTeamStatus.TypeAdapter.class)
    private final ShooterTeamStatus teamStatus;
    private final int waitInterval;

    public ShooterUpdateTeamResponse(int i10, int i11, ShooterTeamStatus shooterTeamStatus, int i12, int i13, int i14, int i15, int i16, Status status) {
        p.h(shooterTeamStatus, "teamStatus");
        p.h(status, "status");
        this.teamId = i10;
        this.seasonId = i11;
        this.teamStatus = shooterTeamStatus;
        this.hostUserId = i12;
        this.groupId = i13;
        this.waitInterval = i14;
        this.invitingWaitInterval = i15;
        this.invitedWaitInterval = i16;
        this.status = status;
    }

    public final int component1() {
        return this.teamId;
    }

    public final int component2() {
        return this.seasonId;
    }

    public final ShooterTeamStatus component3() {
        return this.teamStatus;
    }

    public final int component4() {
        return this.hostUserId;
    }

    public final int component5() {
        return this.groupId;
    }

    public final int component6() {
        return this.waitInterval;
    }

    public final int component7() {
        return this.invitingWaitInterval;
    }

    public final int component8() {
        return this.invitedWaitInterval;
    }

    public final Status component9() {
        return this.status;
    }

    public final ShooterUpdateTeamResponse copy(int i10, int i11, ShooterTeamStatus shooterTeamStatus, int i12, int i13, int i14, int i15, int i16, Status status) {
        p.h(shooterTeamStatus, "teamStatus");
        p.h(status, "status");
        return new ShooterUpdateTeamResponse(i10, i11, shooterTeamStatus, i12, i13, i14, i15, i16, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterUpdateTeamResponse) {
            ShooterUpdateTeamResponse shooterUpdateTeamResponse = (ShooterUpdateTeamResponse) obj;
            return this.teamId == shooterUpdateTeamResponse.teamId && this.seasonId == shooterUpdateTeamResponse.seasonId && this.teamStatus == shooterUpdateTeamResponse.teamStatus && this.hostUserId == shooterUpdateTeamResponse.hostUserId && this.groupId == shooterUpdateTeamResponse.groupId && this.waitInterval == shooterUpdateTeamResponse.waitInterval && this.invitingWaitInterval == shooterUpdateTeamResponse.invitingWaitInterval && this.invitedWaitInterval == shooterUpdateTeamResponse.invitedWaitInterval && p.c(this.status, shooterUpdateTeamResponse.status);
        }
        return false;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getHostUserId() {
        return this.hostUserId;
    }

    public final int getInvitedWaitInterval() {
        return this.invitedWaitInterval;
    }

    public final int getInvitingWaitInterval() {
        return this.invitingWaitInterval;
    }

    public final int getSeasonId() {
        return this.seasonId;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public final ShooterTeamStatus getTeamStatus() {
        return this.teamStatus;
    }

    public final int getWaitInterval() {
        return this.waitInterval;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.teamId) * 31) + Integer.hashCode(this.seasonId)) * 31) + this.teamStatus.hashCode()) * 31) + Integer.hashCode(this.hostUserId)) * 31) + Integer.hashCode(this.groupId)) * 31) + Integer.hashCode(this.waitInterval)) * 31) + Integer.hashCode(this.invitingWaitInterval)) * 31) + Integer.hashCode(this.invitedWaitInterval)) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ShooterUpdateTeamResponse(teamId=" + this.teamId + ", seasonId=" + this.seasonId + ", teamStatus=" + this.teamStatus + ", hostUserId=" + this.hostUserId + ", groupId=" + this.groupId + ", waitInterval=" + this.waitInterval + ", invitingWaitInterval=" + this.invitingWaitInterval + ", invitedWaitInterval=" + this.invitedWaitInterval + ", status=" + this.status + ')';
    }
}
