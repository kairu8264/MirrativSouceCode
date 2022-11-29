package com.dena.mirrorman.net.api.response.event;

import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import java.util.HashMap;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ShooterMemberResult {
    public static final int $stable = 0;
    @b(ShooterMemberStatus.TypeAdapter.class)
    private final ShooterMemberStatus memberStatus;
    private final int rank;
    private final ShooterRatingClass ratingClass;
    private final int ratingLegendRanking;
    private final int ratingPoint;
    private final int score;
    private final int userId;

    public ShooterMemberResult(int i10, int i11, int i12, int i13, ShooterRatingClass shooterRatingClass, int i14, ShooterMemberStatus shooterMemberStatus) {
        p.h(shooterMemberStatus, "memberStatus");
        this.userId = i10;
        this.rank = i11;
        this.score = i12;
        this.ratingPoint = i13;
        this.ratingClass = shooterRatingClass;
        this.ratingLegendRanking = i14;
        this.memberStatus = shooterMemberStatus;
    }

    public static /* synthetic */ ShooterMemberResult copy$default(ShooterMemberResult shooterMemberResult, int i10, int i11, int i12, int i13, ShooterRatingClass shooterRatingClass, int i14, ShooterMemberStatus shooterMemberStatus, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i10 = shooterMemberResult.userId;
        }
        if ((i15 & 2) != 0) {
            i11 = shooterMemberResult.rank;
        }
        int i16 = i11;
        if ((i15 & 4) != 0) {
            i12 = shooterMemberResult.score;
        }
        int i17 = i12;
        if ((i15 & 8) != 0) {
            i13 = shooterMemberResult.ratingPoint;
        }
        int i18 = i13;
        if ((i15 & 16) != 0) {
            shooterRatingClass = shooterMemberResult.ratingClass;
        }
        ShooterRatingClass shooterRatingClass2 = shooterRatingClass;
        if ((i15 & 32) != 0) {
            i14 = shooterMemberResult.ratingLegendRanking;
        }
        int i19 = i14;
        if ((i15 & 64) != 0) {
            shooterMemberStatus = shooterMemberResult.memberStatus;
        }
        return shooterMemberResult.copy(i10, i16, i17, i18, shooterRatingClass2, i19, shooterMemberStatus);
    }

    public final int component1() {
        return this.userId;
    }

    public final int component2() {
        return this.rank;
    }

    public final int component3() {
        return this.score;
    }

    public final int component4() {
        return this.ratingPoint;
    }

    public final ShooterRatingClass component5() {
        return this.ratingClass;
    }

    public final int component6() {
        return this.ratingLegendRanking;
    }

    public final ShooterMemberStatus component7() {
        return this.memberStatus;
    }

    public final ShooterMemberResult copy(int i10, int i11, int i12, int i13, ShooterRatingClass shooterRatingClass, int i14, ShooterMemberStatus shooterMemberStatus) {
        p.h(shooterMemberStatus, "memberStatus");
        return new ShooterMemberResult(i10, i11, i12, i13, shooterRatingClass, i14, shooterMemberStatus);
    }

    public final HashMap<String, Object> createMemberResultData() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("userId", Integer.valueOf(this.userId));
        hashMap.put("rank", Integer.valueOf(this.rank));
        hashMap.put("score", Integer.valueOf(this.score));
        hashMap.put("ratingPoint", Integer.valueOf(this.ratingPoint));
        ShooterRatingClass shooterRatingClass = this.ratingClass;
        hashMap.put("ratingClass", (shooterRatingClass == null || (r1 = shooterRatingClass.createRatingClassData()) == null) ? "" : "");
        hashMap.put("ratingLegendRanking", Integer.valueOf(this.ratingLegendRanking));
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShooterMemberResult) {
            ShooterMemberResult shooterMemberResult = (ShooterMemberResult) obj;
            return this.userId == shooterMemberResult.userId && this.rank == shooterMemberResult.rank && this.score == shooterMemberResult.score && this.ratingPoint == shooterMemberResult.ratingPoint && p.c(this.ratingClass, shooterMemberResult.ratingClass) && this.ratingLegendRanking == shooterMemberResult.ratingLegendRanking && this.memberStatus == shooterMemberResult.memberStatus;
        }
        return false;
    }

    public final ShooterMemberStatus getMemberStatus() {
        return this.memberStatus;
    }

    public final int getRank() {
        return this.rank;
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

    public final int getScore() {
        return this.score;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.userId) * 31) + Integer.hashCode(this.rank)) * 31) + Integer.hashCode(this.score)) * 31) + Integer.hashCode(this.ratingPoint)) * 31;
        ShooterRatingClass shooterRatingClass = this.ratingClass;
        return ((((hashCode + (shooterRatingClass == null ? 0 : shooterRatingClass.hashCode())) * 31) + Integer.hashCode(this.ratingLegendRanking)) * 31) + this.memberStatus.hashCode();
    }

    public String toString() {
        return "ShooterMemberResult(userId=" + this.userId + ", rank=" + this.rank + ", score=" + this.score + ", ratingPoint=" + this.ratingPoint + ", ratingClass=" + this.ratingClass + ", ratingLegendRanking=" + this.ratingLegendRanking + ", memberStatus=" + this.memberStatus + ')';
    }
}
