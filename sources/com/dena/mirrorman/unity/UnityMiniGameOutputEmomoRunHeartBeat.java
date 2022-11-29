package com.dena.mirrorman.unity;

import jo.p;

/* loaded from: classes3.dex */
public final class UnityMiniGameOutputEmomoRunHeartBeat {
    public static final int $stable = 8;
    private int coinBonus;
    private int giftedCoins;
    private int giftedRun;
    private int giftedScore;
    private int kicks;
    private float presetRunScaler;
    private int score;
    private final float scoreCoinMultiple;
    private final float scoreKicksMultiple;
    private final float scoreRunMultiple;
    private int selfRun;
    private int selfTime;
    private int stageCoins;
    private final int stageEnemyMultiple;

    public UnityMiniGameOutputEmomoRunHeartBeat(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, float f11, float f12, float f13, int i19) {
        this.selfTime = i10;
        this.selfRun = i11;
        this.giftedRun = i12;
        this.stageCoins = i13;
        this.giftedCoins = i14;
        this.giftedScore = i15;
        this.kicks = i16;
        this.coinBonus = i17;
        this.score = i18;
        this.presetRunScaler = f10;
        this.scoreRunMultiple = f11;
        this.scoreCoinMultiple = f12;
        this.scoreKicksMultiple = f13;
        this.stageEnemyMultiple = i19;
    }

    public final int component1() {
        return this.selfTime;
    }

    public final float component10() {
        return this.presetRunScaler;
    }

    public final float component11() {
        return this.scoreRunMultiple;
    }

    public final float component12() {
        return this.scoreCoinMultiple;
    }

    public final float component13() {
        return this.scoreKicksMultiple;
    }

    public final int component14() {
        return this.stageEnemyMultiple;
    }

    public final int component2() {
        return this.selfRun;
    }

    public final int component3() {
        return this.giftedRun;
    }

    public final int component4() {
        return this.stageCoins;
    }

    public final int component5() {
        return this.giftedCoins;
    }

    public final int component6() {
        return this.giftedScore;
    }

    public final int component7() {
        return this.kicks;
    }

    public final int component8() {
        return this.coinBonus;
    }

    public final int component9() {
        return this.score;
    }

    public final UnityMiniGameOutputEmomoRunHeartBeat copy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, float f11, float f12, float f13, int i19) {
        return new UnityMiniGameOutputEmomoRunHeartBeat(i10, i11, i12, i13, i14, i15, i16, i17, i18, f10, f11, f12, f13, i19);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnityMiniGameOutputEmomoRunHeartBeat) {
            UnityMiniGameOutputEmomoRunHeartBeat unityMiniGameOutputEmomoRunHeartBeat = (UnityMiniGameOutputEmomoRunHeartBeat) obj;
            return this.selfTime == unityMiniGameOutputEmomoRunHeartBeat.selfTime && this.selfRun == unityMiniGameOutputEmomoRunHeartBeat.selfRun && this.giftedRun == unityMiniGameOutputEmomoRunHeartBeat.giftedRun && this.stageCoins == unityMiniGameOutputEmomoRunHeartBeat.stageCoins && this.giftedCoins == unityMiniGameOutputEmomoRunHeartBeat.giftedCoins && this.giftedScore == unityMiniGameOutputEmomoRunHeartBeat.giftedScore && this.kicks == unityMiniGameOutputEmomoRunHeartBeat.kicks && this.coinBonus == unityMiniGameOutputEmomoRunHeartBeat.coinBonus && this.score == unityMiniGameOutputEmomoRunHeartBeat.score && p.c(Float.valueOf(this.presetRunScaler), Float.valueOf(unityMiniGameOutputEmomoRunHeartBeat.presetRunScaler)) && p.c(Float.valueOf(this.scoreRunMultiple), Float.valueOf(unityMiniGameOutputEmomoRunHeartBeat.scoreRunMultiple)) && p.c(Float.valueOf(this.scoreCoinMultiple), Float.valueOf(unityMiniGameOutputEmomoRunHeartBeat.scoreCoinMultiple)) && p.c(Float.valueOf(this.scoreKicksMultiple), Float.valueOf(unityMiniGameOutputEmomoRunHeartBeat.scoreKicksMultiple)) && this.stageEnemyMultiple == unityMiniGameOutputEmomoRunHeartBeat.stageEnemyMultiple;
        }
        return false;
    }

    public final int getCoinBonus() {
        return this.coinBonus;
    }

    public final int getGiftedCoins() {
        return this.giftedCoins;
    }

    public final int getGiftedRun() {
        return this.giftedRun;
    }

    public final int getGiftedScore() {
        return this.giftedScore;
    }

    public final int getKicks() {
        return this.kicks;
    }

    public final float getPresetRunScaler() {
        return this.presetRunScaler;
    }

    public final int getScore() {
        return this.score;
    }

    public final float getScoreCoinMultiple() {
        return this.scoreCoinMultiple;
    }

    public final float getScoreKicksMultiple() {
        return this.scoreKicksMultiple;
    }

    public final float getScoreRunMultiple() {
        return this.scoreRunMultiple;
    }

    public final int getSelfRun() {
        return this.selfRun;
    }

    public final int getSelfTime() {
        return this.selfTime;
    }

    public final int getStageCoins() {
        return this.stageCoins;
    }

    public final int getStageEnemyMultiple() {
        return this.stageEnemyMultiple;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.selfTime) * 31) + Integer.hashCode(this.selfRun)) * 31) + Integer.hashCode(this.giftedRun)) * 31) + Integer.hashCode(this.stageCoins)) * 31) + Integer.hashCode(this.giftedCoins)) * 31) + Integer.hashCode(this.giftedScore)) * 31) + Integer.hashCode(this.kicks)) * 31) + Integer.hashCode(this.coinBonus)) * 31) + Integer.hashCode(this.score)) * 31) + Float.hashCode(this.presetRunScaler)) * 31) + Float.hashCode(this.scoreRunMultiple)) * 31) + Float.hashCode(this.scoreCoinMultiple)) * 31) + Float.hashCode(this.scoreKicksMultiple)) * 31) + Integer.hashCode(this.stageEnemyMultiple);
    }

    public final void setCoinBonus(int i10) {
        this.coinBonus = i10;
    }

    public final void setGiftedCoins(int i10) {
        this.giftedCoins = i10;
    }

    public final void setGiftedRun(int i10) {
        this.giftedRun = i10;
    }

    public final void setGiftedScore(int i10) {
        this.giftedScore = i10;
    }

    public final void setKicks(int i10) {
        this.kicks = i10;
    }

    public final void setPresetRunScaler(float f10) {
        this.presetRunScaler = f10;
    }

    public final void setScore(int i10) {
        this.score = i10;
    }

    public final void setSelfRun(int i10) {
        this.selfRun = i10;
    }

    public final void setSelfTime(int i10) {
        this.selfTime = i10;
    }

    public final void setStageCoins(int i10) {
        this.stageCoins = i10;
    }

    public String toString() {
        return "UnityMiniGameOutputEmomoRunHeartBeat(selfTime=" + this.selfTime + ", selfRun=" + this.selfRun + ", giftedRun=" + this.giftedRun + ", stageCoins=" + this.stageCoins + ", giftedCoins=" + this.giftedCoins + ", giftedScore=" + this.giftedScore + ", kicks=" + this.kicks + ", coinBonus=" + this.coinBonus + ", score=" + this.score + ", presetRunScaler=" + this.presetRunScaler + ", scoreRunMultiple=" + this.scoreRunMultiple + ", scoreCoinMultiple=" + this.scoreCoinMultiple + ", scoreKicksMultiple=" + this.scoreKicksMultiple + ", stageEnemyMultiple=" + this.stageEnemyMultiple + ')';
    }
}
