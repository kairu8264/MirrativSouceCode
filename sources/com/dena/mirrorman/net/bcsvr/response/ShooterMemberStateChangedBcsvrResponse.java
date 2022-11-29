package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterMemberType;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class ShooterMemberStateChangedBcsvrResponse {
    public static final int $stable = 0;
    @c("member_status")
    @b(ShooterMemberStatus.TypeAdapter.class)
    private final ShooterMemberStatus inviteStatus;
    @b(ShooterMemberType.TypeAdapter.class)
    private final ShooterMemberType memberType;
    private final int seasonId;
    private final int teamId;
    @c("member_user_id")
    private final String userId;

    public ShooterMemberStateChangedBcsvrResponse(int i10, int i11, String str, ShooterMemberStatus shooterMemberStatus, ShooterMemberType shooterMemberType) {
        p.h(str, "userId");
        p.h(shooterMemberStatus, "inviteStatus");
        p.h(shooterMemberType, "memberType");
        this.seasonId = i10;
        this.teamId = i11;
        this.userId = str;
        this.inviteStatus = shooterMemberStatus;
        this.memberType = shooterMemberType;
    }

    public static /* synthetic */ ShooterMemberStateChangedBcsvrResponse copy$default(ShooterMemberStateChangedBcsvrResponse shooterMemberStateChangedBcsvrResponse, int i10, int i11, String str, ShooterMemberStatus shooterMemberStatus, ShooterMemberType shooterMemberType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = shooterMemberStateChangedBcsvrResponse.seasonId;
        }
        if ((i12 & 2) != 0) {
            i11 = shooterMemberStateChangedBcsvrResponse.teamId;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str = shooterMemberStateChangedBcsvrResponse.userId;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            shooterMemberStatus = shooterMemberStateChangedBcsvrResponse.inviteStatus;
        }
        ShooterMemberStatus shooterMemberStatus2 = shooterMemberStatus;
        if ((i12 & 16) != 0) {
            shooterMemberType = shooterMemberStateChangedBcsvrResponse.memberType;
        }
        return shooterMemberStateChangedBcsvrResponse.copy(i10, i13, str2, shooterMemberStatus2, shooterMemberType);
    }

    public final int component1() {
        return this.seasonId;
    }

    public final int component2() {
        return this.teamId;
    }

    public final String component3() {
        return this.userId;
    }

    public final ShooterMemberStatus component4() {
        return this.inviteStatus;
    }

    public final ShooterMemberType component5() {
        return this.memberType;
    }

    public final ShooterMemberStateChangedBcsvrResponse copy(int i10, int i11, String str, ShooterMemberStatus shooterMemberStatus, ShooterMemberType shooterMemberType) {
        p.h(str, "userId");
        p.h(shooterMemberStatus, "inviteStatus");
        p.h(shooterMemberType, "memberType");
        return new ShooterMemberStateChangedBcsvrResponse(i10, i11, str, shooterMemberStatus, shooterMemberType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterMemberStateChangedBcsvrResponse) {
            ShooterMemberStateChangedBcsvrResponse shooterMemberStateChangedBcsvrResponse = (ShooterMemberStateChangedBcsvrResponse) obj;
            return this.seasonId == shooterMemberStateChangedBcsvrResponse.seasonId && this.teamId == shooterMemberStateChangedBcsvrResponse.teamId && p.c(this.userId, shooterMemberStateChangedBcsvrResponse.userId) && this.inviteStatus == shooterMemberStateChangedBcsvrResponse.inviteStatus && this.memberType == shooterMemberStateChangedBcsvrResponse.memberType;
        }
        return false;
    }

    public final ShooterMemberStatus getInviteStatus() {
        return this.inviteStatus;
    }

    public final ShooterMemberType getMemberType() {
        return this.memberType;
    }

    public final int getSeasonId() {
        return this.seasonId;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.seasonId) * 31) + Integer.hashCode(this.teamId)) * 31) + this.userId.hashCode()) * 31) + this.inviteStatus.hashCode()) * 31) + this.memberType.hashCode();
    }

    public String toString() {
        return "ShooterMemberStateChangedBcsvrResponse(seasonId=" + this.seasonId + ", teamId=" + this.teamId + ", userId=" + this.userId + ", inviteStatus=" + this.inviteStatus + ", memberType=" + this.memberType + ')';
    }
}
