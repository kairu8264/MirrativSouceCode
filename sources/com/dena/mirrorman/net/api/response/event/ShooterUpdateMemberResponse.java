package com.dena.mirrorman.net.api.response.event;

import android.util.Base64;
import com.dena.mirrativ.mirrativapi.core.Status;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import java.util.HashMap;
import jo.h;
import jo.p;
import so.c;
import xm.e;
import ym.b;

/* loaded from: classes2.dex */
public final class ShooterUpdateMemberResponse {
    public static final int $stable = 8;
    private final int dropFlagBonus;
    private final int emomoBonus;
    private final int gameTeamPointBonus;
    private final int gameTeamRank;
    private final int groupId;
    private final int kickBonus;
    private final int lifeBonus;
    @b(ShooterMemberStatus.TypeAdapter.class)
    private final ShooterMemberStatus memberStatus;
    private final int memberType;
    private final int rank;
    private final int rankScore;
    private final ShooterRatingClass ratingClass;
    private final int ratingLegendRanking;
    private final int ratingPoint;
    private final int remainVictoryCount;
    private final int requireRatingPointToNextClass;
    private final String roomId;
    private final int score;
    private final Status status;
    private final int teamId;
    private final int userId;
    private final int victoryCount;
    private final int victoryLevel;
    private final int waveFlagBonus;

    public ShooterUpdateMemberResponse(int i10, int i11, int i12, ShooterMemberStatus shooterMemberStatus, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, String str, Status status, int i23, int i24, int i25, int i26, int i27, ShooterRatingClass shooterRatingClass, int i28, int i29) {
        p.h(shooterMemberStatus, "memberStatus");
        p.h(str, "roomId");
        p.h(status, "status");
        this.teamId = i10;
        this.userId = i11;
        this.memberType = i12;
        this.memberStatus = shooterMemberStatus;
        this.groupId = i13;
        this.score = i14;
        this.rank = i15;
        this.rankScore = i16;
        this.kickBonus = i17;
        this.emomoBonus = i18;
        this.lifeBonus = i19;
        this.victoryCount = i20;
        this.victoryLevel = i21;
        this.remainVictoryCount = i22;
        this.roomId = str;
        this.status = status;
        this.gameTeamRank = i23;
        this.gameTeamPointBonus = i24;
        this.waveFlagBonus = i25;
        this.dropFlagBonus = i26;
        this.ratingPoint = i27;
        this.ratingClass = shooterRatingClass;
        this.ratingLegendRanking = i28;
        this.requireRatingPointToNextClass = i29;
    }

    private final HashMap<String, Object> createMemberResultData() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("rank", Integer.valueOf(this.rank));
        hashMap.put("rankScore", Integer.valueOf(this.rankScore));
        hashMap.put("kickBonus", Integer.valueOf(this.kickBonus));
        hashMap.put("emomoBonus", Integer.valueOf(this.emomoBonus));
        hashMap.put("lifeBonus", Integer.valueOf(this.lifeBonus));
        hashMap.put("score", Integer.valueOf(this.score));
        hashMap.put("victoryCount", Integer.valueOf(this.victoryCount));
        hashMap.put("victoryLevel", Integer.valueOf(this.victoryLevel));
        hashMap.put("remainVictoryCount", Integer.valueOf(this.remainVictoryCount));
        hashMap.put("gameTeamRank", Integer.valueOf(this.gameTeamRank));
        hashMap.put("gameTeamPointBonus", Integer.valueOf(this.gameTeamPointBonus));
        hashMap.put("waveFlagBonus", Integer.valueOf(this.waveFlagBonus));
        hashMap.put("dropFlagBonus", Integer.valueOf(this.dropFlagBonus));
        hashMap.put("ratingPoint", Integer.valueOf(this.ratingPoint));
        ShooterRatingClass shooterRatingClass = this.ratingClass;
        hashMap.put("ratingClass", (shooterRatingClass == null || (r1 = shooterRatingClass.createRatingClassData()) == null) ? "" : "");
        hashMap.put("ratingLegendRanking", Integer.valueOf(this.ratingLegendRanking));
        hashMap.put("requireRatingPointToNextClass", Integer.valueOf(this.requireRatingPointToNextClass));
        return hashMap;
    }

    public final int component1() {
        return this.teamId;
    }

    public final int component10() {
        return this.emomoBonus;
    }

    public final int component11() {
        return this.lifeBonus;
    }

    public final int component12() {
        return this.victoryCount;
    }

    public final int component13() {
        return this.victoryLevel;
    }

    public final int component14() {
        return this.remainVictoryCount;
    }

    public final String component15() {
        return this.roomId;
    }

    public final Status component16() {
        return this.status;
    }

    public final int component17() {
        return this.gameTeamRank;
    }

    public final int component18() {
        return this.gameTeamPointBonus;
    }

    public final int component19() {
        return this.waveFlagBonus;
    }

    public final int component2() {
        return this.userId;
    }

    public final int component20() {
        return this.dropFlagBonus;
    }

    public final int component21() {
        return this.ratingPoint;
    }

    public final ShooterRatingClass component22() {
        return this.ratingClass;
    }

    public final int component23() {
        return this.ratingLegendRanking;
    }

    public final int component24() {
        return this.requireRatingPointToNextClass;
    }

    public final int component3() {
        return this.memberType;
    }

    public final ShooterMemberStatus component4() {
        return this.memberStatus;
    }

    public final int component5() {
        return this.groupId;
    }

    public final int component6() {
        return this.score;
    }

    public final int component7() {
        return this.rank;
    }

    public final int component8() {
        return this.rankScore;
    }

    public final int component9() {
        return this.kickBonus;
    }

    public final ShooterUpdateMemberResponse copy(int i10, int i11, int i12, ShooterMemberStatus shooterMemberStatus, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, String str, Status status, int i23, int i24, int i25, int i26, int i27, ShooterRatingClass shooterRatingClass, int i28, int i29) {
        p.h(shooterMemberStatus, "memberStatus");
        p.h(str, "roomId");
        p.h(status, "status");
        return new ShooterUpdateMemberResponse(i10, i11, i12, shooterMemberStatus, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, str, status, i23, i24, i25, i26, i27, shooterRatingClass, i28, i29);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterUpdateMemberResponse) {
            ShooterUpdateMemberResponse shooterUpdateMemberResponse = (ShooterUpdateMemberResponse) obj;
            return this.teamId == shooterUpdateMemberResponse.teamId && this.userId == shooterUpdateMemberResponse.userId && this.memberType == shooterUpdateMemberResponse.memberType && this.memberStatus == shooterUpdateMemberResponse.memberStatus && this.groupId == shooterUpdateMemberResponse.groupId && this.score == shooterUpdateMemberResponse.score && this.rank == shooterUpdateMemberResponse.rank && this.rankScore == shooterUpdateMemberResponse.rankScore && this.kickBonus == shooterUpdateMemberResponse.kickBonus && this.emomoBonus == shooterUpdateMemberResponse.emomoBonus && this.lifeBonus == shooterUpdateMemberResponse.lifeBonus && this.victoryCount == shooterUpdateMemberResponse.victoryCount && this.victoryLevel == shooterUpdateMemberResponse.victoryLevel && this.remainVictoryCount == shooterUpdateMemberResponse.remainVictoryCount && p.c(this.roomId, shooterUpdateMemberResponse.roomId) && p.c(this.status, shooterUpdateMemberResponse.status) && this.gameTeamRank == shooterUpdateMemberResponse.gameTeamRank && this.gameTeamPointBonus == shooterUpdateMemberResponse.gameTeamPointBonus && this.waveFlagBonus == shooterUpdateMemberResponse.waveFlagBonus && this.dropFlagBonus == shooterUpdateMemberResponse.dropFlagBonus && this.ratingPoint == shooterUpdateMemberResponse.ratingPoint && p.c(this.ratingClass, shooterUpdateMemberResponse.ratingClass) && this.ratingLegendRanking == shooterUpdateMemberResponse.ratingLegendRanking && this.requireRatingPointToNextClass == shooterUpdateMemberResponse.requireRatingPointToNextClass;
        }
        return false;
    }

    public final int getDropFlagBonus() {
        return this.dropFlagBonus;
    }

    public final int getEmomoBonus() {
        return this.emomoBonus;
    }

    public final int getGameTeamPointBonus() {
        return this.gameTeamPointBonus;
    }

    public final int getGameTeamRank() {
        return this.gameTeamRank;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getKickBonus() {
        return this.kickBonus;
    }

    public final int getLifeBonus() {
        return this.lifeBonus;
    }

    public final String getMemberResultDataString() {
        String s10 = new e().s(createMemberResultData());
        p.g(s10, "json");
        byte[] bytes = s10.getBytes(c.f52772b);
        p.g(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        p.g(encodeToString, "encodeToString(json.toByteArray(), Base64.DEFAULT)");
        return encodeToString;
    }

    public final ShooterMemberStatus getMemberStatus() {
        return this.memberStatus;
    }

    public final int getMemberType() {
        return this.memberType;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getRankScore() {
        return this.rankScore;
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

    public final int getRemainVictoryCount() {
        return this.remainVictoryCount;
    }

    public final int getRequireRatingPointToNextClass() {
        return this.requireRatingPointToNextClass;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final int getScore() {
        return this.score;
    }

    public final Status getStatus() {
        return this.status;
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

    public final int getWaveFlagBonus() {
        return this.waveFlagBonus;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.teamId) * 31) + Integer.hashCode(this.userId)) * 31) + Integer.hashCode(this.memberType)) * 31) + this.memberStatus.hashCode()) * 31) + Integer.hashCode(this.groupId)) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.rankScore)) * 31) + Integer.hashCode(this.kickBonus)) * 31) + Integer.hashCode(this.emomoBonus)) * 31) + Integer.hashCode(this.lifeBonus)) * 31) + Integer.hashCode(this.victoryCount)) * 31) + Integer.hashCode(this.victoryLevel)) * 31) + Integer.hashCode(this.remainVictoryCount)) * 31) + this.roomId.hashCode()) * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.gameTeamRank)) * 31) + Integer.hashCode(this.gameTeamPointBonus)) * 31) + Integer.hashCode(this.waveFlagBonus)) * 31) + Integer.hashCode(this.dropFlagBonus)) * 31) + Integer.hashCode(this.ratingPoint)) * 31;
        ShooterRatingClass shooterRatingClass = this.ratingClass;
        return ((((hashCode + (shooterRatingClass == null ? 0 : shooterRatingClass.hashCode())) * 31) + Integer.hashCode(this.ratingLegendRanking)) * 31) + Integer.hashCode(this.requireRatingPointToNextClass);
    }

    public String toString() {
        return "ShooterUpdateMemberResponse(teamId=" + this.teamId + ", userId=" + this.userId + ", memberType=" + this.memberType + ", memberStatus=" + this.memberStatus + ", groupId=" + this.groupId + ", score=" + this.score + ", rank=" + this.rank + ", rankScore=" + this.rankScore + ", kickBonus=" + this.kickBonus + ", emomoBonus=" + this.emomoBonus + ", lifeBonus=" + this.lifeBonus + ", victoryCount=" + this.victoryCount + ", victoryLevel=" + this.victoryLevel + ", remainVictoryCount=" + this.remainVictoryCount + ", roomId=" + this.roomId + ", status=" + this.status + ", gameTeamRank=" + this.gameTeamRank + ", gameTeamPointBonus=" + this.gameTeamPointBonus + ", waveFlagBonus=" + this.waveFlagBonus + ", dropFlagBonus=" + this.dropFlagBonus + ", ratingPoint=" + this.ratingPoint + ", ratingClass=" + this.ratingClass + ", ratingLegendRanking=" + this.ratingLegendRanking + ", requireRatingPointToNextClass=" + this.requireRatingPointToNextClass + ')';
    }

    public /* synthetic */ ShooterUpdateMemberResponse(int i10, int i11, int i12, ShooterMemberStatus shooterMemberStatus, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, String str, Status status, int i23, int i24, int i25, int i26, int i27, ShooterRatingClass shooterRatingClass, int i28, int i29, int i30, h hVar) {
        this(i10, i11, i12, shooterMemberStatus, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, (i30 & 16384) != 0 ? "" : str, status, i23, i24, i25, i26, i27, shooterRatingClass, i28, i29);
    }
}
