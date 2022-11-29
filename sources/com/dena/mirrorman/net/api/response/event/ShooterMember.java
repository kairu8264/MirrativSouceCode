package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.api.response.event.ShooterMemberType;
import com.dena.mirrorman.net.api.response.event.ShooterPartyType;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ShooterMember {
    public static final int $stable = 0;
    private final int auraType;
    private final int gameTeamIndex;
    @b(ShooterMemberStatus.TypeAdapter.class)
    private final ShooterMemberStatus memberStatus;
    @b(ShooterMemberType.TypeAdapter.class)
    private final ShooterMemberType memberType;
    private final String name;
    @b(ShooterPartyType.TypeAdapter.class)
    private final ShooterPartyType partyType;
    private final int position;
    private final String profileImageUrl;
    private final ShooterRatingClass ratingClass;
    private final int ratingLegendRanking;
    private final int ratingPoint;
    private final int teamId;
    private final int userId;
    private final int victoryCount;
    private final int victoryLevel;

    public ShooterMember(int i10, int i11, String str, String str2, ShooterMemberStatus shooterMemberStatus, ShooterMemberType shooterMemberType, ShooterPartyType shooterPartyType, int i12, int i13, int i14, int i15, int i16, ShooterRatingClass shooterRatingClass, int i17, int i18) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        p.h(shooterMemberStatus, "memberStatus");
        p.h(shooterMemberType, "memberType");
        p.h(shooterPartyType, "partyType");
        this.userId = i10;
        this.teamId = i11;
        this.name = str;
        this.profileImageUrl = str2;
        this.memberStatus = shooterMemberStatus;
        this.memberType = shooterMemberType;
        this.partyType = shooterPartyType;
        this.position = i12;
        this.victoryCount = i13;
        this.victoryLevel = i14;
        this.gameTeamIndex = i15;
        this.ratingPoint = i16;
        this.ratingClass = shooterRatingClass;
        this.ratingLegendRanking = i17;
        this.auraType = i18;
    }

    public final int component1() {
        return this.userId;
    }

    public final int component10() {
        return this.victoryLevel;
    }

    public final int component11() {
        return this.gameTeamIndex;
    }

    public final int component12() {
        return this.ratingPoint;
    }

    public final ShooterRatingClass component13() {
        return this.ratingClass;
    }

    public final int component14() {
        return this.ratingLegendRanking;
    }

    public final int component15() {
        return this.auraType;
    }

    public final int component2() {
        return this.teamId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.profileImageUrl;
    }

    public final ShooterMemberStatus component5() {
        return this.memberStatus;
    }

    public final ShooterMemberType component6() {
        return this.memberType;
    }

    public final ShooterPartyType component7() {
        return this.partyType;
    }

    public final int component8() {
        return this.position;
    }

    public final int component9() {
        return this.victoryCount;
    }

    public final ShooterMember copy(int i10, int i11, String str, String str2, ShooterMemberStatus shooterMemberStatus, ShooterMemberType shooterMemberType, ShooterPartyType shooterPartyType, int i12, int i13, int i14, int i15, int i16, ShooterRatingClass shooterRatingClass, int i17, int i18) {
        p.h(str, "name");
        p.h(str2, "profileImageUrl");
        p.h(shooterMemberStatus, "memberStatus");
        p.h(shooterMemberType, "memberType");
        p.h(shooterPartyType, "partyType");
        return new ShooterMember(i10, i11, str, str2, shooterMemberStatus, shooterMemberType, shooterPartyType, i12, i13, i14, i15, i16, shooterRatingClass, i17, i18);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterMember) {
            ShooterMember shooterMember = (ShooterMember) obj;
            return this.userId == shooterMember.userId && this.teamId == shooterMember.teamId && p.c(this.name, shooterMember.name) && p.c(this.profileImageUrl, shooterMember.profileImageUrl) && this.memberStatus == shooterMember.memberStatus && this.memberType == shooterMember.memberType && this.partyType == shooterMember.partyType && this.position == shooterMember.position && this.victoryCount == shooterMember.victoryCount && this.victoryLevel == shooterMember.victoryLevel && this.gameTeamIndex == shooterMember.gameTeamIndex && this.ratingPoint == shooterMember.ratingPoint && p.c(this.ratingClass, shooterMember.ratingClass) && this.ratingLegendRanking == shooterMember.ratingLegendRanking && this.auraType == shooterMember.auraType;
        }
        return false;
    }

    public final int getAuraType() {
        return this.auraType;
    }

    public final int getGameTeamIndex() {
        return this.gameTeamIndex;
    }

    public final ShooterMemberStatus getMemberStatus() {
        return this.memberStatus;
    }

    public final ShooterMemberType getMemberType() {
        return this.memberType;
    }

    public final String getName() {
        return this.name;
    }

    public final ShooterPartyType getPartyType() {
        return this.partyType;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public final ShooterRatingClass getRatingClass() {
        return this.ratingClass;
    }

    public final int getRatingLegendRanking() {
        return this.ratingLegendRanking;
    }

    public final int getRatingPoint() {
        return this.ratingPoint;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getVictoryCount() {
        return this.victoryCount;
    }

    public final int getVictoryLevel() {
        return this.victoryLevel;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((Integer.hashCode(this.userId) * 31) + Integer.hashCode(this.teamId)) * 31) + this.name.hashCode()) * 31) + this.profileImageUrl.hashCode()) * 31) + this.memberStatus.hashCode()) * 31) + this.memberType.hashCode()) * 31) + this.partyType.hashCode()) * 31) + Integer.hashCode(this.position)) * 31) + Integer.hashCode(this.victoryCount)) * 31) + Integer.hashCode(this.victoryLevel)) * 31) + Integer.hashCode(this.gameTeamIndex)) * 31) + Integer.hashCode(this.ratingPoint)) * 31;
        ShooterRatingClass shooterRatingClass = this.ratingClass;
        return ((((hashCode + (shooterRatingClass == null ? 0 : shooterRatingClass.hashCode())) * 31) + Integer.hashCode(this.ratingLegendRanking)) * 31) + Integer.hashCode(this.auraType);
    }

    public String toString() {
        return "ShooterMember(userId=" + this.userId + ", teamId=" + this.teamId + ", name=" + this.name + ", profileImageUrl=" + this.profileImageUrl + ", memberStatus=" + this.memberStatus + ", memberType=" + this.memberType + ", partyType=" + this.partyType + ", position=" + this.position + ", victoryCount=" + this.victoryCount + ", victoryLevel=" + this.victoryLevel + ", gameTeamIndex=" + this.gameTeamIndex + ", ratingPoint=" + this.ratingPoint + ", ratingClass=" + this.ratingClass + ", ratingLegendRanking=" + this.ratingLegendRanking + ", auraType=" + this.auraType + ')';
    }
}
