package com.dena.mirrorman.net.api.response.event;

import android.util.Base64;
import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jo.p;
import so.c;
import xm.e;

/* loaded from: classes2.dex */
public final class ShooterTeamResultResponse {
    public static final int $stable = 8;
    private final int gameTeamRank;
    private final int groupId;
    private final List<ShooterMemberResult> memberResults;
    private final Status status;
    private final int teamId;
    private final int teamRank;
    private final int teamScore;
    private final int teamStatus;
    private final int totalRank;
    private final int totalScore;
    private final double victoryBonusRate;

    public ShooterTeamResultResponse(int i10, int i11, int i12, int i13, int i14, double d10, int i15, int i16, int i17, List<ShooterMemberResult> list, Status status) {
        p.h(list, "memberResults");
        p.h(status, "status");
        this.teamId = i10;
        this.groupId = i11;
        this.teamStatus = i12;
        this.teamScore = i13;
        this.teamRank = i14;
        this.victoryBonusRate = d10;
        this.totalScore = i15;
        this.totalRank = i16;
        this.gameTeamRank = i17;
        this.memberResults = list;
        this.status = status;
    }

    private final HashMap<String, Object> createTeamResultData(int i10) {
        ArrayList arrayList = new ArrayList();
        for (ShooterMemberResult shooterMemberResult : this.memberResults) {
            arrayList.add(shooterMemberResult.createMemberResultData());
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("teamRank", Integer.valueOf(this.teamRank));
        hashMap.put("teamScore", Integer.valueOf(this.teamScore));
        hashMap.put("totalScore", Integer.valueOf(this.totalScore));
        hashMap.put("victoryBonusRate", Double.valueOf(this.victoryBonusRate));
        hashMap.put("totalRank", Integer.valueOf(this.totalRank));
        hashMap.put("previousTotalRank", Integer.valueOf(i10));
        hashMap.put("gameTeamRank", Integer.valueOf(this.gameTeamRank));
        hashMap.put("memberResults", arrayList);
        return hashMap;
    }

    public final int component1() {
        return this.teamId;
    }

    public final List<ShooterMemberResult> component10() {
        return this.memberResults;
    }

    public final Status component11() {
        return this.status;
    }

    public final int component2() {
        return this.groupId;
    }

    public final int component3() {
        return this.teamStatus;
    }

    public final int component4() {
        return this.teamScore;
    }

    public final int component5() {
        return this.teamRank;
    }

    public final double component6() {
        return this.victoryBonusRate;
    }

    public final int component7() {
        return this.totalScore;
    }

    public final int component8() {
        return this.totalRank;
    }

    public final int component9() {
        return this.gameTeamRank;
    }

    public final ShooterTeamResultResponse copy(int i10, int i11, int i12, int i13, int i14, double d10, int i15, int i16, int i17, List<ShooterMemberResult> list, Status status) {
        p.h(list, "memberResults");
        p.h(status, "status");
        return new ShooterTeamResultResponse(i10, i11, i12, i13, i14, d10, i15, i16, i17, list, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterTeamResultResponse) {
            ShooterTeamResultResponse shooterTeamResultResponse = (ShooterTeamResultResponse) obj;
            return this.teamId == shooterTeamResultResponse.teamId && this.groupId == shooterTeamResultResponse.groupId && this.teamStatus == shooterTeamResultResponse.teamStatus && this.teamScore == shooterTeamResultResponse.teamScore && this.teamRank == shooterTeamResultResponse.teamRank && p.c(Double.valueOf(this.victoryBonusRate), Double.valueOf(shooterTeamResultResponse.victoryBonusRate)) && this.totalScore == shooterTeamResultResponse.totalScore && this.totalRank == shooterTeamResultResponse.totalRank && this.gameTeamRank == shooterTeamResultResponse.gameTeamRank && p.c(this.memberResults, shooterTeamResultResponse.memberResults) && p.c(this.status, shooterTeamResultResponse.status);
        }
        return false;
    }

    public final int getGameTeamRank() {
        return this.gameTeamRank;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final List<ShooterMemberResult> getMemberResults() {
        return this.memberResults;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final int getTeamId() {
        return this.teamId;
    }

    public final int getTeamRank() {
        return this.teamRank;
    }

    public final String getTeamResultDataString(int i10) {
        String s10 = new e().s(createTeamResultData(i10));
        p.g(s10, "json");
        byte[] bytes = s10.getBytes(c.f52772b);
        p.g(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        p.g(encodeToString, "encodeToString(json.toByteArray(), Base64.DEFAULT)");
        return encodeToString;
    }

    public final int getTeamScore() {
        return this.teamScore;
    }

    public final int getTeamStatus() {
        return this.teamStatus;
    }

    public final int getTotalRank() {
        return this.totalRank;
    }

    public final int getTotalScore() {
        return this.totalScore;
    }

    public final double getVictoryBonusRate() {
        return this.victoryBonusRate;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.teamId) * 31) + Integer.hashCode(this.groupId)) * 31) + Integer.hashCode(this.teamStatus)) * 31) + Integer.hashCode(this.teamScore)) * 31) + Integer.hashCode(this.teamRank)) * 31) + Double.hashCode(this.victoryBonusRate)) * 31) + Integer.hashCode(this.totalScore)) * 31) + Integer.hashCode(this.totalRank)) * 31) + Integer.hashCode(this.gameTeamRank)) * 31) + this.memberResults.hashCode()) * 31) + this.status.hashCode();
    }

    public String toString() {
        return "ShooterTeamResultResponse(teamId=" + this.teamId + ", groupId=" + this.groupId + ", teamStatus=" + this.teamStatus + ", teamScore=" + this.teamScore + ", teamRank=" + this.teamRank + ", victoryBonusRate=" + this.victoryBonusRate + ", totalScore=" + this.totalScore + ", totalRank=" + this.totalRank + ", gameTeamRank=" + this.gameTeamRank + ", memberResults=" + this.memberResults + ", status=" + this.status + ')';
    }
}
