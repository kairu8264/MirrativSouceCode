package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.c;
import xm.f;

/* loaded from: classes2.dex */
public final class EmomoRunGameTargetDetail {
    public static final int $stable = 8;
    private final String coinBonus;
    private final String gameNo;
    private final String giftedCoins;
    private final String giftedRun;
    private String giftedScore;
    private final String kicks;
    private String presetRunScaler;
    private final String score;
    private String scoreCoinMultiple;
    private String scoreKicksMultiple;
    private String scoreRunMultiple;
    private final String selfRun;
    private final String selfTime;
    private final String stageCoins;
    private String stageEnemyMultiple;
    private final String status;

    public EmomoRunGameTargetDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        p.h(str, "selfTime");
        p.h(str2, "selfRun");
        p.h(str3, "giftedRun");
        p.h(str4, "stageCoins");
        p.h(str5, "giftedCoins");
        p.h(str6, "giftedScore");
        p.h(str7, "kicks");
        p.h(str8, "coinBonus");
        p.h(str9, "score");
        p.h(str10, "presetRunScaler");
        p.h(str11, "scoreRunMultiple");
        p.h(str12, "scoreCoinMultiple");
        p.h(str13, "scoreKicksMultiple");
        p.h(str14, "stageEnemyMultiple");
        p.h(str15, "gameNo");
        p.h(str16, "status");
        this.selfTime = str;
        this.selfRun = str2;
        this.giftedRun = str3;
        this.stageCoins = str4;
        this.giftedCoins = str5;
        this.giftedScore = str6;
        this.kicks = str7;
        this.coinBonus = str8;
        this.score = str9;
        this.presetRunScaler = str10;
        this.scoreRunMultiple = str11;
        this.scoreCoinMultiple = str12;
        this.scoreKicksMultiple = str13;
        this.stageEnemyMultiple = str14;
        this.gameNo = str15;
        this.status = str16;
    }

    public final String component1() {
        return this.selfTime;
    }

    public final String component10() {
        return this.presetRunScaler;
    }

    public final String component11() {
        return this.scoreRunMultiple;
    }

    public final String component12() {
        return this.scoreCoinMultiple;
    }

    public final String component13() {
        return this.scoreKicksMultiple;
    }

    public final String component14() {
        return this.stageEnemyMultiple;
    }

    public final String component15() {
        return this.gameNo;
    }

    public final String component16() {
        return this.status;
    }

    public final String component2() {
        return this.selfRun;
    }

    public final String component3() {
        return this.giftedRun;
    }

    public final String component4() {
        return this.stageCoins;
    }

    public final String component5() {
        return this.giftedCoins;
    }

    public final String component6() {
        return this.giftedScore;
    }

    public final String component7() {
        return this.kicks;
    }

    public final String component8() {
        return this.coinBonus;
    }

    public final String component9() {
        return this.score;
    }

    public final EmomoRunGameTargetDetail copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        p.h(str, "selfTime");
        p.h(str2, "selfRun");
        p.h(str3, "giftedRun");
        p.h(str4, "stageCoins");
        p.h(str5, "giftedCoins");
        p.h(str6, "giftedScore");
        p.h(str7, "kicks");
        p.h(str8, "coinBonus");
        p.h(str9, "score");
        p.h(str10, "presetRunScaler");
        p.h(str11, "scoreRunMultiple");
        p.h(str12, "scoreCoinMultiple");
        p.h(str13, "scoreKicksMultiple");
        p.h(str14, "stageEnemyMultiple");
        p.h(str15, "gameNo");
        p.h(str16, "status");
        return new EmomoRunGameTargetDetail(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EmomoRunGameTargetDetail) {
            EmomoRunGameTargetDetail emomoRunGameTargetDetail = (EmomoRunGameTargetDetail) obj;
            return p.c(this.selfTime, emomoRunGameTargetDetail.selfTime) && p.c(this.selfRun, emomoRunGameTargetDetail.selfRun) && p.c(this.giftedRun, emomoRunGameTargetDetail.giftedRun) && p.c(this.stageCoins, emomoRunGameTargetDetail.stageCoins) && p.c(this.giftedCoins, emomoRunGameTargetDetail.giftedCoins) && p.c(this.giftedScore, emomoRunGameTargetDetail.giftedScore) && p.c(this.kicks, emomoRunGameTargetDetail.kicks) && p.c(this.coinBonus, emomoRunGameTargetDetail.coinBonus) && p.c(this.score, emomoRunGameTargetDetail.score) && p.c(this.presetRunScaler, emomoRunGameTargetDetail.presetRunScaler) && p.c(this.scoreRunMultiple, emomoRunGameTargetDetail.scoreRunMultiple) && p.c(this.scoreCoinMultiple, emomoRunGameTargetDetail.scoreCoinMultiple) && p.c(this.scoreKicksMultiple, emomoRunGameTargetDetail.scoreKicksMultiple) && p.c(this.stageEnemyMultiple, emomoRunGameTargetDetail.stageEnemyMultiple) && p.c(this.gameNo, emomoRunGameTargetDetail.gameNo) && p.c(this.status, emomoRunGameTargetDetail.status);
        }
        return false;
    }

    public final String getCoinBonus() {
        return this.coinBonus;
    }

    public final String getGameNo() {
        return this.gameNo;
    }

    public final String getGiftedCoins() {
        return this.giftedCoins;
    }

    public final String getGiftedRun() {
        return this.giftedRun;
    }

    public final String getGiftedScore() {
        return this.giftedScore;
    }

    public final String getKicks() {
        return this.kicks;
    }

    public final String getPresetRunScaler() {
        return this.presetRunScaler;
    }

    public final String getScore() {
        return this.score;
    }

    public final String getScoreCoinMultiple() {
        return this.scoreCoinMultiple;
    }

    public final String getScoreKicksMultiple() {
        return this.scoreKicksMultiple;
    }

    public final String getScoreRunMultiple() {
        return this.scoreRunMultiple;
    }

    public final String getSelfRun() {
        return this.selfRun;
    }

    public final String getSelfTime() {
        return this.selfTime;
    }

    public final String getStageCoins() {
        return this.stageCoins;
    }

    public final String getStageEnemyMultiple() {
        return this.stageEnemyMultiple;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.selfTime.hashCode() * 31) + this.selfRun.hashCode()) * 31) + this.giftedRun.hashCode()) * 31) + this.stageCoins.hashCode()) * 31) + this.giftedCoins.hashCode()) * 31) + this.giftedScore.hashCode()) * 31) + this.kicks.hashCode()) * 31) + this.coinBonus.hashCode()) * 31) + this.score.hashCode()) * 31) + this.presetRunScaler.hashCode()) * 31) + this.scoreRunMultiple.hashCode()) * 31) + this.scoreCoinMultiple.hashCode()) * 31) + this.scoreKicksMultiple.hashCode()) * 31) + this.stageEnemyMultiple.hashCode()) * 31) + this.gameNo.hashCode()) * 31) + this.status.hashCode();
    }

    public final void setGiftedScore(String str) {
        p.h(str, "<set-?>");
        this.giftedScore = str;
    }

    public final void setPresetRunScaler(String str) {
        p.h(str, "<set-?>");
        this.presetRunScaler = str;
    }

    public final void setScoreCoinMultiple(String str) {
        p.h(str, "<set-?>");
        this.scoreCoinMultiple = str;
    }

    public final void setScoreKicksMultiple(String str) {
        p.h(str, "<set-?>");
        this.scoreKicksMultiple = str;
    }

    public final void setScoreRunMultiple(String str) {
        p.h(str, "<set-?>");
        this.scoreRunMultiple = str;
    }

    public final void setStageEnemyMultiple(String str) {
        p.h(str, "<set-?>");
        this.stageEnemyMultiple = str;
    }

    public final String toJson() {
        String s10 = new f().e(c.LOWER_CASE_WITH_UNDERSCORES).b().s(this);
        p.g(s10, "GsonBuilder()\n        .s…   .create().toJson(this)");
        return s10;
    }

    public String toString() {
        return "EmomoRunGameTargetDetail(selfTime=" + this.selfTime + ", selfRun=" + this.selfRun + ", giftedRun=" + this.giftedRun + ", stageCoins=" + this.stageCoins + ", giftedCoins=" + this.giftedCoins + ", giftedScore=" + this.giftedScore + ", kicks=" + this.kicks + ", coinBonus=" + this.coinBonus + ", score=" + this.score + ", presetRunScaler=" + this.presetRunScaler + ", scoreRunMultiple=" + this.scoreRunMultiple + ", scoreCoinMultiple=" + this.scoreCoinMultiple + ", scoreKicksMultiple=" + this.scoreKicksMultiple + ", stageEnemyMultiple=" + this.stageEnemyMultiple + ", gameNo=" + this.gameNo + ", status=" + this.status + ')';
    }
}
