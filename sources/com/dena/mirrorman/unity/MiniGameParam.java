package com.dena.mirrorman.unity;

import android.util.Base64;
import com.dena.mirrativ.mirrativapi.closet.GameEffectType;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameEffect;
import com.dena.mirrorman.net.api.response.event.ShooterReward;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import jo.h;
import jo.p;
import so.c;
import xn.a0;
import xn.s;

/* loaded from: classes3.dex */
public abstract class MiniGameParam {
    public static final int $stable = 0;

    /* loaded from: classes3.dex */
    public static final class BestScore extends MiniGameParam {
        public static final int $stable = 0;
        private final int bestScore;

        public BestScore(int i10) {
            super(null);
            this.bestScore = i10;
        }

        public static /* synthetic */ BestScore copy$default(BestScore bestScore, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = bestScore.bestScore;
            }
            return bestScore.copy(i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            return "best_score," + this.bestScore;
        }

        public final int component1() {
            return this.bestScore;
        }

        public final BestScore copy(int i10) {
            return new BestScore(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BestScore) && this.bestScore == ((BestScore) obj).bestScore;
        }

        public final int getBestScore() {
            return this.bestScore;
        }

        public int hashCode() {
            return Integer.hashCode(this.bestScore);
        }

        public String toString() {
            return "BestScore(bestScore=" + this.bestScore + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoQuestEventId extends MiniGameParam {
        public static final int $stable = 0;
        private final int eventId;

        public EmomoQuestEventId(int i10) {
            super(null);
            this.eventId = i10;
        }

        public static /* synthetic */ EmomoQuestEventId copy$default(EmomoQuestEventId emomoQuestEventId, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = emomoQuestEventId.eventId;
            }
            return emomoQuestEventId.copy(i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            return "gift_event_id," + this.eventId;
        }

        public final int component1() {
            return this.eventId;
        }

        public final EmomoQuestEventId copy(int i10) {
            return new EmomoQuestEventId(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmomoQuestEventId) && this.eventId == ((EmomoQuestEventId) obj).eventId;
        }

        public final int getEventId() {
            return this.eventId;
        }

        public int hashCode() {
            return Integer.hashCode(this.eventId);
        }

        public String toString() {
            return "EmomoQuestEventId(eventId=" + this.eventId + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoRunEffect extends MiniGameParam {
        public static final int $stable = 8;
        private final EmomoRunGameEffect effect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmomoRunEffect(EmomoRunGameEffect emomoRunGameEffect) {
            super(null);
            p.h(emomoRunGameEffect, "effect");
            this.effect = emomoRunGameEffect;
        }

        private final EmomoRunGameEffect component1() {
            return this.effect;
        }

        public static /* synthetic */ EmomoRunEffect copy$default(EmomoRunEffect emomoRunEffect, EmomoRunGameEffect emomoRunGameEffect, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoRunGameEffect = emomoRunEffect.effect;
            }
            return emomoRunEffect.copy(emomoRunGameEffect);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            String[] strArr = new String[5];
            strArr[0] = "enhance";
            strArr[1] = this.effect.getEffectCommand();
            strArr[2] = "true";
            strArr[3] = this.effect.getEffectType() == GameEffectType.StageEnemy ? String.valueOf((int) this.effect.getValue()) : String.valueOf(this.effect.getValue());
            strArr[4] = this.effect.getImageUrl();
            return a0.g0(s.m(strArr), ",", null, null, 0, null, null, 62, null);
        }

        public final EmomoRunEffect copy(EmomoRunGameEffect emomoRunGameEffect) {
            p.h(emomoRunGameEffect, "effect");
            return new EmomoRunEffect(emomoRunGameEffect);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmomoRunEffect) && p.c(this.effect, ((EmomoRunEffect) obj).effect);
        }

        public int hashCode() {
            return this.effect.hashCode();
        }

        public String toString() {
            return "EmomoRunEffect(effect=" + this.effect + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoRunReward extends MiniGameParam {
        public static final int $stable = 8;
        private final com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunReward reward;
        private final int score;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmomoRunReward(com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunReward emomoRunReward, int i10) {
            super(null);
            p.h(emomoRunReward, "reward");
            this.reward = emomoRunReward;
            this.score = i10;
        }

        private final com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunReward component1() {
            return this.reward;
        }

        private final int component2() {
            return this.score;
        }

        public static /* synthetic */ EmomoRunReward copy$default(EmomoRunReward emomoRunReward, com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunReward emomoRunReward2, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                emomoRunReward2 = emomoRunReward.reward;
            }
            if ((i11 & 2) != 0) {
                i10 = emomoRunReward.score;
            }
            return emomoRunReward.copy(emomoRunReward2, i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            Object[] objArr = new Object[4];
            objArr[0] = "achieve_reward";
            objArr[1] = Integer.valueOf(this.reward.getThreshold());
            objArr[2] = this.reward.getIconUrl();
            objArr[3] = (this.reward.getAchieved() || this.reward.getThreshold() <= this.score) ? "true" : "false";
            return a0.g0(s.m(objArr), ",", null, null, 0, null, null, 62, null);
        }

        public final EmomoRunReward copy(com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunReward emomoRunReward, int i10) {
            p.h(emomoRunReward, "reward");
            return new EmomoRunReward(emomoRunReward, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EmomoRunReward) {
                EmomoRunReward emomoRunReward = (EmomoRunReward) obj;
                return p.c(this.reward, emomoRunReward.reward) && this.score == emomoRunReward.score;
            }
            return false;
        }

        public int hashCode() {
            return (this.reward.hashCode() * 31) + Integer.hashCode(this.score);
        }

        public String toString() {
            return "EmomoRunReward(reward=" + this.reward + ", score=" + this.score + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class LiveGamePlayId extends MiniGameParam {
        public static final int $stable = 0;
        private final String playId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveGamePlayId(String str) {
            super(null);
            p.h(str, "playId");
            this.playId = str;
        }

        public static /* synthetic */ LiveGamePlayId copy$default(LiveGamePlayId liveGamePlayId, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = liveGamePlayId.playId;
            }
            return liveGamePlayId.copy(str);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            return "play_id," + this.playId;
        }

        public final String component1() {
            return this.playId;
        }

        public final LiveGamePlayId copy(String str) {
            p.h(str, "playId");
            return new LiveGamePlayId(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LiveGamePlayId) && p.c(this.playId, ((LiveGamePlayId) obj).playId);
        }

        public final String getPlayId() {
            return this.playId;
        }

        public int hashCode() {
            return this.playId.hashCode();
        }

        public String toString() {
            return "LiveGamePlayId(playId=" + this.playId + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterAchieveReward extends MiniGameParam {
        public static final int $stable = 8;
        private final ShooterReward reward;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShooterAchieveReward(ShooterReward shooterReward) {
            super(null);
            p.h(shooterReward, "reward");
            this.reward = shooterReward;
        }

        public static /* synthetic */ ShooterAchieveReward copy$default(ShooterAchieveReward shooterAchieveReward, ShooterReward shooterReward, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shooterReward = shooterAchieveReward.reward;
            }
            return shooterAchieveReward.copy(shooterReward);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("achieve_reward,");
            sb2.append(this.reward.getThreshold());
            sb2.append(',');
            sb2.append(this.reward.getIconUrl());
            sb2.append(',');
            sb2.append((this.reward.getAchieved() || this.reward.getThreshold() <= this.reward.getHighScore()) ? "true" : "false");
            sb2.append(',');
            sb2.append(this.reward.getRarity());
            sb2.append(',');
            byte[] bytes = this.reward.getName().getBytes(c.f52772b);
            p.g(bytes, "this as java.lang.String).getBytes(charset)");
            sb2.append(Base64.encodeToString(bytes, 0));
            return sb2.toString();
        }

        public final ShooterReward component1() {
            return this.reward;
        }

        public final ShooterAchieveReward copy(ShooterReward shooterReward) {
            p.h(shooterReward, "reward");
            return new ShooterAchieveReward(shooterReward);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterAchieveReward) && p.c(this.reward, ((ShooterAchieveReward) obj).reward);
        }

        public final ShooterReward getReward() {
            return this.reward;
        }

        public int hashCode() {
            return this.reward.hashCode();
        }

        public String toString() {
            return "ShooterAchieveReward(reward=" + this.reward + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterDiarkisTimeoutSecs extends MiniGameParam {
        public static final int $stable = 0;
        private final int diarkisTimeoutSecs;

        public ShooterDiarkisTimeoutSecs(int i10) {
            super(null);
            this.diarkisTimeoutSecs = i10;
        }

        public static /* synthetic */ ShooterDiarkisTimeoutSecs copy$default(ShooterDiarkisTimeoutSecs shooterDiarkisTimeoutSecs, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = shooterDiarkisTimeoutSecs.diarkisTimeoutSecs;
            }
            return shooterDiarkisTimeoutSecs.copy(i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            return "diarkis_timeout_secs," + this.diarkisTimeoutSecs;
        }

        public final int component1() {
            return this.diarkisTimeoutSecs;
        }

        public final ShooterDiarkisTimeoutSecs copy(int i10) {
            return new ShooterDiarkisTimeoutSecs(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterDiarkisTimeoutSecs) && this.diarkisTimeoutSecs == ((ShooterDiarkisTimeoutSecs) obj).diarkisTimeoutSecs;
        }

        public final int getDiarkisTimeoutSecs() {
            return this.diarkisTimeoutSecs;
        }

        public int hashCode() {
            return Integer.hashCode(this.diarkisTimeoutSecs);
        }

        public String toString() {
            return "ShooterDiarkisTimeoutSecs(diarkisTimeoutSecs=" + this.diarkisTimeoutSecs + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterGameStartTimeoutSecs extends MiniGameParam {
        public static final int $stable = 0;
        private final int gameStartTimeoutSecs;

        public ShooterGameStartTimeoutSecs(int i10) {
            super(null);
            this.gameStartTimeoutSecs = i10;
        }

        public static /* synthetic */ ShooterGameStartTimeoutSecs copy$default(ShooterGameStartTimeoutSecs shooterGameStartTimeoutSecs, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = shooterGameStartTimeoutSecs.gameStartTimeoutSecs;
            }
            return shooterGameStartTimeoutSecs.copy(i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            return "game_start_timeout_secs," + this.gameStartTimeoutSecs;
        }

        public final int component1() {
            return this.gameStartTimeoutSecs;
        }

        public final ShooterGameStartTimeoutSecs copy(int i10) {
            return new ShooterGameStartTimeoutSecs(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterGameStartTimeoutSecs) && this.gameStartTimeoutSecs == ((ShooterGameStartTimeoutSecs) obj).gameStartTimeoutSecs;
        }

        public final int getGameStartTimeoutSecs() {
            return this.gameStartTimeoutSecs;
        }

        public int hashCode() {
            return Integer.hashCode(this.gameStartTimeoutSecs);
        }

        public String toString() {
            return "ShooterGameStartTimeoutSecs(gameStartTimeoutSecs=" + this.gameStartTimeoutSecs + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterGameType extends MiniGameParam {
        public static final int $stable = 0;
        private final int gameType;

        public ShooterGameType(int i10) {
            super(null);
            this.gameType = i10;
        }

        public static /* synthetic */ ShooterGameType copy$default(ShooterGameType shooterGameType, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = shooterGameType.gameType;
            }
            return shooterGameType.copy(i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            return "game_type," + this.gameType;
        }

        public final int component1() {
            return this.gameType;
        }

        public final ShooterGameType copy(int i10) {
            return new ShooterGameType(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterGameType) && this.gameType == ((ShooterGameType) obj).gameType;
        }

        public final int getGameType() {
            return this.gameType;
        }

        public int hashCode() {
            return Integer.hashCode(this.gameType);
        }

        public String toString() {
            return "ShooterGameType(gameType=" + this.gameType + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterIsHost extends MiniGameParam {
        public static final int $stable = 0;
        private final boolean isHost;

        public ShooterIsHost(boolean z10) {
            super(null);
            this.isHost = z10;
        }

        public static /* synthetic */ ShooterIsHost copy$default(ShooterIsHost shooterIsHost, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = shooterIsHost.isHost;
            }
            return shooterIsHost.copy(z10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("is_host,");
            sb2.append(this.isHost ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
            return sb2.toString();
        }

        public final boolean component1() {
            return this.isHost;
        }

        public final ShooterIsHost copy(boolean z10) {
            return new ShooterIsHost(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterIsHost) && this.isHost == ((ShooterIsHost) obj).isHost;
        }

        public int hashCode() {
            boolean z10 = this.isHost;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final boolean isHost() {
            return this.isHost;
        }

        public String toString() {
            return "ShooterIsHost(isHost=" + this.isHost + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterLobbyWaitingTimeoutSecs extends MiniGameParam {
        public static final int $stable = 0;
        private final int lobbyWaitingTimeoutSecs;

        public ShooterLobbyWaitingTimeoutSecs(int i10) {
            super(null);
            this.lobbyWaitingTimeoutSecs = i10;
        }

        public static /* synthetic */ ShooterLobbyWaitingTimeoutSecs copy$default(ShooterLobbyWaitingTimeoutSecs shooterLobbyWaitingTimeoutSecs, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = shooterLobbyWaitingTimeoutSecs.lobbyWaitingTimeoutSecs;
            }
            return shooterLobbyWaitingTimeoutSecs.copy(i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            return "lobby_waiting_timeout_secs," + this.lobbyWaitingTimeoutSecs;
        }

        public final int component1() {
            return this.lobbyWaitingTimeoutSecs;
        }

        public final ShooterLobbyWaitingTimeoutSecs copy(int i10) {
            return new ShooterLobbyWaitingTimeoutSecs(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterLobbyWaitingTimeoutSecs) && this.lobbyWaitingTimeoutSecs == ((ShooterLobbyWaitingTimeoutSecs) obj).lobbyWaitingTimeoutSecs;
        }

        public final int getLobbyWaitingTimeoutSecs() {
            return this.lobbyWaitingTimeoutSecs;
        }

        public int hashCode() {
            return Integer.hashCode(this.lobbyWaitingTimeoutSecs);
        }

        public String toString() {
            return "ShooterLobbyWaitingTimeoutSecs(lobbyWaitingTimeoutSecs=" + this.lobbyWaitingTimeoutSecs + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterMaxMemberNum extends MiniGameParam {
        public static final int $stable = 0;
        private final int maxMemberNum;

        public ShooterMaxMemberNum(int i10) {
            super(null);
            this.maxMemberNum = i10;
        }

        public static /* synthetic */ ShooterMaxMemberNum copy$default(ShooterMaxMemberNum shooterMaxMemberNum, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = shooterMaxMemberNum.maxMemberNum;
            }
            return shooterMaxMemberNum.copy(i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            return "max_member_num," + this.maxMemberNum;
        }

        public final int component1() {
            return this.maxMemberNum;
        }

        public final ShooterMaxMemberNum copy(int i10) {
            return new ShooterMaxMemberNum(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterMaxMemberNum) && this.maxMemberNum == ((ShooterMaxMemberNum) obj).maxMemberNum;
        }

        public final int getMaxMemberNum() {
            return this.maxMemberNum;
        }

        public int hashCode() {
            return Integer.hashCode(this.maxMemberNum);
        }

        public String toString() {
            return "ShooterMaxMemberNum(maxMemberNum=" + this.maxMemberNum + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterRatingAchieveReward extends MiniGameParam {
        public static final int $stable = 8;
        private final ShooterReward reward;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShooterRatingAchieveReward(ShooterReward shooterReward) {
            super(null);
            p.h(shooterReward, "reward");
            this.reward = shooterReward;
        }

        public static /* synthetic */ ShooterRatingAchieveReward copy$default(ShooterRatingAchieveReward shooterRatingAchieveReward, ShooterReward shooterReward, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shooterReward = shooterRatingAchieveReward.reward;
            }
            return shooterRatingAchieveReward.copy(shooterReward);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rating_achieve_reward,");
            sb2.append(this.reward.getThreshold());
            sb2.append(',');
            sb2.append(this.reward.getIconUrl());
            sb2.append(',');
            sb2.append((this.reward.getAchieved() || this.reward.getThreshold() <= this.reward.getHighScore()) ? "true" : "false");
            sb2.append(',');
            sb2.append(this.reward.getRarity());
            sb2.append(',');
            byte[] bytes = this.reward.getName().getBytes(c.f52772b);
            p.g(bytes, "this as java.lang.String).getBytes(charset)");
            sb2.append(Base64.encodeToString(bytes, 0));
            return sb2.toString();
        }

        public final ShooterReward component1() {
            return this.reward;
        }

        public final ShooterRatingAchieveReward copy(ShooterReward shooterReward) {
            p.h(shooterReward, "reward");
            return new ShooterRatingAchieveReward(shooterReward);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterRatingAchieveReward) && p.c(this.reward, ((ShooterRatingAchieveReward) obj).reward);
        }

        public final ShooterReward getReward() {
            return this.reward;
        }

        public int hashCode() {
            return this.reward.hashCode();
        }

        public String toString() {
            return "ShooterRatingAchieveReward(reward=" + this.reward + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterSeasonNo extends MiniGameParam {
        public static final int $stable = 0;
        private final int seasonNo;

        public ShooterSeasonNo(int i10) {
            super(null);
            this.seasonNo = i10;
        }

        public static /* synthetic */ ShooterSeasonNo copy$default(ShooterSeasonNo shooterSeasonNo, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = shooterSeasonNo.seasonNo;
            }
            return shooterSeasonNo.copy(i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            return "season_no," + this.seasonNo;
        }

        public final int component1() {
            return this.seasonNo;
        }

        public final ShooterSeasonNo copy(int i10) {
            return new ShooterSeasonNo(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterSeasonNo) && this.seasonNo == ((ShooterSeasonNo) obj).seasonNo;
        }

        public final int getSeasonNo() {
            return this.seasonNo;
        }

        public int hashCode() {
            return Integer.hashCode(this.seasonNo);
        }

        public String toString() {
            return "ShooterSeasonNo(seasonNo=" + this.seasonNo + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterStageId extends MiniGameParam {
        public static final int $stable = 0;
        private final String stageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShooterStageId(String str) {
            super(null);
            p.h(str, "stageId");
            this.stageId = str;
        }

        public static /* synthetic */ ShooterStageId copy$default(ShooterStageId shooterStageId, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = shooterStageId.stageId;
            }
            return shooterStageId.copy(str);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            return "stage_id," + this.stageId;
        }

        public final String component1() {
            return this.stageId;
        }

        public final ShooterStageId copy(String str) {
            p.h(str, "stageId");
            return new ShooterStageId(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterStageId) && p.c(this.stageId, ((ShooterStageId) obj).stageId);
        }

        public final String getStageId() {
            return this.stageId;
        }

        public int hashCode() {
            return this.stageId.hashCode();
        }

        public String toString() {
            return "ShooterStageId(stageId=" + this.stageId + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class UseDebugFunc extends MiniGameParam {
        public static final int $stable = 0;
        private final boolean isDebug;

        public UseDebugFunc(boolean z10) {
            super(null);
            this.isDebug = z10;
        }

        public static /* synthetic */ UseDebugFunc copy$default(UseDebugFunc useDebugFunc, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = useDebugFunc.isDebug;
            }
            return useDebugFunc.copy(z10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameParam
        public String buildMessage() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("use_debug_func,");
            sb2.append(this.isDebug ? "true" : "false");
            return sb2.toString();
        }

        public final boolean component1() {
            return this.isDebug;
        }

        public final UseDebugFunc copy(boolean z10) {
            return new UseDebugFunc(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UseDebugFunc) && this.isDebug == ((UseDebugFunc) obj).isDebug;
        }

        public int hashCode() {
            boolean z10 = this.isDebug;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final boolean isDebug() {
            return this.isDebug;
        }

        public String toString() {
            return "UseDebugFunc(isDebug=" + this.isDebug + ')';
        }
    }

    private MiniGameParam() {
    }

    public /* synthetic */ MiniGameParam(h hVar) {
        this();
    }

    public abstract String buildMessage();
}
