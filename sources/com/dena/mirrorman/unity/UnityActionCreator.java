package com.dena.mirrorman.unity;

import android.webkit.CookieManager;
import ao.g;
import com.dena.mirrativ.mirrativapi.closet.ClosetAvatarSimpleValue;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftUnityTextConfig;
import com.dena.mirrorman.net.api.response.event.DiarkisAuthInfoResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberAvatar;
import com.dena.mirrorman.net.api.response.event.ShooterMemberAvatarsResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberType;
import com.dena.mirrorman.net.api.response.event.ShooterReward;
import com.dena.mirrorman.net.api.response.event.ShooterTeamResultResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateMemberResponse;
import com.dena.mirrorman.unity.MiniGameInput;
import com.dena.mirrorman.unity.MiniGameParam;
import com.dena.mirrorman.unity.UnityActionEvent;
import com.dena.mirrorman.unity.UnityCommand;
import hf.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.c;
import jf.k0;
import jo.p;
import of.n;
import q8.a;
import uo.q0;
import uo.r0;
import xn.a0;
import xn.o;
import xn.r;
import xn.s;

/* loaded from: classes3.dex */
public final class UnityActionCreator implements q0 {
    public static final int $stable = 8;
    private final /* synthetic */ q0 $$delegate_0;
    private final a dispatcher;
    private final c0 httpRequestHelper;
    private final ServerConfig serverConfig;
    private final UnityCommandDispatcher unityCommandDispatcher;

    public UnityActionCreator(a aVar, UnityCommandDispatcher unityCommandDispatcher, c0 c0Var, ServerConfig serverConfig) {
        p.h(aVar, "dispatcher");
        p.h(unityCommandDispatcher, "unityCommandDispatcher");
        p.h(c0Var, "httpRequestHelper");
        p.h(serverConfig, "serverConfig");
        this.dispatcher = aVar;
        this.unityCommandDispatcher = unityCommandDispatcher;
        this.httpRequestHelper = c0Var;
        this.serverConfig = serverConfig;
        this.$$delegate_0 = r0.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAllParts$default(UnityActionCreator unityActionCreator, c cVar, Set set, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            set = o.i0(k0.values());
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        unityActionCreator.updateAllParts(cVar, set, i10);
    }

    public final void captureRichUniqueGiftScreenshot(UnityScreenShotAvatarPosition unityScreenShotAvatarPosition, String str, int i10, int i11, String str2) {
        p.h(unityScreenShotAvatarPosition, "avatarPosition");
        p.h(str, "imagePath");
        p.h(str2, "key");
        this.unityCommandDispatcher.dispatch(new UnityCommand.CaptureRichUniqueGiftScreenshot(unityScreenShotAvatarPosition, str, i10, i11, str2, null, 32, null));
    }

    public final void captureScreenshot(UnityScreenShotAvatarPosition unityScreenShotAvatarPosition, String str, int i10, int i11, String str2) {
        p.h(unityScreenShotAvatarPosition, "avatarPosition");
        p.h(str, "imagePath");
        p.h(str2, "key");
        this.unityCommandDispatcher.dispatch(new UnityCommand.CaptureScreenshot(unityScreenShotAvatarPosition, str, i10, i11, str2, null, 32, null));
    }

    public final void emomoRunGiftGachaCount(int i10) {
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.EmomoRunGiftGachaCount(i10), null, 2, null));
    }

    public final void emomoRunInitMiniGame() {
        this.dispatcher.a(UnityActionEvent.InitMiniGame.INSTANCE);
        UnityManager.Companion.getInstance().initMiniGame(EmomoGameName.EMOMO_RUN);
    }

    public final void endGame(EmomoGameName emomoGameName) {
        p.h(emomoGameName, "gameName");
        UnityManager.Companion.getInstance().unloadMiniGame();
        this.dispatcher.a(UnityActionEvent.FinishMiniGame.INSTANCE);
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final void hideBackground() {
        UnityManager.Companion.getInstance().setTranslucentBackground();
    }

    public final void loadAvatar(c cVar) {
        p.h(cVar, "closetAvatarModel");
        UnityManager.Companion.getInstance().loadAvatarModel(cVar, 0);
    }

    public final void loadEditingRichUniqueGift(String str, c cVar, List<UniqueEmomoGiftUnityTextConfig> list, String str2) {
        p.h(str, "presetName");
        p.h(cVar, "closetAvatarModel");
        p.h(list, "textConfigs");
        p.h(str2, "motion");
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftViewerAvatarModel(cVar, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftMessagePreset(str, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftPlayMode(new MiniGameInput.SetRichUniqueGiftPlayMode(true), null, 2, null));
        for (UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig : list) {
            richUniqueGiftSetMessage(uniqueEmomoGiftUnityTextConfig.getIndex(), uniqueEmomoGiftUnityTextConfig.getText());
            richUniqueGiftSetColor(uniqueEmomoGiftUnityTextConfig.getIndex(), uniqueEmomoGiftUnityTextConfig.getUnityFontName());
        }
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftAnimation(str2, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.PlayRichUniqueGift(null, 1, null));
    }

    public final void loadEmomoQuest(int i10, String str, c cVar) {
        p.h(str, "playId");
        p.h(cVar, "closetAvatarModel");
        this.dispatcher.a(UnityActionEvent.InitMiniGame.INSTANCE);
        this.unityCommandDispatcher.dispatch(new UnityCommand.InitMiniGame(EmomoGameName.EMOMO_QUEST, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.EmomoQuestEventId(i10), null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.LiveGamePlayId(str), null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameAvatarModel(cVar, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.UseDebugFunc(n.n()), null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.LoadMiniGame(null, 1, null));
    }

    public final void loadLiveGiftEffect(String str, String str2, String str3, String str4) {
        p.h(str, "key");
        p.h(str3, "effectId");
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetLiveGiftEffectKey(str, null, 2, null));
        if (str2 != null) {
            this.unityCommandDispatcher.dispatch(new UnityCommand.SetLiveSentGiftId(str2, null, 2, null));
        }
        if (str4 != null) {
            this.unityCommandDispatcher.dispatch(new UnityCommand.SetCollaboGiftAvatarModel(str4, null, 2, null));
        }
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetEffectTrigger(str3, null, 2, null));
    }

    public final void loadMiniGame(int i10, c cVar) {
        p.h(cVar, "closetAvatarModel");
        this.dispatcher.a(UnityActionEvent.InitMiniGame.INSTANCE);
        this.unityCommandDispatcher.dispatch(new UnityCommand.InitMiniGame(EmomoGameName.FLAG_UP, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameAvatarModel(cVar, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.BestScore(i10), null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.LoadMiniGame(null, 1, null));
    }

    public final void loadStreamingRichUniqueGift(String str, String str2, c cVar, c cVar2, List<UniqueEmomoGiftUnityTextConfig> list, String str3) {
        p.h(str, "key");
        p.h(str2, "presetName");
        p.h(cVar, "streamerAvatarModel");
        p.h(cVar2, "viewerAvatarModel");
        p.h(list, "textConfigs");
        p.h(str3, "motion");
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetLiveGiftEffectKey(str, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftStreamerAvatarModel(cVar, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftViewerAvatarModel(cVar2, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftMessagePreset(str2, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftPlayMode(new MiniGameInput.SetRichUniqueGiftPlayMode(false), null, 2, null));
        for (UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig : list) {
            richUniqueGiftSetMessage(uniqueEmomoGiftUnityTextConfig.getIndex(), uniqueEmomoGiftUnityTextConfig.getText());
            richUniqueGiftSetColor(uniqueEmomoGiftUnityTextConfig.getIndex(), uniqueEmomoGiftUnityTextConfig.getUnityFontName());
        }
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftAnimation(str3, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.PlayRichUniqueGift(null, 1, null));
    }

    public final void notifyEquipmentGachaClose() {
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(MiniGameInput.EmomoQuestNotifyEquipmentGachaClose.INSTANCE, null, 2, null));
    }

    public final void notifyEquipmentGachaRequestFinished(boolean z10) {
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.EmomoQuestNotifyEquipmentGachaRequestFinished(z10), null, 2, null));
    }

    public final void notifyGiftGachaClose() {
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(MiniGameInput.EmomoQuestNotifyGiftGachaClose.INSTANCE, null, 2, null));
    }

    public final void notifyGiftGachaSent() {
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(MiniGameInput.EmomoQuestNotifyGiftGachaSent.INSTANCE, null, 2, null));
    }

    public final void openEquipmentGachaEmomoQuest(String str) {
        p.h(str, "json");
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.EmomoQuestOpenEquipmentGacha(str), null, 2, null));
    }

    public final void openGiftGachaEmomoQuest(String str) {
        p.h(str, "json");
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.EmomoQuestOpenGiftGacha(str), null, 2, null));
    }

    public final void playRandomMotion(c cVar) {
        String value;
        ClosetAvatarSimpleValue motion4;
        p.h(cVar, "closetAvatarModel");
        int c10 = no.c.f43727w.c(4);
        if (c10 == 0) {
            ClosetAvatarSimpleValue motion1 = cVar.f().getMotion1();
            if (motion1 != null) {
                value = motion1.getValue();
            }
            value = null;
        } else if (c10 == 1) {
            ClosetAvatarSimpleValue motion2 = cVar.f().getMotion2();
            if (motion2 != null) {
                value = motion2.getValue();
            }
            value = null;
        } else if (c10 != 2) {
            if (c10 == 3 && (motion4 = cVar.f().getMotion4()) != null) {
                value = motion4.getValue();
            }
            value = null;
        } else {
            ClosetAvatarSimpleValue motion3 = cVar.f().getMotion3();
            if (motion3 != null) {
                value = motion3.getValue();
            }
            value = null;
        }
        if (value == null) {
            ClosetAvatarSimpleValue motion12 = cVar.f().getMotion1();
            value = motion12 != null ? motion12.getValue() : null;
            if (value == null) {
                return;
            }
        }
        UnityManager.setAnimationTrigger$default(UnityManager.Companion.getInstance(), value, 0, 2, null);
    }

    public final void previewRichUniqueGift() {
        this.unityCommandDispatcher.dispatch(new UnityCommand.PreviewRichUniqueGift(null, 1, null));
    }

    public final void receiveGiftEmomoQuest(String str) {
        p.h(str, "json");
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.EmomoQuestGiftSent(str), null, 2, null));
    }

    public final void richUniqueGiftSetAnimation(String str) {
        p.h(str, "motionName");
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftAnimation(str, null, 2, null));
    }

    public final void richUniqueGiftSetColor(int i10, String str) {
        p.h(str, "fontName");
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftColor(i10, str, null, 4, null));
    }

    public final void richUniqueGiftSetMessage(int i10, String str) {
        p.h(str, "message");
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetRichUniqueGiftMessage(i10, str, null, 4, null));
    }

    public final void richUniqueGiftSetMessageFocusMode(int i10) {
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetActiveRichUniqueGiftMessageIndex(i10, null, 2, null));
    }

    public final void setClosetRotation(float f10, float f11) {
        this.unityCommandDispatcher.dispatch(new UnityCommand.AddClosetRotation(f10, f11, null, 4, null));
    }

    public final void setClosetScale(float f10) {
        this.unityCommandDispatcher.dispatch(new UnityCommand.AddClosetDolly(f10, null, 2, null));
    }

    public final void setHttpRequestConfig() {
        List k10;
        String basicAuthUser = this.serverConfig.getBasicAuthUser();
        String basicAuthPassword = this.serverConfig.getBasicAuthPassword();
        UnityCommandDispatcher unityCommandDispatcher = this.unityCommandDispatcher;
        String serverURL = this.serverConfig.getServerURL();
        Map<String, String> a10 = this.httpRequestHelper.a();
        ArrayList arrayList = new ArrayList(a10.size());
        for (Map.Entry<String, String> entry : a10.entrySet()) {
            arrayList.add(new UnityMiniGameInputHeader(entry.getKey(), entry.getValue()));
        }
        String cookie = CookieManager.getInstance().getCookie(this.serverConfig.getServerURL());
        p.g(cookie, "getInstance().getCookie(serverConfig.serverURL)");
        List o02 = a0.o0(arrayList, r.d(new UnityMiniGameInputHeader("Cookie", cookie)));
        if (basicAuthUser.length() > 0) {
            if (basicAuthPassword.length() > 0) {
                k10 = r.d(new UnityMiniGameInputHeader("Authorization", ep.o.b(basicAuthUser, basicAuthPassword, null, 4, null)));
                unityCommandDispatcher.dispatch(new UnityCommand.SetHttpRequestConfig(new UnityMiniGameInputSetHttpRequestConfig(serverURL, a0.o0(o02, k10)), null, 2, null));
            }
        }
        k10 = s.k();
        unityCommandDispatcher.dispatch(new UnityCommand.SetHttpRequestConfig(new UnityMiniGameInputSetHttpRequestConfig(serverURL, a0.o0(o02, k10)), null, 2, null));
    }

    public final void setMyLiveComment(String str) {
        p.h(str, "comment");
        if (n.n()) {
            this.unityCommandDispatcher.dispatch(new UnityCommand.SetMyLiveComment(str, null, 2, null));
        }
    }

    public final void shooterCloseGame() {
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(MiniGameInput.ShooterCloseGame.INSTANCE, null, 2, null));
    }

    public final void shooterCloseKeyboard() {
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(MiniGameInput.ShooterCloseKeyboard.INSTANCE, null, 2, null));
    }

    public final void shooterLoad(ShooterMemberAvatarsResponse shooterMemberAvatarsResponse, String str, boolean z10) {
        p.h(shooterMemberAvatarsResponse, "memberAvatarsResponse");
        p.h(str, "stageId");
        this.dispatcher.a(UnityActionEvent.InitMiniGame.INSTANCE);
        this.unityCommandDispatcher.dispatch(new UnityCommand.InitMiniGame(EmomoGameName.SHOOTER, null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.ShooterStageId(str), null, 2, null));
        List<ShooterMemberAvatar> viewers = shooterMemberAvatarsResponse.getViewers();
        int i10 = 0;
        if (!(viewers instanceof Collection) || !viewers.isEmpty()) {
            int i11 = 0;
            for (ShooterMemberAvatar shooterMemberAvatar : viewers) {
                if ((shooterMemberAvatar.getUser().getMemberType() != ShooterMemberType.BOT) && (i11 = i11 + 1) < 0) {
                    s.s();
                }
            }
            i10 = i11;
        }
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.ShooterMaxMemberNum(i10), null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.ShooterGameType(shooterMemberAvatarsResponse.getGameType()), null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.ShooterGameStartTimeoutSecs(shooterMemberAvatarsResponse.getGameStartInterval()), null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.ShooterDiarkisTimeoutSecs(shooterMemberAvatarsResponse.getDiarkisClientTimeout()), null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.ShooterLobbyWaitingTimeoutSecs(shooterMemberAvatarsResponse.getLobbyWaitingTimeout()), null, 2, null));
        for (ShooterMemberAvatar shooterMemberAvatar2 : shooterMemberAvatarsResponse.getViewers()) {
            this.unityCommandDispatcher.dispatch(new UnityCommand.SetShooterGameAvatarModel(shooterMemberAvatar2, null, 2, null));
        }
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.ShooterIsHost(z10), null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.UseDebugFunc(n.n()), null, 2, null));
        this.unityCommandDispatcher.dispatch(new UnityCommand.LoadMiniGame(null, 1, null));
    }

    public final void shooterRetireGame(int i10) {
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.ShooterRetireGame(i10), null, 2, null));
    }

    public final void shooterSetDiarkisAuthInfo(DiarkisAuthInfoResponse diarkisAuthInfoResponse) {
        p.h(diarkisAuthInfoResponse, "diarkisAuthInfo");
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.ShooterSetDiarkisAuthInfo(diarkisAuthInfoResponse), null, 2, null));
    }

    public final void shooterSetMemberResult(ShooterUpdateMemberResponse shooterUpdateMemberResponse) {
        p.h(shooterUpdateMemberResponse, "updateMemberResponse");
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.ShooterSetResult(shooterUpdateMemberResponse), null, 2, null));
    }

    public final void shooterSetRatingRewards(List<ShooterReward> list) {
        p.h(list, "ratingClassRewards");
        for (ShooterReward shooterReward : list) {
            this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.ShooterRatingAchieveReward(shooterReward), null, 2, null));
        }
    }

    public final void shooterSetRewards(List<ShooterReward> list) {
        p.h(list, "scoreRewards");
        for (ShooterReward shooterReward : list) {
            this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.ShooterAchieveReward(shooterReward), null, 2, null));
        }
    }

    public final void shooterSetRoomId(String str) {
        p.h(str, "roomId");
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.ShooterSetRoomId(str), null, 2, null));
    }

    public final void shooterSetSeasonNo(int i10) {
        this.unityCommandDispatcher.dispatch(new UnityCommand.SetMiniGameParams(new MiniGameParam.ShooterSeasonNo(i10), null, 2, null));
    }

    public final void shooterSetTeamResult(List<ShooterReward> list, List<ShooterReward> list2, ShooterTeamResultResponse shooterTeamResultResponse, int i10) {
        p.h(list, "scoreRewards");
        p.h(list2, "ratingRewards");
        p.h(shooterTeamResultResponse, "teamResultResponse");
        for (ShooterReward shooterReward : list) {
            this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.ShooterSetAchieveReward(shooterReward), null, 2, null));
        }
        for (ShooterReward shooterReward2 : list2) {
            this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.ShooterSetRatingAchieveReward(shooterReward2), null, 2, null));
        }
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(new MiniGameInput.ShooterSetTeamResult(shooterTeamResultResponse, i10), null, 2, null));
    }

    public final void startMiniGame() {
        this.unityCommandDispatcher.dispatch(new UnityCommand.MiniGameInput(MiniGameInput.Start.INSTANCE, null, 2, null));
    }

    public final void unloadRichUniqueGift() {
        this.unityCommandDispatcher.dispatch(new UnityCommand.UnloadRichUniqueGift(null, 1, null));
    }

    public final void updateAllParts(c cVar, Set<? extends k0> set, int i10) {
        p.h(cVar, "closetAvatar");
        p.h(set, "targetCategories");
        this.unityCommandDispatcher.dispatch(new UnityCommand.UpdateAllParts(cVar.c(set), i10, null, 4, null));
    }
}
