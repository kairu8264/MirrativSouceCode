package com.dena.mirrorman.unity;

import jo.h;
import jo.p;

/* loaded from: classes3.dex */
public abstract class UnityActionEvent {
    public static final int $stable = 0;

    /* loaded from: classes3.dex */
    public static final class FinishMiniGame extends UnityActionEvent {
        public static final int $stable = 0;
        public static final FinishMiniGame INSTANCE = new FinishMiniGame();

        private FinishMiniGame() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class HttpRequestFailed extends UnityActionEvent {
        public static final int $stable = 0;
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HttpRequestFailed(String str) {
            super(null);
            p.h(str, "errorMessage");
            this.errorMessage = str;
        }

        public static /* synthetic */ HttpRequestFailed copy$default(HttpRequestFailed httpRequestFailed, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = httpRequestFailed.errorMessage;
            }
            return httpRequestFailed.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final HttpRequestFailed copy(String str) {
            p.h(str, "errorMessage");
            return new HttpRequestFailed(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HttpRequestFailed) && p.c(this.errorMessage, ((HttpRequestFailed) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "HttpRequestFailed(errorMessage=" + this.errorMessage + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitAssetBundleCompleted extends UnityActionEvent {
        public static final int $stable = 0;
        public static final InitAssetBundleCompleted INSTANCE = new InitAssetBundleCompleted();

        private InitAssetBundleCompleted() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitAssetBundleFailed extends UnityActionEvent {
        public static final int $stable = 0;
        public static final InitAssetBundleFailed INSTANCE = new InitAssetBundleFailed();

        private InitAssetBundleFailed() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitMiniGame extends UnityActionEvent {
        public static final int $stable = 0;
        public static final InitMiniGame INSTANCE = new InitMiniGame();

        private InitMiniGame() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class LiveGiftEffectKeyAnimationFinished extends UnityActionEvent {
        public static final int $stable = 0;
        private final String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LiveGiftEffectKeyAnimationFinished(String str) {
            super(null);
            p.h(str, "key");
            this.key = str;
        }

        public static /* synthetic */ LiveGiftEffectKeyAnimationFinished copy$default(LiveGiftEffectKeyAnimationFinished liveGiftEffectKeyAnimationFinished, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = liveGiftEffectKeyAnimationFinished.key;
            }
            return liveGiftEffectKeyAnimationFinished.copy(str);
        }

        public final String component1() {
            return this.key;
        }

        public final LiveGiftEffectKeyAnimationFinished copy(String str) {
            p.h(str, "key");
            return new LiveGiftEffectKeyAnimationFinished(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LiveGiftEffectKeyAnimationFinished) && p.c(this.key, ((LiveGiftEffectKeyAnimationFinished) obj).key);
        }

        public final String getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "LiveGiftEffectKeyAnimationFinished(key=" + this.key + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class LoadAvatarModelCompleted extends UnityActionEvent {
        public static final int $stable = 0;
        private final UnityLoadAvatarModel loadAvatarModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadAvatarModelCompleted(UnityLoadAvatarModel unityLoadAvatarModel) {
            super(null);
            p.h(unityLoadAvatarModel, "loadAvatarModel");
            this.loadAvatarModel = unityLoadAvatarModel;
        }

        public static /* synthetic */ LoadAvatarModelCompleted copy$default(LoadAvatarModelCompleted loadAvatarModelCompleted, UnityLoadAvatarModel unityLoadAvatarModel, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                unityLoadAvatarModel = loadAvatarModelCompleted.loadAvatarModel;
            }
            return loadAvatarModelCompleted.copy(unityLoadAvatarModel);
        }

        public final UnityLoadAvatarModel component1() {
            return this.loadAvatarModel;
        }

        public final LoadAvatarModelCompleted copy(UnityLoadAvatarModel unityLoadAvatarModel) {
            p.h(unityLoadAvatarModel, "loadAvatarModel");
            return new LoadAvatarModelCompleted(unityLoadAvatarModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadAvatarModelCompleted) && p.c(this.loadAvatarModel, ((LoadAvatarModelCompleted) obj).loadAvatarModel);
        }

        public final UnityLoadAvatarModel getLoadAvatarModel() {
            return this.loadAvatarModel;
        }

        public int hashCode() {
            return this.loadAvatarModel.hashCode();
        }

        public String toString() {
            return "LoadAvatarModelCompleted(loadAvatarModel=" + this.loadAvatarModel + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class LoadAvatarModelFailed extends UnityActionEvent {
        public static final int $stable = 0;
        public static final LoadAvatarModelFailed INSTANCE = new LoadAvatarModelFailed();

        private LoadAvatarModelFailed() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class LoadMiniGameCompleted extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMiniGameCompleted(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ LoadMiniGameCompleted copy$default(LoadMiniGameCompleted loadMiniGameCompleted, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = loadMiniGameCompleted.gameName;
            }
            return loadMiniGameCompleted.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final LoadMiniGameCompleted copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new LoadMiniGameCompleted(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadMiniGameCompleted) && this.gameName == ((LoadMiniGameCompleted) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "LoadMiniGameCompleted(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class LoadMiniGameFailed extends UnityActionEvent {
        public static final int $stable = 0;
        public static final LoadMiniGameFailed INSTANCE = new LoadMiniGameFailed();

        private LoadMiniGameFailed() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputAnalysisLog extends UnityActionEvent {
        public static final int $stable = 0;
        private final ShooterAnalysisLogPayload analysisLog;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputAnalysisLog(EmomoGameName emomoGameName, ShooterAnalysisLogPayload shooterAnalysisLogPayload) {
            super(null);
            p.h(emomoGameName, "gameName");
            p.h(shooterAnalysisLogPayload, "analysisLog");
            this.gameName = emomoGameName;
            this.analysisLog = shooterAnalysisLogPayload;
        }

        public static /* synthetic */ MiniGameOutputAnalysisLog copy$default(MiniGameOutputAnalysisLog miniGameOutputAnalysisLog, EmomoGameName emomoGameName, ShooterAnalysisLogPayload shooterAnalysisLogPayload, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputAnalysisLog.gameName;
            }
            if ((i10 & 2) != 0) {
                shooterAnalysisLogPayload = miniGameOutputAnalysisLog.analysisLog;
            }
            return miniGameOutputAnalysisLog.copy(emomoGameName, shooterAnalysisLogPayload);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final ShooterAnalysisLogPayload component2() {
            return this.analysisLog;
        }

        public final MiniGameOutputAnalysisLog copy(EmomoGameName emomoGameName, ShooterAnalysisLogPayload shooterAnalysisLogPayload) {
            p.h(emomoGameName, "gameName");
            p.h(shooterAnalysisLogPayload, "analysisLog");
            return new MiniGameOutputAnalysisLog(emomoGameName, shooterAnalysisLogPayload);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputAnalysisLog) {
                MiniGameOutputAnalysisLog miniGameOutputAnalysisLog = (MiniGameOutputAnalysisLog) obj;
                return this.gameName == miniGameOutputAnalysisLog.gameName && p.c(this.analysisLog, miniGameOutputAnalysisLog.analysisLog);
            }
            return false;
        }

        public final ShooterAnalysisLogPayload getAnalysisLog() {
            return this.analysisLog;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + this.analysisLog.hashCode();
        }

        public String toString() {
            return "MiniGameOutputAnalysisLog(gameName=" + this.gameName + ", analysisLog=" + this.analysisLog + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputCloseGame extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputCloseGame(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputCloseGame copy$default(MiniGameOutputCloseGame miniGameOutputCloseGame, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputCloseGame.gameName;
            }
            return miniGameOutputCloseGame.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputCloseGame copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputCloseGame(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputCloseGame) && this.gameName == ((MiniGameOutputCloseGame) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputCloseGame(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoQuestLog extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;
        private final UnityMiniGameOutputEmomoQuestLog log;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoQuestLog(EmomoGameName emomoGameName, UnityMiniGameOutputEmomoQuestLog unityMiniGameOutputEmomoQuestLog) {
            super(null);
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameOutputEmomoQuestLog, "log");
            this.gameName = emomoGameName;
            this.log = unityMiniGameOutputEmomoQuestLog;
        }

        public static /* synthetic */ MiniGameOutputEmomoQuestLog copy$default(MiniGameOutputEmomoQuestLog miniGameOutputEmomoQuestLog, EmomoGameName emomoGameName, UnityMiniGameOutputEmomoQuestLog unityMiniGameOutputEmomoQuestLog, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoQuestLog.gameName;
            }
            if ((i10 & 2) != 0) {
                unityMiniGameOutputEmomoQuestLog = miniGameOutputEmomoQuestLog.log;
            }
            return miniGameOutputEmomoQuestLog.copy(emomoGameName, unityMiniGameOutputEmomoQuestLog);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final UnityMiniGameOutputEmomoQuestLog component2() {
            return this.log;
        }

        public final MiniGameOutputEmomoQuestLog copy(EmomoGameName emomoGameName, UnityMiniGameOutputEmomoQuestLog unityMiniGameOutputEmomoQuestLog) {
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameOutputEmomoQuestLog, "log");
            return new MiniGameOutputEmomoQuestLog(emomoGameName, unityMiniGameOutputEmomoQuestLog);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputEmomoQuestLog) {
                MiniGameOutputEmomoQuestLog miniGameOutputEmomoQuestLog = (MiniGameOutputEmomoQuestLog) obj;
                return this.gameName == miniGameOutputEmomoQuestLog.gameName && p.c(this.log, miniGameOutputEmomoQuestLog.log);
            }
            return false;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public final UnityMiniGameOutputEmomoQuestLog getLog() {
            return this.log;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + this.log.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoQuestLog(gameName=" + this.gameName + ", log=" + this.log + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoQuestOpenEquipmentGacha extends UnityActionEvent {
        public static final int $stable = 0;
        private final int gachaType;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoQuestOpenEquipmentGacha(EmomoGameName emomoGameName, int i10) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
            this.gachaType = i10;
        }

        public static /* synthetic */ MiniGameOutputEmomoQuestOpenEquipmentGacha copy$default(MiniGameOutputEmomoQuestOpenEquipmentGacha miniGameOutputEmomoQuestOpenEquipmentGacha, EmomoGameName emomoGameName, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoQuestOpenEquipmentGacha.gameName;
            }
            if ((i11 & 2) != 0) {
                i10 = miniGameOutputEmomoQuestOpenEquipmentGacha.gachaType;
            }
            return miniGameOutputEmomoQuestOpenEquipmentGacha.copy(emomoGameName, i10);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final int component2() {
            return this.gachaType;
        }

        public final MiniGameOutputEmomoQuestOpenEquipmentGacha copy(EmomoGameName emomoGameName, int i10) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoQuestOpenEquipmentGacha(emomoGameName, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputEmomoQuestOpenEquipmentGacha) {
                MiniGameOutputEmomoQuestOpenEquipmentGacha miniGameOutputEmomoQuestOpenEquipmentGacha = (MiniGameOutputEmomoQuestOpenEquipmentGacha) obj;
                return this.gameName == miniGameOutputEmomoQuestOpenEquipmentGacha.gameName && this.gachaType == miniGameOutputEmomoQuestOpenEquipmentGacha.gachaType;
            }
            return false;
        }

        public final int getGachaType() {
            return this.gachaType;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + Integer.hashCode(this.gachaType);
        }

        public String toString() {
            return "MiniGameOutputEmomoQuestOpenEquipmentGacha(gameName=" + this.gameName + ", gachaType=" + this.gachaType + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted copy$default(MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted miniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted.gameName;
            }
            return miniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted) && this.gameName == ((MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoQuestOpenGiftGacha extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoQuestOpenGiftGacha(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoQuestOpenGiftGacha copy$default(MiniGameOutputEmomoQuestOpenGiftGacha miniGameOutputEmomoQuestOpenGiftGacha, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoQuestOpenGiftGacha.gameName;
            }
            return miniGameOutputEmomoQuestOpenGiftGacha.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoQuestOpenGiftGacha copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoQuestOpenGiftGacha(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoQuestOpenGiftGacha) && this.gameName == ((MiniGameOutputEmomoQuestOpenGiftGacha) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoQuestOpenGiftGacha(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoQuestTouchHelp extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;
        private final String lpUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoQuestTouchHelp(EmomoGameName emomoGameName, String str) {
            super(null);
            p.h(emomoGameName, "gameName");
            p.h(str, "lpUrl");
            this.gameName = emomoGameName;
            this.lpUrl = str;
        }

        public static /* synthetic */ MiniGameOutputEmomoQuestTouchHelp copy$default(MiniGameOutputEmomoQuestTouchHelp miniGameOutputEmomoQuestTouchHelp, EmomoGameName emomoGameName, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoQuestTouchHelp.gameName;
            }
            if ((i10 & 2) != 0) {
                str = miniGameOutputEmomoQuestTouchHelp.lpUrl;
            }
            return miniGameOutputEmomoQuestTouchHelp.copy(emomoGameName, str);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final String component2() {
            return this.lpUrl;
        }

        public final MiniGameOutputEmomoQuestTouchHelp copy(EmomoGameName emomoGameName, String str) {
            p.h(emomoGameName, "gameName");
            p.h(str, "lpUrl");
            return new MiniGameOutputEmomoQuestTouchHelp(emomoGameName, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputEmomoQuestTouchHelp) {
                MiniGameOutputEmomoQuestTouchHelp miniGameOutputEmomoQuestTouchHelp = (MiniGameOutputEmomoQuestTouchHelp) obj;
                return this.gameName == miniGameOutputEmomoQuestTouchHelp.gameName && p.c(this.lpUrl, miniGameOutputEmomoQuestTouchHelp.lpUrl);
            }
            return false;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public final String getLpUrl() {
            return this.lpUrl;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + this.lpUrl.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoQuestTouchHelp(gameName=" + this.gameName + ", lpUrl=" + this.lpUrl + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoQuestTouchResultRanking extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;
        private final int gameNo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoQuestTouchResultRanking(EmomoGameName emomoGameName, int i10) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
            this.gameNo = i10;
        }

        public static /* synthetic */ MiniGameOutputEmomoQuestTouchResultRanking copy$default(MiniGameOutputEmomoQuestTouchResultRanking miniGameOutputEmomoQuestTouchResultRanking, EmomoGameName emomoGameName, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoQuestTouchResultRanking.gameName;
            }
            if ((i11 & 2) != 0) {
                i10 = miniGameOutputEmomoQuestTouchResultRanking.gameNo;
            }
            return miniGameOutputEmomoQuestTouchResultRanking.copy(emomoGameName, i10);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final int component2() {
            return this.gameNo;
        }

        public final MiniGameOutputEmomoQuestTouchResultRanking copy(EmomoGameName emomoGameName, int i10) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoQuestTouchResultRanking(emomoGameName, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputEmomoQuestTouchResultRanking) {
                MiniGameOutputEmomoQuestTouchResultRanking miniGameOutputEmomoQuestTouchResultRanking = (MiniGameOutputEmomoQuestTouchResultRanking) obj;
                return this.gameName == miniGameOutputEmomoQuestTouchResultRanking.gameName && this.gameNo == miniGameOutputEmomoQuestTouchResultRanking.gameNo;
            }
            return false;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public final int getGameNo() {
            return this.gameNo;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + Integer.hashCode(this.gameNo);
        }

        public String toString() {
            return "MiniGameOutputEmomoQuestTouchResultRanking(gameName=" + this.gameName + ", gameNo=" + this.gameNo + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoQuestTouchResultShare extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;
        private final int gameNo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoQuestTouchResultShare(EmomoGameName emomoGameName, int i10) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
            this.gameNo = i10;
        }

        public static /* synthetic */ MiniGameOutputEmomoQuestTouchResultShare copy$default(MiniGameOutputEmomoQuestTouchResultShare miniGameOutputEmomoQuestTouchResultShare, EmomoGameName emomoGameName, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoQuestTouchResultShare.gameName;
            }
            if ((i11 & 2) != 0) {
                i10 = miniGameOutputEmomoQuestTouchResultShare.gameNo;
            }
            return miniGameOutputEmomoQuestTouchResultShare.copy(emomoGameName, i10);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final int component2() {
            return this.gameNo;
        }

        public final MiniGameOutputEmomoQuestTouchResultShare copy(EmomoGameName emomoGameName, int i10) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoQuestTouchResultShare(emomoGameName, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputEmomoQuestTouchResultShare) {
                MiniGameOutputEmomoQuestTouchResultShare miniGameOutputEmomoQuestTouchResultShare = (MiniGameOutputEmomoQuestTouchResultShare) obj;
                return this.gameName == miniGameOutputEmomoQuestTouchResultShare.gameName && this.gameNo == miniGameOutputEmomoQuestTouchResultShare.gameNo;
            }
            return false;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public final int getGameNo() {
            return this.gameNo;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + Integer.hashCode(this.gameNo);
        }

        public String toString() {
            return "MiniGameOutputEmomoQuestTouchResultShare(gameName=" + this.gameName + ", gameNo=" + this.gameNo + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoQuestTouchTitleRanking extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoQuestTouchTitleRanking(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoQuestTouchTitleRanking copy$default(MiniGameOutputEmomoQuestTouchTitleRanking miniGameOutputEmomoQuestTouchTitleRanking, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoQuestTouchTitleRanking.gameName;
            }
            return miniGameOutputEmomoQuestTouchTitleRanking.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoQuestTouchTitleRanking copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoQuestTouchTitleRanking(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoQuestTouchTitleRanking) && this.gameName == ((MiniGameOutputEmomoQuestTouchTitleRanking) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoQuestTouchTitleRanking(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunConsumeGift extends UnityActionEvent {
        public static final int $stable = 0;
        private final UnityMiniGameOutputEmomoRunConsumeGift consumeGift;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunConsumeGift(EmomoGameName emomoGameName, UnityMiniGameOutputEmomoRunConsumeGift unityMiniGameOutputEmomoRunConsumeGift) {
            super(null);
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameOutputEmomoRunConsumeGift, "consumeGift");
            this.gameName = emomoGameName;
            this.consumeGift = unityMiniGameOutputEmomoRunConsumeGift;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunConsumeGift copy$default(MiniGameOutputEmomoRunConsumeGift miniGameOutputEmomoRunConsumeGift, EmomoGameName emomoGameName, UnityMiniGameOutputEmomoRunConsumeGift unityMiniGameOutputEmomoRunConsumeGift, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunConsumeGift.gameName;
            }
            if ((i10 & 2) != 0) {
                unityMiniGameOutputEmomoRunConsumeGift = miniGameOutputEmomoRunConsumeGift.consumeGift;
            }
            return miniGameOutputEmomoRunConsumeGift.copy(emomoGameName, unityMiniGameOutputEmomoRunConsumeGift);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final UnityMiniGameOutputEmomoRunConsumeGift component2() {
            return this.consumeGift;
        }

        public final MiniGameOutputEmomoRunConsumeGift copy(EmomoGameName emomoGameName, UnityMiniGameOutputEmomoRunConsumeGift unityMiniGameOutputEmomoRunConsumeGift) {
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameOutputEmomoRunConsumeGift, "consumeGift");
            return new MiniGameOutputEmomoRunConsumeGift(emomoGameName, unityMiniGameOutputEmomoRunConsumeGift);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputEmomoRunConsumeGift) {
                MiniGameOutputEmomoRunConsumeGift miniGameOutputEmomoRunConsumeGift = (MiniGameOutputEmomoRunConsumeGift) obj;
                return this.gameName == miniGameOutputEmomoRunConsumeGift.gameName && p.c(this.consumeGift, miniGameOutputEmomoRunConsumeGift.consumeGift);
            }
            return false;
        }

        public final UnityMiniGameOutputEmomoRunConsumeGift getConsumeGift() {
            return this.consumeGift;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + this.consumeGift.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunConsumeGift(gameName=" + this.gameName + ", consumeGift=" + this.consumeGift + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunGameOver extends UnityActionEvent {
        public static final int $stable = 8;
        private final EmomoGameName gameName;
        private final UnityMiniGameOutputEmomoRunGameOver gameOver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunGameOver(EmomoGameName emomoGameName, UnityMiniGameOutputEmomoRunGameOver unityMiniGameOutputEmomoRunGameOver) {
            super(null);
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameOutputEmomoRunGameOver, "gameOver");
            this.gameName = emomoGameName;
            this.gameOver = unityMiniGameOutputEmomoRunGameOver;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunGameOver copy$default(MiniGameOutputEmomoRunGameOver miniGameOutputEmomoRunGameOver, EmomoGameName emomoGameName, UnityMiniGameOutputEmomoRunGameOver unityMiniGameOutputEmomoRunGameOver, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunGameOver.gameName;
            }
            if ((i10 & 2) != 0) {
                unityMiniGameOutputEmomoRunGameOver = miniGameOutputEmomoRunGameOver.gameOver;
            }
            return miniGameOutputEmomoRunGameOver.copy(emomoGameName, unityMiniGameOutputEmomoRunGameOver);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final UnityMiniGameOutputEmomoRunGameOver component2() {
            return this.gameOver;
        }

        public final MiniGameOutputEmomoRunGameOver copy(EmomoGameName emomoGameName, UnityMiniGameOutputEmomoRunGameOver unityMiniGameOutputEmomoRunGameOver) {
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameOutputEmomoRunGameOver, "gameOver");
            return new MiniGameOutputEmomoRunGameOver(emomoGameName, unityMiniGameOutputEmomoRunGameOver);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputEmomoRunGameOver) {
                MiniGameOutputEmomoRunGameOver miniGameOutputEmomoRunGameOver = (MiniGameOutputEmomoRunGameOver) obj;
                return this.gameName == miniGameOutputEmomoRunGameOver.gameName && p.c(this.gameOver, miniGameOutputEmomoRunGameOver.gameOver);
            }
            return false;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public final UnityMiniGameOutputEmomoRunGameOver getGameOver() {
            return this.gameOver;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + this.gameOver.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunGameOver(gameName=" + this.gameName + ", gameOver=" + this.gameOver + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunHeartBeat extends UnityActionEvent {
        public static final int $stable = 8;
        private final EmomoGameName gameName;
        private final UnityMiniGameOutputEmomoRunHeartBeat heartBeat;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunHeartBeat(EmomoGameName emomoGameName, UnityMiniGameOutputEmomoRunHeartBeat unityMiniGameOutputEmomoRunHeartBeat) {
            super(null);
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameOutputEmomoRunHeartBeat, "heartBeat");
            this.gameName = emomoGameName;
            this.heartBeat = unityMiniGameOutputEmomoRunHeartBeat;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunHeartBeat copy$default(MiniGameOutputEmomoRunHeartBeat miniGameOutputEmomoRunHeartBeat, EmomoGameName emomoGameName, UnityMiniGameOutputEmomoRunHeartBeat unityMiniGameOutputEmomoRunHeartBeat, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunHeartBeat.gameName;
            }
            if ((i10 & 2) != 0) {
                unityMiniGameOutputEmomoRunHeartBeat = miniGameOutputEmomoRunHeartBeat.heartBeat;
            }
            return miniGameOutputEmomoRunHeartBeat.copy(emomoGameName, unityMiniGameOutputEmomoRunHeartBeat);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final UnityMiniGameOutputEmomoRunHeartBeat component2() {
            return this.heartBeat;
        }

        public final MiniGameOutputEmomoRunHeartBeat copy(EmomoGameName emomoGameName, UnityMiniGameOutputEmomoRunHeartBeat unityMiniGameOutputEmomoRunHeartBeat) {
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameOutputEmomoRunHeartBeat, "heartBeat");
            return new MiniGameOutputEmomoRunHeartBeat(emomoGameName, unityMiniGameOutputEmomoRunHeartBeat);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputEmomoRunHeartBeat) {
                MiniGameOutputEmomoRunHeartBeat miniGameOutputEmomoRunHeartBeat = (MiniGameOutputEmomoRunHeartBeat) obj;
                return this.gameName == miniGameOutputEmomoRunHeartBeat.gameName && p.c(this.heartBeat, miniGameOutputEmomoRunHeartBeat.heartBeat);
            }
            return false;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public final UnityMiniGameOutputEmomoRunHeartBeat getHeartBeat() {
            return this.heartBeat;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + this.heartBeat.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunHeartBeat(gameName=" + this.gameName + ", heartBeat=" + this.heartBeat + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunOpenGiftGacha extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunOpenGiftGacha(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunOpenGiftGacha copy$default(MiniGameOutputEmomoRunOpenGiftGacha miniGameOutputEmomoRunOpenGiftGacha, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunOpenGiftGacha.gameName;
            }
            return miniGameOutputEmomoRunOpenGiftGacha.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoRunOpenGiftGacha copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoRunOpenGiftGacha(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoRunOpenGiftGacha) && this.gameName == ((MiniGameOutputEmomoRunOpenGiftGacha) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunOpenGiftGacha(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunOpenGiftTreasure extends UnityActionEvent {
        public static final int $stable = 0;
        private final int gameGiftId;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunOpenGiftTreasure(EmomoGameName emomoGameName, int i10) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
            this.gameGiftId = i10;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunOpenGiftTreasure copy$default(MiniGameOutputEmomoRunOpenGiftTreasure miniGameOutputEmomoRunOpenGiftTreasure, EmomoGameName emomoGameName, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunOpenGiftTreasure.gameName;
            }
            if ((i11 & 2) != 0) {
                i10 = miniGameOutputEmomoRunOpenGiftTreasure.gameGiftId;
            }
            return miniGameOutputEmomoRunOpenGiftTreasure.copy(emomoGameName, i10);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final int component2() {
            return this.gameGiftId;
        }

        public final MiniGameOutputEmomoRunOpenGiftTreasure copy(EmomoGameName emomoGameName, int i10) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoRunOpenGiftTreasure(emomoGameName, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputEmomoRunOpenGiftTreasure) {
                MiniGameOutputEmomoRunOpenGiftTreasure miniGameOutputEmomoRunOpenGiftTreasure = (MiniGameOutputEmomoRunOpenGiftTreasure) obj;
                return this.gameName == miniGameOutputEmomoRunOpenGiftTreasure.gameName && this.gameGiftId == miniGameOutputEmomoRunOpenGiftTreasure.gameGiftId;
            }
            return false;
        }

        public final int getGameGiftId() {
            return this.gameGiftId;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + Integer.hashCode(this.gameGiftId);
        }

        public String toString() {
            return "MiniGameOutputEmomoRunOpenGiftTreasure(gameName=" + this.gameName + ", gameGiftId=" + this.gameGiftId + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunTouchHelp extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunTouchHelp(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunTouchHelp copy$default(MiniGameOutputEmomoRunTouchHelp miniGameOutputEmomoRunTouchHelp, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunTouchHelp.gameName;
            }
            return miniGameOutputEmomoRunTouchHelp.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoRunTouchHelp copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoRunTouchHelp(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoRunTouchHelp) && this.gameName == ((MiniGameOutputEmomoRunTouchHelp) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunTouchHelp(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunTouchPlaying extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunTouchPlaying(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunTouchPlaying copy$default(MiniGameOutputEmomoRunTouchPlaying miniGameOutputEmomoRunTouchPlaying, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunTouchPlaying.gameName;
            }
            return miniGameOutputEmomoRunTouchPlaying.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoRunTouchPlaying copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoRunTouchPlaying(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoRunTouchPlaying) && this.gameName == ((MiniGameOutputEmomoRunTouchPlaying) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunTouchPlaying(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunTouchResultNextStart extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunTouchResultNextStart(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunTouchResultNextStart copy$default(MiniGameOutputEmomoRunTouchResultNextStart miniGameOutputEmomoRunTouchResultNextStart, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunTouchResultNextStart.gameName;
            }
            return miniGameOutputEmomoRunTouchResultNextStart.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoRunTouchResultNextStart copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoRunTouchResultNextStart(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoRunTouchResultNextStart) && this.gameName == ((MiniGameOutputEmomoRunTouchResultNextStart) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunTouchResultNextStart(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunTouchResultNextTitle extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunTouchResultNextTitle(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunTouchResultNextTitle copy$default(MiniGameOutputEmomoRunTouchResultNextTitle miniGameOutputEmomoRunTouchResultNextTitle, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunTouchResultNextTitle.gameName;
            }
            return miniGameOutputEmomoRunTouchResultNextTitle.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoRunTouchResultNextTitle copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoRunTouchResultNextTitle(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoRunTouchResultNextTitle) && this.gameName == ((MiniGameOutputEmomoRunTouchResultNextTitle) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunTouchResultNextTitle(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunTouchResultRanking extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunTouchResultRanking(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunTouchResultRanking copy$default(MiniGameOutputEmomoRunTouchResultRanking miniGameOutputEmomoRunTouchResultRanking, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunTouchResultRanking.gameName;
            }
            return miniGameOutputEmomoRunTouchResultRanking.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoRunTouchResultRanking copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoRunTouchResultRanking(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoRunTouchResultRanking) && this.gameName == ((MiniGameOutputEmomoRunTouchResultRanking) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunTouchResultRanking(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunTouchResultShare extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunTouchResultShare(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunTouchResultShare copy$default(MiniGameOutputEmomoRunTouchResultShare miniGameOutputEmomoRunTouchResultShare, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunTouchResultShare.gameName;
            }
            return miniGameOutputEmomoRunTouchResultShare.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoRunTouchResultShare copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoRunTouchResultShare(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoRunTouchResultShare) && this.gameName == ((MiniGameOutputEmomoRunTouchResultShare) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunTouchResultShare(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunTouchTitle extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunTouchTitle(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunTouchTitle copy$default(MiniGameOutputEmomoRunTouchTitle miniGameOutputEmomoRunTouchTitle, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunTouchTitle.gameName;
            }
            return miniGameOutputEmomoRunTouchTitle.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoRunTouchTitle copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoRunTouchTitle(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoRunTouchTitle) && this.gameName == ((MiniGameOutputEmomoRunTouchTitle) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunTouchTitle(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputEmomoRunTouchTitleRanking extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputEmomoRunTouchTitleRanking(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputEmomoRunTouchTitleRanking copy$default(MiniGameOutputEmomoRunTouchTitleRanking miniGameOutputEmomoRunTouchTitleRanking, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputEmomoRunTouchTitleRanking.gameName;
            }
            return miniGameOutputEmomoRunTouchTitleRanking.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputEmomoRunTouchTitleRanking copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputEmomoRunTouchTitleRanking(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputEmomoRunTouchTitleRanking) && this.gameName == ((MiniGameOutputEmomoRunTouchTitleRanking) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputEmomoRunTouchTitleRanking(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputHideComment extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputHideComment(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputHideComment copy$default(MiniGameOutputHideComment miniGameOutputHideComment, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputHideComment.gameName;
            }
            return miniGameOutputHideComment.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputHideComment copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputHideComment(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputHideComment) && this.gameName == ((MiniGameOutputHideComment) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputHideComment(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputNotifyRoomId extends UnityActionEvent {
        public static final int $stable = 0;
        private final ShooterNotifyRoomId notifyRoomId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputNotifyRoomId(ShooterNotifyRoomId shooterNotifyRoomId) {
            super(null);
            p.h(shooterNotifyRoomId, "notifyRoomId");
            this.notifyRoomId = shooterNotifyRoomId;
        }

        public static /* synthetic */ MiniGameOutputNotifyRoomId copy$default(MiniGameOutputNotifyRoomId miniGameOutputNotifyRoomId, ShooterNotifyRoomId shooterNotifyRoomId, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                shooterNotifyRoomId = miniGameOutputNotifyRoomId.notifyRoomId;
            }
            return miniGameOutputNotifyRoomId.copy(shooterNotifyRoomId);
        }

        public final ShooterNotifyRoomId component1() {
            return this.notifyRoomId;
        }

        public final MiniGameOutputNotifyRoomId copy(ShooterNotifyRoomId shooterNotifyRoomId) {
            p.h(shooterNotifyRoomId, "notifyRoomId");
            return new MiniGameOutputNotifyRoomId(shooterNotifyRoomId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputNotifyRoomId) && p.c(this.notifyRoomId, ((MiniGameOutputNotifyRoomId) obj).notifyRoomId);
        }

        public final ShooterNotifyRoomId getNotifyRoomId() {
            return this.notifyRoomId;
        }

        public int hashCode() {
            return this.notifyRoomId.hashCode();
        }

        public String toString() {
            return "MiniGameOutputNotifyRoomId(notifyRoomId=" + this.notifyRoomId + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputOpenGiftGachaLp extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;
        private final String lpUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputOpenGiftGachaLp(EmomoGameName emomoGameName, String str) {
            super(null);
            p.h(emomoGameName, "gameName");
            p.h(str, "lpUrl");
            this.gameName = emomoGameName;
            this.lpUrl = str;
        }

        public static /* synthetic */ MiniGameOutputOpenGiftGachaLp copy$default(MiniGameOutputOpenGiftGachaLp miniGameOutputOpenGiftGachaLp, EmomoGameName emomoGameName, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputOpenGiftGachaLp.gameName;
            }
            if ((i10 & 2) != 0) {
                str = miniGameOutputOpenGiftGachaLp.lpUrl;
            }
            return miniGameOutputOpenGiftGachaLp.copy(emomoGameName, str);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final String component2() {
            return this.lpUrl;
        }

        public final MiniGameOutputOpenGiftGachaLp copy(EmomoGameName emomoGameName, String str) {
            p.h(emomoGameName, "gameName");
            p.h(str, "lpUrl");
            return new MiniGameOutputOpenGiftGachaLp(emomoGameName, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputOpenGiftGachaLp) {
                MiniGameOutputOpenGiftGachaLp miniGameOutputOpenGiftGachaLp = (MiniGameOutputOpenGiftGachaLp) obj;
                return this.gameName == miniGameOutputOpenGiftGachaLp.gameName && p.c(this.lpUrl, miniGameOutputOpenGiftGachaLp.lpUrl);
            }
            return false;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public final String getLpUrl() {
            return this.lpUrl;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + this.lpUrl.hashCode();
        }

        public String toString() {
            return "MiniGameOutputOpenGiftGachaLp(gameName=" + this.gameName + ", lpUrl=" + this.lpUrl + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputPlaying extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputPlaying(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputPlaying copy$default(MiniGameOutputPlaying miniGameOutputPlaying, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputPlaying.gameName;
            }
            return miniGameOutputPlaying.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputPlaying copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputPlaying(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputPlaying) && this.gameName == ((MiniGameOutputPlaying) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputPlaying(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputRequestAuthInfo extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputRequestAuthInfo(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputRequestAuthInfo copy$default(MiniGameOutputRequestAuthInfo miniGameOutputRequestAuthInfo, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputRequestAuthInfo.gameName;
            }
            return miniGameOutputRequestAuthInfo.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputRequestAuthInfo copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputRequestAuthInfo(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputRequestAuthInfo) && this.gameName == ((MiniGameOutputRequestAuthInfo) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputRequestAuthInfo(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputResult extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;
        private final UnityMiniGameResult miniGameResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputResult(EmomoGameName emomoGameName, UnityMiniGameResult unityMiniGameResult) {
            super(null);
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameResult, "miniGameResult");
            this.gameName = emomoGameName;
            this.miniGameResult = unityMiniGameResult;
        }

        public static /* synthetic */ MiniGameOutputResult copy$default(MiniGameOutputResult miniGameOutputResult, EmomoGameName emomoGameName, UnityMiniGameResult unityMiniGameResult, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputResult.gameName;
            }
            if ((i10 & 2) != 0) {
                unityMiniGameResult = miniGameOutputResult.miniGameResult;
            }
            return miniGameOutputResult.copy(emomoGameName, unityMiniGameResult);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final UnityMiniGameResult component2() {
            return this.miniGameResult;
        }

        public final MiniGameOutputResult copy(EmomoGameName emomoGameName, UnityMiniGameResult unityMiniGameResult) {
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameResult, "miniGameResult");
            return new MiniGameOutputResult(emomoGameName, unityMiniGameResult);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputResult) {
                MiniGameOutputResult miniGameOutputResult = (MiniGameOutputResult) obj;
                return this.gameName == miniGameOutputResult.gameName && p.c(this.miniGameResult, miniGameOutputResult.miniGameResult);
            }
            return false;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public final UnityMiniGameResult getMiniGameResult() {
            return this.miniGameResult;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + this.miniGameResult.hashCode();
        }

        public String toString() {
            return "MiniGameOutputResult(gameName=" + this.gameName + ", miniGameResult=" + this.miniGameResult + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputShooterGameOver extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;
        private final UnityMiniGameOutputShooterGameOver gameOver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputShooterGameOver(EmomoGameName emomoGameName, UnityMiniGameOutputShooterGameOver unityMiniGameOutputShooterGameOver) {
            super(null);
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameOutputShooterGameOver, "gameOver");
            this.gameName = emomoGameName;
            this.gameOver = unityMiniGameOutputShooterGameOver;
        }

        public static /* synthetic */ MiniGameOutputShooterGameOver copy$default(MiniGameOutputShooterGameOver miniGameOutputShooterGameOver, EmomoGameName emomoGameName, UnityMiniGameOutputShooterGameOver unityMiniGameOutputShooterGameOver, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputShooterGameOver.gameName;
            }
            if ((i10 & 2) != 0) {
                unityMiniGameOutputShooterGameOver = miniGameOutputShooterGameOver.gameOver;
            }
            return miniGameOutputShooterGameOver.copy(emomoGameName, unityMiniGameOutputShooterGameOver);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final UnityMiniGameOutputShooterGameOver component2() {
            return this.gameOver;
        }

        public final MiniGameOutputShooterGameOver copy(EmomoGameName emomoGameName, UnityMiniGameOutputShooterGameOver unityMiniGameOutputShooterGameOver) {
            p.h(emomoGameName, "gameName");
            p.h(unityMiniGameOutputShooterGameOver, "gameOver");
            return new MiniGameOutputShooterGameOver(emomoGameName, unityMiniGameOutputShooterGameOver);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputShooterGameOver) {
                MiniGameOutputShooterGameOver miniGameOutputShooterGameOver = (MiniGameOutputShooterGameOver) obj;
                return this.gameName == miniGameOutputShooterGameOver.gameName && p.c(this.gameOver, miniGameOutputShooterGameOver.gameOver);
            }
            return false;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public final UnityMiniGameOutputShooterGameOver getGameOver() {
            return this.gameOver;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + this.gameOver.hashCode();
        }

        public String toString() {
            return "MiniGameOutputShooterGameOver(gameName=" + this.gameName + ", gameOver=" + this.gameOver + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputShowComment extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputShowComment(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputShowComment copy$default(MiniGameOutputShowComment miniGameOutputShowComment, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputShowComment.gameName;
            }
            return miniGameOutputShowComment.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputShowComment copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputShowComment(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputShowComment) && this.gameName == ((MiniGameOutputShowComment) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputShowComment(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputStarted extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputStarted(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputStarted copy$default(MiniGameOutputStarted miniGameOutputStarted, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputStarted.gameName;
            }
            return miniGameOutputStarted.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputStarted copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputStarted(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputStarted) && this.gameName == ((MiniGameOutputStarted) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputStarted(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputUpdateAvatar extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;
        private final int updatePart;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputUpdateAvatar(EmomoGameName emomoGameName, int i10) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
            this.updatePart = i10;
        }

        public static /* synthetic */ MiniGameOutputUpdateAvatar copy$default(MiniGameOutputUpdateAvatar miniGameOutputUpdateAvatar, EmomoGameName emomoGameName, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                emomoGameName = miniGameOutputUpdateAvatar.gameName;
            }
            if ((i11 & 2) != 0) {
                i10 = miniGameOutputUpdateAvatar.updatePart;
            }
            return miniGameOutputUpdateAvatar.copy(emomoGameName, i10);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final int component2() {
            return this.updatePart;
        }

        public final MiniGameOutputUpdateAvatar copy(EmomoGameName emomoGameName, int i10) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputUpdateAvatar(emomoGameName, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MiniGameOutputUpdateAvatar) {
                MiniGameOutputUpdateAvatar miniGameOutputUpdateAvatar = (MiniGameOutputUpdateAvatar) obj;
                return this.gameName == miniGameOutputUpdateAvatar.gameName && this.updatePart == miniGameOutputUpdateAvatar.updatePart;
            }
            return false;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public final int getUpdatePart() {
            return this.updatePart;
        }

        public int hashCode() {
            return (this.gameName.hashCode() * 31) + Integer.hashCode(this.updatePart);
        }

        public String toString() {
            return "MiniGameOutputUpdateAvatar(gameName=" + this.gameName + ", updatePart=" + this.updatePart + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MiniGameOutputWaiting extends UnityActionEvent {
        public static final int $stable = 0;
        private final EmomoGameName gameName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MiniGameOutputWaiting(EmomoGameName emomoGameName) {
            super(null);
            p.h(emomoGameName, "gameName");
            this.gameName = emomoGameName;
        }

        public static /* synthetic */ MiniGameOutputWaiting copy$default(MiniGameOutputWaiting miniGameOutputWaiting, EmomoGameName emomoGameName, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                emomoGameName = miniGameOutputWaiting.gameName;
            }
            return miniGameOutputWaiting.copy(emomoGameName);
        }

        public final EmomoGameName component1() {
            return this.gameName;
        }

        public final MiniGameOutputWaiting copy(EmomoGameName emomoGameName) {
            p.h(emomoGameName, "gameName");
            return new MiniGameOutputWaiting(emomoGameName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiniGameOutputWaiting) && this.gameName == ((MiniGameOutputWaiting) obj).gameName;
        }

        public final EmomoGameName getGameName() {
            return this.gameName;
        }

        public int hashCode() {
            return this.gameName.hashCode();
        }

        public String toString() {
            return "MiniGameOutputWaiting(gameName=" + this.gameName + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MultiEmomoGiftAnimationFailed extends UnityActionEvent {
        public static final int $stable = 0;
        private final MultiEmomoGiftAnimationErrorLogInfo multiEmomoGiftAnimationErrorLogInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiEmomoGiftAnimationFailed(MultiEmomoGiftAnimationErrorLogInfo multiEmomoGiftAnimationErrorLogInfo) {
            super(null);
            p.h(multiEmomoGiftAnimationErrorLogInfo, "multiEmomoGiftAnimationErrorLogInfo");
            this.multiEmomoGiftAnimationErrorLogInfo = multiEmomoGiftAnimationErrorLogInfo;
        }

        public static /* synthetic */ MultiEmomoGiftAnimationFailed copy$default(MultiEmomoGiftAnimationFailed multiEmomoGiftAnimationFailed, MultiEmomoGiftAnimationErrorLogInfo multiEmomoGiftAnimationErrorLogInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                multiEmomoGiftAnimationErrorLogInfo = multiEmomoGiftAnimationFailed.multiEmomoGiftAnimationErrorLogInfo;
            }
            return multiEmomoGiftAnimationFailed.copy(multiEmomoGiftAnimationErrorLogInfo);
        }

        public final MultiEmomoGiftAnimationErrorLogInfo component1() {
            return this.multiEmomoGiftAnimationErrorLogInfo;
        }

        public final MultiEmomoGiftAnimationFailed copy(MultiEmomoGiftAnimationErrorLogInfo multiEmomoGiftAnimationErrorLogInfo) {
            p.h(multiEmomoGiftAnimationErrorLogInfo, "multiEmomoGiftAnimationErrorLogInfo");
            return new MultiEmomoGiftAnimationFailed(multiEmomoGiftAnimationErrorLogInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiEmomoGiftAnimationFailed) && p.c(this.multiEmomoGiftAnimationErrorLogInfo, ((MultiEmomoGiftAnimationFailed) obj).multiEmomoGiftAnimationErrorLogInfo);
        }

        public final MultiEmomoGiftAnimationErrorLogInfo getMultiEmomoGiftAnimationErrorLogInfo() {
            return this.multiEmomoGiftAnimationErrorLogInfo;
        }

        public int hashCode() {
            return this.multiEmomoGiftAnimationErrorLogInfo.hashCode();
        }

        public String toString() {
            return "MultiEmomoGiftAnimationFailed(multiEmomoGiftAnimationErrorLogInfo=" + this.multiEmomoGiftAnimationErrorLogInfo + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MultiEmomoGiftAnimationFinished extends UnityActionEvent {
        public static final int $stable = 0;
        private final MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiEmomoGiftAnimationFinished(MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo) {
            super(null);
            p.h(multiEmomoGiftAnimationLogInfo, "multiEmomoGiftAnimationLogInfo");
            this.multiEmomoGiftAnimationLogInfo = multiEmomoGiftAnimationLogInfo;
        }

        public static /* synthetic */ MultiEmomoGiftAnimationFinished copy$default(MultiEmomoGiftAnimationFinished multiEmomoGiftAnimationFinished, MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                multiEmomoGiftAnimationLogInfo = multiEmomoGiftAnimationFinished.multiEmomoGiftAnimationLogInfo;
            }
            return multiEmomoGiftAnimationFinished.copy(multiEmomoGiftAnimationLogInfo);
        }

        public final MultiEmomoGiftAnimationLogInfo component1() {
            return this.multiEmomoGiftAnimationLogInfo;
        }

        public final MultiEmomoGiftAnimationFinished copy(MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo) {
            p.h(multiEmomoGiftAnimationLogInfo, "multiEmomoGiftAnimationLogInfo");
            return new MultiEmomoGiftAnimationFinished(multiEmomoGiftAnimationLogInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiEmomoGiftAnimationFinished) && p.c(this.multiEmomoGiftAnimationLogInfo, ((MultiEmomoGiftAnimationFinished) obj).multiEmomoGiftAnimationLogInfo);
        }

        public final MultiEmomoGiftAnimationLogInfo getMultiEmomoGiftAnimationLogInfo() {
            return this.multiEmomoGiftAnimationLogInfo;
        }

        public int hashCode() {
            return this.multiEmomoGiftAnimationLogInfo.hashCode();
        }

        public String toString() {
            return "MultiEmomoGiftAnimationFinished(multiEmomoGiftAnimationLogInfo=" + this.multiEmomoGiftAnimationLogInfo + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class MultiEmomoGiftAnimationStarted extends UnityActionEvent {
        public static final int $stable = 0;
        private final MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiEmomoGiftAnimationStarted(MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo) {
            super(null);
            p.h(multiEmomoGiftAnimationLogInfo, "multiEmomoGiftAnimationLogInfo");
            this.multiEmomoGiftAnimationLogInfo = multiEmomoGiftAnimationLogInfo;
        }

        public static /* synthetic */ MultiEmomoGiftAnimationStarted copy$default(MultiEmomoGiftAnimationStarted multiEmomoGiftAnimationStarted, MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                multiEmomoGiftAnimationLogInfo = multiEmomoGiftAnimationStarted.multiEmomoGiftAnimationLogInfo;
            }
            return multiEmomoGiftAnimationStarted.copy(multiEmomoGiftAnimationLogInfo);
        }

        public final MultiEmomoGiftAnimationLogInfo component1() {
            return this.multiEmomoGiftAnimationLogInfo;
        }

        public final MultiEmomoGiftAnimationStarted copy(MultiEmomoGiftAnimationLogInfo multiEmomoGiftAnimationLogInfo) {
            p.h(multiEmomoGiftAnimationLogInfo, "multiEmomoGiftAnimationLogInfo");
            return new MultiEmomoGiftAnimationStarted(multiEmomoGiftAnimationLogInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiEmomoGiftAnimationStarted) && p.c(this.multiEmomoGiftAnimationLogInfo, ((MultiEmomoGiftAnimationStarted) obj).multiEmomoGiftAnimationLogInfo);
        }

        public final MultiEmomoGiftAnimationLogInfo getMultiEmomoGiftAnimationLogInfo() {
            return this.multiEmomoGiftAnimationLogInfo;
        }

        public int hashCode() {
            return this.multiEmomoGiftAnimationLogInfo.hashCode();
        }

        public String toString() {
            return "MultiEmomoGiftAnimationStarted(multiEmomoGiftAnimationLogInfo=" + this.multiEmomoGiftAnimationLogInfo + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class RichUniqueGiftAnimationFinished extends UnityActionEvent {
        public static final int $stable = 0;
        public static final RichUniqueGiftAnimationFinished INSTANCE = new RichUniqueGiftAnimationFinished();

        private RichUniqueGiftAnimationFinished() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ScreenshotCompleted extends UnityActionEvent {
        public static final int $stable = 0;
        private final UnityScreenshot screenshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenshotCompleted(UnityScreenshot unityScreenshot) {
            super(null);
            p.h(unityScreenshot, "screenshot");
            this.screenshot = unityScreenshot;
        }

        public static /* synthetic */ ScreenshotCompleted copy$default(ScreenshotCompleted screenshotCompleted, UnityScreenshot unityScreenshot, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                unityScreenshot = screenshotCompleted.screenshot;
            }
            return screenshotCompleted.copy(unityScreenshot);
        }

        public final UnityScreenshot component1() {
            return this.screenshot;
        }

        public final ScreenshotCompleted copy(UnityScreenshot unityScreenshot) {
            p.h(unityScreenshot, "screenshot");
            return new ScreenshotCompleted(unityScreenshot);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScreenshotCompleted) && p.c(this.screenshot, ((ScreenshotCompleted) obj).screenshot);
        }

        public final UnityScreenshot getScreenshot() {
            return this.screenshot;
        }

        public int hashCode() {
            return this.screenshot.hashCode();
        }

        public String toString() {
            return "ScreenshotCompleted(screenshot=" + this.screenshot + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class ScreenshotFailed extends UnityActionEvent {
        public static final int $stable = 0;
        public static final ScreenshotFailed INSTANCE = new ScreenshotFailed();

        private ScreenshotFailed() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class UnloadAvatarSlot extends UnityActionEvent {
        public static final int $stable = 0;
        private final int slot;

        public UnloadAvatarSlot(int i10) {
            super(null);
            this.slot = i10;
        }

        public static /* synthetic */ UnloadAvatarSlot copy$default(UnloadAvatarSlot unloadAvatarSlot, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = unloadAvatarSlot.slot;
            }
            return unloadAvatarSlot.copy(i10);
        }

        public final int component1() {
            return this.slot;
        }

        public final UnloadAvatarSlot copy(int i10) {
            return new UnloadAvatarSlot(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnloadAvatarSlot) && this.slot == ((UnloadAvatarSlot) obj).slot;
        }

        public final int getSlot() {
            return this.slot;
        }

        public int hashCode() {
            return Integer.hashCode(this.slot);
        }

        public String toString() {
            return "UnloadAvatarSlot(slot=" + this.slot + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class UnloadMiniGameCompleted extends UnityActionEvent {
        public static final int $stable = 0;
        public static final UnloadMiniGameCompleted INSTANCE = new UnloadMiniGameCompleted();

        private UnloadMiniGameCompleted() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class UpdateAllPartsCompleted extends UnityActionEvent {
        public static final int $stable = 0;
        private final UnityUpdateAllParts updateAllParts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateAllPartsCompleted(UnityUpdateAllParts unityUpdateAllParts) {
            super(null);
            p.h(unityUpdateAllParts, "updateAllParts");
            this.updateAllParts = unityUpdateAllParts;
        }

        public static /* synthetic */ UpdateAllPartsCompleted copy$default(UpdateAllPartsCompleted updateAllPartsCompleted, UnityUpdateAllParts unityUpdateAllParts, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                unityUpdateAllParts = updateAllPartsCompleted.updateAllParts;
            }
            return updateAllPartsCompleted.copy(unityUpdateAllParts);
        }

        public final UnityUpdateAllParts component1() {
            return this.updateAllParts;
        }

        public final UpdateAllPartsCompleted copy(UnityUpdateAllParts unityUpdateAllParts) {
            p.h(unityUpdateAllParts, "updateAllParts");
            return new UpdateAllPartsCompleted(unityUpdateAllParts);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateAllPartsCompleted) && p.c(this.updateAllParts, ((UpdateAllPartsCompleted) obj).updateAllParts);
        }

        public final UnityUpdateAllParts getUpdateAllParts() {
            return this.updateAllParts;
        }

        public int hashCode() {
            return this.updateAllParts.hashCode();
        }

        public String toString() {
            return "UpdateAllPartsCompleted(updateAllParts=" + this.updateAllParts + ')';
        }
    }

    /* loaded from: classes3.dex */
    public static final class UpdateAllPartsFailed extends UnityActionEvent {
        public static final int $stable = 0;
        public static final UpdateAllPartsFailed INSTANCE = new UpdateAllPartsFailed();

        private UpdateAllPartsFailed() {
            super(null);
        }
    }

    private UnityActionEvent() {
    }

    public /* synthetic */ UnityActionEvent(h hVar) {
        this();
    }
}
