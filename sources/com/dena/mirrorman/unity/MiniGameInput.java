package com.dena.mirrorman.unity;

import android.util.Base64;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameResponse;
import com.dena.mirrorman.net.api.response.event.DiarkisAuthInfoResponse;
import com.dena.mirrorman.net.api.response.event.ShooterReward;
import com.dena.mirrorman.net.api.response.event.ShooterTeamResultResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateMemberResponse;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.h;
import jo.p;
import so.c;
import xn.a0;
import xn.s;

/* loaded from: classes3.dex */
public abstract class MiniGameInput {
    public static final int $stable = 0;

    /* loaded from: classes3.dex */
    public static final class EmomoQuestGiftSent extends MiniGameInput {
        public static final int $stable = 0;
        private final String json;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmomoQuestGiftSent(String str) {
            super(null);
            p.h(str, "json");
            this.json = str;
        }

        public static /* synthetic */ EmomoQuestGiftSent copy$default(EmomoQuestGiftSent emomoQuestGiftSent, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = emomoQuestGiftSent.json;
            }
            return emomoQuestGiftSent.copy(str);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("quest_gift_sent,");
            byte[] bytes = this.json.getBytes(c.f52772b);
            p.g(bytes, "this as java.lang.String).getBytes(charset)");
            sb2.append(Base64.encodeToString(bytes, 0));
            return sb2.toString();
        }

        public final String component1() {
            return this.json;
        }

        public final EmomoQuestGiftSent copy(String str) {
            p.h(str, "json");
            return new EmomoQuestGiftSent(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmomoQuestGiftSent) && p.c(this.json, ((EmomoQuestGiftSent) obj).json);
        }

        public final String getJson() {
            return this.json;
        }

        public int hashCode() {
            return this.json.hashCode();
        }

        public String toString() {
            return "EmomoQuestGiftSent(json=" + this.json + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoQuestNotifyEquipmentGachaClose extends MiniGameInput {
        public static final int $stable = 0;
        public static final EmomoQuestNotifyEquipmentGachaClose INSTANCE = new EmomoQuestNotifyEquipmentGachaClose();

        private EmomoQuestNotifyEquipmentGachaClose() {
            super(null);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "quest_notify_equipment_gacha_close";
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoQuestNotifyEquipmentGachaRequestFinished extends MiniGameInput {
        public static final int $stable = 0;
        private final boolean isSuccess;

        public EmomoQuestNotifyEquipmentGachaRequestFinished(boolean z10) {
            super(null);
            this.isSuccess = z10;
        }

        public static /* synthetic */ EmomoQuestNotifyEquipmentGachaRequestFinished copy$default(EmomoQuestNotifyEquipmentGachaRequestFinished emomoQuestNotifyEquipmentGachaRequestFinished, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = emomoQuestNotifyEquipmentGachaRequestFinished.isSuccess;
            }
            return emomoQuestNotifyEquipmentGachaRequestFinished.copy(z10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("quest_notify_equipment_gacha_request_successed,");
            sb2.append(this.isSuccess ? "true" : "false");
            return sb2.toString();
        }

        public final boolean component1() {
            return this.isSuccess;
        }

        public final EmomoQuestNotifyEquipmentGachaRequestFinished copy(boolean z10) {
            return new EmomoQuestNotifyEquipmentGachaRequestFinished(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmomoQuestNotifyEquipmentGachaRequestFinished) && this.isSuccess == ((EmomoQuestNotifyEquipmentGachaRequestFinished) obj).isSuccess;
        }

        public int hashCode() {
            boolean z10 = this.isSuccess;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final boolean isSuccess() {
            return this.isSuccess;
        }

        public String toString() {
            return "EmomoQuestNotifyEquipmentGachaRequestFinished(isSuccess=" + this.isSuccess + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoQuestNotifyGiftGachaClose extends MiniGameInput {
        public static final int $stable = 0;
        public static final EmomoQuestNotifyGiftGachaClose INSTANCE = new EmomoQuestNotifyGiftGachaClose();

        private EmomoQuestNotifyGiftGachaClose() {
            super(null);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "quest_notify_gift_gacha_close";
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoQuestNotifyGiftGachaSent extends MiniGameInput {
        public static final int $stable = 0;
        public static final EmomoQuestNotifyGiftGachaSent INSTANCE = new EmomoQuestNotifyGiftGachaSent();

        private EmomoQuestNotifyGiftGachaSent() {
            super(null);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "quest_notify_gift_gacha_sent";
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoQuestOpenEquipmentGacha extends MiniGameInput {
        public static final int $stable = 0;
        private final String json;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmomoQuestOpenEquipmentGacha(String str) {
            super(null);
            p.h(str, "json");
            this.json = str;
        }

        public static /* synthetic */ EmomoQuestOpenEquipmentGacha copy$default(EmomoQuestOpenEquipmentGacha emomoQuestOpenEquipmentGacha, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = emomoQuestOpenEquipmentGacha.json;
            }
            return emomoQuestOpenEquipmentGacha.copy(str);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("emomo_quest/open_equipment_gacha,");
            byte[] bytes = this.json.getBytes(c.f52772b);
            p.g(bytes, "this as java.lang.String).getBytes(charset)");
            sb2.append(Base64.encodeToString(bytes, 0));
            return sb2.toString();
        }

        public final String component1() {
            return this.json;
        }

        public final EmomoQuestOpenEquipmentGacha copy(String str) {
            p.h(str, "json");
            return new EmomoQuestOpenEquipmentGacha(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmomoQuestOpenEquipmentGacha) && p.c(this.json, ((EmomoQuestOpenEquipmentGacha) obj).json);
        }

        public final String getJson() {
            return this.json;
        }

        public int hashCode() {
            return this.json.hashCode();
        }

        public String toString() {
            return "EmomoQuestOpenEquipmentGacha(json=" + this.json + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoQuestOpenGiftGacha extends MiniGameInput {
        public static final int $stable = 0;
        private final String json;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmomoQuestOpenGiftGacha(String str) {
            super(null);
            p.h(str, "json");
            this.json = str;
        }

        public static /* synthetic */ EmomoQuestOpenGiftGacha copy$default(EmomoQuestOpenGiftGacha emomoQuestOpenGiftGacha, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = emomoQuestOpenGiftGacha.json;
            }
            return emomoQuestOpenGiftGacha.copy(str);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("emomo_quest/open_gift_gacha,");
            byte[] bytes = this.json.getBytes(c.f52772b);
            p.g(bytes, "this as java.lang.String).getBytes(charset)");
            sb2.append(Base64.encodeToString(bytes, 0));
            return sb2.toString();
        }

        public final String component1() {
            return this.json;
        }

        public final EmomoQuestOpenGiftGacha copy(String str) {
            p.h(str, "json");
            return new EmomoQuestOpenGiftGacha(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmomoQuestOpenGiftGacha) && p.c(this.json, ((EmomoQuestOpenGiftGacha) obj).json);
        }

        public final String getJson() {
            return this.json;
        }

        public int hashCode() {
            return this.json.hashCode();
        }

        public String toString() {
            return "EmomoQuestOpenGiftGacha(json=" + this.json + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoRunGameGift extends MiniGameInput {
        public static final int $stable = 8;
        private final com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameGift gameGift;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmomoRunGameGift(com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameGift emomoRunGameGift) {
            super(null);
            p.h(emomoRunGameGift, "gameGift");
            this.gameGift = emomoRunGameGift;
        }

        private final com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameGift component1() {
            return this.gameGift;
        }

        public static /* synthetic */ EmomoRunGameGift copy$default(EmomoRunGameGift emomoRunGameGift, com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameGift emomoRunGameGift2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoRunGameGift2 = emomoRunGameGift.gameGift;
            }
            return emomoRunGameGift.copy(emomoRunGameGift2);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            byte[] bytes = this.gameGift.getName().getBytes(c.f52772b);
            p.g(bytes, "this as java.lang.String).getBytes(charset)");
            return a0.g0(s.m("comment", Integer.valueOf(this.gameGift.getGameGiftId()), this.gameGift.getGameGiftCommand(), Integer.valueOf(this.gameGift.getConsumedScore()), this.gameGift.getProfileImageUrl(), Base64.encodeToString(bytes, 2)), ",", null, null, 0, null, null, 62, null);
        }

        public final EmomoRunGameGift copy(com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameGift emomoRunGameGift) {
            p.h(emomoRunGameGift, "gameGift");
            return new EmomoRunGameGift(emomoRunGameGift);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmomoRunGameGift) && p.c(this.gameGift, ((EmomoRunGameGift) obj).gameGift);
        }

        public int hashCode() {
            return this.gameGift.hashCode();
        }

        public String toString() {
            return "EmomoRunGameGift(gameGift=" + this.gameGift + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoRunGiftGachaCount extends MiniGameInput {
        public static final int $stable = 0;
        private final int gachaCount;

        public EmomoRunGiftGachaCount(int i10) {
            super(null);
            this.gachaCount = i10;
        }

        private final int component1() {
            return this.gachaCount;
        }

        public static /* synthetic */ EmomoRunGiftGachaCount copy$default(EmomoRunGiftGachaCount emomoRunGiftGachaCount, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = emomoRunGiftGachaCount.gachaCount;
            }
            return emomoRunGiftGachaCount.copy(i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "gift_gacha_count," + this.gachaCount;
        }

        public final EmomoRunGiftGachaCount copy(int i10) {
            return new EmomoRunGiftGachaCount(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmomoRunGiftGachaCount) && this.gachaCount == ((EmomoRunGiftGachaCount) obj).gachaCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.gachaCount);
        }

        public String toString() {
            return "EmomoRunGiftGachaCount(gachaCount=" + this.gachaCount + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoRunJump extends MiniGameInput {
        public static final int $stable = 0;
        public static final EmomoRunJump INSTANCE = new EmomoRunJump();

        private EmomoRunJump() {
            super(null);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "jump";
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoRunNextStart extends MiniGameInput {
        public static final int $stable = 0;
        public static final EmomoRunNextStart INSTANCE = new EmomoRunNextStart();

        private EmomoRunNextStart() {
            super(null);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "next_start";
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoRunNextTitle extends MiniGameInput {
        public static final int $stable = 0;
        public static final EmomoRunNextTitle INSTANCE = new EmomoRunNextTitle();

        private EmomoRunNextTitle() {
            super(null);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "next_title";
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoRunResult extends MiniGameInput {
        public static final int $stable = 8;
        private final EmomoRunGameResponse gameResponse;
        private final int previousHighScore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmomoRunResult(EmomoRunGameResponse emomoRunGameResponse, int i10) {
            super(null);
            p.h(emomoRunGameResponse, "gameResponse");
            this.gameResponse = emomoRunGameResponse;
            this.previousHighScore = i10;
        }

        private final EmomoRunGameResponse component1() {
            return this.gameResponse;
        }

        private final int component2() {
            return this.previousHighScore;
        }

        public static /* synthetic */ EmomoRunResult copy$default(EmomoRunResult emomoRunResult, EmomoRunGameResponse emomoRunGameResponse, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                emomoRunGameResponse = emomoRunResult.gameResponse;
            }
            if ((i11 & 2) != 0) {
                i10 = emomoRunResult.previousHighScore;
            }
            return emomoRunResult.copy(emomoRunGameResponse, i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            Object[] objArr = new Object[6];
            objArr[0] = "result";
            objArr[1] = Integer.valueOf(this.gameResponse.getScore());
            objArr[2] = Integer.valueOf(this.gameResponse.getTotalScore());
            objArr[3] = Integer.valueOf(this.gameResponse.getHighScore());
            objArr[4] = Integer.valueOf(this.gameResponse.getRank() > 0 ? this.gameResponse.getRank() : -1);
            objArr[5] = Integer.valueOf(this.gameResponse.getHasNewScore() ? this.gameResponse.getHighScore() - this.previousHighScore : 0);
            return a0.g0(s.m(objArr), ",", null, null, 0, null, null, 62, null);
        }

        public final EmomoRunResult copy(EmomoRunGameResponse emomoRunGameResponse, int i10) {
            p.h(emomoRunGameResponse, "gameResponse");
            return new EmomoRunResult(emomoRunGameResponse, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EmomoRunResult) {
                EmomoRunResult emomoRunResult = (EmomoRunResult) obj;
                return p.c(this.gameResponse, emomoRunResult.gameResponse) && this.previousHighScore == emomoRunResult.previousHighScore;
            }
            return false;
        }

        public int hashCode() {
            return (this.gameResponse.hashCode() * 31) + Integer.hashCode(this.previousHighScore);
        }

        public String toString() {
            return "EmomoRunResult(gameResponse=" + this.gameResponse + ", previousHighScore=" + this.previousHighScore + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class EmomoRunReward extends MiniGameInput {
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

        @Override // com.dena.mirrorman.unity.MiniGameInput
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
    public static final class SetRichUniqueGiftPlayMode extends MiniGameInput {
        public static final int $stable = 0;
        private final boolean isEdit;

        public SetRichUniqueGiftPlayMode(boolean z10) {
            super(null);
            this.isEdit = z10;
        }

        public static /* synthetic */ SetRichUniqueGiftPlayMode copy$default(SetRichUniqueGiftPlayMode setRichUniqueGiftPlayMode, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = setRichUniqueGiftPlayMode.isEdit;
            }
            return setRichUniqueGiftPlayMode.copy(z10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return this.isEdit ? "edit" : "play";
        }

        public final boolean component1() {
            return this.isEdit;
        }

        public final SetRichUniqueGiftPlayMode copy(boolean z10) {
            return new SetRichUniqueGiftPlayMode(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetRichUniqueGiftPlayMode) && this.isEdit == ((SetRichUniqueGiftPlayMode) obj).isEdit;
        }

        public int hashCode() {
            boolean z10 = this.isEdit;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final boolean isEdit() {
            return this.isEdit;
        }

        public String toString() {
            return "SetRichUniqueGiftPlayMode(isEdit=" + this.isEdit + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterCloseGame extends MiniGameInput {
        public static final int $stable = 0;
        public static final ShooterCloseGame INSTANCE = new ShooterCloseGame();

        private ShooterCloseGame() {
            super(null);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "close_game";
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterCloseKeyboard extends MiniGameInput {
        public static final int $stable = 0;
        public static final ShooterCloseKeyboard INSTANCE = new ShooterCloseKeyboard();

        private ShooterCloseKeyboard() {
            super(null);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "close_keyboard";
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterRetireGame extends MiniGameInput {
        public static final int $stable = 0;
        private final int userId;

        public ShooterRetireGame(int i10) {
            super(null);
            this.userId = i10;
        }

        public static /* synthetic */ ShooterRetireGame copy$default(ShooterRetireGame shooterRetireGame, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = shooterRetireGame.userId;
            }
            return shooterRetireGame.copy(i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "retire_game," + this.userId;
        }

        public final int component1() {
            return this.userId;
        }

        public final ShooterRetireGame copy(int i10) {
            return new ShooterRetireGame(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterRetireGame) && this.userId == ((ShooterRetireGame) obj).userId;
        }

        public final int getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return Integer.hashCode(this.userId);
        }

        public String toString() {
            return "ShooterRetireGame(userId=" + this.userId + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterSetAchieveReward extends MiniGameInput {
        public static final int $stable = 8;
        private final ShooterReward reward;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShooterSetAchieveReward(ShooterReward shooterReward) {
            super(null);
            p.h(shooterReward, "reward");
            this.reward = shooterReward;
        }

        public static /* synthetic */ ShooterSetAchieveReward copy$default(ShooterSetAchieveReward shooterSetAchieveReward, ShooterReward shooterReward, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shooterReward = shooterSetAchieveReward.reward;
            }
            return shooterSetAchieveReward.copy(shooterReward);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
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

        public final ShooterSetAchieveReward copy(ShooterReward shooterReward) {
            p.h(shooterReward, "reward");
            return new ShooterSetAchieveReward(shooterReward);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterSetAchieveReward) && p.c(this.reward, ((ShooterSetAchieveReward) obj).reward);
        }

        public final ShooterReward getReward() {
            return this.reward;
        }

        public int hashCode() {
            return this.reward.hashCode();
        }

        public String toString() {
            return "ShooterSetAchieveReward(reward=" + this.reward + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterSetDiarkisAuthInfo extends MiniGameInput {
        public static final int $stable = 8;
        private final DiarkisAuthInfoResponse diarkisAuthInfoResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShooterSetDiarkisAuthInfo(DiarkisAuthInfoResponse diarkisAuthInfoResponse) {
            super(null);
            p.h(diarkisAuthInfoResponse, "diarkisAuthInfoResponse");
            this.diarkisAuthInfoResponse = diarkisAuthInfoResponse;
        }

        private final DiarkisAuthInfoResponse component1() {
            return this.diarkisAuthInfoResponse;
        }

        public static /* synthetic */ ShooterSetDiarkisAuthInfo copy$default(ShooterSetDiarkisAuthInfo shooterSetDiarkisAuthInfo, DiarkisAuthInfoResponse diarkisAuthInfoResponse, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                diarkisAuthInfoResponse = shooterSetDiarkisAuthInfo.diarkisAuthInfoResponse;
            }
            return shooterSetDiarkisAuthInfo.copy(diarkisAuthInfoResponse);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "auth_info," + this.diarkisAuthInfoResponse.getWs() + ',' + this.diarkisAuthInfoResponse.getTcp() + ',' + this.diarkisAuthInfoResponse.getUdp() + ',' + this.diarkisAuthInfoResponse.getSid() + ',' + this.diarkisAuthInfoResponse.getEncryptionKey() + ',' + this.diarkisAuthInfoResponse.getEncryptionIv() + ',' + this.diarkisAuthInfoResponse.getEncryptionMacKey() + ',' + this.diarkisAuthInfoResponse.getClientKey();
        }

        public final ShooterSetDiarkisAuthInfo copy(DiarkisAuthInfoResponse diarkisAuthInfoResponse) {
            p.h(diarkisAuthInfoResponse, "diarkisAuthInfoResponse");
            return new ShooterSetDiarkisAuthInfo(diarkisAuthInfoResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterSetDiarkisAuthInfo) && p.c(this.diarkisAuthInfoResponse, ((ShooterSetDiarkisAuthInfo) obj).diarkisAuthInfoResponse);
        }

        public int hashCode() {
            return this.diarkisAuthInfoResponse.hashCode();
        }

        public String toString() {
            return "ShooterSetDiarkisAuthInfo(diarkisAuthInfoResponse=" + this.diarkisAuthInfoResponse + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterSetRatingAchieveReward extends MiniGameInput {
        public static final int $stable = 8;
        private final ShooterReward reward;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShooterSetRatingAchieveReward(ShooterReward shooterReward) {
            super(null);
            p.h(shooterReward, "reward");
            this.reward = shooterReward;
        }

        public static /* synthetic */ ShooterSetRatingAchieveReward copy$default(ShooterSetRatingAchieveReward shooterSetRatingAchieveReward, ShooterReward shooterReward, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shooterReward = shooterSetRatingAchieveReward.reward;
            }
            return shooterSetRatingAchieveReward.copy(shooterReward);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rating_achieve_reward,");
            sb2.append(this.reward.getThreshold());
            sb2.append(',');
            sb2.append(this.reward.getIconUrl());
            sb2.append(',');
            sb2.append(this.reward.getAchieved() ? "true" : "false");
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

        public final ShooterSetRatingAchieveReward copy(ShooterReward shooterReward) {
            p.h(shooterReward, "reward");
            return new ShooterSetRatingAchieveReward(shooterReward);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterSetRatingAchieveReward) && p.c(this.reward, ((ShooterSetRatingAchieveReward) obj).reward);
        }

        public final ShooterReward getReward() {
            return this.reward;
        }

        public int hashCode() {
            return this.reward.hashCode();
        }

        public String toString() {
            return "ShooterSetRatingAchieveReward(reward=" + this.reward + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterSetResult extends MiniGameInput {
        public static final int $stable = 8;
        private final String resultData;
        private final ShooterUpdateMemberResponse updateMemberResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShooterSetResult(ShooterUpdateMemberResponse shooterUpdateMemberResponse) {
            super(null);
            p.h(shooterUpdateMemberResponse, "updateMemberResponse");
            this.updateMemberResponse = shooterUpdateMemberResponse;
            this.resultData = shooterUpdateMemberResponse.getMemberResultDataString();
        }

        private final ShooterUpdateMemberResponse component1() {
            return this.updateMemberResponse;
        }

        public static /* synthetic */ ShooterSetResult copy$default(ShooterSetResult shooterSetResult, ShooterUpdateMemberResponse shooterUpdateMemberResponse, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shooterUpdateMemberResponse = shooterSetResult.updateMemberResponse;
            }
            return shooterSetResult.copy(shooterUpdateMemberResponse);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "result," + this.resultData;
        }

        public final ShooterSetResult copy(ShooterUpdateMemberResponse shooterUpdateMemberResponse) {
            p.h(shooterUpdateMemberResponse, "updateMemberResponse");
            return new ShooterSetResult(shooterUpdateMemberResponse);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterSetResult) && p.c(this.updateMemberResponse, ((ShooterSetResult) obj).updateMemberResponse);
        }

        public int hashCode() {
            return this.updateMemberResponse.hashCode();
        }

        public String toString() {
            return "ShooterSetResult(updateMemberResponse=" + this.updateMemberResponse + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterSetRoomId extends MiniGameInput {
        public static final int $stable = 0;
        private final String roomId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShooterSetRoomId(String str) {
            super(null);
            p.h(str, "roomId");
            this.roomId = str;
        }

        public static /* synthetic */ ShooterSetRoomId copy$default(ShooterSetRoomId shooterSetRoomId, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = shooterSetRoomId.roomId;
            }
            return shooterSetRoomId.copy(str);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "room_id," + this.roomId;
        }

        public final String component1() {
            return this.roomId;
        }

        public final ShooterSetRoomId copy(String str) {
            p.h(str, "roomId");
            return new ShooterSetRoomId(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShooterSetRoomId) && p.c(this.roomId, ((ShooterSetRoomId) obj).roomId);
        }

        public final String getRoomId() {
            return this.roomId;
        }

        public int hashCode() {
            return this.roomId.hashCode();
        }

        public String toString() {
            return "ShooterSetRoomId(roomId=" + this.roomId + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShooterSetTeamResult extends MiniGameInput {
        public static final int $stable = 8;
        private final int previousTotalRank;
        private final String teamResultData;
        private final ShooterTeamResultResponse teamResultResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShooterSetTeamResult(ShooterTeamResultResponse shooterTeamResultResponse, int i10) {
            super(null);
            p.h(shooterTeamResultResponse, "teamResultResponse");
            this.teamResultResponse = shooterTeamResultResponse;
            this.previousTotalRank = i10;
            this.teamResultData = shooterTeamResultResponse.getTeamResultDataString(i10);
        }

        public static /* synthetic */ ShooterSetTeamResult copy$default(ShooterSetTeamResult shooterSetTeamResult, ShooterTeamResultResponse shooterTeamResultResponse, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                shooterTeamResultResponse = shooterSetTeamResult.teamResultResponse;
            }
            if ((i11 & 2) != 0) {
                i10 = shooterSetTeamResult.previousTotalRank;
            }
            return shooterSetTeamResult.copy(shooterTeamResultResponse, i10);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return "team_result," + this.teamResultData;
        }

        public final ShooterTeamResultResponse component1() {
            return this.teamResultResponse;
        }

        public final int component2() {
            return this.previousTotalRank;
        }

        public final ShooterSetTeamResult copy(ShooterTeamResultResponse shooterTeamResultResponse, int i10) {
            p.h(shooterTeamResultResponse, "teamResultResponse");
            return new ShooterSetTeamResult(shooterTeamResultResponse, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ShooterSetTeamResult) {
                ShooterSetTeamResult shooterSetTeamResult = (ShooterSetTeamResult) obj;
                return p.c(this.teamResultResponse, shooterSetTeamResult.teamResultResponse) && this.previousTotalRank == shooterSetTeamResult.previousTotalRank;
            }
            return false;
        }

        public final int getPreviousTotalRank() {
            return this.previousTotalRank;
        }

        public final ShooterTeamResultResponse getTeamResultResponse() {
            return this.teamResultResponse;
        }

        public int hashCode() {
            return (this.teamResultResponse.hashCode() * 31) + Integer.hashCode(this.previousTotalRank);
        }

        public String toString() {
            return "ShooterSetTeamResult(teamResultResponse=" + this.teamResultResponse + ", previousTotalRank=" + this.previousTotalRank + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class Start extends MiniGameInput {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();

        private Start() {
            super(null);
        }

        @Override // com.dena.mirrorman.unity.MiniGameInput
        public String buildMessage() {
            return TtmlNode.START;
        }
    }

    private MiniGameInput() {
    }

    public /* synthetic */ MiniGameInput(h hVar) {
        this();
    }

    public abstract String buildMessage();
}
