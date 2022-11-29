package com.dena.mirrorman.net.bcsvr.response;

import com.dena.mirrorman.net.api.response.event.ShooterGroupStatus;
import com.dena.mirrorman.net.api.response.event.ShooterMemberType;
import com.dena.mirrorman.net.api.response.event.ShooterTeamStatus;
import java.util.List;
import jo.p;
import ym.b;
import ym.c;

/* loaded from: classes2.dex */
public final class ShooterMatchingStateChangedBcsvrResponse {
    public static final int $stable = 8;
    private final Integer groupId;
    @c("group_status")
    @b(ShooterGroupStatus.TypeAdapter.class)
    private final ShooterGroupStatus groupStatus;
    @c("host_member_type")
    @b(ShooterMemberType.TypeAdapter.class)
    private final ShooterMemberType hostMemberType;
    @c("team_status")
    @b(ShooterTeamStatus.TypeAdapter.class)
    private final ShooterTeamStatus matchingStatus;
    private final List<String> memberUserIds;
    private final String roomId;
    private final int seasonId;
    private final String stageId;
    private final int teamId;

    public ShooterMatchingStateChangedBcsvrResponse(int i10, int i11, ShooterTeamStatus shooterTeamStatus, ShooterMemberType shooterMemberType, Integer num, ShooterGroupStatus shooterGroupStatus, String str, String str2, List<String> list) {
        p.h(shooterTeamStatus, "matchingStatus");
        p.h(shooterMemberType, "hostMemberType");
        p.h(shooterGroupStatus, "groupStatus");
        this.seasonId = i10;
        this.teamId = i11;
        this.matchingStatus = shooterTeamStatus;
        this.hostMemberType = shooterMemberType;
        this.groupId = num;
        this.groupStatus = shooterGroupStatus;
        this.stageId = str;
        this.roomId = str2;
        this.memberUserIds = list;
    }

    public final int component1() {
        return this.seasonId;
    }

    public final int component2() {
        return this.teamId;
    }

    public final ShooterTeamStatus component3() {
        return this.matchingStatus;
    }

    public final ShooterMemberType component4() {
        return this.hostMemberType;
    }

    public final Integer component5() {
        return this.groupId;
    }

    public final ShooterGroupStatus component6() {
        return this.groupStatus;
    }

    public final String component7() {
        return this.stageId;
    }

    public final String component8() {
        return this.roomId;
    }

    public final List<String> component9() {
        return this.memberUserIds;
    }

    public final ShooterMatchingStateChangedBcsvrResponse copy(int i10, int i11, ShooterTeamStatus shooterTeamStatus, ShooterMemberType shooterMemberType, Integer num, ShooterGroupStatus shooterGroupStatus, String str, String str2, List<String> list) {
        p.h(shooterTeamStatus, "matchingStatus");
        p.h(shooterMemberType, "hostMemberType");
        p.h(shooterGroupStatus, "groupStatus");
        return new ShooterMatchingStateChangedBcsvrResponse(i10, i11, shooterTeamStatus, shooterMemberType, num, shooterGroupStatus, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterMatchingStateChangedBcsvrResponse) {
            ShooterMatchingStateChangedBcsvrResponse shooterMatchingStateChangedBcsvrResponse = (ShooterMatchingStateChangedBcsvrResponse) obj;
            return this.seasonId == shooterMatchingStateChangedBcsvrResponse.seasonId && this.teamId == shooterMatchingStateChangedBcsvrResponse.teamId && this.matchingStatus == shooterMatchingStateChangedBcsvrResponse.matchingStatus && this.hostMemberType == shooterMatchingStateChangedBcsvrResponse.hostMemberType && p.c(this.groupId, shooterMatchingStateChangedBcsvrResponse.groupId) && this.groupStatus == shooterMatchingStateChangedBcsvrResponse.groupStatus && p.c(this.stageId, shooterMatchingStateChangedBcsvrResponse.stageId) && p.c(this.roomId, shooterMatchingStateChangedBcsvrResponse.roomId) && p.c(this.memberUserIds, shooterMatchingStateChangedBcsvrResponse.memberUserIds);
        }
        return false;
    }

    public final Integer getGroupId() {
        return this.groupId;
    }

    public final ShooterGroupStatus getGroupStatus() {
        return this.groupStatus;
    }

    public final ShooterMemberType getHostMemberType() {
        return this.hostMemberType;
    }

    public final ShooterTeamStatus getMatchingStatus() {
        return this.matchingStatus;
    }

    public final List<String> getMemberUserIds() {
        return this.memberUserIds;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final int getSeasonId() {
        return this.seasonId;
    }

    public final String getStageId() {
        return this.stageId;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.seasonId) * 31) + Integer.hashCode(this.teamId)) * 31) + this.matchingStatus.hashCode()) * 31) + this.hostMemberType.hashCode()) * 31;
        Integer num = this.groupId;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.groupStatus.hashCode()) * 31;
        String str = this.stageId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.roomId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.memberUserIds;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ShooterMatchingStateChangedBcsvrResponse(seasonId=" + this.seasonId + ", teamId=" + this.teamId + ", matchingStatus=" + this.matchingStatus + ", hostMemberType=" + this.hostMemberType + ", groupId=" + this.groupId + ", groupStatus=" + this.groupStatus + ", stageId=" + this.stageId + ", roomId=" + this.roomId + ", memberUserIds=" + this.memberUserIds + ')';
    }
}
