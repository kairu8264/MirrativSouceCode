package com.dena.mirrorman.unity;

import ao.g;
import com.dena.mirrorman.unity.UnityActionEvent;
import dq.l;
import jo.h;
import jo.p;
import org.greenrobot.eventbus.ThreadMode;
import q8.a;
import uo.q0;
import uo.r0;
import wn.k;
import wn.v;
import xo.e;
import xo.g0;
import xo.i0;
import xo.r;
import xo.s;
import xo.w;
import xo.y;

/* loaded from: classes3.dex */
public final class UnityStore implements q0 {
    private static UnityStore instance;
    private final /* synthetic */ q0 $$delegate_0;
    private final a dispatcher;
    private final r<v> finishedMiniGameMutableFlow;
    private final w<String> httpRequestFailed;
    private final r<v> initAssetBundleCompletedMutableFlow;
    private final r<v> initAssetBundleFailedMutableFlow;
    private final g0<Boolean> isPlayingGame;
    private final w<String> liveGiftAnimationFinishedFlow;
    private final r<UnityLoadAvatarModel> loadAvatarModelCompletedMutableFlow;
    private final r<EmomoGameName> loadMiniGameCompletedMutableFlow;
    private final r<v> loadMiniGameFailedMutableFlow;
    private final r<EmomoGameName> miniGameOutputCloseGameMutableFlow;
    private final w<k<EmomoGameName, UnityMiniGameOutputEmomoQuestLog>> miniGameOutputEmomoQuestLogFlow;
    private final w<k<EmomoGameName, String>> miniGameOutputEmomoQuestTouchHelpFlow;
    private final w<EmomoGameName> miniGameOutputEmomoQuestTouchTitleRankingFlow;
    private final r<k<EmomoGameName, UnityMiniGameOutputEmomoRunConsumeGift>> miniGameOutputEmomoRunConsumeGiftMutableFlow;
    private final r<k<EmomoGameName, UnityMiniGameOutputEmomoRunGameOver>> miniGameOutputEmomoRunGameOverMutableFlow;
    private final r<k<EmomoGameName, UnityMiniGameOutputEmomoRunHeartBeat>> miniGameOutputEmomoRunHeartBeatMutableFlow;
    private final r<EmomoGameName> miniGameOutputHideCommentMutableFlow;
    private final w<EmomoGameName> miniGameOutputOpenEquipmentGachaAnimationCompletedFlow;
    private final w<k<EmomoGameName, Integer>> miniGameOutputOpenEquipmentGachaFlow;
    private final w<EmomoGameName> miniGameOutputOpenGiftGachaFlow;
    private final w<k<EmomoGameName, String>> miniGameOutputOpenGiftGachaLpFlow;
    private final r<k<EmomoGameName, Integer>> miniGameOutputOpenGiftTreasureMutableFlow;
    private final r<EmomoGameName> miniGameOutputRequestAuthInfoMutableFlow;
    private final r<k<EmomoGameName, UnityMiniGameResult>> miniGameOutputResultMutableFlow;
    private final r<k<EmomoGameName, ShooterAnalysisLogPayload>> miniGameOutputShooterAnalysisLogMutableFlow;
    private final r<UnityMiniGameOutputShooterGameOver> miniGameOutputShooterGameOverMutableFlow;
    private final r<ShooterNotifyRoomId> miniGameOutputShooterNotifyRoomIdMutableFlow;
    private final r<EmomoGameName> miniGameOutputShooterWaitingMutableFlow;
    private final r<EmomoGameName> miniGameOutputShowCommentMutableFlow;
    private final r<EmomoGameName> miniGameOutputStartedMutableFlow;
    private final r<EmomoGameName> miniGameOutputTouchPlayingMutableFlow;
    private final r<EmomoGameName> miniGameOutputTouchResultNextStartMutableFlow;
    private final r<EmomoGameName> miniGameOutputTouchResultNextTitleMutableFlow;
    private final r<EmomoGameName> miniGameOutputTouchResultRankingMutableFlow;
    private final r<EmomoGameName> miniGameOutputTouchResultShareMutableFlow;
    private final r<EmomoGameName> miniGameOutputTouchTitleMutableFlow;
    private final w<k<EmomoGameName, Integer>> miniGameOutputUpdateAvatarFlow;
    private final r<MultiEmomoGiftAnimationErrorLogInfo> multiEmomoGiftAnimationFailedMutableFlow;
    private final r<MultiEmomoGiftAnimationLogInfo> multiEmomoGiftAnimationFinishedMutableFlow;
    private final r<MultiEmomoGiftAnimationLogInfo> multiEmomoGiftAnimationStartedMutableFlow;
    private final r<String> mutableHttpRequestFailed;
    private final r<String> mutableLiveGiftAnimationFinishedFlow;
    private final r<k<EmomoGameName, UnityMiniGameOutputEmomoQuestLog>> mutableMiniGameOutputEmomoQuestLogFlow;
    private final r<k<EmomoGameName, String>> mutableMiniGameOutputEmomoQuestTouchHelpFlow;
    private final r<k<EmomoGameName, Integer>> mutableMiniGameOutputEmomoQuestTouchResultRankingFlow;
    private final r<EmomoGameName> mutableMiniGameOutputEmomoQuestTouchTitleRankingFlow;
    private final r<EmomoGameName> mutableMiniGameOutputOpenEquipmentGachaAnimationCompletedFlow;
    private final r<k<EmomoGameName, Integer>> mutableMiniGameOutputOpenEquipmentGachaFlow;
    private final r<EmomoGameName> mutableMiniGameOutputOpenGiftGachaFlow;
    private final r<k<EmomoGameName, String>> mutableMiniGameOutputOpenGiftGachaLpFlow;
    private final r<k<EmomoGameName, Integer>> mutableMiniGameOutputTouchEmomoQuestResultShareFlow;
    private final r<EmomoGameName> mutableMiniGameOutputTouchHelpFlow;
    private final r<EmomoGameName> mutableMiniGameOutputTouchTitleRankingFlow;
    private final r<k<EmomoGameName, Integer>> mutableMiniGameOutputUpdateAvatarFlow;
    private final s<Boolean> mutablePlayingGame;
    private final r<v> mutableUnloadMiniGameCompletedFlow;
    private final r<UnityUpdateAllParts> mutableUpdateAllPartsCompletedFlow;
    private final r<v> richUniqueGiftAnimationFinishedMutableFlow;
    private final r<UnityScreenshot> screenshotCompletedMutableFlow;
    private final r<v> screenshotFailedMutableFlow;
    private final w<v> unloadMiniGameCompletedFlow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final UnityStore getInstance(a aVar) {
            p.h(aVar, "dispatcher");
            UnityStore unityStore = UnityStore.instance;
            if (unityStore != null) {
                unityStore.deinit();
            }
            UnityStore unityStore2 = new UnityStore(aVar);
            UnityStore.instance = unityStore2;
            return unityStore2;
        }
    }

    public UnityStore(a aVar) {
        p.h(aVar, "dispatcher");
        this.dispatcher = aVar;
        this.$$delegate_0 = r0.b();
        aVar.b(this);
        this.initAssetBundleCompletedMutableFlow = y.b(0, 0, null, 7, null);
        this.initAssetBundleFailedMutableFlow = y.b(0, 0, null, 7, null);
        this.loadAvatarModelCompletedMutableFlow = y.b(0, 0, null, 7, null);
        this.mutableUpdateAllPartsCompletedFlow = y.b(0, 0, null, 7, null);
        this.screenshotCompletedMutableFlow = y.b(0, 0, null, 7, null);
        this.screenshotFailedMutableFlow = y.b(0, 0, null, 7, null);
        this.loadMiniGameCompletedMutableFlow = y.b(0, 0, null, 7, null);
        this.loadMiniGameFailedMutableFlow = y.b(0, 0, null, 7, null);
        this.finishedMiniGameMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputStartedMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputTouchTitleMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputOpenGiftTreasureMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputTouchPlayingMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputTouchResultNextTitleMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputTouchResultNextStartMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputTouchResultShareMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputTouchResultRankingMutableFlow = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputTouchTitleRankingFlow = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputTouchHelpFlow = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputTouchEmomoQuestResultShareFlow = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputEmomoQuestTouchResultRankingFlow = y.b(0, 0, null, 7, null);
        r<EmomoGameName> b10 = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputEmomoQuestTouchTitleRankingFlow = b10;
        this.miniGameOutputEmomoQuestTouchTitleRankingFlow = e.b(b10);
        r<k<EmomoGameName, String>> b11 = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputEmomoQuestTouchHelpFlow = b11;
        this.miniGameOutputEmomoQuestTouchHelpFlow = e.b(b11);
        r<k<EmomoGameName, String>> b12 = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputOpenGiftGachaLpFlow = b12;
        this.miniGameOutputOpenGiftGachaLpFlow = e.b(b12);
        this.miniGameOutputShooterGameOverMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputEmomoRunGameOverMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputResultMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputShowCommentMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputHideCommentMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputEmomoRunHeartBeatMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputEmomoRunConsumeGiftMutableFlow = y.b(0, 0, null, 7, null);
        r<EmomoGameName> b13 = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputOpenGiftGachaFlow = b13;
        this.miniGameOutputOpenGiftGachaFlow = e.b(b13);
        r<k<EmomoGameName, Integer>> b14 = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputOpenEquipmentGachaFlow = b14;
        this.miniGameOutputOpenEquipmentGachaFlow = e.b(b14);
        r<EmomoGameName> b15 = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputOpenEquipmentGachaAnimationCompletedFlow = b15;
        this.miniGameOutputOpenEquipmentGachaAnimationCompletedFlow = e.b(b15);
        r<k<EmomoGameName, Integer>> b16 = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputUpdateAvatarFlow = b16;
        this.miniGameOutputUpdateAvatarFlow = e.b(b16);
        r<k<EmomoGameName, UnityMiniGameOutputEmomoQuestLog>> b17 = y.b(0, 0, null, 7, null);
        this.mutableMiniGameOutputEmomoQuestLogFlow = b17;
        this.miniGameOutputEmomoQuestLogFlow = e.b(b17);
        this.miniGameOutputCloseGameMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputRequestAuthInfoMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputShooterNotifyRoomIdMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputShooterWaitingMutableFlow = y.b(0, 0, null, 7, null);
        this.miniGameOutputShooterAnalysisLogMutableFlow = y.b(0, 0, null, 7, null);
        this.multiEmomoGiftAnimationStartedMutableFlow = y.b(0, 0, null, 7, null);
        this.multiEmomoGiftAnimationFinishedMutableFlow = y.b(0, 0, null, 7, null);
        this.multiEmomoGiftAnimationFailedMutableFlow = y.b(0, 0, null, 7, null);
        s<Boolean> a10 = i0.a(Boolean.FALSE);
        this.mutablePlayingGame = a10;
        this.isPlayingGame = a10;
        r<v> b18 = y.b(0, 0, null, 7, null);
        this.mutableUnloadMiniGameCompletedFlow = b18;
        this.unloadMiniGameCompletedFlow = e.b(b18);
        this.richUniqueGiftAnimationFinishedMutableFlow = y.b(0, 0, null, 7, null);
        r<String> b19 = y.b(0, 0, null, 7, null);
        this.mutableLiveGiftAnimationFinishedFlow = b19;
        this.liveGiftAnimationFinishedFlow = b19;
        r<String> b20 = y.b(0, 0, null, 7, null);
        this.mutableHttpRequestFailed = b20;
        this.httpRequestFailed = e.b(b20);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deinit() {
        this.dispatcher.c(this);
        r0.d(this, null, 1, null);
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final w<v> getFinishedMiniGameFlow() {
        return e.b(this.finishedMiniGameMutableFlow);
    }

    public final w<String> getHttpRequestFailed() {
        return this.httpRequestFailed;
    }

    public final w<v> getInitAssetBundleCompletedFlow() {
        return e.b(this.initAssetBundleCompletedMutableFlow);
    }

    public final w<v> getInitAssetBundleFailedFlow() {
        return e.b(this.initAssetBundleFailedMutableFlow);
    }

    public final w<String> getLiveGiftAnimationFinishedFlow() {
        return this.liveGiftAnimationFinishedFlow;
    }

    public final w<UnityLoadAvatarModel> getLoadAvatarModelCompletedFlow() {
        return e.b(this.loadAvatarModelCompletedMutableFlow);
    }

    public final w<EmomoGameName> getLoadMiniGameCompletedFlow() {
        return e.b(this.loadMiniGameCompletedMutableFlow);
    }

    public final w<v> getLoadMiniGameFailedFlow() {
        return e.b(this.loadMiniGameFailedMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputCloseGameFlow() {
        return e.b(this.miniGameOutputCloseGameMutableFlow);
    }

    public final w<k<EmomoGameName, UnityMiniGameOutputEmomoQuestLog>> getMiniGameOutputEmomoQuestLogFlow() {
        return this.miniGameOutputEmomoQuestLogFlow;
    }

    public final w<k<EmomoGameName, String>> getMiniGameOutputEmomoQuestTouchHelpFlow() {
        return this.miniGameOutputEmomoQuestTouchHelpFlow;
    }

    public final w<k<EmomoGameName, Integer>> getMiniGameOutputEmomoQuestTouchResultRankingFlow() {
        return e.b(this.mutableMiniGameOutputEmomoQuestTouchResultRankingFlow);
    }

    public final w<k<EmomoGameName, Integer>> getMiniGameOutputEmomoQuestTouchResultShareFlow() {
        return e.b(this.mutableMiniGameOutputTouchEmomoQuestResultShareFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputEmomoQuestTouchTitleRankingFlow() {
        return this.miniGameOutputEmomoQuestTouchTitleRankingFlow;
    }

    public final w<k<EmomoGameName, UnityMiniGameOutputEmomoRunConsumeGift>> getMiniGameOutputEmomoRunConsumeGiftFlow() {
        return e.b(this.miniGameOutputEmomoRunConsumeGiftMutableFlow);
    }

    public final w<k<EmomoGameName, UnityMiniGameOutputEmomoRunGameOver>> getMiniGameOutputEmomoRunGameOverFlow() {
        return e.b(this.miniGameOutputEmomoRunGameOverMutableFlow);
    }

    public final w<k<EmomoGameName, UnityMiniGameOutputEmomoRunHeartBeat>> getMiniGameOutputEmomoRunHeartBeatFlow() {
        return e.b(this.miniGameOutputEmomoRunHeartBeatMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputHideCommentFlow() {
        return e.b(this.miniGameOutputHideCommentMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputOpenEquipmentGachaAnimationCompletedFlow() {
        return this.miniGameOutputOpenEquipmentGachaAnimationCompletedFlow;
    }

    public final w<k<EmomoGameName, Integer>> getMiniGameOutputOpenEquipmentGachaFlow() {
        return this.miniGameOutputOpenEquipmentGachaFlow;
    }

    public final w<EmomoGameName> getMiniGameOutputOpenGiftGachaFlow() {
        return this.miniGameOutputOpenGiftGachaFlow;
    }

    public final w<k<EmomoGameName, String>> getMiniGameOutputOpenGiftGachaLpFlow() {
        return this.miniGameOutputOpenGiftGachaLpFlow;
    }

    public final w<k<EmomoGameName, Integer>> getMiniGameOutputOpenGiftTreasureFlow() {
        return e.b(this.miniGameOutputOpenGiftTreasureMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputRequestAuthInfoFlow() {
        return e.b(this.miniGameOutputRequestAuthInfoMutableFlow);
    }

    public final w<k<EmomoGameName, UnityMiniGameResult>> getMiniGameOutputResultFlow() {
        return e.b(this.miniGameOutputResultMutableFlow);
    }

    public final w<k<EmomoGameName, ShooterAnalysisLogPayload>> getMiniGameOutputShooterAnalysisLogFlow() {
        return e.b(this.miniGameOutputShooterAnalysisLogMutableFlow);
    }

    public final w<UnityMiniGameOutputShooterGameOver> getMiniGameOutputShooterGameOverFlow() {
        return e.b(this.miniGameOutputShooterGameOverMutableFlow);
    }

    public final w<ShooterNotifyRoomId> getMiniGameOutputShooterNotifyRoomIdFlow() {
        return e.b(this.miniGameOutputShooterNotifyRoomIdMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputShooterWaitingFlow() {
        return e.b(this.miniGameOutputShooterWaitingMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputShowCommentFlow() {
        return e.b(this.miniGameOutputShowCommentMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputStartedFlow() {
        return e.b(this.miniGameOutputStartedMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputTouchHelpFlow() {
        return e.b(this.mutableMiniGameOutputTouchHelpFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputTouchPlayingFlow() {
        return e.b(this.miniGameOutputTouchPlayingMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputTouchResultNextStartFlow() {
        return e.b(this.miniGameOutputTouchResultNextStartMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputTouchResultNextTitleFlow() {
        return e.b(this.miniGameOutputTouchResultNextTitleMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputTouchResultRankingFlow() {
        return e.b(this.miniGameOutputTouchResultRankingMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputTouchResultShareFlow() {
        return e.b(this.miniGameOutputTouchResultShareMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputTouchTitleFlow() {
        return e.b(this.miniGameOutputTouchTitleMutableFlow);
    }

    public final w<EmomoGameName> getMiniGameOutputTouchTitleRankingFlow() {
        return e.b(this.mutableMiniGameOutputTouchTitleRankingFlow);
    }

    public final w<k<EmomoGameName, Integer>> getMiniGameOutputUpdateAvatarFlow() {
        return this.miniGameOutputUpdateAvatarFlow;
    }

    public final w<MultiEmomoGiftAnimationErrorLogInfo> getMultiEmomoGiftAnimationFailedFlow() {
        return e.b(this.multiEmomoGiftAnimationFailedMutableFlow);
    }

    public final w<MultiEmomoGiftAnimationLogInfo> getMultiEmomoGiftAnimationFinishedFlow() {
        return e.b(this.multiEmomoGiftAnimationFinishedMutableFlow);
    }

    public final w<MultiEmomoGiftAnimationLogInfo> getMultiEmomoGiftAnimationStartedFlow() {
        return e.b(this.multiEmomoGiftAnimationStartedMutableFlow);
    }

    public final w<v> getRichUniqueGiftAnimationFinishedFlow() {
        return e.b(this.richUniqueGiftAnimationFinishedMutableFlow);
    }

    public final w<UnityScreenshot> getScreenshotCompletedFlow() {
        return e.b(this.screenshotCompletedMutableFlow);
    }

    public final w<v> getScreenshotFailedFlow() {
        return e.b(this.screenshotFailedMutableFlow);
    }

    public final w<v> getUnloadMiniGameCompletedFlow() {
        return this.unloadMiniGameCompletedFlow;
    }

    public final w<UnityUpdateAllParts> getUpdateAllPartsCompletedFlow() {
        return e.b(this.mutableUpdateAllPartsCompletedFlow);
    }

    public final g0<Boolean> isPlayingGame() {
        return this.isPlayingGame;
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.InitAssetBundleCompleted initAssetBundleCompleted) {
        p.h(initAssetBundleCompleted, "event");
        uo.l.d(this, null, null, new UnityStore$on$1(this, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.InitAssetBundleFailed initAssetBundleFailed) {
        p.h(initAssetBundleFailed, "event");
        uo.l.d(this, null, null, new UnityStore$on$2(this, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.LoadAvatarModelCompleted loadAvatarModelCompleted) {
        p.h(loadAvatarModelCompleted, "event");
        uo.l.d(this, null, null, new UnityStore$on$3(this, loadAvatarModelCompleted, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.UpdateAllPartsCompleted updateAllPartsCompleted) {
        p.h(updateAllPartsCompleted, "event");
        uo.l.d(this, null, null, new UnityStore$on$4(this, updateAllPartsCompleted, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.ScreenshotCompleted screenshotCompleted) {
        p.h(screenshotCompleted, "event");
        uo.l.d(this, null, null, new UnityStore$on$5(this, screenshotCompleted, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.ScreenshotFailed screenshotFailed) {
        p.h(screenshotFailed, "event");
        uo.l.d(this, null, null, new UnityStore$on$6(this, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.LoadMiniGameCompleted loadMiniGameCompleted) {
        p.h(loadMiniGameCompleted, "event");
        uo.l.d(this, null, null, new UnityStore$on$7(this, loadMiniGameCompleted, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.LoadMiniGameFailed loadMiniGameFailed) {
        p.h(loadMiniGameFailed, "event");
        uo.l.d(this, null, null, new UnityStore$on$8(this, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.InitMiniGame initMiniGame) {
        p.h(initMiniGame, "event");
        this.mutablePlayingGame.setValue(Boolean.TRUE);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.UnloadMiniGameCompleted unloadMiniGameCompleted) {
        p.h(unloadMiniGameCompleted, "event");
        uo.l.d(this, null, null, new UnityStore$on$9(this, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.FinishMiniGame finishMiniGame) {
        p.h(finishMiniGame, "event");
        this.mutablePlayingGame.setValue(Boolean.FALSE);
        uo.l.d(this, null, null, new UnityStore$on$10(this, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputStarted miniGameOutputStarted) {
        p.h(miniGameOutputStarted, "event");
        uo.l.d(this, null, null, new UnityStore$on$11(this, miniGameOutputStarted, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunTouchTitle miniGameOutputEmomoRunTouchTitle) {
        p.h(miniGameOutputEmomoRunTouchTitle, "event");
        uo.l.d(this, null, null, new UnityStore$on$12(this, miniGameOutputEmomoRunTouchTitle, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunOpenGiftTreasure miniGameOutputEmomoRunOpenGiftTreasure) {
        p.h(miniGameOutputEmomoRunOpenGiftTreasure, "event");
        uo.l.d(this, null, null, new UnityStore$on$13(this, miniGameOutputEmomoRunOpenGiftTreasure, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunTouchPlaying miniGameOutputEmomoRunTouchPlaying) {
        p.h(miniGameOutputEmomoRunTouchPlaying, "event");
        uo.l.d(this, null, null, new UnityStore$on$14(this, miniGameOutputEmomoRunTouchPlaying, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunTouchResultNextTitle miniGameOutputEmomoRunTouchResultNextTitle) {
        p.h(miniGameOutputEmomoRunTouchResultNextTitle, "event");
        uo.l.d(this, null, null, new UnityStore$on$15(this, miniGameOutputEmomoRunTouchResultNextTitle, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunTouchResultNextStart miniGameOutputEmomoRunTouchResultNextStart) {
        p.h(miniGameOutputEmomoRunTouchResultNextStart, "event");
        uo.l.d(this, null, null, new UnityStore$on$16(this, miniGameOutputEmomoRunTouchResultNextStart, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunTouchResultShare miniGameOutputEmomoRunTouchResultShare) {
        p.h(miniGameOutputEmomoRunTouchResultShare, "event");
        uo.l.d(this, null, null, new UnityStore$on$17(this, miniGameOutputEmomoRunTouchResultShare, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunTouchResultRanking miniGameOutputEmomoRunTouchResultRanking) {
        p.h(miniGameOutputEmomoRunTouchResultRanking, "event");
        uo.l.d(this, null, null, new UnityStore$on$18(this, miniGameOutputEmomoRunTouchResultRanking, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunTouchTitleRanking miniGameOutputEmomoRunTouchTitleRanking) {
        p.h(miniGameOutputEmomoRunTouchTitleRanking, "event");
        uo.l.d(this, null, null, new UnityStore$on$19(this, miniGameOutputEmomoRunTouchTitleRanking, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunTouchHelp miniGameOutputEmomoRunTouchHelp) {
        p.h(miniGameOutputEmomoRunTouchHelp, "event");
        uo.l.d(this, null, null, new UnityStore$on$20(this, miniGameOutputEmomoRunTouchHelp, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunOpenGiftGacha miniGameOutputEmomoRunOpenGiftGacha) {
        p.h(miniGameOutputEmomoRunOpenGiftGacha, "event");
        uo.l.d(this, null, null, new UnityStore$on$21(this, miniGameOutputEmomoRunOpenGiftGacha, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoQuestTouchResultShare miniGameOutputEmomoQuestTouchResultShare) {
        p.h(miniGameOutputEmomoQuestTouchResultShare, "event");
        uo.l.d(this, null, null, new UnityStore$on$22(this, miniGameOutputEmomoQuestTouchResultShare, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoQuestTouchResultRanking miniGameOutputEmomoQuestTouchResultRanking) {
        p.h(miniGameOutputEmomoQuestTouchResultRanking, "event");
        uo.l.d(this, null, null, new UnityStore$on$23(this, miniGameOutputEmomoQuestTouchResultRanking, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoQuestTouchTitleRanking miniGameOutputEmomoQuestTouchTitleRanking) {
        p.h(miniGameOutputEmomoQuestTouchTitleRanking, "event");
        uo.l.d(this, null, null, new UnityStore$on$24(this, miniGameOutputEmomoQuestTouchTitleRanking, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoQuestTouchHelp miniGameOutputEmomoQuestTouchHelp) {
        p.h(miniGameOutputEmomoQuestTouchHelp, "event");
        uo.l.d(this, null, null, new UnityStore$on$25(this, miniGameOutputEmomoQuestTouchHelp, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputOpenGiftGachaLp miniGameOutputOpenGiftGachaLp) {
        p.h(miniGameOutputOpenGiftGachaLp, "event");
        uo.l.d(this, null, null, new UnityStore$on$26(this, miniGameOutputOpenGiftGachaLp, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputShooterGameOver miniGameOutputShooterGameOver) {
        p.h(miniGameOutputShooterGameOver, "event");
        uo.l.d(this, null, null, new UnityStore$on$27(this, miniGameOutputShooterGameOver, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunGameOver miniGameOutputEmomoRunGameOver) {
        p.h(miniGameOutputEmomoRunGameOver, "event");
        uo.l.d(this, null, null, new UnityStore$on$28(this, miniGameOutputEmomoRunGameOver, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputResult miniGameOutputResult) {
        p.h(miniGameOutputResult, "event");
        uo.l.d(this, null, null, new UnityStore$on$29(this, miniGameOutputResult, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputShowComment miniGameOutputShowComment) {
        p.h(miniGameOutputShowComment, "event");
        uo.l.d(this, null, null, new UnityStore$on$30(this, miniGameOutputShowComment, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputHideComment miniGameOutputHideComment) {
        p.h(miniGameOutputHideComment, "event");
        uo.l.d(this, null, null, new UnityStore$on$31(this, miniGameOutputHideComment, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunHeartBeat miniGameOutputEmomoRunHeartBeat) {
        p.h(miniGameOutputEmomoRunHeartBeat, "event");
        uo.l.d(this, null, null, new UnityStore$on$32(this, miniGameOutputEmomoRunHeartBeat, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoRunConsumeGift miniGameOutputEmomoRunConsumeGift) {
        p.h(miniGameOutputEmomoRunConsumeGift, "event");
        uo.l.d(this, null, null, new UnityStore$on$33(this, miniGameOutputEmomoRunConsumeGift, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoQuestOpenGiftGacha miniGameOutputEmomoQuestOpenGiftGacha) {
        p.h(miniGameOutputEmomoQuestOpenGiftGacha, "event");
        uo.l.d(this, null, null, new UnityStore$on$34(this, miniGameOutputEmomoQuestOpenGiftGacha, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoQuestOpenEquipmentGacha miniGameOutputEmomoQuestOpenEquipmentGacha) {
        p.h(miniGameOutputEmomoQuestOpenEquipmentGacha, "event");
        uo.l.d(this, null, null, new UnityStore$on$35(this, miniGameOutputEmomoQuestOpenEquipmentGacha, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted miniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted) {
        p.h(miniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted, "event");
        uo.l.d(this, null, null, new UnityStore$on$36(this, miniGameOutputEmomoQuestOpenEquipmentGachaAnimationCompleted, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputUpdateAvatar miniGameOutputUpdateAvatar) {
        p.h(miniGameOutputUpdateAvatar, "event");
        uo.l.d(this, null, null, new UnityStore$on$37(this, miniGameOutputUpdateAvatar, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputEmomoQuestLog miniGameOutputEmomoQuestLog) {
        p.h(miniGameOutputEmomoQuestLog, "event");
        uo.l.d(this, null, null, new UnityStore$on$38(this, miniGameOutputEmomoQuestLog, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputCloseGame miniGameOutputCloseGame) {
        p.h(miniGameOutputCloseGame, "event");
        uo.l.d(this, null, null, new UnityStore$on$39(this, miniGameOutputCloseGame, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputRequestAuthInfo miniGameOutputRequestAuthInfo) {
        p.h(miniGameOutputRequestAuthInfo, "event");
        uo.l.d(this, null, null, new UnityStore$on$40(this, miniGameOutputRequestAuthInfo, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputNotifyRoomId miniGameOutputNotifyRoomId) {
        p.h(miniGameOutputNotifyRoomId, "event");
        uo.l.d(this, null, null, new UnityStore$on$41(this, miniGameOutputNotifyRoomId, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputWaiting miniGameOutputWaiting) {
        p.h(miniGameOutputWaiting, "event");
        uo.l.d(this, null, null, new UnityStore$on$42(this, miniGameOutputWaiting, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MiniGameOutputAnalysisLog miniGameOutputAnalysisLog) {
        p.h(miniGameOutputAnalysisLog, "event");
        uo.l.d(this, null, null, new UnityStore$on$43(this, miniGameOutputAnalysisLog, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MultiEmomoGiftAnimationStarted multiEmomoGiftAnimationStarted) {
        p.h(multiEmomoGiftAnimationStarted, "event");
        uo.l.d(this, null, null, new UnityStore$on$44(this, multiEmomoGiftAnimationStarted, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MultiEmomoGiftAnimationFinished multiEmomoGiftAnimationFinished) {
        p.h(multiEmomoGiftAnimationFinished, "event");
        uo.l.d(this, null, null, new UnityStore$on$45(this, multiEmomoGiftAnimationFinished, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.MultiEmomoGiftAnimationFailed multiEmomoGiftAnimationFailed) {
        p.h(multiEmomoGiftAnimationFailed, "event");
        uo.l.d(this, null, null, new UnityStore$on$46(this, multiEmomoGiftAnimationFailed, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.RichUniqueGiftAnimationFinished richUniqueGiftAnimationFinished) {
        p.h(richUniqueGiftAnimationFinished, "event");
        uo.l.d(this, null, null, new UnityStore$on$47(this, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.LiveGiftEffectKeyAnimationFinished liveGiftEffectKeyAnimationFinished) {
        p.h(liveGiftEffectKeyAnimationFinished, "event");
        uo.l.d(this, null, null, new UnityStore$on$48(this, liveGiftEffectKeyAnimationFinished, null), 3, null);
    }

    @l(threadMode = ThreadMode.MAIN)
    public final void on(UnityActionEvent.HttpRequestFailed httpRequestFailed) {
        p.h(httpRequestFailed, "event");
        uo.l.d(this, null, null, new UnityStore$on$49(this, httpRequestFailed, null), 3, null);
    }
}
