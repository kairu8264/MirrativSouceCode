package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public final class UnityMiniGameOutputShooterGameOver {
    public static final int $stable = 0;
    private final int flagPlunderCount;
    private final int flagWavingCount;
    private final int gameTeamPoint;
    private final int gameTeamRank;
    private final int kickNum;
    private final int life;
    private final int rank;

    public UnityMiniGameOutputShooterGameOver(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.rank = i10;
        this.kickNum = i11;
        this.life = i12;
        this.gameTeamRank = i13;
        this.gameTeamPoint = i14;
        this.flagWavingCount = i15;
        this.flagPlunderCount = i16;
    }

    public static /* synthetic */ UnityMiniGameOutputShooterGameOver copy$default(UnityMiniGameOutputShooterGameOver unityMiniGameOutputShooterGameOver, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i10 = unityMiniGameOutputShooterGameOver.rank;
        }
        if ((i17 & 2) != 0) {
            i11 = unityMiniGameOutputShooterGameOver.kickNum;
        }
        int i18 = i11;
        if ((i17 & 4) != 0) {
            i12 = unityMiniGameOutputShooterGameOver.life;
        }
        int i19 = i12;
        if ((i17 & 8) != 0) {
            i13 = unityMiniGameOutputShooterGameOver.gameTeamRank;
        }
        int i20 = i13;
        if ((i17 & 16) != 0) {
            i14 = unityMiniGameOutputShooterGameOver.gameTeamPoint;
        }
        int i21 = i14;
        if ((i17 & 32) != 0) {
            i15 = unityMiniGameOutputShooterGameOver.flagWavingCount;
        }
        int i22 = i15;
        if ((i17 & 64) != 0) {
            i16 = unityMiniGameOutputShooterGameOver.flagPlunderCount;
        }
        return unityMiniGameOutputShooterGameOver.copy(i10, i18, i19, i20, i21, i22, i16);
    }

    public final int component1() {
        return this.rank;
    }

    public final int component2() {
        return this.kickNum;
    }

    public final int component3() {
        return this.life;
    }

    public final int component4() {
        return this.gameTeamRank;
    }

    public final int component5() {
        return this.gameTeamPoint;
    }

    public final int component6() {
        return this.flagWavingCount;
    }

    public final int component7() {
        return this.flagPlunderCount;
    }

    public final UnityMiniGameOutputShooterGameOver copy(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new UnityMiniGameOutputShooterGameOver(i10, i11, i12, i13, i14, i15, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnityMiniGameOutputShooterGameOver) {
            UnityMiniGameOutputShooterGameOver unityMiniGameOutputShooterGameOver = (UnityMiniGameOutputShooterGameOver) obj;
            return this.rank == unityMiniGameOutputShooterGameOver.rank && this.kickNum == unityMiniGameOutputShooterGameOver.kickNum && this.life == unityMiniGameOutputShooterGameOver.life && this.gameTeamRank == unityMiniGameOutputShooterGameOver.gameTeamRank && this.gameTeamPoint == unityMiniGameOutputShooterGameOver.gameTeamPoint && this.flagWavingCount == unityMiniGameOutputShooterGameOver.flagWavingCount && this.flagPlunderCount == unityMiniGameOutputShooterGameOver.flagPlunderCount;
        }
        return false;
    }

    public final int getFlagPlunderCount() {
        return this.flagPlunderCount;
    }

    public final int getFlagWavingCount() {
        return this.flagWavingCount;
    }

    public final int getGameTeamPoint() {
        return this.gameTeamPoint;
    }

    public final int getGameTeamRank() {
        return this.gameTeamRank;
    }

    public final int getKickNum() {
        return this.kickNum;
    }

    public final int getLife() {
        return this.life;
    }

    public final int getRank() {
        return this.rank;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.rank) * 31) + Integer.hashCode(this.kickNum)) * 31) + Integer.hashCode(this.life)) * 31) + Integer.hashCode(this.gameTeamRank)) * 31) + Integer.hashCode(this.gameTeamPoint)) * 31) + Integer.hashCode(this.flagWavingCount)) * 31) + Integer.hashCode(this.flagPlunderCount);
    }

    public String toString() {
        return "UnityMiniGameOutputShooterGameOver(rank=" + this.rank + ", kickNum=" + this.kickNum + ", life=" + this.life + ", gameTeamRank=" + this.gameTeamRank + ", gameTeamPoint=" + this.gameTeamPoint + ", flagWavingCount=" + this.flagWavingCount + ", flagPlunderCount=" + this.flagPlunderCount + ')';
    }
}
